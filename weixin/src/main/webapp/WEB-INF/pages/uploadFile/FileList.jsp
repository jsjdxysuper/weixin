<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="renderer" content="webkit|ie-comp|ie-stand">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta http-equiv="Cache-Control" content="no-siteapp" />
 <link href="<%=basePath %>assets/css/bootstrap.min.css" rel="stylesheet" />
        <link rel="stylesheet" href="<%=basePath %>css/style.css"/>       
        <link href="<%=basePath %>assets/css/codemirror.css" rel="stylesheet">
        <link rel="stylesheet" href="<%=basePath %>assets/css/ace.min.css" />
        <link rel="stylesheet" href="<%=basePath %>font/css/font-awesome.min.css" />
        <!--[if lte IE 8]>
		  <link rel="stylesheet" href="assets/css/ace-ie.min.css" />
		<![endif]-->
		<script src="<%=basePath %>js/jquery-1.9.1.min.js"></script>
        <script src="<%=basePath %>assets/js/bootstrap.min.js"></script>
		<script src="<%=basePath %>assets/js/typeahead-bs2.min.js"></script>           	
		<script src="<%=basePath %>assets/js/jquery.dataTables.min.js"></script>
		<script src="<%=basePath %>assets/js/jquery.dataTables.bootstrap.js"></script>
        <script src="<%=basePath %>assets/layer/layer.js" type="text/javascript" ></script>          
        <script src="<%=basePath %>assets/laydate/laydate.js" type="text/javascript"></script>
<title>积分管理</title>
<script type="text/javascript">
$(function(){
	fileList();
});
function fileList(){
	$.ajax({
		type: "POST",
		url: "<%=basePath %>uploadFile/list/info",
		dataType:"json",
		data: {},
		success: function(msg){
			var arr = $.parseJSON(msg.content);
			var tableData = new Array();
			$("#countAll").html(arr.length);
			$(arr).each(function(i,data){
				var oneRow = new Array();
				oneRow.push("<label><input type='checkbox' class='ace'><span class='lbl'></span></label>");
				oneRow.push(data.cFilename);
				oneRow.push(data.cFilesize);
				oneRow.push(data.cTypename);
				oneRow.push(data.cMark);
				oneRow.push(data.cDate);
				oneRow.push(data.cTime);
				oneRow.push("<a title='删除' href='javascript:;'  onclick=\"member_del(this,\'1\')\" class='btn btn-xs btn-warning' ><i class='fa fa-trash  bigger-120'></i></a>");
				tableData.push(oneRow);
			});

			var table = $("#uploadresListTable").dataTable({
				"data":tableData,
				destroy: true,
				bAutoWidth: false,//是否自动宽度
			});

		},
		error:function(){
		
		}
	});
}
</script>
</head>

<body>
<div class="margin clearfix">
 <div class="" id="Other_Management">
 <div class="search_style">

    </div>
    <div class="border clearfix">
       <span class="l_f">
        <a href="javascript:fileList()" class="btn btn-primary"><i class="fa fa-search"></i>&nbsp;查询</a>
        <a href="javascript:batchDel()" class="btn btn-danger"><i class="fa fa-trash"></i>&nbsp;批量删除</a>
       </span>
       <span class="r_f">共：<b id="countAll"></b>条</span>
     </div>
     <div class="list_style">
     <table class="table table-striped table-bordered table-hover" id="uploadresListTable">
     <thead>
		 <tr>
				<th width="25"><label><input type="checkbox" class="ace"><span class="lbl"></span></label></th>
				<th >文件名</th>
				<th >文件大小（k）</th>
				<th >类型</th>
				<th >说明</th>   
                <th >日期</th>              
				<th >时间</th>
				<th >操作</th>
			</tr>
		</thead>
	<tbody>
<!-- 		<tr> -->
<!--         <td><label><input type="checkbox" class="ace"><span class="lbl"></span></label></td> -->
<!--         <td>4577566</td> -->
<!--         <td>花海iatiant</td> -->
<!--         <td><a href="javascript:ovid()" onclick="integration_history('23')">3434</a></td> -->
<!--         <td><a href="javascript:ovid()" onclick="Browse_history('13')">3434</a></td> -->
<!--         <td><a href="javascript:ovid()" onclick="Order_history('33')">34</a></td> -->
<!--         <td> <a title="删除" href="javascript:;"  onclick="member_del(this,'1')" class="btn btn-xs btn-warning" ><i class="fa fa-trash  bigger-120"></i></a></td> -->
<!--         </tr> -->

        </tbody>    
     </table>     
     </div>
     
 </div>
</div>


</body>
</html>
<script>

	jQuery(function($) {
		$('table th input:checkbox').on(
				'click',
				function() {
					var that = this;
					$(this).closest('table').find(
							'tr > td:first-child input:checkbox').each(
							function() {
								this.checked = that.checked;
								$(this).closest('tr').toggleClass('selected');
							});

				});
	});
	function batchDel(){
		var checkboxList = $("#uploadresListTable").find('tr > td:first-child input:checkbox');
		debugger;
		var fileNameList = new Array();
		checkboxList.each(function(index,row){
			if($(row).prop("checked")){
				console.log(index+"选中");
				var fileNameOne = $($(row).closest('tr').children()[1]).html();
				fileNameList.push(fileNameOne);
			}
		});
		
		$.ajax({
			type: "POST",
			url: "<%=basePath %>uploadFile/list/batchDel",
			dataType:"json",
			data: {"fileNameArr":fileNameList},
			success: function(msg){
				debugger;
				layer.msg(msg.msg, {
					icon : 1,
					time : 1500
				});
				if(msg.code==1){
					fileList();
				}
				
			},
			error:function(){
			
			}
		});
	}
	/*用户-删除*/
	function member_del(obj, id) {
		layer.confirm('确认要删除吗？', function(index) {
			$(obj).parents("tr").remove();
			var fileName = $($(obj).parent().parent().children()[1]).html();
			
			$.ajax({
				type: "POST",
				url: "<%=basePath %>uploadFile/list/del",
				dataType:"json",
				data: {"fileName":fileName},
				success: function(msg){
					layer.msg(msg.msg, {
						icon : 1,
						time : 1500
					});
				},
				error:function(){
				
				}
			});
			
		});
	}

</script>
