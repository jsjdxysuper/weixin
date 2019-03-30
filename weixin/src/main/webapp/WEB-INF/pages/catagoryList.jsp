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
        <link rel="stylesheet" href="<%=basePath %>assets/font/css/font-awesome.min.css" />
        

		<script src="<%=basePath %>assets/js/jquery-1.10.2.min.js"></script>
		<script src="<%=basePath %>assets/js/bootstrap.min.js"></script>
		<script src="<%=basePath %>assets/js/suggest-plugin/bootstrap-suggest.min.js" type="text/javascript"></script>
		<script src="<%=basePath %>assets/js/typeahead-bs2.min.js"></script>
		<!-- page specific plugin scripts -->
		<script src="<%=basePath %>assets/js/jquery.dataTables.min.js"></script>
		<script src="<%=basePath %>assets/js/jquery.dataTables.bootstrap.js"></script>
        <script type="text/javascript" src="<%=basePath %>js/H-ui.js"></script> 
        <script type="text/javascript" src="<%=basePath %>js/H-ui.admin.js"></script> 
        <script src="<%=basePath %>assets/layer/layer.js" type="text/javascript" ></script>
        <script src="<%=basePath %>assets/laydate/laydate.js" type="text/javascript"></script>
       <style type="text/css">
.debug > .selected { color: #4cae4c }
#combo-tog { min-width: 100px }
#combo-group { height: 2.5em }
p .btn { width: 35% }
    </style> 
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
				<th width="100">ID</th>
				<th width="100">名称</th>
				<th width="110">mark1</th>
				<th width="120">mark2</th>
				<th width="150">mark3</th>
				<th width="300">图片</th>
				<th width="180">层级名称</th>
                <th width="100">层级id</th>
				<th width="70">父节点id</th>                
				<th width="50">排序</th>
				<th width="100">类别id</th>
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
<div class="add_menber" id="add_catagory_style" style="display:none" style="height:800px;">
  <form class="form-inline">
    <ul class=" page-content">
    <li hidden="hidden"><input name="catagory.id"/></li>

     <li><label class="label_name">名&nbsp;&nbsp;&nbsp;&nbsp;称：</label><span class="add_name"><input value="" name="catagory.cName" type="text"  class="text_add" /></span><div class="prompt r_f"></div></li>
     
     <li><label class="label_name">mark1：</label><span class="add_name"><input name="catagory.cMark1" type="text"  class="text_add"/></span><div class="prompt r_f"></div></li>
     <li><label class="label_name" >父节点id：</label>
		<div class="input-group"  >
		     <input type="text" class="text_add" id="cParentid11" style="width:97%;" name="catagory.cParentid11">
		     <div class="input-group-btn">
		         <button type="button" class="btn btn-default dropdown-toggle" data-toggle="dropdown">
		             <span class="caret"></span>
		         </button>
		         <ul class="dropdown-menu dropdown-menu-right" role="menu">
		         </ul>
		     </div>
		     <!-- /btn-group -->
		 </div>
     </li>
     <li><label class="label_name">mark2：</label><span class="add_name"><input name="catagory.cMark2" type="text"  class="text_add"/></span><div class="prompt r_f"></div></li>
     <li><label class="label_name">mark3：</label><span class="add_name"><input name="catagory.cMark3" type="text"  class="text_add"/></span><div class="prompt r_f"></div></li>
     <li><label class="label_name">图片：</label><span class="add_name"><select name="catagory.cImage" id="imageCombobox" ><option>dd</option><option>ab</option><option>bb</option></select></span><div class="prompt r_f"></div></li>
     <li><label class="label_name">层级名称：</label><span class="add_name">
     		<select name="catagory.cLayerid">
     			<option value="first">一级目录</option>
     			<option value="second">二级目录</option>
     			<option value="second">三级目录</option>
     		</select>
     		</span>
     		<div class="prompt r_f"></div>
     </li>
     <li><label class="label_name">排序：</label><span class="add_name"><input name="catagory.cIndex" type="text"  class="text_add"/></span><div class="prompt r_f"></div></li>
     <li><label class="label_name">类别id：</label><span class="add_name"><input name="catagory.cType" type="text"  class="text_add"/></span><div class="prompt r_f"></div></li>
    </ul>
    </form>
 </div>
</body>
</html>
<script>
var dtTable = null;
function searchData() {
	$.ajax({
		type: "POST",
		url: "<%=basePath %>/catagory/list",
		dataType:"json",
		data: {},
		success: function(msg){
			$(msg).each(function(i,data){
				data.check="<label><input type='checkbox' class='ace'><span class='lbl'></span></label>";
				data.dealWith="<a title=\"编辑\" onclick=\"member_edit(this)\" href=\"javascript:;\"  class=\"btn btn-xs btn-info\" ><i class=\"icon-edit bigger-120\"></i></a> "
		          +"<a title=\"删除\" href=\"javascript:;\"  onclick=\"member_del(this,"+data.cUid+")\" class=\"btn btn-xs btn-warning\" ><i class=\"icon-trash  bigger-120\"></i>";
			});
			dtTable = $("#catagoryTable").DataTable({
				data:msg,
				columns:[
					{data:'check',name:'check'},
					{data:'cUid',name:'cUid'},
					{data:'cName',name:'cName'},
					{data:'cMark1',name:'cMark1'},
					{data:'cMark2',name:'cMark2'},
					{data:'cMark3',name:'cMark3'},
					{data:'cImage',name:'cImage'},
					{data:'cLayername',name:'cLayername'},
					{data:'cLayerid',name:'cLayerid'},
					{data:'cParentid',name:'cParentid'},
					{data:'cIndex',name:'cIndex'},
					{data:'cType',name:'cType'},
					{data:'dealWith',name:'dealWith'}
					
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
	$("#cParentid11").bsSuggest('init',{
		clearable: true,
        url: "http://localhost:8080/weixin//catagory/Parentlist",
        idField: "cUid",
        keyField: "cName",
        showBtn: true,
        effectiveFields: ['cLayername','cName'],
        effectiveFieldsAlias: {'cLayername':'层级','cName':'名字'},
        showHeader: false,
        hideOnSelect: true,   
        autoDropup: true,
        listStyle: {
            'padding-top': 0,
            'max-height': '155px',
            'max-width': '260px',
            'overflow': 'auto',
            'width': 'auto',
            'transition': '0.3s',
            '-webkit-transition': '0.3s',
            '-moz-transition': '0.3s',
            '-o-transition': '0.3s'
        }
	}).on('onDataRequestSuccess', function (e, result) {
        console.log('onDataRequestSuccess: ', result);
    }).on('onSetSelectValue', function (e, keyword, data) {
        console.log('onSetSelectValue: ', keyword, data);
    }).on('onUnsetSelectValue', function () {
        console.log('onUnsetSelectValue');
    }).on('onShowDropdown', function (e, data) {
        console.log('onShowDropdown', e.target.value, data);
    }).on('onHideDropdown', function (e, data) {
        console.log('onHideDropdown', e.target.value, data);
    });

	$('#searchBtn').bind('click',searchData);
	searchData();
	/*用户-添加*/
	 $('#catagory_add').on('click', dialogDis);
	
	
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
	$("input[name='catagory.cName']").val('');
    $("input[name='catagory.cMark1']").val('');
    $("input[name='catagory.cMark2']").val('');
    $("input[name='catagory.cMark3']").val('');
    var options = $("select[name='catagory.cImage']").find("option");
    options.first().attr("selected", true);
    $("input[name='catagory.cLayername']").val('');
    $("input[name='catagory.cLayerid']").val('');
    $("input[name='catagory.cIndex']").val('');
    $("input[name='catagory.cType']").val('');
    options = $("select[name='catagory.cParentid']").find("option");
    options.first().attr("selected", true);
}
function dialogBackfill(editBtn){
	
	fill2Select().then(function(){
		var oneRowData = dtTable.row($(editBtn).parents('tr')).data();
		
		$("input[name='catagory.cName']").val(oneRowData.cName);
	    $("input[name='catagory.cMark1']").val(oneRowData.cMark1);
	    $("input[name='catagory.cMark2']").val(oneRowData.cMark2);
	    $("input[name='catagory.cMark3']").val(oneRowData.cMark3);
	    
	    $("input[name='catagory.cLayername']").val(oneRowData.cLayername);
	    $("input[name='catagory.cLayerid']").val(oneRowData.cLayerid);
	    $("input[name='catagory.cIndex']").val(oneRowData.cIndex);
	    $("input[name='catagory.cType']").val(oneRowData.cType);
	    
//	     $("select[name='catagory.cParentid']").find("option[value='"+oneRowData.cParentid+"']").prop("selected", true);
//	     $("select[name='catagory.cImage']").find("option[value='"+oneRowData.cImage+"']").prop("selected", true);
	    $("select[name='catagory.cParentid']").val(oneRowData.cParentid);
	    $("select[name='catagory.cImage']").val(oneRowData.cImage);
	    var options = $("select[name='catagory.cParentid']").find("option");
	    console.log(options.length);
//	     options
//	     options.first().attr("selected", true);
	    var options1 = $("select[name='catagory.cImage']").find("option");
	    console.log(options1.length);
//	     options.first().attr("selected", true);
	});


}
function fill2Select(){
	dialogPicListCtr();
	dialogParentListCtr();
}
/*用户-编辑*/
function member_edit(editBtn){
	dialogBackfill(editBtn);
	layer.open({
        type: 1,
        title: '修改类别',
		maxmin: true, 
		shadeClose: true, //点击遮罩关闭层
        area : ['800px' , ''],
        content:$('#add_catagory_style'),
		btn:['修改','取消'],
		yes:function(dialogIndex,layero){
			
	        
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
	        
	        $.ajax({
	    		type: "POST",
	    		url: "<%=basePath %>/catagory/add",
	    		dataType:"json",
	    		data: catagory,
	    		success: function(msg){
    				  layer.alert(msg.content,{
    		               	title: '提示框',				
    						icon:1,		
    					  });
    				  layer.close(dialogIndex);
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
// 	fill2Select(editBtn);
// 	  layer.open({
//         type: 1,
//         title: '修改用户信息',
// 		maxmin: true, 
// 		shadeClose:false, //点击遮罩关闭层
//         area : ['800px' , ''],
//         content:$('#add_menber_style'),
// 		btn:['提交','取消'],
// 		yes:function(index,layero){	
// 		 var num=0;
// 		 var str="";
//      $(".add_menber input[type$='text']").each(function(n){
//           if($(this).val()=="")
//           {
               
// 			   layer.alert(str+=""+$(this).attr("name")+"不能为空！\r\n",{
//                 title: '提示框',				
// 				icon:0,								
//           }); 
// 		    num++;
//             return false;            
//           } 
// 		 });
// 		  if(num>0){  return false;}	 	
//           else{
// 			  layer.alert('添加成功！',{
//                title: '提示框',				
// 			icon:1,		
// 			  });
// 			   layer.close(index);	
// 		  }		  		     				
// 		}
//     });
}
//图片下拉列表
function dialogPicListCtr(){
	$.ajax({
		type: "POST",
		url: "<%=basePath %>/catagory/picFileList",
		dataType:"json",
		data: {},
		success: function(msg){
			$("#imageCombobox").empty();
			$("select[name='catagory.cImage']").append("<option value='null'>空</option>");
			$(msg).each(function(i,data){
				$("select[name='catagory.cImage']").append("<option value='"+data.cFilename+"'>"+data.cFilename+"</option>");
			});
			
		},
		error:function(){
		
		}
	});
}

//父节点下拉列表
function dialogParentListCtr(){
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
}

function dialogDis(){
	
// 	dialogPicListCtr();
	//dialogParentListCtr();
// 	dialogEraser();
    layer.open({
        type: 1,
        title: '添加类别',
		maxmin: true, 
		shadeClose: true, //点击遮罩关闭层
        area : ['800px' , ''],
        content:$('#add_catagory_style'),
		btn:['添加','取消'],
		yes:function(dialogIndex,layero){
	        debugger;
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
	    		data: catagory,
	    		success: function(msg){
    				  layer.alert(msg.content,{
    		               	title: '提示框',				
    						icon:1,		
    					  });
    				  layer.close(dialogIndex);
	    		},
	    		error:function(){
	    		
	    		}
	    	});
	        
		}//yes,function
    });
}
	        

	        


/*用户-查看*/
// function member_show(title,url,id,w,h){
// 	layer_show(title,url+'#?='+id,w,h);
// }
/*用户-停用*/
// function member_stop(obj,id){
// 	layer.confirm('确认要停用吗？',function(index){
// 		$(obj).parents("tr").find(".td-manage").prepend('<a style="text-decoration:none" class="btn btn-xs " onClick="member_start(this,id)" href="javascript:;" title="启用"><i class="icon-ok bigger-120"></i></a>');
// 		$(obj).parents("tr").find(".td-status").html('<span class="label label-defaunt radius">已停用</span>');
// 		$(obj).remove();
// 		layer.msg('已停用!',{icon: 5,time:1000});
// 	});
// }

// /*用户-启用*/
// function member_start(obj,id){
// 	layer.confirm('确认要启用吗？',function(index){
// 		$(obj).parents("tr").find(".td-manage").prepend('<a style="text-decoration:none" class="btn btn-xs btn-success" onClick="member_stop(this,id)" href="javascript:;" title="停用"><i class="icon-ok bigger-120"></i></a>');
// 		$(obj).parents("tr").find(".td-status").html('<span class="label label-success radius">已启用</span>');
// 		$(obj).remove();
// 		layer.msg('已启用!',{icon: 6,time:1000});
// 	});
// }

/*用户-删除*/
function member_del(obj,id){
	debugger;
	layer.confirm('确认要删除吗？',function(index){
		
		$.ajax({
			type: "POST",
			url: "<%=basePath %>/catagory/del",
			dataType:"json",
			data: {catagoryId:id},
			success: function(msg){
				if(msg.code==1){
				  	$(obj).parents("tr").remove();
				}
				layer.msg(msg.msg,{icon:1,time:1000});
			},
			error:function(){
			
			}
		});
		
	});
	
	
}
laydate({
    elem: '#start',
    event: 'focus' 
});

</script>