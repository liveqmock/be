package com.brightedu.model.edu;

import java.io.Serializable;

public class AgentReturnKey implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column edu.agent_return.agent_id
     *
     * @mbggenerated Thu Feb 09 18:11:26 CST 2012
     */
    private Integer agent_id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column edu.agent_return.ag_return_type_id
     *
     * @mbggenerated Thu Feb 09 18:11:26 CST 2012
     */
    private Integer ag_return_type_id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column edu.agent_return.batch_id
     *
     * @mbggenerated Thu Feb 09 18:11:26 CST 2012
     */
    private Integer batch_id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table edu.agent_return
     *
     * @mbggenerated Thu Feb 09 18:11:26 CST 2012
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column edu.agent_return.agent_id
     *
     * @return the value of edu.agent_return.agent_id
     *
     * @mbggenerated Thu Feb 09 18:11:26 CST 2012
     */
    public Integer getAgent_id() {
        return agent_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column edu.agent_return.agent_id
     *
     * @param agent_id the value for edu.agent_return.agent_id
     *
     * @mbggenerated Thu Feb 09 18:11:26 CST 2012
     */
    public void setAgent_id(Integer agent_id) {
        this.agent_id = agent_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column edu.agent_return.ag_return_type_id
     *
     * @return the value of edu.agent_return.ag_return_type_id
     *
     * @mbggenerated Thu Feb 09 18:11:26 CST 2012
     */
    public Integer getAg_return_type_id() {
        return ag_return_type_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column edu.agent_return.ag_return_type_id
     *
     * @param ag_return_type_id the value for edu.agent_return.ag_return_type_id
     *
     * @mbggenerated Thu Feb 09 18:11:26 CST 2012
     */
    public void setAg_return_type_id(Integer ag_return_type_id) {
        this.ag_return_type_id = ag_return_type_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column edu.agent_return.batch_id
     *
     * @return the value of edu.agent_return.batch_id
     *
     * @mbggenerated Thu Feb 09 18:11:26 CST 2012
     */
    public Integer getBatch_id() {
        return batch_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column edu.agent_return.batch_id
     *
     * @param batch_id the value for edu.agent_return.batch_id
     *
     * @mbggenerated Thu Feb 09 18:11:26 CST 2012
     */
    public void setBatch_id(Integer batch_id) {
        this.batch_id = batch_id;
    }
}