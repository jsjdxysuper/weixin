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
        <script src="<%=basePath %>assets/layer/layer.js" type="text/javascript" ></script>          
        <script src="<%=basePath %>assets/js/jquery-ui-1.10.3.custom.min.js"></script>
		<script src="<%=basePath %>assets/js/jquery.ui.touch-punch.min.js"></script>
        <script src="<%=basePath %>assets/js/ace-elements.min.js"></script>
		<script src="<%=basePath %>assets/js/ace.min.js"></script>
<script type="text/javascript">
	$(function(){
		
	});
	function addUploadFile(){
		debugger;
		var trContent = $($("#uploadFileTable tbody tr")[0]).html();
		$("#uploadFileTable tbody").append("<tr>"+trContent+"</tr>");
// 		$("#uploadFileTable tbody").append("<tr>"+
// 			"<td><input id='upFile1' class='file-label' type='file' name='file'></td>"+
// 			"<td><input type='text' size='120'  name='mark' id='mark'/></td>"+
// 			"<td><input type='button' class='btn  btn-default' value='删除' onclick='deleteOneFileRec(this)'/></td>"+
// 			"</tr>");
	}
	
	function deleteOneFileRec(e){
		$($(e).parent().parent()).remove();
	}
</script>
<title>文件上传</title>

</head>

<body>
<div >
<h1>文件批量上传</h1>
<div><input class="btn  btn-default"  onclick="addUploadFile()" value="添加上传文件"/></div>
<!-- <form id="uploadFileForm" name="uploadFileForm"  -->
<%-- 	action="<%=basePath %>uploadFile/oneFile" method="post"  enctype="multipart/form-data"> --%>
<!-- <input type="file" name="file"> -->
<!-- <input type="submit" value="upload"/> -->
<!-- </form> -->
<!-- </div> -->

<div>
	<form id="uploadMultiFileForm" name="uploadMultiFileForm" 
		action="<%=basePath %>uploadFile/multiFile" method="post"  enctype="multipart/form-data">
		<table class="table table-striped table-bordered table-hover" id="uploadFileTable" width="80%">
		     <thead>
				 <tr>
						<th width="300">文件</th>
						<th>类别</th>
						<th >说明</th>
						<th width="120">操作</th>   
					</tr>
				</thead>
			<tbody>
				<tr>
					<td><input id="upFile1" class="file-label" type="file" name="file"></td>
					<td>
						<select name="fileType">
							<c:forEach items="${sysCodeList }" var="data">
								<option value="${data.cId }">${data.cName }</option>
							</c:forEach>
						</select>
					</td>
					<td><input type="text" size="120" name="mark" id="mark"/></td>
					<td><input type="button" class="btn  btn-default" value="删除" onclick="deleteOneFileRec(this)"/></td>
				</tr>
			</tbody>
		</table>
		<input type="submit" class="btn btn-primary" value="上传所有文件"/>
	</form>
</div>
</body>
</html>