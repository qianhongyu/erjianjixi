package com.jeecg.interestmath.service.impl;
import com.jeecg.interestmath.service.AccrualInterestCalculationServiceI;
import org.jeecgframework.core.common.service.impl.CommonServiceImpl;
import com.jeecg.interestmath.entity.AccrualInterestCalculationEntity;
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

@Service("accrualInterestCalculationService")
@Transactional
public class AccrualInterestCalculationServiceImpl extends CommonServiceImpl implements AccrualInterestCalculationServiceI {

	
 	public void delete(AccrualInterestCalculationEntity entity) throws Exception{
 		super.delete(entity);
 		//执行删除操作增强业务
		this.doDelBus(entity);
 	}
 	
 	public Serializable save(AccrualInterestCalculationEntity entity) throws Exception{
 		Serializable t = super.save(entity);
 		//执行新增操作增强业务
 		this.doAddBus(entity);
 		return t;
 	}
 	
 	public void saveOrUpdate(AccrualInterestCalculationEntity entity) throws Exception{
 		super.saveOrUpdate(entity);
 		//执行更新操作增强业务
 		this.doUpdateBus(entity);
 	}
 	
 	/**
	 * 新增操作增强业务
	 * @param t
	 * @return
	 */
	private void doAddBus(AccrualInterestCalculationEntity t) throws Exception{
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
	private void doUpdateBus(AccrualInterestCalculationEntity t) throws Exception{
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
	private void doDelBus(AccrualInterestCalculationEntity t) throws Exception{
	    //-----------------sql增强 start----------------------------
	 	//-----------------sql增强 end------------------------------
	 	
	 	//-----------------java增强 start---------------------------
	 	//-----------------java增强 end-----------------------------
 	}
 	
 	private Map<String,Object> populationMap(AccrualInterestCalculationEntity t){
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("id", t.getId());
		map.put("contract_nature", t.getContractNature());
		map.put("contract_id", t.getContractId());
		map.put("loan_amount", t.getLoanAmount());
		map.put("base_rate", t.getBaseRate());
		map.put("excess_rate", t.getExcessRate());
		map.put("interest_day", t.getInterestDay());
		map.put("nowinterest_day", t.getNowinterestDay());
		map.put("nextinterest_day", t.getNextinterestDay());
		map.put("loan_unit", t.getLoanUnit());
		map.put("borrower", t.getBorrower());
		map.put("regional_company", t.getRegionalCompany());
		map.put("contractor", t.getContractor());
		return map;
	}
 	
 	/**
	 * 替换sql中的变量
	 * @param sql
	 * @param t
	 * @return
	 */
 	public String replaceVal(String sql,AccrualInterestCalculationEntity t){
 		sql  = sql.replace("#{id}",String.valueOf(t.getId()));
 		sql  = sql.replace("#{contract_nature}",String.valueOf(t.getContractNature()));
 		sql  = sql.replace("#{contract_id}",String.valueOf(t.getContractId()));
 		sql  = sql.replace("#{loan_amount}",String.valueOf(t.getLoanAmount()));
 		sql  = sql.replace("#{base_rate}",String.valueOf(t.getBaseRate()));
 		sql  = sql.replace("#{excess_rate}",String.valueOf(t.getExcessRate()));
 		sql  = sql.replace("#{interest_day}",String.valueOf(t.getInterestDay()));
 		sql  = sql.replace("#{nowinterest_day}",String.valueOf(t.getNowinterestDay()));
 		sql  = sql.replace("#{nextinterest_day}",String.valueOf(t.getNextinterestDay()));
 		sql  = sql.replace("#{loan_unit}",String.valueOf(t.getLoanUnit()));
 		sql  = sql.replace("#{borrower}",String.valueOf(t.getBorrower()));
 		sql  = sql.replace("#{regional_company}",String.valueOf(t.getRegionalCompany()));
 		sql  = sql.replace("#{contractor}",String.valueOf(t.getContractor()));
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
					javaInter.execute("accrual_interest_calculation",data);
				}
			} catch (Exception e) {
				e.printStackTrace();
				throw new Exception("执行JAVA增强出现异常！");
			} 
		}
 	}
}