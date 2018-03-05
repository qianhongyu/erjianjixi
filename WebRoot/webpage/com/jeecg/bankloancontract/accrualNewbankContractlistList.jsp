<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<t:base type="jquery,easyui,tools,DatePicker"></t:base>
<div class="easyui-layout" fit="true">
  <div region="center" style="padding:0px;border:0px">
  <t:datagrid name="accrualNewbankContractlistList" checkbox="true" pagination="true" fitColumns="true" title="银行借款合同" actionUrl="accrualNewbankContractlistController.do?datagrid" idField="id" fit="true" queryMode="group">
   <t:dgCol title="主键"  field="id"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="合同编号"  field="contractId"  query="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="贷款方式"  field="loanMethod"  queryMode="single"  dictionary="accrual_dkfs,id,text"  width="120"></t:dgCol>
   <t:dgCol title="贷款单位"  field="loanUnit"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="借款单位"  field="borrower"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="合同性质"  field="contractNature"  queryMode="single"  dictionary="accrual_contract_nature,id,text"  width="120"></t:dgCol>
   <t:dgCol title="合同状态"  field="contractStatus"  queryMode="single"  dictionary="accrual_contract_type,id,text"  width="120"></t:dgCol>
   <t:dgCol title="区域公司"  field="regionalCompany"  queryMode="single"  dictionary="accrual_quyucompany,id,areaname"  width="120"></t:dgCol>
   <t:dgCol title="承包商"  field="contractor"  queryMode="single"  dictionary="accrual_cbs,id,cbsname"  width="120"></t:dgCol>
   <t:dgCol title="项目部"  field="projectDepartment"  queryMode="single"  dictionary="accrual_xmb,id,xmbname"  width="120"></t:dgCol>
   <t:dgCol title="备注"  field="remarks"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="基础利率"  field="baseRate"  hidden="true"  queryMode="single"  dictionary="accrual_rate,id,yearrate"  width="120"></t:dgCol>
   <t:dgCol title="超额利率"  field="excessRate"  hidden="true"  queryMode="single"  dictionary="accrual_rate,id,yearrate"  width="120"></t:dgCol>
   <t:dgCol title="复利方式"  field="compoundInterest"  hidden="true"  queryMode="single"  dictionary="accrual_compound_interest,id,text"  width="120"></t:dgCol>
   <t:dgCol title="结息日"  field="interestDay"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="合同签订日期"  field="contractAwardDate"  formatter="yyyy-MM-dd"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="借贷金额"  field="loanAmount"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="期间"  field="period"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="期间单位"  field="periodUnit"  hidden="true"  queryMode="single"  dictionary="ACCRUAL_INTEREST_UNIT,id,text"  width="120"></t:dgCol>
   <t:dgCol title="起始日期"  field="startDate"  formatter="yyyy-MM-dd"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="结束日期"  field="endDate"  formatter="yyyy-MM-dd"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="录入人"  field="inputPerson"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="审核人"  field="auditor"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="操作" field="opt" width="100"></t:dgCol>
   <t:dgDelOpt title="删除" url="accrualNewbankContractlistController.do?doDel&id={id}" urlclass="ace_button"  urlfont="fa-trash-o"/>
   <t:dgToolBar title="录入" icon="icon-add" url="accrualNewbankContractlistController.do?goAdd" funname="add"></t:dgToolBar>
   <t:dgToolBar title="编辑" icon="icon-edit" url="accrualNewbankContractlistController.do?goUpdate" funname="update"></t:dgToolBar>
   <t:dgToolBar title="批量删除"  icon="icon-remove" url="accrualNewbankContractlistController.do?doBatchDel" funname="deleteALLSelect"></t:dgToolBar>
   <t:dgToolBar title="查看" icon="icon-search" url="accrualNewbankContractlistController.do?goSearch" funname="detail"></t:dgToolBar>
   <t:dgToolBar title="导入" icon="icon-put" funname="ImportXls"></t:dgToolBar>
   <t:dgToolBar title="导出" icon="icon-putout" funname="ExportXls"></t:dgToolBar>
   <t:dgToolBar title="模板下载" icon="icon-putout" funname="ExportXlsByT"></t:dgToolBar>
  </t:datagrid>
  </div>
 </div>
 <script src = "webpage/com/jeecg/bankloancontract/accrualNewbankContractlistList.js"></script>		
 <script type="text/javascript">
 $(document).ready(function(){
 });
 
   
 
//导入
function ImportXls() {
	openuploadwin('Excel导入', 'accrualNewbankContractlistController.do?upload', "accrualNewbankContractlistList");
}

//导出
function ExportXls() {
	JeecgExcelExport("accrualNewbankContractlistController.do?exportXls","accrualNewbankContractlistList");
}

//模板下载
function ExportXlsByT() {
	JeecgExcelExport("accrualNewbankContractlistController.do?exportXlsByT","accrualNewbankContractlistList");
}

 </script>