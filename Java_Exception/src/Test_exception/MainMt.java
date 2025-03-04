package Test_exception;

public class MainMt {

	public static void main(String[] args) {
		
		int [] arr = {10,40,50,20};
		
		try {
			
		System.out.println(arr[5]);
		
		}catch(Exception e) {
			System.out.println("인덱스 범위 벗어남");
			e.printStackTrace(); // <- 오류 출력하는것
		}
		
		    String str = "123ab";	
		    int num = 0;
			try {
				num = Integer.parseInt(str); //integer.parseInt는 문자열-> 정수변환			
				
			}catch(Exception x) {
				System.out.println("정수로 변환 불가 - 정수만 입력");
				x.printStackTrace();
			}
			
			System.out.println("정수 :" + num);
     		
			String word = "good Bye!!";
			
		try {
			System.out.println(word.substring(word.indexOf("B")));
			
		}catch(Exception c) {
			
		}
		
		try {
			System.out.println(word.substring(word.indexOf("m")));
			
		}catch(Exception t) {
			
		}
		
		
		
		
	}

}
