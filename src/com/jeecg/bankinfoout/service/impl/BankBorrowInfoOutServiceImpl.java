package com.jeecg.bankinfoout.service.impl;
import com.jeecg.bankinfoout.service.BankBorrowInfoOutServiceI;
import org.jeecgframework.core.common.service.impl.CommonServiceImpl;
import com.jeecg.bankinfoout.entity.BankBorrowInfoOutEntity;
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

@Service("bankBorrowInfoOutService")
@Transactional
public class BankBorrowInfoOutServiceImpl extends CommonServiceImpl implements BankBorrowInfoOutServiceI {

	
 	public void delete(BankBorrowInfoOutEntity entity) throws Exception{
 		super.delete(entity);
 		//执行删除操作增强业务
		this.doDelBus(entity);
 	}
 	
 	public Serializable save(BankBorrowInfoOutEntity entity) throws Exception{
 		Serializable t = super.save(entity);
 		//执行新增操作增强业务
 		this.doAddBus(entity);
 		return t;
 	}
 	
 	public void saveOrUpdate(BankBorrowInfoOutEntity entity) throws Exception{
 		super.saveOrUpdate(entity);
 		//执行更新操作增强业务
 		this.doUpdateBus(entity);
 	}
 	
 	/**
	 * 新增操作增强业务
	 * @param t
	 * @return
	 */
	private void doAddBus(BankBorrowInfoOutEntity t) throws Exception{
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
	private void doUpdateBus(BankBorrowInfoOutEntity t) throws Exception{
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
	private void doDelBus(BankBorrowInfoOutEntity t) throws Exception{
	    //-----------------sql增强 start----------------------------
	 	//-----------------sql增强 end------------------------------
	 	
	 	//-----------------java增强 start---------------------------
	 	//-----------------java增强 end-----------------------------
 	}
 	
 	private Map<String,Object> populationMap(BankBorrowInfoOutEntity t){
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("id", t.getId());
		map.put("contract_id", t.getContractId());
		map.put("loanamount", t.getLoanamount());
		map.put("base_rate", t.getBaseRate());
		map.put("excessinterest_rate", t.getExcessinterestRate());
		map.put("start_time", t.getStartTime());
		map.put("end_time", t.getEndTime());
		map.put("period", t.getPeriod());
		map.put("repayment_date", t.getRepaymentDate());
		map.put("repayment_mode", t.getRepaymentMode());
		map.put("interest_cycle", t.getInterestCycle());
		map.put("borrower", t.getBorrower());
		map.put("guarantor", t.getGuarantor());
		map.put("lender", t.getLender());
		map.put("input_person", t.getInputPerson());
		map.put("input_time", t.getInputTime());
		map.put("update_person", t.getUpdatePerson());
		map.put("update_time", t.getUpdateTime());
		return map;
	}
 	
 	/**
	 * 替换sql中的变量
	 * @param sql
	 * @param t
	 * @return
	 */
 	public String replaceVal(String sql,BankBorrowInfoOutEntity t){
 		sql  = sql.replace("#{id}",String.valueOf(t.getId()));
 		sql  = sql.replace("#{contract_id}",String.valueOf(t.getContractId()));
 		sql  = sql.replace("#{loanamount}",String.valueOf(t.getLoanamount()));
 		sql  = sql.replace("#{base_rate}",String.valueOf(t.getBaseRate()));
 		sql  = sql.replace("#{excessinterest_rate}",String.valueOf(t.getExcessinterestRate()));
 		sql  = sql.replace("#{start_time}",String.valueOf(t.getStartTime()));
 		sql  = sql.replace("#{end_time}",String.valueOf(t.getEndTime()));
 		sql  = sql.replace("#{period}",String.valueOf(t.getPeriod()));
 		sql  = sql.replace("#{repayment_date}",String.valueOf(t.getRepaymentDate()));
 		sql  = sql.replace("#{repayment_mode}",String.valueOf(t.getRepaymentMode()));
 		sql  = sql.replace("#{interest_cycle}",String.valueOf(t.getInterestCycle()));
 		sql  = sql.replace("#{borrower}",String.valueOf(t.getBorrower()));
 		sql  = sql.replace("#{guarantor}",String.valueOf(t.getGuarantor()));
 		sql  = sql.replace("#{lender}",String.valueOf(t.getLender()));
 		sql  = sql.replace("#{input_person}",String.valueOf(t.getInputPerson()));
 		sql  = sql.replace("#{input_time}",String.valueOf(t.getInputTime()));
 		sql  = sql.replace("#{update_person}",String.valueOf(t.getUpdatePerson()));
 		sql  = sql.replace("#{update_time}",String.valueOf(t.getUpdateTime()));
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
					javaInter.execute("bank_borrow_info_out",data);
				}
			} catch (Exception e) {
				e.printStackTrace();
				throw new Exception("执行JAVA增强出现异常！");
			} 
		}
 	}
}