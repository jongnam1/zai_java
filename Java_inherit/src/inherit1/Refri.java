package inherit1;

public class Refri extends Product{ // 냉장고

	@Override
	public void power() { // 추상메서드 구현, 부모클래스에서 갖고있는것을 자식에게 물려주므로 추상메서드 구현해야 오류가 발생안함
		onOff =!onOff;
		System.out.println("냉장고 전원 : "+onOff);
	}
}



//부모클래스가 추상메서드를 가지고 있는 추상클래스라면 
// 자식클래스에게 추상메서드를 상속시키기 때문에
// 자식클래스는 추상메서드를 가지고있는 것과 마찬가지가 된다.