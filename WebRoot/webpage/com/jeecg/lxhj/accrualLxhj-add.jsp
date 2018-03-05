<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<!DOCTYPE html>
<html>
 <head>
  <title>借贷资金合计</title>
  <t:base type="jquery,easyui,tools,DatePicker"></t:base>
  <script type="text/javascript">
  //编写自定义JS代码
  </script>
 </head>
 <body>
  <t:formvalid formid="formobj" dialog="true" usePlugin="password" layout="table" action="accrualLxhjController.do?doAdd" >
					<input id="id" name="id" type="hidden" value="${accrualLxhjPage.id }"/>
		<table style="width: 600px;" cellpadding="0" cellspacing="1" class="formtable">
				<tr>
					<td align="right">
						<label class="Validform_label">
							已收总基础利息:
						</label>
					</td>
					<td class="value">
					     	 <input id="basicinterest" name="basicinterest" type="text" style="width: 150px" class="inputxt"  ignore="ignore" />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">已收总基础利息</label>
						</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							已收总超额利息:
						</label>
					</td>
					<td class="value">
					     	 <input id="excessinterest" name="excessinterest" type="text" style="width: 150px" class="inputxt"  ignore="ignore" />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">已收总超额利息</label>
						</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							已收利息合计:
						</label>
					</td>
					<td class="value">
					     	 <input id="interestpayable" name="interestpayable" type="text" style="width: 150px" class="inputxt"  ignore="ignore" />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">已收利息合计</label>
						</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							已收本金合计:
						</label>
					</td>
					<td class="value">
					     	 <input id="benjin" name="benjin" type="text" style="width: 150px" class="inputxt"  ignore="ignore" />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">已收本金合计</label>
						</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							利本合计:
						</label>
					</td>
					<td class="value">
					     	 <input id="liben" name="liben" type="text" style="width: 150px" class="inputxt"  ignore="ignore" />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">利本合计</label>
						</td>
				</tr>
				
				
			</table>
		</t:formvalid>
 </body>
  <script src = "webpage/com/jeecg/lxhj/accrualLxhj.js"></script>		
