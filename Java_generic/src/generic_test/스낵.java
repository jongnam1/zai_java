package generic_test;

public class 스낵 {

	protected String ssnack;
	protected int pprice;
	
	protected 스낵(String name, int price) {
		this.ssnack = name;
		this.pprice =price;
	}
	
	@Override
	public String toString() {
		return "과자이름 :" + ssnack + ", 가격 :" +pprice;
	}
}
