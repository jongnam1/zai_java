<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>LOVE</title>

<link rel="icon" href="./static/images/cats.ico"> <%-- 웹 앱기준 파일경로 --%> 
<link rel="stylesheet" href="./static/css/default.css">
</head>

<body>
   <div id="wrap">

      <%@ include file="./header.jsp" %><%-- <- 여기에 header.jsp 태그가 들어옴 --%> 
      
      <div id="main">
          <div id="slide-wrap">
             <div class="slide-img">
                <img src="https://picsum.photos/1000/400?random=1">
             </div>
          </div>
          
          <div id="content-wrap">
          <img src="https://picsum.photos/300/300?random=2">
          <img src="https://picsum.photos/300/300?random=3">
          <img src="https://picsum.photos/300/300?random=4">
          <img src="https://picsum.photos/300/300?random=5">
          <img src="https://picsum.photos/300/300?random=6">
          <img src="https://picsum.photos/300/300?random=7">
          <img src="https://picsum.photos/300/300?random=8">
          <img src="https://picsum.photos/300/300?random=9">
          <img src="https://picsum.photos/300/300?random=10">
              <img src = "">
          </div>
         
      </div>
      
      <%@ include file="./footer.jsp" %> <%--<- 여기에 footer.jsp 태그가 들어옴 --%>
    </div>
</body>
</html>




