<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no">
<link href="css/bootstrap.min.css" rel="stylesheet">
<title>风景主页</title>
<style type="text/css">
@import url("css/mainSenicCss.css");
</style>
<script type="text/javascript" src="js/jquery_dev.js"></script>
<script type="text/javascript" src="js/bootstrap.min.js"></script>
<script type="text/javascript">
   $(document).ready(function(e){ 
		
	      $("#remark").css("color","black");
		  $("#hot").css("color","black");
	      $("#about").css("color","green");
	    
	      <%
	     int id= Integer.parseInt(request.getParameter("id"));
	      %>
	      var id=${param.id};
	      $("#showBody").load("mainSenicServlet",{id:id},function(){
	
			});
	      
	      
	         $("#about").click(function(){  
	        		$('#showBody').html(" ");
		      $("#remark").css("color","black");
			  $("#hot").css("color","black");
		      $("#about").css("color","green");
			  $("#showBody").load("mainSenicServlet",{id:id},function(){
			
					});

	   });
	    $("#remark").click(function(){
	         $('#showBody').html(" ");
	    	 $("#about").css("color","black");
			 $("#hot").css("color","black");
	    	 $("#remark").css("color","green");
	    	 $("#showBody").load("senReServlet",{id:id},function(){
	 			
			  });
	     });

   });
  </script>
  <!--缩放-->
  <script type="text/javascript">
	$(function  () {
		function resi() {
			var html = document.querySelector("html");
			var wW = document.body.clientWidth || document.documentElement.clientWidth;
			var maxW = 640;
			var minW = 320;
			if (wW > maxW) wW = maxW;
			var ratio = wW / minW;
			html.style.fontSize = 50 * ratio + "px"
		}
		window.addEventListener("DOMContentLoaded", function() {
			var bodys = document.querySelector("body").style;
			bodys.opacity = "1";
			bodys.filter = "alpha(opacity=100)";
			resi()
		});
		window.addEventListener("resize", resi);
 
	});		
	</script>
</head>
<body>
<nav class="navbar navbar-inverse">
 <div id="wrap" >
	<ul>
		<li id="active"><a href="index.html">Home</a></li>
		<li><a href="index.html">组团吧</a></li>
		<li><a href="index.html">旅游服务</a></li>
		<li><a href="index.html">个人主页</a></li>
		<li><a href="index.html">注册/登录</a></li>
                    
	</ul>
    <div id="clear"> </div>		
 </div>
</nav>  

<div id="mainBody" class="container">
 <div id="senicInfo">
   <div id="senic-addr">${pro_name}>>${senic.sen_city}>>${senic.sen_name}</div><br/>
   <div id="senic-name">${senic.sen_name}</div>
   <hr>
   <div id="sen-choose">
      <ul id="son-choose">
        <li ><a id="about" >概况</a></li>
        <li ><a id="remark" >景点点评</a></li>
        <li ><a id="hot" >热门推荐</a></li>
        
      </ul>
   </div>
 </div>
 </div>
 <div id="big-body">
 <div id="showBody"></div>
 </div>





<input class="btn btn-danger" type="button" value="啦啦啦啦">
</div>


<div class="footer">
			<div class="wrap">
			<div class="footer-grids">
				<div class="footer-grid">
					<h3>EXTRAS</h3>
					<p></p>
				</div>
				
				<div class="footer-grid">
					<h3>RECENT POSTS</h3>
					<ul>
						<li><a href="#"></a></li>
						<li><a href="#"></a></li>
						<li><a href="#"></a></li>
						<li><a href="#"></a></li>
					</ul>
				</div>
				<div class="footer-grid">
					<h3>USEFUL INFO</h3>
					<ul>
						<li><a href="#"></a></li>
						<li><a href="#"> </a></li>
						<li><a href="#"></a></li>
						<li><a href="#"> </a></li>
					</ul>
				</div>
				<div class="footer-grid footer-lastgrid">
					<h3>CONTACT US</h3>
					<p></p>
					<div class="footer-grid-address">
						<p></p>
						<p></p>
						<p><a class="email-link" href="#"></a></p>
					</div>
				</div>
				<div class="clear"> </div>
			</div>
			</div>
		</div>
		<!---End-footer---->
		<div class="clear"> </div>
		<div class="copy-right">
			<p><a target="_blank" href="http://www.huiyi8.com/moban/">&#x7F51;&#x9875;&#x6A21;&#x677F;</a></p>
		</div>
	<div style="display:none"><script src='http://v7.cnzz.com/stat.php?id=155540&web_id=155540' language='JavaScript' charset='gb2312'></script></div>

</body>
</html>