<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<!DOCTYPE html>
<html>
 <head>
  <title>利息计算</title>
  <t:base type="jquery,easyui,tools,DatePicker"></t:base>
  <script type="text/javascript">
  //编写自定义JS代码
  </script>
 </head>
 <body>
  <t:formvalid formid="formobj" dialog="true" usePlugin="password" layout="table" action="accrualInterestCalculationController.do?doAdd" >
					<input id="id" name="id" type="hidden" value="${accrualInterestCalculationPage.id }"/>
		<table style="width: 600px;" cellpadding="0" cellspacing="1" class="formtable">
				<tr>
					<td align="right">
						<label class="Validform_label">
							合同类型:
						</label>
					</td>
					<td class="value">
							  <t:dictSelect field="contractNature" type="list"  dictTable="accrual_contract_nature" dictField="id" dictText="text"  defaultVal="${accrualInterestCalculationPage.contractNature}" hasLabel="false"  title="合同类型" ></t:dictSelect>     
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">合同类型</label>
						</td>
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
					</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							合同金额:
						</label>
					</td>
					<td class="value">
					     	 <input id="loanAmount" name="loanAmount" type="text" style="width: 150px" class="inputxt"  datatype="n"  ignore="checked" />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">合同金额</label>
						</td>
					<td align="right">
						<label class="Validform_label">
							基础利率:
						</label>
					</td>
					<td class="value">
							  <t:dictSelect field="baseRate" type="list"  dictTable="accrual_rate" dictField="id" dictText="yearrate"  defaultVal="${accrualInterestCalculationPage.baseRate}" hasLabel="false"  title="基础利率" ></t:dictSelect>     
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">基础利率</label>
						</td>
					</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							超额利率:
						</label>
					</td>
					<td class="value">
							  <t:dictSelect field="excessRate" type="list"  dictTable="accrual_rate" dictField="id" dictText="yearrate"  defaultVal="${accrualInterestCalculationPage.excessRate}" hasLabel="false"  title="超额利率" ></t:dictSelect>     
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">超额利率</label>
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
							当前结息日:
						</label>
					</td>
					<td class="value">
					     	 <input id="nowinterestDay" name="nowinterestDay" type="text" style="width: 150px" class="inputxt"  ignore="ignore" />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">当前结息日</label>
						</td>
					<td align="right">
						<label class="Validform_label">
							下一结息日:
						</label>
					</td>
					<td class="value">
					     	 <input id="nextinterestDay" name="nextinterestDay" type="text" style="width: 150px" class="inputxt"  ignore="ignore" />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">下一结息日</label>
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
				
				
			</table>
		</t:formvalid>
 </body>
  <script src = "webpage/com/jeecg/interestmath/accrualInterestCalculation.js"></script>		
