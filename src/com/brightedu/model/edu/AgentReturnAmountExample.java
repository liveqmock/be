package com.brightedu.model.edu;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class AgentReturnAmountExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table edu.ag_return_amount
     *
     * @mbggenerated Sun Jan 15 18:52:28 CST 2012
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table edu.ag_return_amount
     *
     * @mbggenerated Sun Jan 15 18:52:28 CST 2012
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table edu.ag_return_amount
     *
     * @mbggenerated Sun Jan 15 18:52:28 CST 2012
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table edu.ag_return_amount
     *
     * @mbggenerated Sun Jan 15 18:52:28 CST 2012
     */
    public AgentReturnAmountExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table edu.ag_return_amount
     *
     * @mbggenerated Sun Jan 15 18:52:28 CST 2012
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table edu.ag_return_amount
     *
     * @mbggenerated Sun Jan 15 18:52:28 CST 2012
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table edu.ag_return_amount
     *
     * @mbggenerated Sun Jan 15 18:52:28 CST 2012
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table edu.ag_return_amount
     *
     * @mbggenerated Sun Jan 15 18:52:28 CST 2012
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table edu.ag_return_amount
     *
     * @mbggenerated Sun Jan 15 18:52:28 CST 2012
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table edu.ag_return_amount
     *
     * @mbggenerated Sun Jan 15 18:52:28 CST 2012
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table edu.ag_return_amount
     *
     * @mbggenerated Sun Jan 15 18:52:28 CST 2012
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table edu.ag_return_amount
     *
     * @mbggenerated Sun Jan 15 18:52:28 CST 2012
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table edu.ag_return_amount
     *
     * @mbggenerated Sun Jan 15 18:52:28 CST 2012
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table edu.ag_return_amount
     *
     * @mbggenerated Sun Jan 15 18:52:28 CST 2012
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table edu.ag_return_amount
     *
     * @mbggenerated Sun Jan 15 18:52:28 CST 2012
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

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
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

        public Criteria andAg_return_idIsNull() {
            addCriterion("ag_return_id is null");
            return (Criteria) this;
        }

        public Criteria andAg_return_idIsNotNull() {
            addCriterion("ag_return_id is not null");
            return (Criteria) this;
        }

        public Criteria andAg_return_idEqualTo(Integer value) {
            addCriterion("ag_return_id =", value, "ag_return_id");
            return (Criteria) this;
        }

        public Criteria andAg_return_idNotEqualTo(Integer value) {
            addCriterion("ag_return_id <>", value, "ag_return_id");
            return (Criteria) this;
        }

        public Criteria andAg_return_idGreaterThan(Integer value) {
            addCriterion("ag_return_id >", value, "ag_return_id");
            return (Criteria) this;
        }

        public Criteria andAg_return_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("ag_return_id >=", value, "ag_return_id");
            return (Criteria) this;
        }

        public Criteria andAg_return_idLessThan(Integer value) {
            addCriterion("ag_return_id <", value, "ag_return_id");
            return (Criteria) this;
        }

        public Criteria andAg_return_idLessThanOrEqualTo(Integer value) {
            addCriterion("ag_return_id <=", value, "ag_return_id");
            return (Criteria) this;
        }

        public Criteria andAg_return_idIn(List<Integer> values) {
            addCriterion("ag_return_id in", values, "ag_return_id");
            return (Criteria) this;
        }

        public Criteria andAg_return_idNotIn(List<Integer> values) {
            addCriterion("ag_return_id not in", values, "ag_return_id");
            return (Criteria) this;
        }

        public Criteria andAg_return_idBetween(Integer value1, Integer value2) {
            addCriterion("ag_return_id between", value1, value2, "ag_return_id");
            return (Criteria) this;
        }

        public Criteria andAg_return_idNotBetween(Integer value1, Integer value2) {
            addCriterion("ag_return_id not between", value1, value2, "ag_return_id");
            return (Criteria) this;
        }

        public Criteria andSum_amountIsNull() {
            addCriterion("sum_amount is null");
            return (Criteria) this;
        }

        public Criteria andSum_amountIsNotNull() {
            addCriterion("sum_amount is not null");
            return (Criteria) this;
        }

        public Criteria andSum_amountEqualTo(BigDecimal value) {
            addCriterion("sum_amount =", value, "sum_amount");
            return (Criteria) this;
        }

        public Criteria andSum_amountNotEqualTo(BigDecimal value) {
            addCriterion("sum_amount <>", value, "sum_amount");
            return (Criteria) this;
        }

        public Criteria andSum_amountGreaterThan(BigDecimal value) {
            addCriterion("sum_amount >", value, "sum_amount");
            return (Criteria) this;
        }

        public Criteria andSum_amountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("sum_amount >=", value, "sum_amount");
            return (Criteria) this;
        }

        public Criteria andSum_amountLessThan(BigDecimal value) {
            addCriterion("sum_amount <", value, "sum_amount");
            return (Criteria) this;
        }

        public Criteria andSum_amountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("sum_amount <=", value, "sum_amount");
            return (Criteria) this;
        }

        public Criteria andSum_amountIn(List<BigDecimal> values) {
            addCriterion("sum_amount in", values, "sum_amount");
            return (Criteria) this;
        }

        public Criteria andSum_amountNotIn(List<BigDecimal> values) {
            addCriterion("sum_amount not in", values, "sum_amount");
            return (Criteria) this;
        }

        public Criteria andSum_amountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sum_amount between", value1, value2, "sum_amount");
            return (Criteria) this;
        }

        public Criteria andSum_amountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sum_amount not between", value1, value2, "sum_amount");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table edu.ag_return_amount
     *
     * @mbggenerated do_not_delete_during_merge Sun Jan 15 18:52:28 CST 2012
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table edu.ag_return_amount
     *
     * @mbggenerated Sun Jan 15 18:52:28 CST 2012
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

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
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
}