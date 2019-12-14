package json.pojo;

public class BroughtGoods {
	private String gName="";
	private String gStatus="";
	private double gMoney=0;
	private int gNum=0;
	private double gAllMoney = 0;
	private String gNo ="";
	private String gIntroduce="";
	private String gDetail = "";
	private int gReserve = 0;
	private int exist=1;
	public String getgName() {
		return gName;
	}
	public void setgName(String gName) {
		this.gName = gName;
	}
	public String getgStatus() {
		return gStatus;
	}
	public void setgStatus(String gStatus) {
		this.gStatus = gStatus;
	}
	public double getgMoney() {
		return gMoney;
	}
	public void setgMoney(double gMoney) {
		this.gMoney = gMoney;
	}
	public int getgNum() {
		return gNum;
	}
	public void setgNum(int gNum) {
		this.gNum = gNum;
	}
	public double getgAllMoney() {
		return gAllMoney;
	}
	public void setgAllMoney(double gAllMoney) {
		this.gAllMoney = gAllMoney;
	}
	public String getgNo() {
		return gNo;
	}
	public void setgNo(String gNo) {
		this.gNo = gNo;
	}
	public String getgIntroduce() {
		return gIntroduce;
	}
	public void setgIntroduce(String gIntroduce) {
		this.gIntroduce = gIntroduce;
	}
	public String getgDetail() {
		return gDetail;
	}
	public void setgDetail(String gDetail) {
		this.gDetail = gDetail;
	}
	public int getExist() {
		return exist;
	}
	public void setExist(int exist) {
		this.exist = exist;
	}
	public int getgReserve() {
		return gReserve;
	}
	public void setgReserve(int gReserve) {
		this.gReserve = gReserve;
	}
	@Override
	public String toString() {
		return "BroughtGoods [gName=" + gName + ", gStatus=" + gStatus + ", gMoney=" + gMoney + ", gNum=" + gNum
				+ ", gAllMoney=" + gAllMoney + ", gNo=" + gNo + ", gIntroduce=" + gIntroduce + ", gDetail=" + gDetail
				+ ", gReserve=" + gReserve + ", exist=" + exist + "]";
	}
	
	
	

}
