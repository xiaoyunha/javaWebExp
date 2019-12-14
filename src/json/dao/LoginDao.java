package json.dao;

import java.sql.SQLException;

import json.pojo.User;

public interface LoginDao {

	User checkUser(String uId, String uPwd)throws SQLException;
}
