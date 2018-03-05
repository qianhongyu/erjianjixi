package com.jeecg.loansubjectlist.service;
import com.jeecg.loansubjectlist.entity.AccrualLoanSubjectListEntity;
import org.jeecgframework.core.common.service.CommonService;

import java.io.Serializable;

public interface AccrualLoanSubjectListServiceI extends CommonService{
	
 	public void delete(AccrualLoanSubjectListEntity entity) throws Exception;
 	
 	public Serializable save(AccrualLoanSubjectListEntity entity) throws Exception;
 	
 	public void saveOrUpdate(AccrualLoanSubjectListEntity entity) throws Exception;
 	
}
