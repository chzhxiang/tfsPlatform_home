<%@ page contentType="text/html;charset=UTF-8" %>
<%@ page import="org.apache.shiro.web.filter.authc.FormAuthenticationFilter"%>
<%@ page import="org.apache.shiro.authc.ExcessiveAttemptsException"%>
<%@ page import="org.apache.shiro.authc.IncorrectCredentialsException"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>

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
<link href="css/H-ui.min.css" rel="stylesheet" type="text/css" />
<link href="css/H-ui.admin.css" rel="stylesheet" type="text/css" />
<link href="static/lib/icheck/icheck.css" rel="stylesheet" type="text/css" />
<link href="static/lib/Hui-iconfont/1.0.1/iconfont.css" rel="stylesheet" type="text/css" />
<!--[if IE 6]>
<script type="text/javascript" src="http://lib.h-ui.net/DD_belatedPNG_0.0.8a-min.js" ></script>
<script>DD_belatedPNG.fix('*');</script>
<![endif]-->
<title>新增账户</title>
</head>
<body>
<div class="pd-20">
	<form action="" method="post" class="form form-horizontal" id="form-custacct-add">
		<div class="row cl">
			<label class="form-label col-3"><span class="c-red">*</span>客户名称：</label>
			<div class="formControls col-5">
				<input type="text" class="input-text" value="" placeholder="客户名称" id="custName" name="custName" datatype="*2-16" nullmsg="客户名称不能为空">
			</div>
			<div class="col-4"> </div>
		</div>
		<div class="row cl">
			<label class="form-label col-3"><span class="c-red">*</span>账户名称：</label>
			<div class="formControls col-5">
				<input type="text" class="input-text" value="" placeholder="账户名称" id="payName" name="payName" datatype="*2-16" nullmsg="账户名称不能为空">
			</div>
			<div class="col-4"> </div>
		</div>
		<div class="row cl">
			<label class="form-label col-3">地市编码：</label>
			<div class="formControls col-5">
				<input type="text" class="input-text" value="" placeholder="地市编码" id="eparchyCode" name="eparchyCode" datatype="*2-16" >
			</div>
			<div class="col-4"> </div>
		</div>
		<div class="row cl">
			<label class="form-label col-3">归属业务区：</label>
			<div class="formControls col-5">
				<input type="text" class="input-text" value="" placeholder="归属业务区" id="cityCode" name="cityCode" datatype="*2-16">
			</div>
			<div class="col-4"> </div>
		</div>
		<div class="row cl">
			<label class="form-label col-3">Jasper账户标识：</label>
			<div class="formControls col-5">
				<input type="text" class="input-text" value="" placeholder="Jasper账户标识" id="oldAcctId" name="oldAcctId" datatype="*2-16">
			</div>
			<div class="col-4"> </div>
		</div>
		<div class="row cl">
			<label class="form-label col-3">账户密码：</label>
			<div class="formControls col-5">
				<input type="text" class="input-text" value="" placeholder="账户密码" id="acctPasswd" name="acctPasswd" datatype="*2-16">
			</div>
			<div class="col-4"> </div>
		</div>
		<div class="row cl">
			<label class="form-label col-3">付费类型：</label>
			<div class="formControls col-5">
				<input type="text" class="input-text" value="" placeholder="付费类型" id="payModeCode" name="payModeCode" datatype="*2-16">
			</div>
			<div class="col-4"> </div>
		</div>
		<div class="row cl">
			<label class="form-label col-3">账户积分：</label>
			<div class="formControls col-5">
				<input type="text" class="input-text" value="" placeholder="账户积分" id="scoreValue" name="scoreValue" datatype="*2-16">
			</div>
			<div class="col-4"> </div>
		</div>
		<div class="row cl">
			<label class="form-label col-3">信用等级：</label>
			<div class="formControls col-5">
				<input type="text" class="input-text" value="" placeholder="信用等级" id="creditClassId" name="creditClassId" datatype="*2-16">
			</div>
			<div class="col-4"> </div>
		</div>
		<div class="row cl">
			<label class="form-label col-3">基本信用度：</label>
			<div class="formControls col-5">
				<input type="text" class="input-text" value="" placeholder="基本信用度" id="basicCreditValue" name="basicCreditValue" datatype="*2-16">
			</div>
			<div class="col-4"> </div>
		</div>
		<div class="row cl">
			<label class="form-label col-3">信用度：</label>
			<div class="formControls col-5">
				<input type="text" class="input-text" value="" placeholder="信用度" id="creditValue" name="creditValue" datatype="*2-16">
			</div>
			<div class="col-4"> </div>
		</div>
		<div class="row cl">
			<label class="form-label col-3">信用控制规则ID：</label>
			<div class="formControls col-5">
				<input type="text" class="input-text" value="" placeholder="信用控制规则ID" id="creditControlId" name="creditControlId" datatype="*2-16">
			</div>
			<div class="col-4"> </div>
		</div>
		<div class="row cl">
			<label class="form-label col-3">代表用户标识：</label>
			<div class="formControls col-5">
				<input type="text" class="input-text" value="" placeholder="代表用户标识" id="debutyUserId" name="debutyUserId" datatype="*2-16">
			</div>
			<div class="col-4"> </div>
		</div>
		<div class="row cl">
			<label class="form-label col-3">代表号码：</label>
			<div class="formControls col-5">
				<input type="text" class="input-text" value="" placeholder="代表号码" id="debutyCode" name="debutyCode" datatype="*2-16">
			</div>
			<div class="col-4"> </div>
		</div>
		<div class="row cl">
			<label class="form-label col-3"><span class="c-red">*</span>合同号：</label>
			<div class="formControls col-5">
				<input type="text" class="input-text" value="" placeholder="合同号" id="contractNo" name="contractNo" datatype="*2-16" nullmsg="合同号不能为空">
			</div>
			<div class="col-4"> </div>
		</div>
		<div class="row cl">
			<label class="form-label col-3"><span class="c-red">*</span>入网类型：</label>
			<div class="formControls col-5"> <span class="select-box" style="width:150px;">
				<select class="select" name="netTypeCode" size="1">
					<option value="0">3G</option>
					<option value="1">4G</option>
				</select>
				</span> </div>
		</div>
		<div class="row cl">
			<div class="col-9 col-offset-3">
				<input class="btn btn-primary radius" type="submit" value="&nbsp;&nbsp;提交&nbsp;&nbsp;">
			</div>
		</div>
	</form>
</div>
<script type="text/javascript" src="static/lib/jquery/1.9.1/jquery.min.js"></script> 
<script type="text/javascript" src="static/lib/icheck/jquery.icheck.min.js"></script> 
<script type="text/javascript" src="static/lib/Validform/5.3.2/Validform.min.js"></script> 
<script type="text/javascript" src="static/lib/layer/1.9.3/layer.js"></script>
<script type="text/javascript" src="static/lib/My97DatePicker/WdatePicker.js"></script> 
<script type="text/javascript" src="js/H-ui.js"></script> 
<script type="text/javascript" src="js/H-ui.admin.js"></script> 
<script type="text/javascript">
$(function(){
	$('.skin-minimal input').iCheck({
		checkboxClass: 'icheckbox-blue',
		radioClass: 'iradio-blue',
		increaseArea: '20%'
	});
	
	$("#form-admin-add").Validform({
		tiptype:2,
		callback:function(form){
			form[0].submit();
			var index = parent.layer.getFrameIndex(window.name);
			parent.$('.btn-refresh').click();
			parent.layer.close(index);
		}
	});
});

</script>
</body>
</html>