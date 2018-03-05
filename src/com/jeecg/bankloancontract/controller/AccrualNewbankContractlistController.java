package com.jeecg.bankloancontract.controller;
import com.jeecg.bankloancontract.entity.AccrualNewbankContractlistEntity;
import com.jeecg.bankloancontract.service.AccrualNewbankContractlistServiceI;
import java.util.ArrayList;
import java.util.List;
import java.text.SimpleDateFormat;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import org.jeecgframework.core.common.controller.BaseController;
import org.jeecgframework.core.common.exception.BusinessException;
import org.jeecgframework.core.common.hibernate.qbc.CriteriaQuery;
import org.jeecgframework.core.common.model.common.TreeChildCount;
import org.jeecgframework.core.common.model.json.AjaxJson;
import org.jeecgframework.core.common.model.json.DataGrid;
import org.jeecgframework.core.constant.Globals;
import org.jeecgframework.core.util.StringUtil;
import org.jeecgframework.tag.core.easyui.TagUtil;
import org.jeecgframework.web.system.pojo.base.TSDepart;
import org.jeecgframework.web.system.service.SystemService;
import org.jeecgframework.core.util.MyBeanUtils;

import java.io.OutputStream;
import org.jeecgframework.core.util.BrowserUtils;
import org.jeecgframework.poi.excel.ExcelExportUtil;
import org.jeecgframework.poi.excel.ExcelImportUtil;
import org.jeecgframework.poi.excel.entity.ExportParams;
import org.jeecgframework.poi.excel.entity.ImportParams;
import org.jeecgframework.poi.excel.entity.TemplateExportParams;
import org.jeecgframework.poi.excel.entity.vo.NormalExcelConstants;
import org.jeecgframework.poi.excel.entity.vo.TemplateExcelConstants;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.jeecgframework.core.util.ResourceUtil;
import java.io.IOException;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import java.util.Map;
import java.util.HashMap;
import org.jeecgframework.core.util.ExceptionUtil;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.jeecgframework.core.beanvalidator.BeanValidators;
import java.util.Set;
import javax.validation.ConstraintViolation;
import javax.validation.Validator;
import java.net.URI;
import org.springframework.http.MediaType;
import org.springframework.web.util.UriComponentsBuilder;

/**   
 * @Title: Controller  
 * @Description: 银行借款合同
 * @author onlineGenerator
 * @date 2018-01-23 15:39:23
 * @version V1.0   
 *
 */
@Controller
@RequestMapping("/accrualNewbankContractlistController")
public class AccrualNewbankContractlistController extends BaseController {
	/**
	 * Logger for this class
	 */
	private static final Logger logger = Logger.getLogger(AccrualNewbankContractlistController.class);

	@Autowired
	private AccrualNewbankContractlistServiceI accrualNewbankContractlistService;
	@Autowired
	private SystemService systemService;
	@Autowired
	private Validator validator;
	


	/**
	 * 银行借款合同列表 页面跳转
	 * 
	 * @return
	 */
	@RequestMapping(params = "list")
	public ModelAndView list(HttpServletRequest request) {
		return new ModelAndView("com/jeecg/bankloancontract/accrualNewbankContractlistList");
	}

	/**
	 * easyui AJAX请求数据
	 * 
	 * @param request
	 * @param response
	 * @param dataGrid
	 * @param user
	 */

	@RequestMapping(params = "datagrid")
	public void datagrid(AccrualNewbankContractlistEntity accrualNewbankContractlist,HttpServletRequest request, HttpServletResponse response, DataGrid dataGrid) {
		CriteriaQuery cq = new CriteriaQuery(AccrualNewbankContractlistEntity.class, dataGrid);
		//查询条件组装器
		org.jeecgframework.core.extend.hqlsearch.HqlGenerateUtil.installHql(cq, accrualNewbankContractlist, request.getParameterMap());
		try{
		//自定义追加查询条件
		}catch (Exception e) {
			throw new BusinessException(e.getMessage());
		}
		cq.add();
		this.accrualNewbankContractlistService.getDataGridReturn(cq, true);
		TagUtil.datagrid(response, dataGrid);
	}
	
