package com.brightedu.model.edu;

import java.io.Serializable;

public class CollegeAggregationKey implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column edu.college_aggregation.ag_return_type_id
     *
     * @mbggenerated Tue Feb 21 21:53:42 CST 2012
     */
    private Integer ag_return_type_id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column edu.college_aggregation.college_id
     *
     * @mbggenerated Tue Feb 21 21:53:42 CST 2012
     */
    private Integer college_id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column edu.college_aggregation.headcount
     *
     * @mbggenerated Tue Feb 21 21:53:42 CST 2012
     */
    private Integer headcount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table edu.college_aggregation
     *
     * @mbggenerated Tue Feb 21 21:53:42 CST 2012
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column edu.college_aggregation.ag_return_type_id
     *
     * @return the value of edu.college_aggregation.ag_return_type_id
     *
     * @mbggenerated Tue Feb 21 21:53:42 CST 2012
     */
    public Integer getAg_return_type_id() {
        return ag_return_type_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column edu.college_aggregation.ag_return_type_id
     *
     * @param ag_return_type_id the value for edu.college_aggregation.ag_return_type_id
     *
     * @mbggenerated Tue Feb 21 21:53:42 CST 2012
     */
    public void setAg_return_type_id(Integer ag_return_type_id) {
        this.ag_return_type_id = ag_return_type_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column edu.college_aggregation.college_id
     *
     * @return the value of edu.college_aggregation.college_id
     *
     * @mbggenerated Tue Feb 21 21:53:42 CST 2012
     */
    public Integer getCollege_id() {
        return college_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column edu.college_aggregation.college_id
     *
     * @param college_id the value for edu.college_aggregation.college_id
     *
     * @mbggenerated Tue Feb 21 21:53:42 CST 2012
     */
    public void setCollege_id(Integer college_id) {
        this.college_id = college_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column edu.college_aggregation.headcount
     *
     * @return the value of edu.college_aggregation.headcount
     *
     * @mbggenerated Tue Feb 21 21:53:42 CST 2012
     */
    public Integer getHeadcount() {
        return headcount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column edu.college_aggregation.headcount
     *
     * @param headcount the value for edu.college_aggregation.headcount
     *
     * @mbggenerated Tue Feb 21 21:53:42 CST 2012
     */
    public void setHeadcount(Integer headcount) {
        this.headcount = headcount;
    }
}