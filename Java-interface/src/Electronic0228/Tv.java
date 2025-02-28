package Electronic0228;

public class Tv implements RemoteCon{
	
	@Override
	public void turnOn() {
		System.out.println("Tv 전원on");
	}
	@Override
	public void turnOff() {
		System.out.println("Tv 전원Off");
	}

}