	/**
	 * 删除银行借款合同
	 * 
	 * @return
	 */
	@RequestMapping(params = "doDel")
	@ResponseBody
	public AjaxJson doDel(AccrualNewbankContractlistEntity accrualNewbankContractlist, HttpServletRequest request) {
		String message = null;
		AjaxJson j = new AjaxJson();
		accrualNewbankContractlist = systemService.getEntity(AccrualNewbankContractlistEntity.class, accrualNewbankContractlist.getId());
		message = "银行借款合同删除成功";
		try{
			accrualNewbankContractlistService.delete(accrualNewbankContractlist);
			systemService.addLog(message, Globals.Log_Type_DEL, Globals.Log_Leavel_INFO);
		}catch(Exception e){
			e.printStackTrace();
			message = "银行借款合同删除失败";
			throw new BusinessException(e.getMessage());
		}
		j.setMsg(message);
		return j;
	}
	
	/**
	 * 批量删除银行借款合同
	 * 
	 * @return
	 */
	 @RequestMapping(params = "doBatchDel")
	@ResponseBody
	public AjaxJson doBatchDel(String ids,HttpServletRequest request){
		String message = null;
		AjaxJson j = new AjaxJson();
		message = "银行借款合同删除成功";
		try{
			for(String id:ids.split(",")){
				AccrualNewbankContractlistEntity accrualNewbankContractlist = systemService.getEntity(AccrualNewbankContractlistEntity.class, 
				id
				);
				accrualNewbankContractlistService.delete(accrualNewbankContractlist);
				systemService.addLog(message, Globals.Log_Type_DEL, Globals.Log_Leavel_INFO);
			}
		}catch(Exception e){
			e.printStackTrace();
			message = "银行借款合同删除失败";
			throw new BusinessException(e.getMessage());
		}
		j.setMsg(message);
		return j;
	}


	/**
	 * 添加银行借款合同
	 * 
	 * @param ids
	 * @return
	 */
	@RequestMapping(params = "doAdd")
	@ResponseBody
	public AjaxJson doAdd(AccrualNewbankContractlistEntity accrualNewbankContractlist, HttpServletRequest request) {
		String message = null;
		AjaxJson j = new AjaxJson();
		message = "银行借款合同添加成功";
		try{
			accrualNewbankContractlistService.save(accrualNewbankContractlist);
			systemService.addLog(message, Globals.Log_Type_INSERT, Globals.Log_Leavel_INFO);
		}catch(Exception e){
			e.printStackTrace();
			message = "银行借款合同添加失败";
			throw new BusinessException(e.getMessage());
		}
		j.setMsg(message);
		return j;
	}
	
	/**
	 * 更新银行借款合同
	 * 
	 * @param ids
	 * @return
	 */
	@RequestMapping(params = "doUpdate")
	@ResponseBody
	public AjaxJson doUpdate(AccrualNewbankContractlistEntity accrualNewbankContractlist, HttpServletRequest request) {
		String message = null;
		AjaxJson j = new AjaxJson();
		message = "银行借款合同更新成功";
		AccrualNewbankContractlistEntity t = accrualNewbankContractlistService.get(AccrualNewbankContractlistEntity.class, accrualNewbankContractlist.getId());
		try {
			MyBeanUtils.copyBeanNotNull2Bean(accrualNewbankContractlist, t);
			accrualNewbankContractlistService.saveOrUpdate(t);
			systemService.addLog(message, Globals.Log_Type_UPDATE, Globals.Log_Leavel_INFO);
		} catch (Exception e) {
			e.printStackTrace();
			message = "银行借款合同更新失败";
			throw new BusinessException(e.getMessage());
		}
		j.setMsg(message);
		return j;
	}
	
	/**
	 * 更新银行借款合同
	 * 
	 * @param ids
	 * @return
	 */
	@RequestMapping(params = "doSearch")
	@ResponseBody
	public AjaxJson doSearch(AccrualNewbankContractlistEntity accrualNewbankContractlist, HttpServletRequest request) {
		String message = null;
		AjaxJson j = new AjaxJson();
		message = "银行借款合同更新成功";
		AccrualNewbankContractlistEntity t = accrualNewbankContractlistService.get(AccrualNewbankContractlistEntity.class, accrualNewbankContractlist.getId());
		try {
			MyBeanUtils.copyBeanNotNull2Bean(accrualNewbankContractlist, t);
			accrualNewbankContractlistService.saveOrUpdate(t);
			systemService.addLog(message, Globals.Log_Type_UPDATE, Globals.Log_Leavel_INFO);
		} catch (Exception e) {
			e.printStackTrace();
			message = "银行借款合同更新失败";
			throw new BusinessException(e.getMessage());
		}
		j.setMsg(message);
		return j;
	}
	

