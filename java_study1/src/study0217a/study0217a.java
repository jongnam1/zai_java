package study0217a;

import java.util.Arrays;

public class study0217a {

	public static void main(String[] args) {

	    		 
		
//		String[][] book = new String[][] {
//		 {"신데렐라", "백설공주", "선녀와나무꾼","흥부와놀부"},
//         {"초역부처의말", "마음의기술", "나혼자만레벨업","노블레스", "갓오브하이스쿨"},
//        {"참교육", "윈드브레이커", "빌드업", "최애캐의 고민상담소", "절대검감"},
//         {"화산귀한", "환생천마", "아수라", "김부자", "자기 자?"}
//		};
//        
//		for(String[]info : book) {
//			for(String tmp: info) {
//				System.out.print(tmp);
//			}
//            System.out.println();

        
           //문제
           // 농장 수확량 계산 
           // 농장의 일일 수확량을 배열에 저장했다.
           // 전체 수확량을 구하고, 평균 수확량을 구하세요
           // 가장 많은 수확량은 얼마인지 출력   - 힌트 : ㅈㄹ 정렬 
            
            int[] harvest = { 9, 10, 11, 8, 7, 5};
            
                        
                int total =0;
               	for( int am : harvest ) {
            		total = total +am;
            		
            	}
               	System.out.println("전체 수확량 :" +total);
               	
               	float avg = total/(float)harvest.length;
               	System.out.println("평균 수확량:" + avg);
            	
               	Arrays.sort(harvest); // 정렬 오름차순
               	
               	System.out.println("가장 많은 수확량 :" + harvest[harvest.length-1]);
               	
//               	System.out.println(Arrays.toString(harvest));
            	}
           
    	  
    	}
        

	
	 




	
	
	
	
	
	

  

