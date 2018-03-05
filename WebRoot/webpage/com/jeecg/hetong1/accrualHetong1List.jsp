<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<t:base type="jquery,easyui,tools,DatePicker"></t:base>
<div class="easyui-layout" fit="true">
  <div region="center" style="padding:0px;border:0px">
  <t:datagrid name="accrualHetong1List" checkbox="true" pagination="true" fitColumns="true" title="集团合同" actionUrl="accrualHetong1Controller.do?datagrid" idField="id" fit="true" queryMode="group">
   <t:dgCol title="主键"  field="id"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="合同状态"  field="contractstatus"  queryMode="single"  dictionary="accrual_htzt,id,text"  width="120"></t:dgCol>
   <t:dgCol title="合同编号"  field="contractid"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="贷款单位"  field="loanunit"  query="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="区域公司"  field="companyarea"  query="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="承包商"  field="contractor"  query="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="贷款方式"  field="loanmethod"  queryMode="single"  dictionary="accrual_dkfs,id,text"  width="120"></t:dgCol>
   <t:dgCol title="合同性质"  field="contractnature"  queryMode="single"  dictionary="accrual_htxz,id,text"  width="120"></t:dgCol>
   <t:dgCol title="借款单位"  field="borrower"  query="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="项目部"  field="projectdept"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="操作" field="opt" width="100"></t:dgCol>
   <t:dgDelOpt title="删除" url="accrualHetong1Controller.do?doDel&id={id}" urlclass="ace_button"  urlfont="fa-trash-o"/>
   <t:dgToolBar title="录入" icon="icon-add" url="accrualHetong1Controller.do?goAdd" funname="add"></t:dgToolBar>
   <t:dgToolBar title="编辑" icon="icon-edit" url="accrualHetong1Controller.do?goUpdate" funname="update"></t:dgToolBar>
   <t:dgToolBar title="批量删除"  icon="icon-remove" url="accrualHetong1Controller.do?doBatchDel" funname="deleteALLSelect"></t:dgToolBar>
   <t:dgToolBar title="查看" icon="icon-search" url="accrualHetong1Controller.do?goUpdate" funname="detail"></t:dgToolBar>
   <t:dgToolBar title="导入" icon="icon-put" funname="ImportXls"></t:dgToolBar>
   <t:dgToolBar title="导出" icon="icon-putout" funname="ExportXls"></t:dgToolBar>
   <t:dgToolBar title="模板下载" icon="icon-putout" funname="ExportXlsByT"></t:dgToolBar>
  </t:datagrid>
  </div>
 </div>
 <script src = "webpage/com/jeecg/hetong1/accrualHetong1List.js"></script>		
 <script type="text/javascript">
 $(document).ready(function(){
 });
 
   
 
//导入
function ImportXls() {
	openuploadwin('Excel导入', 'accrualHetong1Controller.do?upload', "accrualHetong1List");
}

//导出
function ExportXls() {
	JeecgExcelExport("accrualHetong1Controller.do?exportXls","accrualHetong1List");
}

//模板下载
function ExportXlsByT() {
	JeecgExcelExport("accrualHetong1Controller.do?exportXlsByT","accrualHetong1List");
}

 </script>