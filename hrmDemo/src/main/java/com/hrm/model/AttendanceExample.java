package com.hrm.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class AttendanceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AttendanceExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

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

        public Criteria andAIdIsNull() {
            addCriterion("A_ID is null");
            return (Criteria) this;
        }

        public Criteria andAIdIsNotNull() {
            addCriterion("A_ID is not null");
            return (Criteria) this;
        }

        public Criteria andAIdEqualTo(Integer value) {
            addCriterion("A_ID =", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdNotEqualTo(Integer value) {
            addCriterion("A_ID <>", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdGreaterThan(Integer value) {
            addCriterion("A_ID >", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("A_ID >=", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdLessThan(Integer value) {
            addCriterion("A_ID <", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdLessThanOrEqualTo(Integer value) {
            addCriterion("A_ID <=", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdIn(List<Integer> values) {
            addCriterion("A_ID in", values, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdNotIn(List<Integer> values) {
            addCriterion("A_ID not in", values, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdBetween(Integer value1, Integer value2) {
            addCriterion("A_ID between", value1, value2, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdNotBetween(Integer value1, Integer value2) {
            addCriterion("A_ID not between", value1, value2, "aId");
            return (Criteria) this;
        }

        public Criteria andATypeIsNull() {
            addCriterion("A_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andATypeIsNotNull() {
            addCriterion("A_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andATypeEqualTo(String value) {
            addCriterion("A_TYPE =", value, "aType");
            return (Criteria) this;
        }

        public Criteria andATypeNotEqualTo(String value) {
            addCriterion("A_TYPE <>", value, "aType");
            return (Criteria) this;
        }

        public Criteria andATypeGreaterThan(String value) {
            addCriterion("A_TYPE >", value, "aType");
            return (Criteria) this;
        }

        public Criteria andATypeGreaterThanOrEqualTo(String value) {
            addCriterion("A_TYPE >=", value, "aType");
            return (Criteria) this;
        }

        public Criteria andATypeLessThan(String value) {
            addCriterion("A_TYPE <", value, "aType");
            return (Criteria) this;
        }

        public Criteria andATypeLessThanOrEqualTo(String value) {
            addCriterion("A_TYPE <=", value, "aType");
            return (Criteria) this;
        }

        public Criteria andATypeLike(String value) {
            addCriterion("A_TYPE like", value, "aType");
            return (Criteria) this;
        }

        public Criteria andATypeNotLike(String value) {
            addCriterion("A_TYPE not like", value, "aType");
            return (Criteria) this;
        }

        public Criteria andATypeIn(List<String> values) {
            addCriterion("A_TYPE in", values, "aType");
            return (Criteria) this;
        }

        public Criteria andATypeNotIn(List<String> values) {
            addCriterion("A_TYPE not in", values, "aType");
            return (Criteria) this;
        }

        public Criteria andATypeBetween(String value1, String value2) {
            addCriterion("A_TYPE between", value1, value2, "aType");
            return (Criteria) this;
        }

        public Criteria andATypeNotBetween(String value1, String value2) {
            addCriterion("A_TYPE not between", value1, value2, "aType");
            return (Criteria) this;
        }

        public Criteria andASumIsNull() {
            addCriterion("A_SUM is null");
            return (Criteria) this;
        }

        public Criteria andASumIsNotNull() {
            addCriterion("A_SUM is not null");
            return (Criteria) this;
        }

        public Criteria andASumEqualTo(BigDecimal value) {
            addCriterion("A_SUM =", value, "aSum");
            return (Criteria) this;
        }

        public Criteria andASumNotEqualTo(BigDecimal value) {
            addCriterion("A_SUM <>", value, "aSum");
            return (Criteria) this;
        }

        public Criteria andASumGreaterThan(BigDecimal value) {
            addCriterion("A_SUM >", value, "aSum");
            return (Criteria) this;
        }

        public Criteria andASumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("A_SUM >=", value, "aSum");
            return (Criteria) this;
        }

        public Criteria andASumLessThan(BigDecimal value) {
            addCriterion("A_SUM <", value, "aSum");
            return (Criteria) this;
        }

        public Criteria andASumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("A_SUM <=", value, "aSum");
            return (Criteria) this;
        }

        public Criteria andASumIn(List<BigDecimal> values) {
            addCriterion("A_SUM in", values, "aSum");
            return (Criteria) this;
        }

        public Criteria andASumNotIn(List<BigDecimal> values) {
            addCriterion("A_SUM not in", values, "aSum");
            return (Criteria) this;
        }

        public Criteria andASumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("A_SUM between", value1, value2, "aSum");
            return (Criteria) this;
        }

        public Criteria andASumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("A_SUM not between", value1, value2, "aSum");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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