<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<t:base type="jquery,easyui,tools,DatePicker"></t:base>
<div class="easyui-layout" fit="true">
  <div region="center" style="padding:0px;border:0px">
  <t:datagrid name="accrualInterestCalculationList" checkbox="true" pagination="true" fitColumns="true" title="利息计算" actionUrl="accrualInterestCalculationController.do?datagrid" idField="id" fit="true" queryMode="group">
   <t:dgCol title="主键"  field="id"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="合同类型"  field="contractNature"  queryMode="single"  dictionary="accrual_contract_nature,id,text"  width="120"></t:dgCol>
   <t:dgCol title="合同编号"  field="contractId"  query="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="合同金额"  field="loanAmount"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="基础利率"  field="baseRate"  queryMode="single"  dictionary="accrual_rate,id,yearrate"  width="120"></t:dgCol>
   <t:dgCol title="超额利率"  field="excessRate"  queryMode="single"  dictionary="accrual_rate,id,yearrate"  width="120"></t:dgCol>
   <t:dgCol title="结息日"  field="interestDay"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="当前结息日"  field="nowinterestDay"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="下一结息日"  field="nextinterestDay"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="贷款单位"  field="loanUnit"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="借款单位"  field="borrower"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="区域公司"  field="regionalCompany"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="承包商"  field="contractor"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="操作" field="opt" width="100"></t:dgCol>
   <t:dgDelOpt title="删除" url="accrualInterestCalculationController.do?doDel&id={id}" urlclass="ace_button"  urlfont="fa-trash-o"/>
   <t:dgToolBar title="录入" icon="icon-add" url="accrualInterestCalculationController.do?goAdd" funname="add"></t:dgToolBar>
   <t:dgToolBar title="编辑" icon="icon-edit" url="accrualInterestCalculationController.do?goUpdate" funname="update"></t:dgToolBar>
   <t:dgToolBar title="批量删除"  icon="icon-remove" url="accrualInterestCalculationController.do?doBatchDel" funname="deleteALLSelect"></t:dgToolBar>
   <t:dgToolBar title="查看" icon="icon-search" url="accrualInterestCalculationController.do?goUpdate" funname="detail"></t:dgToolBar>
   <t:dgToolBar title="导入" icon="icon-put" funname="ImportXls"></t:dgToolBar>
   <t:dgToolBar title="导出" icon="icon-putout" funname="ExportXls"></t:dgToolBar>
   <t:dgToolBar title="模板下载" icon="icon-putout" funname="ExportXlsByT"></t:dgToolBar>
  </t:datagrid>
  </div>
 </div>
 <script src = "webpage/com/jeecg/interestmath/accrualInterestCalculationList.js"></script>		
 <script type="text/javascript">
 $(document).ready(function(){
 });
 
   
 
//导入
function ImportXls() {
	openuploadwin('Excel导入', 'accrualInterestCalculationController.do?upload', "accrualInterestCalculationList");
}

//导出
function ExportXls() {
	JeecgExcelExport("accrualInterestCalculationController.do?exportXls","accrualInterestCalculationList");
}

//模板下载
function ExportXlsByT() {
	JeecgExcelExport("accrualInterestCalculationController.do?exportXlsByT","accrualInterestCalculationList");
}

 </script>