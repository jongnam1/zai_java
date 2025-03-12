package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBconnect {
	
	protected Connection conn;
	protected Statement st;
	protected ResultSet rs;
	
	protected DBconnect() {
		connection();
	}
	
	private void connection() {
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
			conn = DriverManager.getConnection(url,user,password);
		} catch (SQLException e) {
			System.out.println( "계정 접속 실패 ");
			e.printStackTrace();
		}
	}


}
