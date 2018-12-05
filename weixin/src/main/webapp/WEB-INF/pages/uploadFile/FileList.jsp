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
			$(arr).each(function(i,data){
				console.log(i+data);
				var oneRow = new Array();
				oneRow.push("<label><input type='checkbox' class='ace'><span class='lbl'></span></label>");
				oneRow.push(data.cFilename);
				oneRow.push(data.cFilesize);
				oneRow.push(data.cType);
				oneRow.push(data.cMark);
				oneRow.push(data.cDate);
				oneRow.push(data.cTime);
				oneRow.push("<a title='删除' href='javascript:;'  onclick='member_del(this,\'1\')' class='btn btn-xs btn-warning' ><i class='fa fa-trash  bigger-120'></i></a>");
				tableData.push(oneRow);
			});
			$("#uploadresListTable").dataTable({
				"data":tableData
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
        <a href="javascript:fileList()" class="btn btn-danger"><i class="fa fa-trash"></i>&nbsp;批量删除</a>
       </span>
       <span class="r_f">共：<b>2345</b>条</span>
     </div>
     <div class="list_style">
     <table class="table table-striped table-bordered table-hover" id="uploadresListTable">
     <thead>
		 <tr>
				<th width="25"><label><input type="checkbox" class="ace"><span class="lbl"></span></label></th>
				<th width="200">文件名</th>
				<th width="60">文件大小（k）</th>
				<th width="80">类型</th>
				<th width="220">说明</th>   
                <th width="80">日期</th>              
				<th width="80">时间</th>
				<th width="50">操作</th>
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
		var oTable1 = $('#sample-table').dataTable({
			"aaSorting" : [ [ 1, "desc" ] ],//默认第几个排序
			"bStateSave" : true,//状态保存
			"aoColumnDefs" : [
			//{"bVisible": false, "aTargets": [ 3 ]} //控制列的隐藏显示
			{
				"orderable" : false,
				"aTargets" : [ 0, 2, 3, 6 ]
			} // 制定列不参与排序
			]
		});

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

	/*用户-删除*/
	function member_del(obj, id) {
		layer.confirm('确认要删除吗？', function(index) {
			$(obj).parents("tr").remove();
			layer.msg('已删除!', {
				icon : 1,
				time : 1000
			});
		});
	}
	//积分浏览
	function integration_history(id) {
		layer.open({
			type : 1,
			title : '积分获取记录',
			area : [ '800px', '400px' ],
			shadeClose : true,
			content : $('#integration_history'),
		})
		$('#integration_history_list').dataTable({
			"aaSorting" : [ [ 1, "desc" ] ],//默认第几个排序
			"bStateSave" : true,//状态保存
			"aoColumnDefs" : [ {
				"bSortable" : false,
				"orderable" : false,
				"aTargets" : [ 0, 1 ]
			} ]
		});

	};
	//浏览记录

	function Browse_history(id) {
		layer.open({
			type : 1,
			title : '浏览记录',
			area : [ '800px', '400px' ],
			shadeClose : true,
			content : $('#Browse_history'),
		})
		$('#Browse_history_list').dataTable({
			"aaSorting" : [ [ 1, "desc" ] ],//默认第几个排序
			"bStateSave" : true,//状态保存
			"aoColumnDefs" : [ {
				"bSortable" : false,
				"orderable" : false,
				"aTargets" : [ 0, 1 ]
			} ]
		});
	}

	//购物记录
	function Order_history(id) {
		layer.open({
			type : 1,
			title : '购物记录',
			area : [ '800px', '400px' ],
			shadeClose : true,
			content : $('#Order_history'),
		});
		$('#Order_history_list').dataTable({
			"aaSorting" : [ [ 1, "desc" ] ],//默认第几个排序
			"bStateSave" : true,//状态保存
			"aoColumnDefs" : [ {
				"bSortable" : false,
				"orderable" : false,
				"aTargets" : [ 0, 1 ]
			} ]
		});
	}
</script>
