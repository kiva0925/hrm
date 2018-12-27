package com.hrm.model;

import java.util.ArrayList;
import java.util.List;

public class RecruitExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RecruitExample() {
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

        public Criteria andRIdIsNull() {
            addCriterion("R_ID is null");
            return (Criteria) this;
        }

        public Criteria andRIdIsNotNull() {
            addCriterion("R_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRIdEqualTo(Integer value) {
            addCriterion("R_ID =", value, "rId");
            return (Criteria) this;
        }

        public Criteria andRIdNotEqualTo(Integer value) {
            addCriterion("R_ID <>", value, "rId");
            return (Criteria) this;
        }

        public Criteria andRIdGreaterThan(Integer value) {
            addCriterion("R_ID >", value, "rId");
            return (Criteria) this;
        }

        public Criteria andRIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("R_ID >=", value, "rId");
            return (Criteria) this;
        }

        public Criteria andRIdLessThan(Integer value) {
            addCriterion("R_ID <", value, "rId");
            return (Criteria) this;
        }

        public Criteria andRIdLessThanOrEqualTo(Integer value) {
            addCriterion("R_ID <=", value, "rId");
            return (Criteria) this;
        }

        public Criteria andRIdIn(List<Integer> values) {
            addCriterion("R_ID in", values, "rId");
            return (Criteria) this;
        }

        public Criteria andRIdNotIn(List<Integer> values) {
            addCriterion("R_ID not in", values, "rId");
            return (Criteria) this;
        }

        public Criteria andRIdBetween(Integer value1, Integer value2) {
            addCriterion("R_ID between", value1, value2, "rId");
            return (Criteria) this;
        }

        public Criteria andRIdNotBetween(Integer value1, Integer value2) {
            addCriterion("R_ID not between", value1, value2, "rId");
            return (Criteria) this;
        }

        public Criteria andRThemeIsNull() {
            addCriterion("R_THEME is null");
            return (Criteria) this;
        }

        public Criteria andRThemeIsNotNull() {
            addCriterion("R_THEME is not null");
            return (Criteria) this;
        }

        public Criteria andRThemeEqualTo(String value) {
            addCriterion("R_THEME =", value, "rTheme");
            return (Criteria) this;
        }

        public Criteria andRThemeNotEqualTo(String value) {
            addCriterion("R_THEME <>", value, "rTheme");
            return (Criteria) this;
        }

        public Criteria andRThemeGreaterThan(String value) {
            addCriterion("R_THEME >", value, "rTheme");
            return (Criteria) this;
        }

        public Criteria andRThemeGreaterThanOrEqualTo(String value) {
            addCriterion("R_THEME >=", value, "rTheme");
            return (Criteria) this;
        }

        public Criteria andRThemeLessThan(String value) {
            addCriterion("R_THEME <", value, "rTheme");
            return (Criteria) this;
        }

        public Criteria andRThemeLessThanOrEqualTo(String value) {
            addCriterion("R_THEME <=", value, "rTheme");
            return (Criteria) this;
        }

        public Criteria andRThemeLike(String value) {
            addCriterion("R_THEME like", value, "rTheme");
            return (Criteria) this;
        }

        public Criteria andRThemeNotLike(String value) {
            addCriterion("R_THEME not like", value, "rTheme");
            return (Criteria) this;
        }

        public Criteria andRThemeIn(List<String> values) {
            addCriterion("R_THEME in", values, "rTheme");
            return (Criteria) this;
        }

        public Criteria andRThemeNotIn(List<String> values) {
            addCriterion("R_THEME not in", values, "rTheme");
            return (Criteria) this;
        }

        public Criteria andRThemeBetween(String value1, String value2) {
            addCriterion("R_THEME between", value1, value2, "rTheme");
            return (Criteria) this;
        }

        public Criteria andRThemeNotBetween(String value1, String value2) {
            addCriterion("R_THEME not between", value1, value2, "rTheme");
            return (Criteria) this;
        }

