package json.tools;

import javax.sql.DataSource;

import org.apache.tomcat.dbcp.dbcp2.BasicDataSource;

public class DBCP {
	public static DataSource ds = null;
	static {
		//获取DBCP数据源实现类对象
		BasicDataSource bds = new BasicDataSource() ;
		//设置连接数据库需要的配置信息
		bds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		bds.setUrl("jdbc:mysql://localhost:3306/javawebexp?serverTimezone=UTC");
		bds.setUsername("root");
		bds.setPassword("root");
		// 设置连接池的参数
		bds.setInitialSize(10);
		bds.setMaxTotal(100);      // 最大连接数量，maxActive=50
		bds.setMaxIdle(50);
		bds.setMinIdle(5);
		bds.setMaxWaitMillis(60000);  // maxWait=60000
		bds.setDefaultAutoCommit(true);
		ds = bds;
	}
}
