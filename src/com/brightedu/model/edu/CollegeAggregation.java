package com.brightedu.model.edu;

import java.io.Serializable;
import java.math.BigDecimal;

public class CollegeAggregation extends CollegeAggregationKey implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column edu.college_aggregation.return_percent
     *
     * @mbggenerated Tue Feb 21 21:53:42 CST 2012
     */
    private BigDecimal return_percent;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table edu.college_aggregation
     *
     * @mbggenerated Tue Feb 21 21:53:42 CST 2012
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column edu.college_aggregation.return_percent
     *
     * @return the value of edu.college_aggregation.return_percent
     *
     * @mbggenerated Tue Feb 21 21:53:42 CST 2012
     */
    public BigDecimal getReturn_percent() {
        return return_percent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column edu.college_aggregation.return_percent
     *
     * @param return_percent the value for edu.college_aggregation.return_percent
     *
     * @mbggenerated Tue Feb 21 21:53:42 CST 2012
     */
    public void setReturn_percent(BigDecimal return_percent) {
        this.return_percent = return_percent;
    }
}