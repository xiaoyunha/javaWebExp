package json.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.mail.MessagingException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.google.gson.Gson;

import json.dao.MainDao;
import json.daoImpl.MainDaoImpl;
import json.pojo.BuyFailed;
import json.pojo.User;
import json.tools.MailUtils;

/**
 * Servlet implementation class BuyAll
 */
@WebServlet("/buy-all")
public class BuyAll extends HttpServlet {
	private static final long serialVersionUID = 1L;
    @Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	req.setCharacterEncoding("utf-8");
	   	resp.setContentType("text/html;charset=utf-8");
	   	resp.setHeader("Access-Control-Allow-Origin", "*");
	   	resp.setCharacterEncoding("utf-8");
	   	int exist = 1;
	   	BuyFailed bf = new BuyFailed();
	   	User u=null;
	   	HttpSession hs= req.getSession();
	   	if(hs.getAttribute("user")==null) 
	   		exist = 0;
	   	else {
	   		u = (User) hs.getAttribute("user");
   			MainDao md = new MainDaoImpl();
	   		try {
				bf.setFailNames(md.buyAll(u.getuNo()));
				
				if(bf.getFailNames().size()>0) {
					exist=3;
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	   		
	   	}
	   	if(exist==1) {
	   		try {
				String message = "您购买的商品已经发货啦~请您注意查收~";
				MailUtils.sendMail(u.getuPost(),message);
			} catch (MessagingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	   	}
	   	bf.setExist(exist);
	   	resp.getWriter().write(new Gson().toJson(bf));
    }

}
