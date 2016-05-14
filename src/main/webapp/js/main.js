jQuery(function($) {'use strict',

	//#main-slider
	$(function(){
		$('#main-slider.carousel').carousel({
			interval: 8000
		});
	});


	// accordian
	$('.accordion-toggle').on('click', function(){
		$(this).closest('.panel-group').children().each(function(){
		$(this).find('>.panel-heading').removeClass('active');
		 });

	 	$(this).closest('.panel-heading').toggleClass('active');
	});

	//Initiat WOW JS
	new WOW().init();

	// portfolio filter
	$(window).load(function(){'use strict';
		var $portfolio_selectors = $('.portfolio-filter >li>a');
		var $portfolio = $('.portfolio-items');
		$portfolio.isotope({
			itemSelector : '.portfolio-item',
			layoutMode : 'fitRows'
		});
		
		$portfolio_selectors.on('click', function(){
			$portfolio_selectors.removeClass('active');
			$(this).addClass('active');
			var selector = $(this).attr('data-filter');
			$portfolio.isotope({ filter: selector });
			return false;
		});
	});

	// Contact form
	var form = $('#main-contact-form');
	form.submit(function(event){
		event.preventDefault();
		var form_status = $('<div class="form_status"></div>');
		$.ajax({
			url: $(this).attr('action'),

			beforeSend: function(){
				form.prepend( form_status.html('<p><i class="fa fa-spinner fa-spin"></i> Email is sending...</p>').fadeIn() );
			}
		}).done(function(data){
			form_status.html('<p class="text-success">' + data.message + '</p>').delay(3000).fadeOut();
		});
	});

	
	//goto top
	$('.gototop').click(function(event) {
		event.preventDefault();
		$('html, body').animate({
			scrollTop: $("body").offset().top
		}, 500);
	});	

	//Pretty Photo
	$("a[rel^='prettyPhoto']").prettyPhoto({
		social_tools: false
	});

	$('.img_box').mouseover(function(){
		$(this).addClass("moveover_img_box");
		$(this).find(".img_checkbox").css("display","block");
		$(this).find(".playIcon").css("display","block");
    }).mouseout( function(){
        $(this).removeClass("moveover_img_box");
		if($(this).hasClass("item_active")){
			//Do nothing.
		}else{
			$(this).find(".img_checkbox").hide();
		}
		$(this).find(".playIcon").css("display","none");
     });
	 
	$('.img_checkbox').click(function() {
		
		$(this).parent().addClass("item_active");
	});

	$('.img_checkbox').change(function() {
		if($(this).is(":checked"))
		{
			var count = parseInt($('.count').val())+1;
			$('.count').val(count);
			$('.count-tips').text("已选中"+count+"个文件/文件夹");
		}else{
			$(this).css("display","none");
			$(this).parent().removeClass("item_active");
			var count = parseInt($('.count').val())-1;
			$('.count').val(count);
			$('.count-tips').text("已选中"+count+"个文件/文件夹");

		}
		
	});
	
/*	$('.img_checkbox').toggle(function(){
        $(this).css({"display":"block","background-position":"-30px -36px"});
		$(this).parent().addClass("item_active");
		alert("添加啊");
    },function(){
		$(this).css("display","none");
		$(this).parent().removeClass("item_active");
		alert("添加啊试试");
    });*/
	
	$(document).on("click",".sharebutton",function(){
		$("#share").css("display","block");
	});
	$(document).on("click",".deletebutton",function(){
		$("#confirm").css("display","block");
	});
	/*$('.sharebutton').click(function() {
		$("#share").css("display","block");
	});*/
	
	$('.share-close').click(function() {
		$("#share").css("display","none");
	});
	
	/*$('.deletebutton').click(function() {
		$("#confirm").css("display","block");
	});*/
	
	$('.confirm-close').click(function() {
		$("#confirm").css("display","none");
	});
	/*music_all.html*/
	$('.my_checkbox').click(function() {
		//$(this).css({"display":"block","background-position":"-31px 12px"});
		$(this).parent().addClass("item_active");
	});
	$('.my_checkbox').change(function() {
		if($(this).is(":checked")){
			var count = parseInt($('.count').val())+1;
			$('.count').val(count);
			$('.count-tips').text("已选中"+count+"个文件/文件夹");
		}else{
			var count = parseInt($('.count').val())-1;
			$('.count').val(count);
			$('.count-tips').text("已选中"+count+"个文件/文件夹");

		}
	});
	
	$(document).on("mouseover",".list-view-item",function(){
		$(this).addClass("hover-item");
		$(this).find(".operate").css("display","block");
	});
	$(document).on("mouseout",".list-view-item",function(){
		$(this).removeClass("hover-item");
		$(this).find(".operate").css("display","none");
	});
	/*$('.list-view-item').mouseover(function(){
		$(this).addClass("hover-item");
		$(this).find(".operate").css("display","block");
    }).mouseout( function(){
        $(this).removeClass("hover-item");
		$(this).find(".operate").css("display","none");
    });*/
	/*video_all.html*/
	$('.list-switch').click(function() {
		$(this).css("background-position","0 0");
		$(this).siblings(".grid-switch").css("background-position","right 0");
		$(".grid-view-container").css("display","none");
		$(".list-view-container").css("display","block");
	});
	$('.grid-switch').click(function() {
		$(this).css("background-position","right -35px");
		$(this).siblings(".list-switch").css("background-position","0 -35px");
		$(".grid-view-container").css("display","block");
		$(".list-view-container").css("display","none");
	});
	/*recycle_bin.html*/
	$('.restore_button').click(function() {
		$("#restore_conform").css("display","block");
	});
	
	$('.restore_confirm_close').click(function() {
		$("#restore_conform").css("display","none");
	});
	
	$('.final_deletebutton').click(function() {
		$("#final_delete_confirm").css("display","block");
	});
	
	$('.final_delete_confirm_close').click(function() {
		$("#final_delete_confirm").css("display","none");
	});
	
	$('.deletebutton1').click(function() {
		$("#confirm").css("display","block");
	});

	$('.share-link').click(function() {
		$(this).addClass("current");
		$(this).siblings().removeClass("current");
		$("#share-link").css("display","block");
		$("#share-link").siblings().css("display","none");
		$(".share-btn").css("display","none");
	});

	$('.share-friend').click(function() {
		$(this).addClass("current");
		$(this).siblings().removeClass("current");
		$("#share-friend").css("display","block");
		$("#share-friend").siblings().css("display","none");
		$(".share-btn").css("display","block");
	});

	$('.share-mail').click(function() {
		$(this).addClass("current");
		$(this).siblings().removeClass("current");
		$("#share-mail").css("display","block");
		$("#share-mail").siblings().css("display","none");
		$(".share-btn").css("display","block");
	});

	$('.zhankai').click(function() {
		if($(this).parent().hasClass("open"))
		{
			$(this).parent().removeClass("open");
			$(this).siblings().css("display","none");
		}else {
			$(this).parent().addClass("open");
			$(this).siblings().css("display","block");
		}
	});

	$('.select-label').click(function() {
		if($(this).hasClass("mylabel-on"))
		{
			$(this).removeClass("mylabel-on");
			$(this).css("background-position","0 0");
			$(".select-list li").remove("li[data-uniqueid='4014555837']");
			if($(".select-list > li").length ==0)
		{
			$(".global-center").css("display","block");
		}
		}else {
			$(this).addClass("mylabel-on");
			$(this).css("background-position","0 -20px");
			$(".select-list").append('<li data-uniqueid="4014555837" data-groupid="2,0" class="item">'
												+'<div class="label-box" node-type="labelBox">'
													+'<div class="mylabel label-dis"></div>'
												+'</div>'
												+'<div class="uinfo g-clearfix" title="侯立华">'
													+'<img src="http://himg.bdimg.com/sys/portrait/item/0cef624d.jpg" class="avatar" height="23" width="23">'
													+'<span class="uname">'
													+'侯立华'
													+'</span>'
												+'</div>'
											+'</li>');
			$(".global-center").css("display","none");
		}
	});

	$(document).on("click",".label-dis",function(){
		$(this).parent().parent().remove();
		if($(".select-list > li").length ==0)
		{
			$(".global-center").css("display","block");
		}
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

	$(document).on("mouseover",".g-button-menu",function(){
		$(this).css("background-color","#e4eefe");
	});
	$(document).on("mouseout",".g-button-menu",function(){
		$(this).css("background-color","#fff");
	});
});