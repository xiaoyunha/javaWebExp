package json.pojo;

public class BroughtCard {
	private String rTime="";
	private String gName="";
	private String gIntroduce="";
	private double gMoney=0;
	private int exist=1;
	private int gNum=0;
	private double gAllMoney = 0;
	public String getrTime() {
		return rTime;
	}
	public void setrTime(String rTime) {
		this.rTime = rTime;
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
	public int getExist() {
		return exist;
	}
	public void setExist(int exist) {
		this.exist = exist;
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
	@Override
	public String toString() {
		return "BroughtCard [rTime=" + rTime + ", gName=" + gName + ", gIntroduce=" + gIntroduce + ", gMoney=" + gMoney
				+ ", exist=" + exist + ", gNum=" + gNum + ", gAllMoney=" + gAllMoney + "]";
	}
	
	
}
