package Customer;

import Store.Banana;
import Store.Fruit;  //<- 다른패키지에 있으면 import해야됨
import Store.Grape;
import Store.Orange;


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
		//   상속 관계, Implements
		
//		Fruit f = new Banana(2500, 500);
//		f.makeJuice();
//		Fruit g = new Grape(3500, 400);
//		g.makeJuice();
		
		Fruit [] menu = new Fruit [10];
		menu[0] = new Banana(2500, 350);
		menu[1] = new Banana(3000, 400);
		menu[2] = new Orange(3500, 400);
		menu[3] = new Banana(3500, 500);
		menu[4] = new Grape(4500, 350);
		menu[5] = new Banana(4500, 550);
		menu[6] = new Grape(5000, 450);
		menu[7] = new Orange(4000, 350);
		menu[8] = new Orange(5000, 550);
		menu[9] = new Grape(6000, 600);
		
//		menu[2].makeJuice();
//		menu[6].pieceFruit();
		
		Buyer ctm1 = new Buyer(10000); // 구매자
		
		
	
		
		for( Fruit m : menu) {
			System.out.println(m);
			// 출력 결과 -> 바나나 2500원 350ml
		}
		System.out.println(ctm1);
		
		
		
		
		//출력 결과 -> 보유며니 : 10000원
		
//		System.out.println("보유머니 :"+ctm1.getMoney()); //<-출력하는것 get, 저장하는것 set
		
		
		
		
		
		
	}

}
