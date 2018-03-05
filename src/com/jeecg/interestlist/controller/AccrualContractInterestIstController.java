package com.jeecg.interestlist.controller;
import com.jeecg.interestlist.entity.AccrualContractInterestIstEntity;
import com.jeecg.interestlist.service.AccrualContractInterestIstServiceI;
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
 * @Description: 合同利息清单
 * @author onlineGenerator
 * @date 2018-01-25 16:37:43
 * @version V1.0   
 *
 */
@Controller
@RequestMapping("/accrualContractInterestIstController")
public class AccrualContractInterestIstController extends BaseController {
	/**
	 * Logger for this class
	 */
	private static final Logger logger = Logger.getLogger(AccrualContractInterestIstController.class);

	@Autowired
	private AccrualContractInterestIstServiceI accrualContractInterestIstService;
	@Autowired
	private SystemService systemService;
	@Autowired
	private Validator validator;
	


	/**
	 * 合同利息清单列表 页面跳转
	 * 
	 * @return
	 */
	@RequestMapping(params = "list")
	public ModelAndView list(HttpServletRequest request) {
		return new ModelAndView("com/jeecg/interestlist/accrualContractInterestIstList");
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
	public void datagrid(AccrualContractInterestIstEntity accrualContractInterestIst,HttpServletRequest request, HttpServletResponse response, DataGrid dataGrid) {
		CriteriaQuery cq = new CriteriaQuery(AccrualContractInterestIstEntity.class, dataGrid);
		//查询条件组装器
		org.jeecgframework.core.extend.hqlsearch.HqlGenerateUtil.installHql(cq, accrualContractInterestIst, request.getParameterMap());
		try{
		//自定义追加查询条件
		}catch (Exception e) {
			throw new BusinessException(e.getMessage());
		}
		cq.add();
		this.accrualContractInterestIstService.getDataGridReturn(cq, true);
		TagUtil.datagrid(response, dataGrid);
	}
	
	/**
	 * 删除合同利息清单
	 * 
	 * @return
	 */
	@RequestMapping(params = "doDel")
	@ResponseBody
	public AjaxJson doDel(AccrualContractInterestIstEntity accrualContractInterestIst, HttpServletRequest request) {
		String message = null;
		AjaxJson j = new AjaxJson();
		accrualContractInterestIst = systemService.getEntity(AccrualContractInterestIstEntity.class, accrualContractInterestIst.getId());
		message = "合同利息清单删除成功";
		try{
			accrualContractInterestIstService.delete(accrualContractInterestIst);
			systemService.addLog(message, Globals.Log_Type_DEL, Globals.Log_Leavel_INFO);
		}catch(Exception e){
			e.printStackTrace();
			message = "合同利息清单删除失败";
			throw new BusinessException(e.getMessage());
		}
		j.setMsg(message);
		return j;
	}
	
	/**
	 * 批量删除合同利息清单
	 * 
	 * @return
	 */
	 @RequestMapping(params = "doBatchDel")
	@ResponseBody
	public AjaxJson doBatchDel(String ids,HttpServletRequest request){
		String message = null;
		AjaxJson j = new AjaxJson();
		message = "合同利息清单删除成功";
		try{
			for(String id:ids.split(",")){
				AccrualContractInterestIstEntity accrualContractInterestIst = systemService.getEntity(AccrualContractInterestIstEntity.class, 
				id
				);
				accrualContractInterestIstService.delete(accrualContractInterestIst);
				systemService.addLog(message, Globals.Log_Type_DEL, Globals.Log_Leavel_INFO);
			}
		}catch(Exception e){
			e.printStackTrace();
			message = "合同利息清单删除失败";
			throw new BusinessException(e.getMessage());
		}
		j.setMsg(message);
		return j;
	}


	/**
	 * 添加合同利息清单
	 * 
	 * @param ids
	 * @return
	 */
	@RequestMapping(params = "doAdd")
	@ResponseBody
	public AjaxJson doAdd(AccrualContractInterestIstEntity accrualContractInterestIst, HttpServletRequest request) {
		String message = null;
		AjaxJson j = new AjaxJson();
		message = "合同利息清单添加成功";
		try{
			accrualContractInterestIstService.save(accrualContractInterestIst);
			systemService.addLog(message, Globals.Log_Type_INSERT, Globals.Log_Leavel_INFO);
		}catch(Exception e){
			e.printStackTrace();
			message = "合同利息清单添加失败";
			throw new BusinessException(e.getMessage());
		}
		j.setMsg(message);
		return j;
	}
	
	/**
	 * 更新合同利息清单
	 * 
	 * @param ids
	 * @return
	 */
	@RequestMapping(params = "doUpdate")
	@ResponseBody
	public AjaxJson doUpdate(AccrualContractInterestIstEntity accrualContractInterestIst, HttpServletRequest request) {
		String message = null;
		AjaxJson j = new AjaxJson();
		message = "合同利息清单更新成功";
		AccrualContractInterestIstEntity t = accrualContractInterestIstService.get(AccrualContractInterestIstEntity.class, accrualContractInterestIst.getId());
		try {
			MyBeanUtils.copyBeanNotNull2Bean(accrualContractInterestIst, t);
			accrualContractInterestIstService.saveOrUpdate(t);
			systemService.addLog(message, Globals.Log_Type_UPDATE, Globals.Log_Leavel_INFO);
		} catch (Exception e) {
			e.printStackTrace();
			message = "合同利息清单更新失败";
			throw new BusinessException(e.getMessage());
		}
		j.setMsg(message);
		return j;
	}
	

	/**
	 * 合同利息清单新增页面跳转
	 * 
	 * @return
	 */
	@RequestMapping(params = "goAdd")
	public ModelAndView goAdd(AccrualContractInterestIstEntity accrualContractInterestIst, HttpServletRequest req) {
		if (StringUtil.isNotEmpty(accrualContractInterestIst.getId())) {
			accrualContractInterestIst = accrualContractInterestIstService.getEntity(AccrualContractInterestIstEntity.class, accrualContractInterestIst.getId());
			req.setAttribute("accrualContractInterestIstPage", accrualContractInterestIst);
		}
		return new ModelAndView("com/jeecg/interestlist/accrualContractInterestIst-add");
	}
	/**
	 * 合同利息清单编辑页面跳转
	 * 
	 * @return
	 */
	@RequestMapping(params = "goUpdate")
	public ModelAndView goUpdate(AccrualContractInterestIstEntity accrualContractInterestIst, HttpServletRequest req) {
		if (StringUtil.isNotEmpty(accrualContractInterestIst.getId())) {
			accrualContractInterestIst = accrualContractInterestIstService.getEntity(AccrualContractInterestIstEntity.class, accrualContractInterestIst.getId());
			req.setAttribute("accrualContractInterestIstPage", accrualContractInterestIst);
		}
		return new ModelAndView("com/jeecg/interestlist/accrualContractInterestIst-update");
	}
	
	/**
	 * 导入功能跳转
	 * 
	 * @return
	 */
	@RequestMapping(params = "upload")
	public ModelAndView upload(HttpServletRequest req) {
		req.setAttribute("controller_name","accrualContractInterestIstController");
		return new ModelAndView("common/upload/pub_excel_upload");
	}
	
	/**
	 * 导出excel
	 * 
	 * @param request
	 * @param response
	 */
	@RequestMapping(params = "exportXls")
	public String exportXls(AccrualContractInterestIstEntity accrualContractInterestIst,HttpServletRequest request,HttpServletResponse response
			, DataGrid dataGrid,ModelMap modelMap) {
		CriteriaQuery cq = new CriteriaQuery(AccrualContractInterestIstEntity.class, dataGrid);
		org.jeecgframework.core.extend.hqlsearch.HqlGenerateUtil.installHql(cq, accrualContractInterestIst, request.getParameterMap());
		List<AccrualContractInterestIstEntity> accrualContractInterestIsts = this.accrualContractInterestIstService.getListByCriteriaQuery(cq,false);
		modelMap.put(NormalExcelConstants.FILE_NAME,"合同利息清单");
		modelMap.put(NormalExcelConstants.CLASS,AccrualContractInterestIstEntity.class);
		modelMap.put(NormalExcelConstants.PARAMS,new ExportParams("合同利息清单列表", "导出人:"+ResourceUtil.getSessionUser().getRealName(),
			"导出信息"));
		modelMap.put(NormalExcelConstants.DATA_LIST,accrualContractInterestIsts);
		return NormalExcelConstants.JEECG_EXCEL_VIEW;
	}
	/**
	 * 导出excel 使模板
	 * 
	 * @param request
	 * @param response
	 */
	@RequestMapping(params = "exportXlsByT")
	public String exportXlsByT(AccrualContractInterestIstEntity accrualContractInterestIst,HttpServletRequest request,HttpServletResponse response
			, DataGrid dataGrid,ModelMap modelMap) {
    	modelMap.put(NormalExcelConstants.FILE_NAME,"合同利息清单");
    	modelMap.put(NormalExcelConstants.CLASS,AccrualContractInterestIstEntity.class);
    	modelMap.put(NormalExcelConstants.PARAMS,new ExportParams("合同利息清单列表", "导出人:"+ResourceUtil.getSessionUser().getRealName(),
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
				List<AccrualContractInterestIstEntity> listAccrualContractInterestIstEntitys = ExcelImportUtil.importExcel(file.getInputStream(),AccrualContractInterestIstEntity.class,params);
				for (AccrualContractInterestIstEntity accrualContractInterestIst : listAccrualContractInterestIstEntitys) {
					accrualContractInterestIstService.save(accrualContractInterestIst);
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
	public List<AccrualContractInterestIstEntity> list() {
		List<AccrualContractInterestIstEntity> listAccrualContractInterestIsts=accrualContractInterestIstService.getList(AccrualContractInterestIstEntity.class);
		return listAccrualContractInterestIsts;
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<?> get(@PathVariable("id") String id) {
		AccrualContractInterestIstEntity task = accrualContractInterestIstService.get(AccrualContractInterestIstEntity.class, id);
		if (task == null) {
			return new ResponseEntity(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity(task, HttpStatus.OK);
	}

	@RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public ResponseEntity<?> create(@RequestBody AccrualContractInterestIstEntity accrualContractInterestIst, UriComponentsBuilder uriBuilder) {
		//调用JSR303 Bean Validator进行校验，如果出错返回含400错误码及json格式的错误信息.
		Set<ConstraintViolation<AccrualContractInterestIstEntity>> failures = validator.validate(accrualContractInterestIst);
		if (!failures.isEmpty()) {
			return new ResponseEntity(BeanValidators.extractPropertyAndMessage(failures), HttpStatus.BAD_REQUEST);
		}

		//保存
		try{
			accrualContractInterestIstService.save(accrualContractInterestIst);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity(HttpStatus.NO_CONTENT);
		}
		//按照Restful风格约定，创建指向新任务的url, 也可以直接返回id或对象.
		String id = accrualContractInterestIst.getId();
		URI uri = uriBuilder.path("/rest/accrualContractInterestIstController/" + id).build().toUri();
		HttpHeaders headers = new HttpHeaders();
		headers.setLocation(uri);

		return new ResponseEntity(headers, HttpStatus.CREATED);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> update(@RequestBody AccrualContractInterestIstEntity accrualContractInterestIst) {
		//调用JSR303 Bean Validator进行校验，如果出错返回含400错误码及json格式的错误信息.
		Set<ConstraintViolation<AccrualContractInterestIstEntity>> failures = validator.validate(accrualContractInterestIst);
		if (!failures.isEmpty()) {
			return new ResponseEntity(BeanValidators.extractPropertyAndMessage(failures), HttpStatus.BAD_REQUEST);
		}

		//保存
		try{
			accrualContractInterestIstService.saveOrUpdate(accrualContractInterestIst);
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
		accrualContractInterestIstService.deleteEntityById(AccrualContractInterestIstEntity.class, id);
	}
}
