package Electronic0228;

public class Aircon implements RemoteCon{

	
	@Override
	public void turnOn() {
		System.out.println("Aircon 전원on");
	}
	@Override
	public void turnOff() {
		System.out.println("Aircon 전원Off");
	}
}
