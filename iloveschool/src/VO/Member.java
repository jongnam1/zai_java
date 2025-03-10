package VO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor

public class Member implements Comparable <Member>{

	private long id;
	private String memberId;
	private String email;
	private String password;
	private String birth;
	private int age;
	
	@Override
	public boolean equals(Object obj) {
		Member temp =(Member)obj;
		boolean isSame = this.birth.equals(temp.birth);
		isSame = isSame && (this.email.equals(temp.email));
		isSame = isSame && (this.memberId.equals(temp.memberId));
		
		return isSame;
	}
	
	@Override
	public int compareTo(Member o ) {
		return this.birth.compareTo(o.birth);
	}
	
	
	

	
	
	
	
	
}