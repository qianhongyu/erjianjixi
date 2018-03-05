package com.jeecg.black.service;
import com.jeecg.black.entity.TsBlackListEntity;
import org.jeecgframework.core.common.service.CommonService;

import java.io.Serializable;

public interface TsBlackListServiceI extends CommonService{
	
 	public void delete(TsBlackListEntity entity) throws Exception;
 	
 	public Serializable save(TsBlackListEntity entity) throws Exception;
 	
 	public void saveOrUpdate(TsBlackListEntity entity) throws Exception;
 	
}
