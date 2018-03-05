<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<t:base type="jquery,easyui,tools,DatePicker"></t:base>
<div class="easyui-layout" fit="true">
  <div region="center" style="padding:0px;border:0px">
  <t:datagrid name="accrualZhiyaList" checkbox="true" pagination="true" fitColumns="true" title="质押信息" actionUrl="accrualZhiyaController.do?datagrid" idField="id" fit="true" queryMode="group">
   <t:dgCol title="主键"  field="id"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="所有权单位"  field="ownershipunit"  query="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="抵押物"  field="mortgages"  query="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="评估价值"  field="evaluationvalue"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="评估单位"  field="evaluationunit"  query="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="可抵押价值"  field="mortgagedvalue"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="累计已抵押价值"  field="toatlmortgagedvalue"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="剩余抵押价值"  field="surplusmortgagedvalue"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="实际使用可抵押值"  field="actualmortgagedvalue"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="操作" field="opt" width="100"></t:dgCol>
   <t:dgDelOpt title="删除" url="accrualZhiyaController.do?doDel&id={id}" urlclass="ace_button"  urlfont="fa-trash-o"/>
   <t:dgToolBar title="录入" icon="icon-add" url="accrualZhiyaController.do?goAdd" funname="add"></t:dgToolBar>
   <t:dgToolBar title="编辑" icon="icon-edit" url="accrualZhiyaController.do?goUpdate" funname="update"></t:dgToolBar>
   <t:dgToolBar title="批量删除"  icon="icon-remove" url="accrualZhiyaController.do?doBatchDel" funname="deleteALLSelect"></t:dgToolBar>
   <t:dgToolBar title="查看" icon="icon-search" url="accrualZhiyaController.do?goUpdate" funname="detail"></t:dgToolBar>
   <t:dgToolBar title="导入" icon="icon-put" funname="ImportXls"></t:dgToolBar>
   <t:dgToolBar title="导出" icon="icon-putout" funname="ExportXls"></t:dgToolBar>
   <t:dgToolBar title="模板下载" icon="icon-putout" funname="ExportXlsByT"></t:dgToolBar>
  </t:datagrid>
  </div>
 </div>
 <script src = "webpage/com/jeecg/zhiya/accrualZhiyaList.js"></script>		
 <script type="text/javascript">
 $(document).ready(function(){
 });
 
   
 
//导入
function ImportXls() {
	openuploadwin('Excel导入', 'accrualZhiyaController.do?upload', "accrualZhiyaList");
}

//导出
function ExportXls() {
	JeecgExcelExport("accrualZhiyaController.do?exportXls","accrualZhiyaList");
}

//模板下载
function ExportXlsByT() {
	JeecgExcelExport("accrualZhiyaController.do?exportXlsByT","accrualZhiyaList");
}

 </script>