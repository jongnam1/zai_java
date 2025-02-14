package study0214a;

import java.util.Scanner;

public class study0214a {

	public static void main(String[] args) {
		Scanner ac = new Scanner(System.in);
		// 문제 1.
		// 학생 5명의 시험 성적을 키보드를 통해 입력 받고
		// 평균 점수를 구하여 출력하세요.
		// 반드시 시험성적은 배열에 저장 !!!
//		int [] score =  new int[5];
		
//		
//		
//		int total =0, avg=0; // 총합과 평변 변수
//		
//		for ( int i=0; i<score.length; i++) {
//			System.out.print( (i+1)+ "번째 학생 성적 입력 :") 
//			score[i] = ac.nextInt();
//			total = total + score[i]; // 총점구하기
//			
//		}
//		
//		avg = total / score.length;
//		System.out.println("평균 :" +avg);
		
		
		
		//문제 2.
	    //알파벳 문자 하나를 입력 하세요.
	    //입력한 알파벳으로 시작하는 단어를 모두 찾아 출력하세요.
	    //그리고 출력한 단어가 총 몇개인지 출력하세요.

         String[] word = new String[] {
		"apple", "banana", "cherry", "date", "elderberry", 
        "fig", "grape", "honeydew", "kiwi", "lemon", 
        "mango", "nectarine", "orange", "papaya", "quince", 
        "raspberry", "strawberry", "tangerine", "ugli", "vanilla", 
        "watermelon", "xigua", "yam", "zucchini", "avocado", 
        "blueberry", "cantaloupe", "dragonfruit", "apricot", "blackberry", 
        "coconut", "dragonfruit", "eggplant", "feijoa", "grapefruit", 
        "huckleberry", "iceplant", "jackfruit", "kiwifruit", "lime", 
        "mangosteen", "nectar", "orange", "peach", "pineapple", 
        "pear", "plum", "pomegranate", "pear", "lime", 
        "apricot", "banana", "papaya", "melon", "peach", 
        "plum", "raspberry", "blueberry", "citrus", "mango", 
        "blackcurrant", "cucumber", "fennel", "grape", "strawberry", 
        "apricot", "blackberry", "currant", "kiwi", "orange", 
        "lemon", "watermelon", "melon", "tangerine", "apple", 
        "date", "elderberry", "fruit", "peach", "fruit", 
        "apple", "cherry", "fig", "honeydew", "jackfruit", 
        "papaya", "blueberry", "plum", "pomegranate", "grape", 
        "avocado", "kiwi", "lemon", "watermelon", "tangerine", 
        "strawberry", "dragonfruit", "lime", "pear", "peach"
};

           System.out.print( "알파벳 입력 :");               
           char alp =ac.nextLine().toLowerCase().charAt(0);
            
           //알파벳을 무조건 소문자로 변환
           int total=0;
           
           for( String str : word ) {
        	   if( str.charAt(0) == alp ) {
        		   System.out.println(str); total++;
        	   }
           }
           System.out.println("총 단어 갯수 :" +total );
	}
	
	
	 
	
	
	
	
	
	
}
