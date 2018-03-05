package com.jeecg.lxhj.entity;

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
 * @Description: 借贷资金合计
 * @author onlineGenerator
 * @date 2018-01-11 15:00:26
 * @version V1.0   
 *
 */
@Entity
@Table(name = "accrual_lxhj", schema = "")
@SuppressWarnings("serial")
public class AccrualLxhjEntity implements java.io.Serializable {
	/**主键*/
	private java.lang.String id;
	/**已收总基础利息*/
	@Excel(name="已收总基础利息",width=15)
	private java.lang.String basicinterest;
	/**已收总超额利息*/
	@Excel(name="已收总超额利息",width=15)
	private java.lang.String excessinterest;
	/**已收利息合计*/
	@Excel(name="已收利息合计",width=15)
	private java.lang.String interestpayable;
	/**已收本金合计*/
	@Excel(name="已收本金合计",width=15)
	private java.lang.String benjin;
	/**利本合计*/
	@Excel(name="利本合计",width=15)
	private java.lang.String liben;
	
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
	 *@return: java.lang.String  已收总基础利息
	 */

	@Column(name ="BASICINTEREST",nullable=true,length=50)
	public java.lang.String getBasicinterest(){
		return this.basicinterest;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  已收总基础利息
	 */
	public void setBasicinterest(java.lang.String basicinterest){
		this.basicinterest = basicinterest;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  已收总超额利息
	 */

	@Column(name ="EXCESSINTEREST",nullable=true,length=50)
	public java.lang.String getExcessinterest(){
		return this.excessinterest;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  已收总超额利息
	 */
	public void setExcessinterest(java.lang.String excessinterest){
		this.excessinterest = excessinterest;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  已收利息合计
	 */

	@Column(name ="INTERESTPAYABLE",nullable=true,length=50)
	public java.lang.String getInterestpayable(){
		return this.interestpayable;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  已收利息合计
	 */
	public void setInterestpayable(java.lang.String interestpayable){
		this.interestpayable = interestpayable;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  已收本金合计
	 */

	@Column(name ="BENJIN",nullable=true,length=50)
	public java.lang.String getBenjin(){
		return this.benjin;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  已收本金合计
	 */
	public void setBenjin(java.lang.String benjin){
		this.benjin = benjin;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  利本合计
	 */

	@Column(name ="LIBEN",nullable=true,length=50)
	public java.lang.String getLiben(){
		return this.liben;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  利本合计
	 */
	public void setLiben(java.lang.String liben){
		this.liben = liben;
	}
}
