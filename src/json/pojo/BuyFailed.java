package json.pojo;

import java.util.List;

public class BuyFailed {
	private int exist = 1;
	private List<String>failNames;
	public int getExist() {
		return exist;
	}
	public void setExist(int exist) {
		this.exist = exist;
	}
	public List<String> getFailNames() {
		return failNames;
	}
	public void setFailNames(List<String> failNames) {
		this.failNames = failNames;
	}
	@Override
	public String toString() {
		return "BuyFailed [exist=" + exist + ", failNames=" + failNames + "]";
	}
	
}
