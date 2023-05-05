<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form id="wirteForm">
	<table border="1" cellpadding="5" cellspacing="0">
		<tr>
			<th>이름</th>
			<td><input type="text" name="name" class=""></td>
		</tr>
		<tr>
			<th>나이</th>
			<td><input type="text" name="age" class=""></td>
		</tr>
		<tr>
			<td colspan="2">
				<img id="showImg" name="" width="60" height="60">
				<img id="camera" src="/image/camera.png" alt="camera" width="30" height="30">
				<input type="file" name="img" id="img" style="visibility: hidden;">
			</td>
		</tr>
		<tr>
			<td colspan="2" align="center">
			<input type="button" id="writeBtn" class="" value="submit">
			<input type="reset" class="" value="cancel">
			</td>
		</tr>
	</table>
</form>
<script type="text/javascript" src="http://code.jquery.com/jquery-3.6.4.min.js"></script>
<script type="text/javascript" src="/js/write.js"></script>
<script type="text/javascript">
$('#camera').click(function(){
	//카메라 이미지를 누르면 강제 이벤트 발생 
	$('#img').trigger('click');
});
<!-- 업로드 버튼을 누르기 전에 카메라 아이콘을 통해서 선택한 이미지가 맞는지 확인하기위해서 이미지를 보이게 한다. -->
$('#img').change(function(){
	readURL(this);
});

function readURL(input){
	var reader = new FileReader();
	
	reader.onload = function(e){
		$('#showImg').attr('src', e.target.result);	//e.target - 이벤트가 발생하는 요소를 반환해준다.
	};
	
	reader.readAsDataURL(input.files[0]);
}
</script>

</body>
</html>