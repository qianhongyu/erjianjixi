package com.jeecg.guarantee.entity;

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
 * @Description: 担保表
 * @author onlineGenerator
 * @date 2018-01-12 11:02:26
 * @version V1.0   
 *
 */
@Entity
@Table(name = "accrual_guarantee", schema = "")
@SuppressWarnings("serial")
public class AccrualGuaranteeEntity implements java.io.Serializable {
	/**主键*/
	private java.lang.String id;
	/**担保合同编号*/
	@Excel(name="担保合同编号",width=15)
	private java.lang.String gnumber;
	/**担保单位*/
	@Excel(name="担保单位",width=15)
	private java.lang.String guarantyunit;
	/**比率*/
	@Excel(name="比率",width=15)
	private java.lang.String ratio;
	/**保证金额*/
	@Excel(name="保证金额",width=15)
	private java.lang.String guaranteedamount;
	
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
	 *@return: java.lang.String  担保合同编号
	 */

	@Column(name ="GNUMBER",nullable=true,length=50)
	public java.lang.String getGnumber(){
		return this.gnumber;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  担保合同编号
	 */
	public void setGnumber(java.lang.String gnumber){
		this.gnumber = gnumber;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  担保单位
	 */

	@Column(name ="GUARANTYUNIT",nullable=true,length=50)
	public java.lang.String getGuarantyunit(){
		return this.guarantyunit;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  担保单位
	 */
	public void setGuarantyunit(java.lang.String guarantyunit){
		this.guarantyunit = guarantyunit;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  比率
	 */

	@Column(name ="RATIO",nullable=true,length=50)
	public java.lang.String getRatio(){
		return this.ratio;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  比率
	 */
	public void setRatio(java.lang.String ratio){
		this.ratio = ratio;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  保证金额
	 */

	@Column(name ="GUARANTEEDAMOUNT",nullable=true,length=50)
	public java.lang.String getGuaranteedamount(){
		return this.guaranteedamount;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  保证金额
	 */
	public void setGuaranteedamount(java.lang.String guaranteedamount){
		this.guaranteedamount = guaranteedamount;
	}
}
