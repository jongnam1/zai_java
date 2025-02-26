package charge;

public class CheckCard extends Creadit {

	public CheckCard (int m, String date) {
		super( m, date);
	}
	
	@Override
	public void processPay() {
		System.out.println("체크카드결제 금액 :"+ this.money + "원" + "결제일 :" + this.payDate);
	}
}
