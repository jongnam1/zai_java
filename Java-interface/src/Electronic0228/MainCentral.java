package Electronic0228;

import java.util.Scanner;

public class MainCentral {

	public static void main(String[] args) {
		

		RemoteCon [] rcon = new RemoteCon[3];
		rcon[0] = new Light();
		rcon[1] = new Tv();
		rcon[2] = new Aircon();
		
		for (RemoteCon remo : rcon ) {
			remo.turnOff();
			remo.turnOn();
		}
	}

}
