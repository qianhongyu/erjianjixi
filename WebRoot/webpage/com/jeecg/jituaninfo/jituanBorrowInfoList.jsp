<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<t:base type="jquery,easyui,tools,DatePicker"></t:base>
<div class="easyui-layout" fit="true">
  <div region="center" style="padding:0px;border:0px">
  <t:datagrid name="jituanBorrowInfoList" checkbox="true" pagination="true" fitColumns="true" title="集团借入" actionUrl="jituanBorrowInfoController.do?datagrid" idField="id" fit="true" queryMode="group">
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
   <t:dgDelOpt title="删除" url="jituanBorrowInfoController.do?doDel&id={id}" urlclass="ace_button"  urlfont="fa-trash-o"/>
   <t:dgToolBar title="录入" icon="icon-add" url="jituanBorrowInfoController.do?goAdd" funname="add"></t:dgToolBar>
   <t:dgToolBar title="编辑" icon="icon-edit" url="jituanBorrowInfoController.do?goUpdate" funname="update"></t:dgToolBar>
   <t:dgToolBar title="批量删除"  icon="icon-remove" url="jituanBorrowInfoController.do?doBatchDel" funname="deleteALLSelect"></t:dgToolBar>
   <t:dgToolBar title="查看" icon="icon-search" url="jituanBorrowInfoController.do?goUpdate" funname="detail"></t:dgToolBar>
   <t:dgToolBar title="导入" icon="icon-put" funname="ImportXls"></t:dgToolBar>
   <t:dgToolBar title="导出" icon="icon-putout" funname="ExportXls"></t:dgToolBar>
   <t:dgToolBar title="模板下载" icon="icon-putout" funname="ExportXlsByT"></t:dgToolBar>
  </t:datagrid>
  </div>
 </div>
 <script src = "webpage/com/jeecg/jituaninfo/jituanBorrowInfoList.js"></script>		
 <script type="text/javascript">
 $(document).ready(function(){
 });
 
   
 
//导入
function ImportXls() {
	openuploadwin('Excel导入', 'jituanBorrowInfoController.do?upload', "jituanBorrowInfoList");
}

//导出
function ExportXls() {
	JeecgExcelExport("jituanBorrowInfoController.do?exportXls","jituanBorrowInfoList");
}

//模板下载
function ExportXlsByT() {
	JeecgExcelExport("jituanBorrowInfoController.do?exportXlsByT","jituanBorrowInfoList");
}

 </script>