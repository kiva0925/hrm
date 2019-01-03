package com.hrm.model;

import java.util.ArrayList;
import java.util.List;

public class GroomExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GroomExample() {
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

        public Criteria andGIdIsNull() {
            addCriterion("G_ID is null");
            return (Criteria) this;
        }

        public Criteria andGIdIsNotNull() {
            addCriterion("G_ID is not null");
            return (Criteria) this;
        }

        public Criteria andGIdEqualTo(Integer value) {
            addCriterion("G_ID =", value, "gId");
            return (Criteria) this;
        }

        public Criteria andGIdNotEqualTo(Integer value) {
            addCriterion("G_ID <>", value, "gId");
            return (Criteria) this;
        }

        public Criteria andGIdGreaterThan(Integer value) {
            addCriterion("G_ID >", value, "gId");
            return (Criteria) this;
        }

        public Criteria andGIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("G_ID >=", value, "gId");
            return (Criteria) this;
        }

        public Criteria andGIdLessThan(Integer value) {
            addCriterion("G_ID <", value, "gId");
            return (Criteria) this;
        }

        public Criteria andGIdLessThanOrEqualTo(Integer value) {
            addCriterion("G_ID <=", value, "gId");
            return (Criteria) this;
        }

        public Criteria andGIdIn(List<Integer> values) {
            addCriterion("G_ID in", values, "gId");
            return (Criteria) this;
        }

        public Criteria andGIdNotIn(List<Integer> values) {
            addCriterion("G_ID not in", values, "gId");
            return (Criteria) this;
        }

        public Criteria andGIdBetween(Integer value1, Integer value2) {
            addCriterion("G_ID between", value1, value2, "gId");
            return (Criteria) this;
        }

        public Criteria andGIdNotBetween(Integer value1, Integer value2) {
            addCriterion("G_ID not between", value1, value2, "gId");
            return (Criteria) this;
        }

        public Criteria andGContentIsNull() {
            addCriterion("G_CONTENT is null");
            return (Criteria) this;
        }

        public Criteria andGContentIsNotNull() {
            addCriterion("G_CONTENT is not null");
            return (Criteria) this;
        }

        public Criteria andGContentEqualTo(String value) {
            addCriterion("G_CONTENT =", value, "gContent");
            return (Criteria) this;
        }

        public Criteria andGContentNotEqualTo(String value) {
            addCriterion("G_CONTENT <>", value, "gContent");
            return (Criteria) this;
        }

        public Criteria andGContentGreaterThan(String value) {
            addCriterion("G_CONTENT >", value, "gContent");
            return (Criteria) this;
        }

        public Criteria andGContentGreaterThanOrEqualTo(String value) {
            addCriterion("G_CONTENT >=", value, "gContent");
            return (Criteria) this;
        }

        public Criteria andGContentLessThan(String value) {
            addCriterion("G_CONTENT <", value, "gContent");
            return (Criteria) this;
        }

        public Criteria andGContentLessThanOrEqualTo(String value) {
            addCriterion("G_CONTENT <=", value, "gContent");
            return (Criteria) this;
        }

        public Criteria andGContentLike(String value) {
            addCriterion("G_CONTENT like", value, "gContent");
            return (Criteria) this;
        }

        public Criteria andGContentNotLike(String value) {
            addCriterion("G_CONTENT not like", value, "gContent");
            return (Criteria) this;
        }

        public Criteria andGContentIn(List<String> values) {
            addCriterion("G_CONTENT in", values, "gContent");
            return (Criteria) this;
        }

        public Criteria andGContentNotIn(List<String> values) {
            addCriterion("G_CONTENT not in", values, "gContent");
            return (Criteria) this;
        }

        public Criteria andGContentBetween(String value1, String value2) {
            addCriterion("G_CONTENT between", value1, value2, "gContent");
            return (Criteria) this;
        }

        public Criteria andGContentNotBetween(String value1, String value2) {
            addCriterion("G_CONTENT not between", value1, value2, "gContent");
            return (Criteria) this;
        }

        public Criteria andGRequireIsNull() {
            addCriterion("G_REQUIRE is null");
            return (Criteria) this;
        }

        public Criteria andGRequireIsNotNull() {
            addCriterion("G_REQUIRE is not null");
            return (Criteria) this;
        }

        public Criteria andGRequireEqualTo(String value) {
            addCriterion("G_REQUIRE =", value, "gRequire");
            return (Criteria) this;
        }

        public Criteria andGRequireNotEqualTo(String value) {
            addCriterion("G_REQUIRE <>", value, "gRequire");
            return (Criteria) this;
        }

        public Criteria andGRequireGreaterThan(String value) {
            addCriterion("G_REQUIRE >", value, "gRequire");
            return (Criteria) this;
        }

        public Criteria andGRequireGreaterThanOrEqualTo(String value) {
            addCriterion("G_REQUIRE >=", value, "gRequire");
            return (Criteria) this;
        }

        public Criteria andGRequireLessThan(String value) {
            addCriterion("G_REQUIRE <", value, "gRequire");
            return (Criteria) this;
        }

        public Criteria andGRequireLessThanOrEqualTo(String value) {
            addCriterion("G_REQUIRE <=", value, "gRequire");
            return (Criteria) this;
        }

        public Criteria andGRequireLike(String value) {
            addCriterion("G_REQUIRE like", value, "gRequire");
            return (Criteria) this;
        }

        public Criteria andGRequireNotLike(String value) {
            addCriterion("G_REQUIRE not like", value, "gRequire");
            return (Criteria) this;
        }

        public Criteria andGRequireIn(List<String> values) {
            addCriterion("G_REQUIRE in", values, "gRequire");
            return (Criteria) this;
        }

        public Criteria andGRequireNotIn(List<String> values) {
            addCriterion("G_REQUIRE not in", values, "gRequire");
            return (Criteria) this;
        }

        public Criteria andGRequireBetween(String value1, String value2) {
            addCriterion("G_REQUIRE between", value1, value2, "gRequire");
            return (Criteria) this;
        }

        public Criteria andGRequireNotBetween(String value1, String value2) {
            addCriterion("G_REQUIRE not between", value1, value2, "gRequire");
            return (Criteria) this;
        }

        public Criteria andGBegintimeIsNull() {
            addCriterion("G_BEGINTIME is null");
            return (Criteria) this;
        }

        public Criteria andGBegintimeIsNotNull() {
            addCriterion("G_BEGINTIME is not null");
            return (Criteria) this;
        }

        public Criteria andGBegintimeEqualTo(String value) {
            addCriterion("G_BEGINTIME =", value, "gBegintime");
            return (Criteria) this;
        }

        public Criteria andGBegintimeNotEqualTo(String value) {
            addCriterion("G_BEGINTIME <>", value, "gBegintime");
            return (Criteria) this;
        }

        public Criteria andGBegintimeGreaterThan(String value) {
            addCriterion("G_BEGINTIME >", value, "gBegintime");
            return (Criteria) this;
        }

        public Criteria andGBegintimeGreaterThanOrEqualTo(String value) {
            addCriterion("G_BEGINTIME >=", value, "gBegintime");
            return (Criteria) this;
        }

        public Criteria andGBegintimeLessThan(String value) {
            addCriterion("G_BEGINTIME <", value, "gBegintime");
            return (Criteria) this;
        }

        public Criteria andGBegintimeLessThanOrEqualTo(String value) {
            addCriterion("G_BEGINTIME <=", value, "gBegintime");
            return (Criteria) this;
        }

        public Criteria andGBegintimeLike(String value) {
            addCriterion("G_BEGINTIME like", value, "gBegintime");
            return (Criteria) this;
        }

        public Criteria andGBegintimeNotLike(String value) {
            addCriterion("G_BEGINTIME not like", value, "gBegintime");
            return (Criteria) this;
        }

        public Criteria andGBegintimeIn(List<String> values) {
            addCriterion("G_BEGINTIME in", values, "gBegintime");
            return (Criteria) this;
        }

        public Criteria andGBegintimeNotIn(List<String> values) {
            addCriterion("G_BEGINTIME not in", values, "gBegintime");
            return (Criteria) this;
        }

        public Criteria andGBegintimeBetween(String value1, String value2) {
            addCriterion("G_BEGINTIME between", value1, value2, "gBegintime");
            return (Criteria) this;
        }

        public Criteria andGBegintimeNotBetween(String value1, String value2) {
            addCriterion("G_BEGINTIME not between", value1, value2, "gBegintime");
            return (Criteria) this;
        }

        public Criteria andGEndtimeIsNull() {
            addCriterion("G_ENDTIME is null");
            return (Criteria) this;
        }

        public Criteria andGEndtimeIsNotNull() {
            addCriterion("G_ENDTIME is not null");
            return (Criteria) this;
        }

        public Criteria andGEndtimeEqualTo(String value) {
            addCriterion("G_ENDTIME =", value, "gEndtime");
            return (Criteria) this;
        }

        public Criteria andGEndtimeNotEqualTo(String value) {
            addCriterion("G_ENDTIME <>", value, "gEndtime");
            return (Criteria) this;
        }

        public Criteria andGEndtimeGreaterThan(String value) {
            addCriterion("G_ENDTIME >", value, "gEndtime");
            return (Criteria) this;
        }

        public Criteria andGEndtimeGreaterThanOrEqualTo(String value) {
            addCriterion("G_ENDTIME >=", value, "gEndtime");
            return (Criteria) this;
        }

        public Criteria andGEndtimeLessThan(String value) {
            addCriterion("G_ENDTIME <", value, "gEndtime");
            return (Criteria) this;
        }

        public Criteria andGEndtimeLessThanOrEqualTo(String value) {
            addCriterion("G_ENDTIME <=", value, "gEndtime");
            return (Criteria) this;
        }

        public Criteria andGEndtimeLike(String value) {
            addCriterion("G_ENDTIME like", value, "gEndtime");
            return (Criteria) this;
        }

        public Criteria andGEndtimeNotLike(String value) {
            addCriterion("G_ENDTIME not like", value, "gEndtime");
            return (Criteria) this;
        }

        public Criteria andGEndtimeIn(List<String> values) {
            addCriterion("G_ENDTIME in", values, "gEndtime");
            return (Criteria) this;
        }

        public Criteria andGEndtimeNotIn(List<String> values) {
            addCriterion("G_ENDTIME not in", values, "gEndtime");
            return (Criteria) this;
        }

        public Criteria andGEndtimeBetween(String value1, String value2) {
            addCriterion("G_ENDTIME between", value1, value2, "gEndtime");
            return (Criteria) this;
        }

        public Criteria andGEndtimeNotBetween(String value1, String value2) {
            addCriterion("G_ENDTIME not between", value1, value2, "gEndtime");
            return (Criteria) this;
        }

        public Criteria andGTypeIsNull() {
            addCriterion("G_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andGTypeIsNotNull() {
            addCriterion("G_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andGTypeEqualTo(String value) {
            addCriterion("G_TYPE =", value, "gType");
            return (Criteria) this;
        }

        public Criteria andGTypeNotEqualTo(String value) {
            addCriterion("G_TYPE <>", value, "gType");
            return (Criteria) this;
        }

        public Criteria andGTypeGreaterThan(String value) {
            addCriterion("G_TYPE >", value, "gType");
            return (Criteria) this;
        }

        public Criteria andGTypeGreaterThanOrEqualTo(String value) {
            addCriterion("G_TYPE >=", value, "gType");
            return (Criteria) this;
        }

        public Criteria andGTypeLessThan(String value) {
            addCriterion("G_TYPE <", value, "gType");
            return (Criteria) this;
        }

        public Criteria andGTypeLessThanOrEqualTo(String value) {
            addCriterion("G_TYPE <=", value, "gType");
            return (Criteria) this;
        }

        public Criteria andGTypeLike(String value) {
            addCriterion("G_TYPE like", value, "gType");
            return (Criteria) this;
        }

        public Criteria andGTypeNotLike(String value) {
            addCriterion("G_TYPE not like", value, "gType");
            return (Criteria) this;
        }

        public Criteria andGTypeIn(List<String> values) {
            addCriterion("G_TYPE in", values, "gType");
            return (Criteria) this;
        }

        public Criteria andGTypeNotIn(List<String> values) {
            addCriterion("G_TYPE not in", values, "gType");
            return (Criteria) this;
        }

        public Criteria andGTypeBetween(String value1, String value2) {
            addCriterion("G_TYPE between", value1, value2, "gType");
            return (Criteria) this;
        }

        public Criteria andGTypeNotBetween(String value1, String value2) {
            addCriterion("G_TYPE not between", value1, value2, "gType");
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