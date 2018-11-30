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
<script type="text/javascript">
	$(function(){
		
	});
</script>
<title>文件上传</title>

</head>

<body>
<h3><a href="javascript:history.back(-1)"><&lt:返回上一页</a></h3>
<h1>操作成功</h1>
</body>
</html>