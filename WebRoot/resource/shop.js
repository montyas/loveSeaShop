function validate() {
	$("#shopForm").validate({
		rules : {
			detail_url : {
				required : true,
				url : true
			}
		},
		messages : {
			detail_url : {
				required :"请输入商品地址",
				url : "请输入合法的网址"
			}
		}
	});
}

function shopForm(){
	validate();
	var opt = {
		url : './url',
		dataType : 'json',
		success : function(data) {
		},
		error : function(data) {
			var url="http://localhost:9082/ls/shop?"+data.responseText;
			//var url= 'http://push.bibwap.com/ls/shop?'+data.responseText;
			  $.ajax({
					type: "post",
					url:url,
					contentType:"application/json; charset=utf-8",
					dataType:"json",
					success:function(data){
						var location=data.location;
						var valid_thru=data.valid_thru;
						var modified=data.modified;
						var discount=data.discount;
						var created=data.created;
						$('#valid_thru').html(valid_thru);
						$('#modified').html(modified);
						$('#discount').html(discount);
						$('#created').html(created);
						var detail_url = data.detail_url;
						var num = data.num;
						var title = data.title;
						var starts = data.starts;
						var ends = data.ends;
						var price = data.price;
						var totalSQ = data.totalSQ;
						var pic_url = data.pic_url;
						var href="<a href="+detail_url+" target='_blank' title='查看'>"+title+"</a>";
						var seller='http://shop'+data.sid+'.taobao.com';
						var nick="<a href="+seller+" target='_blank' title='进入店铺'>"+data.nick+"</a>";
						$('#nick').html(nick);
						$('#location').html(location);
						$('#title').html(href);
						$('#totalSQ').html(totalSQ);
						$('#num').html(num);
						$('#starts').html(starts);
						$('#ends').html(ends);
						$('#price').html(price);
						$('#imgs').attr('src',pic_url);
					}
				});
			}
		};
		$('#shopForm').ajaxForm(opt);
}