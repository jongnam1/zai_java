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
        
        
        술병 = 참이슬; // 제네릭 타입은 부모자식 구별안함, 
        
        
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




*/