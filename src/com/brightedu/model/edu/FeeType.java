package com.brightedu.model.edu;

public class FeeType {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column edu.fee_type.fee_id
	 * @mbggenerated  Thu Feb 02 16:54:43 CST 2012
	 */
	private Integer fee_id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column edu.fee_type.fee_name
	 * @mbggenerated  Thu Feb 02 16:54:43 CST 2012
	 */
	private String fee_name;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column edu.fee_type.fee_id
	 * @return  the value of edu.fee_type.fee_id
	 * @mbggenerated  Thu Feb 02 16:54:43 CST 2012
	 */
	public Integer getFee_id() {
		return fee_id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column edu.fee_type.fee_id
	 * @param fee_id  the value for edu.fee_type.fee_id
	 * @mbggenerated  Thu Feb 02 16:54:43 CST 2012
	 */
	public void setFee_id(Integer fee_id) {
		this.fee_id = fee_id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column edu.fee_type.fee_name
	 * @return  the value of edu.fee_type.fee_name
	 * @mbggenerated  Thu Feb 02 16:54:43 CST 2012
	 */
	public String getFee_name() {
		return fee_name;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column edu.fee_type.fee_name
	 * @param fee_name  the value for edu.fee_type.fee_name
	 * @mbggenerated  Thu Feb 02 16:54:43 CST 2012
	 */
	public void setFee_name(String fee_name) {
		this.fee_name = fee_name == null ? null : fee_name.trim();
	}
}