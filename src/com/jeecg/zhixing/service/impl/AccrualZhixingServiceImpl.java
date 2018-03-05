package com.jeecg.zhixing.service.impl;
import com.jeecg.zhixing.service.AccrualZhixingServiceI;
import org.jeecgframework.core.common.service.impl.CommonServiceImpl;
import com.jeecg.zhixing.entity.AccrualZhixingEntity;
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

@Service("accrualZhixingService")
@Transactional
public class AccrualZhixingServiceImpl extends CommonServiceImpl implements AccrualZhixingServiceI {

	
 	public void delete(AccrualZhixingEntity entity) throws Exception{
 		super.delete(entity);
 		//执行删除操作增强业务
		this.doDelBus(entity);
 	}
 	
 	public Serializable save(AccrualZhixingEntity entity) throws Exception{
 		Serializable t = super.save(entity);
 		//执行新增操作增强业务
 		this.doAddBus(entity);
 		return t;
 	}
 	
 	public void saveOrUpdate(AccrualZhixingEntity entity) throws Exception{
 		super.saveOrUpdate(entity);
 		//执行更新操作增强业务
 		this.doUpdateBus(entity);
 	}
 	
 	/**
	 * 新增操作增强业务
	 * @param t
	 * @return
	 */
	private void doAddBus(AccrualZhixingEntity t) throws Exception{
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
	private void doUpdateBus(AccrualZhixingEntity t) throws Exception{
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
	private void doDelBus(AccrualZhixingEntity t) throws Exception{
	    //-----------------sql增强 start----------------------------
	 	//-----------------sql增强 end------------------------------
	 	
	 	//-----------------java增强 start---------------------------
	 	//-----------------java增强 end-----------------------------
 	}
 	
 	private Map<String,Object> populationMap(AccrualZhixingEntity t){
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("id", t.getId());
		map.put("billid", t.getBillid());
		map.put("borrowid", t.getBorrowid());
		map.put("zhaiyao", t.getZhaiyao());
		map.put("dotime", t.getDotime());
		map.put("payprincipal", t.getPayprincipal());
		map.put("returnprincipal", t.getReturnprincipal());
		map.put("unpaidprincipal", t.getUnpaidprincipal());
		map.put("interestpayable", t.getInterestpayable());
		map.put("paidinterest", t.getPaidinterest());
		map.put("unpaidinterest", t.getUnpaidinterest());
		map.put("userpeople", t.getUserpeople());
		return map;
	}
 	
 	/**
	 * 替换sql中的变量
	 * @param sql
	 * @param t
	 * @return
	 */
 	public String replaceVal(String sql,AccrualZhixingEntity t){
 		sql  = sql.replace("#{id}",String.valueOf(t.getId()));
 		sql  = sql.replace("#{billid}",String.valueOf(t.getBillid()));
 		sql  = sql.replace("#{borrowid}",String.valueOf(t.getBorrowid()));
 		sql  = sql.replace("#{zhaiyao}",String.valueOf(t.getZhaiyao()));
 		sql  = sql.replace("#{dotime}",String.valueOf(t.getDotime()));
 		sql  = sql.replace("#{payprincipal}",String.valueOf(t.getPayprincipal()));
 		sql  = sql.replace("#{returnprincipal}",String.valueOf(t.getReturnprincipal()));
 		sql  = sql.replace("#{unpaidprincipal}",String.valueOf(t.getUnpaidprincipal()));
 		sql  = sql.replace("#{interestpayable}",String.valueOf(t.getInterestpayable()));
 		sql  = sql.replace("#{paidinterest}",String.valueOf(t.getPaidinterest()));
 		sql  = sql.replace("#{unpaidinterest}",String.valueOf(t.getUnpaidinterest()));
 		sql  = sql.replace("#{userpeople}",String.valueOf(t.getUserpeople()));
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
					javaInter.execute("accrual_zhixing",data);
				}
			} catch (Exception e) {
				e.printStackTrace();
				throw new Exception("执行JAVA增强出现异常！");
			} 
		}
 	}
}