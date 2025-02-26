package inherit1;

public class Javainherit1 {

	public static void main(String[] args) {
		
		Tv tv = new Tv("삼성", 950000, "st60");
		Aircon air = new Aircon("캐리어", 542000, "ca18t");
		Computer com = new Computer("삼성", 1730000,"매직스테이션10");
		
		tv.power();
		air.power();
		com.power();
		
		
//		Product p = new Product(); // <- abstract 추상클래스되면,  객체 만들수 없음
		
		
//		Tv tv = new Tv();
//		tv.onoff=true; //전원 on
//		tv.power(); // 전원 on
//		tv.power(); // 전원 off false
//		tv.brand="삼성";
//		tv.price= 12000000;
//		tv.name= "OLED ST60";
//		
//		
//		
//		
//		
//		Computer com = new Computer();
//		com.onOff=true; //전원 on

	}

}



/* 상속 - 클래스들의 관계를 부모 - 자식 관계로 설정한다.
//       부모클래스의 변수 또는 메서드를 자식 클래스에서 사용가능하다.
//         여러 클래스들의 공통요소를 부모클래스로 구성한다.
//      예) TV, 컴퓨터, 냉장고, 에어컨
//        전기(파워), 플러그, 가격, 브랜드, 등등등
//       가전제품 부모클래스에 파워, 가격, 브랜드를 정의한다.

//      다형성 - 다양한 형태
        TV t = new TV();
        computer com = new Computer();
        
        가전제품 tb = new TV();
        가전제품 com = new Computer();
         
         




*/