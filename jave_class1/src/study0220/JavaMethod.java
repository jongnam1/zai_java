package study0220;

import java.util.Scanner;

public class JavaMethod {

	 
	// 메서드에 반환 값( 출력값) 이 없는 경우 void 타입으로 작성한다.
	
	//메서드 정의
	// 반환과 매개변수 없는 메서드 형태
	// 외부데이터도 필요없고 출력하는 값도 없기 때문에
	// 대부분 단순 출력용이 많다.  메뉴같은거
	// 또는 클래스 객체의 메서드인경우에도 반환과 매개변수 없이 정의한다.     
	static void  output() { //들어오는것도 나가는것도 없는 메서드
		System.out.println(" 반환이 없는 ");
		System.out.println( "매개변수도 없는 메서드");
	}
	
	// 반환없고 매개변수 있는 메서드
	// 메서드의 내용을 실행하는데 필요한 데이터를 가지고 있지않다면
	// 메서드 외부에서 데이터를 가져와야 한다.
	static void sum(int num1, int num2) { // 두 정수의 합 구해서 출력까지,
		System.out.println("합 :"+(num1+num2) );
	}
	 
	
	static void sum(int num1, float num2) {  // 메소드이름 sum 은 똑같지만, 매개변수가 다르면 오버로딩
		System.out.println("합 :"+(num1+num2));
	}
	
	// 반환이 있고 매개변수 필요없는 메서드 - int num = scan.nextInt();
	// 매개변수가 필요없기 때문에 자체적으로 필요한 데이터를 생성 할 수 있거나
	// 클래스 객체가 가지고 있는 인스턴스변수의 데이터를 가공(계산같은거) 하여
	// 외부에 내보내기 위한 목적인 경우 
	
	static int /*<- return 뒤에오는 것과 같은 타입으로 똑같이 적어야함 */ total( ) {
		int a=10, b=20, c=30;
		int tot = a+b+c;
		return tot;
	}
		
	// 반환, 매개변수가 있는 메서드    name.equals("박문수");
	
	static String game(int val) { // 1-가위, 2-바위, 3-보
		if(val==1)
		   return "가위";
		if(val==2)
		   return "바위";
		if(val==3)
			return "보";
		return "잘못입력";  // 반환이 있는 메서드에서 if문으로 return 을 했다면
		                  // 참인경우에만 동작할수 있기 때문에 별도의 return이 필요
		// if() 
//		     return 11; 
//		else 
//			 return232;
	}
	
	// 두개 정수중 큰 값 출력하는거 만들기
	// 두 정수 비교하고 출력하는 메서드 필요
	// 반환없고 매개변수 있는 메서드로!!!
	
	static void cmp(int num1, int num2) {
		if(num1>num2)
			System.out.println("큰수 :" +num1);
		else
			System.out.println("큰수:"+ num2);
		
		}
		
	// 국어점수 : 88, 영어점수 : 91, 수학점수 : 74
	// 세과목의 총점과 평균을 출력하세요
	// 총점 계산하는 메서드, 평균 계산하는 메서드
		
		static int total(int k,int e, int m) {
			int tot = k + e + m; //총점 계산
			return tot; // 총점 내보내기
		}
        
		static void avgCalc(int tot) { 
			
			int avg = tot/3;
			System.out.println("평균 :" + avg);
		}
	
	
	   // void <- 아무데이터도 표현하지 않는 타입, 출력할게 없으면 void사용함,클래스 아님, 기본데이터 타입
		public static void main(String[] args) { //main도 메서드임
	
			int kor=88, eng=91, mat=74;
		    int totScore = total(kor,eng,mat);
			avgCalc( totScore); //<-static void avgCalc(int tot) 여기에 저장됨
			System.out.println("총점:"+totScore);
			
//			cmp(11,45);	// 메서드 호출
			
			
//		String res = game(1); //1은 가위 이다.
//		System.out.println(res);
			
//		int num = total();
//		System.out.println(num);
		
		// 출력
           
//		output(); // -> 이렇게 작성해야 output메서드 실행된다.
		 
//		System.out.println("하하하");
//		sum(30, 100);    /* 메서드를 사용하려면 위에 sum(int num1, int num2)이거 보고 작성한다. 모두 입력해야 정상적으로 실행됨*/
//		 sum(40,5);
//		 int a=100, b=232;
//		 sum(a,b);
		 
//		 float c= 3.14f;
//		 sum(a,c);  // 매개변수 타입과 일치하지않아 오류
		
	}

}
