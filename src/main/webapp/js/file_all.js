/*新建文件夹*/
$(document).ready(function() {
	var count = $("#list").length; /*已有文件个数 ，已加载文件个数*/

	$("#create").bind("click", function(){		
		  msg=  "<dd class='g-clearfix list-view-item'id='newfile'>" +
			    "<input name='file' class='my_checkbox' type='checkbox'/>" +
				"<div class='fileicon fileicon-small-file'></div>" +
				"<div class='file-name'style='width:60%'>" +
				"<div class='text'>" +
				"<a class='filename' id='OrderTime' >新建文件夹</a>" +
				"<input type='text' id='OrderTimeInput' style='display:none;height:25px;width:150px; solid #369'/>" +
				"<button id='timeChangeOK' type='button' class='btn btn-default btn-xs ' style='display:none'>" +
				"<span class='glyphicon glyphicon-ok'></span></button>" +
				"<button id='timeChangeRemove' type='button' class='btn btn-default btn-xs' style='display:none'>" +
				"<span class='glyphicon glyphicon-remove'></span></button>" +
				"</div>" +
				"<div class='operate'>" +
				"<div class='g-button sharebutton' href='javascipt:void(0);'>" +
				"<span class='g-button-right'>" +
				"<em class='icon icon-share-blue' title='分享'></em>" +
				"</span>" +
				"</div>" +
				"<a class='g-button'>" +
				"<span class='g-button-right'>" +
				"<em class='icon icon-download-blue' title='下载'></em>" +
				"</span>" +
				"</a>" +
				"<div class='g-button' href='javascipt:void(0);'>" +
				"<span class='g-button-right'>" +
				"<em class='icon icon-gengduo-blue gengduo-button1' title='更多'>" +
				"</em>" +
				"</span>" +
				"<span style='width: 64px; display:none;' class='menu'>" +
				"<span data-menu-id='b-menu5' data-excludedir='apps,来自PC的备份文件,百度云收藏' class='g-button-menu rename' href='javascript:void(0);'>重命名</span>" +
				"<span data-menu-id='b-menu6' data-excludedir='apps,来自PC的备份文件,百度云收藏' class='g-button-menu deletebutton' href='javascript:void(0);'>删除</span>" +
				"</span>" +
                "</div>" +
				"</div>" +
				"</div>" +
				"<div class='file-size' style='width:16%' id = 'size'></div>" +				
				"<div class='ctime' style='width:23%' id='nowTime'></div>" +
				"</dd>";
		
		
		$("#list").before(msg); 
		
		$("#list")
		var spanValue = $("#OrderTime").text();
		
        $("#OrderTimeInput").val(spanValue);
        $("#OrderTimeInput").show();
        $("#OrderTime").hide();
        $("#changeOrderTime").hide();
        $("#timeChangeOK").show();
        $("#timeChangeRemove").show();
        
        $("#create").attr("disabled","false"); /*按钮点击啊无效*/
            
        $("#timeChangeOK").click(function(){       	
            var inputValue = $("#OrderTimeInput").val();
            $("#OrderTime").text(inputValue);
            $("#OrderTimeInput").hide();
            $("#OrderTime").show();           
            $("#changeOrderTime").show();
            $("#timeChangeOK").hide();
            $("#timeChangeRemove").hide();    
            /* 新建时间*/
            str='';
            str +=new Date().getFullYear()+'-'; //获取当前年份 
            str +='0'+ (new Date().getMonth()+1) +'-'; //获取当前月份（0——11） 
            str +=new Date().getDate()+' '; 
            str +=new Date().getHours()+':'; //获取当前年份 
            str +=new Date().getMinutes(); //获取当前月份（0——11）                  
            var createtime = str;
            $('#nowTime').text(createtime);
            $('#size').text("-");
            
            $("#create").removeAttr("disabled");
            
        });
        
        $("#timeChangeRemove").click(function(){
            var inputValue = $("#OrderTime").text();
            $("#OrderTime").text(inputValue);
            $("#OrderTimeInput").hide();
            $("#OrderTime").show();
            $("#changeOrderTime").show();
            $("#timeChangeOK").hide();
            $("#timeChangeRemove").hide();        
            $("#newfile").remove(); 
            
            $("#create").removeAttr("disabled");
            
        });
		
             
	}); 
 
});

$(document).on("click",".gengduo-button",function(){
	if($(this).hasClass("open"))
	{
		$(".menu").css("display","none");
		$(this).removeClass("open");
	}else{
		$(".menu").css("display","block");
		$(this).addClass("open");
	}
	
});
/*全部文件页面全选*/

$("input[name='select_all_file']").change(function() {
	if($("input[name='select_all_file']").is(":checked"))
	{
		var count = 0;
		$("input[name='file']").parent().addClass("item_active");
		$("input[name='file']").css("display","block");
		$("input[name='file']").prop("checked",true);
		$("input[name='file']").each(function(){
			count++;
		});
		$('.count').val(count);
		$('.count-tips').text("已选中"+count+"个文件/文件夹");
	}else{
		$(".img_checkbox").css("display","none");
		$("input[name='file']").prop("checked",false);
		$("input[name='file']").parent().removeClass("item_active");
		$('.count').val(0);
		$('.count-tips').text("已选中0个文件/文件夹");
	}		
		
});


