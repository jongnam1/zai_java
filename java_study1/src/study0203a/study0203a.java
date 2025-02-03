package study0203a;

public class study0203a {

	public static void main(String[] args) {
		
		//switch 문  조건에 범위가 없는것, 범위를 표현못함
        // if 문     조건에 범위가 있는것
//		if(10<5) {  
//			System.out.println( "aaa");
//		    breake;  <-if문에 break 사용못함
//			System.out.println( "abb");
//			System.out.println( "aaadsadsa");
//		}
		
		
//		switch(3.4) //<-소수점사용불가, case 값이문자면 switch도 문자로 해야된다.데이터의 표현종류가 같아야 함
//		case 3.14:
//			System.out.println("1을 선택");
//		}
//	   
//	    switch(20)  <- 이거는된다 이때 a는 이미코드에정해진 숫자로 표현이된다{
//	    case 'a' :
//	    	System.out.println('1을선택');
//	    case 10:
//	    }
//		
//		switch( 1 ) //<-여기에 들어오는 수에따라 해당케이스 실행  //범위가 아니라 선택이다. 범위에대한 표현이 안됨 
//		{
//		case 1(정수,문자가능):
//			System.out.println("1을 선택");
//			if() {
//				switch ( ) {}
//			}
//			break; //<-해당 제어문을 강제 종료
//		case 3:
//			System.out.println( "3을 선택");
//			break;
//		case 10:
//			System.out.println(" 10을 선택");
//			break;
//종료시점이 중괄호}
		
//		int num = 50;
//		switch( num ) //<-case에 일치하는 것만 실행함  {
//		case 10:
//			System.out.println("10 선택");
//			break;
//		case 30:
//			System.out.println("30 할꺼야??");
//			break;
//		case 20:
//			System.out.println( "case에 표현하는 데이터는 정수,문자, 문자열");
//			break;
//		case 50:
//			System.out.println( "입력된 값에 맞는 case 실행은
//					+ "break 또는 } 까지 실행");
//			break;
//		default: //case에 존재하지 않는값이면 default 실행
//			System.out.println( "case에 없는 값이야!! 다시해!!");
//		}
//		
	  /*
	    if(점수 <=100 && 점수 >= 90 ) { 
	         "A학점"
	    }else if( 점수 >= 80){
	         "B학점"
	    }     
	         
	         
	   */
		int 점수=79;
		switch(점수/10) {	
		case 10:
		case 9:
			System.out.println( "A학점");
			break;
		case 8:
		    System.out.println( "A학점");
		    break;
		case 7:
		    System.out.println( "C학점");
		    break;
		default:
			System.out.println("F 학점");
		
		
		}
	}
}
