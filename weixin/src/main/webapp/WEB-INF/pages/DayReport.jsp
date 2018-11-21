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
<link rel="stylesheet"
	href="<%=basePath %>statics/jquerymobile/ding.min.css">
<link rel="stylesheet"
	href="<%=basePath %>statics/jquerymobile/jquery.mobile.icons-1.4.5.min.css">
<link rel="stylesheet"
	href="<%=basePath %>statics/jquerymobile/jquery.mobile-1.4.5.min.css">
<link rel="stylesheet"
	href="<%=basePath %>statics/jquerymobile/Mobiscroll/css/mobiscroll.custom-3.0.0-beta6.min.css">
<link rel="stylesheet"
	href="<%=basePath %>statics/font-awesome-4.7.0/css/font-awesome.min.css">
<script src="<%=basePath %>statics/jquerymobile/jquery.min.js"></script>
<script src="<%=basePath %>statics/artTemplate.js"></script>
<script
	src="<%=basePath %>statics/jquerymobile/jquery.mobile-1.4.5.min.js"></script>
<script type="text/javascript"
	src="<%=basePath %>statics/jquerymobile/Mobiscroll/js/mobiscroll.custom-3.0.0-beta6.min.js"></script>
<script src="<%=basePath %>statics/echart/echart.min.js"></script>
<script src="<%=basePath %>statics/Utili.js"></script>
<style type="text/css">
#container {
	margin-top: 50px;
	display: flex;
	flex-direction: row;
	align-items: center;
	justify-content: space-between;
}

tr {
	border-bottom: 1px solid lightgray;
}

table {
	text-align: center !important;
	vertical-align: middle !important;
}

td {
	text-align: center !important;
	vertical-align: middle !important;
}

