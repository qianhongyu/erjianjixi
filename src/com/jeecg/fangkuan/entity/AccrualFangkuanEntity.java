package com.jeecg.fangkuan.entity;

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
 * @Description: 合同放款
 * @author onlineGenerator
 * @date 2018-01-24 10:56:59
 * @version V1.0   
 *
 */
@Entity
@Table(name = "accrual_fangkuan", schema = "")
@SuppressWarnings("serial")
public class AccrualFangkuanEntity implements java.io.Serializable {
	/**主键*/
	private java.lang.String id;
	/**单据编号*/
	@Excel(name="单据编号",width=15)
	private java.lang.String danjuId;
	/**合同编号*/
	@Excel(name="合同编号",width=15)
	private java.lang.String hetongId;
	/**贷款单位*/
	@Excel(name="贷款单位",width=15,dictTable ="accrual_newbank_contractlist",dicCode ="id",dicText ="loan_unit")
	private java.lang.String daikuanunit;
	/**合同类型*/
	@Excel(name="合同类型",width=15,dictTable ="accrual_contract_nature",dicCode ="id",dicText ="text")
	private java.lang.String contracttype;
	/**借款单位*/
	@Excel(name="借款单位",width=15,dictTable ="accrual_newbank_contractlist",dicCode ="id",dicText ="borrower")
	private java.lang.String jiekuanunit;
	/**合同金额*/
	@Excel(name="合同金额",width=15,dictTable ="accrual_newbank_contractlist",dicCode ="id",dicText ="loan_amount")
	private java.lang.String contractjine;
	/**区域公司*/
	@Excel(name="区域公司",width=15,dictTable ="accrual_newbank_contractlist",dicCode ="id",dicText ="regional_company")
	private java.lang.String quyucompany;
	/**结息日*/
	@Excel(name="结息日",width=15,dictTable ="accrual_newbank_contractlist",dicCode ="id",dicText ="interest_day")
	private java.lang.String jiexiday;
	/**承包商*/
	@Excel(name="承包商",width=15,dictTable ="accrual_newbank_contractlist",dicCode ="id",dicText ="contractor")
	private java.lang.String cbscompany;
	/**合同起始日期*/
	@Excel(name="合同起始日期",width=15,format = "yyyy-MM-dd",dictTable ="accrual_newbank_contractlist",dicCode ="id",dicText ="start_date")
	private java.util.Date contractqsrq;
	/**项目部*/
	@Excel(name="项目部",width=15,dictTable ="accrual_newbank_contractlist",dicCode ="id",dicText ="project_department")
	private java.lang.String xmbcompany;
	/**合同终止日期*/
	@Excel(name="合同终止日期",width=15,format = "yyyy-MM-dd",dictTable ="accrual_newbank_contractlist",dicCode ="id",dicText ="end_date")
	private java.util.Date contractzzrq;
	/**基础利率*/
	@Excel(name="基础利率",width=15,dictTable ="accrual_rate",dicCode ="id",dicText ="yearrate")
	private java.lang.String baserate;
	/**超额利率*/
	@Excel(name="超额利率",width=15,dictTable ="accrual_rate",dicCode ="id",dicText ="yearrate")
	private java.lang.String overrate;
	/**放款金额*/
	@Excel(name="放款金额",width=15)
	private java.lang.String fangkuanjine;
	/**单据状态*/
	@Excel(name="单据状态",width=15)
	private java.lang.String danjuzt;
	/**备注*/
	@Excel(name="备注",width=15)
	private java.lang.String note;
	/**制单人*/
	@Excel(name="制单人",width=15)
	private java.lang.String zhidanren;
	/**制单日期*/
	@Excel(name="制单日期",width=15,format = "yyyy-MM-dd")
	private java.util.Date zhidandate;
	/**审核人*/
	@Excel(name="审核人",width=15)
	private java.lang.String shenheren;
	/**审核日期*/
	@Excel(name="审核日期",width=15,format = "yyyy-MM-dd")
	private java.util.Date shenhedate;
	
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
	 *@return: java.lang.String  单据编号
	 */

