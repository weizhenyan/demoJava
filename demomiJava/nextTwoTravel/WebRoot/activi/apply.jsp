<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8"> 
	<title>我的申请</title>
	<link rel="stylesheet" href="../css/bootstrap.min.css">
	<script src="../js/jquery_dev.js"></script>
	<script src="../js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container">
	<div class="row clearfix">
		<div class="col-md-12 column">
			<div class="row clearfix">
				<div class="col-md-12 column">
					<h1 class="text-center">
						一起来旅行吧！
					</h1>
				</div>
			</div>
			<nav class="navbar navbar-default" role="navigation">
				<div class="navbar-header">
					 <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1"> 
					 <span class="sr-only"></span>
					 <span class="icon-bar"></span>
					 <span class="icon-bar"></span>
					 <span class="icon-bar"></span></button> 
					 <a class="navbar-brand">旅行活动</a>
				</div>
				
				<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
					<ul class="nav navbar-nav">
						<li><a href="allAct.jsp">所有活动</a></li>
						<li><a href="addAct.jsp">创建活动</a></li>
						<li><a href="myAct.jsp">我的活动</a></li>
						<li class="action"><a href="apply.jsp">我的申请</a></li>
					</ul>
					
					<ul class="nav navbar-nav navbar-right">
						<li><a href="#">注册</a></li>
						<li><a href="#">登陆</a></li>
					</ul>
				</div>
				
			</nav>
			<div>
				<table class="table">
 				<thead>
    				<tr><th>申请人</th><th>活动名称</th><th>状态</th></tr>
  				</thead>
  				<tbody>
   				<tr class="active"><td>产品1</td><td>23/11/2013</td><td>待发货</td></tr>
    			<tr class="success"><td>产品2</td><td>10/11/2013</td><td>发货中</td></tr>
    			<tr class="warning"><td>产品3</td><td>20/10/2013</td><td>待确认</td></tr>
    			<tr class="danger"><td>产品4</td><td>20/10/2013</td><td>已退货</td></tr>
  				</tbody>
				</table>
			</div>
		</div>
	</div>
</div>
</body>
</html>