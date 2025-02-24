package study0220;

public class JavaMethod2 {

	public static void main(String[] args) {
//		Member user1 = new Member();
//		user1.id = 1001;
//		user1.userId = "sky";
//		user1.password = "1234";
		
		
		//user1.output();
		
		
		Member user3= new Member("golda", "54327",1074);	
		System.out.println(user3);
		user3.output();
		
//		String word = "이렇게 한다";
//		System.out.println( word.toString() );//자바에서는 toString()으로 자동실행되도록 자바에서 제공함
		
	}

}
