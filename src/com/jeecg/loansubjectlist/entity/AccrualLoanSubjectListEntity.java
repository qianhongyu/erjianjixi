package com.jeecg.loansubjectlist.entity;

import java.math.BigDecimal;
import java.util.Date;
import java.lang.String;
import java.lang.Double;
import java.lang.Integer;
import java.math.BigDecimal;
import javax.xml.soap.Text;
import java.sql.Blob;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;
import javax.persistence.SequenceGenerator;
import org.jeecgframework.poi.excel.annotation.Excel;

/**   
 * @Title: Entity
 * @Description: 借款主体列表
 * @author onlineGenerator
 * @date 2018-02-28 10:12:15
 * @version V1.0   
 *
 */
@Entity
@Table(name = "accrual_loan_subject_list", schema = "")
@SuppressWarnings("serial")
public class AccrualLoanSubjectListEntity implements java.io.Serializable {
	/**主键*/
	private java.lang.String id;
	/**名称*/
	@Excel(name="名称",width=15)
	private java.lang.String name;
	/**年度产值*/
	@Excel(name="年度产值",width=15)
	private java.lang.Integer annualoutputvalue;
	/**征信情况*/
	@Excel(name="征信情况",width=15)
	private java.lang.String creditinformation;
	/**工程质量考核情况*/
	@Excel(name="工程质量考核情况",width=15)
	private java.lang.String engineeringquality;
	/**综合描述*/
	@Excel(name="综合描述",width=15)
	private java.lang.String comprehensivedescription;
	/**实际控制人*/
	@Excel(name="实际控制人",width=15)
	private java.lang.String actualcontroller;
	/**实际控制人职务*/
	@Excel(name="实际控制人职务",width=15)
	private java.lang.String actualcontrollerDuty;
	/**实际控制人手机*/
	@Excel(name="实际控制人手机",width=15)
	private java.lang.String actualcontrollerPhone;
	/**实际控制人邮箱*/
	@Excel(name="实际控制人邮箱",width=15)
	private java.lang.String actualcontrollerEmail;
	/**财务人员*/
	@Excel(name="财务人员",width=15)
	private java.lang.String financialstaff;
	/**财务人员职务*/
	@Excel(name="财务人员职务",width=15)
	private java.lang.String financialstaffDuty;
	/**财务人员手机*/
	@Excel(name="财务人员手机",width=15)
	private java.lang.String financialstaffPhone;
	/**财务人员邮箱*/
	@Excel(name="财务人员邮箱",width=15)
	private java.lang.String financialstaffEmail;
	/**备注*/
	@Excel(name="备注",width=15)
	private java.lang.String remarks;
	/**借款主体类别id*/
	private java.lang.String loanSubjictId;
	
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  主键
	 */
	@Id
	@GeneratedValue(generator = "paymentableGenerator")
	@GenericGenerator(name = "paymentableGenerator", strategy = "uuid")

