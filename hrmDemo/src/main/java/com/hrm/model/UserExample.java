package com.hrm.model;

import java.util.ArrayList;
import java.util.List;

public class UserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserExample() {
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

        public Criteria andUIdIsNull() {
            addCriterion("U_ID is null");
            return (Criteria) this;
        }

        public Criteria andUIdIsNotNull() {
            addCriterion("U_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUIdEqualTo(Integer value) {
            addCriterion("U_ID =", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdNotEqualTo(Integer value) {
            addCriterion("U_ID <>", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdGreaterThan(Integer value) {
            addCriterion("U_ID >", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("U_ID >=", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdLessThan(Integer value) {
            addCriterion("U_ID <", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdLessThanOrEqualTo(Integer value) {
            addCriterion("U_ID <=", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdIn(List<Integer> values) {
            addCriterion("U_ID in", values, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdNotIn(List<Integer> values) {
            addCriterion("U_ID not in", values, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdBetween(Integer value1, Integer value2) {
            addCriterion("U_ID between", value1, value2, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdNotBetween(Integer value1, Integer value2) {
            addCriterion("U_ID not between", value1, value2, "uId");
            return (Criteria) this;
        }

        public Criteria andUNameIsNull() {
            addCriterion("U_NAME is null");
            return (Criteria) this;
        }

        public Criteria andUNameIsNotNull() {
            addCriterion("U_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andUNameEqualTo(String value) {
            addCriterion("U_NAME =", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameNotEqualTo(String value) {
            addCriterion("U_NAME <>", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameGreaterThan(String value) {
            addCriterion("U_NAME >", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameGreaterThanOrEqualTo(String value) {
            addCriterion("U_NAME >=", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameLessThan(String value) {
            addCriterion("U_NAME <", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameLessThanOrEqualTo(String value) {
            addCriterion("U_NAME <=", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameLike(String value) {
            addCriterion("U_NAME like", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameNotLike(String value) {
            addCriterion("U_NAME not like", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameIn(List<String> values) {
            addCriterion("U_NAME in", values, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameNotIn(List<String> values) {
            addCriterion("U_NAME not in", values, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameBetween(String value1, String value2) {
            addCriterion("U_NAME between", value1, value2, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameNotBetween(String value1, String value2) {
            addCriterion("U_NAME not between", value1, value2, "uName");
            return (Criteria) this;
        }

        public Criteria andUPassIsNull() {
            addCriterion("U_PASS is null");
            return (Criteria) this;
        }

        public Criteria andUPassIsNotNull() {
            addCriterion("U_PASS is not null");
            return (Criteria) this;
        }

        public Criteria andUPassEqualTo(String value) {
            addCriterion("U_PASS =", value, "uPass");
            return (Criteria) this;
        }

        public Criteria andUPassNotEqualTo(String value) {
            addCriterion("U_PASS <>", value, "uPass");
            return (Criteria) this;
        }

        public Criteria andUPassGreaterThan(String value) {
            addCriterion("U_PASS >", value, "uPass");
            return (Criteria) this;
        }

        public Criteria andUPassGreaterThanOrEqualTo(String value) {
            addCriterion("U_PASS >=", value, "uPass");
            return (Criteria) this;
        }

        public Criteria andUPassLessThan(String value) {
            addCriterion("U_PASS <", value, "uPass");
            return (Criteria) this;
        }

        public Criteria andUPassLessThanOrEqualTo(String value) {
            addCriterion("U_PASS <=", value, "uPass");
            return (Criteria) this;
        }

        public Criteria andUPassLike(String value) {
            addCriterion("U_PASS like", value, "uPass");
            return (Criteria) this;
        }

        public Criteria andUPassNotLike(String value) {
            addCriterion("U_PASS not like", value, "uPass");
            return (Criteria) this;
        }

        public Criteria andUPassIn(List<String> values) {
            addCriterion("U_PASS in", values, "uPass");
            return (Criteria) this;
        }

        public Criteria andUPassNotIn(List<String> values) {
            addCriterion("U_PASS not in", values, "uPass");
            return (Criteria) this;
        }

        public Criteria andUPassBetween(String value1, String value2) {
            addCriterion("U_PASS between", value1, value2, "uPass");
            return (Criteria) this;
        }

        public Criteria andUPassNotBetween(String value1, String value2) {
            addCriterion("U_PASS not between", value1, value2, "uPass");
            return (Criteria) this;
        }

        public Criteria andUTypeIsNull() {
            addCriterion("U_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andUTypeIsNotNull() {
            addCriterion("U_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andUTypeEqualTo(Short value) {
            addCriterion("U_TYPE =", value, "uType");
            return (Criteria) this;
        }

        public Criteria andUTypeNotEqualTo(Short value) {
            addCriterion("U_TYPE <>", value, "uType");
            return (Criteria) this;
        }

        public Criteria andUTypeGreaterThan(Short value) {
            addCriterion("U_TYPE >", value, "uType");
            return (Criteria) this;
        }

        public Criteria andUTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("U_TYPE >=", value, "uType");
            return (Criteria) this;
        }

        public Criteria andUTypeLessThan(Short value) {
            addCriterion("U_TYPE <", value, "uType");
            return (Criteria) this;
        }

        public Criteria andUTypeLessThanOrEqualTo(Short value) {
            addCriterion("U_TYPE <=", value, "uType");
            return (Criteria) this;
        }

        public Criteria andUTypeIn(List<Short> values) {
            addCriterion("U_TYPE in", values, "uType");
            return (Criteria) this;
        }

        public Criteria andUTypeNotIn(List<Short> values) {
            addCriterion("U_TYPE not in", values, "uType");
            return (Criteria) this;
        }

        public Criteria andUTypeBetween(Short value1, Short value2) {
            addCriterion("U_TYPE between", value1, value2, "uType");
            return (Criteria) this;
        }

        public Criteria andUTypeNotBetween(Short value1, Short value2) {
            addCriterion("U_TYPE not between", value1, value2, "uType");
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