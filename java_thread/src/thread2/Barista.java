package thread2;

import java.util.Random;

public class Barista implements Runnable{
	private final Cafe cafe; //변경되지 않기위해 final붙임
                             //바리스타가 일하는 카페
	
	
	public Barista(Cafe cafe) { // 생성자 블록, 바리스타가 일하는 카페를 넣어줘야 주문을 받지!!
		this.cafe = cafe;       
		
	}
	
	@Override
	public void run() {
		try {
			
		
	      while(true) {
	    	  Order order = cafe.give();
	    	  System.out.println("바리스타 제조 :" +order.getOrderId()+ " - "+order.getMenu() );
	    	  
	    	  Thread.sleep(3000); // 그냥 주문 시간 설정만한거 nullpointer와 상관없음
	    	  System.out.println("바리스타 제조완료 :" +order.getMenu());
	      }
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
