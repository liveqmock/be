package com.brightedu.model.edu;

import java.util.Date;

public class StudentChange {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column edu.student_change.change_id
	 * @mbggenerated  Tue Jan 31 12:29:48 CST 2012
	 */
	private Integer change_id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column edu.student_change.student_id
	 * @mbggenerated  Tue Jan 31 12:29:48 CST 2012
	 */
	private Integer student_id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column edu.student_change.change_content
	 * @mbggenerated  Tue Jan 31 12:29:48 CST 2012
	 */
	private String change_content;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column edu.student_change.register_date
	 * @mbggenerated  Tue Jan 31 12:29:48 CST 2012
	 */
	private Date register_date;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column edu.student_change.change_id
	 * @return  the value of edu.student_change.change_id
	 * @mbggenerated  Tue Jan 31 12:29:48 CST 2012
	 */
	public Integer getChange_id() {
		return change_id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column edu.student_change.change_id
	 * @param change_id  the value for edu.student_change.change_id
	 * @mbggenerated  Tue Jan 31 12:29:48 CST 2012
	 */
	public void setChange_id(Integer change_id) {
		this.change_id = change_id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column edu.student_change.student_id
	 * @return  the value of edu.student_change.student_id
	 * @mbggenerated  Tue Jan 31 12:29:48 CST 2012
	 */
	public Integer getStudent_id() {
		return student_id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column edu.student_change.student_id
	 * @param student_id  the value for edu.student_change.student_id
	 * @mbggenerated  Tue Jan 31 12:29:48 CST 2012
	 */
	public void setStudent_id(Integer student_id) {
		this.student_id = student_id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column edu.student_change.change_content
	 * @return  the value of edu.student_change.change_content
	 * @mbggenerated  Tue Jan 31 12:29:48 CST 2012
	 */
	public String getChange_content() {
		return change_content;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column edu.student_change.change_content
	 * @param change_content  the value for edu.student_change.change_content
	 * @mbggenerated  Tue Jan 31 12:29:48 CST 2012
	 */
	public void setChange_content(String change_content) {
		this.change_content = change_content == null ? null : change_content
				.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column edu.student_change.register_date
	 * @return  the value of edu.student_change.register_date
	 * @mbggenerated  Tue Jan 31 12:29:48 CST 2012
	 */
	public Date getRegister_date() {
		return register_date;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column edu.student_change.register_date
	 * @param register_date  the value for edu.student_change.register_date
	 * @mbggenerated  Tue Jan 31 12:29:48 CST 2012
	 */
	public void setRegister_date(Date register_date) {
		this.register_date = register_date;
	}
}