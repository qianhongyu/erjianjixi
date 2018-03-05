<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<!DOCTYPE html>
<html>
 <head>
  <title>集团借入</title>
  <t:base type="jquery,easyui,tools,DatePicker"></t:base>
  <script type="text/javascript">
  //编写自定义JS代码
  </script>
 </head>
 <body>
		<t:formvalid formid="formobj" dialog="true" usePlugin="password" layout="table" action="jituanBorrowInfoController.do?doUpdate" >
					<input id="id" name="id" type="hidden" value="${jituanBorrowInfoPage.id }"/>
		<table style="width: 600px;" cellpadding="0" cellspacing="1" class="formtable">
					<tr>
						<td align="right">
							<label class="Validform_label">
								对应的合同编号:
							</label>
						</td>
						<td class="value">
									<t:dictSelect field="contractId" type="list"  dictTable="accrual_all_contract" dictField="contract_id" dictText="contract_name"   defaultVal="${jituanBorrowInfoPage.contractId}" hasLabel="false"  title="对应的合同编号" ></t:dictSelect>     
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">对应的合同编号</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								借款金额:
							</label>
						</td>
						<td class="value">
						     	 <input id="loanamount" name="loanamount" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${jituanBorrowInfoPage.loanamount}'/>
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
									<t:dictSelect field="baseRate" type="list"  dictTable="accrual_base_rate" dictField="id" dictText="base_rate"   defaultVal="${jituanBorrowInfoPage.baseRate}" hasLabel="false"  title="基础利率" ></t:dictSelect>     
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">基础利率</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								超额利率:
							</label>
						</td>
						<td class="value">
									<t:dictSelect field="excessinterestRate" type="list"  dictTable="accrual_excessinterest_rate" dictField="id" dictText="excessinterest_rate"   defaultVal="${jituanBorrowInfoPage.excessinterestRate}" hasLabel="false"  title="超额利率" ></t:dictSelect>     
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
									  <input id="startTime" name="startTime" type="text" style="width: 150px"  class="Wdate" onClick="WdatePicker()"  ignore="ignore" value='<fmt:formatDate value='${jituanBorrowInfoPage.startTime}' type="date" pattern="yyyy-MM-dd"/>'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">开始时间</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								结束时间:
							</label>
						</td>
						<td class="value">
									  <input id="endTime" name="endTime" type="text" style="width: 150px"  class="Wdate" onClick="WdatePicker()"  ignore="ignore" value='<fmt:formatDate value='${jituanBorrowInfoPage.endTime}' type="date" pattern="yyyy-MM-dd"/>'/>
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
									<t:dictSelect field="period" type="list"  dictTable="accrual_day" dictField="id" dictText="day_id"   defaultVal="${jituanBorrowInfoPage.period}" hasLabel="false"  title="结息日" ></t:dictSelect>     
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">结息日</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								还款日:
							</label>
						</td>
						<td class="value">
									<t:dictSelect field="repaymentDate" type="list"  dictTable="accrual_day" dictField="id" dictText="day_id"   defaultVal="${jituanBorrowInfoPage.repaymentDate}" hasLabel="false"  title="还款日" ></t:dictSelect>     
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
									<t:dictSelect field="repaymentMode" type="list"  dictTable="accrual_info_type" dictField="id" dictText="type"   defaultVal="${jituanBorrowInfoPage.repaymentMode}" hasLabel="false"  title="还款方式" ></t:dictSelect>     
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">还款方式</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								结息周期:
							</label>
						</td>
						<td class="value">
									<t:dictSelect field="interestCycle" type="list"  dictTable="accrual_info_jg" dictField="id" dictText="text"   defaultVal="${jituanBorrowInfoPage.interestCycle}" hasLabel="false"  title="结息周期" ></t:dictSelect>     
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
									<t:dictSelect field="borrower" type="list"  dictTable="accrual_borrower" dictField="id" dictText="borrower_name"   defaultVal="${jituanBorrowInfoPage.borrower}" hasLabel="false"  title="借款单位" ></t:dictSelect>     
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">借款单位</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								担保单位:
							</label>
						</td>
						<td class="value">
									<t:dictSelect field="guarantor" type="list"  dictTable="accrual_guarantor" dictField="id" dictText="guarantor_name"   defaultVal="${jituanBorrowInfoPage.guarantor}" hasLabel="false"  title="担保单位" ></t:dictSelect>     
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
									<t:dictSelect field="lender" type="list"  dictTable="accrual_lender" dictField="id" dictText="lender_name"   defaultVal="${jituanBorrowInfoPage.lender}" hasLabel="false"  title="放款单位" ></t:dictSelect>     
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">放款单位</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								录入人:
							</label>
						</td>
						<td class="value">
						     	 <input id="inputPerson" name="inputPerson" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${jituanBorrowInfoPage.inputPerson}'/>
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
									  <input id="inputTime" name="inputTime" type="text" style="width: 150px"  class="Wdate" onClick="WdatePicker()"  ignore="ignore" value='<fmt:formatDate value='${jituanBorrowInfoPage.inputTime}' type="date" pattern="yyyy-MM-dd"/>'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">录入时间</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								最后一次的修改人:
							</label>
						</td>
						<td class="value">
						     	 <input id="updatePerson" name="updatePerson" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${jituanBorrowInfoPage.updatePerson}'/>
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
									  <input id="updateTime" name="updateTime" type="text" style="width: 150px"  class="Wdate" onClick="WdatePicker()"  ignore="ignore" value='<fmt:formatDate value='${jituanBorrowInfoPage.updateTime}' type="date" pattern="yyyy-MM-dd"/>'/>
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
  <script src = "webpage/com/jeecg/jituaninfo/jituanBorrowInfo.js"></script>		
