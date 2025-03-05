package generic_test;

public class 매운새우깡 extends Snack{

	public 매운새우깡(String name, int price){
		super(name,price);
	}
	
	@Override
	public String toString() {
		return "매운새우깡: " + snackName+ ", "+price;
	}
	public void bb() {
		System.out.println("나는 매운새우깡 이다");
	}
}











