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
        <link href="<%=basePath %>assets/css/bootstrap.min.css" rel="stylesheet" />
        <link rel="stylesheet" href="<%=basePath %>css/style.css"/>       
        <link href="<%=basePath %>assets/css/codemirror.css" rel="stylesheet">
        <link rel="stylesheet" href="<%=basePath %>assets/css/ace.min.css" />
        <link rel="stylesheet" href="<%=basePath %>assets/css/font-awesome.min.css" />
        <link rel="stylesheet" href="<%=basePath %>assets/bootstrap-plugin/bootstrap-combobox.css" />
		<!--[if IE 7]>
		  <link rel="stylesheet" href="assets/css/font-awesome-ie7.min.css" />
		<![endif]-->
        <!--[if lte IE 8]>
		  <link rel="stylesheet" href="assets/css/ace-ie.min.css" />
		<![endif]-->
			<script src="<%=basePath %>assets/js/jquery.min.js"></script>

		<!-- <![endif]-->

		<!--[if IE]>
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>
<![endif]-->

		<!--[if !IE]> -->

		<script type="text/javascript">
			window.jQuery || document.write("<script src='<%=basePath %>assets/js/jquery-2.0.3.min.js'>"+"<"+"/script>");
		</script>

		<!-- <![endif]-->

		<!--[if IE]>
<script type="text/javascript">
 window.jQuery || document.write("<script src='assets/js/jquery-1.10.2.min.js'>"+"<"+"/script>");
</script>
<![endif]-->

		<script type="text/javascript">
			if("ontouchend" in document) document.write("<script src='<%=basePath %>assets/js/jquery.mobile.custom.min.js'>"+"<"+"/script>");
		</script>
		<script src="<%=basePath %>assets/js/bootstrap.min.js"></script>
		<script src="<%=basePath %>assets/js/typeahead-bs2.min.js"></script>
		<!-- page specific plugin scripts -->
		<script src="<%=basePath %>assets/js/jquery.dataTables.min.js"></script>
		<script src="<%=basePath %>assets/js/jquery.dataTables.bootstrap.js"></script>
        <script type="text/javascript" src="<%=basePath %>js/H-ui.js"></script> 
        <script type="text/javascript" src="<%=basePath %>js/H-ui.admin.js"></script> 
        <script src="<%=basePath %>assets/layer/layer.js" type="text/javascript" ></script>
        <script src="<%=basePath %>assets/laydate/laydate.js" type="text/javascript"></script>
        <script src="<%=basePath %>assets/bootstrap-plugin/bootstrap-combobox.js" type="text/javascript"></script>
<title>用户列表</title>
</head>

<body>
<div class="page-content clearfix">
    <div id="Member_Ratings">
      <div class="d_Confirm_Order_style">
    <div class="search_style">
     
      <ul class="search_content clearfix">
       <li><label class="l_f">会员名称</label><input name="" type="text"  class="text_add" placeholder="输入会员名称、电话、邮箱"  style=" width:400px"/></li>
       <li><label class="l_f">添加时间</label><input class="inline laydate-icon" id="start" style=" margin-left:10px;"></li>
       <li style="width:90px;"><button type="button" id="searchBtn" class="btn_search"><i class="icon-search"></i>查询</button></li>
      </ul>
    </div>
     <!---->
     <div class="border clearfix">
       <span class="l_f">
        <a href="javascript:void()" id="catagory_add" class="btn btn-warning"><i class="icon-plus"></i>添加用户</a>
        <a href="javascript:ovid()" class="btn btn-danger"><i class="icon-trash"></i>批量删除</a>
       </span>
       <span class="r_f">共：<b>2345</b>条</span>
     </div>
     <!---->
     <div class="table_menu_list">
       <table class="table table-striped table-bordered table-hover" id="catagoryTable">
		<thead>
		 <tr>
				<th width="25"><label><input type="checkbox" class="ace"><span class="lbl"></span></label></th>
				<th width="80">ID</th>
				<th width="100">名称</th>
				<th width="80">mark1</th>
				<th width="120">mark2</th>
				<th width="150">mark3</th>
				<th width="">图片</th>
				<th width="180">层级名称</th>
                <th width="100">层级id</th>
				<th width="70">父节点id</th>                
				<th width="250">排序</th>
				<th width="250">类别id</th>
				<th width="250">操作</th>
			</tr>
		</thead>
	<tbody>
      </tbody>
	</table>
   </div>
  </div>
 </div>