        public Criteria andRContentIsNull() {
            addCriterion("R_CONTENT is null");
            return (Criteria) this;
        }

        public Criteria andRContentIsNotNull() {
            addCriterion("R_CONTENT is not null");
            return (Criteria) this;
        }

        public Criteria andRContentEqualTo(String value) {
            addCriterion("R_CONTENT =", value, "rContent");
            return (Criteria) this;
        }

        public Criteria andRContentNotEqualTo(String value) {
            addCriterion("R_CONTENT <>", value, "rContent");
            return (Criteria) this;
        }

        public Criteria andRContentGreaterThan(String value) {
            addCriterion("R_CONTENT >", value, "rContent");
            return (Criteria) this;
        }

        public Criteria andRContentGreaterThanOrEqualTo(String value) {
            addCriterion("R_CONTENT >=", value, "rContent");
            return (Criteria) this;
        }

        public Criteria andRContentLessThan(String value) {
            addCriterion("R_CONTENT <", value, "rContent");
            return (Criteria) this;
        }

        public Criteria andRContentLessThanOrEqualTo(String value) {
            addCriterion("R_CONTENT <=", value, "rContent");
            return (Criteria) this;
        }

        public Criteria andRContentLike(String value) {
            addCriterion("R_CONTENT like", value, "rContent");
            return (Criteria) this;
        }

        public Criteria andRContentNotLike(String value) {
            addCriterion("R_CONTENT not like", value, "rContent");
            return (Criteria) this;
        }

        public Criteria andRContentIn(List<String> values) {
            addCriterion("R_CONTENT in", values, "rContent");
            return (Criteria) this;
        }

        public Criteria andRContentNotIn(List<String> values) {
            addCriterion("R_CONTENT not in", values, "rContent");
            return (Criteria) this;
        }

        public Criteria andRContentBetween(String value1, String value2) {
            addCriterion("R_CONTENT between", value1, value2, "rContent");
            return (Criteria) this;
        }

        public Criteria andRContentNotBetween(String value1, String value2) {
            addCriterion("R_CONTENT not between", value1, value2, "rContent");
            return (Criteria) this;
        }

        public Criteria andRRequireIsNull() {
            addCriterion("R_REQUIRE is null");
            return (Criteria) this;
        }

        public Criteria andRRequireIsNotNull() {
            addCriterion("R_REQUIRE is not null");
            return (Criteria) this;
        }

        public Criteria andRRequireEqualTo(String value) {
            addCriterion("R_REQUIRE =", value, "rRequire");
            return (Criteria) this;
        }

        public Criteria andRRequireNotEqualTo(String value) {
            addCriterion("R_REQUIRE <>", value, "rRequire");
            return (Criteria) this;
        }

        public Criteria andRRequireGreaterThan(String value) {
            addCriterion("R_REQUIRE >", value, "rRequire");
            return (Criteria) this;
        }

        public Criteria andRRequireGreaterThanOrEqualTo(String value) {
            addCriterion("R_REQUIRE >=", value, "rRequire");
            return (Criteria) this;
        }

        public Criteria andRRequireLessThan(String value) {
            addCriterion("R_REQUIRE <", value, "rRequire");
            return (Criteria) this;
        }

        public Criteria andRRequireLessThanOrEqualTo(String value) {
            addCriterion("R_REQUIRE <=", value, "rRequire");
            return (Criteria) this;
        }

        public Criteria andRRequireLike(String value) {
            addCriterion("R_REQUIRE like", value, "rRequire");
            return (Criteria) this;
        }

        public Criteria andRRequireNotLike(String value) {
            addCriterion("R_REQUIRE not like", value, "rRequire");
            return (Criteria) this;
        }

        public Criteria andRRequireIn(List<String> values) {
            addCriterion("R_REQUIRE in", values, "rRequire");
            return (Criteria) this;
        }

        public Criteria andRRequireNotIn(List<String> values) {
            addCriterion("R_REQUIRE not in", values, "rRequire");
            return (Criteria) this;
        }

