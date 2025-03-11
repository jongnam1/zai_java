package DAO;

import java.sql.SQLException;
import java.util.ArrayList;

import VO.School;

public class SchoolDAO extends DBconnect{

	public ArrayList<School> searchSelect(String searchWord) {
		
		String sql = "select * from school where school_name like "+ "'%"+ searchWord+ "%'";
		ArrayList<School> list = new ArrayList<School>();
		
		try {
			st = conn.createStatement();
			rs = st.executeQuery(sql);
			while( rs.next( )) {
				School data =new School(
						
		rs.getInt("id"),rs.getString("diff"), rs.getString("school_name"),
		rs.getString("address"), rs.getInt("post_code"),
		rs.getString("tel"), rs.getString("fax"),
		rs.getString("education_office"), rs.getString("public_private"),
		rs.getString("homepage")
						);
				
				list.add(data);	
				
			}
			
		}catch(SQLException e) {
			System.out.println(" 학교 검색 실패 ");
		}
		
		
		return list;
	}

	public void saveData(String id, int schoolNum) {
		
		String sql = "insert into my_school(member_id, school_id)values('"+id + "' ,"+schoolNum + ")";
				
				try {
					st = conn.createStatement();
					st.executeUpdate(sql); // insert,update,delete는 update하는것
					
				}catch(SQLException e) {
					System.out.println( "학교 추가 및 실패");
					e.printStackTrace();
				}
		 
		
		
		
		
		
		
		
		
	}

}
