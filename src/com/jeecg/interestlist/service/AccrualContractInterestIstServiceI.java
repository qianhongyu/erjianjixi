package com.jeecg.interestlist.service;
import com.jeecg.interestlist.entity.AccrualContractInterestIstEntity;
import org.jeecgframework.core.common.service.CommonService;

import java.io.Serializable;

public interface AccrualContractInterestIstServiceI extends CommonService{
	
 	public void delete(AccrualContractInterestIstEntity entity) throws Exception;
 	
 	public Serializable save(AccrualContractInterestIstEntity entity) throws Exception;
 	
 	public void saveOrUpdate(AccrualContractInterestIstEntity entity) throws Exception;
 	
}
