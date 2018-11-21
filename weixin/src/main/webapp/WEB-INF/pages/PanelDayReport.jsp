<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<div data-role="panel" id="myPanel"> 
		<h2>光伏导航菜单</h2>
		
		<div data-role="collapsible">
		    <h4>早会电量</h4>
		<ul data-role="listview">
			    <li><a href="#">电量综合</a></li>
			    <li><a href="#">全省发电</a></li>
			    <li><a href="#">风电电量</a></li>
			    <li><a href="#">光伏电量</a></li>
			    <li><a href="#">水电电量</a></li>
		    </ul>
	    </div>
	    <div data-role="collapsible">
		    <h4>系统操作</h4>
		    <ul data-role="listview">
			    <li><a href="logout">退出登录</a></li>
		    </ul>
	    </div>
	</div> 