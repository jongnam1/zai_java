package collection7;

import java.util.TreeMap;

public class TreeMapMain {

	public static void main(String[] args) {
	
		TreeMap<Integer, String> tree = new TreeMap<>();
		
		tree.put(100, "이순신" ); tree.put(341, "김유신" ); //(key, value)
		tree.put(541, "장영실" ); tree.put(874, "나문희" );
		tree.put(241, "이순재" ); tree.put(234, "박하선" );
		
		System.out.println( tree ); // key를 기준으로 출력
		
		// 트리맵의 검색 메서드 - 트리맵에서 검색은 key를 검색하는것
		
		System.out.println( tree.headMap(300) ); // key 값 입력해야함, 300보다 작은값
		System.out.println( tree.tailMap(250) ); // 250보다 큰 값
		//headMap - 해당값보다 작은 key 모두 찾기
		//tailMap - 해당값보다 큰 key 모두 찾기
		
		System.out.println( tree.firstKey() ); // 맨처음 키값
		System.out.println( tree.firstEntry() ); // 맨처음 key,value값
		System.out.println( tree.lastKey() ); // 맨 마지막 key값
		System.out.println( tree.lastEntry()); // 맨 마지막 key,value 값
		
		System.out.println( tree.higherKey( 345 )); // 해당값보다 큰 값
		System.out.println( tree.higherEntry(345 )); //해당값보다 큰 key, value값
		System.out.println( tree.lowerKey(300 ));
		System.out.println(tree.lowerEntry(500));
		
		System.out.println(tree.ceilingEntry(342));
		//ceilingkey - 해당 key 이상의 값 찾기
		//ceilingEntry - 해당 key 이상의 값 찾기(key와 value 출력)
		// floorkey - 해당 key 이하의 값 찾기( key출력)
		// floorEntry - 해당 key 이하의 값 찾기 (key와 value 출력)
		
		System.out.println(tree.subMap(200 ,600 )); //200이상 600미만 key 찾기

		
		
	}

}
