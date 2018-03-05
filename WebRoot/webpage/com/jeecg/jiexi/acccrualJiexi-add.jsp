<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<!DOCTYPE html>
<html>
 <head>
  <title>结息方式</title>
  <t:base type="jquery,easyui,tools,DatePicker"></t:base>
  <script type="text/javascript">
  //编写自定义JS代码
  </script>
 </head>
 <body>
  <t:formvalid formid="formobj" dialog="true" usePlugin="password" layout="table" action="acccrualJiexiController.do?doAdd" >
					<input id="id" name="id" type="hidden"  value="${acccrualJiexiPage.id }" />
		<table style="width: 600px;" cellpadding="0" cellspacing="1" class="formtable">
				<tr>
					<td align="right">
						<label class="Validform_label">
							结息方式:
						</label>
					</td>
					<td class="value">
							  <t:dictSelect field="interesttype" type="list"  dictTable="accrual_interest_type" dictField="id" dictText="text"  defaultVal="${acccrualJiexiPage.interesttype}" hasLabel="false"  title="结息方式" ></t:dictSelect>     
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">结息方式</label>
						</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							结息周期:
						</label>
					</td>
					<td class="value">
					     	 <input id="interestcycle" name="interestcycle" type="text" style="width: 150px" class="inputxt"  datatype="n"  ignore="checked" />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">结息周期</label>
						</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							周期单位:
						</label>
					</td>
					<td class="value">
							  <t:dictSelect field="periodicunit" type="list"  dictTable="accrual_interest_unit" dictField="id" dictText="text"  defaultVal="${acccrualJiexiPage.periodicunit}" hasLabel="false"  title="周期单位" ></t:dictSelect>     
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">周期单位</label>
						</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							期末余额结息日:
						</label>
					</td>
					<td class="value">
					     	 <input id="lastday" name="lastday" type="text" style="width: 150px" class="inputxt"  ignore="ignore" />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">期末余额结息日</label>
						</td>
				</tr>
				
				
			</table>
		</t:formvalid>
 </body>
  <script src = "webpage/com/jeecg/jiexi/acccrualJiexi.js"></script>		
