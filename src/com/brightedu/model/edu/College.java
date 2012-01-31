package com.brightedu.model.edu;

import java.util.Date;

public class College {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column edu.co_college.college_id
	 * @mbggenerated  Tue Jan 31 12:29:48 CST 2012
	 */
	private Integer college_id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column edu.co_college.college_name
	 * @mbggenerated  Tue Jan 31 12:29:48 CST 2012
	 */
	private String college_name;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column edu.co_college.register_date
	 * @mbggenerated  Tue Jan 31 12:29:48 CST 2012
	 */
	private Date register_date;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column edu.co_college.college_id
	 * @return  the value of edu.co_college.college_id
	 * @mbggenerated  Tue Jan 31 12:29:48 CST 2012
	 */
	public Integer getCollege_id() {
		return college_id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column edu.co_college.college_id
	 * @param college_id  the value for edu.co_college.college_id
	 * @mbggenerated  Tue Jan 31 12:29:48 CST 2012
	 */
	public void setCollege_id(Integer college_id) {
		this.college_id = college_id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column edu.co_college.college_name
	 * @return  the value of edu.co_college.college_name
	 * @mbggenerated  Tue Jan 31 12:29:48 CST 2012
	 */
	public String getCollege_name() {
		return college_name;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column edu.co_college.college_name
	 * @param college_name  the value for edu.co_college.college_name
	 * @mbggenerated  Tue Jan 31 12:29:48 CST 2012
	 */
	public void setCollege_name(String college_name) {
		this.college_name = college_name == null ? null : college_name.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column edu.co_college.register_date
	 * @return  the value of edu.co_college.register_date
	 * @mbggenerated  Tue Jan 31 12:29:48 CST 2012
	 */
	public Date getRegister_date() {
		return register_date;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column edu.co_college.register_date
	 * @param register_date  the value for edu.co_college.register_date
	 * @mbggenerated  Tue Jan 31 12:29:48 CST 2012
	 */
	public void setRegister_date(Date register_date) {
		this.register_date = register_date;
	}
}