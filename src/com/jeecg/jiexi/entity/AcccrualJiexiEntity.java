package com.jeecg.jiexi.entity;

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
 * @Description: 结息方式
 * @author onlineGenerator
 * @date 2018-01-22 15:11:44
 * @version V1.0   
 *
 */
@Entity
@Table(name = "acccrual_jiexi", schema = "")
@SuppressWarnings("serial")
public class AcccrualJiexiEntity implements java.io.Serializable {
	/**主键*/
	private java.lang.String id;
	/**结息方式*/
	@Excel(name="结息方式",width=15,dictTable ="accrual_interest_type",dicCode ="id",dicText ="text")
	private java.lang.String interesttype;
	/**结息周期*/
	@Excel(name="结息周期",width=15)
	private java.lang.String interestcycle;
	/**周期单位*/
	@Excel(name="周期单位",width=15,dictTable ="accrual_interest_unit",dicCode ="id",dicText ="text")
	private java.lang.String periodicunit;
	/**期末余额结息日*/
	@Excel(name="期末余额结息日",width=15)
	private java.lang.String lastday;
	
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
	 *@return: java.lang.String  结息方式
	 */

	@Column(name ="INTERESTTYPE",nullable=true,length=50)
	public java.lang.String getInteresttype(){
		return this.interesttype;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  结息方式
	 */
	public void setInteresttype(java.lang.String interesttype){
		this.interesttype = interesttype;
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
	 *@return: java.lang.String  周期单位
	 */

	@Column(name ="PERIODICUNIT",nullable=true,length=50)
	public java.lang.String getPeriodicunit(){
		return this.periodicunit;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  周期单位
	 */
	public void setPeriodicunit(java.lang.String periodicunit){
		this.periodicunit = periodicunit;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  期末余额结息日
	 */

	@Column(name ="LASTDAY",nullable=true,length=50)
	public java.lang.String getLastday(){
		return this.lastday;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  期末余额结息日
	 */
	public void setLastday(java.lang.String lastday){
		this.lastday = lastday;
	}
}
