package study0210a;

import java.util.Scanner;

public class study0210a {

	public static void main(String[] args) {
		// 변수 : 값(데이터,주소 등등)을 저장하기 위한 메모리 공간
		int a = 10; // 타입에 의해서 값의크기가 결정됨/ 하나의공간에 값이 하나만 들어갈수 있음
		a=20;
		// 배열 :같은 데이터 타입의 연속적인 메모리 공간
		//      다른말로 -> 변수공간 여러개를 연속적으로 사용, 모든공간의 같은타입이 있어야 배열이라고 함
		
		//자바스크립트 배열 -> let arr = [];  let arr= new Array();
//		                   const arr= [1,2,3,4];
		
		//자바 배열 선언 방법
		int[] arr = new int[5]; //5개 공간으로 이루어진 배열 선언, 한번정한 크기를 변경할수 없음
		int[] arr2 = new int[] {1,20,50,15}; //4개 공간 배열 선언 
		
		//자바 배열 사용법
		arr [2]= 20; // arr배열의 세번째 공간에 20저장 / 3번째 공간에 저장됨
		System.out.println(arr); // arr의 입장에서 첫번째 공간의 주소를 알고있다,2번쨰,3번쨰는 모름, 타입의 크기만큼 이동함
		                         // 각 자리는 인덱스라고 함, 인덱스+1= n번째 공간   
		System.out.println( arr[0]);
		arr[0]=10;
		arr[1]=30;
		arr[3]=40;
		arr[4]=60;
		
		for(int i =0; i<=4; i++) {
			System.out.println( arr[i] ); //배열 사용하려면 반복문 써야 함
		}
		
		// 배열의 각각의 공간을 표현하려면 인덱스로 표현해야한다.
		// 인덱스는 0부터 시작한다
		// 그래서 반복문의 초기값은 0으로 지정하면 된다.
		// 반복문의 조건식은 배열인덱스의 마지막까지 표현될수 있게 하면 된다.
		// 배열의 크기(공간갯수)가 8이라면 마지막 인덱스는 7
		// 조건식은 i <=7 하면된다.
		for ( int i =0; i<=3; i++) {
			System.out.println( arr2[i]);
		}
		
		int[] apple = new int[10]; //new가 사용된거는 전부 참조변수임, scanner도 참조변수, 주소가 저장되어있는 변수
	 	// 참조변수를 사용하려면 배열인경우 인덱스로표현, 객체인경우는 .(점)접근연사자로 표현 / 참조변수는 데이터가 없음
//		Scanner[] a= new Scanner[50];
//		ab[0]; 
		//Scanner 라는 이름의 클래스 타입이다.
		
		Scanner sc = new Scanner(System.in);
		//배열에 데이터 입력
		for(int i=0; i<=9; i++) {
			System.out.print("숫자 입력 :");
			apple[i]= sc.nextInt();
			//배열에서 중간에 데이터를 삽입하거나 삭제하려면 오래걸린다
			
			
		}//배열의 크기를 표현할때는 작다로 표현해야함 apple.length -> 배열의 크기(공간갯수)
		//실수데이터는 정확도가 100%가 아니라 잘못처리 될수도 있다.
		// 배열의 크기는 반드시 10진수 정수 양수로 지정
		for(int i=0; i<apple.length; i++) {
		   System.out.println( "배열값 :" +apple[i]);
		   
		   
		   
		}
	}
}
	

