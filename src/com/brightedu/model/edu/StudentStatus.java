package com.brightedu.model.edu;

import java.io.Serializable;
import java.math.BigDecimal;

public class StudentStatus implements Serializable {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column edu.student_status.stu_status_id
	 * @mbggenerated  Sun Feb 12 20:55:12 CST 2012
	 */
	private Integer stu_status_id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column edu.student_status.stu_status_name
	 * @mbggenerated  Sun Feb 12 20:55:12 CST 2012
	 */
	private String stu_status_name;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table edu.student_status
	 * @mbggenerated  Sun Feb 12 20:55:12 CST 2012
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column edu.student_status.stu_status_id
	 * @return  the value of edu.student_status.stu_status_id
	 * @mbggenerated  Sun Feb 12 20:55:12 CST 2012
	 */
	public Integer getStu_status_id() {
		return stu_status_id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column edu.student_status.stu_status_id
	 * @param stu_status_id  the value for edu.student_status.stu_status_id
	 * @mbggenerated  Sun Feb 12 20:55:12 CST 2012
	 */
	public void setStu_status_id(Integer stu_status_id) {
		this.stu_status_id = stu_status_id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column edu.student_status.stu_status_name
	 * @return  the value of edu.student_status.stu_status_name
	 * @mbggenerated  Sun Feb 12 20:55:12 CST 2012
	 */
	public String getStu_status_name() {
		return stu_status_name;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column edu.student_status.stu_status_name
	 * @param stu_status_name  the value for edu.student_status.stu_status_name
	 * @mbggenerated  Sun Feb 12 20:55:12 CST 2012
	 */
	public void setStu_status_name(String stu_status_name) {
		this.stu_status_name = stu_status_name == null ? null : stu_status_name
				.trim();
	}
}