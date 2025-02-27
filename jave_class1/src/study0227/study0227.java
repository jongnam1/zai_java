package study0227;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class study0227 {

	public static void main(String[] args) throws ParseException {
		

		Date today = new Date();
		
		System.out.println(today); // 2025.02.27 <-점으로 대한민국 날짜표시, /는 일본표기방식
		//년도 추출
		System.out.println(today.getYear() +1900 ); //모든 기기들의 기본년도는 1900년도, 사선들어가면 왠만하면 쓰지마라, 권장하지 않음
		
		//월 출력
		System.out.println(today.getMonth() +1 ); // 월의 시작은 0부터 시작
		
		//일 출력
		System.out.println(today.getDate());
		
		// 요일 출력
		System.out.println(today.getDay()); // 숫자로 표현됨, 대부분이 일요일부터 시작함
		
		// 시, 분, 초
		System.out.println( today.getHours() + ":" + today.getMinutes() +":" + today.getSeconds());
	    
		// 날짜와 시간 포맷 지정하는 방법
		// 2025.2.27
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일");
		
		String myDate = sdf.format(today); 
		System.out.println( myDate );
		
		SimpleDateFormat time = new SimpleDateFormat("hh시 mm분 ss초");
		String myTime = time.format(today);
		System.out.println(myTime);
		
		// 날짜 차이 구하기
		// 2024.12.18 부터 오늘까지 몇일인지 구하기
		
		Date start = new SimpleDateFormat("yyyy.MM.dd").parse("2024.12.18");
		
		long difsec =( today.getTime() - start.getTime() ) /1000; //초
		System.out.println(difsec);
		
		long difmin = difsec/60;  //분
		System.out.println(difmin);
		
		long difhour = difmin/60; //시
		System.out.println(difhour);
		
		long difDays = difhour/24; //일
		System.out.println(difDays);
		
	}

}
