<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<t:base type="jquery,easyui,tools,DatePicker"></t:base>
<div class="easyui-layout" fit="true">
  <div region="center" style="padding:0px;border:0px">
  <t:datagrid name="bankBorrowInfoInList" checkbox="true" pagination="true" fitColumns="true" title="银行对内借款信息" actionUrl="bankBorrowInfoInController.do?datagrid" idField="id" fit="true" queryMode="group">
   <t:dgCol title="主键"  field="id"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="对应的合同编号"  field="contractId"  query="true"  queryMode="single"  dictionary="accrual_all_contract,contract_id,contract_name"  width="120"></t:dgCol>
   <t:dgCol title="借款金额"  field="loanamount"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="基础利率"  field="baseRate"  queryMode="single"  dictionary="accrual_base_rate,id,base_rate"  width="120"></t:dgCol>
   <t:dgCol title="超额利率"  field="excessinterestRate"  queryMode="single"  dictionary="accrual_excessinterest_rate,id,excessinterest_rate"  width="120"></t:dgCol>
   <t:dgCol title="开始时间"  field="startTime"  formatter="yyyy-MM-dd"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="结束时间"  field="endTime"  formatter="yyyy-MM-dd"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="结息日"  field="period"  queryMode="single"  dictionary="accrual_day,id,day_id"  width="120"></t:dgCol>
   <t:dgCol title="还款日"  field="repaymentDate"  queryMode="single"  dictionary="accrual_day,id,day_id"  width="120"></t:dgCol>
   <t:dgCol title="还款方式"  field="repaymentMode"  queryMode="single"  dictionary="accrual_info_type,id,type"  width="120"></t:dgCol>
   <t:dgCol title="结息周期"  field="interestCycle"  queryMode="single"  dictionary="accrual_info_jg,id,text"  width="120"></t:dgCol>
   <t:dgCol title="借款单位"  field="borrower"  queryMode="single"  dictionary="accrual_borrower,id,borrower_name"  width="120"></t:dgCol>
   <t:dgCol title="担保单位"  field="guarantor"  queryMode="single"  dictionary="accrual_guarantor,id,guarantor_name"  width="120"></t:dgCol>
   <t:dgCol title="放款单位"  field="lender"  queryMode="single"  dictionary="accrual_lender,id,lender_name"  width="120"></t:dgCol>
   <t:dgCol title="录入人"  field="inputPerson"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="录入时间"  field="inputTime"  formatter="yyyy-MM-dd"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="最后一次的修改人"  field="updatePerson"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="最后一次的修改时间"  field="updateTime"  formatter="yyyy-MM-dd"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="操作" field="opt" width="100"></t:dgCol>
   <t:dgDelOpt title="删除" url="bankBorrowInfoInController.do?doDel&id={id}" urlclass="ace_button"  urlfont="fa-trash-o"/>
   <t:dgToolBar title="录入" icon="icon-add" url="bankBorrowInfoInController.do?goAdd" funname="add"></t:dgToolBar>
   <t:dgToolBar title="编辑" icon="icon-edit" url="bankBorrowInfoInController.do?goUpdate" funname="update"></t:dgToolBar>
   <t:dgToolBar title="批量删除"  icon="icon-remove" url="bankBorrowInfoInController.do?doBatchDel" funname="deleteALLSelect"></t:dgToolBar>
   <t:dgToolBar title="查看" icon="icon-search" url="bankBorrowInfoInController.do?goUpdate1" funname="detail"></t:dgToolBar>
   <t:dgToolBar title="导入" icon="icon-put" funname="ImportXls"></t:dgToolBar>
   <t:dgToolBar title="导出" icon="icon-putout" funname="ExportXls"></t:dgToolBar>
   <t:dgToolBar title="模板下载" icon="icon-putout" funname="ExportXlsByT"></t:dgToolBar>
  </t:datagrid>
  </div>
 </div>
 <script src = "webpage/com/jeecg/bankinfo/bankBorrowInfoInList.js"></script>		
 <script type="text/javascript">
 $(document).ready(function(){
 });
 
   
 
//导入
function ImportXls() {
	openuploadwin('Excel导入', 'bankBorrowInfoInController.do?upload', "bankBorrowInfoInList");
}

//导出
function ExportXls() {
	JeecgExcelExport("bankBorrowInfoInController.do?exportXls","bankBorrowInfoInList");
}

//模板下载
function ExportXlsByT() {
	JeecgExcelExport("bankBorrowInfoInController.do?exportXlsByT","bankBorrowInfoInList");
}

 </script>