</div>
<!--添加目录图层-->
<div class="add_menber" id="add_catagory_style" style="display:none">
  <form class="form-inline">
    <ul class=" page-content">
    <li hidden="hidden"><input name="catagory.id"/></li>

     <li><label class="label_name">名&nbsp;&nbsp;&nbsp;&nbsp;称：</label><span class="add_name"><input value="" name="catagory.cName" type="text"  class="text_add" /></span><div class="prompt r_f"></div></li>
     <li><label class="label_name">mark1：</label><span class="add_name"><input name="catagory.cMark1" type="text"  class="text_add"/></span><div class="prompt r_f"></div></li>
     <li><label class="label_name">mark2：</label><span class="add_name"><input name="catagory.cMark2" type="text"  class="text_add"/></span><div class="prompt r_f"></div></li>
     <li><label class="label_name">mark3：</label><span class="add_name"><input name="catagory.cMark3" type="text"  class="text_add"/></span><div class="prompt r_f"></div></li>
     <li><label class="label_name">图片：</label><span class="add_name"><select name="catagory.cImage" id="imageCombobox" ><option>dd</option><option>ab</option><option>bb</option></select></span><div class="prompt r_f"></div></li>
     <li><label class="label_name">层级名称：</label><span class="add_name"><input name="catagory.cLayername" type="text"  class="text_add"/></span><div class="prompt r_f"></div></li>
     <li><label class="label_name">层级id：</label><span class="add_name"><input name="catagory.cLayerid" type="text"  class="text_add"/></span><div class="prompt r_f"></div></li>
     <li><label class="label_name">父节点id：</label><span class="add_name"><select name="catagory.cParentid"><option>dd</option></select></span><div class="prompt r_f"></div></li>
     <li><label class="label_name">排序：</label><span class="add_name"><input name="catagory.cIndex" type="text"  class="text_add"/></span><div class="prompt r_f"></div></li>
     <li><label class="label_name">类别id：</label><span class="add_name"><input name="catagory.cType" type="text"  class="text_add"/></span><div class="prompt r_f"></div></li>
    </ul>
    </form>
 </div>
</body>
</html>
<script>
function searchData() {
	$.ajax({
		type: "POST",
		url: "<%=basePath %>/catagory/list",
		dataType:"json",
		data: {},
		success: function(msg){
			$(msg).each(function(i,data){
				data.check="<label><input type='checkbox' class='ace'><span class='lbl'></span></label>";
				data.dealWith="<a onClick=\"member_stop(this,'10001')\"  href=\"javascript:;\" title=\"停用\"  class=\"btn btn-xs btn-success\"><i class=\"icon-ok bigger-120\"></i></a> "
		          +"<a title=\"编辑\" onclick=\"member_edit('510')\" href=\"javascript:;\"  class=\"btn btn-xs btn-info\" ><i class=\"icon-edit bigger-120\"></i></a> "
		          +"<a title=\"删除\" href=\"javascript:;\"  onclick=\"member_del(this,'1')\" class=\"btn btn-xs btn-warning\" ><i class=\"icon-trash  bigger-120\"></i>";
			});
			$("#catagoryTable").DataTable({
				data:msg,
				columns:[
					{data:'check'},
					{data:'cUid'},
					{data:'cName'},
					{data:'cMark1'},
					{data:'cMark2'},
					{data:'cMark3'},
					{data:'cImage'},
					{data:'cLayername'},
					{data:'cLayerid'},
					{data:'cParentid'},
					{data:'cIndex'},
					{data:'cType'},
					{data:'dealWith'}
					
				],
				destroy: true,
				bAutoWidth: false//是否自动宽度
			});
		},
		error:function(){
		
		}
	});
}
jQuery(function($) {
	$('.combobox').combobox();
	$('#searchBtn').bind('click',searchData);
	searchData();
	
	
				var oTable1 = $('#sample-table').dataTable( {
				"aaSorting": [[ 1, "desc" ]],//默认第几个排序
		"bStateSave": true,//状态保存
		"aoColumnDefs": [
		  //{"bVisible": false, "aTargets": [ 3 ]} //控制列的隐藏显示
		  {"orderable":false,"aTargets":[0,8,9]}// 制定列不参与排序
		] } );
				
				
				$('table th input:checkbox').on('click' , function(){
					var that = this;
					$(this).closest('table').find('tr > td:first-child input:checkbox')
					.each(function(){
						this.checked = that.checked;
						$(this).closest('tr').toggleClass('selected');
					});
						
				});
			
			
				$('[data-rel="tooltip"]').tooltip({placement: tooltip_placement});
				function tooltip_placement(context, source) {
					var $source = $(source);
					var $parent = $source.closest('table')
					var off1 = $parent.offset();
					var w1 = $parent.width();
			
					var off2 = $source.offset();
					var w2 = $source.width();
			
					if( parseInt(off2.left) < parseInt(off1.left) + parseInt(w1 / 2) ) return 'right';
					return 'left';
				}
			});
