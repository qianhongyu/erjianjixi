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
  <t:formvalid formid="formobj" dialog="true" usePlugin="password" layout="table" action="accrualFangkuanController.do?doAdd" >
					<input id="id" name="id" type="hidden" value="${accrualFangkuanPage.id }"/>
		<table style="width: 600px;" cellpadding="0" cellspacing="1" class="formtable">
				<tr>
					<td align="right">
						<label class="Validform_label">
							单据编号:
						</label>
					</td>
					<td class="value">
					     	 <input id="danjuId" name="danjuId" type="text" style="width: 150px" class="inputxt"  ignore="ignore" />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">单据编号</label>
						</td>
					<td align="right">
						<label class="Validform_label">
							合同编号:
						</label>
					</td>
					<td class="value">
					<t:dictSelect field="hetongId" type="list"  dictTable="accrual_newbank_contractlist" dictField="id" dictText="contract_id"  defaultVal="" hasLabel="false"  title="合同编号" ></t:dictSelect>					    
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
					<input id="daikuanunit" name="daikuanunit" type="text" style="width: 150px" class="inputxt"  ignore="ignore" />
							  <span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">贷款单位</label>
						</td>
					<td align="right">
						<label class="Validform_label">
							合同类型:
						</label>
					</td>
					<td class="value">
					<input id=contracttype name="contracttype" type="text" style="width: 150px" class="inputxt"  ignore="ignore" />
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
					<input id="jiekuanunit" name="jiekuanunit" type="text" style="width: 150px" class="inputxt"  ignore="ignore" />
							  <span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">借款单位</label>
						</td>
					<td align="right">
						<label class="Validform_label">
							合同金额:
						</label>
					</td>
					<td class="value">
					<input id="contractjine" name="contractjine" type="text" style="width: 150px" class="inputxt"  ignore="ignore" />
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
					<input id="quyucompany" name="quyucompany" type="text" style="width: 150px" class="inputxt"  ignore="ignore" />
							  <span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">区域公司</label>
						</td>
					<td align="right">
						<label class="Validform_label">
							结息日:
						</label>
					</td>
					<td class="value">
					<input id="jiexiday" name="jiexiday" type="text" style="width: 150px" class="inputxt"  ignore="ignore" />
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
					<input id="cbscompany" name="cbscompany" type="text" style="width: 150px" class="inputxt"  ignore="ignore" />
							  <span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">承包商</label>
						</td>
					<td align="right">
						<label class="Validform_label">
							合同起始日期:
						</label>
					</td>
					<td class="value">
					<input id="contractqsrq" name="contractqsrq" type="text" style="width: 150px" class="inputxt"  ignore="ignore" />
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
					<input id="xmbcompany" name="xmbcompany" type="text" style="width: 150px" class="inputxt"  ignore="ignore" />
							  <span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">项目部</label>
						</td>
					<td align="right">
						<label class="Validform_label">
							合同终止日期:
						</label>
					</td>
					<td class="value">
					<input id="contractzzrq" name="contractzzrq" type="text" style="width: 150px" class="inputxt"  ignore="ignore" />
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
					<input id="baserate" name="baserate" type="text" style="width: 150px" class="inputxt"  ignore="ignore" />
							 <span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">基础利率</label>
						</td>
					<td align="right">
						<label class="Validform_label">
							超额利率:
						</label>
					</td>
					<td class="value">
					<input id="overrate" name="overrate" type="text" style="width: 150px" class="inputxt"  ignore="ignore" />
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
					     	 <input id="fangkuanjine" name="fangkuanjine" type="text" style="width: 150px" class="inputxt"  ignore="ignore" />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">放款金额</label>
						</td>
					<td align="right">
						<label class="Validform_label">
							单据状态:
						</label>
					</td>
					<td class="value">
					     	 <input id="danjuzt" name="danjuzt" type="text" style="width: 150px" class="inputxt"  ignore="ignore" />
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
					     	 <input id="note" name="note" type="text" style="width: 150px" class="inputxt"  ignore="ignore" />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">备注</label>
						</td>
					<td align="right">
						<label class="Validform_label">
							制单人:
						</label>
					</td>
					<td class="value">
					     	 <input id="zhidanren" name="zhidanren" type="text" style="width: 150px" class="inputxt"  ignore="ignore" />
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
							   <input id="zhidandate" name="zhidandate" type="text" style="width: 150px" class="Wdate" onClick="WdatePicker()"  ignore="ignore" />    
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">制单日期</label>
						</td>
					<td align="right">
						<label class="Validform_label">
							审核人:
						</label>
					</td>
					<td class="value">
					     	 <input id="shenheren" name="shenheren" type="text" style="width: 150px" class="inputxt"  ignore="ignore" />
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
							   <input id="shenhedate" name="shenhedate" type="text" style="width: 150px" class="Wdate" onClick="WdatePicker()"  ignore="ignore" />    
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
