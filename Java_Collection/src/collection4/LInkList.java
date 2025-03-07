package collection4;

public class LInkList {

	private Node head;
	private Node tail;
	
	
	public void add(int data) {
		Node temp = new Node(data);
		if( head ==null) // 첫번째 노드만들어지면
			head=temp;
		else { // 두번째 부터
			tail.setLink(temp);
		}
		 tail = temp;
		
	}
	
	public void view() { // 링크드리스트 전체 출력
		  Node move = head;
		  while(move!=null ) {
			  System.out.println(move);
			  move = move.getLink();
			  
		  }
		 
		
	}
	
}












//앞쪽주소와 뒤쪽주소를 갖고 있는것: 이중링크드리스트
	//메모리주소 공간: 노드
	//맨 앞에있는 노드: 헤드
	//맨 마지막 노드:  테일
	//테일과 헤드 연결되는것:환형링크드리스트
	