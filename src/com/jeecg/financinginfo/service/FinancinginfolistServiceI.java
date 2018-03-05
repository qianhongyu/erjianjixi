package com.jeecg.financinginfo.service;
import com.jeecg.financinginfo.entity.FinancinginfolistEntity;
import org.jeecgframework.core.common.service.CommonService;

import java.io.Serializable;

public interface FinancinginfolistServiceI extends CommonService{
	
 	public void delete(FinancinginfolistEntity entity) throws Exception;
 	
 	public Serializable save(FinancinginfolistEntity entity) throws Exception;
 	
 	public void saveOrUpdate(FinancinginfolistEntity entity) throws Exception;
 	
}
