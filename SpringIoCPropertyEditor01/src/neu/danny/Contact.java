package neu.danny;

public class Contact {
	private PhoneNumber phoneNumber;

	public PhoneNumber getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(PhoneNumber phoneNumber) {
		System.out.println("setPhoneNumber");
		this.phoneNumber = phoneNumber;
	}
}
