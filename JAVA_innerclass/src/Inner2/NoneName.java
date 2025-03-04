package Inner2;

public class NoneName {

	Object ob = new Object() { // <- 익명클래스 ,중괄호는 익명클래스를 만들겠다는것
		public int hashcode(int a) {
			   return 10;
		   }
	}; // 익명클래스 정의와 메서드정의를 동시에 하면서 객체생성까지
	
	void myInner() {
		
	}
}
