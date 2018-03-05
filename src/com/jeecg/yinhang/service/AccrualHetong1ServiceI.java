package com.jeecg.yinhang.service;
import com.jeecg.yinhang.entity.AccrualHetong1Entity;
import org.jeecgframework.core.common.service.CommonService;

import java.io.Serializable;

public interface AccrualHetong1ServiceI extends CommonService{
	
 	public void delete(AccrualHetong1Entity entity) throws Exception;
 	
 	public Serializable save(AccrualHetong1Entity entity) throws Exception;
 	
 	public void saveOrUpdate(AccrualHetong1Entity entity) throws Exception;
 	
}
