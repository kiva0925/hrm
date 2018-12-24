package com.hrm.model;

import java.util.ArrayList;
import java.util.List;

public class DepartmentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DepartmentExample() {
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

        public Criteria andDIdIsNull() {
            addCriterion("D_ID is null");
            return (Criteria) this;
        }

        public Criteria andDIdIsNotNull() {
            addCriterion("D_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDIdEqualTo(Integer value) {
            addCriterion("D_ID =", value, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdNotEqualTo(Integer value) {
            addCriterion("D_ID <>", value, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdGreaterThan(Integer value) {
            addCriterion("D_ID >", value, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("D_ID >=", value, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdLessThan(Integer value) {
            addCriterion("D_ID <", value, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdLessThanOrEqualTo(Integer value) {
            addCriterion("D_ID <=", value, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdIn(List<Integer> values) {
            addCriterion("D_ID in", values, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdNotIn(List<Integer> values) {
            addCriterion("D_ID not in", values, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdBetween(Integer value1, Integer value2) {
            addCriterion("D_ID between", value1, value2, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdNotBetween(Integer value1, Integer value2) {
            addCriterion("D_ID not between", value1, value2, "dId");
            return (Criteria) this;
        }

        public Criteria andDNameIsNull() {
            addCriterion("D_NAME is null");
            return (Criteria) this;
        }

        public Criteria andDNameIsNotNull() {
            addCriterion("D_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andDNameEqualTo(String value) {
            addCriterion("D_NAME =", value, "dName");
            return (Criteria) this;
        }

        public Criteria andDNameNotEqualTo(String value) {
            addCriterion("D_NAME <>", value, "dName");
            return (Criteria) this;
        }

        public Criteria andDNameGreaterThan(String value) {
            addCriterion("D_NAME >", value, "dName");
            return (Criteria) this;
        }

        public Criteria andDNameGreaterThanOrEqualTo(String value) {
            addCriterion("D_NAME >=", value, "dName");
            return (Criteria) this;
        }

        public Criteria andDNameLessThan(String value) {
            addCriterion("D_NAME <", value, "dName");
            return (Criteria) this;
        }

        public Criteria andDNameLessThanOrEqualTo(String value) {
            addCriterion("D_NAME <=", value, "dName");
            return (Criteria) this;
        }

        public Criteria andDNameLike(String value) {
            addCriterion("D_NAME like", value, "dName");
            return (Criteria) this;
        }

        public Criteria andDNameNotLike(String value) {
            addCriterion("D_NAME not like", value, "dName");
            return (Criteria) this;
        }

        public Criteria andDNameIn(List<String> values) {
            addCriterion("D_NAME in", values, "dName");
            return (Criteria) this;
        }

        public Criteria andDNameNotIn(List<String> values) {
            addCriterion("D_NAME not in", values, "dName");
            return (Criteria) this;
        }

        public Criteria andDNameBetween(String value1, String value2) {
            addCriterion("D_NAME between", value1, value2, "dName");
            return (Criteria) this;
        }

        public Criteria andDNameNotBetween(String value1, String value2) {
            addCriterion("D_NAME not between", value1, value2, "dName");
            return (Criteria) this;
        }

        public Criteria andDCreationIsNull() {
            addCriterion("D_CREATION is null");
            return (Criteria) this;
        }

        public Criteria andDCreationIsNotNull() {
            addCriterion("D_CREATION is not null");
            return (Criteria) this;
        }

        public Criteria andDCreationEqualTo(String value) {
            addCriterion("D_CREATION =", value, "dCreation");
            return (Criteria) this;
        }

        public Criteria andDCreationNotEqualTo(String value) {
            addCriterion("D_CREATION <>", value, "dCreation");
            return (Criteria) this;
        }

        public Criteria andDCreationGreaterThan(String value) {
            addCriterion("D_CREATION >", value, "dCreation");
            return (Criteria) this;
        }

        public Criteria andDCreationGreaterThanOrEqualTo(String value) {
            addCriterion("D_CREATION >=", value, "dCreation");
            return (Criteria) this;
        }

        public Criteria andDCreationLessThan(String value) {
            addCriterion("D_CREATION <", value, "dCreation");
            return (Criteria) this;
        }

        public Criteria andDCreationLessThanOrEqualTo(String value) {
            addCriterion("D_CREATION <=", value, "dCreation");
            return (Criteria) this;
        }

        public Criteria andDCreationLike(String value) {
            addCriterion("D_CREATION like", value, "dCreation");
            return (Criteria) this;
        }

        public Criteria andDCreationNotLike(String value) {
            addCriterion("D_CREATION not like", value, "dCreation");
            return (Criteria) this;
        }

        public Criteria andDCreationIn(List<String> values) {
            addCriterion("D_CREATION in", values, "dCreation");
            return (Criteria) this;
        }

        public Criteria andDCreationNotIn(List<String> values) {
            addCriterion("D_CREATION not in", values, "dCreation");
            return (Criteria) this;
        }

        public Criteria andDCreationBetween(String value1, String value2) {
            addCriterion("D_CREATION between", value1, value2, "dCreation");
            return (Criteria) this;
        }

        public Criteria andDCreationNotBetween(String value1, String value2) {
            addCriterion("D_CREATION not between", value1, value2, "dCreation");
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