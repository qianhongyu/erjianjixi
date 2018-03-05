<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<!DOCTYPE html>
<html>
 <head>
  <title>借款主体列表</title>
  <t:base type="jquery,easyui,tools,DatePicker"></t:base>
  <script type="text/javascript">
  //编写自定义JS代码
  </script>
 </head>
 <body>
  <t:formvalid formid="formobj" dialog="true" usePlugin="password" layout="table" action="accrualLoanSubjectListController.do?doAdd&id=2" >
					<input id="id" name="id" type="hidden" value="${accrualLoanSubjectListPage.id }"/>
		<table style="width: 600px;" cellpadding="0" cellspacing="1" class="formtable">
				<tr>
					<td align="right">
						<label class="Validform_label">
							名称:
						</label>
					</td>
					<td class="value">
					     	 <input id="name" name="name" type="text" style="width: 150px" class="inputxt"  ignore="ignore" />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">名称</label>
						</td>
					<td align="right">
						<label class="Validform_label">
							年度产值:
						</label>
					</td>
					<td class="value">
					     	 <input id="annualoutputvalue" name="annualoutputvalue" type="text" style="width: 150px" class="inputxt"  datatype="d"  ignore="ignore" />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">年度产值</label>
						</td>
					</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							征信情况:
						</label>
					</td>
					<td class="value">
					     	 <input id="creditinformation" name="creditinformation" type="text" style="width: 150px" class="inputxt"  ignore="ignore" />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">征信情况</label>
						</td>
					<td align="right">
						<label class="Validform_label">
							工程质量考核情况:
						</label>
					</td>
					<td class="value">
					     	 <input id="engineeringquality" name="engineeringquality" type="text" style="width: 150px" class="inputxt"  ignore="ignore" />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">工程质量考核情况</label>
						</td>
					</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							综合描述:
						</label>
					</td>
					<td class="value">
					     	 <input id="comprehensivedescription" name="comprehensivedescription" type="text" style="width: 150px" class="inputxt"  ignore="ignore" />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">综合描述</label>
						</td>
					<td align="right">
						<label class="Validform_label">
							实际控制人:
						</label>
					</td>
					<td class="value">
					     	 <input id="actualcontroller" name="actualcontroller" type="text" style="width: 150px" class="inputxt"  ignore="ignore" />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">实际控制人</label>
						</td>
					</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							实际控制人职务:
						</label>
					</td>
					<td class="value">
					     	 <input id="actualcontrollerDuty" name="actualcontrollerDuty" type="text" style="width: 150px" class="inputxt"  ignore="ignore" />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">实际控制人职务</label>
						</td>
					<td align="right">
						<label class="Validform_label">
							实际控制人手机:
						</label>
					</td>
					<td class="value">
					     	 <input id="actualcontrollerPhone" name="actualcontrollerPhone" type="text" style="width: 150px" class="inputxt"  datatype="m"  ignore="ignore" />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">实际控制人手机</label>
						</td>
					</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							实际控制人邮箱:
						</label>
					</td>
					<td class="value">
					     	 <input id="actualcontrollerEmail" name="actualcontrollerEmail" type="text" style="width: 150px" class="inputxt"  datatype="e"  ignore="ignore" />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">实际控制人邮箱</label>
						</td>
					<td align="right">
						<label class="Validform_label">
							财务人员:
						</label>
					</td>
					<td class="value">
					     	 <input id="financialstaff" name="financialstaff" type="text" style="width: 150px" class="inputxt"  ignore="ignore" />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">财务人员</label>
						</td>
					</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							财务人员职务:
						</label>
					</td>
					<td class="value">
					     	 <input id="financialstaffDuty" name="financialstaffDuty" type="text" style="width: 150px" class="inputxt"  ignore="ignore" />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">财务人员职务</label>
						</td>
					<td align="right">
						<label class="Validform_label">
							财务人员手机:
						</label>
					</td>
					<td class="value">
					     	 <input id="financialstaffPhone" name="financialstaffPhone" type="text" style="width: 150px" class="inputxt"  datatype="m"  ignore="ignore" />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">财务人员手机</label>
						</td>
					</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							财务人员邮箱:
						</label>
					</td>
					<td class="value">
					     	 <input id="financialstaffEmail" name="financialstaffEmail" type="text" style="width: 150px" class="inputxt"  datatype="e"  ignore="ignore" />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">财务人员邮箱</label>
						</td>
				<td align="right">
					<label class="Validform_label">
					</label>
				</td>
				<td class="value">
				</td>
					</tr>
				
				
				<tr>
					<td align="right">
						<label class="Validform_label">
							备注:
						</label>
					</td>
					<td class="value"  colspan="3" >
						  	 <textarea style="width:600px;" class="inputxt" rows="6" id="remarks" name="remarks"  ignore="ignore" ></textarea>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">备注</label>
						</td>
					</tr>
			</table>
		</t:formvalid>
 </body>
  <script src = "webpage/com/jeecg/loansubjectlist/accrualLoanSubjectList.js"></script>		