	@Column(name ="DANJU_ID",nullable=true,length=50)
	public java.lang.String getDanjuId(){
		return this.danjuId;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  单据编号
	 */
	public void setDanjuId(java.lang.String danjuId){
		this.danjuId = danjuId;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  合同编号
	 */

	@Column(name ="HETONG_ID",nullable=true,length=50)
	public java.lang.String getHetongId(){
		return this.hetongId;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  合同编号
	 */
	public void setHetongId(java.lang.String hetongId){
		this.hetongId = hetongId;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  贷款单位
	 */

	@Column(name ="DAIKUANUNIT",nullable=true,length=50)
	public java.lang.String getDaikuanunit(){
		return this.daikuanunit;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  贷款单位
	 */
	public void setDaikuanunit(java.lang.String daikuanunit){
		this.daikuanunit = daikuanunit;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  合同类型
	 */

	@Column(name ="CONTRACTTYPE",nullable=true,length=50)
	public java.lang.String getContracttype(){
		return this.contracttype;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  合同类型
	 */
	public void setContracttype(java.lang.String contracttype){
		this.contracttype = contracttype;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  借款单位
	 */

	@Column(name ="JIEKUANUNIT",nullable=true,length=50)
	public java.lang.String getJiekuanunit(){
		return this.jiekuanunit;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  借款单位
	 */
	public void setJiekuanunit(java.lang.String jiekuanunit){
		this.jiekuanunit = jiekuanunit;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  合同金额
	 */

	@Column(name ="CONTRACTJINE",nullable=true,length=50)
	public java.lang.String getContractjine(){
		return this.contractjine;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  合同金额
	 */
	public void setContractjine(java.lang.String contractjine){
		this.contractjine = contractjine;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  区域公司
	 */

	@Column(name ="QUYUCOMPANY",nullable=true,length=50)
	public java.lang.String getQuyucompany(){
		return this.quyucompany;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  区域公司
	 */
	public void setQuyucompany(java.lang.String quyucompany){
		this.quyucompany = quyucompany;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  结息日
	 */

	@Column(name ="JIEXIDAY",nullable=true,length=50)
	public java.lang.String getJiexiday(){
		return this.jiexiday;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  结息日
	 */
	public void setJiexiday(java.lang.String jiexiday){
		this.jiexiday = jiexiday;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  承包商
	 */

	@Column(name ="CBSCOMPANY",nullable=true,length=50)
	public java.lang.String getCbscompany(){
		return this.cbscompany;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  承包商
	 */
	public void setCbscompany(java.lang.String cbscompany){
		this.cbscompany = cbscompany;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  合同起始日期
	 */

	@Column(name ="CONTRACTQSRQ",nullable=true,length=50)
	public java.util.Date getContractqsrq(){
		return this.contractqsrq;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  合同起始日期
	 */
	public void setContractqsrq(java.util.Date contractqsrq){
		this.contractqsrq = contractqsrq;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  项目部
	 */

	@Column(name ="XMBCOMPANY",nullable=true,length=50)
	public java.lang.String getXmbcompany(){
		return this.xmbcompany;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  项目部
	 */
	public void setXmbcompany(java.lang.String xmbcompany){
		this.xmbcompany = xmbcompany;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  合同终止日期
	 */

	@Column(name ="CONTRACTZZRQ",nullable=true,length=50)
	public java.util.Date getContractzzrq(){
		return this.contractzzrq;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  合同终止日期
	 */
	public void setContractzzrq(java.util.Date contractzzrq){
		this.contractzzrq = contractzzrq;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  基础利率
	 */

	@Column(name ="BASERATE",nullable=true,length=50)
	public java.lang.String getBaserate(){
		return this.baserate;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  基础利率
	 */
	public void setBaserate(java.lang.String baserate){
		this.baserate = baserate;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  超额利率
	 */

	@Column(name ="OVERRATE",nullable=true,length=50)
	public java.lang.String getOverrate(){
		return this.overrate;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  超额利率
	 */
	public void setOverrate(java.lang.String overrate){
		this.overrate = overrate;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  放款金额
	 */

	@Column(name ="FANGKUANJINE",nullable=true,length=50)
	public java.lang.String getFangkuanjine(){
		return this.fangkuanjine;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  放款金额
	 */
	public void setFangkuanjine(java.lang.String fangkuanjine){
		this.fangkuanjine = fangkuanjine;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  单据状态
	 */

	@Column(name ="DANJUZT",nullable=true,length=50)
	public java.lang.String getDanjuzt(){
		return this.danjuzt;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  单据状态
	 */
	public void setDanjuzt(java.lang.String danjuzt){
		this.danjuzt = danjuzt;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  备注
	 */

	@Column(name ="NOTE",nullable=true,length=50)
	public java.lang.String getNote(){
		return this.note;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  备注
	 */
	public void setNote(java.lang.String note){
		this.note = note;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  制单人
	 */

	@Column(name ="ZHIDANREN",nullable=true,length=50)
	public java.lang.String getZhidanren(){
		return this.zhidanren;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  制单人
	 */
	public void setZhidanren(java.lang.String zhidanren){
		this.zhidanren = zhidanren;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  制单日期
	 */

	@Column(name ="ZHIDANDATE",nullable=true,length=50)
	public java.util.Date getZhidandate(){
		return this.zhidandate;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  制单日期
	 */
	public void setZhidandate(java.util.Date zhidandate){
		this.zhidandate = zhidandate;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  审核人
	 */

	@Column(name ="SHENHEREN",nullable=true,length=50)
	public java.lang.String getShenheren(){
		return this.shenheren;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  审核人
	 */
	public void setShenheren(java.lang.String shenheren){
		this.shenheren = shenheren;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  审核日期
	 */

	@Column(name ="SHENHEDATE",nullable=true,length=50)
	public java.util.Date getShenhedate(){
		return this.shenhedate;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  审核日期
	 */
	public void setShenhedate(java.util.Date shenhedate){
		this.shenhedate = shenhedate;
	}
}
