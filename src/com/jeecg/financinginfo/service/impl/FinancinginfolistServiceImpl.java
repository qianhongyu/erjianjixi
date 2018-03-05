package com.jeecg.financinginfo.service.impl;
import com.jeecg.financinginfo.service.FinancinginfolistServiceI;
import org.jeecgframework.core.common.service.impl.CommonServiceImpl;
import com.jeecg.financinginfo.entity.FinancinginfolistEntity;
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

@Service("financinginfolistService")
@Transactional
public class FinancinginfolistServiceImpl extends CommonServiceImpl implements FinancinginfolistServiceI {

	
 	public void delete(FinancinginfolistEntity entity) throws Exception{
 		super.delete(entity);
 		//执行删除操作增强业务
		this.doDelBus(entity);
 	}
 	
 	public Serializable save(FinancinginfolistEntity entity) throws Exception{
 		Serializable t = super.save(entity);
 		//执行新增操作增强业务
 		this.doAddBus(entity);
 		return t;
 	}
 	
 	public void saveOrUpdate(FinancinginfolistEntity entity) throws Exception{
 		super.saveOrUpdate(entity);
 		//执行更新操作增强业务
 		this.doUpdateBus(entity);
 	}
 	
 	/**
	 * 新增操作增强业务
	 * @param t
	 * @return
	 */
	private void doAddBus(FinancinginfolistEntity t) throws Exception{
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
	private void doUpdateBus(FinancinginfolistEntity t) throws Exception{
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
	private void doDelBus(FinancinginfolistEntity t) throws Exception{
	    //-----------------sql增强 start----------------------------
	 	//-----------------sql增强 end------------------------------
	 	
	 	//-----------------java增强 start---------------------------
	 	//-----------------java增强 end-----------------------------
 	}
 	
 	private Map<String,Object> populationMap(FinancinginfolistEntity t){
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("id", t.getId());
		map.put("contractnumber", t.getContractnumber());
		map.put("loansubject", t.getLoansubject());
		map.put("subjectname", t.getSubjectname());
		map.put("financialinstitution", t.getFinancialinstitution());
		map.put("loancategory", t.getLoancategory());
		map.put("money", t.getMoney());
		map.put("annualrate", t.getAnnualrate());
		map.put("extraexpenses", t.getExtraexpenses());
		map.put("guaranteemethod", t.getGuaranteemethod());
		map.put("guaranteemoney", t.getGuaranteemoney());
		map.put("startinterestday", t.getStartinterestday());
		map.put("endinterestday", t.getEndinterestday());
		map.put("monthlyinterest", t.getMonthlyinterest());
		map.put("wayofinterestaccrual", t.getWayofinterestaccrual());
		map.put("interestday", t.getInterestday());
		map.put("remarks", t.getRemarks());
		return map;
	}
 	
 	/**
	 * 替换sql中的变量
	 * @param sql
	 * @param t
	 * @return
	 */
 	public String replaceVal(String sql,FinancinginfolistEntity t){
 		sql  = sql.replace("#{id}",String.valueOf(t.getId()));
 		sql  = sql.replace("#{contractnumber}",String.valueOf(t.getContractnumber()));
 		sql  = sql.replace("#{loansubject}",String.valueOf(t.getLoansubject()));
 		sql  = sql.replace("#{subjectname}",String.valueOf(t.getSubjectname()));
 		sql  = sql.replace("#{financialinstitution}",String.valueOf(t.getFinancialinstitution()));
 		sql  = sql.replace("#{loancategory}",String.valueOf(t.getLoancategory()));
 		sql  = sql.replace("#{money}",String.valueOf(t.getMoney()));
 		sql  = sql.replace("#{annualrate}",String.valueOf(t.getAnnualrate()));
 		sql  = sql.replace("#{extraexpenses}",String.valueOf(t.getExtraexpenses()));
 		sql  = sql.replace("#{guaranteemethod}",String.valueOf(t.getGuaranteemethod()));
 		sql  = sql.replace("#{guaranteemoney}",String.valueOf(t.getGuaranteemoney()));
 		sql  = sql.replace("#{startinterestday}",String.valueOf(t.getStartinterestday()));
 		sql  = sql.replace("#{endinterestday}",String.valueOf(t.getEndinterestday()));
 		sql  = sql.replace("#{monthlyinterest}",String.valueOf(t.getMonthlyinterest()));
 		sql  = sql.replace("#{wayofinterestaccrual}",String.valueOf(t.getWayofinterestaccrual()));
 		sql  = sql.replace("#{interestday}",String.valueOf(t.getInterestday()));
 		sql  = sql.replace("#{remarks}",String.valueOf(t.getRemarks()));
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
					javaInter.execute("financinginfolist",data);
				}
			} catch (Exception e) {
				e.printStackTrace();
				throw new Exception("执行JAVA增强出现异常！");
			} 
		}
 	}
}