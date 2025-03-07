package Collection3;

import java.util.ArrayList;
import java.util.Collections;

public class MainMt {
	
	public static void main(String[] args) {
		
		ArrayList<Member> list =new ArrayList<>();
//              
//		 list.add( new Member(1l,"ljn","ljn@naver.com","1234","20030320") );
//		 
//         list.add( new Member(2l, "sj","sh@samil.com","1477","20040720") );
//		  
//         System.out.println( list );
		
		MemberDao dao = new MemberDao();
		
		ArrayList<Member> memberList = dao.select();
		
		for( Member m : memberList) {
			System.out.println( m );
		}
		
		// 이메일로 아이디와 비밀번호를 조회 하기!
		String email = "brown@gmail.com";
		for( Member mem : memberList) {
			if( mem.getEmail().equals(email)) {
				System.out.println( mem.getMemberId());
				System.out.println(mem.getPassword());
				break;
				
			}
			
		}
	   
//	     memberList.contains( 대상 ); // 데이터도 비교하고 타입도 비교하는 것, 다르면 false
//	     타입에 대해서도 비교하기 떄문에 동일한 타입으로 비교할수 있게
//		 email은 String 클래스 타입이라 안된다. 그래서
//		 Member 클래스 객체에 email을 담아서 비교 되게 한다.
//		 Member 대상 = new Member();
//		 대상.setEmail(email);
//		 
//		 for (int i=0; i<memberList.size()-1; i++) {
//			 Member cmp = memberList.get(i);
//			
//			 if(cmp.equals(대상) ) {
//				 System.out.println("찾았다!!");
//			 }
//			 
//		 }
		 
//		 System.out.println(memberList.contains(대상));
		 
		//memberList에 등록된 사람들중에서
		// 장은호 생년월일과 같은 회원 있나???
		Member 장은호 = new Member();
		장은호.setBirth("20010514");
		장은호.setEmail("gold@daum.net");
		장은호.setMemberId("gold");
		
		
		
		System.out.println(memberList.contains(장은호));
		System.out.println(memberList.indexOf(장은호));
		
		
		System.out.println("apple".compareTo("bag"));
		Collections.sort( memberList );
		for(Member m : memberList) {
			System.out.println(m.getId() + " "+m.getMemberId()+ " "+m.getAge()+" "+m.getBirth());
		}
//		System.out.println( memberList );
		
	}

}
