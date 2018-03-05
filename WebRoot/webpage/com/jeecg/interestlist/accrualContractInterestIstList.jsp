<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<t:base type="jquery,easyui,tools,DatePicker"></t:base>
<div class="easyui-layout" fit="true">
  <div region="center" style="padding:0px;border:0px">
  <t:datagrid name="accrualContractInterestIstList" checkbox="true" pagination="true" fitColumns="true" title="合同利息清单" actionUrl="accrualContractInterestIstController.do?datagrid" idField="id" fit="true" queryMode="group">
   <t:dgCol title="主键"  field="id"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="清单编号"  field="listNumber"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="合同类型"  field="contractType"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="合同编号"  field="contractId"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="本金"  field="principal"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="复利方式"  field="compoundInterest"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="结息日"  field="endInterestDay"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="贷款单位"  field="loanUnit"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="借款单位"  field="borrower"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="区域公司"  field="regionalCompany"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="承包商"  field="contractor"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="项目部"  field="projectDepartment"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="基础利率"  field="baseRate"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="超额利率"  field="excessRate"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="基础利息"  field="baseInterest"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="超额利息"  field="excessInteres"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="利息合计"  field="interestAggregate"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="起息日"  field="startInterestDay"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="结息天数"  field="restDays"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="操作" field="opt" width="100"></t:dgCol>
   <t:dgDelOpt title="删除" url="accrualContractInterestIstController.do?doDel&id={id}" urlclass="ace_button"  urlfont="fa-trash-o"/>
   <t:dgToolBar title="录入" icon="icon-add" url="accrualContractInterestIstController.do?goAdd" funname="add"></t:dgToolBar>
   <t:dgToolBar title="编辑" icon="icon-edit" url="accrualContractInterestIstController.do?goUpdate" funname="update"></t:dgToolBar>
   <t:dgToolBar title="批量删除"  icon="icon-remove" url="accrualContractInterestIstController.do?doBatchDel" funname="deleteALLSelect"></t:dgToolBar>
   <t:dgToolBar title="查看" icon="icon-search" url="accrualContractInterestIstController.do?goUpdate" funname="detail"></t:dgToolBar>
   <t:dgToolBar title="导入" icon="icon-put" funname="ImportXls"></t:dgToolBar>
   <t:dgToolBar title="导出" icon="icon-putout" funname="ExportXls"></t:dgToolBar>
   <t:dgToolBar title="模板下载" icon="icon-putout" funname="ExportXlsByT"></t:dgToolBar>
  </t:datagrid>
  </div>
 </div>
 <script src = "webpage/com/jeecg/interestlist/accrualContractInterestIstList.js"></script>		
 <script type="text/javascript">
 $(document).ready(function(){
 });
 
   
 
//导入
function ImportXls() {
	openuploadwin('Excel导入', 'accrualContractInterestIstController.do?upload', "accrualContractInterestIstList");
}

//导出
function ExportXls() {
	JeecgExcelExport("accrualContractInterestIstController.do?exportXls","accrualContractInterestIstList");
}

//模板下载
function ExportXlsByT() {
	JeecgExcelExport("accrualContractInterestIstController.do?exportXlsByT","accrualContractInterestIstList");
}

 </script>