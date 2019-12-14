package json.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import json.dao.MainDao;
import json.daoImpl.MainDaoImpl;
import json.pojo.User;

/**
 * Servlet implementation class DeleteOne
 */
@WebServlet("/delete-one")
public class DeleteOne extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    @Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	req.setCharacterEncoding("utf-8");
	   	resp.setContentType("text/html;charset=utf-8");
	   	resp.setHeader("Access-Control-Allow-Origin", "*");
	   	resp.setCharacterEncoding("utf-8");
	   	int exist = 1;
	   	String gNo = "";
	   	int gNum= 0;
	   	HttpSession hs= req.getSession();
	   	if(hs.getAttribute("user")==null) 
	   		exist = 0;
	   	else {
	   		User u = (User) hs.getAttribute("user");
	   		gNo = req.getParameter("gNo");
	   		gNum = Integer.parseInt(req.getParameter("gNum"));
   			MainDao md = new MainDaoImpl();
	   		try {
				md.deleteOne(u.getuNo(),gNum,gNo);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	   		
	   	}
	   	resp.getWriter().write("{\"exist\":"+exist+"}");
	}
}
