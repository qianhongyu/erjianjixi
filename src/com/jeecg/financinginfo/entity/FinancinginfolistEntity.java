package com.jeecg.financinginfo.entity;

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
 * @Description: 融资信息列表
 * @author onlineGenerator
 * @date 2018-02-09 14:20:13
 * @version V1.0   
 *
 */
@Entity
@Table(name = "financinginfolist", schema = "")
@SuppressWarnings("serial")
public class FinancinginfolistEntity implements java.io.Serializable {
	/**主键*/
	private java.lang.String id;
	/**合同编号*/
	@Excel(name="合同编号",width=15)
	private java.lang.String contractnumber;
	/**借款主体*/
	@Excel(name="借款主体",width=15,dictTable ="accrual_jkzt",dicCode ="id",dicText ="text")
	private java.lang.String loansubject;
	/**主体名称*/
	@Excel(name="主体名称",width=15)
	private java.lang.String subjectname;
	/**金融机构*/
	@Excel(name="金融机构",width=15,dictTable ="accrual_jrjg",dicCode ="id",dicText ="text")
	private java.lang.String financialinstitution;
	/**借款类别*/
	private java.lang.String loancategory;
	/**金额*/
	@Excel(name="金额",width=15)
	private java.lang.String money;
	/**年利率*/
	@Excel(name="年利率",width=15)
	private java.lang.String annualrate;
	/**银行利息外费用*/
	@Excel(name="银行利息外费用",width=15)
	private java.lang.String extraexpenses;
	/**担保方式*/
	@Excel(name="担保方式",width=15)
	private java.lang.String guaranteemethod;
	/**担保金额*/
	@Excel(name="担保金额",width=15)
	private java.lang.String guaranteemoney;
	/**起息日*/
	@Excel(name="起息日",width=15,format = "yyyy-MM-dd")
	private java.util.Date startinterestday;
	/**到息日*/
	@Excel(name="到息日",width=15,format = "yyyy-MM-dd")
	private java.util.Date endinterestday;
	/**月度利息*/
	@Excel(name="月度利息",width=15)
	private java.lang.String monthlyinterest;
	/**计息方式*/
	@Excel(name="计息方式",width=15,dictTable ="accrual_interest_type",dicCode ="id",dicText ="text")
	private java.lang.String wayofinterestaccrual;
	/**结息日*/
	@Excel(name="结息日",width=15,dictTable ="accrual_day",dicCode ="id",dicText ="day_id")
	private java.lang.String interestday;
	/**备注*/
	@Excel(name="备注",width=15)
	private java.lang.String remarks;
	
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

	@Column(name ="CONTRACTNUMBER",nullable=true,length=50)
	public java.lang.String getContractnumber(){
		return this.contractnumber;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  合同编号
	 */
	public void setContractnumber(java.lang.String contractnumber){
		this.contractnumber = contractnumber;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  借款主体
	 */

	@Column(name ="LOANSUBJECT",nullable=true,length=50)
	public java.lang.String getLoansubject(){
		return this.loansubject;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  借款主体
	 */
	public void setLoansubject(java.lang.String loansubject){
		this.loansubject = loansubject;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  主体名称
	 */

	@Column(name ="SUBJECTNAME",nullable=true,length=50)
	public java.lang.String getSubjectname(){
		return this.subjectname;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  主体名称
	 */
	public void setSubjectname(java.lang.String subjectname){
		this.subjectname = subjectname;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  金融机构
	 */

	@Column(name ="FINANCIALINSTITUTION",nullable=true,length=50)
	public java.lang.String getFinancialinstitution(){
		return this.financialinstitution;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  金融机构
	 */
	public void setFinancialinstitution(java.lang.String financialinstitution){
		this.financialinstitution = financialinstitution;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  借款类别
	 */

	@Column(name ="LOANCATEGORY",nullable=true,length=50)
	public java.lang.String getLoancategory(){
		return this.loancategory;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  借款类别
	 */
	public void setLoancategory(java.lang.String loancategory){
		this.loancategory = loancategory;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  金额
	 */

	@Column(name ="MONEY",nullable=true,length=50)
	public java.lang.String getMoney(){
		return this.money;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  金额
	 */
	public void setMoney(java.lang.String money){
		this.money = money;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  年利率
	 */

	@Column(name ="ANNUALRATE",nullable=true,length=50)
	public java.lang.String getAnnualrate(){
		return this.annualrate;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  年利率
	 */
	public void setAnnualrate(java.lang.String annualrate){
		this.annualrate = annualrate;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  银行利息外费用
	 */

	@Column(name ="EXTRAEXPENSES",nullable=true,length=50)
	public java.lang.String getExtraexpenses(){
		return this.extraexpenses;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  银行利息外费用
	 */
	public void setExtraexpenses(java.lang.String extraexpenses){
		this.extraexpenses = extraexpenses;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  担保方式
	 */

	@Column(name ="GUARANTEEMETHOD",nullable=true,length=50)
	public java.lang.String getGuaranteemethod(){
		return this.guaranteemethod;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  担保方式
	 */
	public void setGuaranteemethod(java.lang.String guaranteemethod){
		this.guaranteemethod = guaranteemethod;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  担保金额
	 */

	@Column(name ="GUARANTEEMONEY",nullable=true,length=50)
	public java.lang.String getGuaranteemoney(){
		return this.guaranteemoney;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  担保金额
	 */
	public void setGuaranteemoney(java.lang.String guaranteemoney){
		this.guaranteemoney = guaranteemoney;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  起息日
	 */

	@Column(name ="STARTINTERESTDAY",nullable=true,length=50)
	public java.util.Date getStartinterestday(){
		return this.startinterestday;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  起息日
	 */
	public void setStartinterestday(java.util.Date startinterestday){
		this.startinterestday = startinterestday;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  到息日
	 */

	@Column(name ="ENDINTERESTDAY",nullable=true,length=50)
	public java.util.Date getEndinterestday(){
		return this.endinterestday;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  到息日
	 */
	public void setEndinterestday(java.util.Date endinterestday){
		this.endinterestday = endinterestday;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  月度利息
	 */

	@Column(name ="MONTHLYINTEREST",nullable=true,length=50)
	public java.lang.String getMonthlyinterest(){
		return this.monthlyinterest;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  月度利息
	 */
	public void setMonthlyinterest(java.lang.String monthlyinterest){
		this.monthlyinterest = monthlyinterest;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  计息方式
	 */

	@Column(name ="WAYOFINTERESTACCRUAL",nullable=true,length=50)
	public java.lang.String getWayofinterestaccrual(){
		return this.wayofinterestaccrual;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  计息方式
	 */
	public void setWayofinterestaccrual(java.lang.String wayofinterestaccrual){
		this.wayofinterestaccrual = wayofinterestaccrual;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  结息日
	 */

	@Column(name ="INTERESTDAY",nullable=true,length=50)
	public java.lang.String getInterestday(){
		return this.interestday;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  结息日
	 */
	public void setInterestday(java.lang.String interestday){
		this.interestday = interestday;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  备注
	 */

	@Column(name ="REMARKS",nullable=true,length=50)
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
}
