package generic2;

public class Mainct {

	public static void main(String[] args) {
		Soju SSoju = new Soju("진로", "참이슬 ", 18);
		
		SSoju.aa();

	    bottle<Soju> 참이슬 = new bottle();
 		참이슬.make(SSoju);
	}

}
