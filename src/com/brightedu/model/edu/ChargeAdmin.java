package com.brightedu.model.edu;

import java.math.BigDecimal;
import java.util.Date;

public class ChargeAdmin {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column edu.charge_admin.student_id
	 * @mbggenerated  Tue Jan 31 12:29:48 CST 2012
	 */
	private Integer student_id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column edu.charge_admin.fee_need
	 * @mbggenerated  Tue Jan 31 12:29:48 CST 2012
	 */
	private Long fee_need;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column edu.charge_admin.derate_id
	 * @mbggenerated  Tue Jan 31 12:29:48 CST 2012
	 */
	private Integer derate_id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column edu.charge_admin.charge_fee_paid
	 * @mbggenerated  Tue Jan 31 12:29:48 CST 2012
	 */
	private BigDecimal charge_fee_paid;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column edu.charge_admin.refund_id
	 * @mbggenerated  Tue Jan 31 12:29:48 CST 2012
	 */
	private Integer refund_id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column edu.charge_admin.register_date
	 * @mbggenerated  Tue Jan 31 12:29:48 CST 2012
	 */
	private Date register_date;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column edu.charge_admin.update_date
	 * @mbggenerated  Tue Jan 31 12:29:48 CST 2012
	 */
	private Date update_date;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column edu.charge_admin.student_id
	 * @return  the value of edu.charge_admin.student_id
	 * @mbggenerated  Tue Jan 31 12:29:48 CST 2012
	 */
	public Integer getStudent_id() {
		return student_id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column edu.charge_admin.student_id
	 * @param student_id  the value for edu.charge_admin.student_id
	 * @mbggenerated  Tue Jan 31 12:29:48 CST 2012
	 */
	public void setStudent_id(Integer student_id) {
		this.student_id = student_id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column edu.charge_admin.fee_need
	 * @return  the value of edu.charge_admin.fee_need
	 * @mbggenerated  Tue Jan 31 12:29:48 CST 2012
	 */
	public Long getFee_need() {
		return fee_need;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column edu.charge_admin.fee_need
	 * @param fee_need  the value for edu.charge_admin.fee_need
	 * @mbggenerated  Tue Jan 31 12:29:48 CST 2012
	 */
	public void setFee_need(Long fee_need) {
		this.fee_need = fee_need;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column edu.charge_admin.derate_id
	 * @return  the value of edu.charge_admin.derate_id
	 * @mbggenerated  Tue Jan 31 12:29:48 CST 2012
	 */
	public Integer getDerate_id() {
		return derate_id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column edu.charge_admin.derate_id
	 * @param derate_id  the value for edu.charge_admin.derate_id
	 * @mbggenerated  Tue Jan 31 12:29:48 CST 2012
	 */
	public void setDerate_id(Integer derate_id) {
		this.derate_id = derate_id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column edu.charge_admin.charge_fee_paid
	 * @return  the value of edu.charge_admin.charge_fee_paid
	 * @mbggenerated  Tue Jan 31 12:29:48 CST 2012
	 */
	public BigDecimal getCharge_fee_paid() {
		return charge_fee_paid;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column edu.charge_admin.charge_fee_paid
	 * @param charge_fee_paid  the value for edu.charge_admin.charge_fee_paid
	 * @mbggenerated  Tue Jan 31 12:29:48 CST 2012
	 */
	public void setCharge_fee_paid(BigDecimal charge_fee_paid) {
		this.charge_fee_paid = charge_fee_paid;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column edu.charge_admin.refund_id
	 * @return  the value of edu.charge_admin.refund_id
	 * @mbggenerated  Tue Jan 31 12:29:48 CST 2012
	 */
	public Integer getRefund_id() {
		return refund_id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column edu.charge_admin.refund_id
	 * @param refund_id  the value for edu.charge_admin.refund_id
	 * @mbggenerated  Tue Jan 31 12:29:48 CST 2012
	 */
	public void setRefund_id(Integer refund_id) {
		this.refund_id = refund_id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column edu.charge_admin.register_date
	 * @return  the value of edu.charge_admin.register_date
	 * @mbggenerated  Tue Jan 31 12:29:48 CST 2012
	 */
	public Date getRegister_date() {
		return register_date;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column edu.charge_admin.register_date
	 * @param register_date  the value for edu.charge_admin.register_date
	 * @mbggenerated  Tue Jan 31 12:29:48 CST 2012
	 */
	public void setRegister_date(Date register_date) {
		this.register_date = register_date;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column edu.charge_admin.update_date
	 * @return  the value of edu.charge_admin.update_date
	 * @mbggenerated  Tue Jan 31 12:29:48 CST 2012
	 */
	public Date getUpdate_date() {
		return update_date;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column edu.charge_admin.update_date
	 * @param update_date  the value for edu.charge_admin.update_date
	 * @mbggenerated  Tue Jan 31 12:29:48 CST 2012
	 */
	public void setUpdate_date(Date update_date) {
		this.update_date = update_date;
	}
}