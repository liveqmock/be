package com.brightedu.model.edu;

import java.io.Serializable;
import java.util.Date;

public class Announcement implements Serializable {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column edu.announcement.ann_id
	 * @mbggenerated  Wed Feb 29 12:07:54 CST 2012
	 */
	private Integer ann_id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column edu.announcement.ann_title
	 * @mbggenerated  Wed Feb 29 12:07:54 CST 2012
	 */
	private String ann_title;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column edu.announcement.ann_body
	 * @mbggenerated  Wed Feb 29 12:07:54 CST 2012
	 */
	private String ann_body;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column edu.announcement.reg_date
	 * @mbggenerated  Wed Feb 29 12:07:54 CST 2012
	 */
	private Date reg_date;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column edu.announcement.created_by
	 * @mbggenerated  Wed Feb 29 12:07:54 CST 2012
	 */
	private Integer created_by;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column edu.announcement.last_edited_by
	 * @mbggenerated  Wed Feb 29 12:07:54 CST 2012
	 */
	private Integer last_edited_by;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column edu.announcement.update_time
	 * @mbggenerated  Wed Feb 29 12:07:54 CST 2012
	 */
	private Date update_time;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table edu.announcement
	 * @mbggenerated  Wed Feb 29 12:07:54 CST 2012
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column edu.announcement.ann_id
	 * @return  the value of edu.announcement.ann_id
	 * @mbggenerated  Wed Feb 29 12:07:54 CST 2012
	 */
	public Integer getAnn_id() {
		return ann_id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column edu.announcement.ann_id
	 * @param ann_id  the value for edu.announcement.ann_id
	 * @mbggenerated  Wed Feb 29 12:07:54 CST 2012
	 */
	public void setAnn_id(Integer ann_id) {
		this.ann_id = ann_id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column edu.announcement.ann_title
	 * @return  the value of edu.announcement.ann_title
	 * @mbggenerated  Wed Feb 29 12:07:54 CST 2012
	 */
	public String getAnn_title() {
		return ann_title;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column edu.announcement.ann_title
	 * @param ann_title  the value for edu.announcement.ann_title
	 * @mbggenerated  Wed Feb 29 12:07:54 CST 2012
	 */
	public void setAnn_title(String ann_title) {
		this.ann_title = ann_title == null ? null : ann_title.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column edu.announcement.ann_body
	 * @return  the value of edu.announcement.ann_body
	 * @mbggenerated  Wed Feb 29 12:07:54 CST 2012
	 */
	public String getAnn_body() {
		return ann_body;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column edu.announcement.ann_body
	 * @param ann_body  the value for edu.announcement.ann_body
	 * @mbggenerated  Wed Feb 29 12:07:54 CST 2012
	 */
	public void setAnn_body(String ann_body) {
		this.ann_body = ann_body == null ? null : ann_body.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column edu.announcement.reg_date
	 * @return  the value of edu.announcement.reg_date
	 * @mbggenerated  Wed Feb 29 12:07:54 CST 2012
	 */
	public Date getReg_date() {
		return reg_date;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column edu.announcement.reg_date
	 * @param reg_date  the value for edu.announcement.reg_date
	 * @mbggenerated  Wed Feb 29 12:07:54 CST 2012
	 */
	public void setReg_date(Date reg_date) {
		this.reg_date = reg_date;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column edu.announcement.created_by
	 * @return  the value of edu.announcement.created_by
	 * @mbggenerated  Wed Feb 29 12:07:54 CST 2012
	 */
	public Integer getCreated_by() {
		return created_by;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column edu.announcement.created_by
	 * @param created_by  the value for edu.announcement.created_by
	 * @mbggenerated  Wed Feb 29 12:07:54 CST 2012
	 */
	public void setCreated_by(Integer created_by) {
		this.created_by = created_by;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column edu.announcement.last_edited_by
	 * @return  the value of edu.announcement.last_edited_by
	 * @mbggenerated  Wed Feb 29 12:07:54 CST 2012
	 */
	public Integer getLast_edited_by() {
		return last_edited_by;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column edu.announcement.last_edited_by
	 * @param last_edited_by  the value for edu.announcement.last_edited_by
	 * @mbggenerated  Wed Feb 29 12:07:54 CST 2012
	 */
	public void setLast_edited_by(Integer last_edited_by) {
		this.last_edited_by = last_edited_by;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column edu.announcement.update_time
	 * @return  the value of edu.announcement.update_time
	 * @mbggenerated  Wed Feb 29 12:07:54 CST 2012
	 */
	public Date getUpdate_time() {
		return update_time;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column edu.announcement.update_time
	 * @param update_time  the value for edu.announcement.update_time
	 * @mbggenerated  Wed Feb 29 12:07:54 CST 2012
	 */
	public void setUpdate_time(Date update_time) {
		this.update_time = update_time;
	}
}