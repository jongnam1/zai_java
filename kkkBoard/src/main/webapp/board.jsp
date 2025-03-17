<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 <div id="board">
 <h2>게시판</h2>
 <form method="post" action ="board"></form>
          <input type="text" value="제목" id="Title" placeholder="제목을 입력하세요">
          <input type="text" value="작성자" id = "user" >
           <input type="memo" value="내용" id = "Contents">
           <input type="date" value="작성일" id = "joinOn">
 <input type="button" value="등록">
      </div>



</body>
</html>