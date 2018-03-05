<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<t:base type="jquery,easyui,tools,DatePicker"></t:base>
<div class="easyui-layout" fit="true">
  <div region="center" style="padding:0px;border:0px">
  <t:datagrid name="accrualInfoList" checkbox="true" pagination="true" fitColumns="true" title="银行借贷" actionUrl="accrualInfoController.do?datagrid" idField="id" fit="true" queryMode="group">
   <t:dgCol title="主键"  field="id"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="对应的合同id"  field="hetongId"  queryMode="single"  dictionary="accrual_all_contract,id,contract_name"  width="120"></t:dgCol>
   <t:dgCol title="借款金额"  field="loanamount"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="基础利率"  field="basicrate"  queryMode="single"  dictionary="accrual_basic_rate,id,basic_rate"  width="120"></t:dgCol>
   <t:dgCol title="超额利率"  field="excessinterestrate"  queryMode="single"  dictionary="accrual_excessinterest_rate,id,excessinterest_rate"  width="120"></t:dgCol>
   <t:dgCol title="开始时间"  field="starttime"  formatter="yyyy-MM-dd"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="结束时间"  field="endtime"  formatter="yyyy-MM-dd"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="结息日"  field="period"  queryMode="single"  dictionary="accrual_day,id,day_id"  width="120"></t:dgCol>
   <t:dgCol title="还款日"  field="repaymentdate"  queryMode="single"  dictionary="accrual_day,id,day_id"  width="120"></t:dgCol>
   <t:dgCol title="还款方式"  field="repaymentmode"  queryMode="single"  dictionary="accrual_info_type1,id,type1"  width="120"></t:dgCol>
   <t:dgCol title="结息周期"  field="interestcycle"  queryMode="single"  dictionary="accrual_info_jg,id,text"  width="120"></t:dgCol>
   <t:dgCol title="借款单位"  field="borrower"  queryMode="single"  dictionary="accrual_borrower,id,borrower_name"  width="120"></t:dgCol>
   <t:dgCol title="担保单位"  field="guarantor"  queryMode="single"  dictionary="accrual_guarantor,id,guarantor_name"  width="120"></t:dgCol>
   <t:dgCol title="放款单位"  field="lender"  queryMode="single"  dictionary="accrual_lender,id,lender_name"  width="120"></t:dgCol>
   <t:dgCol title="录入人"  field="inputperson"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="录入时间"  field="inputtime"  formatter="yyyy-MM-dd hh:mm:ss"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="最后一次的修改人"  field="changeperson"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="最后一次的修改时间"  field="changetime"  formatter="yyyy-MM-dd hh:mm:ss"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="操作" field="opt" width="100"></t:dgCol>
   <t:dgDelOpt title="删除" url="accrualInfoController.do?doDel&id={id}" urlclass="ace_button"  urlfont="fa-trash-o"/>
   <t:dgToolBar title="录入" icon="icon-add" url="accrualInfoController.do?goAdd" funname="add"></t:dgToolBar>
   <t:dgToolBar title="编辑" icon="icon-edit" url="accrualInfoController.do?goUpdate" funname="update"></t:dgToolBar>
   <t:dgToolBar title="批量删除"  icon="icon-remove" url="accrualInfoController.do?doBatchDel" funname="deleteALLSelect"></t:dgToolBar>
   <t:dgToolBar title="查看" icon="icon-search" url="accrualInfoController.do?goUpdate" funname="detail"></t:dgToolBar>
   <t:dgToolBar title="导入" icon="icon-put" funname="ImportXls"></t:dgToolBar>
   <t:dgToolBar title="导出" icon="icon-putout" funname="ExportXls"></t:dgToolBar>
   <t:dgToolBar title="模板下载" icon="icon-putout" funname="ExportXlsByT"></t:dgToolBar>
  </t:datagrid>
  </div>
 </div>
 <script src = "webpage/com/jeecg/info/accrualInfoList.js"></script>		
 <script type="text/javascript">
 $(document).ready(function(){
 });
 
   
 
//导入
function ImportXls() {
	openuploadwin('Excel导入', 'accrualInfoController.do?upload', "accrualInfoList");
}

//导出
function ExportXls() {
	JeecgExcelExport("accrualInfoController.do?exportXls","accrualInfoList");
}

//模板下载
function ExportXlsByT() {
	JeecgExcelExport("accrualInfoController.do?exportXlsByT","accrualInfoList");
}

 </script>