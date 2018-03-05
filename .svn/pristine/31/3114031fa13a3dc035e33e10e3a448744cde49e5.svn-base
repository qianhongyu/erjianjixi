<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<t:base type="jquery,easyui,tools,DatePicker"></t:base>
<div class="easyui-layout" fit="true">
  <div region="center" style="padding:0px;border:0px">
  <t:datagrid name="accrualHetongList" checkbox="true" pagination="true" fitColumns="true" title="合同信息表" actionUrl="accrualHetongController.do?datagrid" idField="id" fit="true" queryMode="group">
   <t:dgCol title="主键"  field="id"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="合同编号"  field="contractid"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="借款单位"  field="borrower"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="贷款单位"  field="loanunit"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="区域公司"  field="companyarea"  query="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="承包商"  field="contractor"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="项目部"  field="projectdept"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="贷款方式"  field="loanmethod"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="合同性质"  field="contractnature"  query="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="合同状态"  field="contractstatus"  query="true"  queryMode="single"  dictionary="bpm_status"  width="120"></t:dgCol>
   <t:dgCol title="操作" field="opt" width="100"></t:dgCol>
   <t:dgDelOpt title="删除" url="accrualHetongController.do?doDel&id={id}" urlclass="ace_button"  urlfont="fa-trash-o"/>
   <t:dgToolBar title="录入" icon="icon-add" url="accrualHetongController.do?goAdd" funname="add"></t:dgToolBar>
   <t:dgToolBar title="编辑" icon="icon-edit" url="accrualHetongController.do?goUpdate" funname="update"></t:dgToolBar>
   <t:dgToolBar title="批量删除"  icon="icon-remove" url="accrualHetongController.do?doBatchDel" funname="deleteALLSelect"></t:dgToolBar>
   <t:dgToolBar title="查看" icon="icon-search" url="accrualHetongController.do?goUpdate" funname="detail"></t:dgToolBar>
   <t:dgToolBar title="导入" icon="icon-put" funname="ImportXls"></t:dgToolBar>
   <t:dgToolBar title="导出" icon="icon-putout" funname="ExportXls"></t:dgToolBar>
   <t:dgToolBar title="模板下载" icon="icon-putout" funname="ExportXlsByT"></t:dgToolBar>
  </t:datagrid>
  </div>
 </div>
 <script src = "webpage/com/jeecg/hetong/accrualHetongList.js"></script>		
 <script type="text/javascript">
 $(document).ready(function(){
 });
 
   
 
//导入
function ImportXls() {
	openuploadwin('Excel导入', 'accrualHetongController.do?upload', "accrualHetongList");
}

//导出
function ExportXls() {
	JeecgExcelExport("accrualHetongController.do?exportXls","accrualHetongList");
}

//模板下载
function ExportXlsByT() {
	JeecgExcelExport("accrualHetongController.do?exportXlsByT","accrualHetongList");
}

 </script>