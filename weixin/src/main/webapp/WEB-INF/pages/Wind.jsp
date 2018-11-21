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
	<%@ include file="PanelWind.jsp" %>
	
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
          <td>2203.75</td>
        </tr>
        <tr>
          <td>最小值</td>
          <td>18:00</td>
          <td>690.2</td>
        </tr>
        <tr>
          <td>平均</td>
          <td> </td>
          <td>1518.01</td>
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
    			  text:"风功率预测",
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
   		        data: [3307.51,3304.31,3304.53,3304.73,3305.65,3310.3,3308.46,3310.2,3312.16,3282.91,
   		        	3260.95,3238.53,3215.08,3186.48,3164.79,3139.31,3114.11,3074.75,3049.04,3056.11,
   		        	3062.68,3065.16,3076.45,3090.07,3103.32,3110.08,3119.07,3130.77,3142.32,3148.89,
   		        	3156.82,3161.91,3165.24,3169.54,3188.54,3204.79,3217.55,3263.57,3291.52,3323.82,
   		        	3357.61,3419.4,3456.5,3493.62,3531.29,3594.19,3644.92,3698.51,3747.18,3805.8,
   		        	3848.32,3889.06,3923.84,3957.04,3989.22,4019.94,4050.74,4043.03,4050.61,4054.08,
   		        	4055.27,3990.32,3952.29,3906.93,3857.6,3774.04,3704.82,3632.47,3563.37,3504.06,
   		        	3454.1,3406.82,3356.03,3336.21,3309.06,3280.45,3253.48,3229.74,3208.62,3187.71,
   		        	3164.23,3134.93,3096.29,3056.94,3015.32,2929.53,2884.84,2840.2,2798.47,2672.7,
   		        	2628.2,2588.06,2548.57,2477.9,2446.6,2419.45],
   		        type: 'line',
   		        symbol:'diamond',
   		        name:'省公司'
   		    },
   		 {
		        data: [3252.93,3264.4,3276.88,3282.01,3294.19,3301.3,3315.34,3327.52,3338.21,3347.44,
		        	3356.82,3365.12,3373.99,3377.01,3380.49,3386.11,3386.65,3387.05,3388.3,3385.1,
		        	3381.24,3375.01,3371,3365.09,3356.08,3336.54,3321.97,3304.49,3280.34,3248.04,3220.55,
		        	3189.98,3163.35,3130.76,3100.57,3071.01,3052.96,3038.28,3020.84,3006.6,2994.9,2985.71,
		        	2978.38,2970.34,2968.14,2968.47,2970.49,2969.4,2978.14,2978.89,2980.78,2981.08,2987.43,
		        	2998,3008.63,3020.36,3038.94,3072.46,3097.06,3133.19,3150.52,3168.05,3186.62,3202.93,3213.34,
		        	3220.29,3220.98,3229.47,3211.15,3194.99,3174.39,3157.55,3128.43,3096.76,3067.5,3041.35,3011.37,
		        	2970.94,2935.97,2894.71,2855.69,2810.32,2768.74,2732.2,2705.32,2693.4,2687.63,2687.21,2684.07,
		        	2672.99,2670.67,2665.12,2638.62,2600.4,2566.17,2529.25],
		        type: 'line',
		        symbol:'diamond',
		        name:'场站'
		    },
			{
   		        data: [3133.166,3095.614,3107.736,3162.435,3183.224,3193.979,3191.688,3205.5,3183.917,3178.924,
   		        	3201.186,3262.448,3277.339,3233.731,3170.078,3174.568,3175.904,3146.435,3138.783,3143.125,
   		        	3172.533,3132.191,3110.786,3138.19,3161.445,3119.192,3052.289,3006.709,2929.448,2876.273,2772.1,
   		        	2638.327,2536.232,2488.88,2420.429,2403.198,2425.559,2427.94,2421.925,2434.944,2449.463,2467.014
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