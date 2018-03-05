<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<!DOCTYPE html>
<html>
 <head>
  <title>银行借贷</title>
  <t:base type="jquery,easyui,tools,DatePicker"></t:base>
  <script type="text/javascript">
  //编写自定义JS代码
  </script>
 </head>
 <body>
  <t:formvalid formid="formobj" dialog="true" usePlugin="password" layout="table" action="accrualInfoController.do?doAdd" >
					<input id="id" name="id" type="hidden" value="${accrualInfoPage.id }"/>
		<table style="width: 600px;" cellpadding="0" cellspacing="1" class="formtable">
				<tr>
					<td align="right">
						<label class="Validform_label">
							对应的合同id:
						</label>
					</td>
					<td class="value">
							  <t:dictSelect field="hetongId" type="list"  dictTable="accrual_all_contract" dictField="id" dictText="contract_name"  defaultVal="${accrualInfoPage.hetongId}" hasLabel="false"  title="对应的合同id" ></t:dictSelect>     
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">对应的合同id</label>
						</td>
					<td align="right">
						<label class="Validform_label">
							借款金额:
						</label>
					</td>
					<td class="value">
					     	 <input id="loanamount" name="loanamount" type="text" style="width: 150px" class="inputxt"  ignore="ignore" />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">借款金额</label>
						</td>
					</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							基础利率:
						</label>
					</td>
					<td class="value">
							  <t:dictSelect field="basicrate" type="list"  dictTable="accrual_basic_rate" dictField="id" dictText="basic_rate"  defaultVal="${accrualInfoPage.basicrate}" hasLabel="false"  title="基础利率" ></t:dictSelect>     
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">基础利率</label>
						</td>
					<td align="right">
						<label class="Validform_label">
							超额利率:
						</label>
					</td>
					<td class="value">
							  <t:dictSelect field="excessinterestrate" type="list"  dictTable="accrual_excessinterest_rate" dictField="id" dictText="excessinterest_rate"  defaultVal="${accrualInfoPage.excessinterestrate}" hasLabel="false"  title="超额利率" ></t:dictSelect>     
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">超额利率</label>
						</td>
					</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							开始时间:
						</label>
					</td>
					<td class="value">
							   <input id="starttime" name="starttime" type="text" style="width: 150px" class="Wdate" onClick="WdatePicker()"  ignore="ignore" />    
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">开始时间</label>
						</td>
					<td align="right">
						<label class="Validform_label">
							结束时间:
						</label>
					</td>
					<td class="value">
							   <input id="endtime" name="endtime" type="text" style="width: 150px" class="Wdate" onClick="WdatePicker()"  ignore="ignore" />    
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">结束时间</label>
						</td>
					</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							结息日:
						</label>
					</td>
					<td class="value">
							  <t:dictSelect field="period" type="list"  datatype="n"  dictTable="accrual_day" dictField="id" dictText="day_id"  defaultVal="${accrualInfoPage.period}" hasLabel="false"  title="结息日" ></t:dictSelect>     
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">结息日</label>
						</td>
					<td align="right">
						<label class="Validform_label">
							还款日:
						</label>
					</td>
					<td class="value">
							  <t:dictSelect field="repaymentdate" type="list"  datatype="n"  dictTable="accrual_day" dictField="id" dictText="day_id"  defaultVal="${accrualInfoPage.repaymentdate}" hasLabel="false"  title="还款日" ></t:dictSelect>     
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">还款日</label>
						</td>
					</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							还款方式:
						</label>
					</td>
					<td class="value">
							  <t:dictSelect field="repaymentmode" type="list"  dictTable="accrual_info_type1" dictField="id" dictText="type1"  defaultVal="${accrualInfoPage.repaymentmode}" hasLabel="false"  title="还款方式" ></t:dictSelect>     
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">还款方式</label>
						</td>
					<td align="right">
						<label class="Validform_label">
							结息周期:
						</label>
					</td>
					<td class="value">
							  <t:dictSelect field="interestcycle" type="list"  dictTable="accrual_info_jg" dictField="id" dictText="text"  defaultVal="${accrualInfoPage.interestcycle}" hasLabel="false"  title="结息周期" ></t:dictSelect>     
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">结息周期</label>
						</td>
					</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							借款单位:
						</label>
					</td>
					<td class="value">
							  <t:dictSelect field="borrower" type="list"  dictTable="accrual_borrower" dictField="id" dictText="borrower_name"  defaultVal="${accrualInfoPage.borrower}" hasLabel="false"  title="借款单位" ></t:dictSelect>     
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">借款单位</label>
						</td>
					<td align="right">
						<label class="Validform_label">
							担保单位:
						</label>
					</td>
					<td class="value">
							  <t:dictSelect field="guarantor" type="list"  dictTable="accrual_guarantor" dictField="id" dictText="guarantor_name"  defaultVal="${accrualInfoPage.guarantor}" hasLabel="false"  title="担保单位" ></t:dictSelect>     
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">担保单位</label>
						</td>
					</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							放款单位:
						</label>
					</td>
					<td class="value">
							  <t:dictSelect field="lender" type="list"  dictTable="accrual_lender" dictField="id" dictText="lender_name"  defaultVal="${accrualInfoPage.lender}" hasLabel="false"  title="放款单位" ></t:dictSelect>     
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">放款单位</label>
						</td>
					<td align="right">
						<label class="Validform_label">
							录入人:
						</label>
					</td>
					<td class="value">
					     	 <input id="inputperson" name="inputperson" type="text" style="width: 150px" class="inputxt"  ignore="ignore" />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">录入人</label>
						</td>
					</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							录入时间:
						</label>
					</td>
					<td class="value">
							   <input id="inputtime" name="inputtime" type="text" style="width: 150px" class="Wdate" onClick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm:ss'})"  ignore="ignore" />
								
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">录入时间</label>
						</td>
					<td align="right">
						<label class="Validform_label">
							最后一次的修改人:
						</label>
					</td>
					<td class="value">
					     	 <input id="changeperson" name="changeperson" type="text" style="width: 150px" class="inputxt"  ignore="ignore" />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">最后一次的修改人</label>
						</td>
					</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							最后一次的修改时间:
						</label>
					</td>
					<td class="value">
							   <input id="changetime" name="changetime" type="text" style="width: 150px" class="Wdate" onClick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm:ss'})"  ignore="ignore" />
								
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">最后一次的修改时间</label>
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
  <script src = "webpage/com/jeecg/info/accrualInfo.js"></script>		
