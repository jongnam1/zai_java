package modifier;

public class User {

	public void view() {
		Microwave m = new Microwave(); // 같은패키지에서 객체만든는거 괜찬음
		
		System.out.println( m.brand); //protected String brand 여기서 public으로 바꾸면 사용가능
		
	}
	
}
