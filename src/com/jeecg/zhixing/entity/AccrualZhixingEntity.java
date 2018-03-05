package com.jeecg.zhixing.entity;

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
 * @Description: 执行情况
 * @author onlineGenerator
 * @date 2018-01-18 15:14:36
 * @version V1.0   
 *
 */
@Entity
@Table(name = "accrual_zhixing", schema = "")
@SuppressWarnings("serial")
public class AccrualZhixingEntity implements java.io.Serializable {
	/**主键*/
	private java.lang.String id;
	/**单据编号*/
	@Excel(name="单据编号",width=15)
	private java.lang.String billid;
	/**借款信息编号*/
	@Excel(name="借款信息编号",width=15,dictTable ="ACCRUAL_BORROW_INFO",dicCode ="id",dicText ="BORROW_INFO_ID")
	private java.lang.String borrowid;
	/**摘要*/
	@Excel(name="摘要",width=15)
	private java.lang.String zhaiyao;
	/**执行日期*/
	@Excel(name="执行日期",width=15,format = "yyyy-MM-dd")
	private java.util.Date dotime;
	/**应付本金*/
	@Excel(name="应付本金",width=15)
	private java.lang.String payprincipal;
	/**已还本金*/
	@Excel(name="已还本金",width=15)
	private java.lang.String returnprincipal;
	/**未还本金*/
	@Excel(name="未还本金",width=15)
	private java.lang.String unpaidprincipal;
	/**应付利息*/
	@Excel(name="应付利息",width=15)
	private java.lang.String interestpayable;
	/**已付利息*/
	@Excel(name="已付利息",width=15)
	private java.lang.String paidinterest;
	/**未付利息*/
	@Excel(name="未付利息",width=15,dicCode="bpm_status")
	private java.lang.String unpaidinterest;
	/**操作人*/
	@Excel(name="操作人",width=15)
	private java.lang.String userpeople;
	
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

	@Column(name ="BILLID",nullable=true,length=50)
	public java.lang.String getBillid(){
		return this.billid;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  单据编号
	 */
	public void setBillid(java.lang.String billid){
		this.billid = billid;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  借款信息编号
	 */

	@Column(name ="BORROWID",nullable=true,length=50)
	public java.lang.String getBorrowid(){
		return this.borrowid;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  借款信息编号
	 */
	public void setBorrowid(java.lang.String borrowid){
		this.borrowid = borrowid;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  摘要
	 */

	@Column(name ="ZHAIYAO",nullable=true,length=50)
	public java.lang.String getZhaiyao(){
		return this.zhaiyao;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  摘要
	 */
	public void setZhaiyao(java.lang.String zhaiyao){
		this.zhaiyao = zhaiyao;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  执行日期
	 */

	@Column(name ="DOTIME",nullable=true,length=50)
	public java.util.Date getDotime(){
		return this.dotime;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  执行日期
	 */
	public void setDotime(java.util.Date dotime){
		this.dotime = dotime;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  应付本金
	 */

	@Column(name ="PAYPRINCIPAL",nullable=true,length=50)
	public java.lang.String getPayprincipal(){
		return this.payprincipal;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  应付本金
	 */
	public void setPayprincipal(java.lang.String payprincipal){
		this.payprincipal = payprincipal;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  已还本金
	 */

	@Column(name ="RETURNPRINCIPAL",nullable=true,length=50)
	public java.lang.String getReturnprincipal(){
		return this.returnprincipal;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  已还本金
	 */
	public void setReturnprincipal(java.lang.String returnprincipal){
		this.returnprincipal = returnprincipal;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  未还本金
	 */

	@Column(name ="UNPAIDPRINCIPAL",nullable=true,length=50)
	public java.lang.String getUnpaidprincipal(){
		return this.unpaidprincipal;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  未还本金
	 */
	public void setUnpaidprincipal(java.lang.String unpaidprincipal){
		this.unpaidprincipal = unpaidprincipal;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  应付利息
	 */

	@Column(name ="INTERESTPAYABLE",nullable=true,length=50)
	public java.lang.String getInterestpayable(){
		return this.interestpayable;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  应付利息
	 */
	public void setInterestpayable(java.lang.String interestpayable){
		this.interestpayable = interestpayable;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  已付利息
	 */

	@Column(name ="PAIDINTEREST",nullable=true,length=50)
	public java.lang.String getPaidinterest(){
		return this.paidinterest;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  已付利息
	 */
	public void setPaidinterest(java.lang.String paidinterest){
		this.paidinterest = paidinterest;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  未付利息
	 */

	@Column(name ="UNPAIDINTEREST",nullable=true,length=50)
	public java.lang.String getUnpaidinterest(){
		return this.unpaidinterest;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  未付利息
	 */
	public void setUnpaidinterest(java.lang.String unpaidinterest){
		this.unpaidinterest = unpaidinterest;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  操作人
	 */

	@Column(name ="USERPEOPLE",nullable=true,length=50)
	public java.lang.String getUserpeople(){
		return this.userpeople;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  操作人
	 */
	public void setUserpeople(java.lang.String userpeople){
		this.userpeople = userpeople;
	}
}
