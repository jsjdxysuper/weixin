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
<script src="<%=basePath %>statics/echart/echart.min.js"></script>
<script src="<%=basePath %>statics/Utili.js"></script>
<style type="text/css">
	#container {
		margin-top:50px;
		display: flex;
		flex-direction: row;
		align-items: center;
		justify-content:space-between;
	}
	tr {
		border-bottom: 1px solid lightgray;
	}
	table{
		text-align: center!important;
	}
	td{
		text-align: center!important;
	}
	th{
		text-align: center!important;
	}
</style>
</head>
<body>

<div data-role="page" data-theme="k">
	<%@ include file="PanelLight.jsp" %>
	
	<div data-role="main" class="ui-content">
		<a href="#myPanel" class="fa fa-th fa-2x" 
			style="position: fixed;
				left: 20px;
				top: 20px;color:rgba(0,100,100,0.4);
				background-color:rgba(255,255,255,0);text-decoration:none;z-index:100"></a>
		<div class="ui-grid-a" id="container">
			<div class="ui-block-a"><input  type="text" name="strDate" id="strDate" data-inline="true" data-role="datebox"></div>
			<div class="ui-block-b" style="width:80px;"><button class="ui-mini" onclick="queryDate()"  >查询</button></div>
		</div>
		<!-- 为 ECharts 准备一个具备大小（宽高）的 DOM -->
    	<div id="main" style="height:400px;margin-bottom:30px;"></div>
	    
	    <table data-role="table" data-column-btn-theme="null" data-column-btn-text="" data-mode="columntoggle:none"  class="ui-responsive ui-shadow" id="myTable">
      <thead>
        <tr>
          <th>省调预测</th>
          <th>时刻</th>
          <th>出力（兆瓦）</th>
        </tr>
      </thead>
      <tbody>
        <tr>
          <td>最大值</td>
          <td>12:00</td>
          <td>1288.49</td>
        </tr>
        <tr>
          <td>平均</td>
          <td></td>
          <td>700.21</td>
        </tr>
      </tbody>
    </table>
	</div>
</div> 
  <script type="text/javascript">
  $(document).ready(function () {
      // 基于准备好的dom，初始化echarts实例
      var myChart = echarts.init(document.getElementById('main'));
		var xAxisTimes = ['00:00',
	        	'00:15','00:30','00:45','01:00',
		        	'01:15','01:30','01:45','02:00',
		        	'02:15','02:30','02:45','03:00',
		        	'03:15','03:30','03:45','04:00',
		        	'04:15','04:30','04:45','05:00',
		        	'05:15','05:30','05:45','06:00',
		        	'06:15','06:30','06:45','07:00',
		        	'07:15','07:30','07:45','08:00',
		        	'08:15','08:30','08:45','09:00',
		        	'09:15','09:30','09:45','10:00',
		        	'10:15','10:30','10:45','11:00',
		        	'11:15','11:30','11:45','12:00',
		        	'12:15','12:30','12:45','13:00',
		        	'13:15','13:30','13:45','14:00',
		        	'14:15','14:30','14:45','15:00',
		        	'15:15','15:30','15:45','16:00',
		        	'16:15','16:30','16:45','17:00',
		        	'17:15','17:30','17:45','18:00',
		        	'18:15','18:30','18:45','19:00',
		        	'19:15','19:30','19:45','20:00',
		        	'20:15','20:30','20:45','21:00',
		        	'21:15','21:30','21:45','22:00',
		        	'22:15','22:30','22:45','23:00',
		        	'23:15','23:30','23:45'];
      // 指定图表的配置项和数据
      var option = {
    		  title:{
    			  text:"光功率预测",
    			  left:0,
    			  subtext:'单位：MW'
    		  },
    		  legend:{
    			  show:true,
    			  orient:'horizontal',
    			  left:'10%',
    			  bottom:'3%'
    			  },
    		tooltip:{
    			show:true,
//     			formatter: '{b0}<br/>{a0}: {c0}MW<br/>{a1}: {c1}MW<br/>{a2}: {c2}MW'
    			formatter:function(paras){
    				var ttStr = "";
    				ttStr+=xAxisTimes[paras[0].dataIndex]+"<br/>";
    				for(i=0;i<paras.length;i++)
   					{
    					ttStr += paras[i].seriesName+":"+paras[i].data+"<br/>"
   					}
    				
    				return ttStr;
    			}
    		},
    		axisPointer: {
//         		show:true
        	},
   		    xAxis: {
   		        type: 'category',
   		        data: xAxisTimes,
	 			axisPointer:{
	 				axis:'x',
	 				show:true
	 			}
   		    },
   		    yAxis: {
   		        type: 'value'
   		    },
   		    series: [{
   		        data: [0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
   		        	1.54,22.28,42.82,63.48,84.33,137.26,190.97,245.58,300.87,353.86,407.51,
   		        	461.93,517.03,562.77,608.99,655.61,702.63,733.09,763.81,794.29,824.77,
   		        	838.32,851.96,865.59,879.24,865.91,852.58,839.29,826.13,799.66,773.32,
   		        	746.86,720.59,665.14,610.26,555.98,502.34,436.1,370.98,306.67,243.38,
   		        	187.55,132.52,78.38,25.01,18.96,12.86,6.84,0.41,0.28,0.19,0.17,0.09,
   		        	0.09,0.11,0.11,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0],
   		        type: 'line',
   		        symbol:'diamond',
   		        name:'省公司'
   		    },
   		 {
		        data: [175.55,159.05,165.99,161.1,167.46,165.22,171.37,151.97,166.42,173.54,162.38,163.9,
		        	165.46,194.73,172.41,167.01,183.13,178.18,171.25,170.45,177.33,157.8,163.88,195.62,
		        	166.86,181.57,237.68,229.92,289.05,339.83,364.38,416.5,448.49,490.67,539.16,583.57,
		        	577.68,666.73,659.91,693.22,767.66,783.51,822.91,846.15,841.51,840.45,842.27,849.01,
		        	861.37,825.46,834.54,794.3,781.06,752.5,712.62,668.08,654.91,616.76,559.41,534.89,
		        	465.55,427.01,357.56,347.4,303.07,265.05,230.2,191.71,177.33,170.09,149.92,161.96,
		        	182.2,162.42,172.23,140.14,167.99,189.66,152.06,181.79,172.12,180.72,166.93,146.69,
		        	146.15,182.53,165.09,164.32,164.54,151.16,168.68,183.12,187.56,141.47,154.04,132.14],
		        type: 'line',
		        symbol:'diamond',
		        name:'场站'
		    },
			{
   		        data: [0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,-1.815,-1.875,-1.857,-1.558,-1.501,
   		        	-1.855,-1.811,-1.936,-1.423,2.589,16.273,42.497,79.079,117.358,161.839,
   		        	209.953,264.807,305.885,373.709,437.248,461.106,517.915,548.678,640.514,
   		        	697.93,718.486,743.452
   		        	],
   		        type: 'line',
   		     	symbol:'diamond',
   		        name:'实际'
   		    }]
      };

      // 使用刚指定的配置项和数据显示图表。
      myChart.setOption(option);
  });
  
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