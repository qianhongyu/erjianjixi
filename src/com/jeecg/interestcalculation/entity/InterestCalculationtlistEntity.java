package com.jeecg.interestcalculation.entity;

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
 * @Description: 银行借款合同
 * @author onlineGenerator
 * @date 2018-01-25 11:08:27
 * @version V1.0   
 *
 */
@Entity
@Table(name = "accrual_newbank_contractlist", schema = "")
@SuppressWarnings("serial")
public class InterestCalculationtlistEntity implements java.io.Serializable {
	/**主键*/
	private java.lang.String id;
	/**合同编号*/
	@Excel(name="合同编号",width=15)
	private java.lang.String contractId;
	/**贷款方式*/
	@Excel(name="贷款方式",width=15,dictTable ="accrual_dkfs",dicCode ="id",dicText ="text")
	private java.lang.String loanMethod;
	/**贷款单位*/
	@Excel(name="贷款单位",width=15)
	private java.lang.String loanUnit;
	/**借款单位*/
	@Excel(name="借款单位",width=15)
	private java.lang.String borrower;
	/**合同性质*/
	@Excel(name="合同性质",width=15,dictTable ="accrual_contract_nature",dicCode ="id",dicText ="text")
	private java.lang.String contractNature;
	/**合同状态*/
	@Excel(name="合同状态",width=15,dictTable ="accrual_contract_type",dicCode ="id",dicText ="text")
	private java.lang.String contractStatus;
	/**区域公司*/
	@Excel(name="区域公司",width=15,dictTable ="accrual_quyucompany",dicCode ="id",dicText ="areaname")
	private java.lang.String regionalCompany;
	/**承包商*/
	@Excel(name="承包商",width=15,dictTable ="accrual_cbs",dicCode ="id",dicText ="cbsname")
	private java.lang.String contractor;
	/**项目部*/
	@Excel(name="项目部",width=15,dictTable ="accrual_xmb",dicCode ="id",dicText ="xmbname")
	private java.lang.String projectDepartment;
	/**备注*/
	@Excel(name="备注",width=15)
	private java.lang.String remarks;
	/**基础利率*/
	@Excel(name="基础利率",width=15,dictTable ="accrual_rate",dicCode ="id",dicText ="yearrate")
	private java.lang.String baseRate;
	/**超额利率*/
	@Excel(name="超额利率",width=15,dictTable ="accrual_rate",dicCode ="id",dicText ="yearrate")
	private java.lang.String excessRate;
	/**复利方式*/
	@Excel(name="复利方式",width=15,dictTable ="accrual_compound_interest",dicCode ="id",dicText ="text")
	private java.lang.String compoundInterest;
	/**结息日*/
	@Excel(name="结息日",width=15)
	private java.lang.String interestDay;
	/**合同签订日期*/
	@Excel(name="合同签订日期",width=15,format = "yyyy-MM-dd")
	private java.util.Date contractAwardDate;
	/**借贷金额*/
	@Excel(name="借贷金额",width=15)
	private java.lang.String loanAmount;
	/**期间*/
	@Excel(name="期间",width=15)
	private java.lang.String period;
	/**期间单位*/
	@Excel(name="期间单位",width=15,dictTable ="ACCRUAL_INTEREST_UNIT",dicCode ="id",dicText ="text")
	private java.lang.String periodUnit;
	/**起始日期*/
	@Excel(name="起始日期",width=15,format = "yyyy-MM-dd")
	private java.util.Date startDate;
	/**结束日期*/
	@Excel(name="结束日期",width=15,format = "yyyy-MM-dd")
	private java.util.Date endDate;
	/**录入人*/
	@Excel(name="录入人",width=15)
	private java.lang.String inputPerson;
	/**审核人*/
	@Excel(name="审核人",width=15)
	private java.lang.String auditor;
	
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
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  贷款方式
	 */

	@Column(name ="LOAN_METHOD",nullable=true,length=50)
	public java.lang.String getLoanMethod(){
		return this.loanMethod;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  贷款方式
	 */
	public void setLoanMethod(java.lang.String loanMethod){
		this.loanMethod = loanMethod;
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
	 *@return: java.lang.String  合同性质
	 */

	@Column(name ="CONTRACT_NATURE",nullable=true,length=50)
	public java.lang.String getContractNature(){
		return this.contractNature;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  合同性质
	 */
	public void setContractNature(java.lang.String contractNature){
		this.contractNature = contractNature;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  合同状态
	 */

	@Column(name ="CONTRACT_STATUS",nullable=true,length=50)
	public java.lang.String getContractStatus(){
		return this.contractStatus;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  合同状态
	 */
	public void setContractStatus(java.lang.String contractStatus){
		this.contractStatus = contractStatus;
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
	 *@return: java.lang.String  备注
	 */

	@Column(name ="REMARKS",nullable=true,length=100)
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

	@Column(name ="INTEREST_DAY",nullable=true,length=50)
	public java.lang.String getInterestDay(){
		return this.interestDay;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  结息日
	 */
	public void setInterestDay(java.lang.String interestDay){
		this.interestDay = interestDay;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  合同签订日期
	 */

	@Column(name ="CONTRACT_AWARD_DATE",nullable=true,length=50)
	public java.util.Date getContractAwardDate(){
		return this.contractAwardDate;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  合同签订日期
	 */
	public void setContractAwardDate(java.util.Date contractAwardDate){
		this.contractAwardDate = contractAwardDate;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  借贷金额
	 */

	@Column(name ="LOAN_AMOUNT",nullable=true,length=50)
	public java.lang.String getLoanAmount(){
		return this.loanAmount;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  借贷金额
	 */
	public void setLoanAmount(java.lang.String loanAmount){
		this.loanAmount = loanAmount;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  期间
	 */

	@Column(name ="PERIOD",nullable=true,length=50)
	public java.lang.String getPeriod(){
		return this.period;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  期间
	 */
	public void setPeriod(java.lang.String period){
		this.period = period;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  期间单位
	 */

	@Column(name ="PERIOD_UNIT",nullable=true,length=50)
	public java.lang.String getPeriodUnit(){
		return this.periodUnit;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  期间单位
	 */
	public void setPeriodUnit(java.lang.String periodUnit){
		this.periodUnit = periodUnit;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  起始日期
	 */

	@Column(name ="START_DATE",nullable=true,length=50)
	public java.util.Date getStartDate(){
		return this.startDate;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  起始日期
	 */
	public void setStartDate(java.util.Date startDate){
		this.startDate = startDate;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  结束日期
	 */

	@Column(name ="END_DATE",nullable=true,length=50)
	public java.util.Date getEndDate(){
		return this.endDate;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  结束日期
	 */
	public void setEndDate(java.util.Date endDate){
		this.endDate = endDate;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  录入人
	 */

	@Column(name ="INPUT_PERSON",nullable=true,length=50)
	public java.lang.String getInputPerson(){
		return this.inputPerson;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  录入人
	 */
	public void setInputPerson(java.lang.String inputPerson){
		this.inputPerson = inputPerson;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  审核人
	 */

	@Column(name ="AUDITOR",nullable=true,length=50)
	public java.lang.String getAuditor(){
		return this.auditor;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  审核人
	 */
	public void setAuditor(java.lang.String auditor){
		this.auditor = auditor;
	}
}
