<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<!DOCTYPE html>
<html>
 <head>
  <title>合同放款</title>
  <t:base type="jquery,easyui,tools,DatePicker"></t:base>
  <script type="text/javascript">
  //编写自定义JS代码
  </script>
 </head>
 <body>
		<t:formvalid formid="formobj" dialog="true" usePlugin="password" layout="table" action="accrualFangkuanController.do?doUpdate" >
					<input id="id" name="id" type="hidden" value="${accrualFangkuanPage.id }"/>
		<table style="width: 600px;" cellpadding="0" cellspacing="1" class="formtable">
					<tr>
						<td align="right">
							<label class="Validform_label">
								单据编号:
							</label>
						</td>
						<td class="value">
						     	 <input id="danjuId" name="danjuId" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${accrualFangkuanPage.danjuId}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">单据编号</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								合同编号:
							</label>
						</td>
						<td class="value">
						     	 <input id="hetongId" name="hetongId" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${accrualFangkuanPage.hetongId}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">合同编号</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								贷款单位:
							</label>
						</td>
						<td class="value">
									<t:dictSelect field="daikuanunit" type="list"  dictTable="accrual_newbank_contractlist" dictField="id" dictText="loan_unit"   defaultVal="${accrualFangkuanPage.daikuanunit}" hasLabel="false"  title="贷款单位" ></t:dictSelect>     
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">贷款单位</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								合同类型:
							</label>
						</td>
						<td class="value">
									<t:dictSelect field="contracttype" type="list"  dictTable="accrual_contract_nature" dictField="id" dictText="text"   defaultVal="${accrualFangkuanPage.contracttype}" hasLabel="false"  title="合同类型" ></t:dictSelect>     
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">合同类型</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								借款单位:
							</label>
						</td>
						<td class="value">
									<t:dictSelect field="jiekuanunit" type="list"  dictTable="accrual_newbank_contractlist" dictField="id" dictText="borrower"   defaultVal="${accrualFangkuanPage.jiekuanunit}" hasLabel="false"  title="借款单位" ></t:dictSelect>     
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">借款单位</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								合同金额:
							</label>
						</td>
						<td class="value">
									<t:dictSelect field="contractjine" type="list"  dictTable="accrual_newbank_contractlist" dictField="id" dictText="loan_amount"   defaultVal="${accrualFangkuanPage.contractjine}" hasLabel="false"  title="合同金额" ></t:dictSelect>     
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">合同金额</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								区域公司:
							</label>
						</td>
						<td class="value">
									<t:dictSelect field="quyucompany" type="list"  dictTable="accrual_newbank_contractlist" dictField="id" dictText="regional_company"   defaultVal="${accrualFangkuanPage.quyucompany}" hasLabel="false"  title="区域公司" ></t:dictSelect>     
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">区域公司</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								结息日:
							</label>
						</td>
						<td class="value">
									<t:dictSelect field="jiexiday" type="list"  dictTable="accrual_newbank_contractlist" dictField="id" dictText="interest_day"   defaultVal="${accrualFangkuanPage.jiexiday}" hasLabel="false"  title="结息日" ></t:dictSelect>     
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">结息日</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								承包商:
							</label>
						</td>
						<td class="value">
									<t:dictSelect field="cbscompany" type="list"  dictTable="accrual_newbank_contractlist" dictField="id" dictText="contractor"   defaultVal="${accrualFangkuanPage.cbscompany}" hasLabel="false"  title="承包商" ></t:dictSelect>     
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">承包商</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								合同起始日期:
							</label>
						</td>
						<td class="value">
									<t:dictSelect field="contractqsrq" type="list"  dictTable="accrual_newbank_contractlist" dictField="id" dictText="start_date"   defaultVal="${accrualFangkuanPage.contractqsrq}" hasLabel="false"  title="合同起始日期" ></t:dictSelect>     
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">合同起始日期</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								项目部:
							</label>
						</td>
						<td class="value">
									<t:dictSelect field="xmbcompany" type="list"  dictTable="accrual_newbank_contractlist" dictField="id" dictText="project_department"   defaultVal="${accrualFangkuanPage.xmbcompany}" hasLabel="false"  title="项目部" ></t:dictSelect>     
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">项目部</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								合同终止日期:
							</label>
						</td>
						<td class="value">
									<t:dictSelect field="contractzzrq" type="list"  dictTable="accrual_newbank_contractlist" dictField="id" dictText="end_date"   defaultVal="${accrualFangkuanPage.contractzzrq}" hasLabel="false"  title="合同终止日期" ></t:dictSelect>     
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">合同终止日期</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								基础利率:
							</label>
						</td>
						<td class="value">
									<t:dictSelect field="baserate" type="list"  dictTable="accrual_rate" dictField="id" dictText="yearrate"   defaultVal="${accrualFangkuanPage.baserate}" hasLabel="false"  title="基础利率" ></t:dictSelect>     
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">基础利率</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								超额利率:
							</label>
						</td>
						<td class="value">
									<t:dictSelect field="overrate" type="list"  dictTable="accrual_rate" dictField="id" dictText="yearrate"   defaultVal="${accrualFangkuanPage.overrate}" hasLabel="false"  title="超额利率" ></t:dictSelect>     
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">超额利率</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								放款金额:
							</label>
						</td>
						<td class="value">
						     	 <input id="fangkuanjine" name="fangkuanjine" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${accrualFangkuanPage.fangkuanjine}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">放款金额</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								单据状态:
							</label>
						</td>
						<td class="value">
						     	 <input id="danjuzt" name="danjuzt" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${accrualFangkuanPage.danjuzt}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">单据状态</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								备注:
							</label>
						</td>
						<td class="value">
						     	 <input id="note" name="note" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${accrualFangkuanPage.note}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">备注</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								制单人:
							</label>
						</td>
						<td class="value">
						     	 <input id="zhidanren" name="zhidanren" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${accrualFangkuanPage.zhidanren}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">制单人</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								制单日期:
							</label>
						</td>
						<td class="value">
									  <input id="zhidandate" name="zhidandate" type="text" style="width: 150px"  class="Wdate" onClick="WdatePicker()"  ignore="ignore" value='<fmt:formatDate value='${accrualFangkuanPage.zhidandate}' type="date" pattern="yyyy-MM-dd"/>'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">制单日期</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								审核人:
							</label>
						</td>
						<td class="value">
						     	 <input id="shenheren" name="shenheren" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${accrualFangkuanPage.shenheren}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">审核人</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								审核日期:
							</label>
						</td>
						<td class="value">
									  <input id="shenhedate" name="shenhedate" type="text" style="width: 150px"  class="Wdate" onClick="WdatePicker()"  ignore="ignore" value='<fmt:formatDate value='${accrualFangkuanPage.shenhedate}' type="date" pattern="yyyy-MM-dd"/>'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">审核日期</label>
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
  <script src = "webpage/com/jeecg/fangkuan/accrualFangkuan.js"></script>		
