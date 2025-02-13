package study0211b;

import java.util.Arrays;
import java.util.Scanner;

public class study0211b {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] game = new int [25];
		int[] cyber = new int [25];
		// game배열에 값 채우기
		for(int i = 0; i<game.length; i++) {
			game[i] =(int)(Math.random()*50+1 );
			
		}
		for(int c = 0; c<cyber.length; c++) {
		int com = (int)(Math.random()*50+1);
			cyber[c] = (int)(Math.random()*50+1);
		}
			
//		System.out.println( Arrays.toString(game) );
		
		
	
		// 5줄 5칸 출력
		while(true) {
			
		
		for (int i =0; i<=4; i++) { //빙고판 출력
			for(int k=0; k<=4; k++) {
				if(game[i*5+k]==0 )
					System.out.printf(" %3s ", "■");
				else
				System.out.printf(" %3d ", game[i*5+k]);
			}
			System.out.println();
		}
		for( int a=0; a<=4; a++) {
			for(int b=0; b<=4; b++) {
				if(cyber[a*5+b]==0)
					System.out.printf("%3s", "★");
				else
					System.out.printf("%3d",cyber[a*5+b] );
			}System.out.println();
		}
		System.out.print("컴터 입력: ");
		int cum = scan.nextInt();
		
		for(int q=0; q<cyber.length; q++) {
			if(com[a]== cum) {
				cyber[a]=0;
			}
		}
	
		System.out.print("숫자 입력: ");
		int num = scan.nextInt();
	
		for(int i=0; i<game.length; i++) {
			if(game[i] == num ) {// 내가 입력한 숫자를 배열에서 찾기
				game[i]=0; 
				
			}
			
	   
	   }
	//int[][] a = new int [3][4]; // 2차원배열 [][]2개 
		
		}
		}
}
