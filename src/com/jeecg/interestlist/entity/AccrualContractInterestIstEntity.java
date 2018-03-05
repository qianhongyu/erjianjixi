package com.jeecg.interestlist.entity;

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
 * @Description: 合同利息清单
 * @author onlineGenerator
 * @date 2018-01-25 16:37:43
 * @version V1.0   
 *
 */
@Entity
@Table(name = "accrual_contract_interest_ist", schema = "")
@SuppressWarnings("serial")
public class AccrualContractInterestIstEntity implements java.io.Serializable {
	/**主键*/
	private java.lang.String id;
	/**清单编号*/
	@Excel(name="清单编号",width=15)
	private java.lang.String listNumber;
	/**合同类型*/
	@Excel(name="合同类型",width=15)
	private java.lang.String contractType;
	/**合同编号*/
	@Excel(name="合同编号",width=15)
	private java.lang.String contractId;
	/**本金*/
	@Excel(name="本金",width=15)
	private java.lang.Integer principal;
	/**复利方式*/
	@Excel(name="复利方式",width=15)
	private java.lang.String compoundInterest;
	/**结息日*/
	@Excel(name="结息日",width=15)
	private java.lang.String endInterestDay;
	/**贷款单位*/
	@Excel(name="贷款单位",width=15)
	private java.lang.String loanUnit;
	/**借款单位*/
	@Excel(name="借款单位",width=15)
	private java.lang.String borrower;
	/**区域公司*/
	@Excel(name="区域公司",width=15)
	private java.lang.String regionalCompany;
	/**承包商*/
	@Excel(name="承包商",width=15)
	private java.lang.String contractor;
	/**项目部*/
	@Excel(name="项目部",width=15)
	private java.lang.String projectDepartment;
	/**基础利率*/
	@Excel(name="基础利率",width=15)
	private java.lang.String baseRate;
	/**超额利率*/
	@Excel(name="超额利率",width=15)
	private java.lang.String excessRate;
	/**基础利息*/
	@Excel(name="基础利息",width=15)
	private java.lang.String baseInterest;
	/**超额利息*/
	@Excel(name="超额利息",width=15)
	private java.lang.String excessInteres;
	/**利息合计*/
	@Excel(name="利息合计",width=15)
	private java.lang.String interestAggregate;
	/**起息日*/
	@Excel(name="起息日",width=15)
	private java.lang.String startInterestDay;
	/**结息天数*/
	@Excel(name="结息天数",width=15)
	private java.lang.Integer restDays;
	
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
	 *@return: java.lang.String  清单编号
	 */

