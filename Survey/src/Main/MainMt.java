package Main;

import java.util.Scanner;

import Service.MemberService;
import Service.SurveyService;

public class MainMt {

		private static Scanner sc = new Scanner(System.in);
	    private static int menu() {
	    	System.out.println("\n\n======== 설문조사 =========");
	    	System.out.println("1. 설문조사 시작");
	    	System.out.println("2. 설문조사 결과 조회");
	    	System.out.println("3. 종료");
	    	System.out.println("선택 :");
	    	int num = sc.nextInt();
	    	return num;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MemberService memberservice = new MemberService();
		SurveyService surveyservice = new SurveyService();
		
		//메뉴
		while(true) {
			switch(menu()) {
			case 1: //설문조사 시작
				String name = memberservice.signIn();
				if ( name != null) {// 로그인 성공
				     
				     return;
			    }else// 로그인 실패 
					System.out.println("없는 이름입니다.");
				break;
			case 2: //설문조사 결과
			
				break;
			case 3: //종료
				return;
			default:
				System.out.println("잘못 선택 했습니다.");
			}
		}
		
		
	}

}
