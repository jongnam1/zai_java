package collection5;

import java.util.LinkedList;
import java.util.Stack;

public class MainMt {

	public static void main(String[] args) {
	
                                                      // 주 데이터는 arraylist, linkedlist, vector 이거로 다 처리함
//		LinkedList<String> list = new LinkedList<>(); //데이터를 삭제하고 추가하고 할거면 링크드리스트 사용
//		list.add("틀린그림찾기");
//		list.add("벽돌깨기");
//		list.add("슈퍼마리오");
//		
//		list.contains("고인돌");
//		list.indexOf("벽돌깨기");
//		System.out.println( list.get(1) );
		
		//스택 - FILO 구조 이다. first in last out
		// 웹 브라우저 히스토리, 계산기, 메서드 호출 등등
		
		Stack<String> stack = new Stack<>();
		stack.add("김춘추");
		stack.push("이순신"); // stack만 push있음, 데이터를 넣는것
		stack.push("이성계");
		stack.push("홍길동");
		stack.push("김석진");
		stack.push("이정훈");
		stack.push("김미란");
		
		System.out.println( stack );
		
		stack.pop(); // 데이터를 빼는것
        System.out.println( stack );		
        stack.pop();
        System.out.println( stack );
        
        
        
		
        
		
	}

}
