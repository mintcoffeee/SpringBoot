$(function() {
	$('#writeBtn').click(function(){
		var formData = new FormData($('#wirteForm')[0]);
		
		$.ajax({
			type:'post',
			url:'/person/write',
			data:formData,
			enctype:'multipart/form-data',
			processData: false,
			contentType: false,
			success: function(){
				alert('가입 완료');
			},
			err : function(err){ console.log(err)}
		});
	});
});