package study0121;

import java.util.Scanner;

public class study0121 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
       // 만 나이 입력		
		int age = 0;
		System.out.print("나이: ");
		age = scan.nextInt();
		
		// 태어난 년도
		int birth = 2025 - age;
		System.out.println("나이: "+ age + "살");
		System.out.println("태어난 년도: "+ birth + "년");
		
		System.out.println( " 한줄에 하나씩 출력 !@#@!$!");
		System.out.print( " 한줄에 이어서 출력 ");
		System.out.print(" 그다음 이어서 출력");
		
		System.out.printf("그냥 print 처럼 사용 가능 ");
		System.out.printf("println 처럼 하려면 \n");
		System.out.printf(" 다음줄에 출력 \n");	
		System.out.printf(" %d ", 100);
		System.out.printf( " %% " );
		// 형식 지정자를 사용하기 위해 주의 할것
		// 1. 형식지정자와 데이터 위치를 맞춰야 한다.
		System.out.printf("%d %f", 100, 3.14);
		
		// 2. 형식 지정자와 데이터 갯수 맞추기
		System.out.printf( " %d %d %d ", 10, 20, 30);
		
		System.out.println(2025+"년" + 1+"월"+21+"일");
		System.out.printf("%d년 %d월 %d일 \n", 2025,1,21);
		
		float fnum = 5.12345f;
		System.out.println("println 출력:" + fnum);
		System.out.printf("printf 출력 %.1f \n", fnum);
		
		int num = 15;
		System.out.println(num);
		System.out.printf("%-4d\n", num);
		
	
	}
}

		


}


/*
    형식 지정자 ( 서식문자 )
    %d, %i - 10진수 정수 %4d <- 정수를 4자리 확보하고 오른쪽에 정렬 / %-4d 4자리를 확보하고 왼쪽에 정렬
    %f - 10진수 실수, 소수점 6자리까지 출력 %f.1f <- 소수점 1자리만 표현
    %c - 문자
    %s - 문자열
    %b - boolean 타입 
    \n - 줄바꿈
    
<<<<<<< HEAD
*/
=======
*/
//>>>>>>> branch 'main' of https://github.com/jongnam1/zai_java.git
