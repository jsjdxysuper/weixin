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
<link rel="stylesheet" href="<%=basePath %>statics/jquerymobile/jquery.mobile-1.4.5.min.css">
<link rel="stylesheet" href="<%=basePath %>statics/jquerymobile/Mobiscroll/css/mobiscroll.custom-3.0.0-beta6.min.css">
<link rel="stylesheet" href="<%=basePath %>statics/font-awesome-4.7.0/css/font-awesome.min.css">
<script src="<%=basePath %>statics/jquerymobile/jquery.min.js"></script>
<script src="<%=basePath %>statics/artTemplate.js"></script>
<script src="<%=basePath %>statics/jquerymobile/jquery.mobile-1.4.5.min.js"></script>
<script type="text/javascript" src="<%=basePath %>statics/jquerymobile/Mobiscroll/js/mobiscroll.custom-3.0.0-beta6.min.js"></script>
<script src="<%=basePath %>statics/Utili.js"></script>
<style type="text/css">
th {
    border-bottom: 1px solid #d6d6d6;
}

tr:nth-child(even) {
    background: #e9e9e9;
}
#container {
   display: flex;
   flex-direction: row;
   align-items: center;
   justify-content:space-between;
 }
</style>

</head>
<body>

<div id="thisPage" data-role="page" data-theme="k">
	<div id="topAnchor"></div>
	<%@ include file="../../PanelWind.jsp" %>

	<div data-role="main" class="ui-content">
	<h3 style="margin-top:40px;margin-bottom:0px;">检修计划上报</h3>
		<a href="#myPanel" class="fa fa-th fa-2x" 
				style="position: fixed;
				left: 20px;
				top: 20px;color:rgba(0,100,100,0.4);
				background-color:rgba(255,255,255,0);text-decoration:none;"></a>
		<a href="#topAnchor" class="fa fa-arrow-circle-up fa-2x"  target="_self"
				style="position: fixed;
				right: 20px;
				bottom: 20px;color:rgba(0,100,100,0.4);
				background-color:rgba(255,255,255,0);text-decoration:none;"></a>
		<div class="ui-grid-a" id="container">
			<div class="ui-block-a"><input  type="text" name="strDate" id="strDate" data-inline="true" data-role="datebox"></div>
			<div class="ui-block-b" style="width:80px;"><button class="ui-mini" onclick="queryDate()"  >查询</button></div>
		</div>
		<form>
			<input id="filterTable-input" data-type="search" placeholder="搜索..."/>
		</form>
		<div id="tableAnthor">
			<table id="tableRepair" 
				data-role="table" 
				data-mode="columntoggle" 
				class="ui-responsive ui-shadow"
				data-column-btn-text="列"
				data-filter="true"
				data-input="#filterTable-input"	
				>
				<thead>
					<tr>
						<th data-priority="6">编码</th>
						<th data-priority="6">类型id</th>
						<th data-priority="1">类型</th>
						<th data-priority="1">名称</th>
						<th data-priority="3">月份</th>
						<th data-priority="1">开始T</th>
						<th data-priority="1">结束T</th>
						<th data-priority="4">检修天数</th>
						<th data-priority="6">检修小时</th>
						<th data-priority="6">施工单位</th>
						<th data-priority="6">工作分类</th>
						<th data-priority="6">负责部门</th>
						<th data-priority="6">影响容量</th>
						<th data-priority="6">作业内容</th>
						<th data-priority="6">上报单位</th>
						<th data-priority="6">上报人</th>
						<th data-priority="6">上报时间</th>
						<th data-priority="6">电厂id</th>
						<th data-priority="1">电厂</th>
						<th data-priority="1">状态</th>
						<th data-priority="6">设备id</th>
					</tr>
				</thead>
				<tbody id="tableBody">
				</tbody>
				</table>
		</div>
	</div>
</div> 

<script type="text/html" id="tableTemplate">
					{{each dataIn}}
					<tr>
						<td>{{$value.sid}}</td>
						<td>{{$value.sblxid}}</td>
						<td>{{$value.sblxmc}}</td>
						<td>{{$value.sbmc}}</td>
						<td>{{$value.yf}}</td>
						<td>{{$value.kssj}}</td>
						<td>{{$value.jssj}}</td>
						<td>{{$value.jxts}}</td>
						<td>{{$value.jxxs}}</td>
						<td>{{$value.sgdw}}</td>
						<td>{{$value.gzfl}}</td>
						<td>{{$value.fzbm}}</td>
						<td>{{$value.yxrl}}</td>
						<td>{{$value.zynr}}</td>
						<td>{{$value.sbdw}}</td>
						<td>{{$value.sbr}}</td>
						<td>{{$value.sbsj}}</td>
						<td>{{$value.ssdcid}}</td>
						<td>{{$value.ssdcmc}}</td>
						<td>{{$value.sbzt}}</td>
						<td>{{$value.sbid}}</td>
					</tr>
					{{/each}}
</script>
<script type="text/html" id="test">
<h1>{{title}}</h1>
</script>
<script type="text/javascript">
function queryDate(){
	showLoader();
	var yearMonth = $("#strDate").val();
	$.post("repairPlanListByDate", 
			{"strDate":yearMonth},
			function(data){
				var dataTemplate = {dataIn:data};
				var html = template("tableTemplate",dataTemplate);
				$("#tableBody").html(html);
				$("#tableRepair").table();
				$("#tableRepair").table("refresh");
				hideLoader();
			},"json"
	);

}

	$(document).ready(function () {
		var todayDate = new Date();
		
		opt_date.dateFormat = 'yyy-mm';
		opt_date.startYear = todayDate.getFullYear()-2;
		opt_date.endYear = todayDate.getFullYear()+2;
		$("#strDate").mobiscroll(opt_date);
		var month = todayDate.getMonth()+1;
		if(month<10)
			month="0"+month;
		$("#strDate").val(todayDate.getFullYear()+"-"+month);
	
	});
</script>
</body>
</html>