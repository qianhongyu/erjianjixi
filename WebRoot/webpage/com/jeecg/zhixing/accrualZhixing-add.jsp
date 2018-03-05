<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<!DOCTYPE html>
<html>
 <head>
  <title>执行情况</title>
  <t:base type="jquery,easyui,tools,DatePicker"></t:base>
  <script type="text/javascript">
  //编写自定义JS代码
  </script>
 </head>
 <body>
  <t:formvalid formid="formobj" dialog="true" usePlugin="password" layout="table" action="accrualZhixingController.do?doAdd" >
					<input id="id" name="id" type="hidden" value="${accrualZhixingPage.id }"/>
		<table style="width: 600px;" cellpadding="0" cellspacing="1" class="formtable">
				<tr>
					<td align="right">
						<label class="Validform_label">
							单据编号:
						</label>
					</td>
					<td class="value">
					     	 <input id="billid" name="billid" type="text" style="width: 150px" class="inputxt"  ignore="ignore" />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">单据编号</label>
						</td>
					<td align="right">
						<label class="Validform_label">
							借款信息编号:
						</label>
					</td>
					<td class="value">
							  <t:dictSelect field="borrowid" type="list"  dictTable="ACCRUAL_BORROW_INFO" dictField="id" dictText="BORROW_INFO_ID"  defaultVal="${accrualZhixingPage.borrowid}" hasLabel="false"  title="借款信息编号" ></t:dictSelect>     
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">借款信息编号</label>
						</td>
					</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							摘要:
						</label>
					</td>
					<td class="value">
					     	 <input id="zhaiyao" name="zhaiyao" type="text" style="width: 150px" class="inputxt"  ignore="ignore" />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">摘要</label>
						</td>
					<td align="right">
						<label class="Validform_label">
							执行日期:
						</label>
					</td>
					<td class="value">
							   <input id="dotime" name="dotime" type="text" style="width: 150px" class="Wdate" onClick="WdatePicker()"  ignore="ignore" />    
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">执行日期</label>
						</td>
					</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							应付本金:
						</label>
					</td>
					<td class="value">
					     	 <input id="payprincipal" name="payprincipal" type="text" style="width: 150px" class="inputxt"  ignore="ignore" />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">应付本金</label>
						</td>
					<td align="right">
						<label class="Validform_label">
							已还本金:
						</label>
					</td>
					<td class="value">
					     	 <input id="returnprincipal" name="returnprincipal" type="text" style="width: 150px" class="inputxt"  ignore="ignore" />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">已还本金</label>
						</td>
					</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							未还本金:
						</label>
					</td>
					<td class="value">
					     	 <input id="unpaidprincipal" name="unpaidprincipal" type="text" style="width: 150px" class="inputxt"  ignore="ignore" />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">未还本金</label>
						</td>
					<td align="right">
						<label class="Validform_label">
							应付利息:
						</label>
					</td>
					<td class="value">
					     	 <input id="interestpayable" name="interestpayable" type="text" style="width: 150px" class="inputxt"  ignore="ignore" />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">应付利息</label>
						</td>
					</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							已付利息:
						</label>
					</td>
					<td class="value">
					     	 <input id="paidinterest" name="paidinterest" type="text" style="width: 150px" class="inputxt"  ignore="ignore" />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">已付利息</label>
						</td>
					<td align="right">
						<label class="Validform_label">
							未付利息:
						</label>
					</td>
					<td class="value">
					     	 <input id="unpaidinterest" name="unpaidinterest" type="text" style="width: 150px" class="inputxt"  ignore="ignore" />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">未付利息</label>
						</td>
					</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							操作人:
						</label>
					</td>
					<td class="value">
					     	 <input id="userpeople" name="userpeople" type="text" style="width: 150px" class="inputxt"  ignore="ignore" />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">操作人</label>
						</td>
				<td align="right">
					<label class="Validform_label">
					</label>
				</td>
				<td class="value">
				</td>
					</tr>
				
				
			</table>
		</t:formvalid>
 </body>
  <script src = "webpage/com/jeecg/zhixing/accrualZhixing.js"></script>		
