package neu.danny;

public class DependBean {
	private HelloBean helloBean;

	public HelloBean getHelloBean() {
		return helloBean;
	}

	public void setHelloBean(HelloBean helloBean) {
		System.out.println("---in DependBean----setHelloBean");
		this.helloBean = helloBean;
	}
}
