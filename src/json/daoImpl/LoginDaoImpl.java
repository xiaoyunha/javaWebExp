package json.daoImpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.commons.dbutils.ResultSetHandler;
import org.apache.commons.dbutils.handlers.ArrayHandler;
import org.apache.commons.dbutils.handlers.BeanHandler;

import json.dao.LoginDao;
import json.pojo.User;
import json.tools.DBCP;

public class LoginDaoImpl implements LoginDao {

	@Override
	public User checkUser(String uId, String uPwd) throws SQLException {
		// TODO Auto-generated method stub
		User u = null;
		Connection conn=DBCP.ds.getConnection();
		PreparedStatement ps=null;	
		ResultSet rs=null;
		try {
			String sql="select * from user where uId = ? and uPwd = ?;";
			ps=conn.prepareStatement(sql);
			ps.setString(1, uId);
			ps.setString(2, uPwd);
			rs = ps.executeQuery();
			u = new BeanHandler<User>(User.class).handle(rs);
			if(u == null) {
				return new User();
			}
			if(u.getuAddress()==null) {
//			System.out.println("地址为null");
				u.setuAddress("");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			rs.close();
			ps.close();
			conn.close();
		}
		return u;
	}

}
