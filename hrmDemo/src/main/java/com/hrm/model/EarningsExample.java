package com.hrm.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class EarningsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EarningsExample() {
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

        public Criteria andEIdIsNull() {
            addCriterion("E_ID is null");
            return (Criteria) this;
        }

        public Criteria andEIdIsNotNull() {
            addCriterion("E_ID is not null");
            return (Criteria) this;
        }

        public Criteria andEIdEqualTo(Integer value) {
            addCriterion("E_ID =", value, "eId");
            return (Criteria) this;
        }

        public Criteria andEIdNotEqualTo(Integer value) {
            addCriterion("E_ID <>", value, "eId");
            return (Criteria) this;
        }

        public Criteria andEIdGreaterThan(Integer value) {
            addCriterion("E_ID >", value, "eId");
            return (Criteria) this;
        }

        public Criteria andEIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("E_ID >=", value, "eId");
            return (Criteria) this;
        }

        public Criteria andEIdLessThan(Integer value) {
            addCriterion("E_ID <", value, "eId");
            return (Criteria) this;
        }

        public Criteria andEIdLessThanOrEqualTo(Integer value) {
            addCriterion("E_ID <=", value, "eId");
            return (Criteria) this;
        }

        public Criteria andEIdIn(List<Integer> values) {
            addCriterion("E_ID in", values, "eId");
            return (Criteria) this;
        }

        public Criteria andEIdNotIn(List<Integer> values) {
            addCriterion("E_ID not in", values, "eId");
            return (Criteria) this;
        }

        public Criteria andEIdBetween(Integer value1, Integer value2) {
            addCriterion("E_ID between", value1, value2, "eId");
            return (Criteria) this;
        }

        public Criteria andEIdNotBetween(Integer value1, Integer value2) {
            addCriterion("E_ID not between", value1, value2, "eId");
            return (Criteria) this;
        }

        public Criteria andESalaryIsNull() {
            addCriterion("E_SALARY is null");
            return (Criteria) this;
        }

        public Criteria andESalaryIsNotNull() {
            addCriterion("E_SALARY is not null");
            return (Criteria) this;
        }

        public Criteria andESalaryEqualTo(BigDecimal value) {
            addCriterion("E_SALARY =", value, "eSalary");
            return (Criteria) this;
        }

        public Criteria andESalaryNotEqualTo(BigDecimal value) {
            addCriterion("E_SALARY <>", value, "eSalary");
            return (Criteria) this;
        }

        public Criteria andESalaryGreaterThan(BigDecimal value) {
            addCriterion("E_SALARY >", value, "eSalary");
            return (Criteria) this;
        }

        public Criteria andESalaryGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("E_SALARY >=", value, "eSalary");
            return (Criteria) this;
        }

        public Criteria andESalaryLessThan(BigDecimal value) {
            addCriterion("E_SALARY <", value, "eSalary");
            return (Criteria) this;
        }

        public Criteria andESalaryLessThanOrEqualTo(BigDecimal value) {
            addCriterion("E_SALARY <=", value, "eSalary");
            return (Criteria) this;
        }

        public Criteria andESalaryIn(List<BigDecimal> values) {
            addCriterion("E_SALARY in", values, "eSalary");
            return (Criteria) this;
        }

        public Criteria andESalaryNotIn(List<BigDecimal> values) {
            addCriterion("E_SALARY not in", values, "eSalary");
            return (Criteria) this;
        }

        public Criteria andESalaryBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("E_SALARY between", value1, value2, "eSalary");
            return (Criteria) this;
        }

        public Criteria andESalaryNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("E_SALARY not between", value1, value2, "eSalary");
            return (Criteria) this;
        }

        public Criteria andEPerfIsNull() {
            addCriterion("E_PERF is null");
            return (Criteria) this;
        }

        public Criteria andEPerfIsNotNull() {
            addCriterion("E_PERF is not null");
            return (Criteria) this;
        }

        public Criteria andEPerfEqualTo(BigDecimal value) {
            addCriterion("E_PERF =", value, "ePerf");
            return (Criteria) this;
        }

        public Criteria andEPerfNotEqualTo(BigDecimal value) {
            addCriterion("E_PERF <>", value, "ePerf");
            return (Criteria) this;
        }

        public Criteria andEPerfGreaterThan(BigDecimal value) {
            addCriterion("E_PERF >", value, "ePerf");
            return (Criteria) this;
        }

        public Criteria andEPerfGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("E_PERF >=", value, "ePerf");
            return (Criteria) this;
        }

        public Criteria andEPerfLessThan(BigDecimal value) {
            addCriterion("E_PERF <", value, "ePerf");
            return (Criteria) this;
        }

        public Criteria andEPerfLessThanOrEqualTo(BigDecimal value) {
            addCriterion("E_PERF <=", value, "ePerf");
            return (Criteria) this;
        }

        public Criteria andEPerfIn(List<BigDecimal> values) {
            addCriterion("E_PERF in", values, "ePerf");
            return (Criteria) this;
        }

        public Criteria andEPerfNotIn(List<BigDecimal> values) {
            addCriterion("E_PERF not in", values, "ePerf");
            return (Criteria) this;
        }

        public Criteria andEPerfBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("E_PERF between", value1, value2, "ePerf");
            return (Criteria) this;
        }

        public Criteria andEPerfNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("E_PERF not between", value1, value2, "ePerf");
            return (Criteria) this;
        }

        public Criteria andEOvertimeIsNull() {
            addCriterion("E_OVERTIME is null");
            return (Criteria) this;
        }

        public Criteria andEOvertimeIsNotNull() {
            addCriterion("E_OVERTIME is not null");
            return (Criteria) this;
        }

        public Criteria andEOvertimeEqualTo(BigDecimal value) {
            addCriterion("E_OVERTIME =", value, "eOvertime");
            return (Criteria) this;
        }

        public Criteria andEOvertimeNotEqualTo(BigDecimal value) {
            addCriterion("E_OVERTIME <>", value, "eOvertime");
            return (Criteria) this;
        }

        public Criteria andEOvertimeGreaterThan(BigDecimal value) {
            addCriterion("E_OVERTIME >", value, "eOvertime");
            return (Criteria) this;
        }

        public Criteria andEOvertimeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("E_OVERTIME >=", value, "eOvertime");
            return (Criteria) this;
        }

        public Criteria andEOvertimeLessThan(BigDecimal value) {
            addCriterion("E_OVERTIME <", value, "eOvertime");
            return (Criteria) this;
        }

        public Criteria andEOvertimeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("E_OVERTIME <=", value, "eOvertime");
            return (Criteria) this;
        }

        public Criteria andEOvertimeIn(List<BigDecimal> values) {
            addCriterion("E_OVERTIME in", values, "eOvertime");
            return (Criteria) this;
        }

        public Criteria andEOvertimeNotIn(List<BigDecimal> values) {
            addCriterion("E_OVERTIME not in", values, "eOvertime");
            return (Criteria) this;
        }

        public Criteria andEOvertimeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("E_OVERTIME between", value1, value2, "eOvertime");
            return (Criteria) this;
        }

        public Criteria andEOvertimeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("E_OVERTIME not between", value1, value2, "eOvertime");
            return (Criteria) this;
        }

        public Criteria andERewardsIsNull() {
            addCriterion("E_REWARDS is null");
            return (Criteria) this;
        }

        public Criteria andERewardsIsNotNull() {
            addCriterion("E_REWARDS is not null");
            return (Criteria) this;
        }

        public Criteria andERewardsEqualTo(BigDecimal value) {
            addCriterion("E_REWARDS =", value, "eRewards");
            return (Criteria) this;
        }

        public Criteria andERewardsNotEqualTo(BigDecimal value) {
            addCriterion("E_REWARDS <>", value, "eRewards");
            return (Criteria) this;
        }

        public Criteria andERewardsGreaterThan(BigDecimal value) {
            addCriterion("E_REWARDS >", value, "eRewards");
            return (Criteria) this;
        }

        public Criteria andERewardsGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("E_REWARDS >=", value, "eRewards");
            return (Criteria) this;
        }

        public Criteria andERewardsLessThan(BigDecimal value) {
            addCriterion("E_REWARDS <", value, "eRewards");
            return (Criteria) this;
        }

        public Criteria andERewardsLessThanOrEqualTo(BigDecimal value) {
            addCriterion("E_REWARDS <=", value, "eRewards");
            return (Criteria) this;
        }

        public Criteria andERewardsIn(List<BigDecimal> values) {
            addCriterion("E_REWARDS in", values, "eRewards");
            return (Criteria) this;
        }

        public Criteria andERewardsNotIn(List<BigDecimal> values) {
            addCriterion("E_REWARDS not in", values, "eRewards");
            return (Criteria) this;
        }

        public Criteria andERewardsBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("E_REWARDS between", value1, value2, "eRewards");
            return (Criteria) this;
        }

        public Criteria andERewardsNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("E_REWARDS not between", value1, value2, "eRewards");
            return (Criteria) this;
        }

        public Criteria andESecurityIsNull() {
            addCriterion("E_SECURITY is null");
            return (Criteria) this;
        }

        public Criteria andESecurityIsNotNull() {
            addCriterion("E_SECURITY is not null");
            return (Criteria) this;
        }

        public Criteria andESecurityEqualTo(BigDecimal value) {
            addCriterion("E_SECURITY =", value, "eSecurity");
            return (Criteria) this;
        }

        public Criteria andESecurityNotEqualTo(BigDecimal value) {
            addCriterion("E_SECURITY <>", value, "eSecurity");
            return (Criteria) this;
        }

        public Criteria andESecurityGreaterThan(BigDecimal value) {
            addCriterion("E_SECURITY >", value, "eSecurity");
            return (Criteria) this;
        }

        public Criteria andESecurityGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("E_SECURITY >=", value, "eSecurity");
            return (Criteria) this;
        }

        public Criteria andESecurityLessThan(BigDecimal value) {
            addCriterion("E_SECURITY <", value, "eSecurity");
            return (Criteria) this;
        }

        public Criteria andESecurityLessThanOrEqualTo(BigDecimal value) {
            addCriterion("E_SECURITY <=", value, "eSecurity");
            return (Criteria) this;
        }

        public Criteria andESecurityIn(List<BigDecimal> values) {
            addCriterion("E_SECURITY in", values, "eSecurity");
            return (Criteria) this;
        }

        public Criteria andESecurityNotIn(List<BigDecimal> values) {
            addCriterion("E_SECURITY not in", values, "eSecurity");
            return (Criteria) this;
        }

        public Criteria andESecurityBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("E_SECURITY between", value1, value2, "eSecurity");
            return (Criteria) this;
        }

        public Criteria andESecurityNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("E_SECURITY not between", value1, value2, "eSecurity");
            return (Criteria) this;
        }

        public Criteria andESumIsNull() {
            addCriterion("E_SUM is null");
            return (Criteria) this;
        }

        public Criteria andESumIsNotNull() {
            addCriterion("E_SUM is not null");
            return (Criteria) this;
        }

        public Criteria andESumEqualTo(BigDecimal value) {
            addCriterion("E_SUM =", value, "eSum");
            return (Criteria) this;
        }

        public Criteria andESumNotEqualTo(BigDecimal value) {
            addCriterion("E_SUM <>", value, "eSum");
            return (Criteria) this;
        }

        public Criteria andESumGreaterThan(BigDecimal value) {
            addCriterion("E_SUM >", value, "eSum");
            return (Criteria) this;
        }

        public Criteria andESumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("E_SUM >=", value, "eSum");
            return (Criteria) this;
        }

        public Criteria andESumLessThan(BigDecimal value) {
            addCriterion("E_SUM <", value, "eSum");
            return (Criteria) this;
        }

        public Criteria andESumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("E_SUM <=", value, "eSum");
            return (Criteria) this;
        }

        public Criteria andESumIn(List<BigDecimal> values) {
            addCriterion("E_SUM in", values, "eSum");
            return (Criteria) this;
        }

        public Criteria andESumNotIn(List<BigDecimal> values) {
            addCriterion("E_SUM not in", values, "eSum");
            return (Criteria) this;
        }

        public Criteria andESumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("E_SUM between", value1, value2, "eSum");
            return (Criteria) this;
        }

        public Criteria andESumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("E_SUM not between", value1, value2, "eSum");
            return (Criteria) this;
        }

        public Criteria andETimeIsNull() {
            addCriterion("E_TIME is null");
            return (Criteria) this;
        }

        public Criteria andETimeIsNotNull() {
            addCriterion("E_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andETimeEqualTo(String value) {
            addCriterion("E_TIME =", value, "eTime");
            return (Criteria) this;
        }

        public Criteria andETimeNotEqualTo(String value) {
            addCriterion("E_TIME <>", value, "eTime");
            return (Criteria) this;
        }

        public Criteria andETimeGreaterThan(String value) {
            addCriterion("E_TIME >", value, "eTime");
            return (Criteria) this;
        }

        public Criteria andETimeGreaterThanOrEqualTo(String value) {
            addCriterion("E_TIME >=", value, "eTime");
            return (Criteria) this;
        }

        public Criteria andETimeLessThan(String value) {
            addCriterion("E_TIME <", value, "eTime");
            return (Criteria) this;
        }

        public Criteria andETimeLessThanOrEqualTo(String value) {
            addCriterion("E_TIME <=", value, "eTime");
            return (Criteria) this;
        }

        public Criteria andETimeLike(String value) {
            addCriterion("E_TIME like", value, "eTime");
            return (Criteria) this;
        }

        public Criteria andETimeNotLike(String value) {
            addCriterion("E_TIME not like", value, "eTime");
            return (Criteria) this;
        }

        public Criteria andETimeIn(List<String> values) {
            addCriterion("E_TIME in", values, "eTime");
            return (Criteria) this;
        }

        public Criteria andETimeNotIn(List<String> values) {
            addCriterion("E_TIME not in", values, "eTime");
            return (Criteria) this;
        }

        public Criteria andETimeBetween(String value1, String value2) {
            addCriterion("E_TIME between", value1, value2, "eTime");
            return (Criteria) this;
        }

        public Criteria andETimeNotBetween(String value1, String value2) {
            addCriterion("E_TIME not between", value1, value2, "eTime");
            return (Criteria) this;
        }

        public Criteria andEWhetherIsNull() {
            addCriterion("E_WHETHER is null");
            return (Criteria) this;
        }

        public Criteria andEWhetherIsNotNull() {
            addCriterion("E_WHETHER is not null");
            return (Criteria) this;
        }

        public Criteria andEWhetherEqualTo(Short value) {
            addCriterion("E_WHETHER =", value, "eWhether");
            return (Criteria) this;
        }

        public Criteria andEWhetherNotEqualTo(Short value) {
            addCriterion("E_WHETHER <>", value, "eWhether");
            return (Criteria) this;
        }

        public Criteria andEWhetherGreaterThan(Short value) {
            addCriterion("E_WHETHER >", value, "eWhether");
            return (Criteria) this;
        }

        public Criteria andEWhetherGreaterThanOrEqualTo(Short value) {
            addCriterion("E_WHETHER >=", value, "eWhether");
            return (Criteria) this;
        }

        public Criteria andEWhetherLessThan(Short value) {
            addCriterion("E_WHETHER <", value, "eWhether");
            return (Criteria) this;
        }

        public Criteria andEWhetherLessThanOrEqualTo(Short value) {
            addCriterion("E_WHETHER <=", value, "eWhether");
            return (Criteria) this;
        }

        public Criteria andEWhetherIn(List<Short> values) {
            addCriterion("E_WHETHER in", values, "eWhether");
            return (Criteria) this;
        }

        public Criteria andEWhetherNotIn(List<Short> values) {
            addCriterion("E_WHETHER not in", values, "eWhether");
            return (Criteria) this;
        }

        public Criteria andEWhetherBetween(Short value1, Short value2) {
            addCriterion("E_WHETHER between", value1, value2, "eWhether");
            return (Criteria) this;
        }

        public Criteria andEWhetherNotBetween(Short value1, Short value2) {
            addCriterion("E_WHETHER not between", value1, value2, "eWhether");
            return (Criteria) this;
        }

        public Criteria andECauseIsNull() {
            addCriterion("E_CAUSE is null");
            return (Criteria) this;
        }

        public Criteria andECauseIsNotNull() {
            addCriterion("E_CAUSE is not null");
            return (Criteria) this;
        }

        public Criteria andECauseEqualTo(String value) {
            addCriterion("E_CAUSE =", value, "eCause");
            return (Criteria) this;
        }

        public Criteria andECauseNotEqualTo(String value) {
            addCriterion("E_CAUSE <>", value, "eCause");
            return (Criteria) this;
        }

        public Criteria andECauseGreaterThan(String value) {
            addCriterion("E_CAUSE >", value, "eCause");
            return (Criteria) this;
        }

        public Criteria andECauseGreaterThanOrEqualTo(String value) {
            addCriterion("E_CAUSE >=", value, "eCause");
            return (Criteria) this;
        }

        public Criteria andECauseLessThan(String value) {
            addCriterion("E_CAUSE <", value, "eCause");
            return (Criteria) this;
        }

        public Criteria andECauseLessThanOrEqualTo(String value) {
            addCriterion("E_CAUSE <=", value, "eCause");
            return (Criteria) this;
        }

        public Criteria andECauseLike(String value) {
            addCriterion("E_CAUSE like", value, "eCause");
            return (Criteria) this;
        }

        public Criteria andECauseNotLike(String value) {
            addCriterion("E_CAUSE not like", value, "eCause");
            return (Criteria) this;
        }

        public Criteria andECauseIn(List<String> values) {
            addCriterion("E_CAUSE in", values, "eCause");
            return (Criteria) this;
        }

        public Criteria andECauseNotIn(List<String> values) {
            addCriterion("E_CAUSE not in", values, "eCause");
            return (Criteria) this;
        }

        public Criteria andECauseBetween(String value1, String value2) {
            addCriterion("E_CAUSE between", value1, value2, "eCause");
            return (Criteria) this;
        }

        public Criteria andECauseNotBetween(String value1, String value2) {
            addCriterion("E_CAUSE not between", value1, value2, "eCause");
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