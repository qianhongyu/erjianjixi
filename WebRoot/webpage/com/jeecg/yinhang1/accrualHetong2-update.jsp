<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<!DOCTYPE html>
<html>
 <head>
  <title>银行</title>
  <t:base type="jquery,easyui,tools,DatePicker"></t:base>
  <script type="text/javascript">
  //编写自定义JS代码
  </script>
 </head>
 <body>
		<t:formvalid formid="formobj" dialog="true" usePlugin="password" layout="table" action="accrualHetong2Controller.do?doUpdate" >
					<input id="id" name="id" type="hidden" value="${accrualHetong2Page.id }"/>
		<table style="width: 600px;" cellpadding="0" cellspacing="1" class="formtable">
					<tr>
						<td align="right">
							<label class="Validform_label">
								合同状态:
							</label>
						</td>
						<td class="value">
									<t:dictSelect field="contractstatus" type="list"  dictTable="accrual_zt" dictField="id" dictText="text"   defaultVal="${accrualHetong2Page.contractstatus}" hasLabel="false"  title="合同状态" ></t:dictSelect>     
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">合同状态</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								合同编号:
							</label>
						</td>
						<td class="value">
						     	 <input id="contractid" name="contractid" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${accrualHetong2Page.contractid}'/>
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
						     	 <input id="loanunit" name="loanunit" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${accrualHetong2Page.loanunit}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">贷款单位</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								区域公司:
							</label>
						</td>
						<td class="value">
						     	 <input id="companyarea" name="companyarea" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${accrualHetong2Page.companyarea}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">区域公司</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								承包商:
							</label>
						</td>
						<td class="value">
						     	 <input id="contractor" name="contractor" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${accrualHetong2Page.contractor}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">承包商</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								贷款方式:
							</label>
						</td>
						<td class="value">
									<t:dictSelect field="loanmethod" type="list"  dictTable="accrual_dkfs" dictField="id" dictText="text"   defaultVal="${accrualHetong2Page.loanmethod}" hasLabel="false"  title="贷款方式" ></t:dictSelect>     
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">贷款方式</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								合同性质:
							</label>
						</td>
						<td class="value">
									<t:dictSelect field="contractnature" type="list"  dictTable="accrual_xz" dictField="id" dictText="text"   defaultVal="${accrualHetong2Page.contractnature}" hasLabel="false"  title="合同性质" ></t:dictSelect>     
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">合同性质</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								借款单位:
							</label>
						</td>
						<td class="value">
						     	 <input id="borrower" name="borrower" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${accrualHetong2Page.borrower}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">借款单位</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								项目部:
							</label>
						</td>
						<td class="value">
						     	 <input id="projectdept" name="projectdept" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${accrualHetong2Page.projectdept}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">项目部</label>
						</td>
					</tr>
				
			</table>
		</t:formvalid>
 </body>
  <script src = "webpage/com/jeecg/yinhang1/accrualHetong2.js"></script>		
