package com.jeecg.jiekuan.service;
import com.jeecg.jiekuan.entity.AccrualHetong3Entity;
import org.jeecgframework.core.common.service.CommonService;

import java.io.Serializable;

public interface AccrualHetong3ServiceI extends CommonService{
	
 	public void delete(AccrualHetong3Entity entity) throws Exception;
 	
 	public Serializable save(AccrualHetong3Entity entity) throws Exception;
 	
 	public void saveOrUpdate(AccrualHetong3Entity entity) throws Exception;
 	
}
