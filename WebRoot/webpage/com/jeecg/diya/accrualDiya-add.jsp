<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<!DOCTYPE html>
<html>
 <head>
  <title>抵押信息表</title>
  <t:base type="jquery,easyui,tools,DatePicker"></t:base>
  <script type="text/javascript">
  //编写自定义JS代码
  </script>
 </head>
 <body>
  <t:formvalid formid="formobj" dialog="true" usePlugin="password" layout="table" action="accrualDiyaController.do?doAdd" >
					<input id="id" name="id" type="hidden" value="${accrualDiyaPage.id }"/>
		<table style="width: 600px;" cellpadding="0" cellspacing="1" class="formtable">
				<tr>
					<td align="right">
						<label class="Validform_label">
							所有权单位:
						</label>
					</td>
					<td class="value">
					     	 <input id="ownershipunit" name="ownershipunit" type="text" style="width: 150px" class="inputxt"  ignore="ignore" />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">所有权单位</label>
						</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							质押物:
						</label>
					</td>
					<td class="value">
					     	 <input id="pledge" name="pledge" type="text" style="width: 150px" class="inputxt"  ignore="ignore" />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">质押物</label>
						</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							评估价值:
						</label>
					</td>
					<td class="value">
					     	 <input id="evaluationvalue" name="evaluationvalue" type="text" style="width: 150px" class="inputxt"  ignore="ignore" />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">评估价值</label>
						</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							评估单位:
						</label>
					</td>
					<td class="value">
					     	 <input id="evaluationunit" name="evaluationunit" type="text" style="width: 150px" class="inputxt"  ignore="ignore" />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">评估单位</label>
						</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							可抵押价值:
						</label>
					</td>
					<td class="value">
					     	 <input id="mortgagedvalue" name="mortgagedvalue" type="text" style="width: 150px" class="inputxt"  ignore="ignore" />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">可抵押价值</label>
						</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							累计已抵押价值:
						</label>
					</td>
					<td class="value">
					     	 <input id="toatlmortgagedvalue" name="toatlmortgagedvalue" type="text" style="width: 150px" class="inputxt"  ignore="ignore" />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">累计已抵押价值</label>
						</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							剩余抵押价值:
						</label>
					</td>
					<td class="value">
					     	 <input id="surplusmortgagedvalue" name="surplusmortgagedvalue" type="text" style="width: 150px" class="inputxt"  ignore="ignore" />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">剩余抵押价值</label>
						</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							实际使用可抵押值:
						</label>
					</td>
					<td class="value">
					     	 <input id="actualmortgagedvalue" name="actualmortgagedvalue" type="text" style="width: 150px" class="inputxt"  ignore="ignore" />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">实际使用可抵押值</label>
						</td>
				</tr>
				
				
			</table>
		</t:formvalid>
 </body>
  <script src = "webpage/com/jeecg/diya/accrualDiya.js"></script>		
