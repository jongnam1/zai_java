package generic_test;

public class Snack {

	protected String snackName;// 과자이름
	protected int price; //가격
	
	protected Snack(String name, int price) {
		this.snackName=name;
		this.price=price;
	}
	@Override
	public String toString() {
		return "과자이름 : " + snackName+ " ,가격 :"+price;
	}
}
