<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="<%=basePath %>statics/jquerymobile/ding.min.css">
<link rel="stylesheet" href="<%=basePath %>statics/jquerymobile/jquery.mobile.icons-1.4.5.min.css">
<link rel="stylesheet" href="<%=basePath %>statics/jquerymobile/jquery.mobile-1.4.5.min.css">\
<link rel="stylesheet" href="<%=basePath %>statics/font-awesome-4.7.0/css/font-awesome.min.css">
<script src="<%=basePath %>statics/jquerymobile/jquery.min.js"></script>
<script src="<%=basePath %>statics/jquerymobile/jquery.mobile-1.4.5.min.js"></script>
</head>
<body>

<div data-role="page" data-theme="k">
	<div data-role="panel" id="myPanel"> 
		<h2>导航菜单</h2>
		
		<div data-role="collapsible">
		    <h4>A</h4>
		    <ul data-role="listview">
			    <li><a href="#">Adele</a></li>
			    <li><a href="#">Agnes</a></li>
		    </ul>
	    </div>
	
	    <div data-role="collapsible">
		    <h4>B</h4>
		    <ul data-role="listview">
			    <li><a href="#">Billy</a></li>
			    <li><a href="#">Bob</a></li>
		    </ul>
	    </div>
	
	    <div data-role="collapsible">
		    <h4>C</h4>
		    <ul data-role="listview">
			    <li><a href="#">Calvin</a></li>
			    <li><a href="#">Cameron</a></li>
			    <li><a href="#">Chloe</a></li>
			    <li><a href="#">Christina</a></li>
		    </ul>
	    </div>
	</div> 
	
	<div data-role="main" class="ui-content">
		<a href="#myPanel" class="fa fa-th fa-2x" 
		style="position: fixed;
				left: 20px;
				top: 50px;color:rgba(0,100,100,0.4);
				background-color:rgba(255,255,255,0);text-decoration:none;"></a>
		<p>我现在是一个移动端开发者!!</p>
		<p>我现在是一个移动端开发者!!</p>
		<p>我现在是一个移动端开发者!!</p>
		<p>我现在是一个移动端开发者!!</p>
		<p>我现在是一个移动端开发者!!</p>
		<p>我现在是一个移动端开发者!!</p>
		<p>我现在是一个移动端开发者!!</p>
		<p>我现在是一个移动端开发者!!</p>
		<p>我现在是一个移动端开发者!!</p>
		<p>我现在是一个移动端开发者!!</p>
		<p>我现在是一个移动端开发者!!</p>
		<p>我现在是一个移动端开发者!!</p>
		<p>我现在是一个移动端开发者!!</p>
		<p>我现在是一个移动端开发者!!</p>
		<p>我现在是一个移动端开发者!!</p>
		<p>我现在是一个移动端开发者!!</p>
		<p>我现在是一个移动端开发者!!</p>
		<p>我现在是一个移动端开发者!!</p>
		<p>我现在是一个移动端开发者!!</p>
		<p>我现在是一个移动端开发者!!</p>
		<p>我现在是一个移动端开发者!!</p>
		<p>我现在是一个移动端开发者!!</p>
		<p>我现在是一个移动端开发者!!</p>
		<p>我现在是一个移动端开发者!!</p>
		<p>我现在是一个移动端开发者!!</p>
		<p>我现在是一个移动端开发者!!</p>
		<p>我现在是一个移动端开发者!!</p>
		<p>我现在是一个移动端开发者!!</p>
		<p>我现在是一个移动端开发者!!</p>
		<p>我现在是一个移动端开发者!!</p>
		<p>我现在是一个移动端开发者!!</p>
		<p>我现在是一个移动端开发者!!</p>
		<p>我现在是一个移动端开发者!!</p>
		<p>我现在是一个移动端开发者!!</p>
		<p>我现在是一个移动端开发者!!</p>
		<p>我现在是一个移动端开发者!!</p>
		<p>我现在是一个移动端开发者!!</p>
		<p>我现在是一个移动端开发者!!</p>
		<p>我现在是一个移动端开发者!!</p>
		<p>我现在是一个移动端开发者!!</p>
		<p>我现在是一个移动端开发者!!</p>
		<p>我现在是一个移动端开发者!!</p>
		<p>我现在是一个移动端开发者!!</p>
		<p>我现在是一个移动端开发者!!</p>
		<p>我现在是一个移动端开发者!!</p>
		<p>我现在是一个移动端开发者!!</p>
		<p>我现在是一个移动端开发者!!</p>
		<p>我现在是一个移动端开发者!!</p>
	</div>
</div> 

</body>
</html>