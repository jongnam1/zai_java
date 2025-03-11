package login;

import java.util.ArrayList;
import java.util.Scanner;


public class user implements Active {

	private Udao daoo;
	public user() {
		this.daoo = new Udao();
	}
	
	public String logIn() {
		Scanner scan = new Scanner(System.in);
		System.out.println("로그인");
		System.out.println(" UserId :");
		String uId = scan.nextLine();
		System.out.println("PassWord :");
		String uPw = scan.nextLine();
		
		return null;
	}
	public void log() {
		System.out.println("로그인 실패");
		
	
	}
	
	
	
}

