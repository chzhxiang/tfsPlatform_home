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
<title>添加客账户</title>
</head>
<body>
<div class="pd-20">
	<form action="" method="post" class="form form-horizontal" id="form-custacct-add">
		<div class="text-c"> 输入查询条件：
		<input type="text" class="input-text" style="width:250px" placeholder="请输入证件号码" id="psptId" name="psptId">
		<button type="submit" class="btn btn-success radius" id="searchAccounts" name=""><i class="Hui-iconfont">&#xe665;</i> 搜索</button>
		</div>
		<div class="row cl">
			<label class="form-label col-3"><span class="c-red">*</span>客户名称：</label>
			<div class="formControls col-5">
				<input type="text" class="input-text" value="" placeholder="客户名称" id="custName" name="custName" datatype="*2-16" nullmsg="客户名称不能为空">
			</div>
			<div class="col-4"> </div>
		</div>
		<div class="row cl">
			<label class="form-label col-3"><span class="c-red">*</span>客户状态：</label>
			<div class="formControls col-5"> <span class="select-box" style="width:150px;">
				<select class="select" name="custState" size="1">
					<option value="0">在网</option>
					<option value="1">潜在</option>
				</select>
				</span> </div>
		</div>
		<div class="row cl">
			<label class="form-label col-3"><span class="c-red">*</span>证件类别：</label>
			<div class="formControls col-5"> <span class="select-box" style="width:150px;">
				<select class="select" name="psptTypeCode" size="1">
					<option value="0">身份证</option>
					<option value="1">驾驶证</option>
				</select>
				</span> </div>
		</div>
		<div class="row cl">
			<label class="form-label col-3"><span class="c-red">*</span>证件号码：</label>
			<div class="formControls col-5">
				<input type="text" class="input-text" value="" placeholder="证件号码" id="psptId" name="psptId" datatype="*2-16" nullmsg="证件号不能为空">
			</div>
			<div class="col-4"> </div>
		</div>
		<div class="row cl">
			<label class="form-label col-3">归属地市：</label>
			<div class="formControls col-5">
				<input type="text" class="input-text" value="" placeholder="归属地市" id="eparchyCode" name="eparchyCode" datatype="*2-16" >
			</div>
			<div class="col-4"> </div>
		</div>
		<div class="row cl">
			<label class="form-label col-3">归属业务区：</label>
			<div class="formControls col-5">
				<input type="text" class="input-text" value="" placeholder="归属业务区" id="cityCode" name="cityCode" datatype="*2-16" >
			</div>
			<div class="col-4"> </div>
		</div>
		<div class="row cl">
			<label class="form-label col-3"><span class="c-red">*</span>营业执照类型：</label>
			<div class="formControls col-5"> <span class="select-box" style="width:150px;">
				<select class="select" name="busiLicenceType" size="1">
					<option value="0">个人企业</option>
					<option value="1">国有企业</option>
				</select>
				</span> </div>
		</div>
		<div class="row cl">
			<label class="form-label col-3"><span class="c-red">*</span>营业执照号码：</label>
			<div class="formControls col-5">
				<input type="text" class="input-text" value="" placeholder="营业执照号码" id="busiLicenceNo" name="busiLicenceNo" datatype="*2-16" nullmsg="营业执照号码不能为空">
			</div>
			<div class="col-4"> </div>
		</div>
		<div class="row cl">
			<label class="form-label col-3"><span class="c-red">*</span>营业执照有效期：</label>
			<div class="formControls col-5">
				<input type="text" class="input-text" value="" placeholder="营业执照有效期" id="busiLicenceValidDate" name="busiLicenceValidDate" datatype="*2-16" nullmsg="营业执照有效期不能为空">
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

	function getCustAcct(psptId){
		var url = ""
		$.ajax({
			type:"post",
			url:url,
			dataType:'json'
		}).done(function(data){
			alert(data);
		})
	}

	
</script>
</body>
</html>