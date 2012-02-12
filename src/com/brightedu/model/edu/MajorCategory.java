package com.brightedu.model.edu;

import java.io.Serializable;

public class MajorCategory implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column edu.student_major_category.student_major_category_id
     *
     * @mbggenerated Sun Feb 12 12:25:52 CST 2012
     */
    private Integer student_major_category_id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column edu.student_major_category.student_major_category_name
     *
     * @mbggenerated Sun Feb 12 12:25:52 CST 2012
     */
    private String student_major_category_name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table edu.student_major_category
     *
     * @mbggenerated Sun Feb 12 12:25:52 CST 2012
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column edu.student_major_category.student_major_category_id
     *
     * @return the value of edu.student_major_category.student_major_category_id
     *
     * @mbggenerated Sun Feb 12 12:25:52 CST 2012
     */
    public Integer getStudent_major_category_id() {
        return student_major_category_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column edu.student_major_category.student_major_category_id
     *
     * @param student_major_category_id the value for edu.student_major_category.student_major_category_id
     *
     * @mbggenerated Sun Feb 12 12:25:52 CST 2012
     */
    public void setStudent_major_category_id(Integer student_major_category_id) {
        this.student_major_category_id = student_major_category_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column edu.student_major_category.student_major_category_name
     *
     * @return the value of edu.student_major_category.student_major_category_name
     *
     * @mbggenerated Sun Feb 12 12:25:52 CST 2012
     */
    public String getStudent_major_category_name() {
        return student_major_category_name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column edu.student_major_category.student_major_category_name
     *
     * @param student_major_category_name the value for edu.student_major_category.student_major_category_name
     *
     * @mbggenerated Sun Feb 12 12:25:52 CST 2012
     */
    public void setStudent_major_category_name(String student_major_category_name) {
        this.student_major_category_name = student_major_category_name == null ? null : student_major_category_name.trim();
    }
}