package com.hrm.model;

import java.util.ArrayList;
import java.util.List;

public class QuitExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public QuitExample() {
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

        public Criteria andQIdIsNull() {
            addCriterion("Q_ID is null");
            return (Criteria) this;
        }

        public Criteria andQIdIsNotNull() {
            addCriterion("Q_ID is not null");
            return (Criteria) this;
        }

        public Criteria andQIdEqualTo(Integer value) {
            addCriterion("Q_ID =", value, "qId");
            return (Criteria) this;
        }

        public Criteria andQIdNotEqualTo(Integer value) {
            addCriterion("Q_ID <>", value, "qId");
            return (Criteria) this;
        }

        public Criteria andQIdGreaterThan(Integer value) {
            addCriterion("Q_ID >", value, "qId");
            return (Criteria) this;
        }

        public Criteria andQIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Q_ID >=", value, "qId");
            return (Criteria) this;
        }

        public Criteria andQIdLessThan(Integer value) {
            addCriterion("Q_ID <", value, "qId");
            return (Criteria) this;
        }

        public Criteria andQIdLessThanOrEqualTo(Integer value) {
            addCriterion("Q_ID <=", value, "qId");
            return (Criteria) this;
        }

        public Criteria andQIdIn(List<Integer> values) {
            addCriterion("Q_ID in", values, "qId");
            return (Criteria) this;
        }

        public Criteria andQIdNotIn(List<Integer> values) {
            addCriterion("Q_ID not in", values, "qId");
            return (Criteria) this;
        }

        public Criteria andQIdBetween(Integer value1, Integer value2) {
            addCriterion("Q_ID between", value1, value2, "qId");
            return (Criteria) this;
        }

        public Criteria andQIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Q_ID not between", value1, value2, "qId");
            return (Criteria) this;
        }

        public Criteria andQCauseIsNull() {
            addCriterion("Q_CAUSE is null");
            return (Criteria) this;
        }

        public Criteria andQCauseIsNotNull() {
            addCriterion("Q_CAUSE is not null");
            return (Criteria) this;
        }

        public Criteria andQCauseEqualTo(String value) {
            addCriterion("Q_CAUSE =", value, "qCause");
            return (Criteria) this;
        }

        public Criteria andQCauseNotEqualTo(String value) {
            addCriterion("Q_CAUSE <>", value, "qCause");
            return (Criteria) this;
        }

        public Criteria andQCauseGreaterThan(String value) {
            addCriterion("Q_CAUSE >", value, "qCause");
            return (Criteria) this;
        }

        public Criteria andQCauseGreaterThanOrEqualTo(String value) {
            addCriterion("Q_CAUSE >=", value, "qCause");
            return (Criteria) this;
        }

        public Criteria andQCauseLessThan(String value) {
            addCriterion("Q_CAUSE <", value, "qCause");
            return (Criteria) this;
        }

        public Criteria andQCauseLessThanOrEqualTo(String value) {
            addCriterion("Q_CAUSE <=", value, "qCause");
            return (Criteria) this;
        }

        public Criteria andQCauseLike(String value) {
            addCriterion("Q_CAUSE like", value, "qCause");
            return (Criteria) this;
        }

        public Criteria andQCauseNotLike(String value) {
            addCriterion("Q_CAUSE not like", value, "qCause");
            return (Criteria) this;
        }

        public Criteria andQCauseIn(List<String> values) {
            addCriterion("Q_CAUSE in", values, "qCause");
            return (Criteria) this;
        }

        public Criteria andQCauseNotIn(List<String> values) {
            addCriterion("Q_CAUSE not in", values, "qCause");
            return (Criteria) this;
        }

        public Criteria andQCauseBetween(String value1, String value2) {
            addCriterion("Q_CAUSE between", value1, value2, "qCause");
            return (Criteria) this;
        }

        public Criteria andQCauseNotBetween(String value1, String value2) {
            addCriterion("Q_CAUSE not between", value1, value2, "qCause");
            return (Criteria) this;
        }

        public Criteria andQTimeIsNull() {
            addCriterion("Q_TIME is null");
            return (Criteria) this;
        }

        public Criteria andQTimeIsNotNull() {
            addCriterion("Q_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andQTimeEqualTo(String value) {
            addCriterion("Q_TIME =", value, "qTime");
            return (Criteria) this;
        }

        public Criteria andQTimeNotEqualTo(String value) {
            addCriterion("Q_TIME <>", value, "qTime");
            return (Criteria) this;
        }

        public Criteria andQTimeGreaterThan(String value) {
            addCriterion("Q_TIME >", value, "qTime");
            return (Criteria) this;
        }

        public Criteria andQTimeGreaterThanOrEqualTo(String value) {
            addCriterion("Q_TIME >=", value, "qTime");
            return (Criteria) this;
        }

        public Criteria andQTimeLessThan(String value) {
            addCriterion("Q_TIME <", value, "qTime");
            return (Criteria) this;
        }

        public Criteria andQTimeLessThanOrEqualTo(String value) {
            addCriterion("Q_TIME <=", value, "qTime");
            return (Criteria) this;
        }

        public Criteria andQTimeLike(String value) {
            addCriterion("Q_TIME like", value, "qTime");
            return (Criteria) this;
        }

        public Criteria andQTimeNotLike(String value) {
            addCriterion("Q_TIME not like", value, "qTime");
            return (Criteria) this;
        }

        public Criteria andQTimeIn(List<String> values) {
            addCriterion("Q_TIME in", values, "qTime");
            return (Criteria) this;
        }

        public Criteria andQTimeNotIn(List<String> values) {
            addCriterion("Q_TIME not in", values, "qTime");
            return (Criteria) this;
        }

        public Criteria andQTimeBetween(String value1, String value2) {
            addCriterion("Q_TIME between", value1, value2, "qTime");
            return (Criteria) this;
        }

        public Criteria andQTimeNotBetween(String value1, String value2) {
            addCriterion("Q_TIME not between", value1, value2, "qTime");
            return (Criteria) this;
        }

        public Criteria andSIdIsNull() {
            addCriterion("S_ID is null");
            return (Criteria) this;
        }

        public Criteria andSIdIsNotNull() {
            addCriterion("S_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSIdEqualTo(Integer value) {
            addCriterion("S_ID =", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdNotEqualTo(Integer value) {
            addCriterion("S_ID <>", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdGreaterThan(Integer value) {
            addCriterion("S_ID >", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("S_ID >=", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdLessThan(Integer value) {
            addCriterion("S_ID <", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdLessThanOrEqualTo(Integer value) {
            addCriterion("S_ID <=", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdIn(List<Integer> values) {
            addCriterion("S_ID in", values, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdNotIn(List<Integer> values) {
            addCriterion("S_ID not in", values, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdBetween(Integer value1, Integer value2) {
            addCriterion("S_ID between", value1, value2, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdNotBetween(Integer value1, Integer value2) {
            addCriterion("S_ID not between", value1, value2, "sId");
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