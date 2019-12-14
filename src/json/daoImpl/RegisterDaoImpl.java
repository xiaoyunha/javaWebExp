package json.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.UUID;

import org.apache.commons.dbutils.handlers.BeanHandler;

import json.dao.RegisterDao;
import json.pojo.User;
import json.tools.DBCP;

public class RegisterDaoImpl implements RegisterDao {

	@Override
	public int register(String uId, String uPwd, String uPost, String uName, double uMoney) throws SQLException {
		// TODO Auto-generated method stub
		Connection conn=DBCP.ds.getConnection();
		PreparedStatement ps=null;	
		ResultSet rs=null;
		try {
			String sql="select * from user where uId = ?;";
			ps=conn.prepareStatement(sql);
			ps.setString(1, uId);
			rs = ps.executeQuery();
			User u = new BeanHandler<User>(User.class).handle(rs);
			//证明uid已经存在
			if(u!=null) {
				return 0;
			}
			sql = "insert into user values(?,?,?,?,?,?,?);";	
			ps=conn.prepareStatement(sql);
			String uNo = UUID.randomUUID().toString();
			ps.setString(1, uNo);
			ps.setString(2, uId);
			ps.setString(3, uPwd);
			ps.setString(4, uName);
			ps.setString(5, uPost);
			ps.setDouble(6, uMoney);
			ps.setString(7, "");
			ps.executeUpdate();
			conn.close();
			ps.close();
			return 1;
		}catch(Exception e){
			return -1;
		}finally {
			rs.close();
			ps.close();
			conn.close();
		}
		
	}

}