	@Column(name ="LIST_NUMBER",nullable=true,length=50)
	public java.lang.String getListNumber(){
		return this.listNumber;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  清单编号
	 */
	public void setListNumber(java.lang.String listNumber){
		this.listNumber = listNumber;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  合同类型
	 */

	@Column(name ="CONTRACT_TYPE",nullable=true,length=50)
	public java.lang.String getContractType(){
		return this.contractType;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  合同类型
	 */
	public void setContractType(java.lang.String contractType){
		this.contractType = contractType;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  合同编号
	 */

	@Column(name ="CONTRACT_ID",nullable=true,length=50)
	public java.lang.String getContractId(){
		return this.contractId;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  合同编号
	 */
	public void setContractId(java.lang.String contractId){
		this.contractId = contractId;
	}
	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  本金
	 */

	@Column(name ="PRINCIPAL",nullable=true,length=50)
	public java.lang.Integer getPrincipal(){
		return this.principal;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  本金
	 */
	public void setPrincipal(java.lang.Integer principal){
		this.principal = principal;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  复利方式
	 */

	@Column(name ="COMPOUND_INTEREST",nullable=true,length=50)
	public java.lang.String getCompoundInterest(){
		return this.compoundInterest;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  复利方式
	 */
	public void setCompoundInterest(java.lang.String compoundInterest){
		this.compoundInterest = compoundInterest;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  结息日
	 */

	@Column(name ="END_INTEREST_DAY",nullable=true,length=50)
	public java.lang.String getEndInterestDay(){
		return this.endInterestDay;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  结息日
	 */
	public void setEndInterestDay(java.lang.String endInterestDay){
		this.endInterestDay = endInterestDay;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  贷款单位
	 */

	@Column(name ="LOAN_UNIT",nullable=true,length=50)
	public java.lang.String getLoanUnit(){
		return this.loanUnit;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  贷款单位
	 */
	public void setLoanUnit(java.lang.String loanUnit){
		this.loanUnit = loanUnit;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  借款单位
	 */

	@Column(name ="BORROWER",nullable=true,length=50)
	public java.lang.String getBorrower(){
		return this.borrower;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  借款单位
	 */
	public void setBorrower(java.lang.String borrower){
		this.borrower = borrower;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  区域公司
	 */

	@Column(name ="REGIONAL_COMPANY",nullable=true,length=50)
	public java.lang.String getRegionalCompany(){
		return this.regionalCompany;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  区域公司
	 */
	public void setRegionalCompany(java.lang.String regionalCompany){
		this.regionalCompany = regionalCompany;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  承包商
	 */

	@Column(name ="CONTRACTOR",nullable=true,length=50)
	public java.lang.String getContractor(){
		return this.contractor;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  承包商
	 */
	public void setContractor(java.lang.String contractor){
		this.contractor = contractor;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  项目部
	 */

	@Column(name ="PROJECT_DEPARTMENT",nullable=true,length=50)
	public java.lang.String getProjectDepartment(){
		return this.projectDepartment;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  项目部
	 */
	public void setProjectDepartment(java.lang.String projectDepartment){
		this.projectDepartment = projectDepartment;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  基础利率
	 */

	@Column(name ="BASE_RATE",nullable=true,length=50)
	public java.lang.String getBaseRate(){
		return this.baseRate;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  基础利率
	 */
	public void setBaseRate(java.lang.String baseRate){
		this.baseRate = baseRate;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  超额利率
	 */

	@Column(name ="EXCESS_RATE",nullable=true,length=50)
	public java.lang.String getExcessRate(){
		return this.excessRate;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  超额利率
	 */
	public void setExcessRate(java.lang.String excessRate){
		this.excessRate = excessRate;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  基础利息
	 */

	@Column(name ="BASE_INTEREST",nullable=true,length=50)
	public java.lang.String getBaseInterest(){
		return this.baseInterest;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  基础利息
	 */
	public void setBaseInterest(java.lang.String baseInterest){
		this.baseInterest = baseInterest;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  超额利息
	 */

	@Column(name ="EXCESS_INTERES",nullable=true,length=50)
	public java.lang.String getExcessInteres(){
		return this.excessInteres;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  超额利息
	 */
	public void setExcessInteres(java.lang.String excessInteres){
		this.excessInteres = excessInteres;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  利息合计
	 */

	@Column(name ="INTEREST_AGGREGATE",nullable=true,length=50)
	public java.lang.String getInterestAggregate(){
		return this.interestAggregate;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  利息合计
	 */
	public void setInterestAggregate(java.lang.String interestAggregate){
		this.interestAggregate = interestAggregate;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  起息日
	 */

	@Column(name ="START_INTEREST_DAY",nullable=true,length=50)
	public java.lang.String getStartInterestDay(){
		return this.startInterestDay;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  起息日
	 */
	public void setStartInterestDay(java.lang.String startInterestDay){
		this.startInterestDay = startInterestDay;
	}
	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  结息天数
	 */

	@Column(name ="REST_DAYS",nullable=true,length=50)
	public java.lang.Integer getRestDays(){
		return this.restDays;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  结息天数
	 */
	public void setRestDays(java.lang.Integer restDays){
		this.restDays = restDays;
	}
}