        public Criteria andRRequireBetween(String value1, String value2) {
            addCriterion("R_REQUIRE between", value1, value2, "rRequire");
            return (Criteria) this;
        }

        public Criteria andRRequireNotBetween(String value1, String value2) {
            addCriterion("R_REQUIRE not between", value1, value2, "rRequire");
            return (Criteria) this;
        }

        public Criteria andRCountIsNull() {
            addCriterion("R_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andRCountIsNotNull() {
            addCriterion("R_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andRCountEqualTo(Integer value) {
            addCriterion("R_COUNT =", value, "rCount");
            return (Criteria) this;
        }

        public Criteria andRCountNotEqualTo(Integer value) {
            addCriterion("R_COUNT <>", value, "rCount");
            return (Criteria) this;
        }

        public Criteria andRCountGreaterThan(Integer value) {
            addCriterion("R_COUNT >", value, "rCount");
            return (Criteria) this;
        }

        public Criteria andRCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("R_COUNT >=", value, "rCount");
            return (Criteria) this;
        }

        public Criteria andRCountLessThan(Integer value) {
            addCriterion("R_COUNT <", value, "rCount");
            return (Criteria) this;
        }

        public Criteria andRCountLessThanOrEqualTo(Integer value) {
            addCriterion("R_COUNT <=", value, "rCount");
            return (Criteria) this;
        }

        public Criteria andRCountIn(List<Integer> values) {
            addCriterion("R_COUNT in", values, "rCount");
            return (Criteria) this;
        }

        public Criteria andRCountNotIn(List<Integer> values) {
            addCriterion("R_COUNT not in", values, "rCount");
            return (Criteria) this;
        }

        public Criteria andRCountBetween(Integer value1, Integer value2) {
            addCriterion("R_COUNT between", value1, value2, "rCount");
            return (Criteria) this;
        }

        public Criteria andRCountNotBetween(Integer value1, Integer value2) {
            addCriterion("R_COUNT not between", value1, value2, "rCount");
            return (Criteria) this;
        }

        public Criteria andRTimeIsNull() {
            addCriterion("R_TIME is null");
            return (Criteria) this;
        }

        public Criteria andRTimeIsNotNull() {
            addCriterion("R_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andRTimeEqualTo(String value) {
            addCriterion("R_TIME =", value, "rTime");
            return (Criteria) this;
        }

        public Criteria andRTimeNotEqualTo(String value) {
            addCriterion("R_TIME <>", value, "rTime");
            return (Criteria) this;
        }

        public Criteria andRTimeGreaterThan(String value) {
            addCriterion("R_TIME >", value, "rTime");
            return (Criteria) this;
        }

        public Criteria andRTimeGreaterThanOrEqualTo(String value) {
            addCriterion("R_TIME >=", value, "rTime");
            return (Criteria) this;
        }

        public Criteria andRTimeLessThan(String value) {
            addCriterion("R_TIME <", value, "rTime");
            return (Criteria) this;
        }

        public Criteria andRTimeLessThanOrEqualTo(String value) {
            addCriterion("R_TIME <=", value, "rTime");
            return (Criteria) this;
        }

        public Criteria andRTimeLike(String value) {
            addCriterion("R_TIME like", value, "rTime");
            return (Criteria) this;
        }

        public Criteria andRTimeNotLike(String value) {
            addCriterion("R_TIME not like", value, "rTime");
            return (Criteria) this;
        }

        public Criteria andRTimeIn(List<String> values) {
            addCriterion("R_TIME in", values, "rTime");
            return (Criteria) this;
        }

        public Criteria andRTimeNotIn(List<String> values) {
            addCriterion("R_TIME not in", values, "rTime");
            return (Criteria) this;
        }

        public Criteria andRTimeBetween(String value1, String value2) {
            addCriterion("R_TIME between", value1, value2, "rTime");
            return (Criteria) this;
        }

        public Criteria andRTimeNotBetween(String value1, String value2) {
            addCriterion("R_TIME not between", value1, value2, "rTime");
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