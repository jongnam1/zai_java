package charge;

public class Cash extends Creadit{

	public Cash (int m, String date) {
		super(m,date);
	}
	@Override
	public void processPay() {
		System.out.println("현금결제 금액 :"+ this.money + "원" + "결제일 :" + this.payDate);
	}
}
