<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<!DOCTYPE html>
<html>
 <head>
  <title>银行借款合同</title>
  <t:base type="jquery,easyui,tools,DatePicker"></t:base>
  <script type="text/javascript">
  //编写自定义JS代码
  </script>
 </head>
 <body>
  <t:formvalid formid="formobj" dialog="true" usePlugin="password" layout="table" action="accrualNewbankContractlistController.do?doAdd" >
					<input id="id" name="id" type="hidden" value="${accrualNewbankContractlistPage.id }"/>
		<table style="width: 600px;" cellpadding="0" cellspacing="1" class="formtable">
				<tr>
					<td align="right">
						<label class="Validform_label">
							合同编号:
						</label>
					</td>
					<td class="value">
					     	 <input id="contractId" name="contractId" type="text" style="width: 150px" class="inputxt"  ignore="ignore" />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">合同编号</label>
						</td>
					<td align="right">
						<label class="Validform_label">
							贷款方式:
						</label>
					</td>
					<td class="value">
							  <t:dictSelect field="loanMethod" type="list"  dictTable="accrual_dkfs" dictField="id" dictText="text"  defaultVal="${accrualNewbankContractlistPage.loanMethod}" hasLabel="false"  title="贷款方式" ></t:dictSelect>     
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">贷款方式</label>
						</td>
					</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							贷款单位:
						</label>
					</td>
					<td class="value">
					     	 <input id="loanUnit" name="loanUnit" type="text" style="width: 150px" class="inputxt"  ignore="ignore" />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">贷款单位</label>
						</td>
					<td align="right">
						<label class="Validform_label">
							借款单位:
						</label>
					</td>
					<td class="value">
					     	 <input id="borrower" name="borrower" type="text" style="width: 150px" class="inputxt"  ignore="ignore" />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">借款单位</label>
						</td>
					</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							合同性质:
						</label>
					</td>
					<td class="value">
							  <t:dictSelect field="contractNature" type="list"  dictTable="accrual_contract_nature" dictField="id" dictText="text"  defaultVal="${accrualNewbankContractlistPage.contractNature}" hasLabel="false"  title="合同性质" ></t:dictSelect>     
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">合同性质</label>
						</td>
					<td align="right">
						<label class="Validform_label">
							合同状态:
						</label>
					</td>
					<td class="value">
					     	 <input id="contractStatus" name="contractStatus" type="text" style="width: 150px" class="inputxt"  ignore="ignore" />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">合同状态</label>
						</td>
					</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							区域公司:
						</label>
					</td>
					<td class="value">
					     	 <input id="regionalCompany" name="regionalCompany" type="text" style="width: 150px" class="inputxt"  ignore="ignore" />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">区域公司</label>
						</td>
					<td align="right">
						<label class="Validform_label">
							承包商:
						</label>
					</td>
					<td class="value">
					     	 <input id="contractor" name="contractor" type="text" style="width: 150px" class="inputxt"  ignore="ignore" />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">承包商</label>
						</td>
					</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							项目部:
						</label>
					</td>
					<td class="value">
					     	 <input id="projectDepartment" name="projectDepartment" type="text" style="width: 150px" class="inputxt"  ignore="ignore" />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">项目部</label>
						</td>
					<td align="right">
						<label class="Validform_label">
							备注:
						</label>
					</td>
					<td class="value">
					     	 <input id="remarks" name="remarks" type="text" style="width: 150px" class="inputxt"  ignore="ignore" />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">备注</label>
						</td>
					</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							基础利率:
						</label>
					</td>
					<td class="value">
							  <t:dictSelect field="baseRate" type="list"  dictTable="accrual_rate" dictField="id" dictText="yearrate"  defaultVal="${accrualNewbankContractlistPage.baseRate}" hasLabel="false"  title="基础利率" ></t:dictSelect>     
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">基础利率</label>
						</td>
					<td align="right">
						<label class="Validform_label">
							超额利率:
						</label>
					</td>
					<td class="value">
							  <t:dictSelect field="excessRate" type="list"  dictTable="accrual_rate" dictField="id" dictText="yearrate"  defaultVal="${accrualNewbankContractlistPage.excessRate}" hasLabel="false"  title="超额利率" ></t:dictSelect>     
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">超额利率</label>
						</td>
					</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							复利方式:
						</label>
					</td>
					<td class="value">
							  <t:dictSelect field="compoundInterest" type="list"  dictTable="accrual_compound_interest" dictField="id" dictText="text"  defaultVal="${accrualNewbankContractlistPage.compoundInterest}" hasLabel="false"  title="复利方式" ></t:dictSelect>     
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">复利方式</label>
						</td>
					<td align="right">
						<label class="Validform_label">
							结息日:
						</label>
					</td>
					<td class="value">
					     	 <input id="interestDay" name="interestDay" type="text" style="width: 150px" class="inputxt"  ignore="ignore" />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">结息日</label>
						</td>
					</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							合同签订日期:
						</label>
					</td>
					<td class="value">
							   <input id="contractAwardDate" name="contractAwardDate" type="text" style="width: 150px" class="Wdate" onClick="WdatePicker()"  ignore="ignore" />    
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">合同签订日期</label>
						</td>
					<td align="right">
						<label class="Validform_label">
							借贷金额:
						</label>
					</td>
					<td class="value">
					     	 <input id="loanAmount" name="loanAmount" type="text" style="width: 150px" class="inputxt"  ignore="ignore" />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">借贷金额</label>
						</td>
					</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							期间:
						</label>
					</td>
					<td class="value">
					     	 <input id="period" name="period" type="text" style="width: 150px" class="inputxt"  ignore="ignore" />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">期间</label>
						</td>
					<td align="right">
						<label class="Validform_label">
							期间单位:
						</label>
					</td>
					<td class="value">
							  <t:dictSelect field="periodUnit" type="list"  dictTable="ACCRUAL_INTEREST_UNIT" dictField="id" dictText="text"  defaultVal="${accrualNewbankContractlistPage.periodUnit}" hasLabel="false"  title="期间单位" ></t:dictSelect>     
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">期间单位</label>
						</td>
					</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							起始日期:
						</label>
					</td>
					<td class="value">
							   <input id="startDate" name="startDate" type="text" style="width: 150px" class="Wdate" onClick="WdatePicker()"  ignore="ignore" />    
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">起始日期</label>
						</td>
					<td align="right">
						<label class="Validform_label">
							结束日期:
						</label>
					</td>
					<td class="value">
							   <input id="endDate" name="endDate" type="text" style="width: 150px" class="Wdate" onClick="WdatePicker()"  ignore="ignore" />    
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">结束日期</label>
						</td>
					</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							录入人:
						</label>
					</td>
					<td class="value">
					     	 <input id="inputPerson" name="inputPerson" type="text" style="width: 150px" class="inputxt"  ignore="ignore" />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">录入人</label>
						</td>
					<td align="right">
						<label class="Validform_label">
							审核人:
						</label>
					</td>
					<td class="value">
					     	 <input id="auditor" name="auditor" type="text" style="width: 150px" class="inputxt"  ignore="ignore" />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">审核人</label>
						</td>
					</tr>
				
				
			</table>
		</t:formvalid>
 </body>
  <script src = "webpage/com/jeecg/bankloancontract/accrualNewbankContractlist.js"></script>		
