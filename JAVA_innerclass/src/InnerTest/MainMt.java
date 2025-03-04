package InnerTest;

public class MainMt {

	public static void main(String[] args) {
	//  Job 클래스를 이용해 익명클래스 다루기
		// 익명클래스 객체를 통해 직업을 입력하고
		// myJob메서드 실행하여 내 직업을 출력

		
		Job jb= new Job() {
			@Override
			public void myJob() {
				System.out.println(JobName);
			}
			
		}; // 익명클래스 정의와 객체생성
		jb.JobName="웹프로그래머";
		jb.myJob();

		// Work 인터페이스를 이용해 익명클래스 다루기
		// working 메서드를 실행하여
		// 내가 하는일 출력하기
		
		Work w = new Work() { // <-익명클래스 작성, 이름이 없는것 일회용
			@Override
			public void working() {
				System.out.println("게시판 CRUD 구현");
			}
		};
		w.working();
		
		
	}
	

}
