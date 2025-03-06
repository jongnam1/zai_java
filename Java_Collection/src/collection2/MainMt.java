package collection2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MainMt {

	public static void main(String[] args) {
		
		ArrayList<String> names = new ArrayList<>();
        names.add("김춘추"); names.add("박은희");
        names.add("최예너"); names.add("정소영");
        names.add("김현직"); names.add("서경석");
        
        System.out.println(names);
        
        
        //이순신 이름이 등록되지 않으면 등록하고 있으면 등록안하고 하려면?
        boolean hasName= names.contains ("이순신");
        System.out.println( hasName);
        if( !hasName ) {
        	names.add("이순신");
        	
        	System.out.println( names);
        	
        	//list -> Array(배열)
        	String[] arr = names.toArray( new String [names.size()]);
        	
        	//Array(배열) -> list
        	ArrayList<String> n = new ArrayList<>(Arrays.asList(arr) );
        	
        	
        	Arrays.sort( arr );
        	System.out.println(Arrays.toString(arr));
        	
        	// ArrayList를 정렬 하는 방법 - 오름차순
        	System.out.println("=== 정렬전 (names) ====");
        	System.out.println( names );
        	
        	Collections.sort( names ); //컬렉션프레임워크에 있는것을 정렬하고자 할때
        	System.out.println("====정렬후 (names)====");
        	System.out.println( names );
        	
        	// 내림차순
        	Collections.sort(names, Collections.reverseOrder());
        	System.out.println( names );
        	
        	// 최예너 -> 최예나 변경
        	names.set(names.indexOf("최예너"), "최예나"); //변경할 인덱스, 변경데이터
        	
        	System.out.println( names );
        	
        	// 김씨 성을 가진 사람만 출력
        	for(String name : names) {
        		if(name.charAt(0) == '김' )//문자는 작은따옴표
        			System.out.println( name );
        			
        	}
        	names.add("박수영"); names.add("김나영");
        	// 이름에 '영' 을 '진'으로 변경
        	
        	for(int i =0; i<names.size(); i++ ) {
        	    if(names.get(i).contains("영") ) {
        	    	names.set(i, names.get(i).replace("영", "진"));
        	    }
        	}
            System.out.println(names);
        	
            
            ArrayList<Integer> number = new ArrayList<>();
            number.add(100); number.add(544);
            number.add(777); number.add(777);
            number.add(77);
            
            for( Integer num : number) {
            	System.out.println( num );
            }
            // 1~50 랜덤 범위에서 25개 숫자를 저장,중복 없음
            
            ArrayList<Integer> bingo = new ArrayList<>(25);
         
            do {
            	int temp = (int)(Math.random()*50+1);
            	if(!bingo.contains(temp) )
            		bingo.add(temp);
               
            }while(bingo.size()!=25 );
//            System.out.println(bingo);
            
           
            
            
           
           
            
        }
        
	}

}




