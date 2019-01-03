package com.hrm.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class StaffExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StaffExample() {
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

        public Criteria andSHiredateIsNull() {
            addCriterion("S_HIREDATE is null");
            return (Criteria) this;
        }

        public Criteria andSHiredateIsNotNull() {
            addCriterion("S_HIREDATE is not null");
            return (Criteria) this;
        }

        public Criteria andSHiredateEqualTo(String value) {
            addCriterion("S_HIREDATE =", value, "sHiredate");
            return (Criteria) this;
        }

        public Criteria andSHiredateNotEqualTo(String value) {
            addCriterion("S_HIREDATE <>", value, "sHiredate");
            return (Criteria) this;
        }

        public Criteria andSHiredateGreaterThan(String value) {
            addCriterion("S_HIREDATE >", value, "sHiredate");
            return (Criteria) this;
        }

        public Criteria andSHiredateGreaterThanOrEqualTo(String value) {
            addCriterion("S_HIREDATE >=", value, "sHiredate");
            return (Criteria) this;
        }

        public Criteria andSHiredateLessThan(String value) {
            addCriterion("S_HIREDATE <", value, "sHiredate");
            return (Criteria) this;
        }

        public Criteria andSHiredateLessThanOrEqualTo(String value) {
            addCriterion("S_HIREDATE <=", value, "sHiredate");
            return (Criteria) this;
        }

        public Criteria andSHiredateLike(String value) {
            addCriterion("S_HIREDATE like", value, "sHiredate");
            return (Criteria) this;
        }

        public Criteria andSHiredateNotLike(String value) {
            addCriterion("S_HIREDATE not like", value, "sHiredate");
            return (Criteria) this;
        }

        public Criteria andSHiredateIn(List<String> values) {
            addCriterion("S_HIREDATE in", values, "sHiredate");
            return (Criteria) this;
        }

        public Criteria andSHiredateNotIn(List<String> values) {
            addCriterion("S_HIREDATE not in", values, "sHiredate");
            return (Criteria) this;
        }

        public Criteria andSHiredateBetween(String value1, String value2) {
            addCriterion("S_HIREDATE between", value1, value2, "sHiredate");
            return (Criteria) this;
        }

        public Criteria andSHiredateNotBetween(String value1, String value2) {
            addCriterion("S_HIREDATE not between", value1, value2, "sHiredate");
            return (Criteria) this;
        }

        public Criteria andSCorpusIsNull() {
            addCriterion("S_CORPUS is null");
            return (Criteria) this;
        }

        public Criteria andSCorpusIsNotNull() {
            addCriterion("S_CORPUS is not null");
            return (Criteria) this;
        }

        public Criteria andSCorpusEqualTo(BigDecimal value) {
            addCriterion("S_CORPUS =", value, "sCorpus");
            return (Criteria) this;
        }

        public Criteria andSCorpusNotEqualTo(BigDecimal value) {
            addCriterion("S_CORPUS <>", value, "sCorpus");
            return (Criteria) this;
        }

        public Criteria andSCorpusGreaterThan(BigDecimal value) {
            addCriterion("S_CORPUS >", value, "sCorpus");
            return (Criteria) this;
        }

        public Criteria andSCorpusGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("S_CORPUS >=", value, "sCorpus");
            return (Criteria) this;
        }

        public Criteria andSCorpusLessThan(BigDecimal value) {
            addCriterion("S_CORPUS <", value, "sCorpus");
            return (Criteria) this;
        }

        public Criteria andSCorpusLessThanOrEqualTo(BigDecimal value) {
            addCriterion("S_CORPUS <=", value, "sCorpus");
            return (Criteria) this;
        }

        public Criteria andSCorpusIn(List<BigDecimal> values) {
            addCriterion("S_CORPUS in", values, "sCorpus");
            return (Criteria) this;
        }

        public Criteria andSCorpusNotIn(List<BigDecimal> values) {
            addCriterion("S_CORPUS not in", values, "sCorpus");
            return (Criteria) this;
        }

        public Criteria andSCorpusBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("S_CORPUS between", value1, value2, "sCorpus");
            return (Criteria) this;
        }

        public Criteria andSCorpusNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("S_CORPUS not between", value1, value2, "sCorpus");
            return (Criteria) this;
        }

        public Criteria andSAttendanceIsNull() {
            addCriterion("S_ATTENDANCE is null");
            return (Criteria) this;
        }

        public Criteria andSAttendanceIsNotNull() {
            addCriterion("S_ATTENDANCE is not null");
            return (Criteria) this;
        }

        public Criteria andSAttendanceEqualTo(String value) {
            addCriterion("S_ATTENDANCE =", value, "sAttendance");
            return (Criteria) this;
        }

        public Criteria andSAttendanceNotEqualTo(String value) {
            addCriterion("S_ATTENDANCE <>", value, "sAttendance");
            return (Criteria) this;
        }

        public Criteria andSAttendanceGreaterThan(String value) {
            addCriterion("S_ATTENDANCE >", value, "sAttendance");
            return (Criteria) this;
        }

        public Criteria andSAttendanceGreaterThanOrEqualTo(String value) {
            addCriterion("S_ATTENDANCE >=", value, "sAttendance");
            return (Criteria) this;
        }

        public Criteria andSAttendanceLessThan(String value) {
            addCriterion("S_ATTENDANCE <", value, "sAttendance");
            return (Criteria) this;
        }

        public Criteria andSAttendanceLessThanOrEqualTo(String value) {
            addCriterion("S_ATTENDANCE <=", value, "sAttendance");
            return (Criteria) this;
        }

        public Criteria andSAttendanceLike(String value) {
            addCriterion("S_ATTENDANCE like", value, "sAttendance");
            return (Criteria) this;
        }

        public Criteria andSAttendanceNotLike(String value) {
            addCriterion("S_ATTENDANCE not like", value, "sAttendance");
            return (Criteria) this;
        }

        public Criteria andSAttendanceIn(List<String> values) {
            addCriterion("S_ATTENDANCE in", values, "sAttendance");
            return (Criteria) this;
        }

        public Criteria andSAttendanceNotIn(List<String> values) {
            addCriterion("S_ATTENDANCE not in", values, "sAttendance");
            return (Criteria) this;
        }

        public Criteria andSAttendanceBetween(String value1, String value2) {
            addCriterion("S_ATTENDANCE between", value1, value2, "sAttendance");
            return (Criteria) this;
        }

        public Criteria andSAttendanceNotBetween(String value1, String value2) {
            addCriterion("S_ATTENDANCE not between", value1, value2, "sAttendance");
            return (Criteria) this;
        }

        public Criteria andTIdIsNull() {
            addCriterion("T_ID is null");
            return (Criteria) this;
        }

        public Criteria andTIdIsNotNull() {
            addCriterion("T_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTIdEqualTo(Integer value) {
            addCriterion("T_ID =", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdNotEqualTo(Integer value) {
            addCriterion("T_ID <>", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdGreaterThan(Integer value) {
            addCriterion("T_ID >", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("T_ID >=", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdLessThan(Integer value) {
            addCriterion("T_ID <", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdLessThanOrEqualTo(Integer value) {
            addCriterion("T_ID <=", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdIn(List<Integer> values) {
            addCriterion("T_ID in", values, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdNotIn(List<Integer> values) {
            addCriterion("T_ID not in", values, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdBetween(Integer value1, Integer value2) {
            addCriterion("T_ID between", value1, value2, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdNotBetween(Integer value1, Integer value2) {
            addCriterion("T_ID not between", value1, value2, "tId");
            return (Criteria) this;
        }

        public Criteria andBIdIsNull() {
            addCriterion("B_ID is null");
            return (Criteria) this;
        }

        public Criteria andBIdIsNotNull() {
            addCriterion("B_ID is not null");
            return (Criteria) this;
        }

        public Criteria andBIdEqualTo(Integer value) {
            addCriterion("B_ID =", value, "bId");
            return (Criteria) this;
        }

        public Criteria andBIdNotEqualTo(Integer value) {
            addCriterion("B_ID <>", value, "bId");
            return (Criteria) this;
        }

        public Criteria andBIdGreaterThan(Integer value) {
            addCriterion("B_ID >", value, "bId");
            return (Criteria) this;
        }

        public Criteria andBIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("B_ID >=", value, "bId");
            return (Criteria) this;
        }

        public Criteria andBIdLessThan(Integer value) {
            addCriterion("B_ID <", value, "bId");
            return (Criteria) this;
        }

        public Criteria andBIdLessThanOrEqualTo(Integer value) {
            addCriterion("B_ID <=", value, "bId");
            return (Criteria) this;
        }

        public Criteria andBIdIn(List<Integer> values) {
            addCriterion("B_ID in", values, "bId");
            return (Criteria) this;
        }

        public Criteria andBIdNotIn(List<Integer> values) {
            addCriterion("B_ID not in", values, "bId");
            return (Criteria) this;
        }

        public Criteria andBIdBetween(Integer value1, Integer value2) {
            addCriterion("B_ID between", value1, value2, "bId");
            return (Criteria) this;
        }

        public Criteria andBIdNotBetween(Integer value1, Integer value2) {
            addCriterion("B_ID not between", value1, value2, "bId");
            return (Criteria) this;
        }

        public Criteria andStIdIsNull() {
            addCriterion("ST_ID is null");
            return (Criteria) this;
        }

        public Criteria andStIdIsNotNull() {
            addCriterion("ST_ID is not null");
            return (Criteria) this;
        }

        public Criteria andStIdEqualTo(Integer value) {
            addCriterion("ST_ID =", value, "stId");
            return (Criteria) this;
        }

        public Criteria andStIdNotEqualTo(Integer value) {
            addCriterion("ST_ID <>", value, "stId");
            return (Criteria) this;
        }

        public Criteria andStIdGreaterThan(Integer value) {
            addCriterion("ST_ID >", value, "stId");
            return (Criteria) this;
        }

        public Criteria andStIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ST_ID >=", value, "stId");
            return (Criteria) this;
        }

        public Criteria andStIdLessThan(Integer value) {
            addCriterion("ST_ID <", value, "stId");
            return (Criteria) this;
        }

        public Criteria andStIdLessThanOrEqualTo(Integer value) {
            addCriterion("ST_ID <=", value, "stId");
            return (Criteria) this;
        }

        public Criteria andStIdIn(List<Integer> values) {
            addCriterion("ST_ID in", values, "stId");
            return (Criteria) this;
        }

        public Criteria andStIdNotIn(List<Integer> values) {
            addCriterion("ST_ID not in", values, "stId");
            return (Criteria) this;
        }

        public Criteria andStIdBetween(Integer value1, Integer value2) {
            addCriterion("ST_ID between", value1, value2, "stId");
            return (Criteria) this;
        }

        public Criteria andStIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ST_ID not between", value1, value2, "stId");
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