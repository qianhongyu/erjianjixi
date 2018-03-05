package com.jeecg.guarantee.service;
import com.jeecg.guarantee.entity.AccrualGuaranteeEntity;
import org.jeecgframework.core.common.service.CommonService;

import java.io.Serializable;

public interface AccrualGuaranteeServiceI extends CommonService{
	
 	public void delete(AccrualGuaranteeEntity entity) throws Exception;
 	
 	public Serializable save(AccrualGuaranteeEntity entity) throws Exception;
 	
 	public void saveOrUpdate(AccrualGuaranteeEntity entity) throws Exception;
 	
}
