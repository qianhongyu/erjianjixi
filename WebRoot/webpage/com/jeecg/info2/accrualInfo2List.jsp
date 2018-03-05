<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<t:base type="jquery,easyui,tools,DatePicker"></t:base>
<div class="easyui-layout" fit="true">
  <div region="center" style="padding:0px;border:0px">
  <t:datagrid name="accrualInfo2List" checkbox="true" pagination="true" fitColumns="true" title="子公司借贷" actionUrl="accrualInfo2Controller.do?datagrid" idField="id" fit="true" queryMode="group">
   <t:dgCol title="主键"  field="id"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="录入人编号"  field="inputpeopleid"  query="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="借贷金额"  field="loanamount"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="实际利率"  field="rate"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="还款金额"  field="repayment"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="复利方式"  field="compoundmode"  queryMode="single"  dictionary="accrual_info_type,id,type"  width="120"></t:dgCol>
   <t:dgCol title="贷款起始日期"  field="starttime"  formatter="yyyy-MM-dd"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="贷款截止日期"  field="endtime"  formatter="yyyy-MM-dd"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="结息日间隔"  field="period"  queryMode="single"  dictionary="accrual_info_jg,id,text"  width="120"></t:dgCol>
   <t:dgCol title="结息日"  field="interesttime"  formatter="yyyy-MM-dd"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="还款方式"  field="repaymentmode"  queryMode="single"  dictionary="accrual_info_type1,id,type1"  width="120"></t:dgCol>
   <t:dgCol title="合同到期日期"  field="signingtime"  formatter="yyyy-MM-dd"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="审核人"  field="examinepeople"  query="true"  queryMode="single"  dictionary="accrual_info_sh,id,text"  width="120"></t:dgCol>
   <t:dgCol title="操作" field="opt" width="100"></t:dgCol>
   <t:dgDelOpt title="删除" url="accrualInfo2Controller.do?doDel&id={id}" urlclass="ace_button"  urlfont="fa-trash-o"/>
   <t:dgToolBar title="录入" icon="icon-add" url="accrualInfo2Controller.do?goAdd" funname="add"></t:dgToolBar>
   <t:dgToolBar title="编辑" icon="icon-edit" url="accrualInfo2Controller.do?goUpdate" funname="update"></t:dgToolBar>
   <t:dgToolBar title="批量删除"  icon="icon-remove" url="accrualInfo2Controller.do?doBatchDel" funname="deleteALLSelect"></t:dgToolBar>
   <t:dgToolBar title="查看" icon="icon-search" url="accrualInfo2Controller.do?goUpdate" funname="detail"></t:dgToolBar>
   <t:dgToolBar title="导入" icon="icon-put" funname="ImportXls"></t:dgToolBar>
   <t:dgToolBar title="导出" icon="icon-putout" funname="ExportXls"></t:dgToolBar>
   <t:dgToolBar title="模板下载" icon="icon-putout" funname="ExportXlsByT"></t:dgToolBar>
  </t:datagrid>
  </div>
 </div>
 <script src = "webpage/com/jeecg/info2/accrualInfo2List.js"></script>		
 <script type="text/javascript">
 $(document).ready(function(){
 });
 
   
 
//导入
function ImportXls() {
	openuploadwin('Excel导入', 'accrualInfo2Controller.do?upload', "accrualInfo2List");
}

//导出
function ExportXls() {
	JeecgExcelExport("accrualInfo2Controller.do?exportXls","accrualInfo2List");
}

//模板下载
function ExportXlsByT() {
	JeecgExcelExport("accrualInfo2Controller.do?exportXlsByT","accrualInfo2List");
}

 </script>