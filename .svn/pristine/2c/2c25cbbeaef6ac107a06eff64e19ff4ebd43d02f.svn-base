<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>
<html>
<head>
<title>添加联系人</title>

<script type="text/javascript" src="${ctx}/static/lib/jquery/1.9.1/jquery.min.js"></script> 
<script type="text/javascript" src="${ctx}/static/lib/layer/1.9.3/layer.js"></script> 
<script type="text/javascript" src="${ctx}/static/lib/My97DatePicker/WdatePicker.js"></script> 
<script type="text/javascript" src="${ctx}/static/lib/datatables/1.10.0/jquery.dataTables.min.js"></script> 
<script type="text/javascript" src="${ctx}/static/js/H-ui.js"></script> 
<script type="text/javascript" src="${ctx}/static/js/H-ui.admin.js"></script>
</head>
<body>
<form action="${ctx}/cust/${submitType}" method="post" class="form form-horizontal" id="form-member-add">
    <div class="row cl">
      <label class="form-label col-2"><span class="c-red">*</span>联系信息标识：</label>
      <div class="formControls col-2">
        <input type="text" class="input-text" value="${custContactDto.contactId}" placeholder="" id="contactId" name="contactId" nullmsg="联系信息标识不能为空">
      </div>
      <label class="form-label col-2"><span class="c-red">*</span>所属群组：</label>
      <div class="formControls col-2">
      	<select id="orgId" name="orgId" class="select" size="1" value="${custContactDto.orgId }" onchange="changeOrg(this.value)"></select>
        <%-- <input type="text" class="input-text" value="${custContactDto.orgId}" placeholder="" id="orgId" name="orgId"> --%>
      </div>
      <label class="form-label col-2"><span class="c-red">*</span>客户标识：</label>
      <div class="formControls col-2">
        <span class="select-box">
	        <select class="select" size="1" name="custId" id="custId">
	        	<option value="0">--请选择客户标识--</option> 
	        </select>
        </span>
      </div>
      <div class="col-2"> </div>
    </div>
    <div class="row cl">
      
      <label class="form-label col-2">是否客户本人：</label>
      <div class="formControls col-2"> 
      	<span class="select-box">
	        <select class="select" size="1" name="myselfFlag" id="myselfFlag">
	          <option value="" selected>--请选择--</option>
	          <option value="0" ${custContactDto.myselfFlag == 0 ? 'selected = "selected"' : '' }>否</option>
	          <option value="1" ${custContactDto.myselfFlag == 1 ? 'selected = "selected"' : '' }>是</option>
	        </select>
        </span>
      </div>
      <label class="form-label col-2">登录人标识:</label>
      <div class="formControls col-2">
        <input type="text" class="input-text" value="${custContactDto.staffId}" placeholder="" id="staffId" name="staffId" >
      </div>
      <label class="form-label col-2">联系人姓名：</label>
      <div class="formControls col-2">
        <input type="text" class="input-text" value="${custContactDto.contactName}" placeholder="" id="contactName" name="contactName" >
      </div>
      <div class="col-2"> </div>
    </div>
    <div class="row cl">
      <label class="form-label col-2">联系人电话：</label>
      <div class="formControls col-2">
        <input type="text" class="input-text" value="${custContactDto.contactPhone}" placeholder="" id="contactPhone" name="contactPhone" >
      </div>
      <label class="form-label col-2">联系人传真：</label>
      <div class="formControls col-2">
        <input type="text" class="input-text" value="${custContactDto.contactFax}" placeholder="" id="contactFax" name="contactFax" >
      </div>
      <label class="form-label col-2"><span class="c-red">*</span>联系人EMail:</label>
      <div class="formControls col-2">
        <input type="text" class="input-text" placeholder="@" name="contactEmail" id="contactEmail" value="${custContactDto.contactEmail}" nullmsg="请输入邮箱！">
      </div>
      <div class="col-2"> </div>
    </div>
    <div class="row cl">
      <label class="form-label col-2">联系人邮政编码:</label>
      <div class="formControls col-2">
        <input type="text" class="input-text" value="${custContactDto.contactPostCode}" placeholder="" id="contactPostCode" name="contactPostCode" >
      </div>
      <label class="form-label col-2">联系人通信地址:</label>
      <div class="formControls col-2">
        <input type="text" class="input-text" value="${custContactDto.contactPostAddr}" placeholder="" id="contactPostAddr" name="contactPostAddr" >
      </div>
      <label class="form-label col-2">联系人家庭地址:</label>
      <div class="formControls col-2">
        <input type="text" class="input-text" value="${custContactDto.contactHomeAddr}" placeholder="" id="contactHomeAddr" name="contactHomeAddr" >
      </div>
      <div class="col-2"> </div>
    </div>
    <div class="row cl">
      <label class="form-label col-2">联系人证件类型:</label>
      <div class="formControls col-2">
        <select class="select" name="contactPsptTypeCode" size="1">
        	<option value="">--请选择--</option>
			<option value="0">身份证</option>
			<option value="1">驾驶证</option>
		</select>
      </div>
      <label class="form-label col-2">联系人证件号码:</label>
      <div class="formControls col-2">
        <input type="text" class="input-text" value="${custContactDto.contactPsptId}" placeholder="" id="contactPsptId" name="contactPsptId" >
      </div>
      <label class="form-label col-2">联系人单位名称:</label>
      <div class="formControls col-2">
        <input type="text" class="input-text" value="${custContactDto.contactWorkName}" placeholder="" id="contactWorkName" name="contactWorkName" >
      </div>
      <div class="col-2"> </div>
    </div>
    <div class="row cl">
      <label class="form-label col-2">联系人单位地址：</label>
      <div class="formControls col-2">
        <input type="text" class="input-text" value="${custContactDto.contactWorkAddr}" placeholder="" id="contactWorkAddr" name="contactWorkAddr" >
      </div>
      <label class="form-label col-2">联系人所在部门：</label>
      <div class="formControls col-2">
        <input type="text" class="input-text" value="${custContactDto.contactDepart}" placeholder="" id="contactDepart" name="contactDepart" >
      </div>
      <label class="form-label col-2">联系人所任职务：</label>
      <div class="formControls col-2">
        <input type="text" class="input-text" value="${custContactDto.contactDuty}" placeholder="" id="contactDuty" name="contactDuty" >
      </div>
      <div class="col-2"> </div>
    </div>
    <div class="row cl">
      <label class="form-label col-2">最佳联系时间：</label>
      <div class="formControls col-2">
        <input type="text" onfocus="WdatePicker({dateFmt:'yyyy-MM-dd',maxDate:'#F{$dp.$D(\'datemax\')||\'%y-%M-%d\'}'})" id="bestContactTime" name="bestContactTime" value="${custContactDto.bestContactTime}" class="input-text Wdate">
      </div>
      <label class="form-label col-2">优先联系方式：</label>
      <div class="formControls col-2">
        <input type="text" class="input-text" value="${custContactDto.firstContactMode}" placeholder="" id="firstContactMode" name="firstContactMode" >
      </div>
      <label class="form-label col-2">更新时间：</label>
      <div class="formControls col-2">
        <input type="text" onfocus="WdatePicker({dateFmt:'yyyy-MM-dd',maxDate:'#F{$dp.$D(\'datemax\')||\'%y-%M-%d\'}'})" id="updateTime" name="updateTime" value="${custContactDto.updateTime}" class="input-text Wdate">
      </div>
      <div class="col-2"> </div>
    </div>
    <div class="row cl">
      <label class="form-label col-2">更新员工：</label>
      <div class="formControls col-2">
        <input type="text" class="input-text" value="${custContactDto.updateStaffId}" placeholder="" id="updateStaffId" name="updateStaffId" >
      </div>
      <label class="form-label col-2">更新部门：</label>
      <div class="formControls col-2">
        <input type="text" class="input-text" value="${custContactDto.updateDepartId}" placeholder="" id="updateDepartId" name="updateDepartId" >
      </div>
    </div>
    <div class="row cl">
      <label class="form-label col-2">备注：</label>
      <div class="formControls col-5">
        <textarea id="remark" name="remark" value="${custContactDto.remark}" cols="" rows="" class="textarea"  placeholder="说点什么...最少输入10个字符" dragonfly="true" nullmsg="备注不能为空！" onKeyUp="textarealength(this,100)"></textarea>
        <p class="textarea-numberbar"><em class="textarea-length">0</em>/100</p>
      </div>
      <div class="col-2"> </div>
    </div>
    <div class="row cl">
      <div class="col-9 col-offset-3">
        <input class="btn btn-primary radius" type="submit" value="&nbsp;&nbsp;提交&nbsp;&nbsp;">
        <input class="btn btn-primary radius" type="reset" value="&nbsp;&nbsp;清空&nbsp;&nbsp;">
        <input class="btn btn-primary radius" type="button" value="&nbsp;&nbsp;返回&nbsp;&nbsp;" onclick="javascript:history.back(-1);">
      </div>
    </div>
  </form>

<script type="text/javascript">
$(function(){
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

function changeOrg(orgId){
	var str="<option value=''>--请选择客户标识--</option>";  
	$.ajax({
	    async: false,
	    url: "${ctx}/cust/list",
	    data : {"orgId" : orgId}, 
	    type: "get",
	    dataType: "json",
	    success: function (data) {
	    	document.getElementById('custId').options.length = 0;  //清空原有的option 
	    	for(var i=0;i<data.length;i++){
	    		str+="<option value='"+data[i].custId+"'>"+data[i].custId+"</option>";
	    	}  
	    }
	});
	$("#custId").html(str);
	
}

function member_show(title,url,id,w,h){
	layer_show(title,url,w,h);
}
</script>
</body>
</html>