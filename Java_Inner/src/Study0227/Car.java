package Study0227;

public class Car {
     private Tire tire; //<-private이니까 get,set 필요함
 
//     public Car() {
//    	 tire = new Tire();
//     }

     public Car( Tire tire) { //외부에서 다 만들어 놓고 가져오도록 함
    	 this.setTire(tire); 
     }
     // 포함관계에서 클래스객체 생성시기

	public Tire getTire() {
		return tire;
	}

	public void setTire(Tire tire) {
		this.tire = tire;
	}
	
}
