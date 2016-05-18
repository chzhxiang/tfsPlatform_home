<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>

<html>
<head>
	<title>群组管理</title>
	
	<script>
	
	</script>
</head>

<body>
	<form id="inputForm" action="${ctx}/org/add" method="post" class="form-horizontal">
		<fieldset>
			<legend><small>群组新增</small></legend>
			<div class="control-group">
				<label for="orgId" class="control-label">群组标识:</label>
				<div class="controls">
					<input type="text" id="orgId" name="orgId" class="input-large required" minlength="3"/>
				</div>
			</div>
			<div class="control-group">
				<label for="custId" class="control-label">归属客户标识（车企）:</label>
				<div class="controls">
					<input type="text" id="custId" name="custId" class="input-large required" minlength="3"/>
				</div>
			</div>
			<div class="control-group">
				<label for="orgName" class="control-label">群组名称:</label>
				<div class="controls">
					<input type="text" id="orgName" name="orgName" class="input-large required"/>
				</div>
			</div>
			<div class="control-group">
				<label for="parentOrgId" class="control-label">父群组标识:</label>
				<div class="controls">
					<input type="text" id="parentOrgId" name="parentOrgId" class="input-large required"/>
				</div>
			</div>
			<div class="control-group">
				<label for="orgType" class="control-label">群组类型:</label>
				<div class="controls">
					<input type="text" id="orgType" name="orgType" class="input-large required"/>
				</div>
			</div>
			<div class="control-group">
				<label for="orgTypeCode" class="control-label">群组类型值:</label>
				<div class="controls">
					<input type="text" id="orgTypeCode" name="orgTypeCode" class="input-large required"/>
				</div>
			</div>
			<div class="control-group">
				<label for="remark" class="control-label">备注:</label>
				<div class="controls">
					<input type="text" id="remark" name="remark" class="input-large required"/>
				</div>
			</div>
			<div class="form-actions">
				<input id="submit_btn" class="btn btn-primary radius" type="submit" value="新增"/>&nbsp;	
				<input id="cancel_btn" class="btn" type="button" value="清空" onclick="history.back()"/>
			</div>
		</fieldset>
	</form>
</body>
</html>
