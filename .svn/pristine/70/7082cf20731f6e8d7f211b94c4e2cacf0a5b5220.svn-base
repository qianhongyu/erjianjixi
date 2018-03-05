package com.jeecg.info.entity;

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
 * @Description: 银行借贷
 * @author onlineGenerator
 * @date 2018-01-16 10:24:22
 * @version V1.0   
 *
 */
@Entity
@Table(name = "accrual_info", schema = "")
@SuppressWarnings("serial")
public class AccrualInfoEntity implements java.io.Serializable {
	/**主键*/
	private java.lang.String id;
	/**对应的合同id*/
	@Excel(name="对应的合同id",width=15,dictTable ="accrual_all_contract",dicCode ="id",dicText ="contract_name")
	private java.lang.String hetongId;
	/**借款金额*/
	@Excel(name="借款金额",width=15)
	private java.lang.String loanamount;
	/**基础利率*/
	@Excel(name="基础利率",width=15,dictTable ="accrual_basic_rate",dicCode ="id",dicText ="basic_rate")
	private java.lang.String basicrate;
	/**超额利率*/
	@Excel(name="超额利率",width=15,dictTable ="accrual_excessinterest_rate",dicCode ="id",dicText ="excessinterest_rate")
	private java.lang.String excessinterestrate;
	/**开始时间*/
	@Excel(name="开始时间",width=15,format = "yyyy-MM-dd")
	private java.util.Date starttime;
	/**结束时间*/
	@Excel(name="结束时间",width=15,format = "yyyy-MM-dd")
	private java.util.Date endtime;
	/**结息日*/
	@Excel(name="结息日",width=15,dictTable ="accrual_day",dicCode ="id",dicText ="day_id")
	private java.lang.Integer period;
	/**还款日*/
	@Excel(name="还款日",width=15,dictTable ="accrual_day",dicCode ="id",dicText ="day_id")
	private java.lang.Integer repaymentdate;
	/**还款方式*/
	@Excel(name="还款方式",width=15,dictTable ="accrual_info_type1",dicCode ="id",dicText ="type1")
	private java.lang.String repaymentmode;
	/**结息周期*/
	@Excel(name="结息周期",width=15,dictTable ="accrual_info_jg",dicCode ="id",dicText ="text")
	private java.lang.String interestcycle;
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
	private java.lang.String inputperson;
	/**录入时间*/
	@Excel(name="录入时间",width=15,format = "yyyy-MM-dd")
	private java.util.Date inputtime;
	/**最后一次的修改人*/
	@Excel(name="最后一次的修改人",width=15)
	private java.lang.String changeperson;
	/**最后一次的修改时间*/
	@Excel(name="最后一次的修改时间",width=15,format = "yyyy-MM-dd")
	private java.util.Date changetime;
	
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
	 *@return: java.lang.String  对应的合同id
	 */

	@Column(name ="HETONG_ID",nullable=true,length=50)
	public java.lang.String getHetongId(){
		return this.hetongId;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  对应的合同id
	 */
	public void setHetongId(java.lang.String hetongId){
		this.hetongId = hetongId;
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

	@Column(name ="BASICRATE",nullable=true,length=50)
	public java.lang.String getBasicrate(){
		return this.basicrate;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  基础利率
	 */
	public void setBasicrate(java.lang.String basicrate){
		this.basicrate = basicrate;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  超额利率
	 */

	@Column(name ="EXCESSINTERESTRATE",nullable=true,length=50)
	public java.lang.String getExcessinterestrate(){
		return this.excessinterestrate;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  超额利率
	 */
	public void setExcessinterestrate(java.lang.String excessinterestrate){
		this.excessinterestrate = excessinterestrate;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  开始时间
	 */

	@Column(name ="STARTTIME",nullable=true,length=50)
	public java.util.Date getStarttime(){
		return this.starttime;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  开始时间
	 */
	public void setStarttime(java.util.Date starttime){
		this.starttime = starttime;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  结束时间
	 */

	@Column(name ="ENDTIME",nullable=true,length=50)
	public java.util.Date getEndtime(){
		return this.endtime;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  结束时间
	 */
	public void setEndtime(java.util.Date endtime){
		this.endtime = endtime;
	}
	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  结息日
	 */

	@Column(name ="PERIOD",nullable=true,length=50)
	public java.lang.Integer getPeriod(){
		return this.period;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  结息日
	 */
	public void setPeriod(java.lang.Integer period){
		this.period = period;
	}
	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  还款日
	 */

	@Column(name ="REPAYMENTDATE",nullable=true,length=50)
	public java.lang.Integer getRepaymentdate(){
		return this.repaymentdate;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  还款日
	 */
	public void setRepaymentdate(java.lang.Integer repaymentdate){
		this.repaymentdate = repaymentdate;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  还款方式
	 */

	@Column(name ="REPAYMENTMODE",nullable=true,length=50)
	public java.lang.String getRepaymentmode(){
		return this.repaymentmode;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  还款方式
	 */
	public void setRepaymentmode(java.lang.String repaymentmode){
		this.repaymentmode = repaymentmode;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  结息周期
	 */

	@Column(name ="INTERESTCYCLE",nullable=true,length=50)
	public java.lang.String getInterestcycle(){
		return this.interestcycle;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  结息周期
	 */
	public void setInterestcycle(java.lang.String interestcycle){
		this.interestcycle = interestcycle;
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

	@Column(name ="INPUTPERSON",nullable=true,length=50)
	public java.lang.String getInputperson(){
		return this.inputperson;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  录入人
	 */
	public void setInputperson(java.lang.String inputperson){
		this.inputperson = inputperson;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  录入时间
	 */

	@Column(name ="INPUTTIME",nullable=true,length=50)
	public java.util.Date getInputtime(){
		return this.inputtime;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  录入时间
	 */
	public void setInputtime(java.util.Date inputtime){
		this.inputtime = inputtime;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  最后一次的修改人
	 */

	@Column(name ="CHANGEPERSON",nullable=true,length=50)
	public java.lang.String getChangeperson(){
		return this.changeperson;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  最后一次的修改人
	 */
	public void setChangeperson(java.lang.String changeperson){
		this.changeperson = changeperson;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  最后一次的修改时间
	 */

	@Column(name ="CHANGETIME",nullable=true,length=50)
	public java.util.Date getChangetime(){
		return this.changetime;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  最后一次的修改时间
	 */
	public void setChangetime(java.util.Date changetime){
		this.changetime = changetime;
	}
}
