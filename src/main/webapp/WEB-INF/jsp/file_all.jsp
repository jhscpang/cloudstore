<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">
    <title>网盘主页</title>
    
    <!-- core CSS -->
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/font-awesome.min.css" rel="stylesheet">
    <link href="css/prettyPhoto.css" rel="stylesheet">
    <link href="css/animate.min.css" rel="stylesheet">
    <link href="css/file.css" rel="stylesheet">
    <link href="css/responsive.css" rel="stylesheet">
    <link href="css/gallery_my.css" rel="stylesheet">
    <link href="style/style.css" rel="stylesheet">
    <!--[if lt IE 9]>
    <script src="js/html5shiv.js"></script>
    <script src="js/respond.min.js"></script>
    <![endif]-->       
    <link rel="shortcut icon" href="images/ico/favicon.ico">
    <link rel="apple-touch-icon-precomposed" sizes="144x144" href="images/ico/apple-touch-icon-144-precomposed.png">
    <link rel="apple-touch-icon-precomposed" sizes="114x114" href="images/ico/apple-touch-icon-114-precomposed.png">
    <link rel="apple-touch-icon-precomposed" sizes="72x72" href="images/ico/apple-touch-icon-72-precomposed.png">
    <link rel="apple-touch-icon-precomposed" href="images/ico/apple-touch-icon-57-precomposed.png">
</head><!--/head-->

