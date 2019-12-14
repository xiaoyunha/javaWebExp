package json.pojo;

public class CustomerInfo {
	private String rTime = "";
	private String uName = "";
	private String uDo = "";
	private int rType = 0;
	private String gName = "";
	private int gNum = 0;
	public String getrTime() {
		return rTime;
	}
	public void setrTime(String rTime) {
		this.rTime = rTime;
	}
	public String getuName() {
		return uName;
	}
	public void setuName(String uName) {
		this.uName = uName;
	}
	public String getuDo() {
		return uDo;
	}
	public void setuDo(String uDo) {
		this.uDo = uDo;
	}
	public int getrType() {
		return rType;
	}
	public void setrType(int rType) {
		this.rType = rType;
	}
	public String getgName() {
		return gName;
	}
	public void setgName(String gName) {
		this.gName = gName;
	}
	public int getgNum() {
		return gNum;
	}
	public void setgNum(int gNum) {
		this.gNum = gNum;
	}
	@Override
	public String toString() {
		return "CustomerInfo [rTime=" + rTime + ", uName=" + uName + ", uDo=" + uDo + ", rType=" + rType + ", gName="
				+ gName + ", gNum=" + gNum + "]";
	}
	
	
}
