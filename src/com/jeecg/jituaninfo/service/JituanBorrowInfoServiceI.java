package com.jeecg.jituaninfo.service;
import com.jeecg.jituaninfo.entity.JituanBorrowInfoEntity;
import org.jeecgframework.core.common.service.CommonService;

import java.io.Serializable;

public interface JituanBorrowInfoServiceI extends CommonService{
	
 	public void delete(JituanBorrowInfoEntity entity) throws Exception;
 	
 	public Serializable save(JituanBorrowInfoEntity entity) throws Exception;
 	
 	public void saveOrUpdate(JituanBorrowInfoEntity entity) throws Exception;
 	
}
