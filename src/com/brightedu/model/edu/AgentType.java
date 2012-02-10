package com.brightedu.model.edu;

import java.io.Serializable;

public class AgentType implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column edu.agent_type.agent_type_id
     *
     * @mbggenerated Fri Feb 10 17:49:12 CST 2012
     */
    private Integer agent_type_id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column edu.agent_type.agent_type_name
     *
     * @mbggenerated Fri Feb 10 17:49:12 CST 2012
     */
    private String agent_type_name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column edu.agent_type.is_return
     *
     * @mbggenerated Fri Feb 10 17:49:12 CST 2012
     */
    private Boolean is_return;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table edu.agent_type
     *
     * @mbggenerated Fri Feb 10 17:49:12 CST 2012
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column edu.agent_type.agent_type_id
     *
     * @return the value of edu.agent_type.agent_type_id
     *
     * @mbggenerated Fri Feb 10 17:49:12 CST 2012
     */
    public Integer getAgent_type_id() {
        return agent_type_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column edu.agent_type.agent_type_id
     *
     * @param agent_type_id the value for edu.agent_type.agent_type_id
     *
     * @mbggenerated Fri Feb 10 17:49:12 CST 2012
     */
    public void setAgent_type_id(Integer agent_type_id) {
        this.agent_type_id = agent_type_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column edu.agent_type.agent_type_name
     *
     * @return the value of edu.agent_type.agent_type_name
     *
     * @mbggenerated Fri Feb 10 17:49:12 CST 2012
     */
    public String getAgent_type_name() {
        return agent_type_name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column edu.agent_type.agent_type_name
     *
     * @param agent_type_name the value for edu.agent_type.agent_type_name
     *
     * @mbggenerated Fri Feb 10 17:49:12 CST 2012
     */
    public void setAgent_type_name(String agent_type_name) {
        this.agent_type_name = agent_type_name == null ? null : agent_type_name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column edu.agent_type.is_return
     *
     * @return the value of edu.agent_type.is_return
     *
     * @mbggenerated Fri Feb 10 17:49:12 CST 2012
     */
    public Boolean getIs_return() {
        return is_return;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column edu.agent_type.is_return
     *
     * @param is_return the value for edu.agent_type.is_return
     *
     * @mbggenerated Fri Feb 10 17:49:12 CST 2012
     */
    public void setIs_return(Boolean is_return) {
        this.is_return = is_return;
    }
}