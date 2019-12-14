package json.servlet;

import java.io.IOException;
import java.sql.SQLDataException;
import java.sql.SQLException;

import javax.print.DocFlavor.STRING;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import json.dao.RegisterDao;
import json.daoImpl.RegisterDaoImpl;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
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
    	double uMoney=0;
    	if(req.getParameter("uId")!=null)
    		uId = req.getParameter("uId"); 
    	if(req.getParameter("uPwd")!=null)
    		uPwd = req.getParameter("uPwd");
    	if(req.getParameter("uPost")!=null)
    		uPost = req.getParameter("uPost"); 
    	if(req.getParameter("uName")!=null)
    		uName = req.getParameter("uName");
    	if(req.getParameter("uMoney")!=null)
    		uMoney = Double.parseDouble(req.getParameter("uMoney"));
    	System.out.println(uId+" "+uPwd+" "+uPost+" "+uName+" "+uMoney); 	
    	RegisterDao rd = new RegisterDaoImpl();
    	int success = 0;
    	try {
			 success = rd.register(uId,uPwd,uPost,uName,uMoney);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//    	System.out.println("{\"success\":"+success+"}");
    	resp.getWriter().write("{\"success\":"+success+"}");   	
	}

}
