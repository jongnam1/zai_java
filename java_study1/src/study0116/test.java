package study0116;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub //주석- 설명이나 메모,코드 대기, 등등
		/*
		 *  여러줄 주석 - 주석은 프로그램으로 실행 되지않는 부분이다.
		 *  주석안에 코드 작성해도 실행 안된다. 각코드의 설명을 작성 하는용도
		 *  로 사용 하면 되요
		 *  저장 단축키 - ctrl + s
		 *  주석 단축키 - ctrl + /
		 *  실행 단축키 - ctrl + f11
		 */
       System.out.println("자바 이클립스 테스트");
       
       // 데이터를 사용 하려면 변수를 선언 해야 한다.
       // 변수를 선언 할때는 반드시 데이터 타입을 정해야한다.
       // 변수의 이름은 저장할 데이터에 맞는 의미 있는 이름으로 짓기
       // 정수 : byte, short, int, long
       // 실수 : float, double
       // 문자 : char 글자한자/ 문자열 아님
       // 논리 : boolean (참거짓판단)
       int age; 
       age = 100;   //age 변수에 100 저장(대입연산)
       age = 27;  //덮어쓰여진다/ 100은 못찾는다.
       //age = '가'; //자바에서 ''표현은 문자를 의미
                  //""표현은 문자열을 의미
	   // = 은 같다라는표현이 아니라 대입연산자임
       System.out.println(27);
       System.out.println(27);
       
       byte num1=120;
       System.out.println( num1 );
       
       
       int num2 = 20; // 변수를 선언하면서 데이터 저장 - 변수 초기화
       int num3 = 43; 
       // num3은 43 이다. 라고 하면 안됨 num3과 43이 같다는 표횬이라
       // num3에 43을 저장했다, num3에 43을 대입 했다. 라고 표현
       // 위애서 아래로 순차적으로 실행된다.
       
       int sum = num2+num3;
       System.out.println( sum );
       
       // 사각형의 너비와 높이 값으로 넓이를 구하세요.
//       int width;
//       int height;
//       width = 20;
//       height =32;
//       int area = width * height;
//       System.out.println(area);
       
       int blue = 20;
       int red = 15;
       int white =0;
       //파란컵에 오렌지 주스가 20ml 있다.
       // 빨간컵에 딸기주스가 15ml 있다.
       // 파란컵에 딸기주스를, 빨간컵에 오렌지주스를 담으려면 어떻게 해야하는가?
       //blue 와 red 값 출력
       white = blue;
       blue=red;
       red=white;
       
       System.out.println( blue );
       System.out.println( red );
       
       int birthYear = 1991;
       // 김철수가 태어난 년도를 birth_year에 저장했다.
       // 나이는?
       
       int thisYear=2025;
       System.out.println(thisYear-birthYear);
      
       // 변수란 데이터(값)을 저장할 수 있는 메모리 공간
       // 변수의 공강에는 데이터 타입에 맞는 데이터만 저장할수 있게 해줘야 한다
       // 변수의 선언은 데이터 타입 변수명 ( 예 - int num; )
       // 변수이름은 카멜 표기법이 일반적이다
       // 변수이름은 변수의 사용목적에 맞는 이름으로 한다.(길어도 됨)
       
       float fnum = 2.156f;
       System.out.println( fnum );
       fnum = 2.123456789f;
       System.out.println(fnum);
       double dnum = 1.1234567890123456789; 
       System.out.println(dnum);
	   
       char ch='a';
       System.out.println(ch);
       ch = '가';
       System.out.println(ch);
       ch = 97;
       System.out.println( ch );
       ch = 'H';
       System.out.println(ch - 'A');
       System.out.println( '가' - 64);
       
       
       String name="홍길동"; // 문자열은 String 클래스타입 사용
       
       boolean isApple = true; //참 , 거짓 값을 가지는 타입
       
       System.out.println( isApple);
       
       
       
       
       
       
       
       
       
	}
	

}
