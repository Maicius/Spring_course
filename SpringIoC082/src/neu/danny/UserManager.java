package neu.danny;

//public final class UserManager {//�಻����final����ΪCGLIB�ᶯ̬����һ�������������ʹ�ã�final�಻�ܱ��̳�
//public abstract class UserManager {//������abstract��
public class UserManager {
	private UserDao userDao;
		
//	public abstract UserDao getUserDao() ;//������abstract����
//	public final UserDao getUserDao() {//ע�⣬�����final�ؼ��֣�����LookupMethodTest�л�õ�dao��ͬһ������	
	public UserDao getUserDao(){
		System.out.println("------in getUserDao");	//�������lookup��ʽ�����в������
		return this.userDao;
	}

	//������д������
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
