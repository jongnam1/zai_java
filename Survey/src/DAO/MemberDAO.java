package DAO;

import java.sql.SQLException;

public class MemberDAO extends DBconnect {
	
	public boolean memberName(String name) {
	    //입력한 아이디와 비밀번호로 테이블 조회 하기
		String sql = "select * from member where member_id= '"+name+ "'";
		
		try {
			
		st = conn.createStatement(); // 쿼리문 보낼수 있게 statement생성
		rs = st.executeQuery(sql); // statement로 쿼리 보내고 결과 받기
		if( rs.next( )) { // 조회 결과가 있다면 next는 true, 없다면 false
			return true; // 로그인성공 했으니까 true 반환

		
		}
		}catch(SQLException e) {
			System.out.println("회원 조회 실패");
			e.printStackTrace();
		}
		
		return false; // 로그인실패(아이디 또는 비번잘못) false 반환
	} 



}
