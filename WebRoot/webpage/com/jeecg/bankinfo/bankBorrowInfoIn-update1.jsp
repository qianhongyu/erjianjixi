<%@ page language="java" import="java.util.*"
	contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<!DOCTYPE html>
<html>
<head>
<title>银行对内借款信息</title>
<t:base type="jquery,easyui,tools,DatePicker"></t:base>
<style type="text/css">
#content {
	width: 400px;
	height: 200px;
}

#tab_bar {
	width: 400px;
	height: 20px;
	float: left;
}

#tab_bar ul {
	padding: 0px;
	margin: 0px;
	height: 20px;
	text-align: center;
}

#tab_bar li {
	list-style-type: none;
	float: left;
	width: 133.3px;
	height: 20px;
	background-color: gray;
}

.tab_css {
	width: 400px;
	height: 200px;
	background-color: white;
	display: none;
	float: left;
}
</style>
<script type="text/javascript">
	var myclick = function(v) {
		var llis = document.getElementsByTagName("li");
		for (var i = 0; i < llis.length; i++) {
			var lli = llis[i];
			if (lli == document.getElementById("tab" + v)) {
				lli.style.backgroundColor = "orange";
			} else {
				lli.style.backgroundColor = "gray";
			}
		}

		var divs = document.getElementsByClassName("tab_css");
		for (var i = 0; i < divs.length; i++) {

			var divv = divs[i];

			if (divv == document.getElementById("tab" + v + "_content")) {
				divv.style.display = "block";
			} else {
				divv.style.display = "none";
			}
		}

	}
</script>
<script type="text/javascript">
	//编写自定义JS代码
	$(function() {
		load();
		load1();
	});

	function load() {
		if (${bankBorrowInfoInPage.repaymentMode} == 3) {
			if (${bankBorrowInfoInPage.interestCycle} == 1) {
				for (var i = 0; i < 11; i++) {
					var tr = "<tr>" + "<td>" + "2018年" + (i + 2) + "月22日"
							+ "</td>" + "<td>" + "0" + "</td>" + "<td>" + "0"
							+ "</td>" + "<td>" + "0" + "</td>" + "</tr>";
					$("#tabList").append(tr);
				}
				var tr = "<tr>" + "<td>" + "2019年1月22日" + "</td>" + "<td>"
						+ "0" + "</td>" + "<td>" + "0" + "</td>" + "<td>" + "0"
						+ "</td>" + "</tr>";
				$("#tabList").append(tr);
			} else if (${bankBorrowInfoInPage.interestCycle} == 2) {
				var tr = "<tr>" + "<td>" + "2018年4月22日" + "</td>" + "<td>"
						+ "0" + "</td>" + "<td>" + "0" + "</td>" + "<td>" + "0"
						+ "</td>" + "</tr>";
				$("#tabList").append(tr);
				var tr = "<tr>" + "<td>" + "2018年7月22日" + "</td>" + "<td>"
						+ "0" + "</td>" + "<td>" + "0" + "</td>" + "<td>" + "0"
						+ "</td>" + "</tr>";
				$("#tabList").append(tr);
				var tr = "<tr>" + "<td>" + "2018年10月22日" + "</td>" + "<td>"
						+ "0" + "</td>" + "<td>" + "0" + "</td>" + "<td>" + "0"
						+ "</td>" + "</tr>";
				$("#tabList").append(tr);
				var tr = "<tr>" + "<td>" + "2019年1月22日" + "</td>" + "<td>"
						+ "0" + "</td>" + "<td>" + "0" + "</td>" + "<td>" + "0"
						+ "</td>" + "</tr>";
				$("#tabList").append(tr);
			} else {
				var tr = "<tr>" + "<td>" + "2019年1月22日" + "</td>" + "<td>"
						+ "0" + "</td>" + "<td>" + "0" + "</td>" + "<td>" + "0"
						+ "</td>" + "</tr>";
				$("#tabList").append(tr);
			}
		}
		var tr = "<tr>" + "<td>" + "1" + "</td>" + "<td>" + "342111346556" + "</td>"
				+ "<td>" + "2018年2月22日" + "</td>" + "<td>" + "该执行情况属实"
				+ "</td>" + "<td>" + "0" + "</td>" + "<td>" + "0" + "</td>"
				+ "<td>" + "0" + "</td>" + "</tr>";
		$("#tabzhixing").append(tr);
	}

	function load1() {
		

	}
