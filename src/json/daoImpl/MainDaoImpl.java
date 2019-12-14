package json.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import javax.mail.MessagingException;

import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import json.dao.MainDao;
import json.pojo.BroughtCard;
import json.pojo.BroughtGoods;
import json.pojo.BrowsedCard;
import json.pojo.CustomerInfo;
import json.pojo.Goods;
import json.pojo.ShoppingCar;
import json.pojo.User;
import json.tools.DBCP;
import json.tools.MailUtils;

public class MainDaoImpl implements MainDao {

	@Override
	public void changeUserInfo(String uNo, String uPwd, String uPost, String uName, double uMoney, String uAddress)
			throws SQLException {
		Connection conn=DBCP.ds.getConnection();
		PreparedStatement ps=null;
		
		try {
			String sql="update user set uPwd =?,uPost=?,uName=?,uMoney=?,uAddress=? where uNo = ?";
			ps=conn.prepareStatement(sql);
			ps.setString(1, uPwd);
			ps.setString(2, uPost);
			ps.setString(3, uName);
			ps.setDouble(4, uMoney);
			ps.setString(5, uAddress);
			ps.setString(6, uNo);
			ps.executeUpdate();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	finally {
			ps.close();
			conn.close();
		}
	
		
	}

	@Override
	public List<Goods> loadGoods() throws SQLException {
		// TODO Auto-generated method stub
		Connection conn=DBCP.ds.getConnection();
		PreparedStatement ps=null;	
		ResultSet rs =null;
		List<Goods> l = null;
		try {
			String sql="select * from goods where gReserve >=0";
			ps=conn.prepareStatement(sql);
			rs = ps.executeQuery();
			l = new BeanListHandler<Goods>(Goods.class).handle(rs);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			rs.close();
			ps.close();
			conn.close();
		}
		
		return l;
	}

	@Override
	public void addShoppingCar(String uNo, String gNo, int rType) throws SQLException {
		// TODO Auto-generated method stub
		Connection conn=DBCP.ds.getConnection();
		PreparedStatement ps=null;	
		String time = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());	
		String rNo = UUID.randomUUID().toString();
		String sql="call addShoppingCar(?,?,?,?)";
		try {
			ps=conn.prepareStatement(sql);
			ps.setString(1, rNo);
			ps.setString(2, uNo);
			ps.setString(3, gNo);
			ps.setString(4, time);
			ps.executeUpdate();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {	
			ps.close();
			conn.close();	
		}
			
	}

	@Override
	public List<ShoppingCar> loadShoppingCar(String uNo) throws SQLException {
		// TODO Auto-generated method stub
		Connection conn=DBCP.ds.getConnection();
		PreparedStatement ps=null;	
		String sql="SELECT  r.rNo rNo, g.*, r.gNum gNum FROM record r LEFT JOIN goods g ON r.gNo = g.gNo WHERE r.uNo = ? AND r.rType = 2 ;";
		ResultSet rs =null;
		List<ShoppingCar> l =null;
		try {
			ps=conn.prepareStatement(sql);
			ps.setString(1, uNo);
			rs = ps.executeQuery();
			l = new BeanListHandler<ShoppingCar>(ShoppingCar.class).handle(rs);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			rs.close();
			ps.close();
			conn.close();
		}
		
		return l;

	}

	@Override
	public User getUserInfo(String uNo) throws SQLException {
		// TODO Auto-generated method stub
		Connection conn=DBCP.ds.getConnection();
		PreparedStatement ps=null;	
		String sql="select * from user where uNo = ?;";
		User u=null;
		try {
			ps=conn.prepareStatement(sql);
			ps.setString(1, uNo);
			ResultSet rs = ps.executeQuery();	
			u = new BeanHandler<User>(User.class).handle(rs);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			ps.close();
			conn.close();
		}
		
		return u;
		
	}

	@Override
	public void addBrowsedRecord(String uNo, String gNo) throws SQLException {
		// TODO Auto-generated method stub
		Connection conn=DBCP.ds.getConnection();
		PreparedStatement ps=null;	
		try {
			String time = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());	
			String rNo = UUID.randomUUID().toString();
			String sql="call addBrowsedRecord(?,?,?,?);";
			ps=conn.prepareStatement(sql);
			ps.setString(1, uNo);
			ps.setString(2, gNo);
			ps.setString(3, time);
			ps.setString(4, rNo);
			ps.executeUpdate();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			ps.close();
			conn.close();
		}
	}

