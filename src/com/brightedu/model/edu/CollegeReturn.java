package com.brightedu.model.edu;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class CollegeReturn extends CollegeReturnKey implements Serializable {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column edu.college_return.fee_id
	 * @mbggenerated  Sat Feb 11 02:04:14 CST 2012
	 */
	private Integer fee_id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column edu.college_return.return_percent
	 * @mbggenerated  Sat Feb 11 02:04:14 CST 2012
	 */
	private BigDecimal return_percent;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column edu.college_return.register_date
	 * @mbggenerated  Sat Feb 11 02:04:14 CST 2012
	 */
	private Date register_date;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column edu.college_return.update_date
	 * @mbggenerated  Sat Feb 11 02:04:14 CST 2012
	 */
	private Date update_date;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table edu.college_return
	 * @mbggenerated  Sat Feb 11 02:04:14 CST 2012
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column edu.college_return.fee_id
	 * @return  the value of edu.college_return.fee_id
	 * @mbggenerated  Sat Feb 11 02:04:14 CST 2012
	 */
	public Integer getFee_id() {
		return fee_id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column edu.college_return.fee_id
	 * @param fee_id  the value for edu.college_return.fee_id
	 * @mbggenerated  Sat Feb 11 02:04:14 CST 2012
	 */
	public void setFee_id(Integer fee_id) {
		this.fee_id = fee_id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column edu.college_return.return_percent
	 * @return  the value of edu.college_return.return_percent
	 * @mbggenerated  Sat Feb 11 02:04:14 CST 2012
	 */
	public BigDecimal getReturn_percent() {
		return return_percent;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column edu.college_return.return_percent
	 * @param return_percent  the value for edu.college_return.return_percent
	 * @mbggenerated  Sat Feb 11 02:04:14 CST 2012
	 */
	public void setReturn_percent(BigDecimal return_percent) {
		this.return_percent = return_percent;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column edu.college_return.register_date
	 * @return  the value of edu.college_return.register_date
	 * @mbggenerated  Sat Feb 11 02:04:14 CST 2012
	 */
	public Date getRegister_date() {
		return register_date;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column edu.college_return.register_date
	 * @param register_date  the value for edu.college_return.register_date
	 * @mbggenerated  Sat Feb 11 02:04:14 CST 2012
	 */
	public void setRegister_date(Date register_date) {
		this.register_date = register_date;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column edu.college_return.update_date
	 * @return  the value of edu.college_return.update_date
	 * @mbggenerated  Sat Feb 11 02:04:14 CST 2012
	 */
	public Date getUpdate_date() {
		return update_date;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column edu.college_return.update_date
	 * @param update_date  the value for edu.college_return.update_date
	 * @mbggenerated  Sat Feb 11 02:04:14 CST 2012
	 */
	public void setUpdate_date(Date update_date) {
		this.update_date = update_date;
	}
}