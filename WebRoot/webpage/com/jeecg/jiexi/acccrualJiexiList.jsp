<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<t:base type="jquery,easyui,tools,DatePicker"></t:base>
<div class="easyui-layout" fit="true">
  <div region="center" style="padding:0px;border:0px">
  <t:datagrid name="acccrualJiexiList" checkbox="true" pagination="true" fitColumns="true" title="结息方式" actionUrl="acccrualJiexiController.do?datagrid" idField="id" fit="true" queryMode="group">
   <t:dgCol title="主键"  field="id"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="结息方式"  field="interesttype"  queryMode="single"  dictionary="accrual_interest_type,id,text"  width="120"></t:dgCol>
   <t:dgCol title="结息周期"  field="interestcycle"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="周期单位"  field="periodicunit"  queryMode="single"  dictionary="accrual_interest_unit,id,text"  width="120"></t:dgCol>
   <t:dgCol title="期末余额结息日"  field="lastday"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="操作" field="opt" width="100"></t:dgCol>
   <t:dgDelOpt title="删除" url="acccrualJiexiController.do?doDel&id={id}" urlclass="ace_button"  urlfont="fa-trash-o"/>
   <t:dgToolBar title="录入" icon="icon-add" url="acccrualJiexiController.do?goAdd" funname="add"></t:dgToolBar>
   <t:dgToolBar title="编辑" icon="icon-edit" url="acccrualJiexiController.do?goUpdate" funname="update"></t:dgToolBar>
   <t:dgToolBar title="批量删除"  icon="icon-remove" url="acccrualJiexiController.do?doBatchDel" funname="deleteALLSelect"></t:dgToolBar>
   <t:dgToolBar title="查看" icon="icon-search" url="acccrualJiexiController.do?goUpdate" funname="detail"></t:dgToolBar>
   <t:dgToolBar title="导入" icon="icon-put" funname="ImportXls"></t:dgToolBar>
   <t:dgToolBar title="导出" icon="icon-putout" funname="ExportXls"></t:dgToolBar>
   <t:dgToolBar title="模板下载" icon="icon-putout" funname="ExportXlsByT"></t:dgToolBar>
  </t:datagrid>
  </div>
 </div>
 <script src = "webpage/com/jeecg/jiexi/acccrualJiexiList.js"></script>		
 <script type="text/javascript">
 $(document).ready(function(){
 });
 
   
 
//导入
function ImportXls() {
	openuploadwin('Excel导入', 'acccrualJiexiController.do?upload', "acccrualJiexiList");
}

//导出
function ExportXls() {
	JeecgExcelExport("acccrualJiexiController.do?exportXls","acccrualJiexiList");
}

//模板下载
function ExportXlsByT() {
	JeecgExcelExport("acccrualJiexiController.do?exportXlsByT","acccrualJiexiList");
}

 </script>