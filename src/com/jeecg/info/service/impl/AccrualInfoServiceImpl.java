package com.jeecg.info.service.impl;
import com.jeecg.info.service.AccrualInfoServiceI;
import org.jeecgframework.core.common.service.impl.CommonServiceImpl;
import com.jeecg.info.entity.AccrualInfoEntity;
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

@Service("accrualInfoService")
@Transactional
public class AccrualInfoServiceImpl extends CommonServiceImpl implements AccrualInfoServiceI {

	
 	public void delete(AccrualInfoEntity entity) throws Exception{
 		super.delete(entity);
 		//执行删除操作增强业务
		this.doDelBus(entity);
 	}
 	
 	public Serializable save(AccrualInfoEntity entity) throws Exception{
 		Serializable t = super.save(entity);
 		//执行新增操作增强业务
 		this.doAddBus(entity);
 		return t;
 	}
 	
 	public void saveOrUpdate(AccrualInfoEntity entity) throws Exception{
 		super.saveOrUpdate(entity);
 		//执行更新操作增强业务
 		this.doUpdateBus(entity);
 	}
 	
 	/**
	 * 新增操作增强业务
	 * @param t
	 * @return
	 */
	private void doAddBus(AccrualInfoEntity t) throws Exception{
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
	private void doUpdateBus(AccrualInfoEntity t) throws Exception{
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
	private void doDelBus(AccrualInfoEntity t) throws Exception{
	    //-----------------sql增强 start----------------------------
	 	//-----------------sql增强 end------------------------------
	 	
	 	//-----------------java增强 start---------------------------
	 	//-----------------java增强 end-----------------------------
 	}
 	
 	private Map<String,Object> populationMap(AccrualInfoEntity t){
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("id", t.getId());
		map.put("hetong_id", t.getHetongId());
		map.put("loanamount", t.getLoanamount());
		map.put("basicrate", t.getBasicrate());
		map.put("excessinterestrate", t.getExcessinterestrate());
		map.put("starttime", t.getStarttime());
		map.put("endtime", t.getEndtime());
		map.put("period", t.getPeriod());
		map.put("repaymentdate", t.getRepaymentdate());
		map.put("repaymentmode", t.getRepaymentmode());
		map.put("interestcycle", t.getInterestcycle());
		map.put("borrower", t.getBorrower());
		map.put("guarantor", t.getGuarantor());
		map.put("lender", t.getLender());
		map.put("inputperson", t.getInputperson());
		map.put("inputtime", t.getInputtime());
		map.put("changeperson", t.getChangeperson());
		map.put("changetime", t.getChangetime());
		return map;
	}
 	
 	/**
	 * 替换sql中的变量
	 * @param sql
	 * @param t
	 * @return
	 */
 	public String replaceVal(String sql,AccrualInfoEntity t){
 		sql  = sql.replace("#{id}",String.valueOf(t.getId()));
 		sql  = sql.replace("#{hetong_id}",String.valueOf(t.getHetongId()));
 		sql  = sql.replace("#{loanamount}",String.valueOf(t.getLoanamount()));
 		sql  = sql.replace("#{basicrate}",String.valueOf(t.getBasicrate()));
 		sql  = sql.replace("#{excessinterestrate}",String.valueOf(t.getExcessinterestrate()));
 		sql  = sql.replace("#{starttime}",String.valueOf(t.getStarttime()));
 		sql  = sql.replace("#{endtime}",String.valueOf(t.getEndtime()));
 		sql  = sql.replace("#{period}",String.valueOf(t.getPeriod()));
 		sql  = sql.replace("#{repaymentdate}",String.valueOf(t.getRepaymentdate()));
 		sql  = sql.replace("#{repaymentmode}",String.valueOf(t.getRepaymentmode()));
 		sql  = sql.replace("#{interestcycle}",String.valueOf(t.getInterestcycle()));
 		sql  = sql.replace("#{borrower}",String.valueOf(t.getBorrower()));
 		sql  = sql.replace("#{guarantor}",String.valueOf(t.getGuarantor()));
 		sql  = sql.replace("#{lender}",String.valueOf(t.getLender()));
 		sql  = sql.replace("#{inputperson}",String.valueOf(t.getInputperson()));
 		sql  = sql.replace("#{inputtime}",String.valueOf(t.getInputtime()));
 		sql  = sql.replace("#{changeperson}",String.valueOf(t.getChangeperson()));
 		sql  = sql.replace("#{changetime}",String.valueOf(t.getChangetime()));
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
					javaInter.execute("accrual_info",data);
				}
			} catch (Exception e) {
				e.printStackTrace();
				throw new Exception("执行JAVA增强出现异常！");
			} 
		}
 	}
}