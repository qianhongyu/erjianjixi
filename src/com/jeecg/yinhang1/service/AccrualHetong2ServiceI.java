package com.jeecg.yinhang1.service;
import com.jeecg.yinhang1.entity.AccrualHetong2Entity;
import org.jeecgframework.core.common.service.CommonService;

import java.io.Serializable;

public interface AccrualHetong2ServiceI extends CommonService{
	
 	public void delete(AccrualHetong2Entity entity) throws Exception;
 	
 	public Serializable save(AccrualHetong2Entity entity) throws Exception;
 	
 	public void saveOrUpdate(AccrualHetong2Entity entity) throws Exception;
 	
}
