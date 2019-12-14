package json.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.google.gson.Gson;

import json.dao.MainDao;
import json.daoImpl.MainDaoImpl;
import json.pojo.User;

/**
 * Servlet implementation class changeUserInfo
 */
@WebServlet("/change-user-info")
public class changeUserInfo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	req.setCharacterEncoding("utf-8");
    	resp.setContentType("text/html;charset=utf-8");
    	resp.setHeader("Access-Control-Allow-Origin", "*");
    	resp.setCharacterEncoding("utf-8");
    	String uId="";
    	String uPwd="";
    	String uPost="";
    	String uName="";
    	String uAddress="";
    	String uNo="";
    	double uMoney=0;
    	User u = new User();
    	HttpSession hs= req.getSession();
    	if(hs.getAttribute("user")==null) {
    		u.setExist(0);	
    	}
    	else {
    		u=(User) hs.getAttribute("user");
    		if(req.getParameter("uNo")!=null)
        		u.setuNo(req.getParameter("uNo"));
        	if(req.getParameter("uAddress")!=null)
        		u.setuAddress(req.getParameter("uAddress")); 
        	if(req.getParameter("uPwd")!=null)
        		u.setuPwd(req.getParameter("uPwd"));
        	if(req.getParameter("uPost")!=null)
        		u.setuPost(req.getParameter("uPost"));
        	if(req.getParameter("uName")!=null)
        		u.setuName(req.getParameter("uName"));
        	if(req.getParameter("uMoney")!=null)
        		u.setuMoney(Double.parseDouble(req.getParameter("uMoney")));
//        	System.out.println("修改"+u.toString());
        	hs.setAttribute("user", u);
        	MainDao md = new MainDaoImpl();
        	try {
				md.changeUserInfo(u.getuNo(),u.getuPwd(),u.getuPost(),u.getuName(),u.getuMoney(),u.getuAddress());				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    	}
    	resp.getWriter().write(new Gson().toJson(u));   	
    }
}
