package com.brightedu.model.edu;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RecruitAgentExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table edu.recruit_agent
	 * @mbggenerated  Mon Jan 16 17:46:15 CST 2012
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table edu.recruit_agent
	 * @mbggenerated  Mon Jan 16 17:46:15 CST 2012
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table edu.recruit_agent
	 * @mbggenerated  Mon Jan 16 17:46:15 CST 2012
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table edu.recruit_agent
	 * @mbggenerated  Mon Jan 16 17:46:15 CST 2012
	 */
	public RecruitAgentExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table edu.recruit_agent
	 * @mbggenerated  Mon Jan 16 17:46:15 CST 2012
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table edu.recruit_agent
	 * @mbggenerated  Mon Jan 16 17:46:15 CST 2012
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table edu.recruit_agent
	 * @mbggenerated  Mon Jan 16 17:46:15 CST 2012
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table edu.recruit_agent
	 * @mbggenerated  Mon Jan 16 17:46:15 CST 2012
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table edu.recruit_agent
	 * @mbggenerated  Mon Jan 16 17:46:15 CST 2012
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table edu.recruit_agent
	 * @mbggenerated  Mon Jan 16 17:46:15 CST 2012
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table edu.recruit_agent
	 * @mbggenerated  Mon Jan 16 17:46:15 CST 2012
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table edu.recruit_agent
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
	 * This method was generated by MyBatis Generator. This method corresponds to the database table edu.recruit_agent
	 * @mbggenerated  Mon Jan 16 17:46:15 CST 2012
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table edu.recruit_agent
	 * @mbggenerated  Mon Jan 16 17:46:15 CST 2012
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table edu.recruit_agent
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

		public Criteria andAgent_nameIsNull() {
			addCriterion("agent_name is null");
			return (Criteria) this;
		}

		public Criteria andAgent_nameIsNotNull() {
			addCriterion("agent_name is not null");
			return (Criteria) this;
		}

		public Criteria andAgent_nameEqualTo(String value) {
			addCriterion("agent_name =", value, "agent_name");
			return (Criteria) this;
		}

		public Criteria andAgent_nameNotEqualTo(String value) {
			addCriterion("agent_name <>", value, "agent_name");
			return (Criteria) this;
		}

		public Criteria andAgent_nameGreaterThan(String value) {
			addCriterion("agent_name >", value, "agent_name");
			return (Criteria) this;
		}

		public Criteria andAgent_nameGreaterThanOrEqualTo(String value) {
			addCriterion("agent_name >=", value, "agent_name");
			return (Criteria) this;
		}

		public Criteria andAgent_nameLessThan(String value) {
			addCriterion("agent_name <", value, "agent_name");
			return (Criteria) this;
		}

		public Criteria andAgent_nameLessThanOrEqualTo(String value) {
			addCriterion("agent_name <=", value, "agent_name");
			return (Criteria) this;
		}

		public Criteria andAgent_nameLike(String value) {
			addCriterion("agent_name like", value, "agent_name");
			return (Criteria) this;
		}

		public Criteria andAgent_nameNotLike(String value) {
			addCriterion("agent_name not like", value, "agent_name");
			return (Criteria) this;
		}

		public Criteria andAgent_nameIn(List<String> values) {
			addCriterion("agent_name in", values, "agent_name");
			return (Criteria) this;
		}

		public Criteria andAgent_nameNotIn(List<String> values) {
			addCriterion("agent_name not in", values, "agent_name");
			return (Criteria) this;
		}

		public Criteria andAgent_nameBetween(String value1, String value2) {
			addCriterion("agent_name between", value1, value2, "agent_name");
			return (Criteria) this;
		}

		public Criteria andAgent_nameNotBetween(String value1, String value2) {
			addCriterion("agent_name not between", value1, value2, "agent_name");
			return (Criteria) this;
		}

		public Criteria andAgent_type_idIsNull() {
			addCriterion("agent_type_id is null");
			return (Criteria) this;
		}

		public Criteria andAgent_type_idIsNotNull() {
			addCriterion("agent_type_id is not null");
			return (Criteria) this;
		}

		public Criteria andAgent_type_idEqualTo(Integer value) {
			addCriterion("agent_type_id =", value, "agent_type_id");
			return (Criteria) this;
		}

		public Criteria andAgent_type_idNotEqualTo(Integer value) {
			addCriterion("agent_type_id <>", value, "agent_type_id");
			return (Criteria) this;
		}

		public Criteria andAgent_type_idGreaterThan(Integer value) {
			addCriterion("agent_type_id >", value, "agent_type_id");
			return (Criteria) this;
		}

		public Criteria andAgent_type_idGreaterThanOrEqualTo(Integer value) {
			addCriterion("agent_type_id >=", value, "agent_type_id");
			return (Criteria) this;
		}

		public Criteria andAgent_type_idLessThan(Integer value) {
			addCriterion("agent_type_id <", value, "agent_type_id");
			return (Criteria) this;
		}

		public Criteria andAgent_type_idLessThanOrEqualTo(Integer value) {
			addCriterion("agent_type_id <=", value, "agent_type_id");
			return (Criteria) this;
		}

		public Criteria andAgent_type_idIn(List<Integer> values) {
			addCriterion("agent_type_id in", values, "agent_type_id");
			return (Criteria) this;
		}

		public Criteria andAgent_type_idNotIn(List<Integer> values) {
			addCriterion("agent_type_id not in", values, "agent_type_id");
			return (Criteria) this;
		}

		public Criteria andAgent_type_idBetween(Integer value1, Integer value2) {
			addCriterion("agent_type_id between", value1, value2,
					"agent_type_id");
			return (Criteria) this;
		}

		public Criteria andAgent_type_idNotBetween(Integer value1,
				Integer value2) {
			addCriterion("agent_type_id not between", value1, value2,
					"agent_type_id");
			return (Criteria) this;
		}

		public Criteria andResponsible_personIsNull() {
			addCriterion("responsible_person is null");
			return (Criteria) this;
		}

		public Criteria andResponsible_personIsNotNull() {
			addCriterion("responsible_person is not null");
			return (Criteria) this;
		}

		public Criteria andResponsible_personEqualTo(String value) {
			addCriterion("responsible_person =", value, "responsible_person");
			return (Criteria) this;
		}

		public Criteria andResponsible_personNotEqualTo(String value) {
			addCriterion("responsible_person <>", value, "responsible_person");
			return (Criteria) this;
		}

		public Criteria andResponsible_personGreaterThan(String value) {
			addCriterion("responsible_person >", value, "responsible_person");
			return (Criteria) this;
		}

		public Criteria andResponsible_personGreaterThanOrEqualTo(String value) {
			addCriterion("responsible_person >=", value, "responsible_person");
			return (Criteria) this;
		}

		public Criteria andResponsible_personLessThan(String value) {
			addCriterion("responsible_person <", value, "responsible_person");
			return (Criteria) this;
		}

		public Criteria andResponsible_personLessThanOrEqualTo(String value) {
			addCriterion("responsible_person <=", value, "responsible_person");
			return (Criteria) this;
		}

		public Criteria andResponsible_personLike(String value) {
			addCriterion("responsible_person like", value, "responsible_person");
			return (Criteria) this;
		}

		public Criteria andResponsible_personNotLike(String value) {
			addCriterion("responsible_person not like", value,
					"responsible_person");
			return (Criteria) this;
		}

		public Criteria andResponsible_personIn(List<String> values) {
			addCriterion("responsible_person in", values, "responsible_person");
			return (Criteria) this;
		}

		public Criteria andResponsible_personNotIn(List<String> values) {
			addCriterion("responsible_person not in", values,
					"responsible_person");
			return (Criteria) this;
		}

		public Criteria andResponsible_personBetween(String value1,
				String value2) {
			addCriterion("responsible_person between", value1, value2,
					"responsible_person");
			return (Criteria) this;
		}

		public Criteria andResponsible_personNotBetween(String value1,
				String value2) {
			addCriterion("responsible_person not between", value1, value2,
					"responsible_person");
			return (Criteria) this;
		}

		public Criteria andContact_personIsNull() {
			addCriterion("contact_person is null");
			return (Criteria) this;
		}

		public Criteria andContact_personIsNotNull() {
			addCriterion("contact_person is not null");
			return (Criteria) this;
		}

		public Criteria andContact_personEqualTo(String value) {
			addCriterion("contact_person =", value, "contact_person");
			return (Criteria) this;
		}

		public Criteria andContact_personNotEqualTo(String value) {
			addCriterion("contact_person <>", value, "contact_person");
			return (Criteria) this;
		}

		public Criteria andContact_personGreaterThan(String value) {
			addCriterion("contact_person >", value, "contact_person");
			return (Criteria) this;
		}

		public Criteria andContact_personGreaterThanOrEqualTo(String value) {
			addCriterion("contact_person >=", value, "contact_person");
			return (Criteria) this;
		}

		public Criteria andContact_personLessThan(String value) {
			addCriterion("contact_person <", value, "contact_person");
			return (Criteria) this;
		}

		public Criteria andContact_personLessThanOrEqualTo(String value) {
			addCriterion("contact_person <=", value, "contact_person");
			return (Criteria) this;
		}

		public Criteria andContact_personLike(String value) {
			addCriterion("contact_person like", value, "contact_person");
			return (Criteria) this;
		}

		public Criteria andContact_personNotLike(String value) {
			addCriterion("contact_person not like", value, "contact_person");
			return (Criteria) this;
		}

		public Criteria andContact_personIn(List<String> values) {
			addCriterion("contact_person in", values, "contact_person");
			return (Criteria) this;
		}

		public Criteria andContact_personNotIn(List<String> values) {
			addCriterion("contact_person not in", values, "contact_person");
			return (Criteria) this;
		}

		public Criteria andContact_personBetween(String value1, String value2) {
			addCriterion("contact_person between", value1, value2,
					"contact_person");
			return (Criteria) this;
		}

		public Criteria andContact_personNotBetween(String value1, String value2) {
			addCriterion("contact_person not between", value1, value2,
					"contact_person");
			return (Criteria) this;
		}

		public Criteria andContact_addressIsNull() {
			addCriterion("contact_address is null");
			return (Criteria) this;
		}

		public Criteria andContact_addressIsNotNull() {
			addCriterion("contact_address is not null");
			return (Criteria) this;
		}

		public Criteria andContact_addressEqualTo(String value) {
			addCriterion("contact_address =", value, "contact_address");
			return (Criteria) this;
		}

		public Criteria andContact_addressNotEqualTo(String value) {
			addCriterion("contact_address <>", value, "contact_address");
			return (Criteria) this;
		}

		public Criteria andContact_addressGreaterThan(String value) {
			addCriterion("contact_address >", value, "contact_address");
			return (Criteria) this;
		}

		public Criteria andContact_addressGreaterThanOrEqualTo(String value) {
			addCriterion("contact_address >=", value, "contact_address");
			return (Criteria) this;
		}

		public Criteria andContact_addressLessThan(String value) {
			addCriterion("contact_address <", value, "contact_address");
			return (Criteria) this;
		}

		public Criteria andContact_addressLessThanOrEqualTo(String value) {
			addCriterion("contact_address <=", value, "contact_address");
			return (Criteria) this;
		}

		public Criteria andContact_addressLike(String value) {
			addCriterion("contact_address like", value, "contact_address");
			return (Criteria) this;
		}

		public Criteria andContact_addressNotLike(String value) {
			addCriterion("contact_address not like", value, "contact_address");
			return (Criteria) this;
		}

		public Criteria andContact_addressIn(List<String> values) {
			addCriterion("contact_address in", values, "contact_address");
			return (Criteria) this;
		}

		public Criteria andContact_addressNotIn(List<String> values) {
			addCriterion("contact_address not in", values, "contact_address");
			return (Criteria) this;
		}

		public Criteria andContact_addressBetween(String value1, String value2) {
			addCriterion("contact_address between", value1, value2,
					"contact_address");
			return (Criteria) this;
		}

		public Criteria andContact_addressNotBetween(String value1,
				String value2) {
			addCriterion("contact_address not between", value1, value2,
					"contact_address");
			return (Criteria) this;
		}

		public Criteria andContact_phoneIsNull() {
			addCriterion("contact_phone is null");
			return (Criteria) this;
		}

		public Criteria andContact_phoneIsNotNull() {
			addCriterion("contact_phone is not null");
			return (Criteria) this;
		}

		public Criteria andContact_phoneEqualTo(String value) {
			addCriterion("contact_phone =", value, "contact_phone");
			return (Criteria) this;
		}

		public Criteria andContact_phoneNotEqualTo(String value) {
			addCriterion("contact_phone <>", value, "contact_phone");
			return (Criteria) this;
		}

		public Criteria andContact_phoneGreaterThan(String value) {
			addCriterion("contact_phone >", value, "contact_phone");
			return (Criteria) this;
		}

		public Criteria andContact_phoneGreaterThanOrEqualTo(String value) {
			addCriterion("contact_phone >=", value, "contact_phone");
			return (Criteria) this;
		}

		public Criteria andContact_phoneLessThan(String value) {
			addCriterion("contact_phone <", value, "contact_phone");
			return (Criteria) this;
		}

		public Criteria andContact_phoneLessThanOrEqualTo(String value) {
			addCriterion("contact_phone <=", value, "contact_phone");
			return (Criteria) this;
		}

		public Criteria andContact_phoneLike(String value) {
			addCriterion("contact_phone like", value, "contact_phone");
			return (Criteria) this;
		}

		public Criteria andContact_phoneNotLike(String value) {
			addCriterion("contact_phone not like", value, "contact_phone");
			return (Criteria) this;
		}

		public Criteria andContact_phoneIn(List<String> values) {
			addCriterion("contact_phone in", values, "contact_phone");
			return (Criteria) this;
		}

		public Criteria andContact_phoneNotIn(List<String> values) {
			addCriterion("contact_phone not in", values, "contact_phone");
			return (Criteria) this;
		}

		public Criteria andContact_phoneBetween(String value1, String value2) {
			addCriterion("contact_phone between", value1, value2,
					"contact_phone");
			return (Criteria) this;
		}

		public Criteria andContact_phoneNotBetween(String value1, String value2) {
			addCriterion("contact_phone not between", value1, value2,
					"contact_phone");
			return (Criteria) this;
		}

		public Criteria andContact_mobileIsNull() {
			addCriterion("contact_mobile is null");
			return (Criteria) this;
		}

		public Criteria andContact_mobileIsNotNull() {
			addCriterion("contact_mobile is not null");
			return (Criteria) this;
		}

		public Criteria andContact_mobileEqualTo(String value) {
			addCriterion("contact_mobile =", value, "contact_mobile");
			return (Criteria) this;
		}

		public Criteria andContact_mobileNotEqualTo(String value) {
			addCriterion("contact_mobile <>", value, "contact_mobile");
			return (Criteria) this;
		}

		public Criteria andContact_mobileGreaterThan(String value) {
			addCriterion("contact_mobile >", value, "contact_mobile");
			return (Criteria) this;
		}

		public Criteria andContact_mobileGreaterThanOrEqualTo(String value) {
			addCriterion("contact_mobile >=", value, "contact_mobile");
			return (Criteria) this;
		}

		public Criteria andContact_mobileLessThan(String value) {
			addCriterion("contact_mobile <", value, "contact_mobile");
			return (Criteria) this;
		}

		public Criteria andContact_mobileLessThanOrEqualTo(String value) {
			addCriterion("contact_mobile <=", value, "contact_mobile");
			return (Criteria) this;
		}

		public Criteria andContact_mobileLike(String value) {
			addCriterion("contact_mobile like", value, "contact_mobile");
			return (Criteria) this;
		}

		public Criteria andContact_mobileNotLike(String value) {
			addCriterion("contact_mobile not like", value, "contact_mobile");
			return (Criteria) this;
		}

		public Criteria andContact_mobileIn(List<String> values) {
			addCriterion("contact_mobile in", values, "contact_mobile");
			return (Criteria) this;
		}

		public Criteria andContact_mobileNotIn(List<String> values) {
			addCriterion("contact_mobile not in", values, "contact_mobile");
			return (Criteria) this;
		}

		public Criteria andContact_mobileBetween(String value1, String value2) {
			addCriterion("contact_mobile between", value1, value2,
					"contact_mobile");
			return (Criteria) this;
		}

		public Criteria andContact_mobileNotBetween(String value1, String value2) {
			addCriterion("contact_mobile not between", value1, value2,
					"contact_mobile");
			return (Criteria) this;
		}

		public Criteria andAccount_nameIsNull() {
			addCriterion("account_name is null");
			return (Criteria) this;
		}

		public Criteria andAccount_nameIsNotNull() {
			addCriterion("account_name is not null");
			return (Criteria) this;
		}

		public Criteria andAccount_nameEqualTo(String value) {
			addCriterion("account_name =", value, "account_name");
			return (Criteria) this;
		}

		public Criteria andAccount_nameNotEqualTo(String value) {
			addCriterion("account_name <>", value, "account_name");
			return (Criteria) this;
		}

		public Criteria andAccount_nameGreaterThan(String value) {
			addCriterion("account_name >", value, "account_name");
			return (Criteria) this;
		}

		public Criteria andAccount_nameGreaterThanOrEqualTo(String value) {
			addCriterion("account_name >=", value, "account_name");
			return (Criteria) this;
		}

		public Criteria andAccount_nameLessThan(String value) {
			addCriterion("account_name <", value, "account_name");
			return (Criteria) this;
		}

		public Criteria andAccount_nameLessThanOrEqualTo(String value) {
			addCriterion("account_name <=", value, "account_name");
			return (Criteria) this;
		}

		public Criteria andAccount_nameLike(String value) {
			addCriterion("account_name like", value, "account_name");
			return (Criteria) this;
		}

		public Criteria andAccount_nameNotLike(String value) {
			addCriterion("account_name not like", value, "account_name");
			return (Criteria) this;
		}

		public Criteria andAccount_nameIn(List<String> values) {
			addCriterion("account_name in", values, "account_name");
			return (Criteria) this;
		}

		public Criteria andAccount_nameNotIn(List<String> values) {
			addCriterion("account_name not in", values, "account_name");
			return (Criteria) this;
		}

		public Criteria andAccount_nameBetween(String value1, String value2) {
			addCriterion("account_name between", value1, value2, "account_name");
			return (Criteria) this;
		}

		public Criteria andAccount_nameNotBetween(String value1, String value2) {
			addCriterion("account_name not between", value1, value2,
					"account_name");
			return (Criteria) this;
		}

		public Criteria andBank_nameIsNull() {
			addCriterion("bank_name is null");
			return (Criteria) this;
		}

		public Criteria andBank_nameIsNotNull() {
			addCriterion("bank_name is not null");
			return (Criteria) this;
		}

		public Criteria andBank_nameEqualTo(String value) {
			addCriterion("bank_name =", value, "bank_name");
			return (Criteria) this;
		}

		public Criteria andBank_nameNotEqualTo(String value) {
			addCriterion("bank_name <>", value, "bank_name");
			return (Criteria) this;
		}

		public Criteria andBank_nameGreaterThan(String value) {
			addCriterion("bank_name >", value, "bank_name");
			return (Criteria) this;
		}

		public Criteria andBank_nameGreaterThanOrEqualTo(String value) {
			addCriterion("bank_name >=", value, "bank_name");
			return (Criteria) this;
		}

		public Criteria andBank_nameLessThan(String value) {
			addCriterion("bank_name <", value, "bank_name");
			return (Criteria) this;
		}

		public Criteria andBank_nameLessThanOrEqualTo(String value) {
			addCriterion("bank_name <=", value, "bank_name");
			return (Criteria) this;
		}

		public Criteria andBank_nameLike(String value) {
			addCriterion("bank_name like", value, "bank_name");
			return (Criteria) this;
		}

		public Criteria andBank_nameNotLike(String value) {
			addCriterion("bank_name not like", value, "bank_name");
			return (Criteria) this;
		}

		public Criteria andBank_nameIn(List<String> values) {
			addCriterion("bank_name in", values, "bank_name");
			return (Criteria) this;
		}

		public Criteria andBank_nameNotIn(List<String> values) {
			addCriterion("bank_name not in", values, "bank_name");
			return (Criteria) this;
		}

		public Criteria andBank_nameBetween(String value1, String value2) {
			addCriterion("bank_name between", value1, value2, "bank_name");
			return (Criteria) this;
		}

		public Criteria andBank_nameNotBetween(String value1, String value2) {
			addCriterion("bank_name not between", value1, value2, "bank_name");
			return (Criteria) this;
		}

		public Criteria andBank_accountIsNull() {
			addCriterion("bank_account is null");
			return (Criteria) this;
		}

		public Criteria andBank_accountIsNotNull() {
			addCriterion("bank_account is not null");
			return (Criteria) this;
		}

		public Criteria andBank_accountEqualTo(String value) {
			addCriterion("bank_account =", value, "bank_account");
			return (Criteria) this;
		}

		public Criteria andBank_accountNotEqualTo(String value) {
			addCriterion("bank_account <>", value, "bank_account");
			return (Criteria) this;
		}

		public Criteria andBank_accountGreaterThan(String value) {
			addCriterion("bank_account >", value, "bank_account");
			return (Criteria) this;
		}

		public Criteria andBank_accountGreaterThanOrEqualTo(String value) {
			addCriterion("bank_account >=", value, "bank_account");
			return (Criteria) this;
		}

		public Criteria andBank_accountLessThan(String value) {
			addCriterion("bank_account <", value, "bank_account");
			return (Criteria) this;
		}

		public Criteria andBank_accountLessThanOrEqualTo(String value) {
			addCriterion("bank_account <=", value, "bank_account");
			return (Criteria) this;
		}

		public Criteria andBank_accountLike(String value) {
			addCriterion("bank_account like", value, "bank_account");
			return (Criteria) this;
		}

		public Criteria andBank_accountNotLike(String value) {
			addCriterion("bank_account not like", value, "bank_account");
			return (Criteria) this;
		}

		public Criteria andBank_accountIn(List<String> values) {
			addCriterion("bank_account in", values, "bank_account");
			return (Criteria) this;
		}

		public Criteria andBank_accountNotIn(List<String> values) {
			addCriterion("bank_account not in", values, "bank_account");
			return (Criteria) this;
		}

		public Criteria andBank_accountBetween(String value1, String value2) {
			addCriterion("bank_account between", value1, value2, "bank_account");
			return (Criteria) this;
		}

		public Criteria andBank_accountNotBetween(String value1, String value2) {
			addCriterion("bank_account not between", value1, value2,
					"bank_account");
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

		public Criteria andCollege_urlIsNull() {
			addCriterion("college_url is null");
			return (Criteria) this;
		}

		public Criteria andCollege_urlIsNotNull() {
			addCriterion("college_url is not null");
			return (Criteria) this;
		}

		public Criteria andCollege_urlEqualTo(String value) {
			addCriterion("college_url =", value, "college_url");
			return (Criteria) this;
		}

		public Criteria andCollege_urlNotEqualTo(String value) {
			addCriterion("college_url <>", value, "college_url");
			return (Criteria) this;
		}

		public Criteria andCollege_urlGreaterThan(String value) {
			addCriterion("college_url >", value, "college_url");
			return (Criteria) this;
		}

		public Criteria andCollege_urlGreaterThanOrEqualTo(String value) {
			addCriterion("college_url >=", value, "college_url");
			return (Criteria) this;
		}

		public Criteria andCollege_urlLessThan(String value) {
			addCriterion("college_url <", value, "college_url");
			return (Criteria) this;
		}

		public Criteria andCollege_urlLessThanOrEqualTo(String value) {
			addCriterion("college_url <=", value, "college_url");
			return (Criteria) this;
		}

		public Criteria andCollege_urlLike(String value) {
			addCriterion("college_url like", value, "college_url");
			return (Criteria) this;
		}

		public Criteria andCollege_urlNotLike(String value) {
			addCriterion("college_url not like", value, "college_url");
			return (Criteria) this;
		}

		public Criteria andCollege_urlIn(List<String> values) {
			addCriterion("college_url in", values, "college_url");
			return (Criteria) this;
		}

		public Criteria andCollege_urlNotIn(List<String> values) {
			addCriterion("college_url not in", values, "college_url");
			return (Criteria) this;
		}

		public Criteria andCollege_urlBetween(String value1, String value2) {
			addCriterion("college_url between", value1, value2, "college_url");
			return (Criteria) this;
		}

		public Criteria andCollege_urlNotBetween(String value1, String value2) {
			addCriterion("college_url not between", value1, value2,
					"college_url");
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
	 * This class was generated by MyBatis Generator. This class corresponds to the database table edu.recruit_agent
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
     * This class corresponds to the database table edu.recruit_agent
     *
     * @mbggenerated do_not_delete_during_merge Sun Jan 15 18:52:28 CST 2012
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}