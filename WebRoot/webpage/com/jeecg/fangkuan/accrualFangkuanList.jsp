<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<t:base type="jquery,easyui,tools,DatePicker"></t:base>
<div class="easyui-layout" fit="true">
  <div region="center" style="padding:0px;border:0px">
  <t:datagrid name="accrualFangkuanList" checkbox="true" pagination="true" fitColumns="true" title="合同放款" actionUrl="accrualFangkuanController.do?datagrid" idField="id" fit="true" queryMode="group">
   <t:dgCol title="主键"  field="id"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="单据编号"  field="danjuId"  query="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="合同编号"  field="hetongId"  query="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="贷款单位"  field="daikuanunit"  hidden="true"  queryMode="single"  dictionary="accrual_newbank_contractlist,id,loan_unit"  width="120"></t:dgCol>
   <t:dgCol title="合同类型"  field="contracttype"  hidden="true"  queryMode="single"  dictionary="accrual_contract_nature,id,text"  width="120"></t:dgCol>
   <t:dgCol title="借款单位"  field="jiekuanunit"  hidden="true"  queryMode="single"  dictionary="accrual_newbank_contractlist,id,borrower"  width="120"></t:dgCol>
   <t:dgCol title="合同金额"  field="contractjine"  hidden="true"  queryMode="single"  dictionary="accrual_newbank_contractlist,id,loan_amount"  width="120"></t:dgCol>
   <t:dgCol title="区域公司"  field="quyucompany"  hidden="true"  queryMode="single"  dictionary="accrual_newbank_contractlist,id,regional_company"  width="120"></t:dgCol>
   <t:dgCol title="结息日"  field="jiexiday"  hidden="true"  queryMode="single"  dictionary="accrual_newbank_contractlist,id,interest_day"  width="120"></t:dgCol>
   <t:dgCol title="承包商"  field="cbscompany"  hidden="true"  queryMode="single"  dictionary="accrual_newbank_contractlist,id,contractor"  width="120"></t:dgCol>
   <t:dgCol title="合同起始日期"  field="contractqsrq"  hidden="true"  queryMode="single"  dictionary="accrual_newbank_contractlist,id,start_date"  width="120"></t:dgCol>
   <t:dgCol title="项目部"  field="xmbcompany"  hidden="true"  queryMode="single"  dictionary="accrual_newbank_contractlist,id,project_department"  width="120"></t:dgCol>
   <t:dgCol title="合同终止日期"  field="contractzzrq"  hidden="true"  queryMode="single"  dictionary="accrual_newbank_contractlist,id,end_date"  width="120"></t:dgCol>
   <t:dgCol title="基础利率"  field="baserate"  hidden="true"  queryMode="single"  dictionary="accrual_rate,id,yearrate"  width="120"></t:dgCol>
   <t:dgCol title="超额利率"  field="overrate"  hidden="true"  queryMode="single"  dictionary="accrual_rate,id,yearrate"  width="120"></t:dgCol>
   <t:dgCol title="放款金额"  field="fangkuanjine"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="单据状态"  field="danjuzt"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="备注"  field="note"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="制单人"  field="zhidanren"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="制单日期"  field="zhidandate"  formatter="yyyy-MM-dd"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="审核人"  field="shenheren"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="审核日期"  field="shenhedate"  formatter="yyyy-MM-dd"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="操作" field="opt" width="100"></t:dgCol>
   <t:dgDelOpt title="删除" url="accrualFangkuanController.do?doDel&id={id}" urlclass="ace_button"  urlfont="fa-trash-o"/>
   <t:dgToolBar title="录入" icon="icon-add" url="accrualFangkuanController.do?goAdd" funname="add"></t:dgToolBar>
   <t:dgToolBar title="编辑" icon="icon-edit" url="accrualFangkuanController.do?goUpdate" funname="update"></t:dgToolBar>
   <t:dgToolBar title="批量删除"  icon="icon-remove" url="accrualFangkuanController.do?doBatchDel" funname="deleteALLSelect"></t:dgToolBar>
   <t:dgToolBar title="查看" icon="icon-search" url="accrualFangkuanController.do?goUpdate" funname="detail"></t:dgToolBar>
   <t:dgToolBar title="导入" icon="icon-put" funname="ImportXls"></t:dgToolBar>
   <t:dgToolBar title="导出" icon="icon-putout" funname="ExportXls"></t:dgToolBar>
   <t:dgToolBar title="模板下载" icon="icon-putout" funname="ExportXlsByT"></t:dgToolBar>
  </t:datagrid>
  </div>
 </div>
 <script src = "webpage/com/jeecg/fangkuan/accrualFangkuanList.js"></script>		
 <script type="text/javascript">
 $(document).ready(function(){
 });
 
   
 
//导入
function ImportXls() {
	openuploadwin('Excel导入', 'accrualFangkuanController.do?upload', "accrualFangkuanList");
}

//导出
function ExportXls() {
	JeecgExcelExport("accrualFangkuanController.do?exportXls","accrualFangkuanList");
}

//模板下载
function ExportXlsByT() {
	JeecgExcelExport("accrualFangkuanController.do?exportXlsByT","accrualFangkuanList");
}

 </script>