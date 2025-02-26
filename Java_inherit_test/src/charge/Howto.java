package charge;

public class Howto{

	public static void main(String[] args) {
		Creadit cr= new Creadit(45000,"2025.02.10"); //Cannot instantiate the type Creadit 오류는 abstract 오류로 객체를 만들수 없음
		cr.processPay();
		
		Cash sh = new Cash ( 45000, "2025.02.10");
		sh.processPay();
		
		CheckCard ch = new CheckCard ( 45000, "2025.02.10");
		ch.processPay();
		
		Transfer tr = new Transfer ( 45000, "2025.02.10");
		tr.processPay();

	}

}
