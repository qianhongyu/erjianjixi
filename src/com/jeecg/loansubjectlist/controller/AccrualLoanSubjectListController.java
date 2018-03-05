package com.jeecg.loansubjectlist.controller;

import com.jeecg.loansubjectlist.entity.AccrualLoanSubjectListEntity;
import com.jeecg.loansubjectlist.service.AccrualLoanSubjectListServiceI;

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
import org.hibernate.criterion.Restrictions;
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
import org.springframework.web.bind.annotation.RequestParam;
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
 * @Description: 借款主体列表
 * @author onlineGenerator
 * @date 2018-02-28 10:12:15
 * @version V1.0
 * 
 */
@Controller
@RequestMapping("/accrualLoanSubjectListController")
public class AccrualLoanSubjectListController extends BaseController {
	/**
	 * Logger for this class
	 */
	private static final Logger logger = Logger
			.getLogger(AccrualLoanSubjectListController.class);

	@Autowired
	private AccrualLoanSubjectListServiceI accrualLoanSubjectListService;
	@Autowired
	private SystemService systemService;
	@Autowired
	private Validator validator;

	/**
	 * 借款主体列表列表 页面跳转
	 * 
	 * @return
	 */
	@RequestMapping(params = "list")
	public ModelAndView list(HttpServletRequest request,
			@RequestParam(value = "id") String id) {
		id = id.substring(0, 1);
		if ("1".equals(id)) {
			return new ModelAndView(
					"com/jeecg/loansubjectlist/accrualLoanSubjectListList");
		} else if ("2".equals(id)) {
			return new ModelAndView(
					"com/jeecg/loansubjectlist/accrualLoanSubjectListList2");
		} else if ("3".equals(id)) {
			return new ModelAndView(
					"com/jeecg/loansubjectlist/accrualLoanSubjectListList3");
		} else if ("4".equals(id)) {
			return new ModelAndView(
					"com/jeecg/loansubjectlist/accrualLoanSubjectListList4");
		} else if ("5".equals(id)) {
			return new ModelAndView(
					"com/jeecg/loansubjectlist/accrualLoanSubjectListList5");
		} else {
			return new ModelAndView(
					"com/jeecg/loansubjectlist/accrualLoanSubjectListList6");
		}
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
	public void datagrid(AccrualLoanSubjectListEntity accrualLoanSubjectList,
			HttpServletRequest request, HttpServletResponse response,
			DataGrid dataGrid) {
		CriteriaQuery cq = new CriteriaQuery(
				AccrualLoanSubjectListEntity.class, dataGrid);
		// 查询条件组装器
		org.jeecgframework.core.extend.hqlsearch.HqlGenerateUtil.installHql(cq,
				accrualLoanSubjectList, request.getParameterMap());
		try {
			cq.eq("loanSubjictId", "4028e42461d5b2700161d5b270270000");
			// 自定义追加查询条件
		} catch (Exception e) {
			throw new BusinessException(e.getMessage());
		}
		cq.add();
		this.accrualLoanSubjectListService.getDataGridReturn(cq, true);
		TagUtil.datagrid(response, dataGrid);
	}

	@RequestMapping(params = "datagrid2")
	public void datagrid2(AccrualLoanSubjectListEntity accrualLoanSubjectList,
			HttpServletRequest request, HttpServletResponse response,
			DataGrid dataGrid) {
		CriteriaQuery cq = new CriteriaQuery(
				AccrualLoanSubjectListEntity.class, dataGrid);
		// 查询条件组装器
		org.jeecgframework.core.extend.hqlsearch.HqlGenerateUtil.installHql(cq,
				accrualLoanSubjectList, request.getParameterMap());
		try {
			cq.eq("loanSubjictId", "4028e42461d5b2700161d5b28e1a0001");
			// 自定义追加查询条件
		} catch (Exception e) {
			throw new BusinessException(e.getMessage());
		}
		cq.add();
		this.accrualLoanSubjectListService.getDataGridReturn(cq, true);
		TagUtil.datagrid(response, dataGrid);
	}

	@RequestMapping(params = "datagrid3")
	public void datagrid3(AccrualLoanSubjectListEntity accrualLoanSubjectList,
			HttpServletRequest request, HttpServletResponse response,
			DataGrid dataGrid) {
		CriteriaQuery cq = new CriteriaQuery(
				AccrualLoanSubjectListEntity.class, dataGrid);
		// 查询条件组装器
		org.jeecgframework.core.extend.hqlsearch.HqlGenerateUtil.installHql(cq,
				accrualLoanSubjectList, request.getParameterMap());
		try {
			cq.eq("loanSubjictId", "4028e42461d5b2700161d5b2a8a20002");
			// 自定义追加查询条件
		} catch (Exception e) {
			throw new BusinessException(e.getMessage());
		}
		cq.add();
		this.accrualLoanSubjectListService.getDataGridReturn(cq, true);
		TagUtil.datagrid(response, dataGrid);
	}

	@RequestMapping(params = "datagrid4")
	public void datagrid4(AccrualLoanSubjectListEntity accrualLoanSubjectList,
			HttpServletRequest request, HttpServletResponse response,
			DataGrid dataGrid) {
		CriteriaQuery cq = new CriteriaQuery(
				AccrualLoanSubjectListEntity.class, dataGrid);
		// 查询条件组装器
		org.jeecgframework.core.extend.hqlsearch.HqlGenerateUtil.installHql(cq,
				accrualLoanSubjectList, request.getParameterMap());
		try {
			cq.eq("loanSubjictId", "4028e42461d5b2700161d5b2bb670003");
			// 自定义追加查询条件
		} catch (Exception e) {
			throw new BusinessException(e.getMessage());
		}
		cq.add();
		this.accrualLoanSubjectListService.getDataGridReturn(cq, true);
		TagUtil.datagrid(response, dataGrid);
	}

	@RequestMapping(params = "datagrid5")
	public void datagrid5(AccrualLoanSubjectListEntity accrualLoanSubjectList,
			HttpServletRequest request, HttpServletResponse response,
			DataGrid dataGrid) {
		CriteriaQuery cq = new CriteriaQuery(
				AccrualLoanSubjectListEntity.class, dataGrid);
		// 查询条件组装器
		org.jeecgframework.core.extend.hqlsearch.HqlGenerateUtil.installHql(cq,
				accrualLoanSubjectList, request.getParameterMap());
		try {
			cq.eq("loanSubjictId", "4028e42461d5b2700161d5b2d9370004");
			// 自定义追加查询条件
		} catch (Exception e) {
			throw new BusinessException(e.getMessage());
		}
		cq.add();
		this.accrualLoanSubjectListService.getDataGridReturn(cq, true);
		TagUtil.datagrid(response, dataGrid);
	}

	@RequestMapping(params = "datagrid6")
	public void datagrid6(AccrualLoanSubjectListEntity accrualLoanSubjectList,
			HttpServletRequest request, HttpServletResponse response,
			DataGrid dataGrid) {
		CriteriaQuery cq = new CriteriaQuery(
				AccrualLoanSubjectListEntity.class, dataGrid);
		// 查询条件组装器
		org.jeecgframework.core.extend.hqlsearch.HqlGenerateUtil.installHql(cq,
				accrualLoanSubjectList, request.getParameterMap());
		try {
			cq.eq("loanSubjictId", "4028e42461d5b2700161d5b2f5170005");
			// 自定义追加查询条件
		} catch (Exception e) {
			throw new BusinessException(e.getMessage());
		}
		cq.add();
		this.accrualLoanSubjectListService.getDataGridReturn(cq, true);
		TagUtil.datagrid(response, dataGrid);
	}

	/**
	 * 删除借款主体列表
	 * 
	 * @return
	 */
	@RequestMapping(params = "doDel")
	@ResponseBody
	public AjaxJson doDel(AccrualLoanSubjectListEntity accrualLoanSubjectList,
			HttpServletRequest request) {
		String message = null;
		AjaxJson j = new AjaxJson();
		accrualLoanSubjectList = systemService.getEntity(
				AccrualLoanSubjectListEntity.class,
				accrualLoanSubjectList.getId());
		message = "借款主体列表删除成功";
		try {
			accrualLoanSubjectListService.delete(accrualLoanSubjectList);
			systemService.addLog(message, Globals.Log_Type_DEL,
					Globals.Log_Leavel_INFO);
		} catch (Exception e) {
			e.printStackTrace();
			message = "借款主体列表删除失败";
			throw new BusinessException(e.getMessage());
		}
		j.setMsg(message);
		return j;
	}

	/**
	 * 批量删除借款主体列表
	 * 
	 * @return
	 */
	@RequestMapping(params = "doBatchDel")
	@ResponseBody
	public AjaxJson doBatchDel(String ids, HttpServletRequest request) {
		String message = null;
		AjaxJson j = new AjaxJson();
		message = "借款主体列表删除成功";
		try {
			for (String id : ids.split(",")) {
				AccrualLoanSubjectListEntity accrualLoanSubjectList = systemService
						.getEntity(AccrualLoanSubjectListEntity.class, id);
				accrualLoanSubjectListService.delete(accrualLoanSubjectList);
				systemService.addLog(message, Globals.Log_Type_DEL,
						Globals.Log_Leavel_INFO);
			}
		} catch (Exception e) {
			e.printStackTrace();
			message = "借款主体列表删除失败";
			throw new BusinessException(e.getMessage());
		}
		j.setMsg(message);
		return j;
	}

	/**
	 * 添加借款主体列表
	 * 
	 * @param ids
	 * @return
	 */
	@RequestMapping(params = "doAdd")
	@ResponseBody
	public AjaxJson doAdd(AccrualLoanSubjectListEntity accrualLoanSubjectList,
			HttpServletRequest request, @RequestParam(value = "id") String id) {
		String message = null;
		AjaxJson j = new AjaxJson();
		message = "借款主体列表添加成功";
		id = id.substring(0, 1);
		try {
			if ("1".equals(id)) {
				accrualLoanSubjectList
						.setLoanSubjictId("4028e42461d5b2700161d5b270270000");
			} else if ("2".equals(id)) {
				accrualLoanSubjectList
						.setLoanSubjictId("4028e42461d5b2700161d5b28e1a0001");
			} else if ("3".equals(id)) {
				accrualLoanSubjectList
						.setLoanSubjictId("4028e42461d5b2700161d5b2a8a20002");
			} else if ("4".equals(id)) {
				accrualLoanSubjectList
						.setLoanSubjictId("4028e42461d5b2700161d5b2bb670003");
			} else if ("5".equals(id)) {
				accrualLoanSubjectList
						.setLoanSubjictId("4028e42461d5b2700161d5b2d9370004");
			} else {
				accrualLoanSubjectList
						.setLoanSubjictId("4028e42461d5b2700161d5b2f5170005");
			}
			accrualLoanSubjectListService.save(accrualLoanSubjectList);
			systemService.addLog(message, Globals.Log_Type_INSERT,
					Globals.Log_Leavel_INFO);
		} catch (Exception e) {
			e.printStackTrace();
			message = "借款主体列表添加失败";
			throw new BusinessException(e.getMessage());
		}
		j.setMsg(message);
		return j;
	}

	/**
	 * 更新借款主体列表
	 * 
	 * @param ids
	 * @return
	 */
	@RequestMapping(params = "doUpdate")
	@ResponseBody
	public AjaxJson doUpdate(
			AccrualLoanSubjectListEntity accrualLoanSubjectList,
			HttpServletRequest request) {
		String message = null;
		AjaxJson j = new AjaxJson();
		message = "借款主体列表更新成功";
		AccrualLoanSubjectListEntity t = accrualLoanSubjectListService.get(
				AccrualLoanSubjectListEntity.class,
				accrualLoanSubjectList.getId());
		try {
			MyBeanUtils.copyBeanNotNull2Bean(accrualLoanSubjectList, t);
			accrualLoanSubjectListService.saveOrUpdate(t);
			systemService.addLog(message, Globals.Log_Type_UPDATE,
					Globals.Log_Leavel_INFO);
		} catch (Exception e) {
			e.printStackTrace();
			message = "借款主体列表更新失败";
			throw new BusinessException(e.getMessage());
		}
		j.setMsg(message);
		return j;
	}

	/**
	 * 借款主体列表新增页面跳转
	 * 
	 * @return
	 */
	@RequestMapping(params = "goAdd")
	public ModelAndView goAdd(
			AccrualLoanSubjectListEntity accrualLoanSubjectList,
			HttpServletRequest req, @RequestParam(value = "id") String id) {
		if (StringUtil.isNotEmpty(accrualLoanSubjectList.getId())) {
			accrualLoanSubjectList = accrualLoanSubjectListService.getEntity(
					AccrualLoanSubjectListEntity.class,
					accrualLoanSubjectList.getId());
			req.setAttribute("accrualLoanSubjectListPage",
					accrualLoanSubjectList);
		}
		id = id.substring(0, 1);
		if ("1".equals(id)) {
			return new ModelAndView(
					"com/jeecg/loansubjectlist/accrualLoanSubjectList-add");
		} else if ("2".equals(id)) {
			return new ModelAndView(
					"com/jeecg/loansubjectlist/accrualLoanSubjectList-add2");
		} else if ("3".equals(id)) {
			return new ModelAndView(
					"com/jeecg/loansubjectlist/accrualLoanSubjectList-add3");
		} else if ("4".equals(id)) {
			return new ModelAndView(
					"com/jeecg/loansubjectlist/accrualLoanSubjectList-add4");
		} else if ("5".equals(id)) {
			return new ModelAndView(
					"com/jeecg/loansubjectlist/accrualLoanSubjectList-add5");
		} else {
			return new ModelAndView(
					"com/jeecg/loansubjectlist/accrualLoanSubjectList-add6");
		}
	}

	/**
	 * 借款主体列表编辑页面跳转
	 * 
	 * @return
	 */
	@RequestMapping(params = "goUpdate")
	public ModelAndView goUpdate(
			AccrualLoanSubjectListEntity accrualLoanSubjectList,
			HttpServletRequest req, @RequestParam(value = "id") String id) {
		if (StringUtil.isNotEmpty(accrualLoanSubjectList.getId())) {
			accrualLoanSubjectList = accrualLoanSubjectListService.getEntity(
					AccrualLoanSubjectListEntity.class,
					accrualLoanSubjectList.getId());
			req.setAttribute("accrualLoanSubjectListPage",
					accrualLoanSubjectList);
		}
		id = id.substring(0, 1);
		if ("1".equals(id)) {
			return new ModelAndView(
					"com/jeecg/loansubjectlist/accrualLoanSubjectList-update");
		} else if ("2".equals(id)) {
			return new ModelAndView(
					"com/jeecg/loansubjectlist/accrualLoanSubjectList-update2");
		} else if ("3".equals(id)) {
			return new ModelAndView(
					"com/jeecg/loansubjectlist/accrualLoanSubjectList-update3");
		} else if ("4".equals(id)) {
			return new ModelAndView(
					"com/jeecg/loansubjectlist/accrualLoanSubjectList-update4");
		} else if ("5".equals(id)) {
			return new ModelAndView(
					"com/jeecg/loansubjectlist/accrualLoanSubjectList-update5");
		} else {
			return new ModelAndView(
					"com/jeecg/loansubjectlist/accrualLoanSubjectList-update6");
		}
	}

	/**
	 * 导入功能跳转
	 * 
	 * @return
	 */
	@RequestMapping(params = "upload")
	public ModelAndView upload(HttpServletRequest req) {
		req.setAttribute("controller_name", "accrualLoanSubjectListController");
		return new ModelAndView("common/upload/pub_excel_upload");
	}

	/**
	 * 导出excel
	 * 
	 * @param request
	 * @param response
	 */
	@RequestMapping(params = "exportXls")
	public String exportXls(
			AccrualLoanSubjectListEntity accrualLoanSubjectList,
			HttpServletRequest request, HttpServletResponse response,
			DataGrid dataGrid, ModelMap modelMap) {
		CriteriaQuery cq = new CriteriaQuery(
				AccrualLoanSubjectListEntity.class, dataGrid);
		org.jeecgframework.core.extend.hqlsearch.HqlGenerateUtil.installHql(cq,
				accrualLoanSubjectList, request.getParameterMap());
		List<AccrualLoanSubjectListEntity> accrualLoanSubjectLists = this.accrualLoanSubjectListService
				.getListByCriteriaQuery(cq, false);
		modelMap.put(NormalExcelConstants.FILE_NAME, "借款主体列表");
		modelMap.put(NormalExcelConstants.CLASS,
				AccrualLoanSubjectListEntity.class);
		modelMap.put(NormalExcelConstants.PARAMS, new ExportParams("借款主体列表列表",
				"导出人:" + ResourceUtil.getSessionUser().getRealName(), "导出信息"));
		modelMap.put(NormalExcelConstants.DATA_LIST, accrualLoanSubjectLists);
		return NormalExcelConstants.JEECG_EXCEL_VIEW;
	}

	/**
	 * 导出excel 使模板
	 * 
	 * @param request
	 * @param response
	 */
	@RequestMapping(params = "exportXlsByT")
	public String exportXlsByT(
			AccrualLoanSubjectListEntity accrualLoanSubjectList,
			HttpServletRequest request, HttpServletResponse response,
			DataGrid dataGrid, ModelMap modelMap) {
		modelMap.put(NormalExcelConstants.FILE_NAME, "借款主体列表");
		modelMap.put(NormalExcelConstants.CLASS,
				AccrualLoanSubjectListEntity.class);
		modelMap.put(NormalExcelConstants.PARAMS, new ExportParams("借款主体列表列表",
				"导出人:" + ResourceUtil.getSessionUser().getRealName(), "导出信息"));
		modelMap.put(NormalExcelConstants.DATA_LIST, new ArrayList());
		return NormalExcelConstants.JEECG_EXCEL_VIEW;
	}

	@SuppressWarnings("unchecked")
	@RequestMapping(params = "importExcel", method = RequestMethod.POST)
	@ResponseBody
	public AjaxJson importExcel(HttpServletRequest request,
			HttpServletResponse response) {
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
				List<AccrualLoanSubjectListEntity> listAccrualLoanSubjectListEntitys = ExcelImportUtil
						.importExcel(file.getInputStream(),
								AccrualLoanSubjectListEntity.class, params);
				for (AccrualLoanSubjectListEntity accrualLoanSubjectList : listAccrualLoanSubjectListEntitys) {
					accrualLoanSubjectListService.save(accrualLoanSubjectList);
				}
				j.setMsg("文件导入成功！");
			} catch (Exception e) {
				j.setMsg("文件导入失败！");
				logger.error(ExceptionUtil.getExceptionMessage(e));
			} finally {
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
	public List<AccrualLoanSubjectListEntity> list() {
		List<AccrualLoanSubjectListEntity> listAccrualLoanSubjectLists = accrualLoanSubjectListService
				.getList(AccrualLoanSubjectListEntity.class);
		return listAccrualLoanSubjectLists;
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<?> get(@PathVariable("id") String id) {
		AccrualLoanSubjectListEntity task = accrualLoanSubjectListService.get(
				AccrualLoanSubjectListEntity.class, id);
		if (task == null) {
			return new ResponseEntity(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity(task, HttpStatus.OK);
	}

	@RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public ResponseEntity<?> create(
			@RequestBody AccrualLoanSubjectListEntity accrualLoanSubjectList,
			UriComponentsBuilder uriBuilder) {
		// 调用JSR303 Bean Validator进行校验，如果出错返回含400错误码及json格式的错误信息.
		Set<ConstraintViolation<AccrualLoanSubjectListEntity>> failures = validator
				.validate(accrualLoanSubjectList);
		if (!failures.isEmpty()) {
			return new ResponseEntity(
					BeanValidators.extractPropertyAndMessage(failures),
					HttpStatus.BAD_REQUEST);
		}

		// 保存
		try {
			accrualLoanSubjectListService.save(accrualLoanSubjectList);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity(HttpStatus.NO_CONTENT);
		}
		// 按照Restful风格约定，创建指向新任务的url, 也可以直接返回id或对象.
		String id = accrualLoanSubjectList.getId();
		URI uri = uriBuilder
				.path("/rest/accrualLoanSubjectListController/" + id).build()
				.toUri();
		HttpHeaders headers = new HttpHeaders();
		headers.setLocation(uri);

		return new ResponseEntity(headers, HttpStatus.CREATED);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> update(
			@RequestBody AccrualLoanSubjectListEntity accrualLoanSubjectList) {
		// 调用JSR303 Bean Validator进行校验，如果出错返回含400错误码及json格式的错误信息.
		Set<ConstraintViolation<AccrualLoanSubjectListEntity>> failures = validator
				.validate(accrualLoanSubjectList);
		if (!failures.isEmpty()) {
			return new ResponseEntity(
					BeanValidators.extractPropertyAndMessage(failures),
					HttpStatus.BAD_REQUEST);
		}

		// 保存
		try {
			accrualLoanSubjectListService.saveOrUpdate(accrualLoanSubjectList);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity(HttpStatus.NO_CONTENT);
		}

		// 按Restful约定，返回204状态码, 无内容. 也可以返回200状态码.
		return new ResponseEntity(HttpStatus.NO_CONTENT);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable("id") String id) {
		accrualLoanSubjectListService.deleteEntityById(
				AccrualLoanSubjectListEntity.class, id);
	}
}