	/**
	 * 银行借款合同新增页面跳转
	 * 
	 * @return
	 */
	@RequestMapping(params = "goAdd")
	public ModelAndView goAdd(AccrualNewbankContractlistEntity accrualNewbankContractlist, HttpServletRequest req) {
		if (StringUtil.isNotEmpty(accrualNewbankContractlist.getId())) {
			accrualNewbankContractlist = accrualNewbankContractlistService.getEntity(AccrualNewbankContractlistEntity.class, accrualNewbankContractlist.getId());
			req.setAttribute("accrualNewbankContractlistPage", accrualNewbankContractlist);
		}
		return new ModelAndView("com/jeecg/bankloancontract/accrualNewbankContractlist-add");
	}
	/**
	 * 银行借款合同编辑页面跳转
	 * 
	 * @return
	 */
	@RequestMapping(params = "goUpdate")
	public ModelAndView goUpdate(AccrualNewbankContractlistEntity accrualNewbankContractlist, HttpServletRequest req) {
		if (StringUtil.isNotEmpty(accrualNewbankContractlist.getId())) {
			accrualNewbankContractlist = accrualNewbankContractlistService.getEntity(AccrualNewbankContractlistEntity.class, accrualNewbankContractlist.getId());
			req.setAttribute("accrualNewbankContractlistPage", accrualNewbankContractlist);
		}
		return new ModelAndView("com/jeecg/bankloancontract/accrualNewbankContractlist-update");
	}
	
	/**
	 * 银行借款合同查看页面跳转
	 * 
	 * @return
	 */
	@RequestMapping(params = "goSearch")
	public ModelAndView goSearch(AccrualNewbankContractlistEntity accrualNewbankContractlist, HttpServletRequest req) {
		if (StringUtil.isNotEmpty(accrualNewbankContractlist.getId())) {
			accrualNewbankContractlist = accrualNewbankContractlistService.getEntity(AccrualNewbankContractlistEntity.class, accrualNewbankContractlist.getId());
			req.setAttribute("accrualNewbankContractlistPage", accrualNewbankContractlist);
		}
		return new ModelAndView("com/jeecg/bankloancontract/accrualNewbankContractlist-search");
	}
	
	/**
	 * 导入功能跳转
	 * 
	 * @return
	 */
	@RequestMapping(params = "upload")
	public ModelAndView upload(HttpServletRequest req) {
		req.setAttribute("controller_name","accrualNewbankContractlistController");
		return new ModelAndView("common/upload/pub_excel_upload");
	}
	
	/**
	 * 导出excel
	 * 
	 * @param request
	 * @param response
	 */
	@RequestMapping(params = "exportXls")
	public String exportXls(AccrualNewbankContractlistEntity accrualNewbankContractlist,HttpServletRequest request,HttpServletResponse response
			, DataGrid dataGrid,ModelMap modelMap) {
		CriteriaQuery cq = new CriteriaQuery(AccrualNewbankContractlistEntity.class, dataGrid);
		org.jeecgframework.core.extend.hqlsearch.HqlGenerateUtil.installHql(cq, accrualNewbankContractlist, request.getParameterMap());
		List<AccrualNewbankContractlistEntity> accrualNewbankContractlists = this.accrualNewbankContractlistService.getListByCriteriaQuery(cq,false);
		modelMap.put(NormalExcelConstants.FILE_NAME,"银行借款合同");
		modelMap.put(NormalExcelConstants.CLASS,AccrualNewbankContractlistEntity.class);
		modelMap.put(NormalExcelConstants.PARAMS,new ExportParams("银行借款合同列表", "导出人:"+ResourceUtil.getSessionUser().getRealName(),
			"导出信息"));
		modelMap.put(NormalExcelConstants.DATA_LIST,accrualNewbankContractlists);
		return NormalExcelConstants.JEECG_EXCEL_VIEW;
	}
	/**
	 * 导出excel 使模板
	 * 
	 * @param request
	 * @param response
	 */
	@RequestMapping(params = "exportXlsByT")
	public String exportXlsByT(AccrualNewbankContractlistEntity accrualNewbankContractlist,HttpServletRequest request,HttpServletResponse response
			, DataGrid dataGrid,ModelMap modelMap) {
    	modelMap.put(NormalExcelConstants.FILE_NAME,"银行借款合同");
    	modelMap.put(NormalExcelConstants.CLASS,AccrualNewbankContractlistEntity.class);
    	modelMap.put(NormalExcelConstants.PARAMS,new ExportParams("银行借款合同列表", "导出人:"+ResourceUtil.getSessionUser().getRealName(),
    	"导出信息"));
    	modelMap.put(NormalExcelConstants.DATA_LIST,new ArrayList());
    	return NormalExcelConstants.JEECG_EXCEL_VIEW;
	}
	
