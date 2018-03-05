<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<!DOCTYPE html>
<html>
 <head>
  <title>集团借贷</title>
  <t:base type="jquery,easyui,tools,DatePicker"></t:base>
  <script type="text/javascript">
  //编写自定义JS代码
  </script>
 </head>
 <body>
		<t:formvalid formid="formobj" dialog="true" usePlugin="password" layout="table" action="accrualInfo1Controller.do?doUpdate" >
					<input id="id" name="id" type="hidden" value="${accrualInfo1Page.id }"/>
		<table style="width: 600px;" cellpadding="0" cellspacing="1" class="formtable">
					<tr>
						<td align="right">
							<label class="Validform_label">
								录入人编号:
							</label>
						</td>
						<td class="value">
						     	 <input id="inputpeopleid" name="inputpeopleid" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${accrualInfo1Page.inputpeopleid}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">录入人编号</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								借贷金额:
							</label>
						</td>
						<td class="value">
						     	 <input id="loanamount" name="loanamount" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${accrualInfo1Page.loanamount}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">借贷金额</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								实际利率:
							</label>
						</td>
						<td class="value">
						     	 <input id="rate" name="rate" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${accrualInfo1Page.rate}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">实际利率</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								还款金额:
							</label>
						</td>
						<td class="value">
						     	 <input id="repayment" name="repayment" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${accrualInfo1Page.repayment}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">还款金额</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								复利方式:
							</label>
						</td>
						<td class="value">
									<t:dictSelect field="compoundmode" type="list"  dictTable="accrual_info_type" dictField="id" dictText="type"   defaultVal="${accrualInfo1Page.compoundmode}" hasLabel="false"  title="复利方式" ></t:dictSelect>     
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">复利方式</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								贷款起始日期:
							</label>
						</td>
						<td class="value">
									  <input id="starttime" name="starttime" type="text" style="width: 150px"  class="Wdate" onClick="WdatePicker()"  ignore="ignore" value='<fmt:formatDate value='${accrualInfo1Page.starttime}' type="date" pattern="yyyy-MM-dd"/>'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">贷款起始日期</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								贷款截止日期:
							</label>
						</td>
						<td class="value">
									  <input id="endtime" name="endtime" type="text" style="width: 150px"  class="Wdate" onClick="WdatePicker()"  ignore="ignore" value='<fmt:formatDate value='${accrualInfo1Page.endtime}' type="date" pattern="yyyy-MM-dd"/>'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">贷款截止日期</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								结息日间隔:
							</label>
						</td>
						<td class="value">
									<t:dictSelect field="period" type="list"  dictTable="accrual_info_jg" dictField="id" dictText="text"   defaultVal="${accrualInfo1Page.period}" hasLabel="false"  title="结息日间隔" ></t:dictSelect>     
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">结息日间隔</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								结息日:
							</label>
						</td>
						<td class="value">
									  <input id="interesttime" name="interesttime" type="text" style="width: 150px"  class="Wdate" onClick="WdatePicker()"  ignore="ignore" value='<fmt:formatDate value='${accrualInfo1Page.interesttime}' type="date" pattern="yyyy-MM-dd"/>'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">结息日</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								还款方式:
							</label>
						</td>
						<td class="value">
									<t:dictSelect field="repaymentmode" type="list"  dictTable="accrual_info_type1" dictField="id" dictText="type1"   defaultVal="${accrualInfo1Page.repaymentmode}" hasLabel="false"  title="还款方式" ></t:dictSelect>     
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">还款方式</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								合同到期日期:
							</label>
						</td>
						<td class="value">
									  <input id="signingtime" name="signingtime" type="text" style="width: 150px"  class="Wdate" onClick="WdatePicker()"  ignore="ignore" value='<fmt:formatDate value='${accrualInfo1Page.signingtime}' type="date" pattern="yyyy-MM-dd"/>'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">合同到期日期</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								审核人:
							</label>
						</td>
						<td class="value">
									<t:dictSelect field="examinepeople" type="list"  dictTable="accrual_info_sh" dictField="id" dictText="text"   defaultVal="${accrualInfo1Page.examinepeople}" hasLabel="false"  title="审核人" ></t:dictSelect>     
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">审核人</label>
						</td>
					</tr>
				
			</table>
		</t:formvalid>
 </body>
  <script src = "webpage/com/jeecg/info1/accrualInfo1.js"></script>		
