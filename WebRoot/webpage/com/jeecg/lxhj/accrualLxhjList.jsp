<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<t:base type="jquery,easyui,tools,DatePicker"></t:base>
<div class="easyui-layout" fit="true">
  <div region="center" style="padding:0px;border:0px">
  <t:datagrid name="accrualLxhjList" checkbox="true" pagination="true" fitColumns="true" title="借贷资金合计" actionUrl="accrualLxhjController.do?datagrid" idField="id" fit="true" queryMode="group">
   <t:dgCol title="主键"  field="id"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="已收总基础利息"  field="basicinterest"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="已收总超额利息"  field="excessinterest"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="已收利息合计"  field="interestpayable"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="已收本金合计"  field="benjin"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="利本合计"  field="liben"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="操作" field="opt" width="100"></t:dgCol>
   <t:dgDelOpt title="删除" url="accrualLxhjController.do?doDel&id={id}" urlclass="ace_button"  urlfont="fa-trash-o"/>
   <t:dgToolBar title="录入" icon="icon-add" url="accrualLxhjController.do?goAdd" funname="add"></t:dgToolBar>
   <t:dgToolBar title="编辑" icon="icon-edit" url="accrualLxhjController.do?goUpdate" funname="update"></t:dgToolBar>
   <t:dgToolBar title="批量删除"  icon="icon-remove" url="accrualLxhjController.do?doBatchDel" funname="deleteALLSelect"></t:dgToolBar>
   <t:dgToolBar title="查看" icon="icon-search" url="accrualLxhjController.do?goUpdate" funname="detail"></t:dgToolBar>
   <t:dgToolBar title="导入" icon="icon-put" funname="ImportXls"></t:dgToolBar>
   <t:dgToolBar title="导出" icon="icon-putout" funname="ExportXls"></t:dgToolBar>
   <t:dgToolBar title="模板下载" icon="icon-putout" funname="ExportXlsByT"></t:dgToolBar>
  </t:datagrid>
  </div>
 </div>
 <script src = "webpage/com/jeecg/lxhj/accrualLxhjList.js"></script>		
 <script type="text/javascript">
 $(document).ready(function(){
 });
 
   
 
//导入
function ImportXls() {
	openuploadwin('Excel导入', 'accrualLxhjController.do?upload', "accrualLxhjList");
}

//导出
function ExportXls() {
	JeecgExcelExport("accrualLxhjController.do?exportXls","accrualLxhjList");
}

//模板下载
function ExportXlsByT() {
	JeecgExcelExport("accrualLxhjController.do?exportXlsByT","accrualLxhjList");
}

 </script>