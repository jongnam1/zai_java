package service;

import DAO.MemberDao;
import jakarta.servlet.http.HttpServletRequest;

public class MemberService {

	public void login(HttpServletRequest request) {
		
		String email = request.getParameter("userId");
		String pass = request.getParameter("userPw");
		
		MemberDao dao = new MemberDao();
		
		if( dao.loginCheck(email, pass) ) {
			request.getSession().setAttribute("user", email);
		}else {
			
		}
	}
}

//클라이언트의 요청 처리
// 주소에의한 요청 -> 서블렛(컨트롤) -> 서비스(실제 처리 코드)
// -> DAO( 데이터베이스 필요시 ) 
// -> 서비스(테이블에서 가져온거 있다면 서비스쪽으로 리턴)
// -> DAO로 부터 받은거 있다면 서블렛에게 리턴
// -> 서블렛( 클라이언트에게 페이지 제공 )