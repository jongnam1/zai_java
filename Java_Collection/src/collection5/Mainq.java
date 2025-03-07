package collection5;

import java.util.LinkedList;
import java.util.Queue;

public class Mainq {

	public static void main(String[] args) {
	
		
		// FIFO - 구조 first in first out
		
		
		Queue<Integer> q= new LinkedList<>(); //자바에서의 큐는 링크드리스트를 이용하도록 설계
		
		q.offer(100);
		q.offer(20);
		q.offer(343);
		
		System.out.println(q);
		//큐에서 내보내기 - 먼저 들어온 순서대로
		q.poll();
		System.out.println( q );
		
		
		
	}

}
