<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>

<html>
<head>
	<title>群组管理</title>
</head>
<link href="//cdnjs.cloudflare.com/ajax/libs/bootstrap-table/1.10.1/bootstrap-table.min.css" rel="stylesheet">
<script src="//cdnjs.cloudflare.com/ajax/libs/bootstrap-table/1.10.1/bootstrap-table.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/bootstrap-table/1.10.1/locale/bootstrap-table-zh-CN.min.js"></script>
<body>
	<c:if test="${not empty message}">
		<div id="message" class="alert alert-success"><button data-dismiss="alert" class="close">×</button>${message}</div>
	</c:if>
	<form role="form" >
	   <div class="form-group">
	      <label for="name">归属客户</label><input id="custId" name="custId" type="text" class="form-control" placeholder="请输入归属客户">
	      <label for="name">群组名称</label><input id="orgName" name="orgName" type="text" class="form-control" placeholder="请输入归属客户">
	   </div>
	   <button id="search" type="submit" class="btn btn-default">查询</button>
	   <div class="form-group" align="right">
	   	<a href="${ctx}/org/toAdd">新增</a>
	   </div>
	</form>
	<table id="contentTable" class="table table-striped table-bordered table-condensed">
		<thead><tr><th>归属客户</th><th>群组名称</th><th>父群组标识</th><th>群组类型</th><th>群组类型值</th><th>备注</th><th>操作</th></tr></thead>
		<tbody>
		<c:forEach items="${orgDtos}" var="org">
			<tr>
				<td>${org.custId}</td>
				<td><a href="${ctx}/org/update/${org.orgId}">${org.orgName}</a></td>
				<td>${org.parentOrgId}</td>
				<td>${org.orgType}</td>
				<td>${org.orgTypeCode}</td>
				<td>${org.remark}</td>
				<td><a href="${ctx}/org/delete/${org.orgId}">删除</a></td>
			</tr>
		</c:forEach>
		</tbody>
	</table>
	
	<script type="text/javascript">
		$(function(){
			$("#search").click(search);
		});
		
		function search(){
			//得到查询条件
			var custId=$("#custId").val();
			var orgName=$("#orgName").val();
			$.ajax({
			   type: "POST",
			   url: "org/list",
			   data:{
				 //拼接查询条件
				 "custId":custId, 
				 "orgName":orgName,
			    },
			   dataType:"text",
			   success: function (data) {
				 
			   },
			   error: function(){
	              //请求出错处理
	              alert("Error!");
		       }
			});
		}
		
		
		/**
		 * form表单数据序列化 
		 * @param id 表单ID
		 * @returns
		 */

		function form2Json(id) {
		    var arr = $("#" + id).serializeArray();
		    var jsonStr = "";
		    jsonStr += '{';
		    for (var i = 0; i < arr.length; i++) {
		        jsonStr += '"' + arr[i].name + '":"' + arr[i].value + '",';
		    }
		    jsonStr = jsonStr.substring(0, (jsonStr.length - 1));
		    jsonStr += '}';
		    var json = JSON.parse(jsonStr);
		    
		    return json;
		}
	</script>
</body>
	
</html>
