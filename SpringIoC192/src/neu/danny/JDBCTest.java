package neu.danny;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;


public class JDBCTest {
	
	private DataSource dataSource;

	public DataSource getDataSource() {
		return dataSource;
	}

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	
	public void ConnectionTest(){
		try {
			@SuppressWarnings("unused")
			Connection c = this.dataSource.getConnection();
			System.out.println("与数据库连接成功！");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("与数据库连接失败！");
			e.printStackTrace();
		}
	}
}