<body>

    <header id="header">
        <div class="top-bar">
            <div class="container">
                <div class="row">
                    <div class="col-sm-6 col-xs-4">
                        <div class="top-number"><p><i class="fa fa-phone-square"></i>  +0123 456 70 90</p></div>
                    </div>
                    <div class="col-sm-6 col-xs-8">
                       <div class="social">
                            <ul class="social-share">
                                <li><a href="#"><i class="fa fa-facebook"></i></a></li>
                                <li><a href="#"><i class="fa fa-twitter"></i></a></li>
                                <li><a href="#"><i class="fa fa-linkedin"></i></a></li> 
                                <li><a href="#"><i class="fa fa-dribbble"></i></a></li>
                                <li><a href="#"><i class="fa fa-skype"></i></a></li>
                            </ul>
                            <div class="search">
                                <form role="form">
                                    <input type="text" class="search-form" autocomplete="off" placeholder="Search">
                                    <i class="fa fa-search"></i>
                                </form>
                           </div>
                       </div>
                    </div>
                </div>
            </div><!--/.container-->
        </div><!--/.top-bar-->

       <nav class="navbar navbar-inverse" role="banner">
            <div class="container">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand" href="index.html"><img src="images/logo.png" alt="logo"></a>
                </div>
                
                <div class="collapse navbar-collapse navbar-right">
                    <ul class="nav navbar-nav">
                        <li><a href="index.html">主页</a></li>
                        <li class="active"><a href="portfolio.html">网盘</a></li>  
                        <li><a href="share.html">分享</a></li>
                                                               
                        <li class="dropdown">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown">账号中心 <i class="fa fa-angle-down"></i></a>
                            <ul class="dropdown-menu">
                                <li><a href="pricing.html">个人资料</a></li>
                                <li><a href="blog-item.html">购买容量</a></li>                               
                                <li><a href="services.html">会员中心</a></li>                            
                            </ul>
                        </li>                     
                        <li><a href="login.html">登录/注册</a></li>                        
                    </ul>
                </div>
            </div>
        </nav>
        <div class="sidebar"> 
      <div class="s-content">
      <ul id="nav">
      <li> <a href="file_all.html" class="open br-red"><i class="icon-comments"></i><span class="glyphicon glyphicon-home"></span><span style="font-size:18px;"> 全部文件</span></a> </li>
      <li class="has_sub"><a href="gallery_all.html" class="br-blue"><i class="icon-list-alt"></i><span class="glyphicon glyphicon-picture"></span><span style="font-size:16px;"> 图片</span></a>       
      </li>
      <li class="has_sub"><a href="file_document.html" class="br-green"><i class="icon-list-alt"></i><span class="glyphicon glyphicon-file"></span> <span style="font-size:16px;">文档 </span></a>      
      </li>
      <li class="has_sub"><a href="video_all.html" class="br-orange"><i class="icon-comments"></i><span class="glyphicon glyphicon-hd-video"></span> <span style="font-size:16px;">视频</span> </a>        
      </li>
      <!-- <li class="has_sub"><a href="#" class="br-yellow"><i class="icon-comments"></i><span class="glyphicon glyphicon-heart"></span> <span style="font-size:16px;">种子</span> </a>        
      </li> -->
      <li class="has_sub"><a href="music_all.html" class="br-purple"><i class="icon-comments"></i><span class="glyphicon glyphicon-music"></span> <span style="font-size:16px;">音乐</span> </a>       
      </li>
      <li class="has_sub"><a href="file_other.html" class="br-red"><i class="icon-comments"></i><span class="glyphicon glyphicon-list-alt"></span> <span style="font-size:16px;">其他</span> </a>       
      </li>
      <li> <a href="recycle_bin.html" class="open br-red"><i class="icon-comments"></i><span class="glyphicon glyphicon-trash"></span>  <span style="font-size:18px;">回收站</span></a> </li>

    </ul>
    
  </div>
  </div>
    </header><!--/header-->
    <div class="right-content">
			<div class="module-toolbar">
				<div class="default-dom" style="display:block">
				 <form name="test_form" method="post" ENCTYPE="multipart/form-data" onsubmit="alert(document.test_form.browse.value);" >
                <input type="file" name="browse" style="display:none;" /> 
				 <div  style="left: 20px; position: relative; "> 
                <button type="button" class="btn btn-primary btn-xs" style="margin-right:20px;" onclick="fn_browse();"><span class="glyphicon glyphicon-cloud-upload"></span>上传文件</button>                                         
                <button type="button" class="btn btn-primary btn-xs" style="margin-right:20px;" onclick="fn_browse();"><span class="glyphicon glyphicon-cloud-upload"></span>上传文件夹</button>  
                <button type="button" class="btn btn-primary btn-xs" id="create" onclick="createFile();"><span class="glyphicon glyphicon-plus"></span>新建文件夹</button>
      </div></form> </div>
       </div>
       
					<!-- <div class="list-grid-switch list-switched-on">
						<div class="list-switch"></div>
						<div class="grid-switch"></div>
					</div> -->
				</div>
			</div>
    
     <div class="rightBlock">
     <div style="margin-top: 0%;margin-left: 0%; width: 100%">
	 <!--  <div class="panel panel-default">
      <div class="panel-heading" role="alert" > 
      <form name="test_form" method="post" ENCTYPE="multipart/form-data" onsubmit="alert(document.test_form.browse.value);" >
                <input type="file" name="browse" style="display:none;" /> 
              <div  style="left: 40px; position: relative; ">
                <button type="button" class="btn btn-primary btn-xs" style="margin-right:35px;" onclick="fn_browse();"><span class="glyphicon glyphicon-cloud-upload"></span>上传文件</button>                                         
                <button type="button" class="btn btn-primary btn-xs" style="margin-right:35px;" onclick="fn_browse();"><span class="glyphicon glyphicon-cloud-upload"></span>上传文件夹</button>  
                <button type="button" class="btn btn-primary btn-xs" id="create" onclick="createFile();"><span class="glyphicon glyphicon-plus"></span>新建文件夹</button>
       </div>
       </form>
       </div>
        </div>  -->
   
    </div>
    <div class="module-history-list" style="left: 35px; position: relative; top: 10px;">
		<span class="history-list-dir" style="margin-right:10px;">全部文件</span>
								  
    </div>
    <div class="panel">
      <div class="panel-body"> 
        <!-- Table -->
        <table class="table table-hover table-bordered"  id="fileList" style="table-layout: fixed">
          <thead>
            <tr>
              <th class="tdcenter" width= 20px height="45px"><input name="" type="checkbox" value="" id="checkAll" />全选</th>
              <th width= 200px><span style="margin-right:30px;">文件名</span>
              <div class="g-button sharebutton" href="javascipt:void(0);" id = "shareshare" style="display:none">
					<span class="g-button-right">
						<em class="icon icon-share-gray" title="分享">
						</em>
					    <span class="text" style="width:auto;">分享</span>
						</span>
			 </div>
              <div class="g-button" href="" id="download" style="display:none">              
					<span class="g-button-right">
						<em class="icon icon-download-gray" title="下载">
						</em>
						<span class="text" style="width:auto;">下载</span>
						</span>
			 </div>
			 <div class="g-button deletebutton" href="" id="delete" style="display:none">
					<span class="g-button-right">
						<em class="icon icon-delete" title="删除">
						</em>
						<span class="text" style="width:auto;">删除</span>
							</span>
			 </div>
              </th>
              <th width= 40px>大小</th>
              <th width= 45px>修改时间</th>         
              <th width= 45px>操作</th>
            </tr>
          </thead>
          <tbody>
            <tr>   
              <td class="tdcenter"><input name="subBox" type="checkbox" value="" /></td>        
              <td><img src="images/file/f01.png" style="margin-right:10px;"/>
                  <span id="OrderTime" style="color:black">动漫</span><input type="text" id="OrderTimeInput" style="display:none"/>
                  <!-- <button id="changeOrderTime" type="button" class="btn btn-default btn-xs" style="margin-right:10px;" onclick="changeOrderTime()">
                  <span class="glyphicon glyphicon-edit"></span></button> -->
                  <button id="timeChangeOK" type="button" class="btn btn-default btn-xs " style="display:none">
                  <span class="glyphicon glyphicon-ok"></span></button>
                  <button id="timeChangeRemove" type="button" class="btn btn-default btn-xs" style="display:none">
                  <span class="glyphicon glyphicon-remove"></span></button>
              </td>
              <td>9.8G</td>
              <td>2016-05-01</td>           
              <td colspan="1" class="tdcenter">
              
                 <button id="changeOrderTime" type="button" class="btn btn-default btn-xs" style="margin-right:10px;" onclick="changeOrderTime()">
                 <span class="glyphicon glyphicon-edit"></span></button>               
                  
                <button type="submit" class="btn btn-default btn-xs" id="imgIn" style="margin-right:10px;">
                    <span class="glyphicon glyphicon-save"></span></button>
                <button type="submit" class="btn btn-default btn-xs deletebutton1" id="delete" >
                    <span class="glyphicon glyphicon-remove"></span></button></td>
            </tr>
            <tr>
              <td class="tdcenter"><input name="subBox" type="checkbox" value="" /></td>
              <td><img src="images/file/f01.png" style="margin-right:10px;"/>
                  <span id="OrderTime2" style="color:black">学习</span><input type="text" id="OrderTimeInput2" style="display:none"/>
                 <!--  <button id="changeOrderTime2" type="button" class="btn btn-default btn-xs" style="margin-right:10px;" onclick="changeOrderTime2()">
                  <span class="glyphicon glyphicon-edit"></span></button> -->
                  <button id="timeChangeOK2" type="button" class="btn btn-default btn-xs" style="display:none">
                  <span class="glyphicon glyphicon-ok"></span></button>
                  <button id="timeChangeRemove2" type="button" class="btn btn-default btn-xs" style="display:none">
                  <span class="glyphicon glyphicon-remove"></span></button>
              </td>
              <td>2.6G</td>
              <td>2016-04-26</td>
              <td class="tdcenter">
                <button id="changeOrderTime2" type="button" class="btn btn-default btn-xs" style="margin-right:10px;" onclick="changeOrderTime2()">
                  <span class="glyphicon glyphicon-edit"></span></button>
                <button type="button" class="btn btn-default btn-xs" style="margin-right:10px;" id="modify" onclick="">
                    <span class="glyphicon glyphicon-save"></span></button>
                <button type="button" class="btn btn-default btn-xs deletebutton1" id="delete" >
                    <span class="glyphicon glyphicon-remove"></span></button></td>                   
                  
            </tr>
              <tr>
              <td class="tdcenter"><input name="subBox" type="checkbox" value="" /></td>
              <td><img src="images/file/f01.png" style="margin-right:10px;"/>
                  <span id="OrderTime3" style="color:black">图片</span><input type="text" id="OrderTimeInput3" style="display:none"/>
                  <!-- <button id="changeOrderTime3" type="button" class="btn btn-default btn-xs" style="margin-right:10px;" onclick="changeOrderTime3()">
                  <span class="glyphicon glyphicon-edit"></span></button> -->
                  <button id="timeChangeOK3" type="button" class="btn btn-default btn-xs" style="display:none">
                  <span class="glyphicon glyphicon-ok"></span></button>
                  <button id="timeChangeRemove3" type="button" class="btn btn-default btn-xs" style="display:none">
                  <span class="glyphicon glyphicon-remove"></span></button>
              </td>
          
              <td>704M</td>
              <td>2016-04-20</td>
              <td class="tdcenter">
              	<button id="changeOrderTime3" type="button" class="btn btn-default btn-xs" style="margin-right:10px;" onclick="changeOrderTime3()">
                  <span class="glyphicon glyphicon-edit"></span></button>
                <button type="button" class="btn btn-xs btn-default" id="" style="margin-right:10px;" onclick="">
                    <span class="glyphicon glyphicon-save"></span></button>
                <button type="button" class="btn btn-default btn-xs deletebutton1" id="delete" >
                    <span class="glyphicon glyphicon-remove"></span></button></td>
                  
            </tr>  
            <tr>
              <td class="tdcenter"><input name="subBox" type="checkbox" value="" /></td>
              <td><img src="images/file/f01.png" style="margin-right:10px;"/>
                  <span id="OrderTime4" style="color:black">Hadoop</span><input type="text" id="OrderTimeInput4" style="display:none"/>
                  <!-- <button id="changeOrderTime4" type="button" class="btn btn-default btn-xs" style="margin-right:10px;" onclick="changeOrderTime4()">
                  <span class="glyphicon glyphicon-edit"></span></button> -->
                  <button id="timeChangeOK4" type="button" class="btn btn-default btn-xs" style="display:none">
                  <span class="glyphicon glyphicon-ok"></span></button>
                  <button id="timeChangeRemove4" type="button" class="btn btn-default btn-xs" style="display:none">
                  <span class="glyphicon glyphicon-remove"></span></button>
              </td>
              <td>2.8G</td>
              <td>2016-04-20</td>
              <td class="tdcenter">
              	<button id="changeOrderTime4" type="button" class="btn btn-default btn-xs" style="margin-right:10px;" onclick="changeOrderTime4()">
                  <span class="glyphicon glyphicon-edit"></span></button>
                <button type="button" class="btn btn-default btn-xs" id="modify" style="margin-right:10px;" onclick="">
                    <span class="glyphicon glyphicon-save"></span></button>
                <button type="button" class="btn btn-default btn-xs deletebutton1" id="delete">
                    <span class="glyphicon glyphicon-remove"></span></button></td>
                  
            </tr>                     
              <tr>
              <td class="tdcenter"><input name="subBox" type="checkbox" value="" /></td>
              <td><img src="images/file/f02.png" style="margin-right:10px;"/>          
                  <span id="OrderTime5" style="color:black">SWiSHmax.rar</span><input type="text" id="OrderTimeInput5" style="display:none"/>
                  <!-- <button id="changeOrderTime5" type="button" class="btn btn-default btn-xs" style="margin-right:10px;" onclick="changeOrderTime5()">
                  <span class="glyphicon glyphicon-edit"></span></button> -->
                  <button id="timeChangeOK5" type="button" class="btn btn-default btn-xs" style="display:none">
                  <span class="glyphicon glyphicon-ok"></span></button>
                  <button id="timeChangeRemove5" type="button" class="btn btn-default btn-xs" style="display:none">
                  <span class="glyphicon glyphicon-remove"></span></button>
              </td>
              <td>123M</td>
              <td>2016-04-15</td>
              <td class="tdcenter">
              	<button id="changeOrderTime5" type="button" class="btn btn-default btn-xs" style="margin-right:10px;" onclick="changeOrderTime5()">
                  <span class="glyphicon glyphicon-edit"></span></button>
                <button type="button" class="btn btn-default btn-xs" style="margin-right:10px;" id="modify" onclick="">
                    <span class="glyphicon glyphicon-save"></span></button>
                <button type="button" class="btn btn-default btn-xs deletebutton1" id="delete">
                    <span class="glyphicon glyphicon-remove"></span></button></td>                 
            </tr>
            
            <tr>
              <td class="tdcenter"><input name="subBox" type="checkbox" value="" /></td>
              <td><img src="images/file/f05.png" style="margin-right:10px;"/>             
                  <span id="OrderTime6" style="color:black">php.ini.xls</span><input type="text" id="OrderTimeInput6" style="display:none"/>
                  <!-- <button id="changeOrderTime6" type="button" class="btn btn-default btn-xs" style="margin-right:10px;" onclick="changeOrderTime6()">
                  <span class="glyphicon glyphicon-edit"></span></button> -->
                  <button id="timeChangeOK6" type="button" class="btn btn-default btn-xs" style="display:none">
                  <span class="glyphicon glyphicon-ok"></span></button>
                  <button id="timeChangeRemove6" type="button" class="btn btn-default btn-xs" style="display:none">
                  <span class="glyphicon glyphicon-remove"></span></button>
              </td>
              
              <td>100K</td>
              <td>2016-03-01</td>
              <td class="tdcenter">
              	<button id="changeOrderTime6" type="button" class="btn btn-default btn-xs" style="margin-right:10px;" onclick="changeOrderTime6()">
                  <span class="glyphicon glyphicon-edit"></span></button>
                <button type="button" class="btn btn-default btn-xs" style="margin-right:10px;" id="modify" onclick="">
                    <span class="glyphicon glyphicon-save"></span></button>
                <button type="button" class="btn btn-default btn-xs deletebutton1" id="delete" >
                    <span class="glyphicon glyphicon-remove"></span></button></td>                 
            </tr>
            
             <tr>
              <td class="tdcenter"><input name="subBox" type="checkbox" value="" /></td>
              <td><img src="images/file/f03.png" style="margin-right:10px;"/>              
                  <span id="OrderTime7" style="color:black">福昕阅读器_5.1.0.1117.exe</span>
                  <input type="text" id="OrderTimeInput7" style="display:none"/>
                  <!-- <button id="changeOrderTime7" type="button" class="btn btn-default btn-xs" style="margin-right:10px;" onclick="changeOrderTime7()">
                  <span class="glyphicon glyphicon-edit"></span></button> -->
                  <button id="timeChangeOK7" type="button" class="btn btn-default btn-xs" style="display:none">
                  <span class="glyphicon glyphicon-ok"></span></button>
                  <button id="timeChangeRemove7" type="button" class="btn btn-default btn-xs" style="display:none">
                  <span class="glyphicon glyphicon-remove"></span></button>
              </td>
              <td>33.5M</td>
              <td>2016-02-25</td>
              <td class="tdcenter">
              	<button id="changeOrderTime7" type="button" class="btn btn-default btn-xs" style="margin-right:10px;" onclick="changeOrderTime7()">
                  <span class="glyphicon glyphicon-edit"></span></button>
                <button type="button" class="btn btn-default btn-xs" style="margin-right:10px;" id="modify" onclick="">
                    <span class="glyphicon glyphicon-save"></span></button>
                <button type="button" class="btn btn-default btn-xs deletebutton1" id="delete" >
                    <span class="glyphicon glyphicon-remove"></span></button></td>                  
            </tr>
          </tbody>
        </table>
        <!-- 分页 -->
        <center>
          <ul class="pagination" >
            <li><a href="#">&laquo;</a></li>
            <li><a href="#">1</a></li>
            <li><a href="#">2</a></li>
            <li><a href="#">3</a></li>
            <li><a href="#">4</a></li>
            <li><a href="#">5</a></li>
            <li><a href="#">&raquo;</a></li>
          </ul>
        </center>
      </div>
    </div>
  </div>
   <div class="container">
         </div>  
         
