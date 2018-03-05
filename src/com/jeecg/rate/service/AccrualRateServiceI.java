package com.jeecg.rate.service;
import com.jeecg.rate.entity.AccrualRateEntity;
import org.jeecgframework.core.common.service.CommonService;

import java.io.Serializable;

public interface AccrualRateServiceI extends CommonService{
	
 	public void delete(AccrualRateEntity entity) throws Exception;
 	
 	public Serializable save(AccrualRateEntity entity) throws Exception;
 	
 	public void saveOrUpdate(AccrualRateEntity entity) throws Exception;
 	
}
