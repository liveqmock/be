package com.brightedu.model.edu;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ReceiveFundExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table edu.receive_fund
	 * @mbggenerated  Mon Jan 16 17:46:15 CST 2012
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table edu.receive_fund
	 * @mbggenerated  Mon Jan 16 17:46:15 CST 2012
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table edu.receive_fund
	 * @mbggenerated  Mon Jan 16 17:46:15 CST 2012
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table edu.receive_fund
	 * @mbggenerated  Mon Jan 16 17:46:15 CST 2012
	 */
	public ReceiveFundExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table edu.receive_fund
	 * @mbggenerated  Mon Jan 16 17:46:15 CST 2012
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table edu.receive_fund
	 * @mbggenerated  Mon Jan 16 17:46:15 CST 2012
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table edu.receive_fund
	 * @mbggenerated  Mon Jan 16 17:46:15 CST 2012
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table edu.receive_fund
	 * @mbggenerated  Mon Jan 16 17:46:15 CST 2012
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table edu.receive_fund
	 * @mbggenerated  Mon Jan 16 17:46:15 CST 2012
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table edu.receive_fund
	 * @mbggenerated  Mon Jan 16 17:46:15 CST 2012
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table edu.receive_fund
	 * @mbggenerated  Mon Jan 16 17:46:15 CST 2012
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table edu.receive_fund
	 * @mbggenerated  Mon Jan 16 17:46:15 CST 2012
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table edu.receive_fund
	 * @mbggenerated  Mon Jan 16 17:46:15 CST 2012
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table edu.receive_fund
	 * @mbggenerated  Mon Jan 16 17:46:15 CST 2012
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table edu.receive_fund
	 * @mbggenerated  Mon Jan 16 17:46:15 CST 2012
	 */
	protected abstract static class GeneratedCriteria {
		protected List<Criterion> criteria;

		protected GeneratedCriteria() {
			super();
			criteria = new ArrayList<Criterion>();
		}

		public boolean isValid() {
			return criteria.size() > 0;
		}

		public List<Criterion> getAllCriteria() {
			return criteria;
		}

		public List<Criterion> getCriteria() {
			return criteria;
		}

		protected void addCriterion(String condition) {
			if (condition == null) {
				throw new RuntimeException("Value for condition cannot be null");
			}
			criteria.add(new Criterion(condition));
		}

		protected void addCriterion(String condition, Object value,
				String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property
						+ " cannot be null");
			}
			criteria.add(new Criterion(condition, value));
		}

		protected void addCriterion(String condition, Object value1,
				Object value2, String property) {
			if (value1 == null || value2 == null) {
				throw new RuntimeException("Between values for " + property
						+ " cannot be null");
			}
			criteria.add(new Criterion(condition, value1, value2));
		}

		public Criteria andFund_idIsNull() {
			addCriterion("fund_id is null");
			return (Criteria) this;
		}

		public Criteria andFund_idIsNotNull() {
			addCriterion("fund_id is not null");
			return (Criteria) this;
		}

		public Criteria andFund_idEqualTo(Long value) {
			addCriterion("fund_id =", value, "fund_id");
			return (Criteria) this;
		}

		public Criteria andFund_idNotEqualTo(Long value) {
			addCriterion("fund_id <>", value, "fund_id");
			return (Criteria) this;
		}

		public Criteria andFund_idGreaterThan(Long value) {
			addCriterion("fund_id >", value, "fund_id");
			return (Criteria) this;
		}

		public Criteria andFund_idGreaterThanOrEqualTo(Long value) {
			addCriterion("fund_id >=", value, "fund_id");
			return (Criteria) this;
		}

		public Criteria andFund_idLessThan(Long value) {
			addCriterion("fund_id <", value, "fund_id");
			return (Criteria) this;
		}

		public Criteria andFund_idLessThanOrEqualTo(Long value) {
			addCriterion("fund_id <=", value, "fund_id");
			return (Criteria) this;
		}

		public Criteria andFund_idIn(List<Long> values) {
			addCriterion("fund_id in", values, "fund_id");
			return (Criteria) this;
		}

		public Criteria andFund_idNotIn(List<Long> values) {
			addCriterion("fund_id not in", values, "fund_id");
			return (Criteria) this;
		}

		public Criteria andFund_idBetween(Long value1, Long value2) {
			addCriterion("fund_id between", value1, value2, "fund_id");
			return (Criteria) this;
		}

		public Criteria andFund_idNotBetween(Long value1, Long value2) {
			addCriterion("fund_id not between", value1, value2, "fund_id");
			return (Criteria) this;
		}

		public Criteria andStudent_idIsNull() {
			addCriterion("student_id is null");
			return (Criteria) this;
		}

		public Criteria andStudent_idIsNotNull() {
			addCriterion("student_id is not null");
			return (Criteria) this;
		}

		public Criteria andStudent_idEqualTo(Integer value) {
			addCriterion("student_id =", value, "student_id");
			return (Criteria) this;
		}

		public Criteria andStudent_idNotEqualTo(Integer value) {
			addCriterion("student_id <>", value, "student_id");
			return (Criteria) this;
		}

		public Criteria andStudent_idGreaterThan(Integer value) {
			addCriterion("student_id >", value, "student_id");
			return (Criteria) this;
		}

		public Criteria andStudent_idGreaterThanOrEqualTo(Integer value) {
			addCriterion("student_id >=", value, "student_id");
			return (Criteria) this;
		}

		public Criteria andStudent_idLessThan(Integer value) {
			addCriterion("student_id <", value, "student_id");
			return (Criteria) this;
		}

		public Criteria andStudent_idLessThanOrEqualTo(Integer value) {
			addCriterion("student_id <=", value, "student_id");
			return (Criteria) this;
		}

		public Criteria andStudent_idIn(List<Integer> values) {
			addCriterion("student_id in", values, "student_id");
			return (Criteria) this;
		}

		public Criteria andStudent_idNotIn(List<Integer> values) {
			addCriterion("student_id not in", values, "student_id");
			return (Criteria) this;
		}

		public Criteria andStudent_idBetween(Integer value1, Integer value2) {
			addCriterion("student_id between", value1, value2, "student_id");
			return (Criteria) this;
		}

		public Criteria andStudent_idNotBetween(Integer value1, Integer value2) {
			addCriterion("student_id not between", value1, value2, "student_id");
			return (Criteria) this;
		}

		public Criteria andCharge_type_idIsNull() {
			addCriterion("charge_type_id is null");
			return (Criteria) this;
		}

		public Criteria andCharge_type_idIsNotNull() {
			addCriterion("charge_type_id is not null");
			return (Criteria) this;
		}

		public Criteria andCharge_type_idEqualTo(Integer value) {
			addCriterion("charge_type_id =", value, "charge_type_id");
			return (Criteria) this;
		}

		public Criteria andCharge_type_idNotEqualTo(Integer value) {
			addCriterion("charge_type_id <>", value, "charge_type_id");
			return (Criteria) this;
		}

		public Criteria andCharge_type_idGreaterThan(Integer value) {
			addCriterion("charge_type_id >", value, "charge_type_id");
			return (Criteria) this;
		}

		public Criteria andCharge_type_idGreaterThanOrEqualTo(Integer value) {
			addCriterion("charge_type_id >=", value, "charge_type_id");
			return (Criteria) this;
		}

		public Criteria andCharge_type_idLessThan(Integer value) {
			addCriterion("charge_type_id <", value, "charge_type_id");
			return (Criteria) this;
		}

		public Criteria andCharge_type_idLessThanOrEqualTo(Integer value) {
			addCriterion("charge_type_id <=", value, "charge_type_id");
			return (Criteria) this;
		}

		public Criteria andCharge_type_idIn(List<Integer> values) {
			addCriterion("charge_type_id in", values, "charge_type_id");
			return (Criteria) this;
		}

		public Criteria andCharge_type_idNotIn(List<Integer> values) {
			addCriterion("charge_type_id not in", values, "charge_type_id");
			return (Criteria) this;
		}

		public Criteria andCharge_type_idBetween(Integer value1, Integer value2) {
			addCriterion("charge_type_id between", value1, value2,
					"charge_type_id");
			return (Criteria) this;
		}

		public Criteria andCharge_type_idNotBetween(Integer value1,
				Integer value2) {
			addCriterion("charge_type_id not between", value1, value2,
					"charge_type_id");
			return (Criteria) this;
		}

		public Criteria andCharge_timeIsNull() {
			addCriterion("charge_time is null");
			return (Criteria) this;
		}

		public Criteria andCharge_timeIsNotNull() {
			addCriterion("charge_time is not null");
			return (Criteria) this;
		}

		public Criteria andCharge_timeEqualTo(Date value) {
			addCriterion("charge_time =", value, "charge_time");
			return (Criteria) this;
		}

		public Criteria andCharge_timeNotEqualTo(Date value) {
			addCriterion("charge_time <>", value, "charge_time");
			return (Criteria) this;
		}

		public Criteria andCharge_timeGreaterThan(Date value) {
			addCriterion("charge_time >", value, "charge_time");
			return (Criteria) this;
		}

		public Criteria andCharge_timeGreaterThanOrEqualTo(Date value) {
			addCriterion("charge_time >=", value, "charge_time");
			return (Criteria) this;
		}

		public Criteria andCharge_timeLessThan(Date value) {
			addCriterion("charge_time <", value, "charge_time");
			return (Criteria) this;
		}

		public Criteria andCharge_timeLessThanOrEqualTo(Date value) {
			addCriterion("charge_time <=", value, "charge_time");
			return (Criteria) this;
		}

		public Criteria andCharge_timeIn(List<Date> values) {
			addCriterion("charge_time in", values, "charge_time");
			return (Criteria) this;
		}

		public Criteria andCharge_timeNotIn(List<Date> values) {
			addCriterion("charge_time not in", values, "charge_time");
			return (Criteria) this;
		}

		public Criteria andCharge_timeBetween(Date value1, Date value2) {
			addCriterion("charge_time between", value1, value2, "charge_time");
			return (Criteria) this;
		}

		public Criteria andCharge_timeNotBetween(Date value1, Date value2) {
			addCriterion("charge_time not between", value1, value2,
					"charge_time");
			return (Criteria) this;
		}

		public Criteria andFund_incomeIsNull() {
			addCriterion("fund_income is null");
			return (Criteria) this;
		}

		public Criteria andFund_incomeIsNotNull() {
			addCriterion("fund_income is not null");
			return (Criteria) this;
		}

		public Criteria andFund_incomeEqualTo(BigDecimal value) {
			addCriterion("fund_income =", value, "fund_income");
			return (Criteria) this;
		}

		public Criteria andFund_incomeNotEqualTo(BigDecimal value) {
			addCriterion("fund_income <>", value, "fund_income");
			return (Criteria) this;
		}

		public Criteria andFund_incomeGreaterThan(BigDecimal value) {
			addCriterion("fund_income >", value, "fund_income");
			return (Criteria) this;
		}

		public Criteria andFund_incomeGreaterThanOrEqualTo(BigDecimal value) {
			addCriterion("fund_income >=", value, "fund_income");
			return (Criteria) this;
		}

		public Criteria andFund_incomeLessThan(BigDecimal value) {
			addCriterion("fund_income <", value, "fund_income");
			return (Criteria) this;
		}

		public Criteria andFund_incomeLessThanOrEqualTo(BigDecimal value) {
			addCriterion("fund_income <=", value, "fund_income");
			return (Criteria) this;
		}

		public Criteria andFund_incomeIn(List<BigDecimal> values) {
			addCriterion("fund_income in", values, "fund_income");
			return (Criteria) this;
		}

		public Criteria andFund_incomeNotIn(List<BigDecimal> values) {
			addCriterion("fund_income not in", values, "fund_income");
			return (Criteria) this;
		}

		public Criteria andFund_incomeBetween(BigDecimal value1,
				BigDecimal value2) {
			addCriterion("fund_income between", value1, value2, "fund_income");
			return (Criteria) this;
		}

		public Criteria andFund_incomeNotBetween(BigDecimal value1,
				BigDecimal value2) {
			addCriterion("fund_income not between", value1, value2,
					"fund_income");
			return (Criteria) this;
		}

		public Criteria andUser_idIsNull() {
			addCriterion("user_id is null");
			return (Criteria) this;
		}

		public Criteria andUser_idIsNotNull() {
			addCriterion("user_id is not null");
			return (Criteria) this;
		}

		public Criteria andUser_idEqualTo(Integer value) {
			addCriterion("user_id =", value, "user_id");
			return (Criteria) this;
		}

		public Criteria andUser_idNotEqualTo(Integer value) {
			addCriterion("user_id <>", value, "user_id");
			return (Criteria) this;
		}

		public Criteria andUser_idGreaterThan(Integer value) {
			addCriterion("user_id >", value, "user_id");
			return (Criteria) this;
		}

		public Criteria andUser_idGreaterThanOrEqualTo(Integer value) {
			addCriterion("user_id >=", value, "user_id");
			return (Criteria) this;
		}

		public Criteria andUser_idLessThan(Integer value) {
			addCriterion("user_id <", value, "user_id");
			return (Criteria) this;
		}

		public Criteria andUser_idLessThanOrEqualTo(Integer value) {
			addCriterion("user_id <=", value, "user_id");
			return (Criteria) this;
		}

		public Criteria andUser_idIn(List<Integer> values) {
			addCriterion("user_id in", values, "user_id");
			return (Criteria) this;
		}

		public Criteria andUser_idNotIn(List<Integer> values) {
			addCriterion("user_id not in", values, "user_id");
			return (Criteria) this;
		}

		public Criteria andUser_idBetween(Integer value1, Integer value2) {
			addCriterion("user_id between", value1, value2, "user_id");
			return (Criteria) this;
		}

		public Criteria andUser_idNotBetween(Integer value1, Integer value2) {
			addCriterion("user_id not between", value1, value2, "user_id");
			return (Criteria) this;
		}

		public Criteria andBank_codeIsNull() {
			addCriterion("bank_code is null");
			return (Criteria) this;
		}

		public Criteria andBank_codeIsNotNull() {
			addCriterion("bank_code is not null");
			return (Criteria) this;
		}

		public Criteria andBank_codeEqualTo(String value) {
			addCriterion("bank_code =", value, "bank_code");
			return (Criteria) this;
		}

		public Criteria andBank_codeNotEqualTo(String value) {
			addCriterion("bank_code <>", value, "bank_code");
			return (Criteria) this;
		}

		public Criteria andBank_codeGreaterThan(String value) {
			addCriterion("bank_code >", value, "bank_code");
			return (Criteria) this;
		}

		public Criteria andBank_codeGreaterThanOrEqualTo(String value) {
			addCriterion("bank_code >=", value, "bank_code");
			return (Criteria) this;
		}

		public Criteria andBank_codeLessThan(String value) {
			addCriterion("bank_code <", value, "bank_code");
			return (Criteria) this;
		}

		public Criteria andBank_codeLessThanOrEqualTo(String value) {
			addCriterion("bank_code <=", value, "bank_code");
			return (Criteria) this;
		}

		public Criteria andBank_codeLike(String value) {
			addCriterion("bank_code like", value, "bank_code");
			return (Criteria) this;
		}

		public Criteria andBank_codeNotLike(String value) {
			addCriterion("bank_code not like", value, "bank_code");
			return (Criteria) this;
		}

		public Criteria andBank_codeIn(List<String> values) {
			addCriterion("bank_code in", values, "bank_code");
			return (Criteria) this;
		}

		public Criteria andBank_codeNotIn(List<String> values) {
			addCriterion("bank_code not in", values, "bank_code");
			return (Criteria) this;
		}

		public Criteria andBank_codeBetween(String value1, String value2) {
			addCriterion("bank_code between", value1, value2, "bank_code");
			return (Criteria) this;
		}

		public Criteria andBank_codeNotBetween(String value1, String value2) {
			addCriterion("bank_code not between", value1, value2, "bank_code");
			return (Criteria) this;
		}

		public Criteria andRemarkIsNull() {
			addCriterion("remark is null");
			return (Criteria) this;
		}

		public Criteria andRemarkIsNotNull() {
			addCriterion("remark is not null");
			return (Criteria) this;
		}

		public Criteria andRemarkEqualTo(String value) {
			addCriterion("remark =", value, "remark");
			return (Criteria) this;
		}

		public Criteria andRemarkNotEqualTo(String value) {
			addCriterion("remark <>", value, "remark");
			return (Criteria) this;
		}

		public Criteria andRemarkGreaterThan(String value) {
			addCriterion("remark >", value, "remark");
			return (Criteria) this;
		}

		public Criteria andRemarkGreaterThanOrEqualTo(String value) {
			addCriterion("remark >=", value, "remark");
			return (Criteria) this;
		}

		public Criteria andRemarkLessThan(String value) {
			addCriterion("remark <", value, "remark");
			return (Criteria) this;
		}

		public Criteria andRemarkLessThanOrEqualTo(String value) {
			addCriterion("remark <=", value, "remark");
			return (Criteria) this;
		}

		public Criteria andRemarkLike(String value) {
			addCriterion("remark like", value, "remark");
			return (Criteria) this;
		}

		public Criteria andRemarkNotLike(String value) {
			addCriterion("remark not like", value, "remark");
			return (Criteria) this;
		}

		public Criteria andRemarkIn(List<String> values) {
			addCriterion("remark in", values, "remark");
			return (Criteria) this;
		}

		public Criteria andRemarkNotIn(List<String> values) {
			addCriterion("remark not in", values, "remark");
			return (Criteria) this;
		}

		public Criteria andRemarkBetween(String value1, String value2) {
			addCriterion("remark between", value1, value2, "remark");
			return (Criteria) this;
		}

		public Criteria andRemarkNotBetween(String value1, String value2) {
			addCriterion("remark not between", value1, value2, "remark");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table edu.receive_fund
	 * @mbggenerated  Mon Jan 16 17:46:15 CST 2012
	 */
	public static class Criterion {
		private String condition;
		private Object value;
		private Object secondValue;
		private boolean noValue;
		private boolean singleValue;
		private boolean betweenValue;
		private boolean listValue;
		private String typeHandler;

		public String getCondition() {
			return condition;
		}

		public Object getValue() {
			return value;
		}

		public Object getSecondValue() {
			return secondValue;
		}

		public boolean isNoValue() {
			return noValue;
		}

		public boolean isSingleValue() {
			return singleValue;
		}

		public boolean isBetweenValue() {
			return betweenValue;
		}

		public boolean isListValue() {
			return listValue;
		}

		public String getTypeHandler() {
			return typeHandler;
		}

		protected Criterion(String condition) {
			super();
			this.condition = condition;
			this.typeHandler = null;
			this.noValue = true;
		}

		protected Criterion(String condition, Object value, String typeHandler) {
			super();
			this.condition = condition;
			this.value = value;
			this.typeHandler = typeHandler;
			if (value instanceof List<?>) {
				this.listValue = true;
			} else {
				this.singleValue = true;
			}
		}

		protected Criterion(String condition, Object value) {
			this(condition, value, null);
		}

		protected Criterion(String condition, Object value, Object secondValue,
				String typeHandler) {
			super();
			this.condition = condition;
			this.value = value;
			this.secondValue = secondValue;
			this.typeHandler = typeHandler;
			this.betweenValue = true;
		}

		protected Criterion(String condition, Object value, Object secondValue) {
			this(condition, value, secondValue, null);
		}
	}

	/**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table edu.receive_fund
     *
     * @mbggenerated do_not_delete_during_merge Sun Jan 15 18:52:28 CST 2012
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}