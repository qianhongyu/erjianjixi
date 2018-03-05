package com.jeecg.bankinfo.service;
import com.jeecg.bankinfo.entity.BankBorrowInfoInEntity;
import org.jeecgframework.core.common.service.CommonService;

import java.io.Serializable;

public interface BankBorrowInfoInServiceI extends CommonService{
	
 	public void delete(BankBorrowInfoInEntity entity) throws Exception;
 	
 	public Serializable save(BankBorrowInfoInEntity entity) throws Exception;
 	
 	public void saveOrUpdate(BankBorrowInfoInEntity entity) throws Exception;
 	
}
