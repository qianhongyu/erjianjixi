<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<t:base type="jquery,easyui,tools,DatePicker"></t:base>
<div class="easyui-layout" fit="true">
  <div region="center" style="padding:0px;border:0px">
  <t:datagrid name="financinginfolistList" checkbox="true" pagination="true" fitColumns="true" title="融资信息列表" actionUrl="financinginfolistController.do?datagrid6" idField="id" fit="true" queryMode="group">
   <t:dgCol title="主键"  field="id"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="合同编号"  field="contractnumber"  query="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="借款主体"  field="loansubject"  query="true"  queryMode="single"  dictionary="accrual_jkzt,id,text"  width="120"></t:dgCol>
   <t:dgCol title="主体名称"  field="subjectname"  query="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="金融机构"  field="financialinstitution"  query="true"  queryMode="single"  dictionary="accrual_jrjg,id,text"  width="120"></t:dgCol>
   <t:dgCol title="借款类别"  field="loancategory"  hidden="true"  queryMode="single"  dictionary="accrual_dyhrz,id,text"  width="120"></t:dgCol>
   <t:dgCol title="金额"  field="money"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="年利率"  field="annualrate"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="银行利息外费用"  field="extraexpenses"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="担保方式"  field="guaranteemethod"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="担保金额"  field="guaranteemoney"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="起息日"  field="startinterestday"  formatter="yyyy-MM-dd"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="到息日"  field="endinterestday"  formatter="yyyy-MM-dd"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="月度利息"  field="monthlyinterest"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="计息方式"  field="wayofinterestaccrual"  queryMode="single"  dictionary="accrual_interest_type,id,text"  width="120"></t:dgCol>
   <t:dgCol title="结息日"  field="interestday"  queryMode="single"  dictionary="accrual_day,id,day_id"  width="120"></t:dgCol>
   <t:dgCol title="备注"  field="remarks"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="操作" field="opt" width="100"></t:dgCol>
   <t:dgDelOpt title="删除" url="financinginfolistController.do?doDel&id={id}" urlclass="ace_button"  urlfont="fa-trash-o"/>
   <t:dgToolBar title="录入" icon="icon-add" url="financinginfolistController.do?goAdd&id=6" funname="add"></t:dgToolBar>
   <t:dgToolBar title="编辑" icon="icon-edit" url="financinginfolistController.do?goUpdate&id=6" funname="update"></t:dgToolBar>
   <t:dgToolBar title="批量删除"  icon="icon-remove" url="financinginfolistController.do?doBatchDel" funname="deleteALLSelect"></t:dgToolBar>
   <t:dgToolBar title="查看" icon="icon-search" url="financinginfolistController.do?goUpdate&id=6" funname="detail"></t:dgToolBar>
   <t:dgToolBar title="导入" icon="icon-put" funname="ImportXls"></t:dgToolBar>
   <t:dgToolBar title="导出" icon="icon-putout" funname="ExportXls"></t:dgToolBar>
   <t:dgToolBar title="模板下载" icon="icon-putout" funname="ExportXlsByT"></t:dgToolBar>
  </t:datagrid>
  </div>
 </div>
 <script src = "webpage/com/jeecg/financinginfo/financinginfolistList.js"></script>		
 <script type="text/javascript">
 $(document).ready(function(){
 });
 
   
 
//导入
function ImportXls() {
	openuploadwin('Excel导入', 'financinginfolistController.do?upload', "financinginfolistList2");
}

//导出
function ExportXls() {
	JeecgExcelExport("financinginfolistController.do?exportXls","financinginfolistList2");
}

//模板下载
function ExportXlsByT() {
	JeecgExcelExport("financinginfolistController.do?exportXlsByT","financinginfolistList2");
}

 </script>