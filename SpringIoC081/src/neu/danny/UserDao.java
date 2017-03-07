package neu.danny;

public class UserDao {
	private String name="";
	
	public UserDao(String name){
		this.name=name;
	}
	public void create(){
		System.out.println("create user from - "+name);
	}
}
