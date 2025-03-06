package Collection3;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor  // 기본 생성자 메서드
@AllArgsConstructor  // 모든 인스턴스를 매개변수로 메서드


public class Member {
	private Long id; // 회원번호
	private String memberId; // 회원 아이디
	private String email; // 회원 이메일
	private String password; // 회원 비밀번호
	private String birth; // 생년월일(8자리)
	
//	public Member() {}
//	public Member(Long id, String memberId, String email, String password, String birth) {
//		this.id=id;
//		this.password=password;
//		this.memberId=memberId;
//		this.email=email;
//		this.birth=birth;				
//	}
	
}


// 클래스 정의 
// 인스턴스변수의 접근 제어자는 private
// 인스턴스변수에대해 get,set 메서드 
// toString 메서드 만들기