/*全部文档页面全选*/
$("input[name='select_all_document']").change(function() {
	if($("input[name='select_all_document']").is(":checked"))
	{
		var count = 0;
		$("input[name='document']").parent().addClass("item_active");
		$("input[name='document']").css("display","block");
		$("input[name='document']").prop("checked",true);
		$("input[name='document']").each(function(){
			count++;
		});
		$('.count').val(count);
		$('.count-tips').text("已选中"+count+"个文件/文件夹");
	}else{
		$(".img_checkbox").css("display","none");
		$("input[name='document']").prop("checked",false);
		$("input[name='document']").parent().removeClass("item_active");
		$('.count').val(0);
		$('.count-tips').text("已选中0个文件/文件夹");
	}		
		
});

/*其他文件页面全选*/
$("input[name='select_all_other']").change(function() {
	if($("input[name='select_all_other']").is(":checked"))
	{
		var count = 0;
		$("input[name='other']").parent().addClass("item_active");
		$("input[name='other']").css("display","block");
		$("input[name='other']").prop("checked",true);
		$("input[name='other']").each(function(){
			count++;
		});
		$('.count').val(count);
		$('.count-tips').text("已选中"+count+"个文件/文件夹");
	}else{
		$(".img_checkbox").css("display","none");
		$("input[name='other']").prop("checked",false);
		$("input[name='other']").parent().removeClass("item_active");
		$('.count').val(0);
		$('.count-tips').text("已选中0个文件/文件夹");
	}		
		
});

/*全部文件，全部文档，其他文件三个页面的更多按钮*/
$(document).on("click",".gengduo-button1",function(){
	if($(this).hasClass("open"))
	{
		$(".menu").css("display","none");
		$(this).removeClass("open");
	}else{
		$(".menu").css("display","block");
		$(this).addClass("open");
	}
	
});

$(document).on("mouseover",".g-button-menu",function(){
	$(this).css("background-color","#e4eefe");
});
$(document).on("mouseout",".g-button-menu",function(){
	$(this).css("background-color","#fff");
});


/*文件重命名*/
$(document).on("click",".rename",function(){
	var spanValue = $("#FileName").text();
	
    $("#FileNameInput").val(spanValue);
    $("#FileNameInput").show();
    $("#FileName").hide();   
    $("#ChangeOK").show();
    $("#ChangeRemove").show();
          
    $("#ChangeOK").click(function(){       	
        var inputValue = $("#FileNameInput").val();
        $("#FileName").text(inputValue);
        $("#FileNameInput").hide();
        $("#FileName").show();                 
        $("#ChangeOK").hide();
        $("#ChangeRemove").hide();                
    });
    
    $("#ChangeRemove").click(function(){
        var inputValue = $("#FileName").text();
        $("#FileName").text(inputValue);
        $("#FileNameInput").hide();
        $("#FileName").show();        
        $("#ChangeOK").hide();
        $("#ChangeRemove").hide();                 
    });
	
});


/*打开文件夹*/
	$("a[class='filename']").click(function(){		
//		var $span = $('div.module-history-list span');
//		$span.hide();
/*		$("#allfile").hide();
		$("#allfilecount").hide(); 
		$("#breadcrumb").show();*/
		var msg= "<dd class='g-clearfix list-view-item'id='newfile'>" +
	    "<input name='file' class='my_checkbox' type='checkbox'/>" +
		"<div class='fileicon fileicon-small-word'></div>" +
		"<div class='file-name'style='width:60%'>" +
		"<div class='text'>" +
		"<a class='filename' id='OrderTime' > PS培训课用到的快捷键.docx</a>" +
		"<input type='text' id='OrderTimeInput' style='display:none;height:25px;width:150px; solid #369'/>" +
		"<button id='timeChangeOK' type='button' class='btn btn-default btn-xs ' style='display:none'>" +
		"<span class='glyphicon glyphicon-ok'></span></button>" +
		"<button id='timeChangeRemove' type='button' class='btn btn-default btn-xs' style='display:none'>" +
		"<span class='glyphicon glyphicon-remove'></span></button>" +
		"</div>" +
		"<div class='operate'>" +
		"<div class='g-button sharebutton' href='javascipt:void(0);'>" +
		"<span class='g-button-right'>" +
		"<em class='icon icon-share-blue' title='分享'></em>" +
		"</span>" +
		"</div>" +
		"<a class='g-button'>" +
		"<span class='g-button-right'>" +
		"<em class='icon icon-download-blue' title='下载'></em>" +
		"</span>" +
		"</a>" +
		"<div class='g-button' href='javascipt:void(0);'>" +
		"<span class='g-button-right'>" +
		"<em class='icon icon-gengduo-blue gengduo-button1' title='更多'>" +
		"</em>" +
		"</span>" +
		"<span style='width: 64px; display:none;' class='menu'>" +
		"<span data-menu-id='b-menu5' data-excludedir='apps,来自PC的备份文件,百度云收藏' class='g-button-menu rename' href='javascript:void(0);'>重命名</span>" +
		"<span data-menu-id='b-menu6' data-excludedir='apps,来自PC的备份文件,百度云收藏' class='g-button-menu deletebutton' href='javascript:void(0);'>删除</span>" +
		"</span>" +
        "</div>" +
		"</div>" +
		"</div>" +
		"<div class='file-size' style='width:16%'>200K</div>" +				
		"<div class='ctime' style='width:23%'>2016-05-06 17:16</div>" +
		"</dd>";
		
		$("#list").empty();
		$("#list").append(msg);
		$("#allfile").hide();
		$("#allfilecount").hide(); 
		$("#breadcrumb").show();
		/*$("#openfilename").val();*/
		
		
	});






