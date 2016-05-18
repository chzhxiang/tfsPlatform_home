<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>

<html>
<head>
	<title>联系人管理</title>
</head>
<script type="text/javascript" src="${ctx}/static/lib/jquery/1.9.1/jquery.min.js"></script> 
<script type="text/javascript" src="${ctx}/static/lib/layer/1.9.3/layer.js"></script> 
<script type="text/javascript" src="${ctx}/static/lib/My97DatePicker/WdatePicker.js"></script> 
<script type="text/javascript" src="${ctx}/static/lib/datatables/1.10.0/jquery.dataTables.min.js"></script> 
<script type="text/javascript" src="${ctx}/static/js/H-ui.js"></script> 
<script type="text/javascript" src="${ctx}/static/js/H-ui.admin.js"></script>
<body>
	<c:if test="${not empty message}">
		<div id="message" class="alert alert-success"><button data-dismiss="alert" class="close">×</button>${message}</div>
	</c:if>
	<div class="pd-20">
	<form role="form" >
	    <div class="form-group">
		所属群组：
      	<select id="orgId" name="orgId" class="select" size="1" style="width:150px"></select>
		联系人姓名：
      	<input type="text" class="input-text" style="width:250px" placeholder="请输入联系人姓名" id="contactName" name="contactName">
      	</div>
	   	<button id="search" type="submit" class="btn btn-success radius" id="" name=""><i class="Hui-iconfont">&#xe665;</i> 搜联系人</button>
	</form>
	<div class="cl pd-5 bg-1 bk-gray mt-20"> <span class="l"><a href="${ctx}/cust/toAdd" class="btn btn-primary radius"><i class="Hui-iconfont">&#xe600;</i> 添加联系人</a></span> <span class="r">共有数据：<strong>88</strong> 条</span> </div>
	<div class="mt-20">
	<table class="table table-border table-bordered table-hover table-bg table-sort">
		<thead>
			<tr class="text-c">
				<th width="25"><input type="checkbox" name="" value=""></th>
				<th width="80">联系信息标识</th>
				<th width="100">客户标识</th>
				<th width="80">是否客户本人</th>
				<th width="70">所属群组</th>
				<th width="90">联系人姓名</th>
				<th width="90">联系人电话</th>
				<th width="">联系人传真</th>
				<th width="130">联系人EMail</th>
				<th width="70">更新时间</th>
				<th width="100">操作</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${custContactDtos}" var="custContact">
			<tr class="text-c">
				<td><input type="checkbox" value="1" name=""></td>
				<td>${custContact.contactId}</td>
				<td><a href="${ctx}/cust/update/${custContact.contactId}">${custContact.custId}</a></td>
				<td>${custContact.myselfFlag}</td>
				<td>${custContact.orgId}</td>
				<td>${custContact.contactName}</td>
				<td>${custContact.contactPhone}</td>
				<td>${custContact.contactFax}</td>
				<td>${custContact.contactEmail}</td>
				<td>${custContact.updateTime}</td>
				<td class="td-manage"><a title="编辑" href="${ctx}/cust/update/${custContact.contactId}" class="ml-5" style="text-decoration:none"><i class="Hui-iconfont">&#xe6df;</i></a></td>
			</tr>
		</c:forEach>
		</tbody>
	</table>
	</div>
</div>


</body>
<script type="text/javascript">
$(document).ready(function(){
	var str="<option value=''>--请选择群组--</option>";  
	$.ajax({
		async: false,
	    url: "${ctx}/org/list",
	    type: "get",
	    dataType: "json",
	    success: function (data) {
	    	document.getElementById('orgId').options.length = 0;  //清空原有的option 
	    	for(var i=0;i<data.length;i++){
	    		str+="<option value='"+data[i].orgId+"'>"+data[i].orgName+"</option>";
	    	}  
	    }
	});
	$("#orgId").html(str);
})
</script> 
<script type="text/javascript">
$(function(){
	$("#search").click(function search(){
		//得到查询条件
		var updateTime=$("#updateTime").val();
		var contactName=$("#contactName").val();
		$.ajax({
		   type: "POST",
		   url: "cust/toList",
		   data:{
			 //拼接查询条件
			 "updateTime":updateTime, 
			 "contactName":contactName,
		    },
		   dataType:"text",
		   success: function (data) {
			 
		   },
		   error: function(){
	          //请求出错处理
	          alert("Error!");
	       }
		});
	});
});

</script> 
	
</html>
