<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<div data-role="panel" id="myPanel"> 
		<h2>光伏导航菜单</h2>
		
		<div data-role="collapsible">
		    <h4>光功率</h4>
		<ul data-role="listview">
			    <li><a href="lightOutline"  data-ajax="false">光伏预测</a></li>
			    <li><a href="#">测光信息</a></li>
		    </ul>
	    </div>
	    <div data-role="collapsible">
		    <h4>考核结果</h4>
		    <ul data-role="listview">
			    <li><a href="#">日考核结果</a></li>
			    <li><a href="#">月考核结果</a></li>
		    </ul>
	    </div>
	    <div data-role="collapsible">
		    <h4>检修</h4>
		    <ul data-role="listview">
			    <li><a href="repairPlanInit" data-ajax="false">检修计划上报</a></li>
			    <li><a href="OTRRInit" data-ajax="false">一次检修票上报</a></li>
		    </ul>
	    </div>
	    <div data-role="collapsible">
		    <h4>系统操作</h4>
		    <ul data-role="listview">
			    <li><a href="logout">退出登录</a></li>
		    </ul>
	    </div>
	</div> 