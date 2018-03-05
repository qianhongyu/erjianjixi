package com.jeecg.fangkuan.service.impl;
import com.jeecg.fangkuan.service.AccrualFangkuanServiceI;
import org.jeecgframework.core.common.service.impl.CommonServiceImpl;
import com.jeecg.fangkuan.entity.AccrualFangkuanEntity;
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

@Service("accrualFangkuanService")
@Transactional
public class AccrualFangkuanServiceImpl extends CommonServiceImpl implements AccrualFangkuanServiceI {

	
 	public void delete(AccrualFangkuanEntity entity) throws Exception{
 		super.delete(entity);
 		//执行删除操作增强业务
		this.doDelBus(entity);
 	}
 	
 	public Serializable save(AccrualFangkuanEntity entity) throws Exception{
 		Serializable t = super.save(entity);
 		//执行新增操作增强业务
 		this.doAddBus(entity);
 		return t;
 	}
 	
 	public void saveOrUpdate(AccrualFangkuanEntity entity) throws Exception{
 		super.saveOrUpdate(entity);
 		//执行更新操作增强业务
 		this.doUpdateBus(entity);
 	}
 	
 	/**
	 * 新增操作增强业务
	 * @param t
	 * @return
	 */
	private void doAddBus(AccrualFangkuanEntity t) throws Exception{
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
	private void doUpdateBus(AccrualFangkuanEntity t) throws Exception{
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
	private void doDelBus(AccrualFangkuanEntity t) throws Exception{
	    //-----------------sql增强 start----------------------------
	 	//-----------------sql增强 end------------------------------
	 	
	 	//-----------------java增强 start---------------------------
	 	//-----------------java增强 end-----------------------------
 	}
 	
 	private Map<String,Object> populationMap(AccrualFangkuanEntity t){
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("id", t.getId());
		map.put("danju_id", t.getDanjuId());
		map.put("hetong_id", t.getHetongId());
		map.put("daikuanunit", t.getDaikuanunit());
		map.put("contracttype", t.getContracttype());
		map.put("jiekuanunit", t.getJiekuanunit());
		map.put("contractjine", t.getContractjine());
		map.put("quyucompany", t.getQuyucompany());
		map.put("jiexiday", t.getJiexiday());
		map.put("cbscompany", t.getCbscompany());
		map.put("contractqsrq", t.getContractqsrq());
		map.put("xmbcompany", t.getXmbcompany());
		map.put("contractzzrq", t.getContractzzrq());
		map.put("baserate", t.getBaserate());
		map.put("overrate", t.getOverrate());
		map.put("fangkuanjine", t.getFangkuanjine());
		map.put("danjuzt", t.getDanjuzt());
		map.put("note", t.getNote());
		map.put("zhidanren", t.getZhidanren());
		map.put("zhidandate", t.getZhidandate());
		map.put("shenheren", t.getShenheren());
		map.put("shenhedate", t.getShenhedate());
		return map;
	}
 	
 	/**
	 * 替换sql中的变量
	 * @param sql
	 * @param t
	 * @return
	 */
 	public String replaceVal(String sql,AccrualFangkuanEntity t){
 		sql  = sql.replace("#{id}",String.valueOf(t.getId()));
 		sql  = sql.replace("#{danju_id}",String.valueOf(t.getDanjuId()));
 		sql  = sql.replace("#{hetong_id}",String.valueOf(t.getHetongId()));
 		sql  = sql.replace("#{daikuanunit}",String.valueOf(t.getDaikuanunit()));
 		sql  = sql.replace("#{contracttype}",String.valueOf(t.getContracttype()));
 		sql  = sql.replace("#{jiekuanunit}",String.valueOf(t.getJiekuanunit()));
 		sql  = sql.replace("#{contractjine}",String.valueOf(t.getContractjine()));
 		sql  = sql.replace("#{quyucompany}",String.valueOf(t.getQuyucompany()));
 		sql  = sql.replace("#{jiexiday}",String.valueOf(t.getJiexiday()));
 		sql  = sql.replace("#{cbscompany}",String.valueOf(t.getCbscompany()));
 		sql  = sql.replace("#{contractqsrq}",String.valueOf(t.getContractqsrq()));
 		sql  = sql.replace("#{xmbcompany}",String.valueOf(t.getXmbcompany()));
 		sql  = sql.replace("#{contractzzrq}",String.valueOf(t.getContractzzrq()));
 		sql  = sql.replace("#{baserate}",String.valueOf(t.getBaserate()));
 		sql  = sql.replace("#{overrate}",String.valueOf(t.getOverrate()));
 		sql  = sql.replace("#{fangkuanjine}",String.valueOf(t.getFangkuanjine()));
 		sql  = sql.replace("#{danjuzt}",String.valueOf(t.getDanjuzt()));
 		sql  = sql.replace("#{note}",String.valueOf(t.getNote()));
 		sql  = sql.replace("#{zhidanren}",String.valueOf(t.getZhidanren()));
 		sql  = sql.replace("#{zhidandate}",String.valueOf(t.getZhidandate()));
 		sql  = sql.replace("#{shenheren}",String.valueOf(t.getShenheren()));
 		sql  = sql.replace("#{shenhedate}",String.valueOf(t.getShenhedate()));
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
					javaInter.execute("accrual_fangkuan",data);
				}
			} catch (Exception e) {
				e.printStackTrace();
				throw new Exception("执行JAVA增强出现异常！");
			} 
		}
 	}
}