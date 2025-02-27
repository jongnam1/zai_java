package Customer;

import java.sql.*;  //<- *은 All을 의미함, 하위 모두 포함함
import java.util.Scanner;
import java.util.Date;

import Store.*;  //<- 다른패키지에 있으면 import해야됨


public class MainMethod{

	public static void main(String[] args) {
       // 바나나와 포도, 오렌지 갯수가 많이 필요하다면???
	   // 바나나 - 15개, 포도 - 6개, 오렌지 - 54개
	   // 망고, 수박, 토마토 등등등
//		Banana[] ba = new Banana[15];
		
//      ba[0].makeJuice();  아직 banana객체없기에 null이기에 오류		
		
//		ba[0] = new Banana(2500,500);
//		ba[1] = new Banana(2500,500);
//		ba[2] = new Banana(2500,500);
//		ba[3] = new Banana(2500,500);
//		
//		ba[0].makeJuice();
		
		
		// 다형성 - 하나의 타입으로 여러 타입을 다룰수 있다. <- 객체지향의 꽃이라고도 함
		// 상속 관계, Implements
		
		
		
		
//		Fruit f = new Banana(2500, 500);
//		f.makeJuice();
//		Fruit g = new Grape(3500, 400);
//		g.makeJuice();
		
		Fruit [] menu = new Fruit [10];
        
		
//		menu[2].makeJuice();
//		menu[6].pieceFruit();
		
		
		
		//출력 결과 -> 보유며니 : 10000원
		
//		System.out.println("보유머니 :"+ctm1.getMoney()); //<-출력하는것 get, 저장하는것 set
		
		
/*
    자바프로그램에서 데이터베이스 사용하기
    1. 데이터베이스와 연결하기 위한 드라이버 로드
    2. 계정 로그인
    3. 쿼리문 작성하여 주고 받고 하기
    
     //데이터베이스 연결하기 (드라이버 로드)  <mysql사이트에서 MySQL Connector/J (Archived Versions) 다운
     //com.mysql.cj.jdbc.Driver
    // 쿼리문 작성하여 보내고 받기
    // select * from store_menu1;  
    // 데이터베이스에서 조회한 데이터들을 바나나, 포도,오렌지 객체로 저장될수 있게 하기


 */
	
		  
		  
	  String sql = "select * from store_menu1"; // 조회 쿼리문
	  // 작성한 쿼리문을 데이터베이스에 보내려면 
	  // Statement , PreparedStatement <-보완적으로 preparedStatement 쓰는게 좋다 (병렬)
	  
	  Statement st = null;  // 쿼리문 보낼때 필요
	  ResultSet rs = null;  // 조회결과 받을때 필요
	  
	  
	    
		
	  try {
		Class.forName("com.mysql.cj.jdbc.Driver"); // 예외적으로 자바에서는 없는파일일수도 있어서 빨간줄 나타남
	} catch (ClassNotFoundException e) {           // try catch 하면됨
		System.out.println("드라이버 로드 실패");
		e.printStackTrace();
	}	
	  // 계정 로그인 - 주소, DB명, 계정명, 비밀번호
	  String user = "project";
	  String password = "1234";
	  String url = "jdbc:mysql://localhost:3306/project";
	  
	  // 데이터베이스와 연결한 객체를 저장 해둬야 한다.
	  Connection conn = null; // 인터페이스는 객체만들기가 완됨, 데이터베이스 연결 객체 저장할곳
	  
	  try {
	 	conn = DriverManager.getConnection(url, user, password);
	} catch (SQLException e) {
	 	System.out.println("접속 실패");
	 	e.printStackTrace();
	}
	 
	  
	  try {
		  
		st = conn.createStatement(); // 쿼리문 전송하기위한 준비
		rs = st.executeQuery(sql); // 쿼리문 보내고 결과 받기
	
		// rs.next() 를 통해서 조회된 결과값이 존재하는지 확인
		  for(int i=0; rs.next(); i++) {
			  
			  int cost = rs.getInt("cost");  //금액
			  int cap = rs.getInt("capacity"); // 용량
			  String type = rs.getString("fruit_type"); // 과일종류
			
			  if( type.equals("Banana"))
				  menu[i] = new Banana(cost,cap);
			  if( type.equals("Orange"))
				  menu[i] = new Orange(cost,cap);
			  if( type.equals("Grape"))
				  menu[i] = new Grape(cost,cap);
		  }

		
	} catch (SQLException e) {
		System.out.println("쿼리문 조회 실패");
		
		e.printStackTrace();
	}
	    
	  Buyer ctm1 = new Buyer(10000); // 구매자
		
		for( int i =0; i<menu.length; i++) {
			System.out.println( (i+1)+". "+menu[i]);
			// 출력 결과 -> 바나나 2500원 350ml
		}
		// 어떤 주스를 사먹을꺼냐!!
		Scanner sc = new Scanner(System.in);
		System.out.print("구매 번호 :");
		int num = sc.nextInt();
		
		// 결제 진행하고 언제 주스를 사먹었는지 어떤 주스인지 기록
		ctm1.setMoney( ctm1.getMoney() - menu[num-1].getCost() );
		// 내가 만약 5번을 선택했다면 num-1은 4니까
		// menu배열의 4번 인덱스의 객체를 선택한것이고
		// 해당객체의 getCost니까 cost 변수의 값 가지고 온다.
		// ctm1.getMoney는 get으로 시작하는 메서드 변수의값 출력이니까
		// 10000을 가지고온다.
		// 그러니까 10000 -3500 된다. 이것의 결과 6500을 setMoney를 통해
		// money변수에 저장하게 되니 money변수는 6500을 가진다.
		
		// import java.util.Date 
		ctm1.setBuyDate(new Date()); // 내가 구매한 날짜
		ctm1.setItem(menu[num-1]); // 내가 선택한 음료
		
		System.out.println(ctm1);
		

	}

}
