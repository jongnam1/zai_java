package study0207;

import java.util.Scanner;

public class study0207 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
       int me = 0, com = 0, num =1;
           
        while(true) { // 언제 31이 나올지 모르니 무한루프로 전체를 반복
              
        	System.out.print("숫자 몇개 :");
        	me = sc.nextInt(); // <- 내가 입력함
        	// 1~3 사이 값 입력했는지 체크 반복문 만들면 좋겠지요
        	System.out.print("나 :");
        	for (int i=1; i<=me; i++) {
        		System.out.print((num++) +" ");
        		if( num == 32) break; //<-for문에 적용되는 break, while문에 종료는 while문에 있어야 함
        	}
        	if(num == 32) {
        		System.out.println("내가 졌다...");
        		break; // while 종료
        	}
        	
        	com = (int)(Math.random()*3+1 ); // 1~3 개 중 하나
        	System.out.print("\n컴퓨터 :");
        	for(int i=1; i<=com; i++) {
        		System.out.println( (num++) + " ");
        		if( num == 32) {
        			System.out.println("컴퓨터 패배!!!");
        			break; // while 종료
        		}
        	}
        }
	}
	}
