package com.jeecg.bankloancontract.service.impl;
import com.jeecg.bankloancontract.service.AccrualNewbankContractlistServiceI;
import org.jeecgframework.core.common.service.impl.CommonServiceImpl;
import com.jeecg.bankloancontract.entity.AccrualNewbankContractlistEntity;
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

@Service("accrualNewbankContractlistService")
@Transactional
public class AccrualNewbankContractlistServiceImpl extends CommonServiceImpl implements AccrualNewbankContractlistServiceI {

	
 	public void delete(AccrualNewbankContractlistEntity entity) throws Exception{
 		super.delete(entity);
 		//执行删除操作增强业务
		this.doDelBus(entity);
 	}
 	
 	public Serializable save(AccrualNewbankContractlistEntity entity) throws Exception{
 		Serializable t = super.save(entity);
 		//执行新增操作增强业务
 		this.doAddBus(entity);
 		return t;
 	}
 	
 	public void saveOrUpdate(AccrualNewbankContractlistEntity entity) throws Exception{
 		super.saveOrUpdate(entity);
 		//执行更新操作增强业务
 		this.doUpdateBus(entity);
 	}
 	
 	/**
	 * 新增操作增强业务
	 * @param t
	 * @return
	 */
	private void doAddBus(AccrualNewbankContractlistEntity t) throws Exception{
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
	private void doUpdateBus(AccrualNewbankContractlistEntity t) throws Exception{
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
	private void doDelBus(AccrualNewbankContractlistEntity t) throws Exception{
	    //-----------------sql增强 start----------------------------
	 	//-----------------sql增强 end------------------------------
	 	
	 	//-----------------java增强 start---------------------------
	 	//-----------------java增强 end-----------------------------
 	}
 	
 	private Map<String,Object> populationMap(AccrualNewbankContractlistEntity t){
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("id", t.getId());
		map.put("contract_id", t.getContractId());
		map.put("loan_method", t.getLoanMethod());
		map.put("loan_unit", t.getLoanUnit());
		map.put("borrower", t.getBorrower());
		map.put("contract_nature", t.getContractNature());
		map.put("contract_status", t.getContractStatus());
		map.put("regional_company", t.getRegionalCompany());
		map.put("contractor", t.getContractor());
		map.put("project_department", t.getProjectDepartment());
		map.put("remarks", t.getRemarks());
		map.put("base_rate", t.getBaseRate());
		map.put("excess_rate", t.getExcessRate());
		map.put("compound_interest", t.getCompoundInterest());
		map.put("interest_day", t.getInterestDay());
		map.put("contract_award_date", t.getContractAwardDate());
		map.put("loan_amount", t.getLoanAmount());
		map.put("period", t.getPeriod());
		map.put("period_unit", t.getPeriodUnit());
		map.put("start_date", t.getStartDate());
		map.put("end_date", t.getEndDate());
		map.put("input_person", t.getInputPerson());
		map.put("auditor", t.getAuditor());
		return map;
	}
 	
 	/**
	 * 替换sql中的变量
	 * @param sql
	 * @param t
	 * @return
	 */
 	public String replaceVal(String sql,AccrualNewbankContractlistEntity t){
 		sql  = sql.replace("#{id}",String.valueOf(t.getId()));
 		sql  = sql.replace("#{contract_id}",String.valueOf(t.getContractId()));
 		sql  = sql.replace("#{loan_method}",String.valueOf(t.getLoanMethod()));
 		sql  = sql.replace("#{loan_unit}",String.valueOf(t.getLoanUnit()));
 		sql  = sql.replace("#{borrower}",String.valueOf(t.getBorrower()));
 		sql  = sql.replace("#{contract_nature}",String.valueOf(t.getContractNature()));
 		sql  = sql.replace("#{contract_status}",String.valueOf(t.getContractStatus()));
 		sql  = sql.replace("#{regional_company}",String.valueOf(t.getRegionalCompany()));
 		sql  = sql.replace("#{contractor}",String.valueOf(t.getContractor()));
 		sql  = sql.replace("#{project_department}",String.valueOf(t.getProjectDepartment()));
 		sql  = sql.replace("#{remarks}",String.valueOf(t.getRemarks()));
 		sql  = sql.replace("#{base_rate}",String.valueOf(t.getBaseRate()));
 		sql  = sql.replace("#{excess_rate}",String.valueOf(t.getExcessRate()));
 		sql  = sql.replace("#{compound_interest}",String.valueOf(t.getCompoundInterest()));
 		sql  = sql.replace("#{interest_day}",String.valueOf(t.getInterestDay()));
 		sql  = sql.replace("#{contract_award_date}",String.valueOf(t.getContractAwardDate()));
 		sql  = sql.replace("#{loan_amount}",String.valueOf(t.getLoanAmount()));
 		sql  = sql.replace("#{period}",String.valueOf(t.getPeriod()));
 		sql  = sql.replace("#{period_unit}",String.valueOf(t.getPeriodUnit()));
 		sql  = sql.replace("#{start_date}",String.valueOf(t.getStartDate()));
 		sql  = sql.replace("#{end_date}",String.valueOf(t.getEndDate()));
 		sql  = sql.replace("#{input_person}",String.valueOf(t.getInputPerson()));
 		sql  = sql.replace("#{auditor}",String.valueOf(t.getAuditor()));
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
					javaInter.execute("accrual_newbank_contractlist",data);
				}
			} catch (Exception e) {
				e.printStackTrace();
				throw new Exception("执行JAVA增强出现异常！");
			} 
		}
 	}
}