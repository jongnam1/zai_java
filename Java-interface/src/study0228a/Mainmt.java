package study0228a;

public class Mainmt {

	public static void main(String[] args) {
		  
          CRUD member = new MemberService();
          CRUD board =new BoardService();
          
          member.save();
          
          DBConnect mem = new MemberService();
//        mem.save(); // DBConnect 에는 save가 없어서 오류/ 부모클래스인 DBConnect에는 save메서드가 없다.
	}
	

}
