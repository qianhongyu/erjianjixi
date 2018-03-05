package com.jeecg.jiexi.service;
import com.jeecg.jiexi.entity.AcccrualJiexiEntity;
import org.jeecgframework.core.common.service.CommonService;

import java.io.Serializable;

public interface AcccrualJiexiServiceI extends CommonService{
	
 	public void delete(AcccrualJiexiEntity entity) throws Exception;
 	
 	public Serializable save(AcccrualJiexiEntity entity) throws Exception;
 	
 	public void saveOrUpdate(AcccrualJiexiEntity entity) throws Exception;
 	
}
