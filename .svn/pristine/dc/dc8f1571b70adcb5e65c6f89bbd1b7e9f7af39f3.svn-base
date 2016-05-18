<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>

<html>
<head>
	<title>群组管理</title>
</head>

<body>
	<form id="inputForm" action="${ctx}/org/update" method="post" class="form-horizontal">
		<input type="hidden" id="orgId" name="orgId" value="${orgDto.orgId}"/>
		<fieldset>
			<legend><small>群组管理</small></legend>
			<div class="control-group">
				<label class="control-label">归属客户标识（车企）:</label>
				<div class="controls">
					<input type="text" id="custId" name="custId" value="${orgDto.custId}" class="input-large"/>
				</div>
			</div>
			<div class="control-group">
				<label class="control-label">群组名称:</label>
				<div class="controls">
					<input type="text" id="orgName" name="orgName" value="${orgDto.orgName}" class="input-large required"/>
				</div>
			</div>
			<div class="control-group">
				<label class="control-label">父群组标识:</label>
				<div class="controls">
					<input type="text" id="parentOrgId" name="parentOrgId" value="${orgDto.parentOrgId}" class="input-large required"/>
				</div>
			</div>
			<div class="control-group">
				<label class="control-label">群组类型:</label>
				<div class="controls">
					<input type="text" id="orgType" name="orgType" value="${orgDto.orgType}" class="input-large required"/>
				</div>
			</div>
			<div class="control-group">
				<label class="control-label">群组类型值:</label>
				<div class="controls">
					<input type="text" id="orgTypeCode" name="orgTypeCode" value="${orgDto.orgTypeCode}" class="input-large required"/>
				</div>
			</div>
			<div class="control-group">
				<label class="control-label">备注:</label>
				<div class="controls">
					<input type="text" id="remark" name="remark" value="${orgDto.remark}" class="input-large required"/>
				</div>
			</div>

			<div class="form-actions">
				<input id="submit_btn" class="btn btn-primary" type="submit" value="提交"/>&nbsp;	
				<input id="cancel_btn" class="btn" type="button" value="返回" onclick="history.back()"/>
			</div>
		</fieldset>
	</form>
	
	<script>
	
	</script>
</body>
</html>