	@Override
	public int buyOne(String uNo, String gNo) throws SQLException {
		// TODO Auto-generated method stub
		int exist = 1;
		Connection conn=DBCP.ds.getConnection();
		PreparedStatement ps=null;	
		String gName = "";
		String uPost="";
		String time = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());	
		String rNo = UUID.randomUUID().toString();
		String sql="call buyOne(?,?,?,?);";
		ResultSet rs=null;
		try {
			ps=conn.prepareStatement(sql);
			ps.setString(1, rNo);
			ps.setString(2, uNo);
			ps.setString(3, gNo);
			ps.setString(4, time);
			rs = ps.executeQuery();		
			while(rs.next())
				exist = rs.getInt("exist");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			rs.close();
			ps.close();
			conn.close();
		}
		return exist;
		
	}

	@Override
	public void deleteOne(String uNo, int gNum,String gNo) throws SQLException {
		// TODO Auto-generated method stub
		Connection conn=DBCP.ds.getConnection();
		PreparedStatement ps=null;	
//		String time = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());	
//		String rNo = UUID.randomUUID().toString();
		try {
			String sql="";
			if(gNum>1) {
				sql="UPDATE record SET `gNum` = `gNum`-1 WHERE gNo = ? and uNo =? and rType = 2; ";
			}	
			else {
				sql="DELETE FROM record WHERE gNo = ? and uNo =? and rType = 2; ";
			}
			ps=conn.prepareStatement(sql);
			ps.setString(1, gNo);
			ps.setString(2, uNo);
			ps.executeUpdate();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			ps.close();
			conn.close();
		}		
	}

	@Override
	public List<String> buyAll(String uNo) throws SQLException {
		// TODO Auto-generated method stub
		List<String> f = new ArrayList<String>();
		List<String> gf = new ArrayList<String>();
		List<String> rf = new ArrayList<String>();
		Connection conn=DBCP.ds.getConnection();
		PreparedStatement ps=null;	
		String sql="";
		ResultSet rs=null;
		sql="select gName, gNo from goods where goods.gNo in(select r.gNo from record r where uNo=? and rType = 2 ); ";
		try {
			ps=conn.prepareStatement(sql);
			ps.setString(1, uNo);
			rs = ps.executeQuery();	
			while(rs.next()) {
				f.add(rs.getString("gName"));
				gf.add(rs.getString("gNo"));
			}		
//		System.out.println("购物车中商品"+ f);
//		System.out.println("购物车中商品gNo"+ gf);
			for(int i = 0;i<gf.size();i++) {
				int exist = buyOne(uNo,gf.get(i));
				if(exist==3||exist ==4) {
					rf.add(f.get(i));		
				}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			rs.close();
			ps.close();
			conn.close();
		}
		return rf;
	}

	@Override
	public List<BrowsedCard> loadBrowsed(String uNo) throws SQLException {
		Connection conn=DBCP.ds.getConnection();
		PreparedStatement ps=null;	
		String sql="SELECT  r.rTime rTime, g.* FROM record r LEFT JOIN goods g ON r.gNo = g.gNo WHERE r.uNo = ? AND r.rType = 1 ;";
		ResultSet rs = null;
		List<BrowsedCard> l = null;
		try {
			ps=conn.prepareStatement(sql);
			ps.setString(1, uNo);
			rs = ps.executeQuery();
			l = new BeanListHandler<BrowsedCard>(BrowsedCard.class).handle(rs);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			rs.close();
			ps.close();
			conn.close();
		}

		
		return l;
	}

	@Override
	public List<BroughtCard> loadBrought(String uNo) throws SQLException {
		Connection conn=DBCP.ds.getConnection();
		PreparedStatement ps=null;	
		String sql= "SELECT r.rTime rTime,g.gName gName,g.gIntroduce gIntroduce,r.gMoney gMoney,r.gNum gNum, r.gMoney*gNum gAllMoney " + 
					"FROM record r LEFT JOIN goods g ON r.gNo = g.gNo " + 
					"WHERE r.uNo = ? AND r.rType = 3 " + 
					"ORDER BY r.rTime DESC;";
		ResultSet rs = null;
		List<BroughtCard> l = null;
		try {
			ps=conn.prepareStatement(sql);
			ps.setString(1, uNo);
			rs = ps.executeQuery();
			l = new BeanListHandler<BroughtCard>(BroughtCard.class).handle(rs);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			rs.close();
			ps.close();
			conn.close();
		}
		return l;
	}

	@Override
	public List<BroughtGoods> loadBroughtGoods() throws SQLException {
		// TODO Auto-generated method stub
		Connection conn=DBCP.ds.getConnection();
		PreparedStatement ps=null;	
		List<BroughtGoods> l = null;
		ResultSet rs=null;
		try {
			String sql="call loadBroughtGoods();";
			ps=conn.prepareStatement(sql);
			rs = ps.executeQuery();
			l = new BeanListHandler<BroughtGoods>(BroughtGoods.class).handle(rs);
			for(BroughtGoods i : l) {
				if(i.getgReserve()==-1)
					i.setgStatus("已下架");
				else if(i.getgReserve()==0)
					i.setgStatus("售罄");
				else if(i.getgReserve()<=100)
					i.setgStatus("库存紧张");
				else if(i.getgReserve()>100)
					i.setgStatus("库存充足");
				i.setgAllMoney(i.getgNum()*i.getgMoney());
			}
			System.out.println(l);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			rs.close();
			ps.close();
			conn.close();
		}
		return l;
	}

	@Override
	public List<CustomerInfo> loadCustomerInfo() throws SQLException {
		// TODO Auto-generated method stub
		Connection conn=DBCP.ds.getConnection();
		PreparedStatement ps=null;	
		List<CustomerInfo> l=null;
		ResultSet rs = null;
		try {
			String sql="call loadCustomerInfo();";
			ps=conn.prepareStatement(sql);
			rs = ps.executeQuery();
			l = new BeanListHandler<CustomerInfo>(CustomerInfo.class).handle(rs);	
			for(CustomerInfo i : l) {
				if(i.getrType()==1)
					i.setuDo("浏览");
				else if(i.getrType()==2)
					i.setuDo("加入购物车");
				else if(i.getrType()==3)
					i.setuDo("购买");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			rs.close();
			ps.close();
			conn.close();
		}

		return l;
	}

	@Override
	public void deleteGoods(String gNo) throws SQLException {
		// TODO Auto-generated method stub
		Connection conn=DBCP.ds.getConnection();
		PreparedStatement ps=null;	
		try {
			String sql=" update goods set gReserve = -1 where gNo = ?;";
			ps=conn.prepareStatement(sql);
			ps.setString(1, gNo);
			ps.executeUpdate();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			ps.close();
			conn.close();
		}				
	}

	@Override
	public void addNewGoods(Goods g) throws SQLException {
		// TODO Auto-generated method stub
		Connection conn=DBCP.ds.getConnection();
		PreparedStatement ps=null;	
		String sql="";
		//新增的
		try {
			if(g.getExist()==0) {
				sql=" insert into goods values(?,?,?,?,?,?,?,?,?);";
				ps=conn.prepareStatement(sql);
				ps.setString(1, g.getgNo());
				ps.setString(2, g.getgName());
				ps.setString(3, g.getgIntroduce());
				ps.setDouble(4, g.getgMoney());
				ps.setInt(5, g.getgReserve());
				ps.setInt(6, 1);
				ps.setString(7, g.getgUrl());
				ps.setString(8, g.getgDetail());
				ps.setString(9, g.getgUrl2());
				ps.executeUpdate();	
			}
			else {
				sql="call changeGoods(?,?,?,?,?,?,?,?)";
				ps=conn.prepareStatement(sql);
				ps.setString(1, g.getgNo());
				ps.setString(2, g.getgName());
				ps.setString(3, g.getgIntroduce());
				ps.setDouble(4, g.getgMoney());
				ps.setInt(5, g.getgReserve());
				ps.setString(6, g.getgDetail());
				ps.setString(7, g.getgUrl());
				ps.setString(8, g.getgUrl2());
				ps.executeUpdate();	
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			ps.close();
			conn.close();
		}			
	}
}
