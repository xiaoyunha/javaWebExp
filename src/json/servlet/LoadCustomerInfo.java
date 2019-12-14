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
import json.pojo.BroughtGoods;
import json.pojo.CustomerInfo;
import json.pojo.User;

/**
 * Servlet implementation class LoadCustomerInfo
 */
@WebServlet("/load-customer-info")
public class LoadCustomerInfo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    @Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
    	req.setCharacterEncoding("utf-8");
      	resp.setContentType("text/html;charset=utf-8");
      	resp.setHeader("Access-Control-Allow-Origin", "*");
      	resp.setCharacterEncoding("utf-8");
      	List<CustomerInfo> l = new ArrayList<CustomerInfo>();
      	CustomerInfo g = new CustomerInfo();      	
      	//创建session对象
      	HttpSession hs= req.getSession();
      	if(hs.getAttribute("user")==null) {
      		l.add(g);	
      	}
      	else {
      		MainDao md = new MainDaoImpl();
      		try {
  				l=md.loadCustomerInfo();
  			} catch (SQLException e) {
  				// TODO Auto-generated catch block
  				e.printStackTrace();
  			}
      		if(l.isEmpty()) {
      			l.add(g);
      		}
      	}
//      	System.out.println("客户记录"+new Gson().toJson(l));
      	resp.getWriter().write(new Gson().toJson(l));
	}

}
