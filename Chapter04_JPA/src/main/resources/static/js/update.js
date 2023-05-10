$('#searchIdBtn').on("click", function(){
	if($('#searchId').val() == ''){
		$('#resultDiv').text('먼저아이디를 입력').css("font-size","10px").css("color","red");
		$('#searchId').focus();
	} else {
		$.post("/user/getUser", 'id='+$('#searchId').val(), function(data){
			let html="";
			console.log(data);
			$('#resultDiv').css("color","").css("font-size","").empty();
			if(data == null){
				$('#resultDiv').text('수정 할 아이디가 없습니다.').css("font-size","12px").css("color","red");
			} else {
				html = `<form id="writeForm">
							<table border="1">
								<tr>
									<th>이름</th>
									<td><input type="text" name="name" value=${data.name}></td>
								</tr>
								<tr>
									<th>아이디</th>
									<td>
										<input type="text" name="id" id="id" value=${data.id} readonly>
										<div id="idDiv"></div>
									</td>
								</tr>
								<tr>
									<th>패스워드</th>
									<td><input type="password" name="pwd" value=${data.pwd}></td>
								</tr>
								<tr>
									<td colspan="2" align="center"> 
										<input type="button" value="수정" id="writeBtn"/>
										<input type="reset" value="취소" />
									</td>
								</tr>
								
							</table>
						</form>`
				$('#resultDiv').append(html);
			}
		
		});
	}
});


/*
//선생님 풀이
$(function(){
	$('#updateDiv').hide();
	
	$('#searchIdBtn').click(function(){
		$('#resultDiv').empty();
		
		$.ajax({
			type: 'post',
			url: '/user/getUser',
			data: 'id=' + $('#searchId').val(),
			success: function(data) {
				//Optional<UserDTO> 값이 있으면 JSON 으로 오고 없으면 null로 온다.
				console.log(JSON.stringify(data));
				
			   if(data == null){
	                $('#updateDiv').hide(); //수정하려는 없는아이디를 다시 검색하게 될때 기존에 뜬 정보가 사라지게 하는 것 
	                
	                $('#resultDiv').text('수정 할 아이디가 없습니다');
	                $('#resultDiv').css('color', 'red').css('font-weight', 'bold'); 
            	}else{
	                $('#updateDiv').show();
	                
	                $('#name').val(data.name);
	                $('#id').val(data.id);
        		}
			},
			error: function(err){console.log(err)}
			
		});
	});
});
*/

/*
dataType를 생략하면 자료에 맞게 자동으로 형식이 지정된다.

서버에서 받아오는 데이터 타입은 'text', 'html', 'xml', 'json' 형식을 지정할 수 있다
getUser에서 id를 찾으면 제대로 JSON으로 오지만 
id가 없으면 JSON으로 오지를 못한다.
그래서 dataType를 생략해야 한다. 
 
*/


