package study0123;

public class study0123a {

	public static void main(String[] args) {
		// 비트 논리 연산자
		System.out.println( 27 & 13 ); // and연산 <- and로 계산한것 2진수로 27, 13을 계산하고 2진수끼리 곱한것
//		                                             11011
//		                                             01101
//		                                            =01001 
		System.out.println( 27 | 13 ); // or연산 < - 0과 0이 아닌거는 전부 1로 처리
//		                                              11011
//		                                              01101
//		                                             =11111 
	    System.out.println( 27 ^ 13 ); // xor연산	                                             
//                                                     11011
//                                                     01101
//                                                    =10110 
		
		System.out.println( ~-13 ); //not 연산
//		                              1101 <-의 반대
//		                              0010
//		0.625 * 2= 1.25  정수부분= 1
//		0.25 * 2 = 0.5 정수부분 = 0
//		0.5 *2 = 1.0 정수부분 = 1  따라서 0.625 = 0.101
		
		//비트 쉬프트 연산자 
		System.out.println( 21 << 2); // << 시프트 연산자
		System.out.println( 17 >> 3); // >> 시프트 연산자
		
		
		
		
		
		
		
	}

}
