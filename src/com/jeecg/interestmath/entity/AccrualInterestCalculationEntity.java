package com.jeecg.interestmath.entity;

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
 * @Description: 利息计算
 * @author onlineGenerator
 * @date 2018-01-29 09:47:34
 * @version V1.0   
 *
 */
@Entity
@Table(name = "accrual_interest_calculation", schema = "")
@SuppressWarnings("serial")
public class AccrualInterestCalculationEntity implements java.io.Serializable {
	/**主键*/
	private java.lang.String id;
	/**合同类型*/
	@Excel(name="合同类型",width=15,dictTable ="accrual_contract_nature",dicCode ="id",dicText ="text")
	private java.lang.String contractNature;
	/**合同编号*/
	@Excel(name="合同编号",width=15)
	private java.lang.String contractId;
	/**合同金额*/
	@Excel(name="合同金额",width=15)
	private java.lang.Integer loanAmount;
	/**基础利率*/
	@Excel(name="基础利率",width=15,dictTable ="accrual_rate",dicCode ="id",dicText ="yearrate")
	private java.lang.String baseRate;
	/**超额利率*/
	@Excel(name="超额利率",width=15,dictTable ="accrual_rate",dicCode ="id",dicText ="yearrate")
	private java.lang.String excessRate;
	/**结息日*/
	@Excel(name="结息日",width=15)
	private java.lang.String interestDay;
	/**当前结息日*/
	@Excel(name="当前结息日",width=15)
	private java.lang.String nowinterestDay;
	/**下一结息日*/
	@Excel(name="下一结息日",width=15)
	private java.lang.String nextinterestDay;
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
	 *@return: java.lang.String  合同类型
	 */

	@Column(name ="CONTRACT_NATURE",nullable=true,length=50)
	public java.lang.String getContractNature(){
		return this.contractNature;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  合同类型
	 */
	public void setContractNature(java.lang.String contractNature){
		this.contractNature = contractNature;
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
	 *@return: java.lang.Integer  合同金额
	 */

	@Column(name ="LOAN_AMOUNT",nullable=true,length=50)
	public java.lang.Integer getLoanAmount(){
		return this.loanAmount;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  合同金额
	 */
	public void setLoanAmount(java.lang.Integer loanAmount){
		this.loanAmount = loanAmount;
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
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  当前结息日
	 */

	@Column(name ="NOWINTEREST_DAY",nullable=true,length=50)
	public java.lang.String getNowinterestDay(){
		return this.nowinterestDay;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  当前结息日
	 */
	public void setNowinterestDay(java.lang.String nowinterestDay){
		this.nowinterestDay = nowinterestDay;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  下一结息日
	 */

	@Column(name ="NEXTINTEREST_DAY",nullable=true,length=50)
	public java.lang.String getNextinterestDay(){
		return this.nextinterestDay;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  下一结息日
	 */
	public void setNextinterestDay(java.lang.String nextinterestDay){
		this.nextinterestDay = nextinterestDay;
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
}
