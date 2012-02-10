package com.brightedu.model.edu;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import com.brightedu.client.ds.Page;

public class EntranceCostExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table edu.entrance_cost
	 * @mbggenerated  Sat Feb 11 02:04:14 CST 2012
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table edu.entrance_cost
	 * @mbggenerated  Sat Feb 11 02:04:14 CST 2012
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table edu.entrance_cost
	 * @mbggenerated  Sat Feb 11 02:04:14 CST 2012
	 */
	protected List<Criteria> oredCriteria;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table edu.entrance_cost
	 * @mbggenerated  Sat Feb 11 02:04:14 CST 2012
	 */
	protected Page page;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table edu.entrance_cost
	 * @mbggenerated  Sat Feb 11 02:04:14 CST 2012
	 */
	public EntranceCostExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table edu.entrance_cost
	 * @mbggenerated  Sat Feb 11 02:04:14 CST 2012
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table edu.entrance_cost
	 * @mbggenerated  Sat Feb 11 02:04:14 CST 2012
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table edu.entrance_cost
	 * @mbggenerated  Sat Feb 11 02:04:14 CST 2012
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table edu.entrance_cost
	 * @mbggenerated  Sat Feb 11 02:04:14 CST 2012
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table edu.entrance_cost
	 * @mbggenerated  Sat Feb 11 02:04:14 CST 2012
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table edu.entrance_cost
	 * @mbggenerated  Sat Feb 11 02:04:14 CST 2012
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table edu.entrance_cost
	 * @mbggenerated  Sat Feb 11 02:04:14 CST 2012
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table edu.entrance_cost
	 * @mbggenerated  Sat Feb 11 02:04:14 CST 2012
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table edu.entrance_cost
	 * @mbggenerated  Sat Feb 11 02:04:14 CST 2012
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table edu.entrance_cost
	 * @mbggenerated  Sat Feb 11 02:04:14 CST 2012
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table edu.entrance_cost
	 * @mbggenerated  Sat Feb 11 02:04:14 CST 2012
	 */
	public void setPage(Page page) {
		this.page = page;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table edu.entrance_cost
	 * @mbggenerated  Sat Feb 11 02:04:14 CST 2012
	 */
	public Page getPage() {
		return page;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table edu.entrance_cost
	 * @mbggenerated  Sat Feb 11 02:04:14 CST 2012
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

		public Criteria andCollege_idIsNull() {
			addCriterion("college_id is null");
			return (Criteria) this;
		}

		public Criteria andCollege_idIsNotNull() {
			addCriterion("college_id is not null");
			return (Criteria) this;
		}

		public Criteria andCollege_idEqualTo(Integer value) {
			addCriterion("college_id =", value, "college_id");
			return (Criteria) this;
		}

		public Criteria andCollege_idNotEqualTo(Integer value) {
			addCriterion("college_id <>", value, "college_id");
			return (Criteria) this;
		}

		public Criteria andCollege_idGreaterThan(Integer value) {
			addCriterion("college_id >", value, "college_id");
			return (Criteria) this;
		}

		public Criteria andCollege_idGreaterThanOrEqualTo(Integer value) {
			addCriterion("college_id >=", value, "college_id");
			return (Criteria) this;
		}

		public Criteria andCollege_idLessThan(Integer value) {
			addCriterion("college_id <", value, "college_id");
			return (Criteria) this;
		}

		public Criteria andCollege_idLessThanOrEqualTo(Integer value) {
			addCriterion("college_id <=", value, "college_id");
			return (Criteria) this;
		}

		public Criteria andCollege_idIn(List<Integer> values) {
			addCriterion("college_id in", values, "college_id");
			return (Criteria) this;
		}

		public Criteria andCollege_idNotIn(List<Integer> values) {
			addCriterion("college_id not in", values, "college_id");
			return (Criteria) this;
		}

		public Criteria andCollege_idBetween(Integer value1, Integer value2) {
			addCriterion("college_id between", value1, value2, "college_id");
			return (Criteria) this;
		}

		public Criteria andCollege_idNotBetween(Integer value1, Integer value2) {
			addCriterion("college_id not between", value1, value2, "college_id");
			return (Criteria) this;
		}

		public Criteria andBatch_idIsNull() {
			addCriterion("batch_id is null");
			return (Criteria) this;
		}

		public Criteria andBatch_idIsNotNull() {
			addCriterion("batch_id is not null");
			return (Criteria) this;
		}

		public Criteria andBatch_idEqualTo(Integer value) {
			addCriterion("batch_id =", value, "batch_id");
			return (Criteria) this;
		}

		public Criteria andBatch_idNotEqualTo(Integer value) {
			addCriterion("batch_id <>", value, "batch_id");
			return (Criteria) this;
		}

		public Criteria andBatch_idGreaterThan(Integer value) {
			addCriterion("batch_id >", value, "batch_id");
			return (Criteria) this;
		}

		public Criteria andBatch_idGreaterThanOrEqualTo(Integer value) {
			addCriterion("batch_id >=", value, "batch_id");
			return (Criteria) this;
		}

		public Criteria andBatch_idLessThan(Integer value) {
			addCriterion("batch_id <", value, "batch_id");
			return (Criteria) this;
		}

		public Criteria andBatch_idLessThanOrEqualTo(Integer value) {
			addCriterion("batch_id <=", value, "batch_id");
			return (Criteria) this;
		}

		public Criteria andBatch_idIn(List<Integer> values) {
			addCriterion("batch_id in", values, "batch_id");
			return (Criteria) this;
		}

		public Criteria andBatch_idNotIn(List<Integer> values) {
			addCriterion("batch_id not in", values, "batch_id");
			return (Criteria) this;
		}

		public Criteria andBatch_idBetween(Integer value1, Integer value2) {
			addCriterion("batch_id between", value1, value2, "batch_id");
			return (Criteria) this;
		}

		public Criteria andBatch_idNotBetween(Integer value1, Integer value2) {
			addCriterion("batch_id not between", value1, value2, "batch_id");
			return (Criteria) this;
		}

		public Criteria andAgent_idIsNull() {
			addCriterion("agent_id is null");
			return (Criteria) this;
		}

		public Criteria andAgent_idIsNotNull() {
			addCriterion("agent_id is not null");
			return (Criteria) this;
		}

		public Criteria andAgent_idEqualTo(Integer value) {
			addCriterion("agent_id =", value, "agent_id");
			return (Criteria) this;
		}

		public Criteria andAgent_idNotEqualTo(Integer value) {
			addCriterion("agent_id <>", value, "agent_id");
			return (Criteria) this;
		}

		public Criteria andAgent_idGreaterThan(Integer value) {
			addCriterion("agent_id >", value, "agent_id");
			return (Criteria) this;
		}

		public Criteria andAgent_idGreaterThanOrEqualTo(Integer value) {
			addCriterion("agent_id >=", value, "agent_id");
			return (Criteria) this;
		}

		public Criteria andAgent_idLessThan(Integer value) {
			addCriterion("agent_id <", value, "agent_id");
			return (Criteria) this;
		}

		public Criteria andAgent_idLessThanOrEqualTo(Integer value) {
			addCriterion("agent_id <=", value, "agent_id");
			return (Criteria) this;
		}

		public Criteria andAgent_idIn(List<Integer> values) {
			addCriterion("agent_id in", values, "agent_id");
			return (Criteria) this;
		}

		public Criteria andAgent_idNotIn(List<Integer> values) {
			addCriterion("agent_id not in", values, "agent_id");
			return (Criteria) this;
		}

		public Criteria andAgent_idBetween(Integer value1, Integer value2) {
			addCriterion("agent_id between", value1, value2, "agent_id");
			return (Criteria) this;
		}

		public Criteria andAgent_idNotBetween(Integer value1, Integer value2) {
			addCriterion("agent_id not between", value1, value2, "agent_id");
			return (Criteria) this;
		}

		public Criteria andSubject_idIsNull() {
			addCriterion("subject_id is null");
			return (Criteria) this;
		}

		public Criteria andSubject_idIsNotNull() {
			addCriterion("subject_id is not null");
			return (Criteria) this;
		}

		public Criteria andSubject_idEqualTo(Integer value) {
			addCriterion("subject_id =", value, "subject_id");
			return (Criteria) this;
		}

		public Criteria andSubject_idNotEqualTo(Integer value) {
			addCriterion("subject_id <>", value, "subject_id");
			return (Criteria) this;
		}

		public Criteria andSubject_idGreaterThan(Integer value) {
			addCriterion("subject_id >", value, "subject_id");
			return (Criteria) this;
		}

		public Criteria andSubject_idGreaterThanOrEqualTo(Integer value) {
			addCriterion("subject_id >=", value, "subject_id");
			return (Criteria) this;
		}

		public Criteria andSubject_idLessThan(Integer value) {
			addCriterion("subject_id <", value, "subject_id");
			return (Criteria) this;
		}

		public Criteria andSubject_idLessThanOrEqualTo(Integer value) {
			addCriterion("subject_id <=", value, "subject_id");
			return (Criteria) this;
		}

		public Criteria andSubject_idIn(List<Integer> values) {
			addCriterion("subject_id in", values, "subject_id");
			return (Criteria) this;
		}

		public Criteria andSubject_idNotIn(List<Integer> values) {
			addCriterion("subject_id not in", values, "subject_id");
			return (Criteria) this;
		}

		public Criteria andSubject_idBetween(Integer value1, Integer value2) {
			addCriterion("subject_id between", value1, value2, "subject_id");
			return (Criteria) this;
		}

		public Criteria andSubject_idNotBetween(Integer value1, Integer value2) {
			addCriterion("subject_id not between", value1, value2, "subject_id");
			return (Criteria) this;
		}

		public Criteria andFee_idIsNull() {
			addCriterion("fee_id is null");
			return (Criteria) this;
		}

		public Criteria andFee_idIsNotNull() {
			addCriterion("fee_id is not null");
			return (Criteria) this;
		}

		public Criteria andFee_idEqualTo(Integer value) {
			addCriterion("fee_id =", value, "fee_id");
			return (Criteria) this;
		}

		public Criteria andFee_idNotEqualTo(Integer value) {
			addCriterion("fee_id <>", value, "fee_id");
			return (Criteria) this;
		}

		public Criteria andFee_idGreaterThan(Integer value) {
			addCriterion("fee_id >", value, "fee_id");
			return (Criteria) this;
		}

		public Criteria andFee_idGreaterThanOrEqualTo(Integer value) {
			addCriterion("fee_id >=", value, "fee_id");
			return (Criteria) this;
		}

		public Criteria andFee_idLessThan(Integer value) {
			addCriterion("fee_id <", value, "fee_id");
			return (Criteria) this;
		}

		public Criteria andFee_idLessThanOrEqualTo(Integer value) {
			addCriterion("fee_id <=", value, "fee_id");
			return (Criteria) this;
		}

		public Criteria andFee_idIn(List<Integer> values) {
			addCriterion("fee_id in", values, "fee_id");
			return (Criteria) this;
		}

		public Criteria andFee_idNotIn(List<Integer> values) {
			addCriterion("fee_id not in", values, "fee_id");
			return (Criteria) this;
		}

		public Criteria andFee_idBetween(Integer value1, Integer value2) {
			addCriterion("fee_id between", value1, value2, "fee_id");
			return (Criteria) this;
		}

		public Criteria andFee_idNotBetween(Integer value1, Integer value2) {
			addCriterion("fee_id not between", value1, value2, "fee_id");
			return (Criteria) this;
		}

		public Criteria andFeeIsNull() {
			addCriterion("fee is null");
			return (Criteria) this;
		}

		public Criteria andFeeIsNotNull() {
			addCriterion("fee is not null");
			return (Criteria) this;
		}

		public Criteria andFeeEqualTo(BigDecimal value) {
			addCriterion("fee =", value, "fee");
			return (Criteria) this;
		}

		public Criteria andFeeNotEqualTo(BigDecimal value) {
			addCriterion("fee <>", value, "fee");
			return (Criteria) this;
		}

		public Criteria andFeeGreaterThan(BigDecimal value) {
			addCriterion("fee >", value, "fee");
			return (Criteria) this;
		}

		public Criteria andFeeGreaterThanOrEqualTo(BigDecimal value) {
			addCriterion("fee >=", value, "fee");
			return (Criteria) this;
		}

		public Criteria andFeeLessThan(BigDecimal value) {
			addCriterion("fee <", value, "fee");
			return (Criteria) this;
		}

		public Criteria andFeeLessThanOrEqualTo(BigDecimal value) {
			addCriterion("fee <=", value, "fee");
			return (Criteria) this;
		}

		public Criteria andFeeIn(List<BigDecimal> values) {
			addCriterion("fee in", values, "fee");
			return (Criteria) this;
		}

		public Criteria andFeeNotIn(List<BigDecimal> values) {
			addCriterion("fee not in", values, "fee");
			return (Criteria) this;
		}

		public Criteria andFeeBetween(BigDecimal value1, BigDecimal value2) {
			addCriterion("fee between", value1, value2, "fee");
			return (Criteria) this;
		}

		public Criteria andFeeNotBetween(BigDecimal value1, BigDecimal value2) {
			addCriterion("fee not between", value1, value2, "fee");
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
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table edu.entrance_cost
	 * @mbggenerated  Sat Feb 11 02:04:14 CST 2012
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
     * This class corresponds to the database table edu.entrance_cost
     *
     * @mbggenerated do_not_delete_during_merge Sun Jan 15 18:52:28 CST 2012
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}