	@SuppressWarnings("unchecked")
	@RequestMapping(params = "importExcel", method = RequestMethod.POST)
	@ResponseBody
	public AjaxJson importExcel(HttpServletRequest request, HttpServletResponse response) {
		AjaxJson j = new AjaxJson();
		
		MultipartHttpServletRequest multipartRequest = (MultipartHttpServletRequest) request;
		Map<String, MultipartFile> fileMap = multipartRequest.getFileMap();
		for (Map.Entry<String, MultipartFile> entity : fileMap.entrySet()) {
			MultipartFile file = entity.getValue();// 获取上传文件对象
			ImportParams params = new ImportParams();
			params.setTitleRows(2);
			params.setHeadRows(1);
			params.setNeedSave(true);
			try {
				List<AccrualNewbankContractlistEntity> listAccrualNewbankContractlistEntitys = ExcelImportUtil.importExcel(file.getInputStream(),AccrualNewbankContractlistEntity.class,params);
				for (AccrualNewbankContractlistEntity accrualNewbankContractlist : listAccrualNewbankContractlistEntitys) {
					accrualNewbankContractlistService.save(accrualNewbankContractlist);
				}
				j.setMsg("文件导入成功！");
			} catch (Exception e) {
				j.setMsg("文件导入失败！");
				logger.error(ExceptionUtil.getExceptionMessage(e));
			}finally{
				try {
					file.getInputStream().close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return j;
	}
	
	@RequestMapping(method = RequestMethod.GET)
	@ResponseBody
	public List<AccrualNewbankContractlistEntity> list() {
		List<AccrualNewbankContractlistEntity> listAccrualNewbankContractlists=accrualNewbankContractlistService.getList(AccrualNewbankContractlistEntity.class);
		return listAccrualNewbankContractlists;
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<?> get(@PathVariable("id") String id) {
		AccrualNewbankContractlistEntity task = accrualNewbankContractlistService.get(AccrualNewbankContractlistEntity.class, id);
		if (task == null) {
			return new ResponseEntity(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity(task, HttpStatus.OK);
	}

	@RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public ResponseEntity<?> create(@RequestBody AccrualNewbankContractlistEntity accrualNewbankContractlist, UriComponentsBuilder uriBuilder) {
		//调用JSR303 Bean Validator进行校验，如果出错返回含400错误码及json格式的错误信息.
		Set<ConstraintViolation<AccrualNewbankContractlistEntity>> failures = validator.validate(accrualNewbankContractlist);
		if (!failures.isEmpty()) {
			return new ResponseEntity(BeanValidators.extractPropertyAndMessage(failures), HttpStatus.BAD_REQUEST);
		}

		//保存
		try{
			accrualNewbankContractlistService.save(accrualNewbankContractlist);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity(HttpStatus.NO_CONTENT);
		}
		//按照Restful风格约定，创建指向新任务的url, 也可以直接返回id或对象.
		String id = accrualNewbankContractlist.getId();
		URI uri = uriBuilder.path("/rest/accrualNewbankContractlistController/" + id).build().toUri();
		HttpHeaders headers = new HttpHeaders();
		headers.setLocation(uri);

		return new ResponseEntity(headers, HttpStatus.CREATED);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> update(@RequestBody AccrualNewbankContractlistEntity accrualNewbankContractlist) {
		//调用JSR303 Bean Validator进行校验，如果出错返回含400错误码及json格式的错误信息.
		Set<ConstraintViolation<AccrualNewbankContractlistEntity>> failures = validator.validate(accrualNewbankContractlist);
		if (!failures.isEmpty()) {
			return new ResponseEntity(BeanValidators.extractPropertyAndMessage(failures), HttpStatus.BAD_REQUEST);
		}

		//保存
		try{
			accrualNewbankContractlistService.saveOrUpdate(accrualNewbankContractlist);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity(HttpStatus.NO_CONTENT);
		}

		//按Restful约定，返回204状态码, 无内容. 也可以返回200状态码.
		return new ResponseEntity(HttpStatus.NO_CONTENT);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable("id") String id) {
		accrualNewbankContractlistService.deleteEntityById(AccrualNewbankContractlistEntity.class, id);
	}
}