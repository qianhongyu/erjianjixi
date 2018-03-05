<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<t:base type="jquery,easyui,tools,DatePicker"></t:base>
<div class="easyui-layout" fit="true">
  <div region="center" style="padding:0px;border:0px">
  <t:datagrid name="accrualRateList" checkbox="true" pagination="true" fitColumns="true" title="利息设置" actionUrl="accrualRateController.do?datagrid" idField="id" fit="true" queryMode="group">
   <t:dgCol title="主键"  field="id"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="利率名称"  field="ratename"  query="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="利率类型"  field="ratetype"  queryMode="single"  dictionary="accrual_rate_type,id,text"  width="120"></t:dgCol>
   <t:dgCol title="日利率天数"  field="dayrateshu"  queryMode="single"  dictionary="accrual_rate_day,id,text"  width="120"></t:dgCol>
   <t:dgCol title="年利率(%)"  field="yearrate"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="月利率(‰)"  field="monthrate"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="日利率(‰)"  field="daterate"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="操作" field="opt" width="100"></t:dgCol>
   <t:dgDelOpt title="删除" url="accrualRateController.do?doDel&id={id}" urlclass="ace_button"  urlfont="fa-trash-o"/>
   <t:dgToolBar title="录入" icon="icon-add" url="accrualRateController.do?goAdd" funname="add"></t:dgToolBar>
   <t:dgToolBar title="编辑" icon="icon-edit" url="accrualRateController.do?goUpdate" funname="update"></t:dgToolBar>
   <t:dgToolBar title="批量删除"  icon="icon-remove" url="accrualRateController.do?doBatchDel" funname="deleteALLSelect"></t:dgToolBar>
   <t:dgToolBar title="查看" icon="icon-search" url="accrualRateController.do?goUpdate" funname="detail"></t:dgToolBar>
   <t:dgToolBar title="导入" icon="icon-put" funname="ImportXls"></t:dgToolBar>
   <t:dgToolBar title="导出" icon="icon-putout" funname="ExportXls"></t:dgToolBar>
   <t:dgToolBar title="模板下载" icon="icon-putout" funname="ExportXlsByT"></t:dgToolBar>
  </t:datagrid>
  </div>
 </div>
 <script src = "webpage/com/jeecg/rate/accrualRateList.js"></script>		
 <script type="text/javascript">
 $(document).ready(function(){
 });
 
   
 
//导入
function ImportXls() {
	openuploadwin('Excel导入', 'accrualRateController.do?upload', "accrualRateList");
}

//导出
function ExportXls() {
	JeecgExcelExport("accrualRateController.do?exportXls","accrualRateList");
}

//模板下载
function ExportXlsByT() {
	JeecgExcelExport("accrualRateController.do?exportXlsByT","accrualRateList");
}

 </script>