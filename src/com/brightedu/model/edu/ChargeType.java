package com.brightedu.model.edu;

import java.io.Serializable;

public class ChargeType implements Serializable {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column edu.charge_type.charge_type_id
	 * @mbggenerated  Sat Feb 11 02:04:14 CST 2012
	 */
	private Integer charge_type_id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column edu.charge_type.charge_type_name
	 * @mbggenerated  Sat Feb 11 02:04:14 CST 2012
	 */
	private String charge_type_name;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table edu.charge_type
	 * @mbggenerated  Sat Feb 11 02:04:14 CST 2012
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column edu.charge_type.charge_type_id
	 * @return  the value of edu.charge_type.charge_type_id
	 * @mbggenerated  Sat Feb 11 02:04:14 CST 2012
	 */
	public Integer getCharge_type_id() {
		return charge_type_id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column edu.charge_type.charge_type_id
	 * @param charge_type_id  the value for edu.charge_type.charge_type_id
	 * @mbggenerated  Sat Feb 11 02:04:14 CST 2012
	 */
	public void setCharge_type_id(Integer charge_type_id) {
		this.charge_type_id = charge_type_id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column edu.charge_type.charge_type_name
	 * @return  the value of edu.charge_type.charge_type_name
	 * @mbggenerated  Sat Feb 11 02:04:14 CST 2012
	 */
	public String getCharge_type_name() {
		return charge_type_name;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column edu.charge_type.charge_type_name
	 * @param charge_type_name  the value for edu.charge_type.charge_type_name
	 * @mbggenerated  Sat Feb 11 02:04:14 CST 2012
	 */
	public void setCharge_type_name(String charge_type_name) {
		this.charge_type_name = charge_type_name == null ? null
				: charge_type_name.trim();
	}
}