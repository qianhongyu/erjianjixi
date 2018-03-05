package com.jeecg.info3.service;
import com.jeecg.info3.entity.AccrualInfo3Entity;
import org.jeecgframework.core.common.service.CommonService;

import java.io.Serializable;

public interface AccrualInfo3ServiceI extends CommonService{
	
 	public void delete(AccrualInfo3Entity entity) throws Exception;
 	
 	public Serializable save(AccrualInfo3Entity entity) throws Exception;
 	
 	public void saveOrUpdate(AccrualInfo3Entity entity) throws Exception;
 	
}
