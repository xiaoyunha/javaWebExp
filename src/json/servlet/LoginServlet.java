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

import json.dao.LoginDao;
import json.daoImpl.LoginDaoImpl;
import json.pojo.User;

/** * Servlet implementation class LoginServlet
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
     @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	req.setCharacterEncoding("utf-8");
    	resp.setContentType("text/html;charset=utf-8");
    	resp.setHeader("Access-Control-Allow-Origin", "*");
    	resp.setCharacterEncoding("utf-8");
    	
    	String uId = "";
    	String uPwd = "";
    	if(req.getParameter("uId")!=null)
    		uId = req.getParameter("uId"); 
    	if(req.getParameter("uPwd")!=null)
    		uPwd = req.getParameter("uPwd");
    	//创建session对象
    	HttpSession hs = req.getSession();
    	//设置session存在时间
    	hs.setMaxInactiveInterval(60*25); 
    	LoginDao ld = new LoginDaoImpl();
    	User u = null;
		try {
			u = ld.checkUser(uId,uPwd);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		System.out.println(u.toString());
		//登录成功，设置session对象
		if(!"".equals(u.getuId()))
		{
			hs.setAttribute("user", u);
		}			
    	resp.getWriter().write(new Gson().toJson(u));  		
    } 
}
