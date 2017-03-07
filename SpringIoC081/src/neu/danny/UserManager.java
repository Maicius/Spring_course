package neu.danny;

public class UserManager {
	
	private UserDao userDao;
	
    public UserDao getUserDao(){
    	return this.userDao;
    }

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	
    public void createUser() {
    	userDao.create();
    }
}
