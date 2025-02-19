package study0218;

public class Member {
    String name; // 이름, 인스턴스 변수
    int age; //나이
    String job; //직업
    
    Member() { //기본 생성자 메서드
    	this.name="박문수";  //내부에서 쓰기위해 this 사용함(여기가내부 나머지 다 외부)
    	System.out.println(this);
    	
    }
    Member(int age, String job/*(지역변수)*/){ //클래스이름과 다르면 생성자메서드로 인식안함
 //   	    age // <-지역변수     
    	   this.job = job; // <-인스턴스변수
    	   this.age = age;
    }
    Member(int age, String job, String name ){ 
 //      this.name //<-인스턴스 변수임
       this.age=age;
       this.job=job;
       
       
    }
    
    //오버로딩 조건
    // 1. 메서드 이름이 같아야 한다.
    // 2. 매개변수 타입이 같으면 안된다.
    // 3. 매개변수 갯수가 달라도 성립
    // 4. 클래스 내부에서만 가능 하다.
    
    // 자바 변수 종류
    // 인스턴스 변수
    // 지역변수(매개변수)
    // 클래스변수
    
    
    
    // 변수 우선순위
    // 지역변수 > 인스턴스변수 >= 클래스변수
    
    
    
    
    // 생성자 메서드
    // 생성자 메서드는 자바에서 클래스 정의 할때
    // 기본 생성자 메서드도 같이 만들어진다.
    // 눈에 보이지 않게 생략 처리 된것이지 없는것은 아니다.
    // 생성자메서드는 클래스 객체 공간생성시
    // 인스턴스들의 초기화를 담당하는 메서드이다.
    
    
    
}
