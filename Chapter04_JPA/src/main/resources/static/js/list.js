//목록
$(function(){
	$.ajax({
		type: 'post',
		url: '/user/getUserList',
		success: function(data){
			let html="";
			for(var i=0; i<data.length; i++){
				html += `<tr>
						 <td>${data[i].name}</td>
						 <td>${data[i].id} </td> 
						 <td>${data[i].pwd}</td> 
						 </tr>`
			}
			$('#userListTable').append(html);
		},
		error: function(err){
			console.log(err);
		}
 	});
});

//검색
$('#searchBtn').on("click",function(){
	if($('#keyword').val() == '')
		alert("검색어를 입력하세")
	else
		$.ajax({
			type: 'post',
			url: '/user/search',
			/*
			data: {
				searchOption : $('#searchOption').val(),
				keyword : $('#keyword').val(),
			},
			*/
			data: $('#searchForm').serialize(),
			dataType: 'json',
			success: function(data){
				console.log(JSON.stringify(data));
				let html ="";
				$('#userListTable tr:gt(0)').remove();
				for(var i=0; i<data.length; i++){
				html += `<tr>
						 <td>${data[i].name}</td>
						 <td>${data[i].id} </td> 
						 <td>${data[i].pwd}</td> 
						 </tr>`
			}
			$('#userListTable').append(html);
				
			},
			error: function(err){console.log(err)}
		});
});
