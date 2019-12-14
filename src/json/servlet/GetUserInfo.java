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
 * Servlet implementation class GetUserInfo
 */
@WebServlet("/get-user-info")
public class GetUserInfo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	req.setCharacterEncoding("utf-8");
    	resp.setContentType("text/html;charset=utf-8");
    	resp.setHeader("Access-Control-Allow-Origin", "*");
    	resp.setCharacterEncoding("utf-8");   	
    	HttpSession hs= req.getSession();
    	User u = new User();
    	if(hs.getAttribute("user")==null) {
    		u.setExist(0);
    	}else {
    		MainDao md = new MainDaoImpl();
    		u = (User) hs.getAttribute("user");
        	try {
				u = md.getUserInfo(u.getuNo());
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    	}
    	resp.getWriter().write(new Gson().toJson(u));
    	
   	
    }

}
