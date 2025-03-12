package Service;

import java.util.Scanner;

import DAO.MemberDAO;



public class MemberService {
	
	private MemberDAO dao; // MemberDAO는 회원 관련 데이터베이스 작업을 위한 클래스
	public MemberService() {
		this.dao = new MemberDAO(); //DAO객체생성
	}
	public String signIn() {
		Scanner scan = new Scanner(System.in);
		System.out.println("\n---- 회원 조회. ----");
		System.out.print("이름 : ");
		String mName = scan.nextLine();
		//로그인을 위해서 입력한 아이디와 비밀번호를 테이블에 조회한다.
		
		if ( dao.memberName(mName) )
			  return mName; // 로그인 성공했다면 입력한 아이디 리턴
		
		return null; // 로그인 실패시 null 리턴
			
			
		
	}

}
