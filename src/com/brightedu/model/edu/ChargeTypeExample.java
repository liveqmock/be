package com.brightedu.model.edu;

import java.util.ArrayList;
import java.util.List;

public class ChargeTypeExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table edu.charge_type
	 * @mbggenerated  Thu Feb 09 18:41:46 CST 2012
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table edu.charge_type
	 * @mbggenerated  Thu Feb 09 18:41:46 CST 2012
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table edu.charge_type
	 * @mbggenerated  Thu Feb 09 18:41:46 CST 2012
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table edu.charge_type
	 * @mbggenerated  Thu Feb 09 18:41:46 CST 2012
	 */
	public ChargeTypeExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table edu.charge_type
	 * @mbggenerated  Thu Feb 09 18:41:46 CST 2012
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table edu.charge_type
	 * @mbggenerated  Thu Feb 09 18:41:46 CST 2012
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table edu.charge_type
	 * @mbggenerated  Thu Feb 09 18:41:46 CST 2012
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table edu.charge_type
	 * @mbggenerated  Thu Feb 09 18:41:46 CST 2012
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table edu.charge_type
	 * @mbggenerated  Thu Feb 09 18:41:46 CST 2012
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table edu.charge_type
	 * @mbggenerated  Thu Feb 09 18:41:46 CST 2012
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table edu.charge_type
	 * @mbggenerated  Thu Feb 09 18:41:46 CST 2012
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table edu.charge_type
	 * @mbggenerated  Thu Feb 09 18:41:46 CST 2012
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table edu.charge_type
	 * @mbggenerated  Thu Feb 09 18:41:46 CST 2012
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table edu.charge_type
	 * @mbggenerated  Thu Feb 09 18:41:46 CST 2012
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table edu.charge_type
	 * @mbggenerated  Thu Feb 09 18:41:46 CST 2012
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

		public Criteria andCharge_type_nameIsNull() {
			addCriterion("charge_type_name is null");
			return (Criteria) this;
		}

		public Criteria andCharge_type_nameIsNotNull() {
			addCriterion("charge_type_name is not null");
			return (Criteria) this;
		}

		public Criteria andCharge_type_nameEqualTo(String value) {
			addCriterion("charge_type_name =", value, "charge_type_name");
			return (Criteria) this;
		}

		public Criteria andCharge_type_nameNotEqualTo(String value) {
			addCriterion("charge_type_name <>", value, "charge_type_name");
			return (Criteria) this;
		}

		public Criteria andCharge_type_nameGreaterThan(String value) {
			addCriterion("charge_type_name >", value, "charge_type_name");
			return (Criteria) this;
		}

		public Criteria andCharge_type_nameGreaterThanOrEqualTo(String value) {
			addCriterion("charge_type_name >=", value, "charge_type_name");
			return (Criteria) this;
		}

		public Criteria andCharge_type_nameLessThan(String value) {
			addCriterion("charge_type_name <", value, "charge_type_name");
			return (Criteria) this;
		}

		public Criteria andCharge_type_nameLessThanOrEqualTo(String value) {
			addCriterion("charge_type_name <=", value, "charge_type_name");
			return (Criteria) this;
		}

		public Criteria andCharge_type_nameLike(String value) {
			addCriterion("charge_type_name like", value, "charge_type_name");
			return (Criteria) this;
		}

		public Criteria andCharge_type_nameNotLike(String value) {
			addCriterion("charge_type_name not like", value, "charge_type_name");
			return (Criteria) this;
		}

		public Criteria andCharge_type_nameIn(List<String> values) {
			addCriterion("charge_type_name in", values, "charge_type_name");
			return (Criteria) this;
		}

		public Criteria andCharge_type_nameNotIn(List<String> values) {
			addCriterion("charge_type_name not in", values, "charge_type_name");
			return (Criteria) this;
		}

		public Criteria andCharge_type_nameBetween(String value1, String value2) {
			addCriterion("charge_type_name between", value1, value2,
					"charge_type_name");
			return (Criteria) this;
		}

		public Criteria andCharge_type_nameNotBetween(String value1,
				String value2) {
			addCriterion("charge_type_name not between", value1, value2,
					"charge_type_name");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table edu.charge_type
	 * @mbggenerated  Thu Feb 09 18:41:46 CST 2012
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
     * This class corresponds to the database table edu.charge_type
     *
     * @mbggenerated do_not_delete_during_merge Thu Feb 09 18:11:26 CST 2012
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}