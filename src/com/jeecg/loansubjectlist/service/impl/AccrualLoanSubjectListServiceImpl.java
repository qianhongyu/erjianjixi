package com.jeecg.loansubjectlist.service.impl;
import com.jeecg.loansubjectlist.service.AccrualLoanSubjectListServiceI;
import org.jeecgframework.core.common.service.impl.CommonServiceImpl;
import com.jeecg.loansubjectlist.entity.AccrualLoanSubjectListEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.io.Serializable;
import org.jeecgframework.core.util.ApplicationContextUtil;
import org.jeecgframework.core.util.MyClassLoader;
import org.jeecgframework.core.util.StringUtil;
import org.jeecgframework.web.cgform.enhance.CgformEnhanceJavaInter;

@Service("accrualLoanSubjectListService")
@Transactional
public class AccrualLoanSubjectListServiceImpl extends CommonServiceImpl implements AccrualLoanSubjectListServiceI {

	
 	public void delete(AccrualLoanSubjectListEntity entity) throws Exception{
 		super.delete(entity);
 		//执行删除操作增强业务
		this.doDelBus(entity);
 	}
 	
 	public Serializable save(AccrualLoanSubjectListEntity entity) throws Exception{
 		Serializable t = super.save(entity);
 		//执行新增操作增强业务
 		this.doAddBus(entity);
 		return t;
 	}
 	
 	public void saveOrUpdate(AccrualLoanSubjectListEntity entity) throws Exception{
 		super.saveOrUpdate(entity);
 		//执行更新操作增强业务
 		this.doUpdateBus(entity);
 	}
 	
 	/**
	 * 新增操作增强业务
	 * @param t
	 * @return
	 */
	private void doAddBus(AccrualLoanSubjectListEntity t) throws Exception{
		//-----------------sql增强 start----------------------------
	 	//-----------------sql增强 end------------------------------
	 	
	 	//-----------------java增强 start---------------------------
	 	//-----------------java增强 end-----------------------------
 	}
 	/**
	 * 更新操作增强业务
	 * @param t
	 * @return
	 */
	private void doUpdateBus(AccrualLoanSubjectListEntity t) throws Exception{
		//-----------------sql增强 start----------------------------
	 	//-----------------sql增强 end------------------------------
	 	
	 	//-----------------java增强 start---------------------------
	 	//-----------------java增强 end-----------------------------
 	}
 	/**
	 * 删除操作增强业务
	 * @param id
	 * @return
	 */
	private void doDelBus(AccrualLoanSubjectListEntity t) throws Exception{
	    //-----------------sql增强 start----------------------------
	 	//-----------------sql增强 end------------------------------
	 	
	 	//-----------------java增强 start---------------------------
	 	//-----------------java增强 end-----------------------------
 	}
 	
 	private Map<String,Object> populationMap(AccrualLoanSubjectListEntity t){
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("id", t.getId());
		map.put("name", t.getName());
		map.put("annualoutputvalue", t.getAnnualoutputvalue());
		map.put("creditinformation", t.getCreditinformation());
		map.put("engineeringquality", t.getEngineeringquality());
		map.put("comprehensivedescription", t.getComprehensivedescription());
		map.put("actualcontroller", t.getActualcontroller());
		map.put("actualcontroller_duty", t.getActualcontrollerDuty());
		map.put("actualcontroller_phone", t.getActualcontrollerPhone());
		map.put("actualcontroller_email", t.getActualcontrollerEmail());
		map.put("financialstaff", t.getFinancialstaff());
		map.put("financialstaff_duty", t.getFinancialstaffDuty());
		map.put("financialstaff_phone", t.getFinancialstaffPhone());
		map.put("financialstaff_email", t.getFinancialstaffEmail());
		map.put("remarks", t.getRemarks());
		map.put("loan_subjict_id", t.getLoanSubjictId());
		return map;
	}
 	
 	/**
	 * 替换sql中的变量
	 * @param sql
	 * @param t
	 * @return
	 */
 	public String replaceVal(String sql,AccrualLoanSubjectListEntity t){
 		sql  = sql.replace("#{id}",String.valueOf(t.getId()));
 		sql  = sql.replace("#{name}",String.valueOf(t.getName()));
 		sql  = sql.replace("#{annualoutputvalue}",String.valueOf(t.getAnnualoutputvalue()));
 		sql  = sql.replace("#{creditinformation}",String.valueOf(t.getCreditinformation()));
 		sql  = sql.replace("#{engineeringquality}",String.valueOf(t.getEngineeringquality()));
 		sql  = sql.replace("#{comprehensivedescription}",String.valueOf(t.getComprehensivedescription()));
 		sql  = sql.replace("#{actualcontroller}",String.valueOf(t.getActualcontroller()));
 		sql  = sql.replace("#{actualcontroller_duty}",String.valueOf(t.getActualcontrollerDuty()));
 		sql  = sql.replace("#{actualcontroller_phone}",String.valueOf(t.getActualcontrollerPhone()));
 		sql  = sql.replace("#{actualcontroller_email}",String.valueOf(t.getActualcontrollerEmail()));
 		sql  = sql.replace("#{financialstaff}",String.valueOf(t.getFinancialstaff()));
 		sql  = sql.replace("#{financialstaff_duty}",String.valueOf(t.getFinancialstaffDuty()));
 		sql  = sql.replace("#{financialstaff_phone}",String.valueOf(t.getFinancialstaffPhone()));
 		sql  = sql.replace("#{financialstaff_email}",String.valueOf(t.getFinancialstaffEmail()));
 		sql  = sql.replace("#{remarks}",String.valueOf(t.getRemarks()));
 		sql  = sql.replace("#{loan_subjict_id}",String.valueOf(t.getLoanSubjictId()));
 		sql  = sql.replace("#{UUID}",UUID.randomUUID().toString());
 		return sql;
 	}
 	
 	/**
	 * 执行JAVA增强
	 */
 	private void executeJavaExtend(String cgJavaType,String cgJavaValue,Map<String,Object> data) throws Exception {
 		if(StringUtil.isNotEmpty(cgJavaValue)){
			Object obj = null;
			try {
				if("class".equals(cgJavaType)){
					//因新增时已经校验了实例化是否可以成功，所以这块就不需要再做一次判断
					obj = MyClassLoader.getClassByScn(cgJavaValue).newInstance();
				}else if("spring".equals(cgJavaType)){
					obj = ApplicationContextUtil.getContext().getBean(cgJavaValue);
				}
				if(obj instanceof CgformEnhanceJavaInter){
					CgformEnhanceJavaInter javaInter = (CgformEnhanceJavaInter) obj;
					javaInter.execute("accrual_loan_subject_list",data);
				}
			} catch (Exception e) {
				e.printStackTrace();
				throw new Exception("执行JAVA增强出现异常！");
			} 
		}
 	}
}