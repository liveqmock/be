package com.brightedu.model.edu;

import java.math.BigDecimal;
import java.util.Date;

public class RefundmentAdmin {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column edu.refundment_admin.refund_id
	 * @mbggenerated  Mon Jan 16 17:46:15 CST 2012
	 */
	private Integer refund_id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column edu.refundment_admin.student_id
	 * @mbggenerated  Mon Jan 16 17:46:15 CST 2012
	 */
	private Integer student_id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column edu.refundment_admin.refund_fee
	 * @mbggenerated  Mon Jan 16 17:46:15 CST 2012
	 */
	private BigDecimal refund_fee;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column edu.refundment_admin.refund_desc
	 * @mbggenerated  Mon Jan 16 17:46:15 CST 2012
	 */
	private String refund_desc;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column edu.refundment_admin.refund_flag
	 * @mbggenerated  Mon Jan 16 17:46:15 CST 2012
	 */
	private Boolean refund_flag;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column edu.refundment_admin.user_id
	 * @mbggenerated  Mon Jan 16 17:46:15 CST 2012
	 */
	private Integer user_id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column edu.refundment_admin.register_date
	 * @mbggenerated  Mon Jan 16 17:46:15 CST 2012
	 */
	private Date register_date;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column edu.refundment_admin.update_date
	 * @mbggenerated  Mon Jan 16 17:46:15 CST 2012
	 */
	private Date update_date;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column edu.refundment_admin.refund_id
	 * @return  the value of edu.refundment_admin.refund_id
	 * @mbggenerated  Mon Jan 16 17:46:15 CST 2012
	 */
	public Integer getRefund_id() {
		return refund_id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column edu.refundment_admin.refund_id
	 * @param refund_id  the value for edu.refundment_admin.refund_id
	 * @mbggenerated  Mon Jan 16 17:46:15 CST 2012
	 */
	public void setRefund_id(Integer refund_id) {
		this.refund_id = refund_id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column edu.refundment_admin.student_id
	 * @return  the value of edu.refundment_admin.student_id
	 * @mbggenerated  Mon Jan 16 17:46:15 CST 2012
	 */
	public Integer getStudent_id() {
		return student_id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column edu.refundment_admin.student_id
	 * @param student_id  the value for edu.refundment_admin.student_id
	 * @mbggenerated  Mon Jan 16 17:46:15 CST 2012
	 */
	public void setStudent_id(Integer student_id) {
		this.student_id = student_id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column edu.refundment_admin.refund_fee
	 * @return  the value of edu.refundment_admin.refund_fee
	 * @mbggenerated  Mon Jan 16 17:46:15 CST 2012
	 */
	public BigDecimal getRefund_fee() {
		return refund_fee;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column edu.refundment_admin.refund_fee
	 * @param refund_fee  the value for edu.refundment_admin.refund_fee
	 * @mbggenerated  Mon Jan 16 17:46:15 CST 2012
	 */
	public void setRefund_fee(BigDecimal refund_fee) {
		this.refund_fee = refund_fee;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column edu.refundment_admin.refund_desc
	 * @return  the value of edu.refundment_admin.refund_desc
	 * @mbggenerated  Mon Jan 16 17:46:15 CST 2012
	 */
	public String getRefund_desc() {
		return refund_desc;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column edu.refundment_admin.refund_desc
	 * @param refund_desc  the value for edu.refundment_admin.refund_desc
	 * @mbggenerated  Mon Jan 16 17:46:15 CST 2012
	 */
	public void setRefund_desc(String refund_desc) {
		this.refund_desc = refund_desc == null ? null : refund_desc.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column edu.refundment_admin.refund_flag
	 * @return  the value of edu.refundment_admin.refund_flag
	 * @mbggenerated  Mon Jan 16 17:46:15 CST 2012
	 */
	public Boolean getRefund_flag() {
		return refund_flag;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column edu.refundment_admin.refund_flag
	 * @param refund_flag  the value for edu.refundment_admin.refund_flag
	 * @mbggenerated  Mon Jan 16 17:46:15 CST 2012
	 */
	public void setRefund_flag(Boolean refund_flag) {
		this.refund_flag = refund_flag;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column edu.refundment_admin.user_id
	 * @return  the value of edu.refundment_admin.user_id
	 * @mbggenerated  Mon Jan 16 17:46:15 CST 2012
	 */
	public Integer getUser_id() {
		return user_id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column edu.refundment_admin.user_id
	 * @param user_id  the value for edu.refundment_admin.user_id
	 * @mbggenerated  Mon Jan 16 17:46:15 CST 2012
	 */
	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column edu.refundment_admin.register_date
	 * @return  the value of edu.refundment_admin.register_date
	 * @mbggenerated  Mon Jan 16 17:46:15 CST 2012
	 */
	public Date getRegister_date() {
		return register_date;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column edu.refundment_admin.register_date
	 * @param register_date  the value for edu.refundment_admin.register_date
	 * @mbggenerated  Mon Jan 16 17:46:15 CST 2012
	 */
	public void setRegister_date(Date register_date) {
		this.register_date = register_date;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column edu.refundment_admin.update_date
	 * @return  the value of edu.refundment_admin.update_date
	 * @mbggenerated  Mon Jan 16 17:46:15 CST 2012
	 */
	public Date getUpdate_date() {
		return update_date;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column edu.refundment_admin.update_date
	 * @param update_date  the value for edu.refundment_admin.update_date
	 * @mbggenerated  Mon Jan 16 17:46:15 CST 2012
	 */
	public void setUpdate_date(Date update_date) {
		this.update_date = update_date;
	}
}