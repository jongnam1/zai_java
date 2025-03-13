package thread2;

public class MainMt {

	public static void main(String[] args) {
		
//		Customer c1 = new Customer();
//		c1.start();
		
//		Thread c1 = new Thread(new Customer( ) ); // Runnable 이용하려면 Thread 클래스 이용해야 함
//        c1.start();
		
		Cafe cafe = new Cafe(); // 카페 오픈
		
		Thread barista = new Thread(new Barista(cafe) );
		Thread customer = new Thread(new Customer(cafe));
		
		barista.start(); // 바리스타 스레드 시작 - 제조할 준비 완료
		customer.start(); // 손님 스레드 시작 - 주문할 결심
		
		
	}

}

// 카페에서 손님이 주문한다.
// 주문을 하면 바리스타가 제조한다.
// 몇명의 손님이 주문하든지 주문한 순서대로 바리스타들이 제조해야한다.
// 


//  Thread 상속
//  Runnable 

//  JSP - java server page
//  php - personal home page