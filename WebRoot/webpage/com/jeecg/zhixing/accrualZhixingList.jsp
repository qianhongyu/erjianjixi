<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<t:base type="jquery,easyui,tools,DatePicker"></t:base>
<div class="easyui-layout" fit="true">
  <div region="center" style="padding:0px;border:0px">
  <t:datagrid name="accrualZhixingList" checkbox="true" pagination="true" fitColumns="true" title="执行情况" actionUrl="accrualZhixingController.do?datagrid" idField="id" fit="true" queryMode="group">
   <t:dgCol title="主键"  field="id"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="单据编号"  field="billid"  query="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="借款信息编号"  field="borrowid"  hidden="true"  queryMode="single"  dictionary="ACCRUAL_BORROW_INFO,id,BORROW_INFO_ID"  width="120"></t:dgCol>
   <t:dgCol title="摘要"  field="zhaiyao"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="执行日期"  field="dotime"  formatter="yyyy-MM-dd"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="应付本金"  field="payprincipal"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="已还本金"  field="returnprincipal"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="未还本金"  field="unpaidprincipal"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="应付利息"  field="interestpayable"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="已付利息"  field="paidinterest"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="未付利息"  field="unpaidinterest"  queryMode="single"  dictionary="bpm_status"  width="120"></t:dgCol>
   <t:dgCol title="操作人"  field="userpeople"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="操作" field="opt" width="100"></t:dgCol>
   <t:dgDelOpt title="删除" url="accrualZhixingController.do?doDel&id={id}" urlclass="ace_button"  urlfont="fa-trash-o"/>
   <t:dgToolBar title="录入" icon="icon-add" url="accrualZhixingController.do?goAdd" funname="add"></t:dgToolBar>
   <t:dgToolBar title="编辑" icon="icon-edit" url="accrualZhixingController.do?goUpdate" funname="update"></t:dgToolBar>
   <t:dgToolBar title="批量删除"  icon="icon-remove" url="accrualZhixingController.do?doBatchDel" funname="deleteALLSelect"></t:dgToolBar>
   <t:dgToolBar title="查看" icon="icon-search" url="accrualZhixingController.do?goUpdate" funname="detail"></t:dgToolBar>
   <t:dgToolBar title="导入" icon="icon-put" funname="ImportXls"></t:dgToolBar>
   <t:dgToolBar title="导出" icon="icon-putout" funname="ExportXls"></t:dgToolBar>
   <t:dgToolBar title="模板下载" icon="icon-putout" funname="ExportXlsByT"></t:dgToolBar>
  </t:datagrid>
  </div>
 </div>
 <script src = "webpage/com/jeecg/zhixing/accrualZhixingList.js"></script>		
 <script type="text/javascript">
 $(document).ready(function(){
 });
 
   
 
//导入
function ImportXls() {
	openuploadwin('Excel导入', 'accrualZhixingController.do?upload', "accrualZhixingList");
}

//导出
function ExportXls() {
	JeecgExcelExport("accrualZhixingController.do?exportXls","accrualZhixingList");
}

//模板下载
function ExportXlsByT() {
	JeecgExcelExport("accrualZhixingController.do?exportXlsByT","accrualZhixingList");
}

 </script>