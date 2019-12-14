package json.pojo;

public class User {
	private String uNo = "";
	private String uId = "";
	private String uPwd = "";
	private String uName = "";
	private String uPost = "";
	private double uMoney = 0;
	private String uAddress = "";
	private int exist = 1;
	public String getuNo() {
		return uNo;
	}
	public void setuNo(String uNo) {
		this.uNo = uNo;
	}
	public String getuId() {
		return uId;
	}
	public void setuId(String uId) {
		this.uId = uId;
	}
	public String getuPwd() {
		return uPwd;
	}
	public void setuPwd(String uPwd) {
		this.uPwd = uPwd;
	}
	public String getuName() {
		return uName;
	}
	public void setuName(String uName) {
		this.uName = uName;
	}
	public String getuPost() {
		return uPost;
	}
	public void setuPost(String uPost) {
		this.uPost = uPost;
	}
	public double getuMoney() {
		return uMoney;
	}
	public void setuMoney(double uMoney) {
		this.uMoney = uMoney;
	}
	public String getuAddress() {
		return uAddress;
	}
	public void setuAddress(String uAddress) {
		this.uAddress = uAddress;
	}
	public int getExist() {
		return exist;
	}
	public void setExist(int exist) {
		this.exist = exist;
	}
	@Override
	public String toString() {
		return "User [uNo=" + uNo + ", uId=" + uId + ", uPwd=" + uPwd + ", uName=" + uName + ", uPost=" + uPost
				+ ", uMoney=" + uMoney + ", uAddress=" + uAddress + ", exist=" + exist + "]";
	}
	
	
}
