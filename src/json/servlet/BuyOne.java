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

import json.dao.MainDao;
import json.daoImpl.MainDaoImpl;
import json.pojo.User;
import json.tools.MailUtils;

/**
 * Servlet implementation class BuyOne
 */
@WebServlet("/buy-one")
public class BuyOne extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	req.setCharacterEncoding("utf-8");
	   	resp.setContentType("text/html;charset=utf-8");
	   	resp.setHeader("Access-Control-Allow-Origin", "*");
	   	resp.setCharacterEncoding("utf-8");
	   	int exist = 1;
	   	String gNo = "";
	   	User u = null;
	   	double gMoney =0;
	   	HttpSession hs= req.getSession();
	   	if(hs.getAttribute("user")==null) 
	   		exist = 0;
	   	else {
	   		u = (User) hs.getAttribute("user");
	   		gNo = req.getParameter("gNo");
	   		gMoney = Double.parseDouble(req.getParameter("gMoney"));
	   		if(u.getuMoney()<gMoney) {
	   			exist=2;
	   		}
	   		else {
	   			MainDao md = new MainDaoImpl();
		   		try {
					exist=md.buyOne(u.getuNo(),gNo);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
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
	   	resp.getWriter().write("{\"exist\":"+exist+"}");
    }

}
