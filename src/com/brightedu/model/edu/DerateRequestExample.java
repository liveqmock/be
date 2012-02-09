package com.brightedu.model.edu;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DerateRequestExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table edu.derate_request
	 * @mbggenerated  Thu Feb 09 18:11:26 CST 2012
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table edu.derate_request
	 * @mbggenerated  Thu Feb 09 18:11:26 CST 2012
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table edu.derate_request
	 * @mbggenerated  Thu Feb 09 18:11:26 CST 2012
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table edu.derate_request
	 * @mbggenerated  Thu Feb 09 18:11:26 CST 2012
	 */
	public DerateRequestExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table edu.derate_request
	 * @mbggenerated  Thu Feb 09 18:11:26 CST 2012
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table edu.derate_request
	 * @mbggenerated  Thu Feb 09 18:11:26 CST 2012
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table edu.derate_request
	 * @mbggenerated  Thu Feb 09 18:11:26 CST 2012
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table edu.derate_request
	 * @mbggenerated  Thu Feb 09 18:11:26 CST 2012
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table edu.derate_request
	 * @mbggenerated  Thu Feb 09 18:11:26 CST 2012
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table edu.derate_request
	 * @mbggenerated  Thu Feb 09 18:11:26 CST 2012
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table edu.derate_request
	 * @mbggenerated  Thu Feb 09 18:11:26 CST 2012
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table edu.derate_request
	 * @mbggenerated  Thu Feb 09 18:11:26 CST 2012
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table edu.derate_request
	 * @mbggenerated  Thu Feb 09 18:11:26 CST 2012
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table edu.derate_request
	 * @mbggenerated  Thu Feb 09 18:11:26 CST 2012
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table edu.derate_request
	 * @mbggenerated  Thu Feb 09 18:11:26 CST 2012
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

		public Criteria andDerate_idIsNull() {
			addCriterion("derate_id is null");
			return (Criteria) this;
		}

		public Criteria andDerate_idIsNotNull() {
			addCriterion("derate_id is not null");
			return (Criteria) this;
		}

		public Criteria andDerate_idEqualTo(Integer value) {
			addCriterion("derate_id =", value, "derate_id");
			return (Criteria) this;
		}

		public Criteria andDerate_idNotEqualTo(Integer value) {
			addCriterion("derate_id <>", value, "derate_id");
			return (Criteria) this;
		}

		public Criteria andDerate_idGreaterThan(Integer value) {
			addCriterion("derate_id >", value, "derate_id");
			return (Criteria) this;
		}

		public Criteria andDerate_idGreaterThanOrEqualTo(Integer value) {
			addCriterion("derate_id >=", value, "derate_id");
			return (Criteria) this;
		}

		public Criteria andDerate_idLessThan(Integer value) {
			addCriterion("derate_id <", value, "derate_id");
			return (Criteria) this;
		}

		public Criteria andDerate_idLessThanOrEqualTo(Integer value) {
			addCriterion("derate_id <=", value, "derate_id");
			return (Criteria) this;
		}

		public Criteria andDerate_idIn(List<Integer> values) {
			addCriterion("derate_id in", values, "derate_id");
			return (Criteria) this;
		}

		public Criteria andDerate_idNotIn(List<Integer> values) {
			addCriterion("derate_id not in", values, "derate_id");
			return (Criteria) this;
		}

		public Criteria andDerate_idBetween(Integer value1, Integer value2) {
			addCriterion("derate_id between", value1, value2, "derate_id");
			return (Criteria) this;
		}

		public Criteria andDerate_idNotBetween(Integer value1, Integer value2) {
			addCriterion("derate_id not between", value1, value2, "derate_id");
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

		public Criteria andDerate_feeIsNull() {
			addCriterion("derate_fee is null");
			return (Criteria) this;
		}

		public Criteria andDerate_feeIsNotNull() {
			addCriterion("derate_fee is not null");
			return (Criteria) this;
		}

		public Criteria andDerate_feeEqualTo(BigDecimal value) {
			addCriterion("derate_fee =", value, "derate_fee");
			return (Criteria) this;
		}

		public Criteria andDerate_feeNotEqualTo(BigDecimal value) {
			addCriterion("derate_fee <>", value, "derate_fee");
			return (Criteria) this;
		}

		public Criteria andDerate_feeGreaterThan(BigDecimal value) {
			addCriterion("derate_fee >", value, "derate_fee");
			return (Criteria) this;
		}

		public Criteria andDerate_feeGreaterThanOrEqualTo(BigDecimal value) {
			addCriterion("derate_fee >=", value, "derate_fee");
			return (Criteria) this;
		}

		public Criteria andDerate_feeLessThan(BigDecimal value) {
			addCriterion("derate_fee <", value, "derate_fee");
			return (Criteria) this;
		}

		public Criteria andDerate_feeLessThanOrEqualTo(BigDecimal value) {
			addCriterion("derate_fee <=", value, "derate_fee");
			return (Criteria) this;
		}

		public Criteria andDerate_feeIn(List<BigDecimal> values) {
			addCriterion("derate_fee in", values, "derate_fee");
			return (Criteria) this;
		}

		public Criteria andDerate_feeNotIn(List<BigDecimal> values) {
			addCriterion("derate_fee not in", values, "derate_fee");
			return (Criteria) this;
		}

		public Criteria andDerate_feeBetween(BigDecimal value1,
				BigDecimal value2) {
			addCriterion("derate_fee between", value1, value2, "derate_fee");
			return (Criteria) this;
		}

		public Criteria andDerate_feeNotBetween(BigDecimal value1,
				BigDecimal value2) {
			addCriterion("derate_fee not between", value1, value2, "derate_fee");
			return (Criteria) this;
		}

		public Criteria andDerate_contentIsNull() {
			addCriterion("derate_content is null");
			return (Criteria) this;
		}

		public Criteria andDerate_contentIsNotNull() {
			addCriterion("derate_content is not null");
			return (Criteria) this;
		}

		public Criteria andDerate_contentEqualTo(String value) {
			addCriterion("derate_content =", value, "derate_content");
			return (Criteria) this;
		}

		public Criteria andDerate_contentNotEqualTo(String value) {
			addCriterion("derate_content <>", value, "derate_content");
			return (Criteria) this;
		}

		public Criteria andDerate_contentGreaterThan(String value) {
			addCriterion("derate_content >", value, "derate_content");
			return (Criteria) this;
		}

		public Criteria andDerate_contentGreaterThanOrEqualTo(String value) {
			addCriterion("derate_content >=", value, "derate_content");
			return (Criteria) this;
		}

		public Criteria andDerate_contentLessThan(String value) {
			addCriterion("derate_content <", value, "derate_content");
			return (Criteria) this;
		}

		public Criteria andDerate_contentLessThanOrEqualTo(String value) {
			addCriterion("derate_content <=", value, "derate_content");
			return (Criteria) this;
		}

		public Criteria andDerate_contentLike(String value) {
			addCriterion("derate_content like", value, "derate_content");
			return (Criteria) this;
		}

		public Criteria andDerate_contentNotLike(String value) {
			addCriterion("derate_content not like", value, "derate_content");
			return (Criteria) this;
		}

		public Criteria andDerate_contentIn(List<String> values) {
			addCriterion("derate_content in", values, "derate_content");
			return (Criteria) this;
		}

		public Criteria andDerate_contentNotIn(List<String> values) {
			addCriterion("derate_content not in", values, "derate_content");
			return (Criteria) this;
		}

		public Criteria andDerate_contentBetween(String value1, String value2) {
			addCriterion("derate_content between", value1, value2,
					"derate_content");
			return (Criteria) this;
		}

		public Criteria andDerate_contentNotBetween(String value1, String value2) {
			addCriterion("derate_content not between", value1, value2,
					"derate_content");
			return (Criteria) this;
		}

		public Criteria andApproveIsNull() {
			addCriterion("approve is null");
			return (Criteria) this;
		}

		public Criteria andApproveIsNotNull() {
			addCriterion("approve is not null");
			return (Criteria) this;
		}

		public Criteria andApproveEqualTo(Boolean value) {
			addCriterion("approve =", value, "approve");
			return (Criteria) this;
		}

		public Criteria andApproveNotEqualTo(Boolean value) {
			addCriterion("approve <>", value, "approve");
			return (Criteria) this;
		}

		public Criteria andApproveGreaterThan(Boolean value) {
			addCriterion("approve >", value, "approve");
			return (Criteria) this;
		}

		public Criteria andApproveGreaterThanOrEqualTo(Boolean value) {
			addCriterion("approve >=", value, "approve");
			return (Criteria) this;
		}

		public Criteria andApproveLessThan(Boolean value) {
			addCriterion("approve <", value, "approve");
			return (Criteria) this;
		}

		public Criteria andApproveLessThanOrEqualTo(Boolean value) {
			addCriterion("approve <=", value, "approve");
			return (Criteria) this;
		}

		public Criteria andApproveIn(List<Boolean> values) {
			addCriterion("approve in", values, "approve");
			return (Criteria) this;
		}

		public Criteria andApproveNotIn(List<Boolean> values) {
			addCriterion("approve not in", values, "approve");
			return (Criteria) this;
		}

		public Criteria andApproveBetween(Boolean value1, Boolean value2) {
			addCriterion("approve between", value1, value2, "approve");
			return (Criteria) this;
		}

		public Criteria andApproveNotBetween(Boolean value1, Boolean value2) {
			addCriterion("approve not between", value1, value2, "approve");
			return (Criteria) this;
		}

		public Criteria andApprove_byIsNull() {
			addCriterion("approve_by is null");
			return (Criteria) this;
		}

		public Criteria andApprove_byIsNotNull() {
			addCriterion("approve_by is not null");
			return (Criteria) this;
		}

		public Criteria andApprove_byEqualTo(String value) {
			addCriterion("approve_by =", value, "approve_by");
			return (Criteria) this;
		}

		public Criteria andApprove_byNotEqualTo(String value) {
			addCriterion("approve_by <>", value, "approve_by");
			return (Criteria) this;
		}

		public Criteria andApprove_byGreaterThan(String value) {
			addCriterion("approve_by >", value, "approve_by");
			return (Criteria) this;
		}

		public Criteria andApprove_byGreaterThanOrEqualTo(String value) {
			addCriterion("approve_by >=", value, "approve_by");
			return (Criteria) this;
		}

		public Criteria andApprove_byLessThan(String value) {
			addCriterion("approve_by <", value, "approve_by");
			return (Criteria) this;
		}

		public Criteria andApprove_byLessThanOrEqualTo(String value) {
			addCriterion("approve_by <=", value, "approve_by");
			return (Criteria) this;
		}

		public Criteria andApprove_byLike(String value) {
			addCriterion("approve_by like", value, "approve_by");
			return (Criteria) this;
		}

		public Criteria andApprove_byNotLike(String value) {
			addCriterion("approve_by not like", value, "approve_by");
			return (Criteria) this;
		}

		public Criteria andApprove_byIn(List<String> values) {
			addCriterion("approve_by in", values, "approve_by");
			return (Criteria) this;
		}

		public Criteria andApprove_byNotIn(List<String> values) {
			addCriterion("approve_by not in", values, "approve_by");
			return (Criteria) this;
		}

		public Criteria andApprove_byBetween(String value1, String value2) {
			addCriterion("approve_by between", value1, value2, "approve_by");
			return (Criteria) this;
		}

		public Criteria andApprove_byNotBetween(String value1, String value2) {
			addCriterion("approve_by not between", value1, value2, "approve_by");
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

		public Criteria andRegister_dateIsNull() {
			addCriterion("register_date is null");
			return (Criteria) this;
		}

		public Criteria andRegister_dateIsNotNull() {
			addCriterion("register_date is not null");
			return (Criteria) this;
		}

		public Criteria andRegister_dateEqualTo(Date value) {
			addCriterion("register_date =", value, "register_date");
			return (Criteria) this;
		}

		public Criteria andRegister_dateNotEqualTo(Date value) {
			addCriterion("register_date <>", value, "register_date");
			return (Criteria) this;
		}

		public Criteria andRegister_dateGreaterThan(Date value) {
			addCriterion("register_date >", value, "register_date");
			return (Criteria) this;
		}

		public Criteria andRegister_dateGreaterThanOrEqualTo(Date value) {
			addCriterion("register_date >=", value, "register_date");
			return (Criteria) this;
		}

		public Criteria andRegister_dateLessThan(Date value) {
			addCriterion("register_date <", value, "register_date");
			return (Criteria) this;
		}

		public Criteria andRegister_dateLessThanOrEqualTo(Date value) {
			addCriterion("register_date <=", value, "register_date");
			return (Criteria) this;
		}

		public Criteria andRegister_dateIn(List<Date> values) {
			addCriterion("register_date in", values, "register_date");
			return (Criteria) this;
		}

		public Criteria andRegister_dateNotIn(List<Date> values) {
			addCriterion("register_date not in", values, "register_date");
			return (Criteria) this;
		}

		public Criteria andRegister_dateBetween(Date value1, Date value2) {
			addCriterion("register_date between", value1, value2,
					"register_date");
			return (Criteria) this;
		}

		public Criteria andRegister_dateNotBetween(Date value1, Date value2) {
			addCriterion("register_date not between", value1, value2,
					"register_date");
			return (Criteria) this;
		}

		public Criteria andUpdate_dateIsNull() {
			addCriterion("update_date is null");
			return (Criteria) this;
		}

		public Criteria andUpdate_dateIsNotNull() {
			addCriterion("update_date is not null");
			return (Criteria) this;
		}

		public Criteria andUpdate_dateEqualTo(Date value) {
			addCriterion("update_date =", value, "update_date");
			return (Criteria) this;
		}

		public Criteria andUpdate_dateNotEqualTo(Date value) {
			addCriterion("update_date <>", value, "update_date");
			return (Criteria) this;
		}

		public Criteria andUpdate_dateGreaterThan(Date value) {
			addCriterion("update_date >", value, "update_date");
			return (Criteria) this;
		}

		public Criteria andUpdate_dateGreaterThanOrEqualTo(Date value) {
			addCriterion("update_date >=", value, "update_date");
			return (Criteria) this;
		}

		public Criteria andUpdate_dateLessThan(Date value) {
			addCriterion("update_date <", value, "update_date");
			return (Criteria) this;
		}

		public Criteria andUpdate_dateLessThanOrEqualTo(Date value) {
			addCriterion("update_date <=", value, "update_date");
			return (Criteria) this;
		}

		public Criteria andUpdate_dateIn(List<Date> values) {
			addCriterion("update_date in", values, "update_date");
			return (Criteria) this;
		}

		public Criteria andUpdate_dateNotIn(List<Date> values) {
			addCriterion("update_date not in", values, "update_date");
			return (Criteria) this;
		}

		public Criteria andUpdate_dateBetween(Date value1, Date value2) {
			addCriterion("update_date between", value1, value2, "update_date");
			return (Criteria) this;
		}

		public Criteria andUpdate_dateNotBetween(Date value1, Date value2) {
			addCriterion("update_date not between", value1, value2,
					"update_date");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table edu.derate_request
	 * @mbggenerated  Thu Feb 09 18:11:26 CST 2012
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
     * This class corresponds to the database table edu.derate_request
     *
     * @mbggenerated do_not_delete_during_merge Sun Jan 15 18:52:28 CST 2012
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}