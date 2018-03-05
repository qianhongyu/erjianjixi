package com.jeecg.zhiya.service.impl;
import com.jeecg.zhiya.service.AccrualZhiyaServiceI;
import org.jeecgframework.core.common.service.impl.CommonServiceImpl;
import com.jeecg.zhiya.entity.AccrualZhiyaEntity;
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

@Service("accrualZhiyaService")
@Transactional
public class AccrualZhiyaServiceImpl extends CommonServiceImpl implements AccrualZhiyaServiceI {

	
 	public void delete(AccrualZhiyaEntity entity) throws Exception{
 		super.delete(entity);
 		//执行删除操作增强业务
		this.doDelBus(entity);
 	}
 	
 	public Serializable save(AccrualZhiyaEntity entity) throws Exception{
 		Serializable t = super.save(entity);
 		//执行新增操作增强业务
 		this.doAddBus(entity);
 		return t;
 	}
 	
 	public void saveOrUpdate(AccrualZhiyaEntity entity) throws Exception{
 		super.saveOrUpdate(entity);
 		//执行更新操作增强业务
 		this.doUpdateBus(entity);
 	}
 	
 	/**
	 * 新增操作增强业务
	 * @param t
	 * @return
	 */
	private void doAddBus(AccrualZhiyaEntity t) throws Exception{
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
	private void doUpdateBus(AccrualZhiyaEntity t) throws Exception{
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
	private void doDelBus(AccrualZhiyaEntity t) throws Exception{
	    //-----------------sql增强 start----------------------------
	 	//-----------------sql增强 end------------------------------
	 	
	 	//-----------------java增强 start---------------------------
	 	//-----------------java增强 end-----------------------------
 	}
 	
 	private Map<String,Object> populationMap(AccrualZhiyaEntity t){
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("id", t.getId());
		map.put("ownershipunit", t.getOwnershipunit());
		map.put("mortgages", t.getMortgages());
		map.put("evaluationvalue", t.getEvaluationvalue());
		map.put("evaluationunit", t.getEvaluationunit());
		map.put("mortgagedvalue", t.getMortgagedvalue());
		map.put("toatlmortgagedvalue", t.getToatlmortgagedvalue());
		map.put("surplusmortgagedvalue", t.getSurplusmortgagedvalue());
		map.put("actualmortgagedvalue", t.getActualmortgagedvalue());
		return map;
	}
 	
 	/**
	 * 替换sql中的变量
	 * @param sql
	 * @param t
	 * @return
	 */
 	public String replaceVal(String sql,AccrualZhiyaEntity t){
 		sql  = sql.replace("#{id}",String.valueOf(t.getId()));
 		sql  = sql.replace("#{ownershipunit}",String.valueOf(t.getOwnershipunit()));
 		sql  = sql.replace("#{mortgages}",String.valueOf(t.getMortgages()));
 		sql  = sql.replace("#{evaluationvalue}",String.valueOf(t.getEvaluationvalue()));
 		sql  = sql.replace("#{evaluationunit}",String.valueOf(t.getEvaluationunit()));
 		sql  = sql.replace("#{mortgagedvalue}",String.valueOf(t.getMortgagedvalue()));
 		sql  = sql.replace("#{toatlmortgagedvalue}",String.valueOf(t.getToatlmortgagedvalue()));
 		sql  = sql.replace("#{surplusmortgagedvalue}",String.valueOf(t.getSurplusmortgagedvalue()));
 		sql  = sql.replace("#{actualmortgagedvalue}",String.valueOf(t.getActualmortgagedvalue()));
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
					javaInter.execute("accrual_zhiya",data);
				}
			} catch (Exception e) {
				e.printStackTrace();
				throw new Exception("执行JAVA增强出现异常！");
			} 
		}
 	}
}