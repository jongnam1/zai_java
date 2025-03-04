package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainMt {

	public static void main(String[] args) {
	
		// 예외처리 - 코드실행에 있어서 예외적인 부분을 처리 하기 위한 방법
		// 예외적 상황이 발생하는것은 올바른 실행이 이루어 지지 않아서
		// 오류 또는 에러가 발생한다. 오류는 코드를 잘못작성한것, 에러는 개발자가 해결못할수도 있다. 시스템 관리자가 시스템 환경설정을 잘못할수 있다, 처리가 안됨 
		// 자바에서 예외처리는 오류에 대한 처리이다.
		// 예외처리는 오류를 해결하는 방법이 아닌 회피하는 방법이다.
	    	
		int a=10;
		Scanner sc =new Scanner(System.in);
		
		// try catch가 예외처리 구문, 없으면 프로그램 종료
		try { // 오류가 예상되는 코드를 try{ } 에 작성한다. 
			System.out.print("a 변수 입력 :");
			a= sc.nextInt(); 
			
			System.out.println("나누기전");
		    System.out.println( a/2);
		    System.out.println("나누기 후");
		    
		}catch(ArithmeticException e) { //발생한 문제만 catch가 동작함, 오류가 없으면 catch 실행안됨
			System.out.println( "0으로 나누기 하면 안되");
			
		}catch(Exception i) {
			System.out.println("정수 입력 해야되!");
		}
		// try 구문에서 오류가 발생하면 catch 구문이 실행된다.
		// catch 구문이 실행 되려면 발생한 오류를 처리할수 있는 클래스를
		// 가지고 있어야한다.
		System.out.println("프로그램 종료");
	}

}

 