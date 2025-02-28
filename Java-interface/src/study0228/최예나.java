package study0228;

public class 최예나 implements Active{ // 다중상속하려면 여러개의 인터페이스를 사용함

	@Override
	public void moving() {
		System.out.println("예나가 360도 회전하며 옆으로 간다.");
		
	}

	@Override
	public void target() {
		System.out.println("예나는 경림이를 노려보았다.");
		
	}

}
