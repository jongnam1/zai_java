package study0219;

public class Item {
   //인스턴스 변수
	String itemName; //상품명
	String brand; //브랜드
	int among; //수량
	
	Item(){} // 기본 생성자메서드
	Item(String itemName,int among){
		this.itemName = itemName;
		this.among =among;
	}
	Item(String itemName, String brand, int among){
		this.itemName = itemName;
		this.brand = brand;
		this.among = among;
	}
	

}
