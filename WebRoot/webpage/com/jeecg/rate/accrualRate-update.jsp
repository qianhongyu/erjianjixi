<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<!DOCTYPE html>
<html>
 <head>
  <title>利息设置</title>
  <t:base type="jquery,easyui,tools,DatePicker"></t:base>
  <script type="text/javascript">
  //编写自定义JS代码
  </script>
 </head>
 <body>
		<t:formvalid formid="formobj" dialog="true" usePlugin="password" layout="table" action="accrualRateController.do?doUpdate" >
					<input id="id" name="id" type="hidden" value="${accrualRatePage.id }"/>
		<table style="width: 600px;" cellpadding="0" cellspacing="1" class="formtable">
					<tr>
						<td align="right">
							<label class="Validform_label">
								利率名称:
							</label>
						</td>
						<td class="value">
						     	 <input id="ratename" name="ratename" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${accrualRatePage.ratename}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">利率名称</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								利率类型:
							</label>
						</td>
						<td class="value">
									<t:dictSelect field="ratetype" type="list"  dictTable="accrual_rate_type" dictField="id" dictText="text"   defaultVal="${accrualRatePage.ratetype}" hasLabel="false"  title="利率类型" ></t:dictSelect>     
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">利率类型</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								日利率天数:
							</label>
						</td>
						<td class="value">
									<t:dictSelect field="dayrateshu" type="list"  dictTable="accrual_rate_day" dictField="id" dictText="text"   defaultVal="${accrualRatePage.dayrateshu}" hasLabel="false"  title="日利率天数" ></t:dictSelect>     
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">日利率天数</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								年利率(%):
							</label>
						</td>
						<td class="value">
						     	 <input id="yearrate" name="yearrate" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${accrualRatePage.yearrate}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">年利率</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								月利率(‰):
							</label>
						</td>
						<td class="value">
						     	 <input id="monthrate" name="monthrate" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${accrualRatePage.monthrate}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">月利率</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								日利率(‰):
							</label>
						</td>
						<td class="value">
						     	 <input id="daterate" name="daterate" type="text" style="width: 150px" class="inputxt"  ignore="ignore"  value='${accrualRatePage.daterate}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">日利率</label>
						</td>
					</tr>
				
			</table>
		</t:formvalid>
 </body>
  <script src = "webpage/com/jeecg/rate/accrualRate.js"></script>		
