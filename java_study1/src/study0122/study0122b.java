package study0122;

import java.util.Scanner;

public class study0122b {

	public static void main(String[] args) {
	    // 비교연산자 - 두개 데이터를 비교하여 참, 거짓 결과
		
		System.out.println( 10 > 5 );
        System.out.println( 11 < 4 );
        
        Scanner scan = new Scanner(System.in);
        
//        int num;
//        
//        System.out.print("정수 입력 : ");
//        num = scan.nextInt();
//        
//        System.out.println( "5보다 큰숫자인가 ?" + (num > 5) );
//        boolean big;
//        big = num >= 10;
//        
//        System.out.println( " 10 이상인가? " + big);
//        
//        System.out.println( 10 == 10);  //두 숫자가 같다.
//        System.out.println( 10 == 13);
//        
//        String word="가나다"; // 문자열 타입은 string 클래스타입 / 객체가 아닌것은 상수
//        String word2 = new String("가나다");   // <- 이렇게 하면 "가나다'는 객체
//        
//        //System.out.println( word == word2);
//        System.out.println( word.equals(word2) ); //<-문자열 비교는 equals로 해야됨
//        System.out.println('a' > 'b');
//        // == 비교연산자는 비교하는 2개의 값이 같은 자료형인지 판별
//        
//        System.out.println( 10 != 5 );
//        
//        // 놀이동산에가서 바이킹을 타는데 키가 140 이상 만 탈 수 있다.
//        int tall;
//        System.out.print("키 : ");
//        tall = scan.nextInt();
//        System.out.println( tall >= 140 );
//        
//        // 바이킹 탑승조건 : 키 140이상 190이하
//        // 비교연산자로 만들어진 조건식이 여러개 인경우 논리연산자를 사용
//        System.out.println( tall >=140  &&  tall <= 190 );
        
        // 140 <= tall <=190
        //System.out.println( 140 <= tall <=190 ); // <- 140 <=tall 먼저처리 하고난 값을 tall <=190 이렇게 순서대로 처리함
        // 비교 데이터 타입 불일치
        
        //청소년 버스요금은 1000원이다. (청소년은 13세부터 19세)
        //나이를 입력받아서 청소년이면 false 아니면 true가 출력 되게 하세요
        int age = 0;
        System.out.print( "나이 : ");
        age = scan.nextInt();
        System.out.println( !(age < 13 || age > 19) ); // <- !, 현재를 부정 (나이를 입력받아서 청소년이면 true 아니면 false가 출력 되게 하세요) 
        
        //조건식 - 비교연산자와 논리 연산자를 사용하여 만든식
        //조건식 만드는 연습 하셔야 해요
        //total > count
        
        
        
        
	}

}
