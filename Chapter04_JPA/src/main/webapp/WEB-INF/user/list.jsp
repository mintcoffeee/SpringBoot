<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
#currentPaging {
	color: red;
	text-decoration: underline;
	cursor: pointer;
}
#paging { 
	color: black;
	text-decoration: none;
	cursor: pointer;
}
#userPagingDiv {
	/* border: 1px solid red; */
	text-align: center;
	margin-top: 5px;
	width:456px;
}
#userPagingDiv span#paging, span#currentPaging {
	display: inline-block;
	width: 20px;
	height: 20px;
}
#userListTable tr td {
	text-align: center;
}
</style>
</head>
<body>
<h3>
	<a href="/">
		<img src="http://localhost:8080//image/apeach.gif" alt="apeach" width="50" height="50"
			style="cursor:pointer;">
		목록
	</a>
</h3>
<table id="userListTable" border="1" frame="hsides" rules="rows">
	<tr>
		<th width="150">이름</th>
		<th width="150">아이디</th>
		<th width="150">비밀번호</th>
	</tr>
	
	<%-- 동적할당 --%>
</table>
<br><br>

<div style="width: 450px; text-align:center;">
	<form id="searchForm">
		<select id="searchOption" name="searchOption">
			<option value="name">이름</option>
			<option value="id">아이디</option>
		</select>
		<input type="text" id="keyword" name="keyword"/>
		<input type="button" id="searchBtn" value="검색"/>
	</form>
</div>
<script type="text/javascript" src="http://code.jquery.com/jquery-3.6.4.min.js"></script>
<script type="text/javascript" src="../js/list.js"></script>
</body>
</html>