function dialogEraser(){
	
}
function dialogBackfill(){
	
}
function dialogDis(){
	//图片下拉列表
	$.ajax({
		type: "POST",
		url: "<%=basePath %>/catagory/picFileList",
		dataType:"json",
		data: {},
		success: function(msg){
			//debugger;
			$("#imageCombobox").empty();
			$(msg).each(function(i,data){
				$("select[name='catagory.cImage']").append("<option value='"+data.cFilename+"'>"+data.cFilename+"</option>");
			});
			
		},
		error:function(){
		
		}
	});
	//父节点下拉列表
	$.ajax({
		type: "POST",
		url: "<%=basePath %>/catagory/list",
		dataType:"json",
		data: {},
		success: function(msg){
			//debugger;
			$("select[name='catagory.cParentid']").empty();
			$("select[name='catagory.cParentid']").append("<option value='null'>空</option>");
			$(msg).each(function(i,data){
				$("select[name='catagory.cParentid']").append("<option value='"+data.cUid+"'>"+data.cUid+"-"+data.cName+"</option>");
			});
			
		},
		error:function(){
		
		}
	});
    layer.open({
        type: 1,
        title: '添加类别',
		maxmin: true, 
		shadeClose: true, //点击遮罩关闭层
        area : ['800px' , ''],
        content:$('#add_catagory_style'),
		btn:['提交','取消'],
		yes:function(index,layero){
			
	        
	        var catagory = {};
	        catagory.cName = $("input[name='catagory.cName']").val();
	        catagory.cMark1 = $("input[name='catagory.cMark1']").val();
	        catagory.cMark2 = $("input[name='catagory.cMark2']").val();
	        catagory.cMark3 = $("input[name='catagory.cMark3']").val();
	        catagory.cImage = $("select[name='catagory.cImage']").val();
	        catagory.cLayername = $("input[name='catagory.cLayername']").val();
	        catagory.cLayerid = $("input[name='catagory.cLayerid']").val();
	        catagory.cIndex = $("input[name='catagory.cIndex']").val();
	        catagory.cType = $("input[name='catagory.cType']").val();
	        catagory.cParentid = $("select[name='catagory.cParentid']").val();
	        debugger;
	        
	        $.ajax({
	    		type: "POST",
	    		url: "<%=basePath %>/catagory/add",
	    		dataType:"json",
	    		data: {'catagory':catagory},
	    		success: function(msg){
	    			//debugger;
	    		},
	    		error:function(){
	    		
	    		}
	    	});
// 		 	var num=0;
// 		 	var str="";
// 			$(".add_menber input[type$='text']").each(function(n){
//           		if($(this).val()=="")
//           		{
// 				   layer.alert(str+=""+$(this).attr("name")+"不能为空！\r\n",{
// 	                	title: '提示框',				
// 						icon:0,								
//           			}); 
// 		    		num++;
//             		return false;            
//          		} 
// 		 	});
			
// 		  if(num>0){  return false;}	 	
//           else{
// 			  layer.alert('添加成功！',{
//                	title: '提示框',				
// 				icon:1,		
// 			  });
// 			  layer.close(index);	
// 		  }		
		  
		}
    });
}
/*用户-添加*/
 $('#catagory_add').on('click', dialogDis);
/*用户-查看*/
function member_show(title,url,id,w,h){
	layer_show(title,url+'#?='+id,w,h);
}
/*用户-停用*/
function member_stop(obj,id){
	layer.confirm('确认要停用吗？',function(index){
		$(obj).parents("tr").find(".td-manage").prepend('<a style="text-decoration:none" class="btn btn-xs " onClick="member_start(this,id)" href="javascript:;" title="启用"><i class="icon-ok bigger-120"></i></a>');
		$(obj).parents("tr").find(".td-status").html('<span class="label label-defaunt radius">已停用</span>');
		$(obj).remove();
		layer.msg('已停用!',{icon: 5,time:1000});
	});
}

/*用户-启用*/
function member_start(obj,id){
	layer.confirm('确认要启用吗？',function(index){
		$(obj).parents("tr").find(".td-manage").prepend('<a style="text-decoration:none" class="btn btn-xs btn-success" onClick="member_stop(this,id)" href="javascript:;" title="停用"><i class="icon-ok bigger-120"></i></a>');
		$(obj).parents("tr").find(".td-status").html('<span class="label label-success radius">已启用</span>');
		$(obj).remove();
		layer.msg('已启用!',{icon: 6,time:1000});
	});
}
/*用户-编辑*/
function member_edit(id){
	  layer.open({
        type: 1,
        title: '修改用户信息',
		maxmin: true, 
		shadeClose:false, //点击遮罩关闭层
        area : ['800px' , ''],
        content:$('#add_menber_style'),
		btn:['提交','取消'],
		yes:function(index,layero){	
		 var num=0;
		 var str="";
     $(".add_menber input[type$='text']").each(function(n){
          if($(this).val()=="")
          {
               
			   layer.alert(str+=""+$(this).attr("name")+"不能为空！\r\n",{
                title: '提示框',				
				icon:0,								
          }); 
		    num++;
            return false;            
          } 
		 });
		  if(num>0){  return false;}	 	
          else{
			  layer.alert('添加成功！',{
               title: '提示框',				
			icon:1,		
			  });
			   layer.close(index);	
		  }		  		     				
		}
    });
}
/*用户-删除*/
function member_del(obj,id){
	layer.confirm('确认要删除吗？',function(index){
		$(obj).parents("tr").remove();
		layer.msg('已删除!',{icon:1,time:1000});
	});
}
laydate({
    elem: '#start',
    event: 'focus' 
});

</script>