package generic_test;

public class 예감 extends Snack{

	public 예감(String name, int price) {
		super(name, price);
	}
	
	@Override
	public String toString() {
		return "예감 : " + snackName+ " ,"+price;
	}
	public void bb() {
		System.out.println("나는 예감 이다");
	}
}
