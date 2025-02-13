package study0213;

import java.util.Scanner;

public class study0213 {

	public static void main(String[] args) {
		
		String title = "자바는 즐거워";
		
		Scanner scan = new Scanner(System.in);
		
//		System.out.print("제목 입력: "); //키보드를 통해 문자열 입력
//		title = scan.next(); // .nextLine();
		
		System.out.println(title);
		
		System.out.print("이름 :");
		String name = scan.nextLine(); // nextLine을 통해서 문자를 입력하는데 그전에 다른것(숫자)등이 먼저 입력되어있으면 안됨 
		System.out.print("키 :");
		String tall = scan.next();
		
		System.out.print("나이 :");
		int age = scan.nextInt(); //키보드입력하는 것을 가져옴, nextlnt가 정수로 변환시켜줌
		
		//scan.nextLine();// 엔터를 비워주는 작업 만약 nextInt(); 다음에 nextLine(); 온다면 작업해야됨
		
		System.out.println(age + " "+ name);
		
		//next()는 키보드로 입력하면 버퍼에 쌓인다.
		// next()는 엔터 이전의 버퍼에 쌓여있는 값을 가져온다. 엔터미포함
		// nextLine()은 버퍼에 엔터가 있어야 버퍼의 값을 가져온다. 엔터포함
		
		// 파일불러오기 (읽기) 하면 버퍼의 여향을 받을 수도 있다.
		// next()를 이용해서 문자열 입력 받는 것이 무조건 답은 아니다.
		// 필요에 의해서는 nextLine을 통해 문자열 입력 받도록 해야 한다.
		
		
		
		
		
		
		
		

	}

}
