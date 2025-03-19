<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title> 게시판 </title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.3/font/bootstrap-icons.min.css">

<link rel="icon" href="http://localhost:8080/jsp2/static/images/loveicon.ico">
<link rel="stylesheet" href="http://localhost:8080/jsp2/static/css/default.css">

<style>
	#main{
		padding:30px 100px;
		position:relative;
	}
	#boardTop{
		position:relative;
		width:100%;
		font-size:20px;
		text-align:center;
	}
	#boardTop .write-bt{
		position:absolute;
		top:0;  right:0;
	}
	#boardList{
		width:100%;
		margin:20px 0;
	}
	#boardList .list-table{
		width:100%;
		border-collapse: collapse;
	}
	#boardList .list-table td{
		border-bottom:1px solid #ccc;
		padding:15px 0;
		font-size:17px;
	}
	#boardList .list-table .num{ width:10%;}
	#boardList .list-table .title{ width:40%;}
	#boardList .list-table .writer{ width:25%;}
	#boardList .list-table .date{ width:25%;}
	
	#boardList .list-table tr:nth-child(odd){ /* odd 홀수 , even 짝수*/
		background:#eee;
	}
	
</style>

</head>
<body>
	
	<div id="wrap">
		<%@ include file="../header.jsp" %>
	                     
	    <div id="main">
	    	<div id="boardTop">
	    		<b>러브가 무엇이오</b>
	    		<a href="/jsp2/board/write" class="write-bt">글쓰기</a>
	    	</div>
	    	<div id="boardList">
	    		<table class="list-table">
	    			<thead>
	    				<tr>
	    					<th class="num">번호</th>
	    					<th class="title">제목</th>
	    					<th class="writer">작성자</th>
	    					<th class="date">작성일</th>
	    				</tr>
	    			</thead>
	    			<tbody>
	    				
	    				<tr>
	    					<td class="num"></td>
	    					<td class="title"></td>
	    					<td class="writer"></td>
	    					<td class="date"></td>
	    				</tr>	    				
	    				
	    			</tbody>
	    			
	    		</table>
	    	</div>
	    </div>                 
	                           
		<%@ include file="../footer.jsp" %>
	</div>

</body>
</html>