package json.dao;

import java.sql.SQLException;
import java.util.List;

import json.pojo.BroughtCard;
import json.pojo.BroughtGoods;
import json.pojo.BrowsedCard;
import json.pojo.CustomerInfo;
import json.pojo.Goods;
import json.pojo.ShoppingCar;
import json.pojo.User;

public interface MainDao {

	void changeUserInfo(String uNo, String uPwd, String uPost, String uName, double uMoney, String uAddress)throws SQLException;

	List<Goods> loadGoods()throws SQLException;

	void addShoppingCar(String getuNo, String gNo, int rType)throws SQLException;

	List<ShoppingCar> loadShoppingCar(String uNo)throws SQLException;

	User getUserInfo(String getuNo)throws SQLException;

	void addBrowsedRecord(String getuNo, String gNo)throws SQLException;

	int buyOne(String getuNo, String gNo)throws SQLException;

	void deleteOne(String getuNo, int gNum,String gNo)throws SQLException;

	List<String> buyAll(String getuNo)throws SQLException;

	List<BrowsedCard> loadBrowsed(String getuNo)throws SQLException;

	List<BroughtCard> loadBrought(String getuNo)throws SQLException;

	List<BroughtGoods> loadBroughtGoods()throws SQLException;

	List<CustomerInfo> loadCustomerInfo()throws SQLException;

	void deleteGoods(String gNo)throws SQLException;

	void addNewGoods(Goods g)throws SQLException;


}
