package Collection3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.mysql.cj.protocol.Resultset;

public class DBConnect {

	public Connection conn;
	public Statement st;
	public ResultSet rs;
	
	public DBConnect() {
		connection();
	}
	
	private void connection() {
		try {
			//드라이버 로드
			Class.forName("com.mysql.cj.jdbc.Driver");
			//계정 로그인
			String user = "project";
			String password = "1234";
			String url = "jdbc:mysql://localhost:3306/project";
			conn = DriverManager.getConnection(url,user,password);
		}catch( Exception e) {
			System.out.println(" 드라이버 로드 및 접속실패");
		}
		
		
	    } {
	    
	    }
		
}
