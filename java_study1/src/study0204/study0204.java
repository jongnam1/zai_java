package study0204;

import java.util.Scanner;

public class study0204 {

	public static void main(String[] args) {
        Scanner ac = new Scanner(System.in);
		
		System.out.print( "1.가위, 2.바위, 3.보 : " );
		int user = ac.nextInt();
		
		int game = (int)(Math.random()*3+1);
		System.out.println( game );
		
		
		int com =0; int human=0;
		
								
		if(user == game) {
			System.out.println( "무승부입니다");
			
		}else if (user != game && user > game ) {
			System.out.println( "졌습니다.");
			
		}else if( user != game && user < game) {
			System.out.println( "이겼습니다.");
		}
		
	}

	}