</script>
</head>
<body>
	<t:formvalid formid="formobj" dialog="true" usePlugin="password"
		layout="table" action="bankBorrowInfoInController.do?doUpdate">
		<input id="id" name="id" type="hidden"
			value="${bankBorrowInfoInPage.id }" />
		<div id="tab_bar">
			<ul>
				<li id="tab1" onclick="myclick(1)" style="background-color: orange">
					借款信息</li>
				<li id="tab2" onclick="myclick(2)">还款计划</li>
				<li id="tab3" onclick="myclick(3)">还款信息</li>
			</ul>
		</div>
		<div class="tab_css" id="tab1_content"
			style="display: block;clear:both;">
			<div>
				<table style="width: 600px;" cellpadding="0" cellspacing="1"
					class="formtable">
					<tr>
						<td align="right"><label class="Validform_label">
								对应的合同编号: </label></td>
						<td class="value"><t:dictSelect field="contractId"
								type="list" dictTable="accrual_all_contract"
								dictField="contract_id" dictText="contract_name"
								defaultVal="${bankBorrowInfoInPage.contractId}" hasLabel="false"
								title="对应的合同编号"></t:dictSelect> <span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">对应的合同编号</label></td>
						<td align="right"><label class="Validform_label">
								借款金额: </label></td>
						<td class="value"><input id="loanamount" name="loanamount"
							type="text" style="width: 150px" class="inputxt" ignore="ignore"
							value='${bankBorrowInfoInPage.loanamount}' /> <span
							class="Validform_checktip"></span> <label class="Validform_label"
							style="display: none;">借款金额</label></td>

						<td align="right"><label class="Validform_label">
								基础利率: </label></td>
						<td class="value"><t:dictSelect field="baseRate" type="list"
								dictTable="accrual_base_rate" dictField="id"
								dictText="base_rate"
								defaultVal="${bankBorrowInfoInPage.baseRate}" hasLabel="false"
								title="基础利率"></t:dictSelect> <span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">基础利率</label>
						</td>
					</tr>
					<tr>
						<td align="right"><label class="Validform_label">
								超额利率: </label></td>
						<td class="value"><t:dictSelect field="excessinterestRate"
								type="list" dictTable="accrual_excessinterest_rate"
								dictField="id" dictText="excessinterest_rate"
								defaultVal="${bankBorrowInfoInPage.excessinterestRate}"
								hasLabel="false" title="超额利率"></t:dictSelect> <span
							class="Validform_checktip"></span> <label class="Validform_label"
							style="display: none;">超额利率</label></td>

						<td align="right"><label class="Validform_label">
								开始时间: </label></td>
						<td class="value"><input id="startTime" name="startTime"
							type="text" style="width: 150px" class="Wdate"
							onClick="WdatePicker()" ignore="ignore"
							value='<fmt:formatDate value='${bankBorrowInfoInPage.startTime}' type="date" pattern="yyyy-MM-dd"/>' />
							<span class="Validform_checktip"></span> <label
							class="Validform_label" style="display: none;">开始时间</label></td>
						<td align="right"><label class="Validform_label">
								结束时间: </label></td>
						<td class="value"><input id="endTime" name="endTime"
							type="text" style="width: 150px" class="Wdate"
							onClick="WdatePicker()" ignore="ignore"
							value='<fmt:formatDate value='${bankBorrowInfoInPage.endTime}' type="date" pattern="yyyy-MM-dd"/>' />
							<span class="Validform_checktip"></span> <label
							class="Validform_label" style="display: none;">结束时间</label></td>
					</tr>
					<tr>
						<td align="right"><label class="Validform_label">
								结息日: </label></td>
						<td class="value"><t:dictSelect field="period" type="list"
								dictTable="accrual_day" dictField="id" dictText="day_id"
								defaultVal="${bankBorrowInfoInPage.period}" hasLabel="false"
								title="结息日"></t:dictSelect> <span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">结息日</label>
						</td>
						<td align="right"><label class="Validform_label">
								还款日: </label></td>
						<td class="value"><t:dictSelect field="repaymentDate"
								type="list" dictTable="accrual_day" dictField="id"
								dictText="day_id"
								defaultVal="${bankBorrowInfoInPage.repaymentDate}"
								hasLabel="false" title="还款日"></t:dictSelect> <span
							class="Validform_checktip"></span> <label class="Validform_label"
							style="display: none;">还款日</label></td>

						<td align="right"><label class="Validform_label">
								还款方式: </label></td>
						<td class="value"><t:dictSelect field="repaymentMode"
								type="list" dictTable="accrual_info_type" dictField="id"
								dictText="type"
								defaultVal="${bankBorrowInfoInPage.repaymentMode}"
								hasLabel="false" title="还款方式"></t:dictSelect> <span
							class="Validform_checktip"></span> <label class="Validform_label"
							style="display: none;">还款方式</label></td>
					</tr>
					<tr>
						<td align="right"><label class="Validform_label">
								结息周期: </label></td>
						<td class="value"><t:dictSelect field="interestCycle"
								type="list" dictTable="accrual_info_jg" dictField="id"
								dictText="text"
								defaultVal="${bankBorrowInfoInPage.interestCycle}"
								hasLabel="false" title="结息周期"></t:dictSelect> <span
							class="Validform_checktip"></span> <label class="Validform_label"
							style="display: none;">结息周期</label></td>

						<td align="right"><label class="Validform_label">
								借款单位: </label></td>
						<td class="value"><t:dictSelect field="borrower" type="list"
								dictTable="accrual_borrower" dictField="id"
								dictText="borrower_name"
								defaultVal="${bankBorrowInfoInPage.borrower}" hasLabel="false"
								title="借款单位"></t:dictSelect> <span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">借款单位</label>
						</td>
						<td align="right"><label class="Validform_label">
								担保单位: </label></td>
						<td class="value"><t:dictSelect field="guarantor" type="list"
								dictTable="accrual_guarantor" dictField="id"
								dictText="guarantor_name"
								defaultVal="${bankBorrowInfoInPage.guarantor}" hasLabel="false"
								title="担保单位"></t:dictSelect> <span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">担保单位</label>
						</td>
					</tr>
					<tr>
						<td align="right"><label class="Validform_label">
								放款单位: </label></td>
						<td class="value"><t:dictSelect field="lender" type="list"
								dictTable="accrual_lender" dictField="id" dictText="lender_name"
								defaultVal="${bankBorrowInfoInPage.lender}" hasLabel="false"
								title="放款单位"></t:dictSelect> <span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">放款单位</label>
						</td>
						<td align="right"><label class="Validform_label">
								录入人: </label></td>
						<td class="value"><input id="inputPerson" name="inputPerson"
							type="text" style="width: 150px" class="inputxt" ignore="ignore"
							value='${bankBorrowInfoInPage.inputPerson}' /> <span
							class="Validform_checktip"></span> <label class="Validform_label"
							style="display: none;">录入人</label></td>

						<td align="right"><label class="Validform_label">
								录入时间: </label></td>
						<td class="value"><input id="inputTime" name="inputTime"
							type="text" style="width: 150px" class="Wdate"
							onClick="WdatePicker()" ignore="ignore"
							value='<fmt:formatDate value='${bankBorrowInfoInPage.inputTime}' type="date" pattern="yyyy-MM-dd"/>' />
							<span class="Validform_checktip"></span> <label
							class="Validform_label" style="display: none;">录入时间</label></td>
					</tr>
					<tr>
						<td align="right"><label class="Validform_label">
								最后一次的修改人: </label></td>
						<td class="value"><input id="updatePerson"
							name="updatePerson" type="text" style="width: 150px"
							class="inputxt" ignore="ignore"
							value='${bankBorrowInfoInPage.updatePerson}' /> <span
							class="Validform_checktip"></span> <label class="Validform_label"
							style="display: none;">最后一次的修改人</label></td>

						<td align="right"><label class="Validform_label">
								最后一次的修改时间: </label></td>
						<td class="value"><input id="updateTime" name="updateTime"
							type="text" style="width: 150px" class="Wdate"
							onClick="WdatePicker()" ignore="ignore"
							value='<fmt:formatDate value='${bankBorrowInfoInPage.updateTime}' type="date" pattern="yyyy-MM-dd"/>' />
							<span class="Validform_checktip"></span> <label
							class="Validform_label" style="display: none;">最后一次的修改时间</label>
						</td>
						<td align="right"><label class="Validform_label"> </label></td>
						<td class="value"></td>
					</tr>

				</table>
			</div>
		</div>
		<div class="tab_css" id="tab2_content" style="clear:both;">
			<div>
				<table style="width: 600px;" cellpadding="0" cellspacing="1"
					class="formtable">
					<thead>
						<tr>
							<th>还款日期</th>
							<th>基础利息</th>
							<th>超额利息</th>
							<th>应还利息</th>
						</tr>
					</thead>
					<tbody id="tabList">

					</tbody>
				</table>
			</div>
		</div>
		<div class="tab_css" id="tab3_content" style="clear:both;">
			<div>
				<table style="width: 600px;" cellpadding="0" cellspacing="1"
					class="formtable">
					<thead>
						<tr>
							<th>编号</th>
							<th>单据编号</th>
							<th>摘要</th>
							<th>执行日期</th>
							<th>已还本金</th>
							<th>应付利息</th>
							<th>已付利息</th>
						</tr>
					</thead>
					<tbody id="tabzhixing">

					</tbody>
				</table>
			</div>
		</div>

	</t:formvalid>
</body>
<script src="webpage/com/jeecg/bankinfo/bankBorrowInfoIn.js"></script>