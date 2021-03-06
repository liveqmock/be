package com.brightedu.model.edu;

import java.io.Serializable;

public class RightsOverrideKey implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column edu.rights_override.user_id
     *
     * @mbggenerated Fri Feb 17 17:28:53 CST 2012
     */
    private Integer user_id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column edu.rights_override.rights_category_id
     *
     * @mbggenerated Fri Feb 17 17:28:53 CST 2012
     */
    private String rights_category_id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column edu.rights_override.rights_function_id
     *
     * @mbggenerated Fri Feb 17 17:28:53 CST 2012
     */
    private String rights_function_id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table edu.rights_override
     *
     * @mbggenerated Fri Feb 17 17:28:53 CST 2012
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column edu.rights_override.user_id
     *
     * @return the value of edu.rights_override.user_id
     *
     * @mbggenerated Fri Feb 17 17:28:53 CST 2012
     */
    public Integer getUser_id() {
        return user_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column edu.rights_override.user_id
     *
     * @param user_id the value for edu.rights_override.user_id
     *
     * @mbggenerated Fri Feb 17 17:28:53 CST 2012
     */
    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column edu.rights_override.rights_category_id
     *
     * @return the value of edu.rights_override.rights_category_id
     *
     * @mbggenerated Fri Feb 17 17:28:53 CST 2012
     */
    public String getRights_category_id() {
        return rights_category_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column edu.rights_override.rights_category_id
     *
     * @param rights_category_id the value for edu.rights_override.rights_category_id
     *
     * @mbggenerated Fri Feb 17 17:28:53 CST 2012
     */
    public void setRights_category_id(String rights_category_id) {
        this.rights_category_id = rights_category_id == null ? null : rights_category_id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column edu.rights_override.rights_function_id
     *
     * @return the value of edu.rights_override.rights_function_id
     *
     * @mbggenerated Fri Feb 17 17:28:53 CST 2012
     */
    public String getRights_function_id() {
        return rights_function_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column edu.rights_override.rights_function_id
     *
     * @param rights_function_id the value for edu.rights_override.rights_function_id
     *
     * @mbggenerated Fri Feb 17 17:28:53 CST 2012
     */
    public void setRights_function_id(String rights_function_id) {
        this.rights_function_id = rights_function_id == null ? null : rights_function_id.trim();
    }
}