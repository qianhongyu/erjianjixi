<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<t:base type="jquery,easyui,tools,DatePicker"></t:base>
<div class="easyui-layout" fit="true">
  <div region="center" style="padding:0px;border:0px">
  <t:datagrid name="accrualGuaranteeList" checkbox="true" pagination="true" fitColumns="true" title="担保表" actionUrl="accrualGuaranteeController.do?datagrid" idField="id" fit="true" queryMode="group">
   <t:dgCol title="主键"  field="id"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="担保合同编号"  field="gnumber"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="担保单位"  field="guarantyunit"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="比率"  field="ratio"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="保证金额"  field="guaranteedamount"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="操作" field="opt" width="100"></t:dgCol>
   <t:dgDelOpt title="删除" url="accrualGuaranteeController.do?doDel&id={id}" urlclass="ace_button"  urlfont="fa-trash-o"/>
   <t:dgToolBar title="录入" icon="icon-add" url="accrualGuaranteeController.do?goAdd" funname="add"></t:dgToolBar>
   <t:dgToolBar title="编辑" icon="icon-edit" url="accrualGuaranteeController.do?goUpdate" funname="update"></t:dgToolBar>
   <t:dgToolBar title="批量删除"  icon="icon-remove" url="accrualGuaranteeController.do?doBatchDel" funname="deleteALLSelect"></t:dgToolBar>
   <t:dgToolBar title="查看" icon="icon-search" url="accrualGuaranteeController.do?goUpdate" funname="detail"></t:dgToolBar>
   <t:dgToolBar title="导入" icon="icon-put" funname="ImportXls"></t:dgToolBar>
   <t:dgToolBar title="导出" icon="icon-putout" funname="ExportXls"></t:dgToolBar>
   <t:dgToolBar title="模板下载" icon="icon-putout" funname="ExportXlsByT"></t:dgToolBar>
  </t:datagrid>
  </div>
 </div>
 <script src = "webpage/com/jeecg/guarantee/accrualGuaranteeList.js"></script>		
 <script type="text/javascript">
 $(document).ready(function(){
 });
 
   
 
//导入
function ImportXls() {
	openuploadwin('Excel导入', 'accrualGuaranteeController.do?upload', "accrualGuaranteeList");
}

//导出
function ExportXls() {
	JeecgExcelExport("accrualGuaranteeController.do?exportXls","accrualGuaranteeList");
}

//模板下载
function ExportXlsByT() {
	JeecgExcelExport("accrualGuaranteeController.do?exportXlsByT","accrualGuaranteeList");
}

 </script>