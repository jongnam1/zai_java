package study0210;

import java.util.Scanner;

public class study0210 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
//		 문제 7. - 알파벳 찾기(반드시 반복문 사용해서)
//		    알파벳 (대문자 또는 소문자 모두 가능하게) 입력
//		    입력한 알파벳이 몇번째 알파벳인지 찾기 - 반드시 for문으로
		    
		    System.out.print("알파벳 입력 : ");
		    char alp = scan.nextLine().charAt(0); // <- 문자입력 가능함
		    // 아스키 코드에서 A - 65(10진수), a - 97(10진수)
		    for( int i = 1; i <=26; i++) { 
		        if( alp ==(i+64) || alp ==(i+96)) {
		        	System.out.printf("알파벳 %c는 %d번째 알파벳\n", alp, i);
		        	break;
		        }
		    }
		    
		    
		    
	}
}
		    
		    
		    
//		 int n1,n2,n3; 
//
//		 do {
//		 n1 = (int)(Math.random()*9+1);
//		 n2 = (int)(Math.random()*9+1);
//		 n3 = (int)(Math.random()*9+1);
//		 } while( !(n1 != n2 && n1 != n3 && n2 !=n3));     
//		 // 3개의 숫자가 중복업이 1~9 중의 하나를 가진다.
//		 
//		 while(true) { // 숫자 맞출때까지 반복해야 계속 입력해야 하니까 무한루프
//		    System.out.print("숫자 세개 : ");
//		    int u1 = scan.nextInt();
//		    int u2 = scan.nextInt();
//		    int u3 = scan.nextInt();
//		    
//		    int str = 0, ball=0; // 스트라이크, 볼 표현, 아웃은 계산으로 
//		    // 스트라이크 경우
//		    if( n1 == u1) str++;
//		    if( n2== u2) str++;
//		    if (n3 ==u3) str++;
//		    
//		    //볼 인 경우
//		    if( n1 == u2 || n1 == u3) ball++;
//		    if(n2 ==u1 || n1 ==u3) ball++;
//		    if(n3==u1 || n3 ==u2) ball++;
//		    
//		    
//		    System.out.printf("%d스트라이크 %d볼 %d아웃\n", str, ball, 3-str-ball);
//			if( str == 3) break; //3개 숫자를 맞췄다면 끝!!
				
			
		
				
						