package com.jeecg.lxhj.service;
import com.jeecg.lxhj.entity.AccrualLxhjEntity;
import org.jeecgframework.core.common.service.CommonService;

import java.io.Serializable;

public interface AccrualLxhjServiceI extends CommonService{
	
 	public void delete(AccrualLxhjEntity entity) throws Exception;
 	
 	public Serializable save(AccrualLxhjEntity entity) throws Exception;
 	
 	public void saveOrUpdate(AccrualLxhjEntity entity) throws Exception;
 	
}
