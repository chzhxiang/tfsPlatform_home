<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>
<!DOCTYPE HTML>
<html>
<head>
<meta charset="utf-8">
<meta name="renderer" content="webkit|ie-comp|ie-stand">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no" />
<meta http-equiv="Cache-Control" content="no-siteapp" />
<!--[if lt IE 9]>
<script type="text/javascript" src="static/lib/html5.js"></script>
<script type="text/javascript" src="static/lib/respond.min.js"></script>
<script type="text/javascript" src="static/lib/PIE_IE678.js"></script>
<![endif]-->
<link href="${ctx}/css/H-ui.min.css" rel="stylesheet" type="text/css" />
<link href="${ctx}/css/H-ui.admin.css" rel="stylesheet" type="text/css" />
<link href="${ctx}/static/lib/icheck/icheck.css" rel="stylesheet" type="text/css" />
<link href="${ctx}/static/lib/Hui-iconfont/1.0.1/iconfont.css" rel="stylesheet" type="text/css" />
<!--[if IE 6]>
<script type="text/javascript" src="http://lib.h-ui.net/DD_belatedPNG_0.0.8a-min.js" ></script>
<script>DD_belatedPNG.fix('*');</script>
<![endif]-->
<title>账户列表</title>
</head>
<body>
<nav class="breadcrumb"><i class="Hui-iconfont">&#xe67f;</i> 首页 <span class="c-gray en">&gt;</span> 账户管理 <span class="c-gray en">&gt;</span> 账户列表 <a class="btn btn-success radius r mr-20" style="line-height:1.6em;margin-top:3px" href="javascript:location.replace(location.href);" title="刷新" ><i class="Hui-iconfont">&#xe68f;</i></a></nav>
<div class="pd-20">
	<div class="text-c"> 日期范围：
		<input type="text" onfocus="WdatePicker({maxDate:'#F{$dp.$D(\'datemax\')||\'%y-%M-%d\'}'})" id="datemin" class="input-text Wdate" style="width:120px;">
		-
		<input type="text" onfocus="WdatePicker({minDate:'#F{$dp.$D(\'datemin\')}',maxDate:'%y-%M-%d'})" id="datemax" class="input-text Wdate" style="width:120px;">
		<input type="text" class="input-text" style="width:250px" placeholder="" id="" name="">
		<button type="submit" class="btn btn-success" onclick="findAcctList()" id="custName" name="custName"><i class="Hui-iconfont">&#xe665;</i> 搜账户</button>
	</div>
	<div class="cl pd-5 bg-1 bk-gray mt-20"> <span class="l"><a href="javascript:;" onclick="datadel()" class="btn btn-danger radius"><i class="Hui-iconfont">&#xe6e2;</i> 批量删除</a> <a href="javascript:;" onclick="admin_add('添加管理员','admin-add.html','800','500')" class="btn btn-primary radius"><i class="Hui-iconfont">&#xe600;</i> 添加管理员</a></span> <span class="r">共有数据：<strong>54</strong> 条</span> </div>
	<table class="table table-border table-bordered table-bg">
		<thead>
			<tr>
				<th scope="col" colspan="9">账户列表</th>
			</tr>
			<tr class="text-c">
				<!-- <th width="25"><input type="checkbox" name="" value=""></th> -->
				<th width="40">CUST_ID</th>
				<th width="150">账户名称</th>
				<th width="90">入网类型</th>
				<th width="150">开户日期</th>
				<th width="130">更新日期</th>
				<th width="100">是否已启用</th>
				<th width="100">操作</th>
			</tr>
		</thead>
		<tbody id="tbodyId">
			<c:forEach items="${acctList}" var="item">
				<tr>
					<td>${item.acctId}</td>
					<td>${item.payName}</td>
					<td>${item.netTypeCode}</td>
					<td>${item.openDate}</td>
					<td>${item.updateTime}</td>
					<td>${item.removeTag}</td>
				</tr>	
			</c:forEach>
		</tbody>
	</table>
</div>
<script type="text/javascript" src="${ctx}/static/lib/jquery/1.9.1/jquery.min.js"></script>  
<script type="text/javascript" src="${ctx}/static/lib/layer/1.9.3/layer.js"></script> 
<script type="text/javascript" src="${ctx}/static/lib/laypage/1.2/laypage.js"></script> 
<script type="text/javascript" src="${ctx}/static/lib/My97DatePicker/WdatePicker.js"></script> 
<script type="text/javascript" src="${ctx}/js/H-ui.js"></script> 
<script type="text/javascript" src="${ctx}/js/H-ui.admin.js"></script> 

<script type="text/javascript">

 	$(document).ready(function(){
		findAcctList();
	}); 

	function findAcctList(){
		var custName = $("#custName").val();
 		var payName = $("#payName").val(); 
 		var param = "custName=" + " " + "&payName=" + "b";
		$.ajax({
			url:"${ctx}/tffaccount/list",
			type:"get",
			dataType:"json",
			data:param,
		}).done(function(data){
			var data = eval("("+data+")")
			var str = "";
			$("#tbodyId").each(data,function(index,item){
				$("#tbodyId").html("<tr class='text-c'>" +  
										"<th>" + item.acctId + "</th>" +
										"<th>" + item.payName + "</th>" +
										"<th>" + item.netTypeCode + "</th>" +
										"<th>" + item.openDate + "</th>" +
										"<th>" + item.updateTime + "</th>" +
										"<th>" + item.removeTag + "</th>" +
					               "</tr>")     
			});
		});
	} 

</script>

</body>
</html>