package study0203;

import java.util.Scanner;

public class study0203 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//Math.random() 은 0.0000 ~ 부터 0.9999~ 까지이다.
		//곱하기 계산과 더하기 계산으로 범위를 지정할 수 있다.
//		double nym = Math.random(); <- 타입이 맞아서 빨간줄 안생김
//		int num = (int)(Math.random()*10)+1; // 값의 범위는 0.0000....~0.9999... 까지, (int)강제형변환 
		//random 범위가 37~ 121 이라면 r*85+37  r=121-31+1 + 최저시작값
		
//		System.out.println( num );
		
//		int user = 0, coin =0;
//		System.out.print( "1.앞면, 2.뒷면 : ");
//		user = sc.nextInt();
//		
//		coin = (int)(Math.random()*2+1);
//		
//		if(coin == user) {
//			System.out.println( " 정답!! ");
//		}else {
//			System.out.println( "땡!!");
//		}
		
		//컴퓨터가 동전을 15개 가지고 있다.
		//컴퓨터가 제시한 동전갯수가 짝인지 홀인지 맞추는 게임을 만드세요
		// 1.짝  2.홀
		
				
		
		
//		System.out.print( "1.짝, 2.홀 : ");
//		int user = sc.nextInt();
//		
//		int com = (int)(Math.random()*15+1);
//		
//		if ( com%2 == 0 && user ==1 ) {
//			System.out.println( "짝");
//		}else if(com%2 ==1 && user ==2) {
//			System.out.println( "홀!");
//		}
		
		// 주사위게임  ( 육면체 )
		// 컴퓨터가 주사위를 던진다.
		// 주사위값이 3이하라면 작은값 , 주사위값이 4이상이라면 큰값이다.
		// 1. 작다 2.크다
		// 주사위값이 작은값인지 큰값인지 맞추세요.
		
		System.out.print( "3이하, 4이상: " );
		int user = sc.nextInt();
		
		
		int dice = (int)(Math.random()*6+1);
//		
//		if (  user ==1 ) {
//			if (dice <= 3 )
//				System.out.println( "작은값");
//			else 
//				System.out.println("땡!");
//			
//		}else if (dice >= 4 && user == 2) {
//			System.out.println( "크다");
//		}else { 
//			System.out.println(" 잘못입력 했습니다.");
//		} 
		if (  user ==1 || user ==2 ) {
			if (dice <= 3 && user == 1 )
				System.out.println( "작은값");
			else if(dice >=4 && user ==2)
				System.out.println("큰값");
			
		    else 
			System.out.println( "땡");
		}   else { 
			System.out.println(" 잘못입력 했습니다.");
		} 
	}

}
