package login;

public class Car {

	String model;
	
	Car ( ) {
		this.model=model;
	}
	
	void display() {
		System.out.println("자동차 모델: " +model);
	
	}
	public class Main{
	public static void main(String[] args) {
		
		Car myCar = new Car("Tesla");
		myCar.display();
	}

}
