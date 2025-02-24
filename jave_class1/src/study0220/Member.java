package study0220;

public class Member {
   String userId; // 아이디
   String password; //비밀번호
   long id; //회원번호
   
   Member(){}
   Member(String userId, String password, long id){
	   this.userId=userId;
	   this.password=password;
	   this.id=id;
   }
   
//   public String toString() { //<-무조건 이형태로 만들어야 실행됨, return 뒤는 상관없음
//	   return "아이디 :"+this.userId+
//			   "비밀번호 :"+this.password+ 
//			   "회원번호 :"+this.id;
	   
//   }
   
   void output() { //객체자신은 this
	   System.out.println("아이디 :"+this.userId+" 비밀번호 :"+ this.password+ "회원번호 :"+this.id);
   }
   
   
   
}




