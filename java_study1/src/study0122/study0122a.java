package study0122;

public class study0122a {

	public static void main(String[] args) {
		
		// 증감 연산자      ++, --  각각 1씩증가,감소함
		
		int a = 10 , b = 10, result=0;
		// ++
		
		System.out.println("++전 : " + a);
		a++; //<-사용법
		System.out.println(" ++ 후 : " + a);  
		
		++a;
		System.out.println( "++a : " + a);
		
 		//증감연산자의 위치가 변수앞, 변수뒤 차이
		a=10;
		result = a++;
		System.out.println(" result = a++ : " + result);
		result = ++b;
		System.out.println(" result = ++b : " +result );
		
		// 증감연산자를 변수 앞에 붙이면 우선순위가 상위권
		// 증감 연산자를 변수 뒤에 붙이면 우선순위가 하위권
		
	    // r=a++
		// r=a
		// a=a+1 우선순위
		
		//r= ++b
		//b=b+1
		//r=b
		
		
	}

}
