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
<script src="<%=basePath %>statics/jquerymobile/jquery.min.js"></script>
<script src="<%=basePath %>statics/jquerymobile/jquery.mobile-1.4.5.min.js"></script>
<style type="text/css">
</style>
<script>
	$(function () {
// 		var todayDate = new Date();
		
// 		opt_date.dateFormat = 'yyy-mm';
// 		opt_date.startYear = todayDate.getFullYear()-2;
// 		opt_date.endYear = todayDate.getFullYear()+2;
// 		$("#strDate").mobiscroll(opt_date);
	});
</script>
</head>
<body>

<div data-role="page" id="pageone" data-theme="j">

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
	
	<div data-role="header" data-position="fixed">
		<a href="#myPanel" class="ui-btn ui-corner-all ui-shadow ui-icon-home ui-btn-icon-left">主页</a>
		<h1>Fixed 页眉</h1>
	</div>
	
	<div data-role="main" class="ui-content">
		<p>我现在是一个移动端开发者!!</p>
		<p>点击链接查看淡入效果 (页面从右至左淡入)。</p>
		<a href="#pagetwo" data-transition="slide">淡入第二个页面</a>
		
		<form method="post" action="demo_form.php">
	      <div class="ui-field-contain">
			<label for="fullname">全名：</label>
			<input type="text" name="fullname" id="fullname">       
			<label for="bday">生日：</label>
			<input type="date" name="bday" id="bday">
			<label for="email">E-mail:</label>
			<input type="email" name="email" id="email" placeholder="你的电子邮箱..">
	
			<label for="info">附加信息:</label>
			<textarea name="addinfo" id="info"></textarea>
			<label for="search">搜索：</label>
			<input type="search" name="search" id="search" placeholder="搜索内容...">
			<fieldset data-role="controlgroup">
				<legend>请选择您的性别：</legend>
				<label for="male">男性</label>
				<input type="radio" name="gender" id="male" value="male">
				<label for="female">女性</label>
				<input type="radio" name="gender" id="female" value="female"> 
			</fieldset>
			
			<fieldset data-role="controlgroup">
				<legend>请选择您喜爱的颜色：</legend>
				<label for="red">红色</label>
				<input type="checkbox" name="favcolor" id="red" value="red">
				<label for="green">绿色</label>
				<input type="checkbox" name="favcolor" id="green" value="green">
				<label for="blue">蓝色</label>
				<input type="checkbox" name="favcolor" id="blue" value="blue">  
			</fieldset>
			
			
			<fieldset data-role="controlgroup" data-type="horizontal">
				<legend>请选择您的性别：</legend>
				<label for="male1">男性</label>
				<input type="radio" name="gender" id="male1" value="male" checked>
				<label for="female1">女性</label>
				<input type="radio" name="gender" id="female1" value="female"> 
			</fieldset>
			
			<fieldset data-role="controlgroup" data-type="horizontal">
				<legend>请选择您喜爱的颜色：</legend>
				<label for="red1">红色</label>
				<input type="checkbox" name="favcolor" id="red1" value="red" checked>
				<label for="green1">绿色</label>
				<input type="checkbox" name="favcolor" id="green1" value="green">
				<label for="blue1">蓝色</label>
				<input type="checkbox" name="favcolor" id="blue1" value="blue">  
			</fieldset>
	      </div>
	      <input type="submit" data-inline="true" value="提交">
	    </form>
	    
	    
		<div data-role="popup" id="myPopup" class="ui-content" style="min-width:250px;">
			<form method="post" action="demoform.php">
				<div>
					<h3>登录信息</h3>
					<label for="usrnm" class="ui-hidden-accessible">用户名:</label>
					<input type="text" name="user" id="usrnm" placeholder="用户名">
					<label for="pswd" class="ui-hidden-accessible">密码:</label>
					<input type="password" name="passw" id="pswd" placeholder="密码">
					<label for="log">保存登录</label>
					<input type="checkbox" name="login" id="log" value="1" data-mini="true">
					<input type="submit" data-inline="true" value="登录">
				</div>
			</form>
		</div>
	
		<a href="#myPopup" data-rel="popup" class="ui-btn ui-btn-inline ui-corner-all ui-icon-check ui-btn-icon-left">弹窗中使用表单</a>
	
	
		<label for="day">选择天</label>
		<select name="day" id="day">
			<option value="mon">星期一</option>
			<option value="tue">星期二</option>
			<option value="wed" selected>星期三</option>
			<option value="thu">星期四</option>
			<option value="fri">星期五</option>
			<option value="sat">星期六</option>
			<option value="sun">星期日</option>
		</select>
		
		<label for="day">选择天</label>
		<select name="day" id="day">
			<optgroup label="工作日">
				<option value="mon">星期一</option>
				<option value="tue">星期二</option>
				<option value="wed">星期三</option>
				<option value="thu">星期四</option>
				<option value="fri">星期五</option>
			</optgroup>
			<optgroup label="周末">
				<option value="sat" selected>星期六</option>
				<option value="sun">星期日</option>
			</optgroup>
		</select>
	
		<label for="points">进度:</label>
		<input type="range" name="points" id="points" value="50" min="0" max="100">
		
		<label for="switch">切换开关:</label>
		<input type="checkbox" data-role="flipswitch" name="switch" id="switch">
		<br>
	</div><!-- main -->
</div> 


<div data-role="page" id="pagetwo"  data-theme="j">
	<div data-role="header">
		<h1>欢迎来到我的主页</h1>
	</div>
	
	<div data-role="main" class="ui-content">
		<p>点击链接查看相反方向的淡入效果 (页面从左至右淡入)。</p>
		<a href="#pageone" data-transition="slide" data-direction="reverse">淡入第一个页面(reversed)</a>
		
		<p>列切换模型会在宽度不够时隐藏数据。</p>
   
<h4>慢慢重置窗口大小。你会发现表格中的列会根据窗口的大小自动隐藏列。</h4>
<table data-role="table" data-mode="columntoggle" class="ui-responsive" id="myTable">
	<thead>
		<tr>
			<th data-priority="6">CustomerID</th>
			<th>CustomerName</th>
			<th data-priority="1">ContactName</th>
			<th data-priority="2">Address</th>
			<th data-priority="3">City</th>
			<th data-priority="4">PostalCode</th>
			<th data-priority="5">Country</th>
		</tr>
	</thead>
	<tbody>
		<tr>
			<td>1</td>
			<td>Alfreds Futterkiste</td>
			<td>Maria Anders</td>
			<td>Obere Str. 57</td>
			<td>Berlin</td>
			<td>12209</td>
			<td>Germany</td>
		</tr>
		<tr>
			<td>2</td>
			<td>Antonio Moreno Taquer</td>
			<td>Antonio Moreno</td>
			<td>Mataderos 2312</td>
			<td>Mico D.F.</td>
			<td>05023</td>
			<td>Mexico</td>
		</tr>
		<tr>
			<td>3</td>
			<td>Around the Horn</td>
			<td>Thomas Hardy</td>
			<td>120 Hanover Sq.</td>
			<td>London</td>
			<td>WA1 1DP</td>
			<td>UK</td>
		</tr>
		<tr>
			<td>4</td>
			<td>Berglunds snabbk</td>
			<td>Christina Berglund</td>
			<td>Berguvsven 8</td>
			<td>Lule</td>
			<td>S-958 22</td>
			<td>Sweden</td>
		</tr>
	</tbody>
</table>
	</div>
	
	<div data-role="footer">
		<h1>底部文本</h1>
	</div>
</div>


</body>
</html>