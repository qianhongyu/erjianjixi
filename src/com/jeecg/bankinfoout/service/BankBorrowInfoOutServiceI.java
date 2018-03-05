package com.jeecg.bankinfoout.service;
import com.jeecg.bankinfoout.entity.BankBorrowInfoOutEntity;
import org.jeecgframework.core.common.service.CommonService;

import java.io.Serializable;

public interface BankBorrowInfoOutServiceI extends CommonService{
	
 	public void delete(BankBorrowInfoOutEntity entity) throws Exception;
 	
 	public Serializable save(BankBorrowInfoOutEntity entity) throws Exception;
 	
 	public void saveOrUpdate(BankBorrowInfoOutEntity entity) throws Exception;
 	
}
