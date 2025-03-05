package generic2;

public class Service <T>{

	public void drink( bottle<? extends Alcohol> soju ) { //알코올섭취, 물음표는 다 허용됨
		System.out.println( soju.item );   
		System.out.println("한잔 마신다.");
	}
}
	
//	public void drink( bottle<Makgeolli> mak ) {
//		System.out.println(mak.item);
//		System.out.println("한잔 마신다.");
//	}
//}
