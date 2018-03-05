package com.jeecg.interestcalculation.service;
import com.jeecg.interestcalculation.entity.InterestCalculationtlistEntity;
import org.jeecgframework.core.common.service.CommonService;

import java.io.Serializable;

public interface InterestCalculationtlistServiceI extends CommonService{
	
 	public void delete(InterestCalculationtlistEntity entity) throws Exception;
 	
 	public Serializable save(InterestCalculationtlistEntity entity) throws Exception;
 	
 	public void saveOrUpdate(InterestCalculationtlistEntity entity) throws Exception;
 	
}
