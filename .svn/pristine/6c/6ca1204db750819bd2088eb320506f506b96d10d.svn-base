<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<!DOCTYPE html>
<html>
 <head>
  <title>担保表</title>
  <t:base type="jquery,easyui,tools,DatePicker"></t:base>
  <script type="text/javascript">
  //编写自定义JS代码
  </script>
 </head>
 <body>
		<t:formvalid formid="formobj" dialog="true" usePlugin="password" layout="table" action="accrualGuaranteeController.do?doUpdate" >
					<input id="id" name="id" type="hidden" value="${accrualGuaranteePage.id }"/>
		<table style="width: 600px;" cellpadding="0" cellspacing="1" class="formtable">
					<tr>
						<td align="right">
							<label class="Validform_label">
								担保合同编号:
							</label>
						</td>
						<td class="value">
						     	 <input id="gnumber" name="gnumber" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${accrualGuaranteePage.gnumber}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">担保合同编号</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								担保单位:
							</label>
						</td>
						<td class="value">
						     	 <input id="guarantyunit" name="guarantyunit" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${accrualGuaranteePage.guarantyunit}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">担保单位</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								比率:
							</label>
						</td>
						<td class="value">
						     	 <input id="ratio" name="ratio" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${accrualGuaranteePage.ratio}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">比率</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								保证金额:
							</label>
						</td>
						<td class="value">
						     	 <input id="guaranteedamount" name="guaranteedamount" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${accrualGuaranteePage.guaranteedamount}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">保证金额</label>
						</td>
					</tr>
				
			</table>
		</t:formvalid>
 </body>
  <script src = "webpage/com/jeecg/guarantee/accrualGuarantee.js"></script>		
