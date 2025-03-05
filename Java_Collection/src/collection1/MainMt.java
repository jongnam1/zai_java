package collection1;

import java.util.ArrayList;

public class MainMt {

	public static void main(String[] args) {
	
		

        // 배열에 정수를 추가로 저장 될수 있게 하기!!
		
//		MyArray a = new MyArray();
//		a.add(100);
//		a.add(20);
//		a.add(666);
//		a.add(777);
//		a.add(7777);
//		
//		
//		
//		System.out.println(a.get(3));
		
		
		ArrayList list = new ArrayList(); // 타입상관없이 다들어감
		list.add(100);
		list.add(777);
		list.add("장미란");
		list.add("포카리");
		list.add(3.141414);
		
		
		System.out.println(list.size() ); //크기 - 데이터몇개 저장되어있는가
		
		System.out.println(list.get(1)); // get() <- 안에 인덱스 번호
		
		System.out.println(list.indexOf("포카리") ); // 배열에 특정데이터 어디?
		
		list.remove(1); // 인덱스를 지정하여 해당 데이터 삭제
		list.remove("포카리"); //삭제 할 데이터 입력하여 삭제
		System.out.println( list ); //<-참조변수 넣는것
		
	}

}





/*
  
  
  자바 컬렉션 프레임워크
  자료구조와 알고리즘을 클래스화 시켜놓은것
  자료구조 - 데이터를 저장관리하는 방법
  알고리즘 - 저장된 데이터를 가공하는 방법
  
  
  Collection                  Map
     List                       HashMap
         ArrayList              TreeMap
         LinkedList             Properties
         Vector
         Stack
         Queue
         
     Set
         HashSet
         TreeSet
  









*/