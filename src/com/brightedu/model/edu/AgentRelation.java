package com.brightedu.model.edu;

import java.util.Date;

public class AgentRelation extends AgentRelationKey {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column edu.agent_relation.register_date
	 * @mbggenerated  Thu Feb 02 16:54:43 CST 2012
	 */
	private Date register_date;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column edu.agent_relation.register_date
	 * @return  the value of edu.agent_relation.register_date
	 * @mbggenerated  Thu Feb 02 16:54:43 CST 2012
	 */
	public Date getRegister_date() {
		return register_date;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column edu.agent_relation.register_date
	 * @param register_date  the value for edu.agent_relation.register_date
	 * @mbggenerated  Thu Feb 02 16:54:43 CST 2012
	 */
	public void setRegister_date(Date register_date) {
		this.register_date = register_date;
	}
}