	@Column(name ="ID",nullable=false,length=36)
	public java.lang.String getId(){
		return this.id;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  主键
	 */
	public void setId(java.lang.String id){
		this.id = id;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  名称
	 */

	@Column(name ="NAME",nullable=true,length=50)
	public java.lang.String getName(){
		return this.name;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  名称
	 */
	public void setName(java.lang.String name){
		this.name = name;
	}
	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  年度产值
	 */

	@Column(name ="ANNUALOUTPUTVALUE",nullable=true,length=50)
	public java.lang.Integer getAnnualoutputvalue(){
		return this.annualoutputvalue;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  年度产值
	 */
	public void setAnnualoutputvalue(java.lang.Integer annualoutputvalue){
		this.annualoutputvalue = annualoutputvalue;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  征信情况
	 */

	@Column(name ="CREDITINFORMATION",nullable=true,length=50)
	public java.lang.String getCreditinformation(){
		return this.creditinformation;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  征信情况
	 */
	public void setCreditinformation(java.lang.String creditinformation){
		this.creditinformation = creditinformation;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  工程质量考核情况
	 */

	@Column(name ="ENGINEERINGQUALITY",nullable=true,length=50)
	public java.lang.String getEngineeringquality(){
		return this.engineeringquality;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  工程质量考核情况
	 */
	public void setEngineeringquality(java.lang.String engineeringquality){
		this.engineeringquality = engineeringquality;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  综合描述
	 */

	@Column(name ="COMPREHENSIVEDESCRIPTION",nullable=true,length=50)
	public java.lang.String getComprehensivedescription(){
		return this.comprehensivedescription;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  综合描述
	 */
	public void setComprehensivedescription(java.lang.String comprehensivedescription){
		this.comprehensivedescription = comprehensivedescription;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  实际控制人
	 */

	@Column(name ="ACTUALCONTROLLER",nullable=true,length=50)
	public java.lang.String getActualcontroller(){
		return this.actualcontroller;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  实际控制人
	 */
	public void setActualcontroller(java.lang.String actualcontroller){
		this.actualcontroller = actualcontroller;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  实际控制人职务
	 */

	@Column(name ="ACTUALCONTROLLER_DUTY",nullable=true,length=50)
	public java.lang.String getActualcontrollerDuty(){
		return this.actualcontrollerDuty;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  实际控制人职务
	 */
	public void setActualcontrollerDuty(java.lang.String actualcontrollerDuty){
		this.actualcontrollerDuty = actualcontrollerDuty;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  实际控制人手机
	 */

	@Column(name ="ACTUALCONTROLLER_PHONE",nullable=true,length=50)
	public java.lang.String getActualcontrollerPhone(){
		return this.actualcontrollerPhone;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  实际控制人手机
	 */
	public void setActualcontrollerPhone(java.lang.String actualcontrollerPhone){
		this.actualcontrollerPhone = actualcontrollerPhone;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  实际控制人邮箱
	 */

	@Column(name ="ACTUALCONTROLLER_EMAIL",nullable=true,length=50)
	public java.lang.String getActualcontrollerEmail(){
		return this.actualcontrollerEmail;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  实际控制人邮箱
	 */
	public void setActualcontrollerEmail(java.lang.String actualcontrollerEmail){
		this.actualcontrollerEmail = actualcontrollerEmail;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  财务人员
	 */

	@Column(name ="FINANCIALSTAFF",nullable=true,length=50)
	public java.lang.String getFinancialstaff(){
		return this.financialstaff;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  财务人员
	 */
	public void setFinancialstaff(java.lang.String financialstaff){
		this.financialstaff = financialstaff;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  财务人员职务
	 */

	@Column(name ="FINANCIALSTAFF_DUTY",nullable=true,length=50)
	public java.lang.String getFinancialstaffDuty(){
		return this.financialstaffDuty;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  财务人员职务
	 */
	public void setFinancialstaffDuty(java.lang.String financialstaffDuty){
		this.financialstaffDuty = financialstaffDuty;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  财务人员手机
	 */

	@Column(name ="FINANCIALSTAFF_PHONE",nullable=true,length=50)
	public java.lang.String getFinancialstaffPhone(){
		return this.financialstaffPhone;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  财务人员手机
	 */
	public void setFinancialstaffPhone(java.lang.String financialstaffPhone){
		this.financialstaffPhone = financialstaffPhone;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  财务人员邮箱
	 */

	@Column(name ="FINANCIALSTAFF_EMAIL",nullable=true,length=50)
	public java.lang.String getFinancialstaffEmail(){
		return this.financialstaffEmail;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  财务人员邮箱
	 */
	public void setFinancialstaffEmail(java.lang.String financialstaffEmail){
		this.financialstaffEmail = financialstaffEmail;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  备注
	 */

	@Column(name ="REMARKS",nullable=true,length=1000)
	public java.lang.String getRemarks(){
		return this.remarks;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  备注
	 */
	public void setRemarks(java.lang.String remarks){
		this.remarks = remarks;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  借款主体类别id
	 */

	@Column(name ="LOAN_SUBJICT_ID",nullable=true,length=50)
	public java.lang.String getLoanSubjictId(){
		return this.loanSubjictId;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  借款主体类别id
	 */
	public void setLoanSubjictId(java.lang.String loanSubjictId){
		this.loanSubjictId = loanSubjictId;
	}
}
