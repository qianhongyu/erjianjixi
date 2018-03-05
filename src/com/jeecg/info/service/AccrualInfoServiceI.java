package com.jeecg.info.service;
import com.jeecg.info.entity.AccrualInfoEntity;
import org.jeecgframework.core.common.service.CommonService;

import java.io.Serializable;

public interface AccrualInfoServiceI extends CommonService{
	
 	public void delete(AccrualInfoEntity entity) throws Exception;
 	
 	public Serializable save(AccrualInfoEntity entity) throws Exception;
 	
 	public void saveOrUpdate(AccrualInfoEntity entity) throws Exception;
 	
}
