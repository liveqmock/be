package com.brightedu.model.edu;

import java.io.Serializable;
import java.util.Date;

public class CurrentBatch implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column edu.current_batch.current_batch_id
     *
     * @mbggenerated Mon Feb 13 17:13:20 CST 2012
     */
    private Integer current_batch_id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column edu.current_batch.update_date
     *
     * @mbggenerated Mon Feb 13 17:13:20 CST 2012
     */
    private Date update_date;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table edu.current_batch
     *
     * @mbggenerated Mon Feb 13 17:13:20 CST 2012
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column edu.current_batch.current_batch_id
     *
     * @return the value of edu.current_batch.current_batch_id
     *
     * @mbggenerated Mon Feb 13 17:13:20 CST 2012
     */
    public Integer getCurrent_batch_id() {
        return current_batch_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column edu.current_batch.current_batch_id
     *
     * @param current_batch_id the value for edu.current_batch.current_batch_id
     *
     * @mbggenerated Mon Feb 13 17:13:20 CST 2012
     */
    public void setCurrent_batch_id(Integer current_batch_id) {
        this.current_batch_id = current_batch_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column edu.current_batch.update_date
     *
     * @return the value of edu.current_batch.update_date
     *
     * @mbggenerated Mon Feb 13 17:13:20 CST 2012
     */
    public Date getUpdate_date() {
        return update_date;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column edu.current_batch.update_date
     *
     * @param update_date the value for edu.current_batch.update_date
     *
     * @mbggenerated Mon Feb 13 17:13:20 CST 2012
     */
    public void setUpdate_date(Date update_date) {
        this.update_date = update_date;
    }
}