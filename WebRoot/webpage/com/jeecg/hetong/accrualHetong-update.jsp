<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<!DOCTYPE html>
<html>
 <head>
  <title>合同信息表</title>
  <t:base type="jquery,easyui,tools,DatePicker"></t:base>
  <script type="text/javascript">
  //编写自定义JS代码
  </script>
 </head>
 <body>
		<t:formvalid formid="formobj" dialog="true" usePlugin="password" layout="table" action="accrualHetongController.do?doUpdate" >
					<input id="id" name="id" type="hidden" value="${accrualHetongPage.id }"/>
		<table style="width: 600px;" cellpadding="0" cellspacing="1" class="formtable">
					<tr>
						<td align="right">
							<label class="Validform_label">
								合同编号:
							</label>
						</td>
						<td class="value">
						     	 <input id="contractid" name="contractid" type="text" style="width: 150px" class="inputxt"  datatype="n"  ignore="ignore"  value='${accrualHetongPage.contractid}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">合同编号</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								借款单位:
							</label>
						</td>
						<td class="value">
						     	 <input id="borrower" name="borrower" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${accrualHetongPage.borrower}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">借款单位</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								贷款单位:
							</label>
						</td>
						<td class="value">
						     	 <input id="loanunit" name="loanunit" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${accrualHetongPage.loanunit}'/>
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
						     	 <input id="companyarea" name="companyarea" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${accrualHetongPage.companyarea}'/>
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
						     	 <input id="contractor" name="contractor" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${accrualHetongPage.contractor}'/>
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
						     	 <input id="projectdept" name="projectdept" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${accrualHetongPage.projectdept}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">项目部</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								贷款方式:
							</label>
						</td>
						<td class="value">
						     	 <input id="loanmethod" name="loanmethod" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${accrualHetongPage.loanmethod}'/>
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
						     	 <input id="contractnature" name="contractnature" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${accrualHetongPage.contractnature}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">合同性质</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								合同状态:
							</label>
						</td>
						<td class="value">
						     	 <input id="contractstatus" name="contractstatus" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${accrualHetongPage.contractstatus}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">合同状态</label>
						</td>
					</tr>
				
			</table>
		</t:formvalid>
 </body>
  <script src = "webpage/com/jeecg/hetong/accrualHetong.js"></script>		
