package json.servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.google.gson.Gson;

import json.dao.MainDao;
import json.daoImpl.MainDaoImpl;
import json.pojo.BrowsedCard;
import json.pojo.ShoppingCar;
import json.pojo.User;

/**
 * Servlet implementation class LoadBrowsed
 */
@WebServlet("/load-browsed")
public class LoadBrowsed extends HttpServlet {
	private static final long serialVersionUID = 1L;
    @Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	req.setCharacterEncoding("utf-8");
    	resp.setContentType("text/html;charset=utf-8");
    	resp.setHeader("Access-Control-Allow-Origin", "*");
    	resp.setCharacterEncoding("utf-8");
    	List<BrowsedCard> l = new ArrayList<BrowsedCard>();
    	BrowsedCard g = new BrowsedCard();
    	
    	//创建session对象
    	HttpSession hs= req.getSession();
    	if(hs.getAttribute("user")==null) {
    		g.setExist(0);
    		l.add(g);	
    	}
    	else {
    		User u = (User) hs.getAttribute("user");
    		MainDao md = new MainDaoImpl();
    		try {
				l=md.loadBrowsed(u.getuNo());
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    		if(l.isEmpty()) {
    			l.add(g);
    		}
    	}
//    	System.out.println("购物车"+new Gson().toJson(l));
    	resp.getWriter().write(new Gson().toJson(l));
	} 
    

}
