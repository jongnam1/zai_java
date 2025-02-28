package Electronic0228;

public class Light implements RemoteCon{

	@Override
	public void turnOn() {
		System.out.println("전구켜짐");
	}
    @Override
    public void turnOff() {
    	System.out.println("전구꺼짐");
    }
}
