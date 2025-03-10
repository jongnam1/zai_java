package collection6;

import java.util.TreeSet;

public class TreeMain {

	public static void main(String[] args) {
		
		TreeSet<Integer> tree = new TreeSet<>(); // 기본오름차순정렬, 중복허용안됨
		
		tree.add(35); tree.add(41); tree.add(29);
		tree.add(9); tree.add(15); tree.add(20);
		tree.add(56); tree.add(49); tree.add(11);
		tree.add(17); tree.add(89); tree.add(39);
		
		System.out.println( tree );
		
		System.out.println(tree.headSet(20) ); // headSet 검색메서드 (20)안에 값보다 미만인거 출력, 일치하는거 안나옴
		System.out.println(tree.tailSet(31) );
		
		// 특정 값 기준으로 작은 데이터 모두찾기 - headSet
		// 특정 값 기준으로 큰 데이터 모두 찾기 - tailSet
		
		System.out.println(tree.first() ); //첫번째 값
		System.out.println(tree.last() ); // 마지막 값
		
		System.out.println(tree.higher(29)); // higher 29초과 바로 가까운 큰거 출력
		// 가장 가까운 값이 없으면 null
		System.out.println( tree.higher(100) );
		
		System.out.println(tree.lower(30)); // lower 30보다 바로 가까운 작은거 출력
		
		System.out.println(tree.ceiling(39)); // 39이상 보다 바로가까운 큰거 출력
		                                      // 해당값 포함해서 찾기 떄문에 입력한 값이 나올수도 있음
		
		System.out.println(tree.floor(17));// 17 이하 보다 바로가까운 작은거 출력
		                                   // 해당값 포함해서 찾기에 입력한 값이 나올수 있음
		
		System.out.println( tree.subSet(17, 41 ));
		//subSet - 범위 지정하여 검색
		//   subSet(a,b)    a 부터 b 전까지 검색 (a 이상 b 미만)
	}

}
