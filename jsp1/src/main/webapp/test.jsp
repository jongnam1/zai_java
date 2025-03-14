<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  자바코드 사용법 , 자바쪽 코드가 먼저 실행됨
                 서버우선 그다음 클라이언트
    <%!
    //선언문 - 변수, 메서드선언, 클래스 정의
    
    int age = 0;
    int[] arr = new int[] {10,20,30,40,50,60};
    %>
    <%
    // 스크립틀릿
    age = 25;
    
    %>
         <%-- jsp주석 --%>  
    <%=
    age
    %>   <- 표현식, 출력용
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1> <%=age%></h1>

<ul>
     <%
         for(int i=0; i<arr.length; i++) {
        	/*out.print("<li>"+arr[i]+"</li>"); */
     %>
         <li> <%= arr[i] %> </li>
         <% }%>
</ul>      
    
    
</body>
</html>