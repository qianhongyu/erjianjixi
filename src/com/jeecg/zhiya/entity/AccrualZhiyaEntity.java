package com.jeecg.zhiya.entity;

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
 * @Description: 质押信息
 * @author onlineGenerator
 * @date 2018-01-09 10:55:29
 * @version V1.0   
 *
 */
@Entity
@Table(name = "accrual_zhiya", schema = "")
@SuppressWarnings("serial")
public class AccrualZhiyaEntity implements java.io.Serializable {
	/**主键*/
	private java.lang.String id;
	/**所有权单位*/
	@Excel(name="所有权单位",width=15)
	private java.lang.String ownershipunit;
	/**抵押物*/
	@Excel(name="抵押物",width=15)
	private java.lang.String mortgages;
	/**评估价值*/
	@Excel(name="评估价值",width=15)
	private java.lang.String evaluationvalue;
	/**评估单位*/
	@Excel(name="评估单位",width=15)
	private java.lang.String evaluationunit;
	/**可抵押价值*/
	@Excel(name="可抵押价值",width=15)
	private java.lang.String mortgagedvalue;
	/**累计已抵押价值*/
	@Excel(name="累计已抵押价值",width=15)
	private java.lang.String toatlmortgagedvalue;
	/**剩余抵押价值*/
	@Excel(name="剩余抵押价值",width=15)
	private java.lang.String surplusmortgagedvalue;
	/**实际使用可抵押值*/
	@Excel(name="实际使用可抵押值",width=15)
	private java.lang.String actualmortgagedvalue;
	
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
	 *@return: java.lang.String  所有权单位
	 */

	@Column(name ="OWNERSHIPUNIT",nullable=true,length=50)
	public java.lang.String getOwnershipunit(){
		return this.ownershipunit;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  所有权单位
	 */
	public void setOwnershipunit(java.lang.String ownershipunit){
		this.ownershipunit = ownershipunit;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  抵押物
	 */

	@Column(name ="MORTGAGES",nullable=true,length=50)
	public java.lang.String getMortgages(){
		return this.mortgages;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  抵押物
	 */
	public void setMortgages(java.lang.String mortgages){
		this.mortgages = mortgages;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  评估价值
	 */

	@Column(name ="EVALUATIONVALUE",nullable=true,length=50)
	public java.lang.String getEvaluationvalue(){
		return this.evaluationvalue;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  评估价值
	 */
	public void setEvaluationvalue(java.lang.String evaluationvalue){
		this.evaluationvalue = evaluationvalue;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  评估单位
	 */

	@Column(name ="EVALUATIONUNIT",nullable=true,length=50)
	public java.lang.String getEvaluationunit(){
		return this.evaluationunit;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  评估单位
	 */
	public void setEvaluationunit(java.lang.String evaluationunit){
		this.evaluationunit = evaluationunit;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  可抵押价值
	 */

	@Column(name ="MORTGAGEDVALUE",nullable=true,length=50)
	public java.lang.String getMortgagedvalue(){
		return this.mortgagedvalue;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  可抵押价值
	 */
	public void setMortgagedvalue(java.lang.String mortgagedvalue){
		this.mortgagedvalue = mortgagedvalue;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  累计已抵押价值
	 */

	@Column(name ="TOATLMORTGAGEDVALUE",nullable=true,length=50)
	public java.lang.String getToatlmortgagedvalue(){
		return this.toatlmortgagedvalue;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  累计已抵押价值
	 */
	public void setToatlmortgagedvalue(java.lang.String toatlmortgagedvalue){
		this.toatlmortgagedvalue = toatlmortgagedvalue;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  剩余抵押价值
	 */

	@Column(name ="SURPLUSMORTGAGEDVALUE",nullable=true,length=50)
	public java.lang.String getSurplusmortgagedvalue(){
		return this.surplusmortgagedvalue;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  剩余抵押价值
	 */
	public void setSurplusmortgagedvalue(java.lang.String surplusmortgagedvalue){
		this.surplusmortgagedvalue = surplusmortgagedvalue;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  实际使用可抵押值
	 */

	@Column(name ="ACTUALMORTGAGEDVALUE",nullable=true,length=50)
	public java.lang.String getActualmortgagedvalue(){
		return this.actualmortgagedvalue;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  实际使用可抵押值
	 */
	public void setActualmortgagedvalue(java.lang.String actualmortgagedvalue){
		this.actualmortgagedvalue = actualmortgagedvalue;
	}
}
