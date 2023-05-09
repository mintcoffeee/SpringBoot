$(function(){
	$.ajax({
		type: 'post',
		url: '/user/getUserList',
		success: function(data){
			let html;
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