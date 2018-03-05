package com.jeecg.interestmath.service;
import com.jeecg.interestmath.entity.AccrualInterestCalculationEntity;
import org.jeecgframework.core.common.service.CommonService;

import java.io.Serializable;

public interface AccrualInterestCalculationServiceI extends CommonService{
	
 	public void delete(AccrualInterestCalculationEntity entity) throws Exception;
 	
 	public Serializable save(AccrualInterestCalculationEntity entity) throws Exception;
 	
 	public void saveOrUpdate(AccrualInterestCalculationEntity entity) throws Exception;
 	
}
