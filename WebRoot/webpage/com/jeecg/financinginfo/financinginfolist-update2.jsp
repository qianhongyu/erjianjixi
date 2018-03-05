<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<!DOCTYPE html>
<html>
 <head>
  <title>融资信息列表</title>
  <t:base type="jquery,easyui,tools,DatePicker"></t:base>
  <script type="text/javascript">
  //编写自定义JS代码
  </script>
 </head>
 <body>
		<t:formvalid formid="formobj" dialog="true" usePlugin="password" layout="table" action="financinginfolistController.do?doUpdate&id=1" >
					<input id="id" name="id" type="hidden" value="${financinginfolistPage.id }"/>
		<table style="width: 600px;" cellpadding="0" cellspacing="1" class="formtable">
					<tr>
						<td align="right">
							<label class="Validform_label">
								合同编号:
							</label>
						</td>
						<td class="value">
						     	 <input id="contractnumber" name="contractnumber" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${financinginfolistPage.contractnumber}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">合同编号</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								借款主体:
							</label>
						</td>
						<td class="value">
									<t:dictSelect field="loansubject" type="list"  dictTable="accrual_jkzt" dictField="id" dictText="text"   defaultVal="${financinginfolistPage.loansubject}" hasLabel="false"  title="借款主体" ></t:dictSelect>     
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">借款主体</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								主体名称:
							</label>
						</td>
						<td class="value">
						     	 <input id="subjectname" name="subjectname" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${financinginfolistPage.subjectname}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">主体名称</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								金融机构:
							</label>
						</td>
						<td class="value">
									<t:dictSelect field="financialinstitution" type="list"  dictTable="accrual_jrjg" dictField="id" dictText="text"   defaultVal="${financinginfolistPage.financialinstitution}" hasLabel="false"  title="金融机构" ></t:dictSelect>     
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">金融机构</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								金额:
							</label>
						</td>
						<td class="value">
						     	 <input id="money" name="money" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${financinginfolistPage.money}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">金额</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								年利率:
							</label>
						</td>
						<td class="value">
						     	 <input id="annualrate" name="annualrate" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${financinginfolistPage.annualrate}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">年利率</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								银行利息外费用:
							</label>
						</td>
						<td class="value">
						     	 <input id="extraexpenses" name="extraexpenses" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${financinginfolistPage.extraexpenses}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">银行利息外费用</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								担保方式:
							</label>
						</td>
						<td class="value">
						     	 <input id="guaranteemethod" name="guaranteemethod" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${financinginfolistPage.guaranteemethod}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">担保方式</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								担保金额:
							</label>
						</td>
						<td class="value">
						     	 <input id="guaranteemoney" name="guaranteemoney" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${financinginfolistPage.guaranteemoney}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">担保金额</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								起息日:
							</label>
						</td>
						<td class="value">
									  <input id="startinterestday" name="startinterestday" type="text" style="width: 150px"  class="Wdate" onClick="WdatePicker()"  ignore="ignore" value='<fmt:formatDate value='${financinginfolistPage.startinterestday}' type="date" pattern="yyyy-MM-dd"/>'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">起息日</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								到息日:
							</label>
						</td>
						<td class="value">
									  <input id="endinterestday" name="endinterestday" type="text" style="width: 150px"  class="Wdate" onClick="WdatePicker()"  ignore="ignore" value='<fmt:formatDate value='${financinginfolistPage.endinterestday}' type="date" pattern="yyyy-MM-dd"/>'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">到息日</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								月度利息:
							</label>
						</td>
						<td class="value">
						     	 <input id="monthlyinterest" name="monthlyinterest" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${financinginfolistPage.monthlyinterest}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">月度利息</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								计息方式:
							</label>
						</td>
						<td class="value">
									<t:dictSelect field="wayofinterestaccrual" type="list"  dictTable="accrual_interest_type" dictField="id" dictText="text"   defaultVal="${financinginfolistPage.wayofinterestaccrual}" hasLabel="false"  title="计息方式" ></t:dictSelect>     
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">计息方式</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								结息日:
							</label>
						</td>
						<td class="value">
									<t:dictSelect field="interestday" type="list"  dictTable="accrual_day" dictField="id" dictText="day_id"   defaultVal="${financinginfolistPage.interestday}" hasLabel="false"  title="结息日" ></t:dictSelect>     
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">结息日</label>
						</td>
					</tr>
				
					<tr>
						<td align="right">
							<label class="Validform_label">
								备注:
							</label>
						</td>
						<td class="value"  colspan="3" >
						  	 	<textarea id="remarks" style="width:600px;" class="inputxt" rows="6" name="remarks"  ignore="ignore" >${financinginfolistPage.remarks}</textarea>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">备注</label>
						</td>
					</tr>
			</table>
		</t:formvalid>
 </body>
  <script src = "webpage/com/jeecg/financinginfo/financinginfolist.js"></script>		
