package com.brightedu.model.edu;

import java.io.Serializable;
import java.util.Date;

public class BankOrder extends BankOrderKey implements Serializable {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column edu.bank_order.is_paid
	 * @mbggenerated  Sat Feb 11 02:04:14 CST 2012
	 */
	private Boolean is_paid;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column edu.bank_order.bank_code
	 * @mbggenerated  Sat Feb 11 02:04:14 CST 2012
	 */
	private String bank_code;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column edu.bank_order.remark
	 * @mbggenerated  Sat Feb 11 02:04:14 CST 2012
	 */
	private String remark;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column edu.bank_order.register_date
	 * @mbggenerated  Sat Feb 11 02:04:14 CST 2012
	 */
	private Date register_date;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column edu.bank_order.user_id
	 * @mbggenerated  Sat Feb 11 02:04:14 CST 2012
	 */
	private Integer user_id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table edu.bank_order
	 * @mbggenerated  Sat Feb 11 02:04:14 CST 2012
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column edu.bank_order.is_paid
	 * @return  the value of edu.bank_order.is_paid
	 * @mbggenerated  Sat Feb 11 02:04:14 CST 2012
	 */
	public Boolean getIs_paid() {
		return is_paid;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column edu.bank_order.is_paid
	 * @param is_paid  the value for edu.bank_order.is_paid
	 * @mbggenerated  Sat Feb 11 02:04:14 CST 2012
	 */
	public void setIs_paid(Boolean is_paid) {
		this.is_paid = is_paid;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column edu.bank_order.bank_code
	 * @return  the value of edu.bank_order.bank_code
	 * @mbggenerated  Sat Feb 11 02:04:14 CST 2012
	 */
	public String getBank_code() {
		return bank_code;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column edu.bank_order.bank_code
	 * @param bank_code  the value for edu.bank_order.bank_code
	 * @mbggenerated  Sat Feb 11 02:04:14 CST 2012
	 */
	public void setBank_code(String bank_code) {
		this.bank_code = bank_code == null ? null : bank_code.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column edu.bank_order.remark
	 * @return  the value of edu.bank_order.remark
	 * @mbggenerated  Sat Feb 11 02:04:14 CST 2012
	 */
	public String getRemark() {
		return remark;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column edu.bank_order.remark
	 * @param remark  the value for edu.bank_order.remark
	 * @mbggenerated  Sat Feb 11 02:04:14 CST 2012
	 */
	public void setRemark(String remark) {
		this.remark = remark == null ? null : remark.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column edu.bank_order.register_date
	 * @return  the value of edu.bank_order.register_date
	 * @mbggenerated  Sat Feb 11 02:04:14 CST 2012
	 */
	public Date getRegister_date() {
		return register_date;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column edu.bank_order.register_date
	 * @param register_date  the value for edu.bank_order.register_date
	 * @mbggenerated  Sat Feb 11 02:04:14 CST 2012
	 */
	public void setRegister_date(Date register_date) {
		this.register_date = register_date;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column edu.bank_order.user_id
	 * @return  the value of edu.bank_order.user_id
	 * @mbggenerated  Sat Feb 11 02:04:14 CST 2012
	 */
	public Integer getUser_id() {
		return user_id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column edu.bank_order.user_id
	 * @param user_id  the value for edu.bank_order.user_id
	 * @mbggenerated  Sat Feb 11 02:04:14 CST 2012
	 */
	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}
}