package com.jeecg.zhiya.service;
import com.jeecg.zhiya.entity.AccrualZhiyaEntity;
import org.jeecgframework.core.common.service.CommonService;

import java.io.Serializable;

public interface AccrualZhiyaServiceI extends CommonService{
	
 	public void delete(AccrualZhiyaEntity entity) throws Exception;
 	
 	public Serializable save(AccrualZhiyaEntity entity) throws Exception;
 	
 	public void saveOrUpdate(AccrualZhiyaEntity entity) throws Exception;
 	
}
