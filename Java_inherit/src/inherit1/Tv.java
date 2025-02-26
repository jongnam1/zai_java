package inherit1;

public class Tv extends Product{ //자식클래스
     
	public Tv() {
//		super(); //부모클래스의 생성자메서드가 반드시 먼저 실행된다.
		System.out.println("자식클래스생성");
		//super는 부모클래스의 객체를 의미한다.
		//super(); //부모클래스의 생성자메서드
		
	}
	public Tv(String brand, int price, String name) {
        super(brand,price,name); // 부모클래스에서 만든것을 자식클래스에서는 1줄로 충분함
//		super.brand = brand; // super로 표현하는게 부모인지,자식인지 구분이 가능함
//		super.price = price; // 부모클래스에서 3개로 만든것을 자식클래스에서는 1줄로 처리
//		this.name = name;
		
	}
	
	// 반드시 부모클래스에 메소드가 존재해야함
    // 오버라이딩 
	// 상속관계인 경우, 인터페이스 implements인 경우에 사용
	// 성립 조건
	// 1. 메서드의 원형은 그대로 유지
	// 2. 내용만 변경한다.
	// 3. 상속또는 implements인 경우에만 가능
	
	
	@Override
	public void power() {
		onOff=!onOff;
		System.out.println("TV 전원 :" +onOff);
	}
    	
    	
    	
    }
