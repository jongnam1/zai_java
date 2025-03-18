<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 가입</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.3/font/bootstrap-icons.min.css">

<link rel="icon" href="http://localhost:8080/jsp2/static/images/cats.ico"> 
<link rel="stylesheet" href="http://localhost:8080/jsp2/static/css/default.css">

<link rel="stylesheet" href="<%=path %>/static/css/signUp.css">
<script src="<%=path %>static/javascript/signUp.js"></script>

</head>
<body>
   <div id="wrap">
     <%@ include file="../header.jsp" %> <%--../ 뒤로가는것 --%> 
     
     
     
     <%@ include file="../footer.jsp" %>
     </div>

</body>
</html>