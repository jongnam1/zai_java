package generic2;

public class MainMt {

	public static void main(String[] args) {
//		bottle<String> b1 = new bottle<String>();
		//bottle 클래스의 제네릭 타입으로 String지정
		//String item으로 변경, 
		//make메서드의 매개변수 String item으로 변경
//		b1.make("레몬소주");
		
	   	Soju sj = new Soju("참이슬", "진로", 16);
	   	Wine wn = new Wine("디안느소비뇽","앙드레뤼통",12);
	   	Makgeolli mg = new Makgeolli("공주밤막걸리", "사곡양조원", 6);
	   	
	   	sj.aa();
	   	
		bottle<Soju> 참이슬 = new bottle<>();
        참이슬.make(sj);
        
        
        bottle<Alcohol> 술병 = new bottle<>();
        술병.make(wn);
        
        Service 은호 = new Service();
        은호.drink(참이슬);
        
        Service 수영 = new Service();
        수영.drink(술병);
        
//        술병 = 참이슬; // 제네릭 타입은 부모자식 구별안함, 타입이 완전히 일치해야됨
        
        
        Alcohol ach = sj;
        
        bottle<Wine> 소비뇽 = new bottle<>();
        소비뇽.make(wn);
        
        bottle<Makgeolli> 밤막걸리 = new bottle<>();
        밤막걸리.make(mg);
        
        
        bottle<Alcohol> 소주병 = new bottle<>();
        소주병.make( sj );
        
//      bottle<Toy> 티니핑 = new bottle<>();
//      티니핑.make(new Toy() );
        
        소주병.make( mg );
        
	}

}


/*
 
 
bottle<String> b1 = new bottle<String>();

public class bottle {
    String item; 
	
    public void make(String item) {
    	System.out.println("만들기");
    	this.item = item;
    	System.out.println( item );
    }

제네릭 - 클래스 내부에 사용할 타입을 외부에서 지정하는 방법
   Member<Admin> a = new Member<>();
   -> Member 클래스 내부에 Admin이라는 타입을 사용한다.
   -> Member 클래스는 class Member<T> 로 정의되어 있어야 한다.
   -> 클래스내부의 인스턴스 변수나 인스턴스 메서드의 매개변수 타입또는 반환 타입을
       제네릭타입으로 표현가능하다.
 Member<Admin> a = new Member<>()은 Admin클래스의 객체 생성이 아니다.
 Member클래스의 객체 생성이다.
 
 - 제네릭을 사용하는 클래스인경우 해당 클래스의 참조변수들은 Member<Admin>까지를
    타입으로 인지한다.
 - 제네릭에서는 상하 관계가 없다.   (제네릭 타입으로 부모클래스나 자식클래스를 사용해도
    대입 연산이 이루어지지 않는다.)
  -제네릭을 사용하므로 타입에 대한 예외 상황을 방지할수 있다.
    (컴파일 과정에서 발생할수 있는 오류 최소화)
  - 제네릭 사용 범위 제한은 extends와 super이다.
  - 메서드에만 제네릭 사용되는 경우 와일드카드(?)를 사용하는게 여러타입처리 가능
  - 와일드 카드의 범위 제한은 extends, super이다. 
  
  
  



*/

