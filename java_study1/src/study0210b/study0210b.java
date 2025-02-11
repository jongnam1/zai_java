package study0210b;

import java.util.Scanner;

public class study0210b {

	public static void main(String[] args) {

           Scanner sc =new Scanner(System.in);
        
           // 7의 정수를 저장 할 수있는 배열을 선언하고 
           // 정수 7개 입력한뒤 모두 출력하세요.
//           int [] rra = new int [7];
//           
//         for (int i =0; i<rra.length; i++) {  
//        	
//        	 System.out.print("숫자입력 :");
//            rra[i] = sc.nextInt();
//         }  
//            
//         for(int i=0; i<rra.length; i++) {
//        	 System.out.println(rra[i]); //0번 인덱스 부터 6인덱스까지
//         }
	      
//           int size = 5;
//           
//           int[] age = new int[size]; 
           // 정적 배열은 지정된 크기를 변경하기 어렵다.
           // 프로그램실행시 컴파일 과정에서 배열의 크기가 정해져 있어야
           // 그만큼 공간을 할당 받는데 배열의 크기가 확정되어 있지 않으면
           // 컴파일 과정에서 공간을 할당 받지 못한다. 
           //( 윈도우에 의해 필요한 만큼 대여받는건데 정확한 크기가 없으면
           // 대여 안해줌.)
           
           
//           age[0]=10;
//           System.out.println(age[0]);
//           
//          int[] sum = new int[3];
//          int[] a =new int[] {10,20,30};
//          int[] b = new int[] {1,5,9};
//          // a 배열과 b배열의 합을 sum에 저장
//          sum[0] = a[0]+b[0];
//          sum[1] = a[1] + b[1];		  
//          sum[2] = a[2] + b[2];		  
//        		  
//          for(int i =0; i<sum.length; i++) {
//        	  sum[i] = a[i] + b[i];
//          }
       
          // a와 b배열의 데이터를 total배열에 저장하기
           // a 배열의 값 먼저 저장하고 이어서 b배열의 값 저장 될수 있게!!
           // 저장한 뒤에 total배열 값 출력
           // 결과 -> 10 20 30 40 50 55 44 33 22 11 
           
//          int[] total = new int[10];
//          int[] a=new int [] {10,20,30,40,50};
//          int[] b = new int [] {55,44,33,22,11};
//        		  
//          for(int i=0; i<a.length; i++) {
//        	  total[i] =a[i];
//        	  total[i+5] = b[i];
//          }
//          for(int i=0; i<total.length; i++) {
//        	  System.out.println(total[i]);
//          }
//          for( int i=0; i<a.length; i++ ) {
//        	   total[i] = a[i]; // total[0] =a[0], total[1] =a[1]...
//        	
//          }
//          for(int i=0; i<b.length; i++) {
//        	  total[i+5]= b[i]; // total[5] b[0], total[6] =b[1] ...
//          }
//          int[] a= new int [] {10,20,30,40,50};
//          System.out.println( a );
//           
//           
//         char[] name = new char[5]; // 문자열은 배열임
//         name[0]='j';
//         name[1]='o';
//         name[2]='h';
//         name[3]='n';
         // name -> john 문자로 저장
         // 문자열은 배열이지만 char 배열로는 온전한 문자열 입력이 어렵다.
         // 배열이기때문에 인덱스를 통해 문자 하나씩 입력 저장해야한다.
         // 그래서 자바에서는 문자열의 사용을 편하게 하기 위해
         // string 클래스가 존재한다.
         // string 클래스에는 내부적으로 char 배열 생성 되도록 되어 있다.
                       
         
//         System.out.println( name );
//         System.out.println("member".length() );
//          
//         String myName = "john"; //<-자바에서 문자열은 string으로 함, 기본데이터 타입이 아니라 클래스 타입임
//         System.out.println( myName);
//         myName = "설경구";
//         System.out.println( myName.charAt(0) );
//         
//         String youName = new String("박문수");
//         System.out.println( youName);	
         
//         int [] a= new int [] {11,20,55};
//         int [] b= new int [] {13,20,55};
//          
//         boolean isSame = true; // 같은 배열 이면 true 다르면 false
//         
//         for(int i=0; i<a.length; i++) {
//        	 if( a[i] != b[i] ) 
//        		 isSame=false;
//         }
//         if (isSame) {
//        	 System.out.println("같은 배열");
//         }else {
//        	 System.out.println("다른 배열");
//         }
         
//         	char[] name1 = new char[] {'주','동','건'};
//         	char[] name2 = new char[] {'주','동','건'}; // 문자로써 비교하는거임
//        		  
//         	//name1 과 name2의 이름이 같은 이름인가??
//         	
//         	boolean istrue = true;
//         	for(int i=0; i<name1.length; i++) { //같은크기라서 name1,name2상관없음 .length
//         		if(name1[i] != name2[i] )
//         			istrue=false;
//         			
//         	}if(istrue) {
//         		System.out.println("같은 이름");
//         	}else {
//         		System.out.println("다른 이름");
//         	}
        		  
           String name1 = "주동건";
           String name2 = "이동건";
           if( name1.equals(name2) ) //참이냐 거짓이냐를 넣어야 함,  name1과 name2가 같은지 비교
        	   System.out.println("같은 이름");
           else
        	   System.out.println("다른 이름");
        		  
           System.out.println( name1.compareTo(name2) ); // 서로 같은 문자나오면 0이라고 나옴, 한자라도 다르면 양수,음수가 나옴
           //compareTo : 0 이라면 두 문자열 동일
           //      양수 : 사전적 순서가 앞일 경우 c name1     a name2  오름차순으로 정렬됨
           //      음수 : 사전적 순서가 뒤인 경우 a name1     c name2  
           
           
           int[] num = new int[] {10,20,30,40,50,60,70,80,90,100};
           
           for( int a : num) {
        	   System.out.println( a );
           }
           
//           for(int i=0; i<num.length; i++) {
//        	   System.out.println(num[i]);
//           }
//           
           
           
	}
}
        		  
        		  
        		  
        		  
        		  
        		  
        		  
        		  
        		  
        		  
        		  
        		  
        		  
        		  
        		  
        		  
        		  
        		  
        		  
        		  
        		  
        		  
        		  
        		  
        		  
        		  
        		  
        		  
        		  
        		  
        		  
        		  
        		  
        		  
        		  
        		  
        		  
        		  
        		  
        		  
        		  
           
           
           
           


