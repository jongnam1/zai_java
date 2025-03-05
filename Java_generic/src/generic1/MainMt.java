package generic1;

public class MainMt {

	public static void main(String[] args) {
	

		Drink<String> d = new Drink<String>();
		d.name = "토마스주스";
		d.ml=350;
		d.경림추천("토마토");
		
		
		Integer m; // int 기본타입의 자바 클래스명
		Float f ; //float기본타입의 자바클래스명
		Double db; // double기본타입의 자바클래스명
		Byte bt; // Byte 기본타입의 자바 클래스명
		Short s; //short 기본타입의 자바 클래스명
		Character c; // char 기본타입의 자바 클래스명
		Boolean bl; // boolean 기본타입의 자바 클래스명
		Long lg; // long 기본 타입의 자바 클래스명
		
	}

}


/*
   제네릭 - 속에 특유한, 속명 상표명 - 일반명
        - 클래스 내부에서 사용할 데이터 타입을 외부에서 지정하는 방법
        - 제네릭 타입으로는 무조건 클래스타입,인터페이스 만 가능, 기본데이터타입은 지정불가, String은 클래스타입
 ->  int : Integer 클래스       
        
        
       class A{
          int num;
          float fnum;
          string name;
       }
       class B{
          int num;
          string fnum;
          string name;
       }

*/