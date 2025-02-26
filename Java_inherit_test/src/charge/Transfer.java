package charge;

public class Transfer extends Creadit {
	
	public Transfer (int m, String date) {
		super(m,date);
		
	}
  
	@Override
	public void processPay() {
		System.out.println("계좌이체결제 금액 :"+ this.money + "원" + "결제일 :" + this.payDate);
	}
}
