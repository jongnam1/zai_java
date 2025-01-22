package study0122;

import java.util.Scanner;

public class test0122 {

	public static void main(String[] args) {
	
		int num = 20; // 대입연산자에 의해 오른쪽의 값을 왼쪽에 저장
		num = 20+3+1*10; // +, * 연산 후 대입연산 실행
		int num2 = 10, num3= 55;
		
		num = num2 + 13 / num3 + 123; // <- 오른쪽 값 수행하고나서 저장함
		 //대입 연산자는 다른 연산자들보다 우선순위가 낮다. ( ), [], . ,-> 이순서로 우선순위가 높음
		// 사칙연산자
		System.out.println( num2 + num3); //+
		System.out.println( num3 - num2); //-
		System.out.println(num2 * 4); //*
		System.out.println( num2 + num3 * 2 ); // *연산후 + 연산
	    System.out.println( num3 / num2 ); // /연산은 몫
	    System.out.println( num3 % 4); // %연산은 나머지
	    System.out.println( 10 / 3.0);
	    System.out.println( 10 % 3.0);
	    
	    // 복합 대입 연산자 
	    num = 10;
	    //num = num + 20; // 오른쪽 값먼저 계산하고 나온값을 저장 , + 연산자 먼저하고 대입연산자 실행
	    num +=20;
	    // num2 = num2 * 5;
	    num2 *= 5;
	        
	     
	    // num = num +5 * num3;
	    num += 5 * num3; 
	    
	    Scanner scan = new Scanner(System.in); // 키보드 입력받기위해 생성
        
	    // 원의 둘레 구하기
	    int r=0, dist=0;
	    System.out.print("반지름 :");
	    r = scan.nextInt();
	    
	    dist = (int)(r * 2 * 3.14); //실수데이터를 정수데이터에 저장불가, 데이터타입이 큰쪽에서 작은쪽으로 가려면 강제형변환 필요, 하지만 작은쪽에서 큰쪽으로 가는건 형변환 필요 없음 ex) 실수 -> 정수, 정수->실수
	    
	    System.out.println( " 원의 둘레 : " + dist);
	    
	    
	    
	    
		
		
		
	}

}
