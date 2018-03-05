package com.jeecg.interestlist.service.impl;
import com.jeecg.interestlist.service.AccrualContractInterestIstServiceI;
import org.jeecgframework.core.common.service.impl.CommonServiceImpl;
import com.jeecg.interestlist.entity.AccrualContractInterestIstEntity;
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

@Service("accrualContractInterestIstService")
@Transactional
public class AccrualContractInterestIstServiceImpl extends CommonServiceImpl implements AccrualContractInterestIstServiceI {

	
 	public void delete(AccrualContractInterestIstEntity entity) throws Exception{
 		super.delete(entity);
 		//执行删除操作增强业务
		this.doDelBus(entity);
 	}
 	
 	public Serializable save(AccrualContractInterestIstEntity entity) throws Exception{
 		Serializable t = super.save(entity);
 		//执行新增操作增强业务
 		this.doAddBus(entity);
 		return t;
 	}
 	
 	public void saveOrUpdate(AccrualContractInterestIstEntity entity) throws Exception{
 		super.saveOrUpdate(entity);
 		//执行更新操作增强业务
 		this.doUpdateBus(entity);
 	}
 	
 	/**
	 * 新增操作增强业务
	 * @param t
	 * @return
	 */
	private void doAddBus(AccrualContractInterestIstEntity t) throws Exception{
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
	private void doUpdateBus(AccrualContractInterestIstEntity t) throws Exception{
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
	private void doDelBus(AccrualContractInterestIstEntity t) throws Exception{
	    //-----------------sql增强 start----------------------------
	 	//-----------------sql增强 end------------------------------
	 	
	 	//-----------------java增强 start---------------------------
	 	//-----------------java增强 end-----------------------------
 	}
 	
 	private Map<String,Object> populationMap(AccrualContractInterestIstEntity t){
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("id", t.getId());
		map.put("list_number", t.getListNumber());
		map.put("contract_type", t.getContractType());
		map.put("contract_id", t.getContractId());
		map.put("principal", t.getPrincipal());
		map.put("compound_interest", t.getCompoundInterest());
		map.put("end_interest_day", t.getEndInterestDay());
		map.put("loan_unit", t.getLoanUnit());
		map.put("borrower", t.getBorrower());
		map.put("regional_company", t.getRegionalCompany());
		map.put("contractor", t.getContractor());
		map.put("project_department", t.getProjectDepartment());
		map.put("base_rate", t.getBaseRate());
		map.put("excess_rate", t.getExcessRate());
		map.put("base_interest", t.getBaseInterest());
		map.put("excess_interes", t.getExcessInteres());
		map.put("interest_aggregate", t.getInterestAggregate());
		map.put("start_interest_day", t.getStartInterestDay());
		map.put("rest_days", t.getRestDays());
		return map;
	}
 	
 	/**
	 * 替换sql中的变量
	 * @param sql
	 * @param t
	 * @return
	 */
 	public String replaceVal(String sql,AccrualContractInterestIstEntity t){
 		sql  = sql.replace("#{id}",String.valueOf(t.getId()));
 		sql  = sql.replace("#{list_number}",String.valueOf(t.getListNumber()));
 		sql  = sql.replace("#{contract_type}",String.valueOf(t.getContractType()));
 		sql  = sql.replace("#{contract_id}",String.valueOf(t.getContractId()));
 		sql  = sql.replace("#{principal}",String.valueOf(t.getPrincipal()));
 		sql  = sql.replace("#{compound_interest}",String.valueOf(t.getCompoundInterest()));
 		sql  = sql.replace("#{end_interest_day}",String.valueOf(t.getEndInterestDay()));
 		sql  = sql.replace("#{loan_unit}",String.valueOf(t.getLoanUnit()));
 		sql  = sql.replace("#{borrower}",String.valueOf(t.getBorrower()));
 		sql  = sql.replace("#{regional_company}",String.valueOf(t.getRegionalCompany()));
 		sql  = sql.replace("#{contractor}",String.valueOf(t.getContractor()));
 		sql  = sql.replace("#{project_department}",String.valueOf(t.getProjectDepartment()));
 		sql  = sql.replace("#{base_rate}",String.valueOf(t.getBaseRate()));
 		sql  = sql.replace("#{excess_rate}",String.valueOf(t.getExcessRate()));
 		sql  = sql.replace("#{base_interest}",String.valueOf(t.getBaseInterest()));
 		sql  = sql.replace("#{excess_interes}",String.valueOf(t.getExcessInteres()));
 		sql  = sql.replace("#{interest_aggregate}",String.valueOf(t.getInterestAggregate()));
 		sql  = sql.replace("#{start_interest_day}",String.valueOf(t.getStartInterestDay()));
 		sql  = sql.replace("#{rest_days}",String.valueOf(t.getRestDays()));
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
					javaInter.execute("accrual_contract_interest_ist",data);
				}
			} catch (Exception e) {
				e.printStackTrace();
				throw new Exception("执行JAVA增强出现异常！");
			} 
		}
 	}
}