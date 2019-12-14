package json.dao;

import java.sql.SQLException;

public interface RegisterDao {

	int register(String uId, String uPwd, String uPost, String uName, double uMoney) throws SQLException;

}
