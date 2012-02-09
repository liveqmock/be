package com.brightedu.model.edu;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AgreeReturnExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table edu.agree_return
	 * @mbggenerated  Thu Feb 09 18:11:26 CST 2012
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table edu.agree_return
	 * @mbggenerated  Thu Feb 09 18:11:26 CST 2012
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table edu.agree_return
	 * @mbggenerated  Thu Feb 09 18:11:26 CST 2012
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table edu.agree_return
	 * @mbggenerated  Thu Feb 09 18:11:26 CST 2012
	 */
	public AgreeReturnExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table edu.agree_return
	 * @mbggenerated  Thu Feb 09 18:11:26 CST 2012
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table edu.agree_return
	 * @mbggenerated  Thu Feb 09 18:11:26 CST 2012
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table edu.agree_return
	 * @mbggenerated  Thu Feb 09 18:11:26 CST 2012
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table edu.agree_return
	 * @mbggenerated  Thu Feb 09 18:11:26 CST 2012
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table edu.agree_return
	 * @mbggenerated  Thu Feb 09 18:11:26 CST 2012
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table edu.agree_return
	 * @mbggenerated  Thu Feb 09 18:11:26 CST 2012
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table edu.agree_return
	 * @mbggenerated  Thu Feb 09 18:11:26 CST 2012
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table edu.agree_return
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
	 * This method was generated by MyBatis Generator. This method corresponds to the database table edu.agree_return
	 * @mbggenerated  Thu Feb 09 18:11:26 CST 2012
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table edu.agree_return
	 * @mbggenerated  Thu Feb 09 18:11:26 CST 2012
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table edu.agree_return
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

		public Criteria andAgree_return_idIsNull() {
			addCriterion("agree_return_id is null");
			return (Criteria) this;
		}

		public Criteria andAgree_return_idIsNotNull() {
			addCriterion("agree_return_id is not null");
			return (Criteria) this;
		}

		public Criteria andAgree_return_idEqualTo(Integer value) {
			addCriterion("agree_return_id =", value, "agree_return_id");
			return (Criteria) this;
		}

		public Criteria andAgree_return_idNotEqualTo(Integer value) {
			addCriterion("agree_return_id <>", value, "agree_return_id");
			return (Criteria) this;
		}

		public Criteria andAgree_return_idGreaterThan(Integer value) {
			addCriterion("agree_return_id >", value, "agree_return_id");
			return (Criteria) this;
		}

		public Criteria andAgree_return_idGreaterThanOrEqualTo(Integer value) {
			addCriterion("agree_return_id >=", value, "agree_return_id");
			return (Criteria) this;
		}

		public Criteria andAgree_return_idLessThan(Integer value) {
			addCriterion("agree_return_id <", value, "agree_return_id");
			return (Criteria) this;
		}

		public Criteria andAgree_return_idLessThanOrEqualTo(Integer value) {
			addCriterion("agree_return_id <=", value, "agree_return_id");
			return (Criteria) this;
		}

		public Criteria andAgree_return_idIn(List<Integer> values) {
			addCriterion("agree_return_id in", values, "agree_return_id");
			return (Criteria) this;
		}

		public Criteria andAgree_return_idNotIn(List<Integer> values) {
			addCriterion("agree_return_id not in", values, "agree_return_id");
			return (Criteria) this;
		}

		public Criteria andAgree_return_idBetween(Integer value1, Integer value2) {
			addCriterion("agree_return_id between", value1, value2,
					"agree_return_id");
			return (Criteria) this;
		}

		public Criteria andAgree_return_idNotBetween(Integer value1,
				Integer value2) {
			addCriterion("agree_return_id not between", value1, value2,
					"agree_return_id");
			return (Criteria) this;
		}

		public Criteria andAgree_return_nameIsNull() {
			addCriterion("agree_return_name is null");
			return (Criteria) this;
		}

		public Criteria andAgree_return_nameIsNotNull() {
			addCriterion("agree_return_name is not null");
			return (Criteria) this;
		}

		public Criteria andAgree_return_nameEqualTo(String value) {
			addCriterion("agree_return_name =", value, "agree_return_name");
			return (Criteria) this;
		}

		public Criteria andAgree_return_nameNotEqualTo(String value) {
			addCriterion("agree_return_name <>", value, "agree_return_name");
			return (Criteria) this;
		}

		public Criteria andAgree_return_nameGreaterThan(String value) {
			addCriterion("agree_return_name >", value, "agree_return_name");
			return (Criteria) this;
		}

		public Criteria andAgree_return_nameGreaterThanOrEqualTo(String value) {
			addCriterion("agree_return_name >=", value, "agree_return_name");
			return (Criteria) this;
		}

		public Criteria andAgree_return_nameLessThan(String value) {
			addCriterion("agree_return_name <", value, "agree_return_name");
			return (Criteria) this;
		}

		public Criteria andAgree_return_nameLessThanOrEqualTo(String value) {
			addCriterion("agree_return_name <=", value, "agree_return_name");
			return (Criteria) this;
		}

		public Criteria andAgree_return_nameLike(String value) {
			addCriterion("agree_return_name like", value, "agree_return_name");
			return (Criteria) this;
		}

		public Criteria andAgree_return_nameNotLike(String value) {
			addCriterion("agree_return_name not like", value,
					"agree_return_name");
			return (Criteria) this;
		}

		public Criteria andAgree_return_nameIn(List<String> values) {
			addCriterion("agree_return_name in", values, "agree_return_name");
			return (Criteria) this;
		}

		public Criteria andAgree_return_nameNotIn(List<String> values) {
			addCriterion("agree_return_name not in", values,
					"agree_return_name");
			return (Criteria) this;
		}

		public Criteria andAgree_return_nameBetween(String value1, String value2) {
			addCriterion("agree_return_name between", value1, value2,
					"agree_return_name");
			return (Criteria) this;
		}

		public Criteria andAgree_return_nameNotBetween(String value1,
				String value2) {
			addCriterion("agree_return_name not between", value1, value2,
					"agree_return_name");
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

		public Criteria andCommentIsNull() {
			addCriterion("comment is null");
			return (Criteria) this;
		}

		public Criteria andCommentIsNotNull() {
			addCriterion("comment is not null");
			return (Criteria) this;
		}

		public Criteria andCommentEqualTo(String value) {
			addCriterion("comment =", value, "comment");
			return (Criteria) this;
		}

		public Criteria andCommentNotEqualTo(String value) {
			addCriterion("comment <>", value, "comment");
			return (Criteria) this;
		}

		public Criteria andCommentGreaterThan(String value) {
			addCriterion("comment >", value, "comment");
			return (Criteria) this;
		}

		public Criteria andCommentGreaterThanOrEqualTo(String value) {
			addCriterion("comment >=", value, "comment");
			return (Criteria) this;
		}

		public Criteria andCommentLessThan(String value) {
			addCriterion("comment <", value, "comment");
			return (Criteria) this;
		}

		public Criteria andCommentLessThanOrEqualTo(String value) {
			addCriterion("comment <=", value, "comment");
			return (Criteria) this;
		}

		public Criteria andCommentLike(String value) {
			addCriterion("comment like", value, "comment");
			return (Criteria) this;
		}

		public Criteria andCommentNotLike(String value) {
			addCriterion("comment not like", value, "comment");
			return (Criteria) this;
		}

		public Criteria andCommentIn(List<String> values) {
			addCriterion("comment in", values, "comment");
			return (Criteria) this;
		}

		public Criteria andCommentNotIn(List<String> values) {
			addCriterion("comment not in", values, "comment");
			return (Criteria) this;
		}

		public Criteria andCommentBetween(String value1, String value2) {
			addCriterion("comment between", value1, value2, "comment");
			return (Criteria) this;
		}

		public Criteria andCommentNotBetween(String value1, String value2) {
			addCriterion("comment not between", value1, value2, "comment");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table edu.agree_return
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
     * This class corresponds to the database table edu.agree_return
     *
     * @mbggenerated do_not_delete_during_merge Tue Jan 31 12:29:48 CST 2012
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}