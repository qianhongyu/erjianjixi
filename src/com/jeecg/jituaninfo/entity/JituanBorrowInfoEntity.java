package com.jeecg.jituaninfo.entity;

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
 * @Description: 集团借入
 * @author onlineGenerator
 * @date 2018-01-19 10:57:07
 * @version V1.0   
 *
 */
@Entity
@Table(name = "jituan_borrow_info", schema = "")
@SuppressWarnings("serial")
public class JituanBorrowInfoEntity implements java.io.Serializable {
	/**主键*/
	private java.lang.String id;
	/**对应的合同编号*/
	@Excel(name="对应的合同编号",width=15,dictTable ="accrual_all_contract",dicCode ="contract_id",dicText ="contract_name")
	private java.lang.String contractId;
	/**借款金额*/
	@Excel(name="借款金额",width=15)
	private java.lang.String loanamount;
	/**基础利率*/
	@Excel(name="基础利率",width=15,dictTable ="accrual_base_rate",dicCode ="id",dicText ="base_rate")
	private java.lang.String baseRate;
	/**超额利率*/
	@Excel(name="超额利率",width=15,dictTable ="accrual_excessinterest_rate",dicCode ="id",dicText ="excessinterest_rate")
	private java.lang.String excessinterestRate;
	/**开始时间*/
	@Excel(name="开始时间",width=15,format = "yyyy-MM-dd")
	private java.util.Date startTime;
	/**结束时间*/
	@Excel(name="结束时间",width=15,format = "yyyy-MM-dd")
	private java.util.Date endTime;
	/**结息日*/
	@Excel(name="结息日",width=15,dictTable ="accrual_day",dicCode ="id",dicText ="day_id")
	private java.lang.String period;
	/**还款日*/
	@Excel(name="还款日",width=15,dictTable ="accrual_day",dicCode ="id",dicText ="day_id")
	private java.lang.String repaymentDate;
	/**还款方式*/
	@Excel(name="还款方式",width=15,dictTable ="accrual_info_type",dicCode ="id",dicText ="type")
	private java.lang.String repaymentMode;
	/**结息周期*/
	@Excel(name="结息周期",width=15,dictTable ="accrual_info_jg",dicCode ="id",dicText ="text")
	private java.lang.String interestCycle;
	/**借款单位*/
	@Excel(name="借款单位",width=15,dictTable ="accrual_borrower",dicCode ="id",dicText ="borrower_name")
	private java.lang.String borrower;
	/**担保单位*/
	@Excel(name="担保单位",width=15,dictTable ="accrual_guarantor",dicCode ="id",dicText ="guarantor_name")
	private java.lang.String guarantor;
	/**放款单位*/
	@Excel(name="放款单位",width=15,dictTable ="accrual_lender",dicCode ="id",dicText ="lender_name")
	private java.lang.String lender;
	/**录入人*/
	@Excel(name="录入人",width=15)
	private java.lang.String inputPerson;
	/**录入时间*/
	@Excel(name="录入时间",width=15,format = "yyyy-MM-dd")
	private java.util.Date inputTime;
	/**最后一次的修改人*/
	@Excel(name="最后一次的修改人",width=15)
	private java.lang.String updatePerson;
	/**最后一次的修改时间*/
	@Excel(name="最后一次的修改时间",width=15,format = "yyyy-MM-dd")
	private java.util.Date updateTime;
	
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
	 *@return: java.lang.String  对应的合同编号
	 */

	@Column(name ="CONTRACT_ID",nullable=true,length=50)
	public java.lang.String getContractId(){
		return this.contractId;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  对应的合同编号
	 */
	public void setContractId(java.lang.String contractId){
		this.contractId = contractId;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  借款金额
	 */

	@Column(name ="LOANAMOUNT",nullable=true,length=50)
	public java.lang.String getLoanamount(){
		return this.loanamount;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  借款金额
	 */
	public void setLoanamount(java.lang.String loanamount){
		this.loanamount = loanamount;
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

	@Column(name ="EXCESSINTEREST_RATE",nullable=true,length=50)
	public java.lang.String getExcessinterestRate(){
		return this.excessinterestRate;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  超额利率
	 */
	public void setExcessinterestRate(java.lang.String excessinterestRate){
		this.excessinterestRate = excessinterestRate;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  开始时间
	 */

	@Column(name ="START_TIME",nullable=true,length=50)
	public java.util.Date getStartTime(){
		return this.startTime;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  开始时间
	 */
	public void setStartTime(java.util.Date startTime){
		this.startTime = startTime;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  结束时间
	 */

	@Column(name ="END_TIME",nullable=true,length=50)
	public java.util.Date getEndTime(){
		return this.endTime;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  结束时间
	 */
	public void setEndTime(java.util.Date endTime){
		this.endTime = endTime;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  结息日
	 */

	@Column(name ="PERIOD",nullable=true,length=50)
	public java.lang.String getPeriod(){
		return this.period;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  结息日
	 */
	public void setPeriod(java.lang.String period){
		this.period = period;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  还款日
	 */

	@Column(name ="REPAYMENT_DATE",nullable=true,length=50)
	public java.lang.String getRepaymentDate(){
		return this.repaymentDate;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  还款日
	 */
	public void setRepaymentDate(java.lang.String repaymentDate){
		this.repaymentDate = repaymentDate;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  还款方式
	 */

	@Column(name ="REPAYMENT_MODE",nullable=true,length=50)
	public java.lang.String getRepaymentMode(){
		return this.repaymentMode;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  还款方式
	 */
	public void setRepaymentMode(java.lang.String repaymentMode){
		this.repaymentMode = repaymentMode;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  结息周期
	 */

	@Column(name ="INTEREST_CYCLE",nullable=true,length=50)
	public java.lang.String getInterestCycle(){
		return this.interestCycle;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  结息周期
	 */
	public void setInterestCycle(java.lang.String interestCycle){
		this.interestCycle = interestCycle;
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
	 *@return: java.lang.String  担保单位
	 */

	@Column(name ="GUARANTOR",nullable=true,length=50)
	public java.lang.String getGuarantor(){
		return this.guarantor;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  担保单位
	 */
	public void setGuarantor(java.lang.String guarantor){
		this.guarantor = guarantor;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  放款单位
	 */

	@Column(name ="LENDER",nullable=true,length=50)
	public java.lang.String getLender(){
		return this.lender;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  放款单位
	 */
	public void setLender(java.lang.String lender){
		this.lender = lender;
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
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  录入时间
	 */

	@Column(name ="INPUT_TIME",nullable=true,length=50)
	public java.util.Date getInputTime(){
		return this.inputTime;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  录入时间
	 */
	public void setInputTime(java.util.Date inputTime){
		this.inputTime = inputTime;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  最后一次的修改人
	 */

	@Column(name ="UPDATE_PERSON",nullable=true,length=50)
	public java.lang.String getUpdatePerson(){
		return this.updatePerson;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  最后一次的修改人
	 */
	public void setUpdatePerson(java.lang.String updatePerson){
		this.updatePerson = updatePerson;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  最后一次的修改时间
	 */

	@Column(name ="UPDATE_TIME",nullable=true,length=50)
	public java.util.Date getUpdateTime(){
		return this.updateTime;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  最后一次的修改时间
	 */
	public void setUpdateTime(java.util.Date updateTime){
		this.updateTime = updateTime;
	}
}
