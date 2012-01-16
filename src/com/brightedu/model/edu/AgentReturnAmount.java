package com.brightedu.model.edu;

import java.math.BigDecimal;

public class AgentReturnAmount extends AgentReturnAmountKey {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column edu.ag_return_amount.sum_amount
	 * @mbggenerated  Mon Jan 16 17:46:15 CST 2012
	 */
	private BigDecimal sum_amount;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column edu.ag_return_amount.sum_amount
	 * @return  the value of edu.ag_return_amount.sum_amount
	 * @mbggenerated  Mon Jan 16 17:46:15 CST 2012
	 */
	public BigDecimal getSum_amount() {
		return sum_amount;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column edu.ag_return_amount.sum_amount
	 * @param sum_amount  the value for edu.ag_return_amount.sum_amount
	 * @mbggenerated  Mon Jan 16 17:46:15 CST 2012
	 */
	public void setSum_amount(BigDecimal sum_amount) {
		this.sum_amount = sum_amount;
	}
}