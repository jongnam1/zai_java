package Study0227;

public class Mainmethod {

	public static void main(String[] args) {
		
		   Tire tire = new Tire();
		   tire.setInch( 18 );
		
           Car car = new Car( tire ); // <- tire클래스 객체
           
           System.out.println( car.getTire().getInch()); // 포함관계라서 2단계
	}

}
/*
   책     페이지    -포함
   책     전자책  - 상속 
   집      방   - 포함
   스마트폰       배터리  - 포함 
   식물          나무   - 상속
   의자       다리   - 포함
   강아지      꼬리  - 포함
   사람       학생   - 상속
   비행기    날개     -포함 
   비행기    전투기   -상속 
   피아노    건반     - 포함
   회사     직원    -포함
    음악앨범    곡   -포함
   영화 다큐멘터리영화   - 상속
   컵   손잡이 - 포함
   자동차경주   포뮬라경기  - 상속
   

*/
// 상속 관계와 포함관계
//   직업   프로그램 개발자

//  필기도구   볼펜 // 둘중 하나면 상속관계 ex) 볼펜은 필기도구다 yes, 필기도구는 볼펜이다 No

// 자전거 체인 // 둘다 아니면  포함관계  ex) 자전거는 체인이다 NO, 체인은 자전거다 NO

// 김미란       최예나     메타7회차반  

// 과일            오렌지 