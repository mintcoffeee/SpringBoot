<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>
	<a href="/">
		<img src="http://localhost:8080//image/apeach.gif" alt="apeach" width="50" height="50"
			style="cursor:pointer;">
		수정
	</a>
</h3>
<p>
	수정할 아이디 입력<input type="text" id="searchId" placeholder="아이디를 입력하세요" >
	<input type="button" id="searchIdBtn" value="검색">
</p>
<div id="resultDiv"></div>
<%-- <div id="updateDiv"></div> --%>



<script type="text/javascript" src="http://code.jquery.com/jquery-3.6.4.min.js"></script>
<script type="text/javascript" src="/js/update.js"></script>
<script type="text/javascript" src="/js/write.js"></script>
</body>
</html>