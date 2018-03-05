<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<!DOCTYPE html>
<html>
 <head>
  <title>合同利息清单</title>
  <t:base type="jquery,easyui,tools,DatePicker"></t:base>
  <script type="text/javascript">
  //编写自定义JS代码
  </script>
 </head>
 <body>
  <t:formvalid formid="formobj" dialog="true" usePlugin="password" layout="table" action="accrualContractInterestIstController.do?doAdd" >
					<input id="id" name="id" type="hidden" value="${accrualContractInterestIstPage.id }"/>
		<table style="width: 600px;" cellpadding="0" cellspacing="1" class="formtable">
				<tr>
					<td align="right">
						<label class="Validform_label">
							清单编号:
						</label>
					</td>
					<td class="value">
					     	 <input id="listNumber" name="listNumber" type="text" style="width: 150px" class="inputxt"  ignore="ignore" />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">清单编号</label>
						</td>
					<td align="right">
						<label class="Validform_label">
							合同类型:
						</label>
					</td>
					<td class="value">
					     	 <input id="contractType" name="contractType" type="text" style="width: 150px" class="inputxt"  ignore="ignore" />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">合同类型</label>
						</td>
					</tr>
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
							本金:
						</label>
					</td>
					<td class="value">
					     	 <input id="principal" name="principal" type="text" style="width: 150px" class="inputxt"  datatype="n"  ignore="ignore" />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">本金</label>
						</td>
					</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							复利方式:
						</label>
					</td>
					<td class="value">
					     	 <input id="compoundInterest" name="compoundInterest" type="text" style="width: 150px" class="inputxt"  ignore="ignore" />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">复利方式</label>
						</td>
					<td align="right">
						<label class="Validform_label">
							结息日:
						</label>
					</td>
					<td class="value">
					     	 <input id="endInterestDay" name="endInterestDay" type="text" style="width: 150px" class="inputxt"  ignore="ignore" />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">结息日</label>
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
							基础利率:
						</label>
					</td>
					<td class="value">
					     	 <input id="baseRate" name="baseRate" type="text" style="width: 150px" class="inputxt"  ignore="ignore" />
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
					     	 <input id="excessRate" name="excessRate" type="text" style="width: 150px" class="inputxt"  ignore="ignore" />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">超额利率</label>
						</td>
					<td align="right">
						<label class="Validform_label">
							基础利息:
						</label>
					</td>
					<td class="value">
					     	 <input id="baseInterest" name="baseInterest" type="text" style="width: 150px" class="inputxt"  ignore="ignore" />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">基础利息</label>
						</td>
					</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							超额利息:
						</label>
					</td>
					<td class="value">
					     	 <input id="excessInteres" name="excessInteres" type="text" style="width: 150px" class="inputxt"  ignore="ignore" />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">超额利息</label>
						</td>
					<td align="right">
						<label class="Validform_label">
							利息合计:
						</label>
					</td>
					<td class="value">
					     	 <input id="interestAggregate" name="interestAggregate" type="text" style="width: 150px" class="inputxt"  ignore="ignore" />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">利息合计</label>
						</td>
					</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							起息日:
						</label>
					</td>
					<td class="value">
					     	 <input id="startInterestDay" name="startInterestDay" type="text" style="width: 150px" class="inputxt"  ignore="ignore" />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">起息日</label>
						</td>
					<td align="right">
						<label class="Validform_label">
							结息天数:
						</label>
					</td>
					<td class="value">
					     	 <input id="restDays" name="restDays" type="text" style="width: 150px" class="inputxt"  datatype="n"  ignore="ignore" />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">结息天数</label>
						</td>
					</tr>
				
				
			</table>
		</t:formvalid>
 </body>
  <script src = "webpage/com/jeecg/interestlist/accrualContractInterestIst.js"></script>		
