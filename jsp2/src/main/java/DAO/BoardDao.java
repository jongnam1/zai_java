package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import DTO.Board;

public class BoardDao {
	
	public void insert( Board board) {
		// values(?      ,...., now() ) //날짜들어가는 칸에 now()
		//쿼리문 작성하고 preparedStatement를 사용하여 저장되게 만들기
		PreparedStatement pt = null;
	
		String sql = "insert into jsp_board(writer, title, content, write_date) "+
		"values(?,?,?,now() )";
		
		try {
			pt= conn.prepareStatement(sql);
			pt.setString(1, board.getWriter());
			pt.setString(2, board.getTitle());
			pt.setString(3, board.getTitle());
			pt.executeUpdate();
			
		}catch(SQLException e) {
			System.out.println("게시글 저장 실패");
			e.printStackTrace();
		}
		
	}
	
	
	private Connection conn;
	private PreparedStatement pt;
	private ResultSet rs;
	
	public BoardDao() {
		connect();
	}
	
	private void connect() {
		try{
			
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String user="dvp";
			String password="1234";
			String url="jdbc:mysql://210.219.170.244:3306/dvp";
			conn = DriverManager.getConnection( url, user,password);
			

		}catch( Exception e){
			System.out.println("드라이버 로드 및 실패");
			e.printStackTrace();
		}
	}

	public ArrayList<Board> select() {
		
		ArrayList<Board> list = new ArrayList<>();
		
		String sql = "select * from jsp_board order by board_id desc";
		try {
			pt = conn.prepareStatement(sql);
			rs = pt.executeQuery();
			while( rs.next() ) {
				Board data = new Board(rs.getInt("board_id"),
						rs.getString("writer"), rs.getString("title"),
						rs.getString("content"), 
						rs.getDate("write_date").toLocalDate());
				list.add( data );
			}
			
		}catch(SQLException e) {
			System.out.println("게시판 전체 조회실패");
			e.printStackTrace();
		}
		return list;
	}
}




