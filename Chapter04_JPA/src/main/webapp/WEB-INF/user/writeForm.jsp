<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
#writeForm div {
	color: red;
	font-size: 8px;
	font-weight: bold;
}
</style>
</head>
<body>
<h3>
	<a href="/">
		<img src="/image/apeach.gif" alt="apeach" width="50" height="50"
			style="cursor:pointer;">
		등록
	</a>
</h3>
<form id="writeForm">
	<table border="1">
		<tr>
			<th>이름</th>
			<td><input type="text" name="name"></td>
		</tr>
		<tr>
			<th>아이디</th>
			<td>
				<input type="text" name="id" id="id">
				<div id="idDiv"></div>
			</td>
		</tr>
		<tr>
			<th>패스워드</th>
			<td><input type="password" name="pwd"></td>
		</tr>
		<tr>
			<td colspan="2" align="center"> 
				<input type="button" value="등록" id="writeBtn"/>
				<input type="reset" value="취소" />
			</td>
		</tr>
		
	</table>
</form>
<script type="text/javascript" src="http://code.jquery.com/jquery-3.6.4.min.js"></script>
<script type="text/javascript" src="../js/write.js"></script>
</body>
</html>