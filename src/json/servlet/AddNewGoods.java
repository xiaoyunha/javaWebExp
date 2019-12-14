package json.servlet;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.SQLException;
import java.util.List;
import java.util.UUID;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import com.google.gson.Gson;

import json.dao.MainDao;
import json.daoImpl.MainDaoImpl;
import json.pojo.Goods;

@WebServlet("/add-new-goods")
public class AddNewGoods extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    @Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	req.setCharacterEncoding("utf-8");
	   	resp.setContentType("text/html;charset=utf-8");
	   	resp.setHeader("Access-Control-Allow-Origin", "*");
	   	resp.setCharacterEncoding("utf-8");
	   	Goods g = new Goods();
	   	DiskFileItemFactory factory = new DiskFileItemFactory();
		//设置文件的缓存目录，如果不存在则新创建一个
		String tempPath=this.getServletContext().getRealPath("tempFolder");
		File f=new File(tempPath);
		if(!f.exists()) {
			f.mkdirs();
		}
			//设置文件缓存路径
		factory.setRepository(f);
			//创建ServletFileUpload对象
		ServletFileUpload fileUpload = new ServletFileUpload(factory);
			//设置字符编码
		fileUpload.setHeaderEncoding("utf-8");
			//解析request，得到上传文件的FileItem对象
		try {
			List<FileItem> fileItems= fileUpload.parseRequest(req);
			
		//2.区分开文件还是普通字段
			//遍历集合
			int num=1;//文件编号
			for(int i=0;i<fileItems.size();i++) {
				if(fileItems.get(i).isFormField()) {//普通字段FileItem
					//获取请求数据uNo tNo content
					String s=fileItems.get(i).getString();
					//这里出现乱码iso-8859-1 与utf-8
					s=new String(s.getBytes("iso8859-1"),"utf-8");
					g= new Gson().fromJson(s, Goods.class);	
					if("".equals(g.getgNo())) {
						g.setExist(0);
						g.setgNo(UUID.randomUUID().toString());
					}
					
				}
			}
			for(int i=0;i<fileItems.size();i++) {
				if(!fileItems.get(i).isFormField()) {//文件FileItem
					//处理获取的上传的文件名后缀
					String afterDot=fileItems.get(i).getName();
					//截取文件名后缀
					afterDot=afterDot.substring(afterDot.lastIndexOf("."));
					//重新命名
					String fileName=g.getgNo()+"_"+num+afterDot;
								//临时命名文件夹，因为缺少dNo，所以以uNo命名
					String webPath=this.getServletContext().getRealPath("img"+File.separator);
					if(num==1) {
						g.setgUrl(".."+File.separator+"img"+File.separator+fileName);
					}
					else {
						g.setgUrl2(".."+File.separator+"img"+File.separator+fileName);
					}
					num++;	
					String filePath=webPath+File.separator+fileName;
					//创建文件
					File file=new File(filePath);
					//若没有这句话表示直接创建filePath文件夹，而不是文件	
					file.getParentFile().mkdirs();
					file.createNewFile();
					//获取上传的文件流
					InputStream in = fileItems.get(i).getInputStream();
					//打开创建好的文件
					FileOutputStream out =new FileOutputStream(file);
					//流对拷
					byte[] buffer= new byte[1024];//每次读取1B
					int len;
					//开始读取
					while((len=in.read(buffer))>0)
						out.write(buffer, 0,len);
					//关闭流
					in.close();
					out.close();
					//删除临时文件
					fileItems.get(i).delete();	
//					System.out.println("上传成功");
					
				}		
			}
//			System.out.println(g.toString());
			MainDao md = new MainDaoImpl();
			md.addNewGoods(g);
			
		} catch (FileUploadException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
