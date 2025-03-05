package generic2;


public class bottle <T extends Alcohol>{ // 제네릭 타입을 사용하는 클래스
    T item; 
	
    public void make(T item) {
    	System.out.println("만들기");
    	this.item = item;
    	System.out.println( item );
    }
    
    public T getItem() {
    	return this.item;
    }
    
}

// 제네릭 타입의 제한
// T extends 부모클래스명 -> 부모와 자식만 가능
// T super 클래스명   ->  해당 클래스와 클래스의 부모만 가능

//  ? 




