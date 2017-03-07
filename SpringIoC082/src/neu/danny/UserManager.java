package neu.danny;

//public final class UserManager {//类不能是final，因为CGLIB会动态创建一个本类的子类来使用；final类不能被继承
//public abstract class UserManager {//允许是abstract类
public class UserManager {
	private UserDao userDao;
		
//	public abstract UserDao getUserDao() ;//允许是abstract方法
//	public final UserDao getUserDao() {//注意，如果有final关键字，则在LookupMethodTest中获得的dao是同一个对象	
	public UserDao getUserDao(){
		System.out.println("------in getUserDao");	//如果采用lookup方式，本行不会输出
		return this.userDao;
	}

	//不会重写本方法
	public UserDao getUserDao2(){
		System.out.println("------in getUserDao2");
		return this.userDao;
	}
	
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	public void createUser() {
		userDao.create();
	}

}