th {
	text-align: center !important;
	vertical-align: middle !important;
}
</style>
</head>
<body>

	<div data-role="page" data-theme="k">
		<%@ include file="PanelDayReport.jsp"%>

		<div data-role="main" class="ui-content">
			<a href="#myPanel" class="fa fa-th fa-2x"
				style="position: fixed; left: 20px; top: 20px; color: rgba(0, 100, 100, 0.4); background-color: rgba(255, 255, 255, 0); text-decoration: none; z-index: 100"></a>
			<div class="ui-grid-a" id="container">
				<div class="ui-block-a">
					<input type="text" name="strDate" id="strDate" data-inline="true"
						data-role="datebox">
				</div>
				<div class="ui-block-b" style="width: 80px;">
					<button class="ui-mini" onclick="queryDate()">查询</button>
				</div>
			</div>
			
			<div id="pieContainer" style="height:400px;margin-bottom:30px;"></div>
			
			<table data-role="table" data-column-btn-text="列"
				data-mode="columntoggle" class="ui-responsive ui-shadow"
				id="windTable">
				<caption>风电电量信息</caption>
				<thead>
					<tr>
						<th data-priority="6">顺序</th>
						<th data-priority="1">口径</th>
						<th data-priority="1">实际</th>
						<th data-priority="6">旬累计</th>
						<th data-priority="6">旬同比</th>
						<th data-priority="6">月累计</th>
						<th data-priority="1">月同比</th>
						<th data-priority="1">年累计</th>
						<th data-priority="1">年同比</th>
					</tr>
				</thead>
				<tbody>
					<tr>
						<td>#1</td>
						<td>发电</td>
						<td>3068</td>
						<td>15987</td>
						<td>39.53</td>
						<td>4.87</td>
						<td>0.33</td>
						<td>92.60</td>
						<td>15.95</td>
					</tr>
					<tr>
						<td>#2</td>
						<td>上网</td>
						<td>2984</td>
						<td>15540</td>
						<td>39.27</td>
						<td>4.73</td>
						<td>0.08</td>
						<td>90.27</td>
						<td>16.43</td>
					</tr>
					<tr>
						<td></td>
						<td>单位</td>
						<td>万千瓦时</td>
						<td>万千瓦时</td>
						<td>%</td>
						<td>亿千瓦时</td>
						<td>%</td>
						<td>亿千瓦时</td>
						<td>%</td>
					</tr>
				</tbody>
			</table>
			
			
			
			<table data-role="table" data-column-btn-text="列"
				data-mode="columntoggle" class="ui-responsive ui-shadow"
				id="lightTable">
				<caption>光伏电量信息</caption>
				<thead>
					<tr>
						<th data-priority="6">顺序</th>
						<th data-priority="1">口径</th>
						<th data-priority="1">实际</th>
						<th data-priority="6">旬累计</th>
						<th data-priority="6">旬同比</th>
						<th data-priority="6">月累计</th>
						<th data-priority="1">月同比</th>
						<th data-priority="1">年累计</th>
						<th data-priority="1">年同比</th>
					</tr>
				</thead>
				<tbody>
					<tr>
						<td>#1</td>
						<td>发电</td>
						<td>3571.46</td>
						<td>27589.41</td>
						<td>33.51</td>
						<td>11.33</td>
						<td>1.16</td>
						<td>116.80</td>
						<td>14.95</td>
					</tr>
					<tr>
						<td>#2</td>
						<td>上网</td>
						<td>3474.90</td>
						<td>26922.85</td>
						<td>33.38</td>
						<td>11.04</td>
						<td>0.08</td>
						<td>113.85</td>
						<td>15.26</td>
					</tr>
					<tr>
						<td></td>
						<td>单位</td>
						<td>万千瓦时</td>
						<td>万千瓦时</td>
						<td>%</td>
						<td>亿千瓦时</td>
						<td>%</td>
						<td>亿千瓦时</td>
						<td>%</td>
					</tr>
				</tbody>
			</table>
 			
			<table data-role="table" data-column-btn-text="列"
				data-mode="columntoggle" class="ui-responsive ui-shadow"
				id="waterTable">
				<caption>水电电量信息</caption>
				<thead>
					<tr>
						<th data-priority="6">顺序</th>
						<th data-priority="1">厂名</th>
						<th data-priority="1">发电量</th>
						<th data-priority="6">正常高水位</th>
						<th data-priority="6">死水位</th>
						<th data-priority="6">水位</th>
						<th data-priority="1">入库流量</th>
						<th data-priority="1">出库流量</th>
						<th data-priority="6">耗水率</th>
						<th data-priority="6">弃水流量</th>
						<th data-priority="1">日降雨</th>
					</tr>
				</thead>
				<tbody>
					<tr>
						<td>#1</td>
						<td>桓仁厂</td>
						<td>25.83</td>
						<td>300.00</td>
						<td>290.00</td>
						<td>292.29</td>
						<td>28.40</td>
						<td>28.40</td>
						<td>9.23</td>
						<td>0.00</td>
						<td>0.50</td>
					</tr>

					<tr>
						<td>#2</td>
						<td>回龙厂</td>
						<td>0.00</td>
						<td>221.00</td>
						<td>219.00</td>
						<td>220.69</td>
						<td>0.00</td>
						<td>1.10</td>
						<td>0.00</td>
						<td>0.00</td>
						<td>1.20</td>
					</tr>

					<tr>
						<td>#3</td>
						<td>回龙厂</td>
						<td>0.00</td>
						<td>191.50</td>
						<td>190.00</td>
						<td>191.29</td>
						<td>1.60</td>
						<td>0.10</td>
						<td>0.00</td>
						<td>0.00</td>
						<td>0.00</td>
					</tr>
					<tr>
						<td>#4</td>
						<td>双岭厂</td>
						<td>2.10</td>
						<td>152.50</td>
						<td>150.50</td>
						<td>152.54</td>
						<td>10.59</td>
						<td>8.51</td>
						<td>35.00</td>
						<td>0.00</td>
						<td>0.00</td>
					</tr>
					<tr>
						<td>#5</td>
						<td>金哨厂</td>
						<td>4.60</td>
						<td>139.40</td>
						<td>138.40</td>
						<td>139.14</td>
						<td>8.60</td>
						<td>10.13</td>
						<td>19.00</td>
						<td>0.00</td>
						<td>0.00</td>
					</tr>
					<tr>
						<td></td>
						<td>单位</td>
						<td>万千瓦时</td>
						<td>米</td>
						<td>米</td>
						<td>米</td>
						<td>立方米/秒</td>
						<td>立方米/秒</td>
						<td>立方米/千瓦时</td>
						<td>立方米/秒</td>
						<td>毫米</td>
					</tr>
				</tbody>
			</table>
			
			<table data-role="table" data-column-btn-text="列"
				data-mode="columntoggle" class="ui-responsive ui-shadow"
				id="waterCalculateTable">
				<caption>水库累计信息</caption>
				<thead>
					<tr> 
						<th data-priority="6">顺序</th>
						<th data-priority="1">厂名</th>
						<th data-priority="1">月日均入库流量</th>
						<th data-priority="6">年日均入库流量</th>
						<th data-priority="6">月累计电量</th>
						<th data-priority="6">月同比</th>
						<th data-priority="1">年累计电量</th>
						<th data-priority="1">年同比</th>
					</tr>
				</thead>

				<tbody>
					<tr>
						<td>#1</td>
						<td>桓仁123</td>
						<td>30.26</td>
						<td>88.95</td>
						<td>699.38</td>
						<td>-88.67</td>
						<td>28630.44</td>
						<td>-36.19</td>
					</tr>
					<tr>
						<td>#2</td>
						<td>桓仁小机</td>
						<td>null</td>
						<td>null</td>
						<td>0.00</td>
						<td>-100.00</td>
						<td>1165.07</td>
						<td>-65.49 </td>
					</tr>
					<tr>
						<td>#3</td>
						<td>回龙</td>
						<td>5.60</td>
						<td>89.82</td>
						<td>74.17</td>
						<td>-97.88</td>
						<td>14137.24</td>
						<td>-46.27</td>
					</tr>
					<tr>
						<td>#4</td>
						<td>太平哨小机</td>
						<td>7.44</td>
						<td>92.88</td>
						<td>0.00</td>
						<td>-100.00</td>
						<td>129.63</td>
						<td>-78.82</td>
					</tr>
					<tr>
						<td>#5</td>
						<td>太平哨合计</td>
						<td>null</td>
						<td>null</td>
						<td>160.42</td>
						<td>-96.64</td>
						<td>20329.76</td>
						<td>-47.81</td>
					</tr>
					<tr>
						<td>#6</td>
						<td>双岭</td>
						<td>20.29</td>
						<td>109.08</td>
						<td>121.20</td>
						<td>-92.73</td>
						<td>7804.50</td>
						<td>-46.78</td>
					</tr>
					<tr>
						<td>#7</td>
						<td>金哨</td>
						<td>21.03</td>
						<td>113.45</td>
						<td>225.90</td>
						<td>-92.80</td>
						<td>15089.60</td>
						<td>-46.39</td>
					</tr>
					<tr>
						<td>#8</td>
						<td>合计</td>
						<td>84.62</td>
						<td>494.17</td>
						<td>1281.07</td>
						<td>-93.49</td>
						<td>87286.24</td>
						<td>-44.38</td>
					</tr>
					<tr>
						<td></td>
						<td>单位</td>
						<td>立方米/秒</td>
						<td>立方米/秒</td>
						<td>万千瓦时</td>
						<td>%</td>
						<td>亿千瓦时</td>
						<td>%</td>
					</tr>
				</tbody>
			</table>
		</div>
	</div>
	<script type="text/javascript">
  
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
		
		pieDis();
	});
	function pieDis(){
// 		app.title = '环形图';

		option1 = {
		    tooltip: {
		        trigger: 'item',
		        formatter: "{a} <br/>{b}: {c} ({d}%)"
		    },
		    legend: {
		        orient: 'vertical',
		        x: 'left',
		        data:['清洁能源','火电','核电']
		    },
		    series: [
		        {
		            name:'访问来源',
		            type:'pie',
		            radius: ['50%', '70%'],
		            avoidLabelOverlap: false,
		            label: {
		                normal: {
		                    show: false,
		                    position: 'center'
		                },
		                emphasis: {
		                    show: true,
		                    textStyle: {
		                        fontSize: '30',
		                        fontWeight: 'bold'
		                    }
		                }
		            },
		            labelLine: {
		                normal: {
		                    show: false
		                }
		            },
		            data:[
		                {value:5082, name:'清洁能源'},
		                {value:31041, name:'火电'},
		                {value:7695, name:'核电'}
		            ]
		        }
		    ]
		};
		option = {
			    tooltip: {
			        trigger: 'item',
			        formatter: "{a} <br/>{b}: {c} ({d}%)"
			    },
			    legend: {
			        orient: 'vertical',
			        x: 'left',
			        data:['火电','水电','风电','核电','光伏']
			    },
			    series: [
			        {
			            name:'日电量',
			            type:'pie',
			            selectedMode: 'single',
			            radius: [0, '30%'],

			            label: {
			                normal: {
			                    position: 'inner'
			                }
			            },
			            labelLine: {
			                normal: {
			                    show: false
			                }
			            },
			            data:[
			                {value:22538, name:'火电', selected:true},
			                {value:16809, name:'清洁能源'},
			            ]
			        },
			        {
			            name:'日电量',
			            type:'pie',
			            radius: ['40%', '55%'],
			            data:[
			                {value:22538, name:'火电'},
			                {value:171, name:'水电'},
			                {value:5236, name:'风电'},
			                {value:10585, name:'核电'},
			                {value:817, name:'光伏'}
			            ]
			        }
			    ]
			};
		var myChart = echarts.init(document.getElementById('pieContainer'));
		myChart.setOption(option);
		


	}
    </script>
</body>
</html>