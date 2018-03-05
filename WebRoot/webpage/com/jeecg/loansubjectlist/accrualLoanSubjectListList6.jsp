<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<t:base type="jquery,easyui,tools,DatePicker"></t:base>
<div class="easyui-layout" fit="true">
  <div region="center" style="padding:0px;border:0px">
  <t:datagrid name="accrualLoanSubjectListList" checkbox="true" pagination="true" fitColumns="true" title="借款主体列表" actionUrl="accrualLoanSubjectListController.do?datagrid6" idField="id" fit="true" queryMode="group">
   <t:dgCol title="主键"  field="id"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="名称"  field="name"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="年度产值"  field="annualoutputvalue"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="征信情况"  field="creditinformation"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="工程质量考核情况"  field="engineeringquality"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="综合描述"  field="comprehensivedescription"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="实际控制人"  field="actualcontroller"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="实际控制人职务"  field="actualcontrollerDuty"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="实际控制人手机"  field="actualcontrollerPhone"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="实际控制人邮箱"  field="actualcontrollerEmail"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="财务人员"  field="financialstaff"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="财务人员职务"  field="financialstaffDuty"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="财务人员手机"  field="financialstaffPhone"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="财务人员邮箱"  field="financialstaffEmail"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="备注"  field="remarks"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="借款主体类别id"  field="loanSubjictId"  hidden="true"  queryMode="single"  dictionary="accrual_loan_subject_type,id,text"  width="120"></t:dgCol>
   <t:dgCol title="操作" field="opt" width="100"></t:dgCol>
   <t:dgDelOpt title="删除" url="accrualLoanSubjectListController.do?doDel&id={id}" urlclass="ace_button"  urlfont="fa-trash-o"/>
   <t:dgToolBar title="录入" icon="icon-add" url="accrualLoanSubjectListController.do?goAdd&id=6" funname="add"></t:dgToolBar>
   <t:dgToolBar title="编辑" icon="icon-edit" url="accrualLoanSubjectListController.do?goUpdate&id=6" funname="update"></t:dgToolBar>
   <t:dgToolBar title="批量删除"  icon="icon-remove" url="accrualLoanSubjectListController.do?doBatchDel" funname="deleteALLSelect"></t:dgToolBar>
   <t:dgToolBar title="查看" icon="icon-search" url="accrualLoanSubjectListController.do?goUpdate&id=6" funname="detail"></t:dgToolBar>
   <t:dgToolBar title="导入" icon="icon-put" funname="ImportXls"></t:dgToolBar>
   <t:dgToolBar title="导出" icon="icon-putout" funname="ExportXls"></t:dgToolBar>
   <t:dgToolBar title="模板下载" icon="icon-putout" funname="ExportXlsByT"></t:dgToolBar>
  </t:datagrid>
  </div>
 </div>
 <script src = "webpage/com/jeecg/loansubjectlist/accrualLoanSubjectListList.js"></script>		
 <script type="text/javascript">
 $(document).ready(function(){
 });
 
   
 
//导入
function ImportXls() {
	openuploadwin('Excel导入', 'accrualLoanSubjectListController.do?upload', "accrualLoanSubjectListList");
}

//导出
function ExportXls() {
	JeecgExcelExport("accrualLoanSubjectListController.do?exportXls","accrualLoanSubjectListList");
}

//模板下载
function ExportXlsByT() {
	JeecgExcelExport("accrualLoanSubjectListController.do?exportXlsByT","accrualLoanSubjectListList");
}

 </script>