package com.jeecg.fangkuan.service;
import com.jeecg.fangkuan.entity.AccrualFangkuanEntity;
import org.jeecgframework.core.common.service.CommonService;

import java.io.Serializable;

public interface AccrualFangkuanServiceI extends CommonService{
	
 	public void delete(AccrualFangkuanEntity entity) throws Exception;
 	
 	public Serializable save(AccrualFangkuanEntity entity) throws Exception;
 	
 	public void saveOrUpdate(AccrualFangkuanEntity entity) throws Exception;
 	
}
