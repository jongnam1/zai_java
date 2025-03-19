package control;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import service.MemberService;

import java.io.IOException;

/**
 * Servlet implementation class Main
 */
public class Main extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Main() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
//		response.sendRedirect("/jsp2/member/signIn.jsp"); // <-이 방식으로는 데이터 전달이 안됨
		

//		response.getWriter().append("<h1> i love pizza </h1>");
		
		RequestDispatcher rd = request.getRequestDispatcher("member/signIn.jsp"); // forward 방식으로 하려면 requestDispatcher가 필요함
		rd.forward(request, response);   //일반적인 페이지 제공하는방법은 forward , forward를 사용하면 주소는 그대로 인데 내용이 바뀌어서 보임
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 로그인 처리와 메인페이지 제공
		MemberService ms = new MemberService();
		ms.login(request);
		
		
		// 요청받아서 처리하는것이 서블렛
		
		
		response.sendRedirect("/jsp2"); // 메인페이지 - webapp밑에 있는 index.jsp	
	}

}
