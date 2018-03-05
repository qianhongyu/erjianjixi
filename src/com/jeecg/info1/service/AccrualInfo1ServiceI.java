package com.jeecg.info1.service;
import com.jeecg.info1.entity.AccrualInfo1Entity;
import org.jeecgframework.core.common.service.CommonService;

import java.io.Serializable;

public interface AccrualInfo1ServiceI extends CommonService{
	
 	public void delete(AccrualInfo1Entity entity) throws Exception;
 	
 	public Serializable save(AccrualInfo1Entity entity) throws Exception;
 	
 	public void saveOrUpdate(AccrualInfo1Entity entity) throws Exception;
 	
}
