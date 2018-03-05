package com.jeecg.bankloancontract.service;
import com.jeecg.bankloancontract.entity.AccrualNewbankContractlistEntity;
import org.jeecgframework.core.common.service.CommonService;

import java.io.Serializable;

public interface AccrualNewbankContractlistServiceI extends CommonService{
	
 	public void delete(AccrualNewbankContractlistEntity entity) throws Exception;
 	
 	public Serializable save(AccrualNewbankContractlistEntity entity) throws Exception;
 	
 	public void saveOrUpdate(AccrualNewbankContractlistEntity entity) throws Exception;
 	
}
