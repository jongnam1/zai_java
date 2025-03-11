package login;

import java.sql.*;

public class userConnect {

	protected Connection coon;
	protected Statement sst;
	
	
	protected userConnect() {
		Connection();
	}
	private void Connection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
		}catch(ClassNotFoundException e) {
			System.out.println("드라이버 로드 및 실패");
			e.printStackTrace();
		}
		String user = "project";
		String password = "1234";
		String url = "jdbc:mysql://localhost:3306/project";
		
		try {
			coon = DriverManager.getConnection(url,user,password);
		}catch(SQLException e) {
			System.out.println( "유저 접속 실패");
			e.printStackTrace();
		}
	}
}
