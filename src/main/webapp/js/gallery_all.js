
$("input[name='select_all_gallery']").change(function() {
	if($("input[name='select_all_gallery']").is(":checked"))
	{
		var count = 0;
		$("input[name='gallery']").parent().addClass("item_active");
		$("input[name='gallery']").css("display","block");
		$("input[name='gallery']").prop("checked",true);
		$("input[name='gallery']").each(function(){
			count++;
		});
		$('.count').val(count);
		$('.count-tips').text("已选中"+count+"个文件/文件夹");
	}else{
		$(".img_checkbox").css("display","none");
		$("input[name='gallery']").prop("checked",false);
		$("input[name='gallery']").parent().removeClass("item_active");
		$('.count').val(0);
		$('.count-tips').text("已选中0个文件/文件夹");
	}		
		
});

$("input[name='select_all_video']").change(function() {
	if($("input[name='select_all_video']").is(":checked"))
	{
		var count = 0;
		$("input[name='video']").parent().addClass("item_active");
		$("input[name='video']").css("display","block");
		$("input[name='video']").prop("checked",true);
		$("input[name='video']").each(function(){
			count++;
		});
		$('.count').val(count);
		$('.count-tips').text("已选中"+count+"个文件/文件夹");
	}else{
		$(".img_checkbox").css("display","none");
		$("input[name='video']").prop("checked",false);
		$("input[name='video']").parent().removeClass("item_active");
		$('.count').val(0);
		$('.count-tips').text("已选中0个文件/文件夹");

	}		
		
});

$("input[name='select_all_music']").change(function() {
	if($("input[name='select_all_music']").is(":checked"))
	{
		var count = 0;
		$("input[name='music']").parent().addClass("item_active");
		$("input[name='music']").css("display","block");
		$("input[name='music']").prop("checked",true);
		$("input[name='video']").each(function(){
			count++;
		});
		$('.count').val(count);
		$('.count-tips').text("已选中"+count+"个文件/文件夹");
	}else{
		$(".img_checkbox").css("display","none");
		$("input[name='music']").prop("checked",false);
		$("input[name='music']").parent().removeClass("item_active");
		$('.count').val(0);
		$('.count-tips').text("已选中0个文件/文件夹");

	}		
		
});
