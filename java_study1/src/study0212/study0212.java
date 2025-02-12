package study0212;

public class study0212 {

	public static void main(String[] args) {
		// 1차원 배열 : 같은 타입의 변수가 연속적으로 이루어진 구조
		// 2차원 배열 : 같은 타입의 1차원배열이 여러개로 이루어진 구조
		
		int q=10;
		int as=20;
		int gf=232;
		
		int[] a= new int[] { 3, 4, 5}; // 1차원배열 -3의 크기
		int[] b= new int[] {1,20,60}; //1차원 배열 - 3의 크기
		int[] c= new int[] {23, 98,54}; //1차원 배열 - 3의 크기
		// A 반 학생의 성적 - > 1차원 배열 
        // 1학년 전체 학생성적 -> 2차원 배열 
		
		
		//int[][] abc = new int[2][3];
		int[][] abc = new int[][] {{1,2},{3,4}}; //1차원배열 많으면 2차원배열 만드는것이 좋음, [2]는 1차원배열 2개 [3]는 3의크기
		//int[][] abc =new int [][] { a,b,c};                                         // 2차원 배열은 묶어줘야 한다 2개가 1묶음으로 1차원배열
		System.out.println( abc[0][0]);
		System.out.println( abc[0] );
		
		
		int [][] arr =new int [3][4]; //크기 3, 4
		arr [0][0] = 10;
		arr [0][1] = 20;
		arr [0][2] = 30;
		arr [1][0] = 50;
		arr [1][3] = 100;
		arr [2][1] = 40;
		
		for (int i =0; i<arr.length; i++) {
			
			for(int k=0; k<arr[i].length; k++) {
				
				System.out.println(arr[i][k]);
			}
		}
		// 1차원배열 - > 향상된 for문  :for(int a: array){ }
		
		for(int i =0; i<arr.length; i++) {
           for(int num: arr[i]) {
        	   System.out.println( num );
           }
		}
		for(int[] tmp : arr) {
			for(int num :tmp) {
			   
				
				
			}
		}
	}

}

// 2차원배열 -> 3차원배열 -> 문자열-> 
//배열 실습문제 풀기(2~3문제 1차원 1~2개, 2차원1개)
// 문제 풀기 할 때 전체 인원중 70%가 안되면 쉬운 문제( 그래도 이정도는 해야지)
// 2문제 해보고 그래도 안되면 다시 1차원 배열 수업
// 만약 잘~아~~되면 클래스 수업