<div id="share" class="dialog dialog-share">
  <div class="dialog-header dialog-drag">
    <h3>
      <span class="dialog-header-title">
        <em class="select-text">分享文件：</em>
      </span>
    </h3>
    <div class="dialog-control">
      <span class="dialog-icon dialog-close share-close">
      </span>
    </div>
  </div>
  <div class="dialog-body">
    <div class="share-dialog">
      <div id="_disk_id_1" class="content">
        <ul class="tab">
          <li class="share-link current">
            <span class="icon"></span>
            链接分享
          </li>
          <li class="share-friend">
            <span class="icon"></span>
            发给好友
          </li>
          <li class="share-mail">
            <span class="icon"></span>
            发到邮箱
          </li>
        </ul>
        <ul class="content">
          <li id="share-link" class="share-link" style="display:block;">
            <div class="create-link">
                <span class="all">生成下载链接，然后复制链接发送到QQ,MSN等好友</span>
              <div class="button-section">
                <button type="button" class="mybtn btn">创建链接</button>
                
              </div>
            </div>
          </li>
          <li id="share-friend" class="share-friend" style="display:none;">
            <div id="sharefriendBox" class="share-friend-box">
            <p class="title">
              <span id="shareTitle">选择好友分享文件，一次最多50人</span>
            </p>
            <div class="content global-clearfix">
              <div class="left-side">
                <div id="contactBox" class="contact-box">
                  <div id="friendBox" class="contact-group" style="display:block;">
                    <ul id="treeList-abc-" class="tree-list">
                      <li id="treeList-abc-1" class="mboxOfGroup step-0">
                        <div class="title zhankai">
                          <em class="icon"></em>
                          群组
                          <span class="number">(1)</span>
                        </div>
                        <ul style="display:none; margin:0; padding:0;">
                          <li id="treeList-abc-1,0" class="step-1">
                            <div class="mylabel select-label"></div>
                            <div class="uinfo" title="hlh2bjtu、唯想断城、ohowzz的群组">
                              <div class="img-box img-box-3 global-clearfix">
                                <img src="http://himg.bdimg.com/sys/portrait/item/aaacba23.jpg" class="img-1">
                                <img src="http://himg.bdimg.com/sys/portrait/item/0cef624d.jpg" class="img-2">
                                <img src="http://himg.bdimg.com/sys/portrait/item/2827f154.jpg" class="img-3">
                              </div>
                              hlh2bjtu、唯想断城、ohowzz的群组
                            </div>
                          </li>
                        </ul>
                      </li>
                      <li id="treeList-abc-2" class="mboxOfFriend step-0">
                        <div class="title zhankai">
                          <em class="icon"></em>
                          好友
                          <span class="number">(3)</span>
                        </div>
                        <ul style="display: none; margin:0; padding:0;">
                          <li id="treeList-abc-2,0" class="step-1">
                            <div class="mylabel select-label"></div>
                            <div class="uinfo" title="侯立华">
                              <img src="http://himg.bdimg.com/sys/portrait/item/0cef624d.jpg" class="avatar">
                              侯立华
                            </div>
                          </li>
                          <li id="treeList-abc-2,1" class="step-1">
                            <div class="mylabel select-label"></div>
                            <div class="uinfo" title="许瑶11211">
                              <img src="http://himg.bdimg.com/sys/portrait/item/ebcf4323.jpg" class="avatar">
                              许瑶11211
                            </div>
                          </li>
                          <li id="treeList-abc-2,2" class="step-1">
                            <div class="mylabel select-label"></div>
                            <div class="uinfo" title="hlh2bjtu">
                              <img src="http://himg.bdimg.com/sys/portrait/item/aaacba23.jpg" class="avatar">
                              hlh2bjtu
                            </div>
                          </li>
                        </ul>
                      </li>
                    </ul>
                  </div>

                </div>
              </div>
              <div class="right-side">
                <div id="searchBox" class="search-box">
                  <div style="line-height:34px;text-align: right;">
                    <a id="searchFriendLink" href="javascript:void(0);">
                      添加好友
                    </a>
                  </div>
                </div>
                <div id="selectedList">
                  <div class="selected-box">
                    <p class="title" id="descTitle">
                      已选择
                      <span id="shareNum" class="share-num">0</span>
                      个收件人
                      <span id="defaultSelectedTip" style="display: none;">（默认创建群组）</span>
                    </p>
                    <ul class="select-list">
                      <div class="none global-center" style="display:block;">
                        <span>你还没有选择好友</span>
                      </div>
                      <!-- <li data-uniqueid="4014555837" data-groupid="2,0" class="item">
                        <div class="label-box" node-type="labelBox">
                          <div class="mylabel label-dis"></div>
                        </div>
                        <div class="uinfo g-clearfix" title="侯立华">
                          <img src="http://himg.bdimg.com/sys/portrait/item/0cef624d.jpg" class="avatar" height="23" width="23">
                          <span class="uname">
                          侯立华
                          </span>
                        </div>
                      </li> -->
                    </ul>
                  </div>
                </div><!-- 搜索结果 -->
              <div style="display: none;" id="resultBox" class="result-box">
                <div id="searchResultParent" class="search-result-parent">
                </div>
              </div>
            </div>
            </div>
            </div>
          </li>
          <li id="share-mail" class="share-mail" style="display:none;">
            <div id="sharefriendBox" class="share-phone-mail-box">
              <div class="right-side">
              </div>
              <div class="left-side">
                <p class="title">
                  <span id="shareTitle">将文件的下载地址发到好友的邮箱，一次最多5人
                  </span>(<span id="shareNu" class="nu">0</span>)
                </p>
                <div id="nameContent" class="name-content clearfix">
                  <div id="nameCards" class="name-cards">
                  </div>
                  <input style="width: 397px; color: rgb(153, 153, 153);" id="inputText" class="input-text" value="请输入或选择邮件地址" type="text">
                </div>
                <p class="title" id="descTitle">邮件内容：</p>
                <p class="desc-box"><label>0/500</label><textarea id="desc" class="desc" maxlength="500">描述一下分享的文件吧</textarea></p>
              </div>

            </div>
          </li>
        </ul>
        <div class="dialog-footer">
          <button type="button" class="share-close dialogclose btn btn-default">
          关闭  </button>
          <button type="button" class="share-btn btn btn-danger" style="display:none;">分享</button>
        </div>
      </div>
    </div>
  </div>
