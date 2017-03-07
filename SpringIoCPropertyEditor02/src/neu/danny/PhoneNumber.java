package neu.danny;

public class PhoneNumber {
	
	private String areaCode;
	private String prefix;
	private String number;
	
	public PhoneNumber() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PhoneNumber(String areaCode, String prefix, String number) {
		super();
		this.areaCode = areaCode;
		this.prefix = prefix;
		this.number = number;
	}
	public String toString(){
		return "我是PhoneNumber的输出！";
	}
	
	public String getAreaCode() {
		return areaCode;
	}
	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}
	public String getPrefix() {
		return prefix;
	}
	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	
	
}
