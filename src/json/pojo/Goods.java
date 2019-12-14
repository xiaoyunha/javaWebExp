package json.pojo;

public class Goods {
	private String gNo="";
	private String gName="";
	private String gIntroduce="";
	private double gMoney=0;
	private int gReserve=0;
	private int gType=0;
	private String gUrl="";
	private int exist=1;
	private String gDetail="";
	private String gUrl2="";
	public String getgNo() {
		return gNo;
	}
	public void setgNo(String gNo) {
		this.gNo = gNo;
	}
	public String getgName() {
		return gName;
	}
	public void setgName(String gName) {
		this.gName = gName;
	}
	public String getgIntroduce() {
		return gIntroduce;
	}
	public void setgIntroduce(String gIntroduce) {
		this.gIntroduce = gIntroduce;
	}
	public double getgMoney() {
		return gMoney;
	}
	public void setgMoney(double gMoney) {
		this.gMoney = gMoney;
	}
	public int getgReserve() {
		return gReserve;
	}
	public void setgReserve(int gReserve) {
		this.gReserve = gReserve;
	}
	public int getgType() {
		return gType;
	}
	public void setgType(int gType) {
		this.gType = gType;
	}
	public String getgUrl() {
		return gUrl;
	}
	public void setgUrl(String gUrl) {
		this.gUrl = gUrl;
	}
	public int getExist() {
		return exist;
	}
	public void setExist(int exist) {
		this.exist = exist;
	}
	public String getgDetail() {
		return gDetail;
	}
	public void setgDetail(String gDetail) {
		this.gDetail = gDetail;
	}
	public String getgUrl2() {
		return gUrl2;
	}
	public void setgUrl2(String gUrl2) {
		this.gUrl2 = gUrl2;
	}
	@Override
	public String toString() {
		return "Goods [gNo=" + gNo + ", gName=" + gName + ", gIntroduce=" + gIntroduce + ", gMoney=" + gMoney
				+ ", gReserve=" + gReserve + ", gType=" + gType + ", gUrl=" + gUrl + ", exist=" + exist + ", gDetail="
				+ gDetail + ", gUrl2=" + gUrl2 + "]";
	}
	
	
	
	
	
	
	

}
