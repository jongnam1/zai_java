package study0212c;

import java.util.Arrays;

public class study0212c {

	public static void main(String[] args) {
		
		int[][][] arr = new int[3][2][2];
        arr[0][0][0] = 10;
        arr[0][1][1] = 20; //참조변수 공간에는 메모리주소만 들어갈수 있다, 일반적인 정수, 문자는 못넣는다.
        arr[0][1][0] = 30;
        arr[1][0][0] =50;
        arr[1][0][1] =60;
        arr[2][0][0] =100;
        
        System.out.println( Arrays.toString(arr[0][1])  );
		
        for(int i=0; i<arr.length; i++) {
        	
        	for(int k=0; k<arr[i].length; k++) {
        		
        		for(int j=0; j<arr[i][k].length; j++) {
        			
        			System.out.println(arr[i][k][j]);
        		}
        	}
        }
	}

}
