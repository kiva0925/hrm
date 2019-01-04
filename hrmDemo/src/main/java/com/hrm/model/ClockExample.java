package com.hrm.model;

import java.util.ArrayList;
import java.util.List;

public class ClockExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ClockExample() {
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

        public Criteria andCIdIsNull() {
            addCriterion("C_ID is null");
            return (Criteria) this;
        }

        public Criteria andCIdIsNotNull() {
            addCriterion("C_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCIdEqualTo(Integer value) {
            addCriterion("C_ID =", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdNotEqualTo(Integer value) {
            addCriterion("C_ID <>", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdGreaterThan(Integer value) {
            addCriterion("C_ID >", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("C_ID >=", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdLessThan(Integer value) {
            addCriterion("C_ID <", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdLessThanOrEqualTo(Integer value) {
            addCriterion("C_ID <=", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdIn(List<Integer> values) {
            addCriterion("C_ID in", values, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdNotIn(List<Integer> values) {
            addCriterion("C_ID not in", values, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdBetween(Integer value1, Integer value2) {
            addCriterion("C_ID between", value1, value2, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdNotBetween(Integer value1, Integer value2) {
            addCriterion("C_ID not between", value1, value2, "cId");
            return (Criteria) this;
        }

        public Criteria andCDataIsNull() {
            addCriterion("C_DATA is null");
            return (Criteria) this;
        }

        public Criteria andCDataIsNotNull() {
            addCriterion("C_DATA is not null");
            return (Criteria) this;
        }

        public Criteria andCDataEqualTo(String value) {
            addCriterion("C_DATA =", value, "cData");
            return (Criteria) this;
        }

        public Criteria andCDataNotEqualTo(String value) {
            addCriterion("C_DATA <>", value, "cData");
            return (Criteria) this;
        }

        public Criteria andCDataGreaterThan(String value) {
            addCriterion("C_DATA >", value, "cData");
            return (Criteria) this;
        }

        public Criteria andCDataGreaterThanOrEqualTo(String value) {
            addCriterion("C_DATA >=", value, "cData");
            return (Criteria) this;
        }

        public Criteria andCDataLessThan(String value) {
            addCriterion("C_DATA <", value, "cData");
            return (Criteria) this;
        }

        public Criteria andCDataLessThanOrEqualTo(String value) {
            addCriterion("C_DATA <=", value, "cData");
            return (Criteria) this;
        }

        public Criteria andCDataLike(String value) {
            addCriterion("C_DATA like", value, "cData");
            return (Criteria) this;
        }

        public Criteria andCDataNotLike(String value) {
            addCriterion("C_DATA not like", value, "cData");
            return (Criteria) this;
        }

        public Criteria andCDataIn(List<String> values) {
            addCriterion("C_DATA in", values, "cData");
            return (Criteria) this;
        }

        public Criteria andCDataNotIn(List<String> values) {
            addCriterion("C_DATA not in", values, "cData");
            return (Criteria) this;
        }

        public Criteria andCDataBetween(String value1, String value2) {
            addCriterion("C_DATA between", value1, value2, "cData");
            return (Criteria) this;
        }

        public Criteria andCDataNotBetween(String value1, String value2) {
            addCriterion("C_DATA not between", value1, value2, "cData");
            return (Criteria) this;
        }

        public Criteria andCOndutyIsNull() {
            addCriterion("C_ONDUTY is null");
            return (Criteria) this;
        }

        public Criteria andCOndutyIsNotNull() {
            addCriterion("C_ONDUTY is not null");
            return (Criteria) this;
        }

        public Criteria andCOndutyEqualTo(String value) {
            addCriterion("C_ONDUTY =", value, "cOnduty");
            return (Criteria) this;
        }

        public Criteria andCOndutyNotEqualTo(String value) {
            addCriterion("C_ONDUTY <>", value, "cOnduty");
            return (Criteria) this;
        }

        public Criteria andCOndutyGreaterThan(String value) {
            addCriterion("C_ONDUTY >", value, "cOnduty");
            return (Criteria) this;
        }

        public Criteria andCOndutyGreaterThanOrEqualTo(String value) {
            addCriterion("C_ONDUTY >=", value, "cOnduty");
            return (Criteria) this;
        }

        public Criteria andCOndutyLessThan(String value) {
            addCriterion("C_ONDUTY <", value, "cOnduty");
            return (Criteria) this;
        }

        public Criteria andCOndutyLessThanOrEqualTo(String value) {
            addCriterion("C_ONDUTY <=", value, "cOnduty");
            return (Criteria) this;
        }

        public Criteria andCOndutyLike(String value) {
            addCriterion("C_ONDUTY like", value, "cOnduty");
            return (Criteria) this;
        }

        public Criteria andCOndutyNotLike(String value) {
            addCriterion("C_ONDUTY not like", value, "cOnduty");
            return (Criteria) this;
        }

        public Criteria andCOndutyIn(List<String> values) {
            addCriterion("C_ONDUTY in", values, "cOnduty");
            return (Criteria) this;
        }

        public Criteria andCOndutyNotIn(List<String> values) {
            addCriterion("C_ONDUTY not in", values, "cOnduty");
            return (Criteria) this;
        }

        public Criteria andCOndutyBetween(String value1, String value2) {
            addCriterion("C_ONDUTY between", value1, value2, "cOnduty");
            return (Criteria) this;
        }

        public Criteria andCOndutyNotBetween(String value1, String value2) {
            addCriterion("C_ONDUTY not between", value1, value2, "cOnduty");
            return (Criteria) this;
        }

        public Criteria andCOffdutyIsNull() {
            addCriterion("C_OFFDUTY is null");
            return (Criteria) this;
        }

        public Criteria andCOffdutyIsNotNull() {
            addCriterion("C_OFFDUTY is not null");
            return (Criteria) this;
        }

        public Criteria andCOffdutyEqualTo(String value) {
            addCriterion("C_OFFDUTY =", value, "cOffduty");
            return (Criteria) this;
        }

        public Criteria andCOffdutyNotEqualTo(String value) {
            addCriterion("C_OFFDUTY <>", value, "cOffduty");
            return (Criteria) this;
        }

        public Criteria andCOffdutyGreaterThan(String value) {
            addCriterion("C_OFFDUTY >", value, "cOffduty");
            return (Criteria) this;
        }

        public Criteria andCOffdutyGreaterThanOrEqualTo(String value) {
            addCriterion("C_OFFDUTY >=", value, "cOffduty");
            return (Criteria) this;
        }

        public Criteria andCOffdutyLessThan(String value) {
            addCriterion("C_OFFDUTY <", value, "cOffduty");
            return (Criteria) this;
        }

        public Criteria andCOffdutyLessThanOrEqualTo(String value) {
            addCriterion("C_OFFDUTY <=", value, "cOffduty");
            return (Criteria) this;
        }

        public Criteria andCOffdutyLike(String value) {
            addCriterion("C_OFFDUTY like", value, "cOffduty");
            return (Criteria) this;
        }

        public Criteria andCOffdutyNotLike(String value) {
            addCriterion("C_OFFDUTY not like", value, "cOffduty");
            return (Criteria) this;
        }

        public Criteria andCOffdutyIn(List<String> values) {
            addCriterion("C_OFFDUTY in", values, "cOffduty");
            return (Criteria) this;
        }

        public Criteria andCOffdutyNotIn(List<String> values) {
            addCriterion("C_OFFDUTY not in", values, "cOffduty");
            return (Criteria) this;
        }

        public Criteria andCOffdutyBetween(String value1, String value2) {
            addCriterion("C_OFFDUTY between", value1, value2, "cOffduty");
            return (Criteria) this;
        }

        public Criteria andCOffdutyNotBetween(String value1, String value2) {
            addCriterion("C_OFFDUTY not between", value1, value2, "cOffduty");
            return (Criteria) this;
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