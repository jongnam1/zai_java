package collection7;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class MainMt {

	public static void main(String[] args) {
		
		HashMap<String, Integer> map = new HashMap<>();//<key, value>,  ket가 중복일경우, 가장최근의 value로 변경
		map.put("수박", 15000); map.put("바나나", 5400);
		map.put("앵두", 2300); map.put("딸기", 12400);
		
		System.out.println( map );
		
		map.put("수박", 19000); 
		System.out.println(map);
		
		if( map.containsKey("수박")) {
			System.out.println("key로 수박이 사용중 ");
		}
	    // 포함여부는 contains인데 key, value각각 있다.
		
		System.out.println(map.keySet() );// 반환타입이 set
		System.out.println(map.values() );
		
		System.out.println(map.get("앵두") );
		System.out.println(map.get("참외") ); //map,set은 메모리소비가 크다.
		
		//맵에 저장 되어있는 특정 key의 value변경
	    map.put("앵두", 3100);
	    System.out.println( map );
		
	    map.replace("앵두", 4300);
	    System.out.println( map );
	    //put 메서드는 새로운 값 저장 또는 변경
	    
	    map.put("토마토", 5600); // 새로운거 추가할때는 put
	    System.out.println( map );
	    
	    map.replace("구아바", 9800); // 변경할때는 replace
	    System.out.println( map );
	    
	    Set<String>keys =map.keySet();
	    System.out.println(keys);
	    
	    System.out.println( map.entrySet() );
	    
	    for( Entry<String, Integer> ent : map.entrySet() ) {
	    	System.out.println(ent.getKey() + " " +ent.getValue() );
	    }
		
	    HashMap<String, Active> cmd = new HashMap<>();
	    cmd.put("회원가입", new Member() );
	    cmd.put("게시판", new Board() );
	    cmd.put("게임", new Game() );
	    
	    cmd.get("게시판").save();
		cmd.get("회원가입").save();
		cmd.get("게임").save();
		
		String command = "게시판";
		
		Active action = cmd.get(command);
		action.save();
		
	}

}





/*

 Map - key와 value로 이루어진 구조
       key는 중복 불가, value는 중복 가능
       조회방법은 key를 통해 value 찾기
       
       HashMap, TreeMap
       

*/