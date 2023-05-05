$(function(){
	$.ajax({
		type: 'post',
		url: '/person/getPersonlist',
		success: function(data){
			console.log(JSON.stringify(data))
			let html;
			/*
			$.each(data, function(index, items){
				console.log(items.photo);
				html += "<tr>" +
					"<td>"+
					items.seq+
					"</td>"+
					"<td>" +
					"<img src='/storage/"+
					items.photo +
					"' width='50' height='50'>" +
					"</td>"+
					"<td>" +
					items.name +
					"</td>" +
					"<td>" +
					items.age +
					"</td>" +
					"</tr>"
			});
			*/
			for(var i=0; i<data.length; i++){
				html += `<tr>
						 <td>${data[i].seq}</td>
						 <td><img src="/storage/${data[i].photo}" width='50' height='50'></td>
						 <td>${data[i].name} </td> 
						 <td>${data[i].age}</td> 
						 </tr>`
			}
			$('#userListTable').append(html);
		},
		err: function(err){console.log(err)}
	});
});