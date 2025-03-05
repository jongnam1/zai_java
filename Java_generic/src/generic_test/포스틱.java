package generic_test;

public class 포스틱 extends Snack{
	
	public 포스틱(String snackName, int price){
		super(snackName,price);
	}
	
	@Override
	public String toString() {
		return "포스틱 :" + snackName+ ", " + price;
	}
	public void bb() {
		System.out.println("나는 포스틱 이다");
	}
	
}













