package charge;

public class Creadit { // 결제방법
   protected int money;
   protected String payDate;
   
   
   public Creadit () {}
   protected Creadit (int m, String date) {
	   this.money = m;
	   this.payDate = date;
   }
   public void processPay() {} // 추상메서드
}
