<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.SQLException"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>    
<%@ page import ="java.sql.Connection" %>    
<%@ page import = "java.sql.Statement" %>    
    
    
    <%  String myId = request.getParameter("id"); %>
    <%  String pw = request.getParameter("pw"); %>
    <%  String birth = request.getParameter("birth" ); %>
    <%  String email = request.getParameter("email"); %>
    
   <%
    // 데이터베이스 저장하기 - 하지만 아이디가 중복이면 저장안함
    
    Connection conn=null;
    try{
    Class.forName("com.mysql.cj.jdbc.Driver");
    
     String user = "project";
     String password= "1234";
     String url="jdbc:mysql://localhost:3306/project";
     conn = DriverManager.getConnection(url,user,password);
     
    }catch(Exception e){
     System.out.println("드라이버 로드 및 실패");
     e.printStackTrace();
    }

    //회원가입양식에 입력한 내용을 테이블에 저장 할것이다.
    // 그전에 아이디 중복 확인 
    ResultSet rs =null;
    Statement st = null;
    
    String sql = "select * from member1 where member_id='"+myId+"'";
    try{
    	
    	st= conn.createStatement();
    	rs = st.executeQuery(sql);
    	if( rs.next() ) {// 참이면 아이디가 중복이라는 뜻이고, 거짓이라면 중복아니다.
    	  // 아이디가 중복이라면 회원가입 다시 하게 해줄것
    	  // 다시 회원가입 양식 페이지로 이동해야한다
    	  // 이동시키는 방법으로 javascript 또는 내장객체를 사용하는 방법이 있다.
    	  %>
    	    <script>//alert("아이디가 중복");//history.back(); // 기록이 남아있는것
    	   // location.href="main.jsp";  //<-새로 페이지 열리는것
    	    </script>
    	  <%
    	  response.sendRedirect("main.jsp"); // 새 페이지 여는것
    	  return;
    	  }
    	
    }catch(Exception a){
    	System.out.println("아이디 중복 확인 조회 실패");
    }
    
    
    // 아이디 중복이 아니니까 회원가입 내용 테이블에 저장 시키기
    
    
    PreparedStatement pt = null;
    
    sql= "insert into member1(member_id, email, password, birth))"+
          "values(?,?,?,?)";
    try{
    	
    	pt = conn.prepareStatement(sql);
    	pt.setString(1, myId);
    	pt.setString(2, email);
    	pt.setString(3, pw);
    	pt.setString(4, birth);
    	pt.executeUpdate(); //쿼리문과 채워진 데이터를 보내기
    	
    	
    }catch(SQLException e){
    	System.out.println("회원가입 테이블 저장 실패");
    	e.printStackTrace();
    }
    
    
    %>
   %> 
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
        <h2> 회원가입 완료</h2>
        <h3> 회원 가입 내용</h3>
        <ul>
           <li>아이디 : <%=myId %></li>
           <li>비밀번호 : <%=pw %> </li>
           <li>생년월일 : <%=birth %></li>
           <li>이메일 : <%=email %></li>
        
        </ul>

        <a href="main.jsp">Home</a>
</body>
</html>




