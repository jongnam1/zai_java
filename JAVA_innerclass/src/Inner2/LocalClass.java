package Inner2;

public class LocalClass {

	private String name;

	
	public void getBirth() { // 인스턴스 메서드
		
		class Birth{ //<- 지역 내부 클래스
			int year;
			int month;
			
		}
		Birth b = new Birth();
		b.year = 2000;
		b.month = 4;
		System.out.println(b.year+" "+b.month);
	}
//	Birth bb = new Birth(); <- 정의되어 있지않아서 빨간줄 나옴
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
