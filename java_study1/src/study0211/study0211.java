package study0211;

import java.util.Scanner;

public class study0211 {

	public static void main(String[] args) {
		
             int [] num = new int[15];
             
             int idx=0;
             while(true) {
            	 int temp = (int)(Math.random()*50+1);
            	 if( temp%2==0 ) {  //2나누기 했을 때 나머지가 0이면 짝수
            		 boolean isSame=false; //같으면 true, 다르면 false
            		 for(int i=0; i<idx; i++) {
            			 if(num[i] == temp ) 
            				 isSame = true;
            			 
            		 }	
            			 if (!isSame)
                    		 num[idx++] = temp;  //1씩 증가하면 1,2,3,4..14인덱스에 저장
            	         
            		 } 
            	 if(idx == num.length)break; //idx의 값이 배열크기와 같으면 배열의 마지막공간까지 데이터 저장완
             }
            	 for(int i =0; i<num.length; i++)
                	 System.out.println(num[i]);
             }
             
             { 
             }




	
}
