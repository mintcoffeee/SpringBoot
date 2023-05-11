$(function(){
	$('#deleteIdBtn').on("click", function(){
		$('#resultDiv').empty();
		
		$.ajax({
			type: 'post',
			url: '/user/getUser',
			data: 'id=' + $('#deleteId').val(),
			success: function(data) {
				//Optional<UserDTO> 값이 있으면 JSON 으로 오고 없으면 null로 온다.
				console.log(JSON.stringify(data));
				
			   if(data == null){
	                $('#resultDiv').text('수정 할 아이디가 없습니다');
	                $('#resultDiv').css('color', 'red').css('font-weight', 'bold'); 
            	}else{
					//삭제
					if(confirm('정말로 삭제하시겠습니까?')){
						$.post("/user/delete", 'id='+$('#deleteId').val(), function(){
						alert("삭제완료");
						location.href="/user/list";
						})
					}
	               
					
					
        		}
			},
			error: function(err){console.log(err)}
			
		});
	});
});
