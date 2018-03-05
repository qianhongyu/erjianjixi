package com.jeecg.rate.entity;

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
 * @Description: 利息设置
 * @author onlineGenerator
 * @date 2018-01-22 14:40:11
 * @version V1.0   
 *
 */
@Entity
@Table(name = "accrual_rate", schema = "")
@SuppressWarnings("serial")
public class AccrualRateEntity implements java.io.Serializable {
	/**主键*/
	private java.lang.String id;
	/**利率名称*/
	@Excel(name="利率名称",width=15)
	private java.lang.String ratename;
	/**利率类型*/
	@Excel(name="利率类型",width=15,dictTable ="accrual_rate_type",dicCode ="id",dicText ="text")
	private java.lang.String ratetype;
	/**日利率天数*/
	@Excel(name="日利率天数",width=15,dictTable ="accrual_rate_day",dicCode ="id",dicText ="text")
	private java.lang.String dayrateshu;
	/**年利率*/
	@Excel(name="年利率",width=15)
	private java.lang.String yearrate;
	/**月利率*/
	@Excel(name="月利率",width=15)
	private java.lang.String monthrate;
	/**日利率*/
	@Excel(name="日利率",width=15)
	private java.lang.String daterate;
	
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
	 *@return: java.lang.String  利率名称
	 */

	@Column(name ="RATENAME",nullable=true,length=50)
	public java.lang.String getRatename(){
		return this.ratename;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  利率名称
	 */
	public void setRatename(java.lang.String ratename){
		this.ratename = ratename;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  利率类型
	 */

	@Column(name ="RATETYPE",nullable=true,length=50)
	public java.lang.String getRatetype(){
		return this.ratetype;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  利率类型
	 */
	public void setRatetype(java.lang.String ratetype){
		this.ratetype = ratetype;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  日利率天数
	 */

	@Column(name ="DAYRATESHU",nullable=true,length=50)
	public java.lang.String getDayrateshu(){
		return this.dayrateshu;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  日利率天数
	 */
	public void setDayrateshu(java.lang.String dayrateshu){
		this.dayrateshu = dayrateshu;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  年利率
	 */

	@Column(name ="YEARRATE",nullable=true,length=50)
	public java.lang.String getYearrate(){
		return this.yearrate;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  年利率
	 */
	public void setYearrate(java.lang.String yearrate){
		this.yearrate = yearrate;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  月利率
	 */

	@Column(name ="MONTHRATE",nullable=true,length=50)
	public java.lang.String getMonthrate(){
		return this.monthrate;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  月利率
	 */
	public void setMonthrate(java.lang.String monthrate){
		this.monthrate = monthrate;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  日利率
	 */

	@Column(name ="DATERATE",nullable=true,length=50)
	public java.lang.String getDaterate(){
		return this.daterate;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  日利率
	 */
	public void setDaterate(java.lang.String daterate){
		this.daterate = daterate;
	}
}