</div>
       
<div id="confirm" class="dialog dialog-confirm">
	<div class="dialog-header dialog-drag">
		<h3>
			<span class="dialog-header-title">
				<em class="select-text">确认删除</em>
			</span>
		</h3>
		<div class="dialog-control">
			<span class="dialog-icon dialog-close confirm-close">
			</span>
		</div>
	</div>
	<div class="dialog-body">
		<div style="text-align:center;padding:22px;">
		确认要把所选文件放入回收站吗？<br>删除的文件可在10天内通过回收站还原
		</div>
	</div>
	<div class="confirm-dialog-footer">
		<button type="button" class="btn btn-danger">
					确定  </button>
		<button type="button" class="confirm-close btn btn-default">
					取消  </button>			
	</div>
</div>

    <footer id="footer" class="midnight-blue">
        <div class="container">
            <div class="row">
                <div class="col-sm-6">
                    Copyright &copy; 2015.Company name All rights reserved.<a target="_blank" href="http://sc.chinaz.com/moban/">&#x7F51;&#x9875;&#x6A21;&#x677F;</a>
                </div>
                <div class="col-sm-6">
                    <ul class="pull-right">
                        <li><a href="#">Home</a></li>
                        <li><a href="#">About Us</a></li>
                        <li><a href="#">Faq</a></li>
                        <li><a href="#">Contact Us</a></li>
                    </ul>
                </div>
            </div>
        </div>
    </footer><!--/#footer-->

    <script src="js/jquery.js"></script>
    <script type="text/javascript">
        $('.carousel').carousel()
    </script>
    <script src="js/bootstrap.min.js"></script>
    <script src="js/jquery.prettyPhoto.js"></script>
    <script src="js/jquery.isotope.min.js"></script>
    <script src="js/main.js"></script>
    <script src="js/wow.min.js"></script>
    
    <!-- 选中所有文件,显示隐藏的按钮 -->
    <script src="http://code.jquery.com/jquery-1.4.4.min.js" type="text/javascript"></script>    <script type="text/javascript">
        $(function() {
           $("#checkAll").click(function() {
                $('input[name="subBox"]').attr("checked",this.checked);  
                $("#shareshare").show();
                $("#download").show();
                $("#delete").show();
            });
               
            var $subBox = $("input[name='subBox']");
            $subBox.click(function(){
                $("#checkAll").attr("checked",$subBox.length == $("input[name='subBox']:checked").length ? true : false);
                
            });
        });
    </script>
    

	
	<!-- 文件上传 -->
	<script language="javascript" type="text/javascript"> 
    function fn_browse() 
    { 
        document.test_form.browse.click(); 
        document.test_form.file.value = document.all.test_form.browse.value; 
    }
    </script>
    
    <!-- 文件名修改 -->    
    <script> 
    function changeOrderTime(){
        var spanValue = $("#OrderTime").text();
        $("#OrderTimeInput").val(spanValue);
        $("#OrderTimeInput").show();
        $("#OrderTime").hide();
        $("#changeOrderTime").hide();
        $("#timeChangeOK").show();
        $("#timeChangeRemove").show();
        
        $("#timeChangeOK").click(function(){
            var inputValue = $("#OrderTimeInput").val();
            $("#OrderTime").text(inputValue);
            $("#OrderTimeInput").hide();
            $("#OrderTime").show();
            $("#changeOrderTime").show();
            $("#timeChangeOK").hide();
            $("#timeChangeRemove").hide();
        });
        $("#timeChangeRemove").click(function(){
            var inputValue = $("#OrderTime").text();
            $("#OrderTime").text(inputValue);
            $("#OrderTimeInput").hide();
            $("#OrderTime").show();
            $("#changeOrderTime").show();
            $("#timeChangeOK").hide();
            $("#timeChangeRemove").hide();
        });
     }
     function changeOrderTime2(){    
        var spanValue = $("#OrderTime2").text();
        $("#OrderTimeInput2").val(spanValue);
        $("#OrderTimeInput2").show();
        $("#OrderTime2").hide();
        $("#changeOrderTime2").hide();
        $("#timeChangeOK2").show();
        $("#timeChangeRemove2").show();
        
        $("#timeChangeOK2").click(function(){
            var inputValue = $("#OrderTimeInput2").val();
            $("#OrderTime2").text(inputValue);
            $("#OrderTimeInput2").hide();
            $("#OrderTime2").show();
            $("#changeOrderTime2").show();
            $("#timeChangeOK2").hide();
            $("#timeChangeRemove2").hide();
        });
        $("#timeChangeRemove2").click(function(){
            var inputValue = $("#OrderTime2").text();
            $("#OrderTime2").text(inputValue);
            $("#OrderTimeInput2").hide();
            $("#OrderTime2").show();
            $("#changeOrderTime2").show();
            $("#timeChangeOK2").hide();
            $("#timeChangeRemove2").hide();
        });
     }
     function changeOrderTime3(){    
        var spanValue = $("#OrderTime3").text();
        $("#OrderTimeInput3").val(spanValue);
        $("#OrderTimeInput3").show();
        $("#OrderTime3").hide();
        $("#changeOrderTime3").hide();
        $("#timeChangeOK3").show();
        $("#timeChangeRemove3").show();
        
        $("#timeChangeOK3").click(function(){
            var inputValue = $("#OrderTimeInput3").val();
            $("#OrderTime3").text(inputValue);
            $("#OrderTimeInput3").hide();
            $("#OrderTime3").show();
            $("#changeOrderTime3").show();
            $("#timeChangeOK3").hide();
            $("#timeChangeRemove3").hide();
        });
        $("#timeChangeRemove3").click(function(){
            var inputValue = $("#OrderTime3").text();
            $("#OrderTime3").text(inputValue);
            $("#OrderTimeInput3").hide();
            $("#OrderTime3").show();
            $("#changeOrderTime3").show();
            $("#timeChangeOK3").hide();
            $("#timeChangeRemove3").hide();
        });
     }
     function changeOrderTime4(){     
        var spanValue = $("#OrderTime4").text();
        $("#OrderTimeInput4").val(spanValue);
        $("#OrderTimeInput4").show();
        $("#OrderTime4").hide();
        $("#changeOrderTime4").hide();
        $("#timeChangeOK4").show();
        $("#timeChangeRemove4").show();
        
        $("#timeChangeOK4").click(function(){
            var inputValue = $("#OrderTimeInput4").val();
            $("#OrderTime4").text(inputValue);
            $("#OrderTimeInput4").hide();
            $("#OrderTime4").show();
            $("#changeOrderTime4").show();
            $("#timeChangeOK4").hide();
            $("#timeChangeRemove4").hide();
        });
        $("#timeChangeRemove4").click(function(){
            var inputValue = $("#OrderTime4").text();
            $("#OrderTime4").text(inputValue);
            $("#OrderTimeInput4").hide();
            $("#OrderTime4").show();
            $("#changeOrderTime4").show();
            $("#timeChangeOK4").hide();
            $("#timeChangeRemove4").hide();
        });
     }
     function changeOrderTime5(){    
        var spanValue = $("#OrderTime5").text();
        $("#OrderTimeInput5").val(spanValue);
        $("#OrderTimeInput5").show();
        $("#OrderTime5").hide();
        $("#changeOrderTime5").hide();
        $("#timeChangeOK5").show();
        $("#timeChangeRemove5").show();
        
        $("#timeChangeOK5").click(function(){
            var inputValue = $("#OrderTimeInput5").val();
            $("#OrderTime5").text(inputValue);
            $("#OrderTimeInput5").hide();
            $("#OrderTime5").show();
            $("#changeOrderTime5").show();
            $("#timeChangeOK5").hide();
            $("#timeChangeRemove5").hide();
        });
        $("#timeChangeRemove5").click(function(){
            var inputValue = $("#OrderTime5").text();
            $("#OrderTime5").text(inputValue);
            $("#OrderTimeInput5").hide();
            $("#OrderTime5").show();
            $("#changeOrderTime5").show();
            $("#timeChangeOK5").hide();
            $("#timeChangeRemove5").hide();
        });
     }
     function changeOrderTime6(){    
        var spanValue = $("#OrderTime6").text();
        $("#OrderTimeInput6").val(spanValue);
        $("#OrderTimeInput6").show();
        $("#OrderTime6").hide();
        $("#changeOrderTime6").hide();
        $("#timeChangeOK6").show();
        $("#timeChangeRemove6").show();
        
        $("#timeChangeOK6").click(function(){
            var inputValue = $("#OrderTimeInput6").val();
            $("#OrderTime6").text(inputValue);
            $("#OrderTimeInput6").hide();
            $("#OrderTime6").show();
            $("#changeOrderTime6").show();
            $("#timeChangeOK6").hide();
            $("#timeChangeRemove6").hide();
        });
        $("#timeChangeRemove6").click(function(){
            var inputValue = $("#OrderTime6").text();
            $("#OrderTime6").text(inputValue);
            $("#OrderTimeInput6").hide();
            $("#OrderTime6").show();
            $("#changeOrderTime6").show();
            $("#timeChangeOK6").hide();
            $("#timeChangeRemove6").hide();
        });
     }
     function changeOrderTime7(){   
        var spanValue = $("#OrderTime7").text();
        $("#OrderTimeInput7").val(spanValue);
        $("#OrderTimeInput7").show();
        $("#OrderTime7").hide();
        $("#changeOrderTime7").hide();
        $("#timeChangeOK7").show();
        $("#timeChangeRemove7").show();
        
        $("#timeChangeOK7").click(function(){
            var inputValue = $("#OrderTimeInput7").val();
            $("#OrderTime7").text(inputValue);
            $("#OrderTimeInput7").hide();
            $("#OrderTime7").show();
            $("#changeOrderTime7").show();
            $("#timeChangeOK7").hide();
            $("#timeChangeRemove7").hide();
        });
        $("#timeChangeRemove7").click(function(){
            var inputValue = $("#OrderTime7").text();
            $("#OrderTime7").text(inputValue);
            $("#OrderTimeInput7").hide();
            $("#OrderTime7").show();
            $("#changeOrderTime7").show();
            $("#timeChangeOK7").hide();
            $("#timeChangeRemove7").hide();
        });
    }
    </script>
    
</body>
</html>