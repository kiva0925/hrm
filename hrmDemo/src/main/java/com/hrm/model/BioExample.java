package com.hrm.model;

import java.util.ArrayList;
import java.util.List;

public class BioExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BioExample() {
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

        public Criteria andBNameIsNull() {
            addCriterion("B_NAME is null");
            return (Criteria) this;
        }

        public Criteria andBNameIsNotNull() {
            addCriterion("B_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andBNameEqualTo(String value) {
            addCriterion("B_NAME =", value, "bName");
            return (Criteria) this;
        }

        public Criteria andBNameNotEqualTo(String value) {
            addCriterion("B_NAME <>", value, "bName");
            return (Criteria) this;
        }

        public Criteria andBNameGreaterThan(String value) {
            addCriterion("B_NAME >", value, "bName");
            return (Criteria) this;
        }

        public Criteria andBNameGreaterThanOrEqualTo(String value) {
            addCriterion("B_NAME >=", value, "bName");
            return (Criteria) this;
        }

        public Criteria andBNameLessThan(String value) {
            addCriterion("B_NAME <", value, "bName");
            return (Criteria) this;
        }

        public Criteria andBNameLessThanOrEqualTo(String value) {
            addCriterion("B_NAME <=", value, "bName");
            return (Criteria) this;
        }

        public Criteria andBNameLike(String value) {
            addCriterion("B_NAME like", value, "bName");
            return (Criteria) this;
        }

        public Criteria andBNameNotLike(String value) {
            addCriterion("B_NAME not like", value, "bName");
            return (Criteria) this;
        }

        public Criteria andBNameIn(List<String> values) {
            addCriterion("B_NAME in", values, "bName");
            return (Criteria) this;
        }

        public Criteria andBNameNotIn(List<String> values) {
            addCriterion("B_NAME not in", values, "bName");
            return (Criteria) this;
        }

        public Criteria andBNameBetween(String value1, String value2) {
            addCriterion("B_NAME between", value1, value2, "bName");
            return (Criteria) this;
        }

        public Criteria andBNameNotBetween(String value1, String value2) {
            addCriterion("B_NAME not between", value1, value2, "bName");
            return (Criteria) this;
        }

        public Criteria andBSexIsNull() {
            addCriterion("B_SEX is null");
            return (Criteria) this;
        }

        public Criteria andBSexIsNotNull() {
            addCriterion("B_SEX is not null");
            return (Criteria) this;
        }

        public Criteria andBSexEqualTo(String value) {
            addCriterion("B_SEX =", value, "bSex");
            return (Criteria) this;
        }

        public Criteria andBSexNotEqualTo(String value) {
            addCriterion("B_SEX <>", value, "bSex");
            return (Criteria) this;
        }

        public Criteria andBSexGreaterThan(String value) {
            addCriterion("B_SEX >", value, "bSex");
            return (Criteria) this;
        }

        public Criteria andBSexGreaterThanOrEqualTo(String value) {
            addCriterion("B_SEX >=", value, "bSex");
            return (Criteria) this;
        }

        public Criteria andBSexLessThan(String value) {
            addCriterion("B_SEX <", value, "bSex");
            return (Criteria) this;
        }

        public Criteria andBSexLessThanOrEqualTo(String value) {
            addCriterion("B_SEX <=", value, "bSex");
            return (Criteria) this;
        }

        public Criteria andBSexLike(String value) {
            addCriterion("B_SEX like", value, "bSex");
            return (Criteria) this;
        }

        public Criteria andBSexNotLike(String value) {
            addCriterion("B_SEX not like", value, "bSex");
            return (Criteria) this;
        }

        public Criteria andBSexIn(List<String> values) {
            addCriterion("B_SEX in", values, "bSex");
            return (Criteria) this;
        }

        public Criteria andBSexNotIn(List<String> values) {
            addCriterion("B_SEX not in", values, "bSex");
            return (Criteria) this;
        }

        public Criteria andBSexBetween(String value1, String value2) {
            addCriterion("B_SEX between", value1, value2, "bSex");
            return (Criteria) this;
        }

        public Criteria andBSexNotBetween(String value1, String value2) {
            addCriterion("B_SEX not between", value1, value2, "bSex");
            return (Criteria) this;
        }

        public Criteria andBSchooltagIsNull() {
            addCriterion("B_SCHOOLTAG is null");
            return (Criteria) this;
        }

        public Criteria andBSchooltagIsNotNull() {
            addCriterion("B_SCHOOLTAG is not null");
            return (Criteria) this;
        }

        public Criteria andBSchooltagEqualTo(String value) {
            addCriterion("B_SCHOOLTAG =", value, "bSchooltag");
            return (Criteria) this;
        }

        public Criteria andBSchooltagNotEqualTo(String value) {
            addCriterion("B_SCHOOLTAG <>", value, "bSchooltag");
            return (Criteria) this;
        }

        public Criteria andBSchooltagGreaterThan(String value) {
            addCriterion("B_SCHOOLTAG >", value, "bSchooltag");
            return (Criteria) this;
        }

        public Criteria andBSchooltagGreaterThanOrEqualTo(String value) {
            addCriterion("B_SCHOOLTAG >=", value, "bSchooltag");
            return (Criteria) this;
        }

        public Criteria andBSchooltagLessThan(String value) {
            addCriterion("B_SCHOOLTAG <", value, "bSchooltag");
            return (Criteria) this;
        }

        public Criteria andBSchooltagLessThanOrEqualTo(String value) {
            addCriterion("B_SCHOOLTAG <=", value, "bSchooltag");
            return (Criteria) this;
        }

        public Criteria andBSchooltagLike(String value) {
            addCriterion("B_SCHOOLTAG like", value, "bSchooltag");
            return (Criteria) this;
        }

        public Criteria andBSchooltagNotLike(String value) {
            addCriterion("B_SCHOOLTAG not like", value, "bSchooltag");
            return (Criteria) this;
        }

        public Criteria andBSchooltagIn(List<String> values) {
            addCriterion("B_SCHOOLTAG in", values, "bSchooltag");
            return (Criteria) this;
        }

        public Criteria andBSchooltagNotIn(List<String> values) {
            addCriterion("B_SCHOOLTAG not in", values, "bSchooltag");
            return (Criteria) this;
        }

        public Criteria andBSchooltagBetween(String value1, String value2) {
            addCriterion("B_SCHOOLTAG between", value1, value2, "bSchooltag");
            return (Criteria) this;
        }

        public Criteria andBSchooltagNotBetween(String value1, String value2) {
            addCriterion("B_SCHOOLTAG not between", value1, value2, "bSchooltag");
            return (Criteria) this;
        }

        public Criteria andBEducationIsNull() {
            addCriterion("B_EDUCATION is null");
            return (Criteria) this;
        }

        public Criteria andBEducationIsNotNull() {
            addCriterion("B_EDUCATION is not null");
            return (Criteria) this;
        }

        public Criteria andBEducationEqualTo(String value) {
            addCriterion("B_EDUCATION =", value, "bEducation");
            return (Criteria) this;
        }

        public Criteria andBEducationNotEqualTo(String value) {
            addCriterion("B_EDUCATION <>", value, "bEducation");
            return (Criteria) this;
        }

        public Criteria andBEducationGreaterThan(String value) {
            addCriterion("B_EDUCATION >", value, "bEducation");
            return (Criteria) this;
        }

        public Criteria andBEducationGreaterThanOrEqualTo(String value) {
            addCriterion("B_EDUCATION >=", value, "bEducation");
            return (Criteria) this;
        }

        public Criteria andBEducationLessThan(String value) {
            addCriterion("B_EDUCATION <", value, "bEducation");
            return (Criteria) this;
        }

        public Criteria andBEducationLessThanOrEqualTo(String value) {
            addCriterion("B_EDUCATION <=", value, "bEducation");
            return (Criteria) this;
        }

        public Criteria andBEducationLike(String value) {
            addCriterion("B_EDUCATION like", value, "bEducation");
            return (Criteria) this;
        }

        public Criteria andBEducationNotLike(String value) {
            addCriterion("B_EDUCATION not like", value, "bEducation");
            return (Criteria) this;
        }

        public Criteria andBEducationIn(List<String> values) {
            addCriterion("B_EDUCATION in", values, "bEducation");
            return (Criteria) this;
        }

        public Criteria andBEducationNotIn(List<String> values) {
            addCriterion("B_EDUCATION not in", values, "bEducation");
            return (Criteria) this;
        }

        public Criteria andBEducationBetween(String value1, String value2) {
            addCriterion("B_EDUCATION between", value1, value2, "bEducation");
            return (Criteria) this;
        }

        public Criteria andBEducationNotBetween(String value1, String value2) {
            addCriterion("B_EDUCATION not between", value1, value2, "bEducation");
            return (Criteria) this;
        }

        public Criteria andBSpecialtyIsNull() {
            addCriterion("B_SPECIALTY is null");
            return (Criteria) this;
        }

        public Criteria andBSpecialtyIsNotNull() {
            addCriterion("B_SPECIALTY is not null");
            return (Criteria) this;
        }

        public Criteria andBSpecialtyEqualTo(String value) {
            addCriterion("B_SPECIALTY =", value, "bSpecialty");
            return (Criteria) this;
        }

        public Criteria andBSpecialtyNotEqualTo(String value) {
            addCriterion("B_SPECIALTY <>", value, "bSpecialty");
            return (Criteria) this;
        }

        public Criteria andBSpecialtyGreaterThan(String value) {
            addCriterion("B_SPECIALTY >", value, "bSpecialty");
            return (Criteria) this;
        }

        public Criteria andBSpecialtyGreaterThanOrEqualTo(String value) {
            addCriterion("B_SPECIALTY >=", value, "bSpecialty");
            return (Criteria) this;
        }

        public Criteria andBSpecialtyLessThan(String value) {
            addCriterion("B_SPECIALTY <", value, "bSpecialty");
            return (Criteria) this;
        }

        public Criteria andBSpecialtyLessThanOrEqualTo(String value) {
            addCriterion("B_SPECIALTY <=", value, "bSpecialty");
            return (Criteria) this;
        }

        public Criteria andBSpecialtyLike(String value) {
            addCriterion("B_SPECIALTY like", value, "bSpecialty");
            return (Criteria) this;
        }

        public Criteria andBSpecialtyNotLike(String value) {
            addCriterion("B_SPECIALTY not like", value, "bSpecialty");
            return (Criteria) this;
        }

        public Criteria andBSpecialtyIn(List<String> values) {
            addCriterion("B_SPECIALTY in", values, "bSpecialty");
            return (Criteria) this;
        }

        public Criteria andBSpecialtyNotIn(List<String> values) {
            addCriterion("B_SPECIALTY not in", values, "bSpecialty");
            return (Criteria) this;
        }

        public Criteria andBSpecialtyBetween(String value1, String value2) {
            addCriterion("B_SPECIALTY between", value1, value2, "bSpecialty");
            return (Criteria) this;
        }

        public Criteria andBSpecialtyNotBetween(String value1, String value2) {
            addCriterion("B_SPECIALTY not between", value1, value2, "bSpecialty");
            return (Criteria) this;
        }

        public Criteria andBBirthdayIsNull() {
            addCriterion("B_BIRTHDAY is null");
            return (Criteria) this;
        }

        public Criteria andBBirthdayIsNotNull() {
            addCriterion("B_BIRTHDAY is not null");
            return (Criteria) this;
        }

        public Criteria andBBirthdayEqualTo(String value) {
            addCriterion("B_BIRTHDAY =", value, "bBirthday");
            return (Criteria) this;
        }

        public Criteria andBBirthdayNotEqualTo(String value) {
            addCriterion("B_BIRTHDAY <>", value, "bBirthday");
            return (Criteria) this;
        }

        public Criteria andBBirthdayGreaterThan(String value) {
            addCriterion("B_BIRTHDAY >", value, "bBirthday");
            return (Criteria) this;
        }

        public Criteria andBBirthdayGreaterThanOrEqualTo(String value) {
            addCriterion("B_BIRTHDAY >=", value, "bBirthday");
            return (Criteria) this;
        }

        public Criteria andBBirthdayLessThan(String value) {
            addCriterion("B_BIRTHDAY <", value, "bBirthday");
            return (Criteria) this;
        }

        public Criteria andBBirthdayLessThanOrEqualTo(String value) {
            addCriterion("B_BIRTHDAY <=", value, "bBirthday");
            return (Criteria) this;
        }

        public Criteria andBBirthdayLike(String value) {
            addCriterion("B_BIRTHDAY like", value, "bBirthday");
            return (Criteria) this;
        }

        public Criteria andBBirthdayNotLike(String value) {
            addCriterion("B_BIRTHDAY not like", value, "bBirthday");
            return (Criteria) this;
        }

        public Criteria andBBirthdayIn(List<String> values) {
            addCriterion("B_BIRTHDAY in", values, "bBirthday");
            return (Criteria) this;
        }

        public Criteria andBBirthdayNotIn(List<String> values) {
            addCriterion("B_BIRTHDAY not in", values, "bBirthday");
            return (Criteria) this;
        }

        public Criteria andBBirthdayBetween(String value1, String value2) {
            addCriterion("B_BIRTHDAY between", value1, value2, "bBirthday");
            return (Criteria) this;
        }

        public Criteria andBBirthdayNotBetween(String value1, String value2) {
            addCriterion("B_BIRTHDAY not between", value1, value2, "bBirthday");
            return (Criteria) this;
        }

        public Criteria andBPlaceIsNull() {
            addCriterion("B_PLACE is null");
            return (Criteria) this;
        }

        public Criteria andBPlaceIsNotNull() {
            addCriterion("B_PLACE is not null");
            return (Criteria) this;
        }

        public Criteria andBPlaceEqualTo(String value) {
            addCriterion("B_PLACE =", value, "bPlace");
            return (Criteria) this;
        }

        public Criteria andBPlaceNotEqualTo(String value) {
            addCriterion("B_PLACE <>", value, "bPlace");
            return (Criteria) this;
        }

        public Criteria andBPlaceGreaterThan(String value) {
            addCriterion("B_PLACE >", value, "bPlace");
            return (Criteria) this;
        }

        public Criteria andBPlaceGreaterThanOrEqualTo(String value) {
            addCriterion("B_PLACE >=", value, "bPlace");
            return (Criteria) this;
        }

        public Criteria andBPlaceLessThan(String value) {
            addCriterion("B_PLACE <", value, "bPlace");
            return (Criteria) this;
        }

        public Criteria andBPlaceLessThanOrEqualTo(String value) {
            addCriterion("B_PLACE <=", value, "bPlace");
            return (Criteria) this;
        }

        public Criteria andBPlaceLike(String value) {
            addCriterion("B_PLACE like", value, "bPlace");
            return (Criteria) this;
        }

        public Criteria andBPlaceNotLike(String value) {
            addCriterion("B_PLACE not like", value, "bPlace");
            return (Criteria) this;
        }

        public Criteria andBPlaceIn(List<String> values) {
            addCriterion("B_PLACE in", values, "bPlace");
            return (Criteria) this;
        }

        public Criteria andBPlaceNotIn(List<String> values) {
            addCriterion("B_PLACE not in", values, "bPlace");
            return (Criteria) this;
        }

        public Criteria andBPlaceBetween(String value1, String value2) {
            addCriterion("B_PLACE between", value1, value2, "bPlace");
            return (Criteria) this;
        }

        public Criteria andBPlaceNotBetween(String value1, String value2) {
            addCriterion("B_PLACE not between", value1, value2, "bPlace");
            return (Criteria) this;
        }

        public Criteria andBPhoneIsNull() {
            addCriterion("B_PHONE is null");
            return (Criteria) this;
        }

        public Criteria andBPhoneIsNotNull() {
            addCriterion("B_PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andBPhoneEqualTo(String value) {
            addCriterion("B_PHONE =", value, "bPhone");
            return (Criteria) this;
        }

        public Criteria andBPhoneNotEqualTo(String value) {
            addCriterion("B_PHONE <>", value, "bPhone");
            return (Criteria) this;
        }

        public Criteria andBPhoneGreaterThan(String value) {
            addCriterion("B_PHONE >", value, "bPhone");
            return (Criteria) this;
        }

        public Criteria andBPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("B_PHONE >=", value, "bPhone");
            return (Criteria) this;
        }

        public Criteria andBPhoneLessThan(String value) {
            addCriterion("B_PHONE <", value, "bPhone");
            return (Criteria) this;
        }

        public Criteria andBPhoneLessThanOrEqualTo(String value) {
            addCriterion("B_PHONE <=", value, "bPhone");
            return (Criteria) this;
        }

        public Criteria andBPhoneLike(String value) {
            addCriterion("B_PHONE like", value, "bPhone");
            return (Criteria) this;
        }

        public Criteria andBPhoneNotLike(String value) {
            addCriterion("B_PHONE not like", value, "bPhone");
            return (Criteria) this;
        }

        public Criteria andBPhoneIn(List<String> values) {
            addCriterion("B_PHONE in", values, "bPhone");
            return (Criteria) this;
        }

        public Criteria andBPhoneNotIn(List<String> values) {
            addCriterion("B_PHONE not in", values, "bPhone");
            return (Criteria) this;
        }

        public Criteria andBPhoneBetween(String value1, String value2) {
            addCriterion("B_PHONE between", value1, value2, "bPhone");
            return (Criteria) this;
        }

        public Criteria andBPhoneNotBetween(String value1, String value2) {
            addCriterion("B_PHONE not between", value1, value2, "bPhone");
            return (Criteria) this;
        }

        public Criteria andBAddressIsNull() {
            addCriterion("B_ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andBAddressIsNotNull() {
            addCriterion("B_ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andBAddressEqualTo(String value) {
            addCriterion("B_ADDRESS =", value, "bAddress");
            return (Criteria) this;
        }

        public Criteria andBAddressNotEqualTo(String value) {
            addCriterion("B_ADDRESS <>", value, "bAddress");
            return (Criteria) this;
        }

        public Criteria andBAddressGreaterThan(String value) {
            addCriterion("B_ADDRESS >", value, "bAddress");
            return (Criteria) this;
        }

        public Criteria andBAddressGreaterThanOrEqualTo(String value) {
            addCriterion("B_ADDRESS >=", value, "bAddress");
            return (Criteria) this;
        }

        public Criteria andBAddressLessThan(String value) {
            addCriterion("B_ADDRESS <", value, "bAddress");
            return (Criteria) this;
        }

        public Criteria andBAddressLessThanOrEqualTo(String value) {
            addCriterion("B_ADDRESS <=", value, "bAddress");
            return (Criteria) this;
        }

        public Criteria andBAddressLike(String value) {
            addCriterion("B_ADDRESS like", value, "bAddress");
            return (Criteria) this;
        }

        public Criteria andBAddressNotLike(String value) {
            addCriterion("B_ADDRESS not like", value, "bAddress");
            return (Criteria) this;
        }

        public Criteria andBAddressIn(List<String> values) {
            addCriterion("B_ADDRESS in", values, "bAddress");
            return (Criteria) this;
        }

        public Criteria andBAddressNotIn(List<String> values) {
            addCriterion("B_ADDRESS not in", values, "bAddress");
            return (Criteria) this;
        }

        public Criteria andBAddressBetween(String value1, String value2) {
            addCriterion("B_ADDRESS between", value1, value2, "bAddress");
            return (Criteria) this;
        }

        public Criteria andBAddressNotBetween(String value1, String value2) {
            addCriterion("B_ADDRESS not between", value1, value2, "bAddress");
            return (Criteria) this;
        }

        public Criteria andBEmailIsNull() {
            addCriterion("B_EMAIL is null");
            return (Criteria) this;
        }

        public Criteria andBEmailIsNotNull() {
            addCriterion("B_EMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andBEmailEqualTo(String value) {
            addCriterion("B_EMAIL =", value, "bEmail");
            return (Criteria) this;
        }

        public Criteria andBEmailNotEqualTo(String value) {
            addCriterion("B_EMAIL <>", value, "bEmail");
            return (Criteria) this;
        }

        public Criteria andBEmailGreaterThan(String value) {
            addCriterion("B_EMAIL >", value, "bEmail");
            return (Criteria) this;
        }

        public Criteria andBEmailGreaterThanOrEqualTo(String value) {
            addCriterion("B_EMAIL >=", value, "bEmail");
            return (Criteria) this;
        }

        public Criteria andBEmailLessThan(String value) {
            addCriterion("B_EMAIL <", value, "bEmail");
            return (Criteria) this;
        }

        public Criteria andBEmailLessThanOrEqualTo(String value) {
            addCriterion("B_EMAIL <=", value, "bEmail");
            return (Criteria) this;
        }

        public Criteria andBEmailLike(String value) {
            addCriterion("B_EMAIL like", value, "bEmail");
            return (Criteria) this;
        }

        public Criteria andBEmailNotLike(String value) {
            addCriterion("B_EMAIL not like", value, "bEmail");
            return (Criteria) this;
        }

        public Criteria andBEmailIn(List<String> values) {
            addCriterion("B_EMAIL in", values, "bEmail");
            return (Criteria) this;
        }

        public Criteria andBEmailNotIn(List<String> values) {
            addCriterion("B_EMAIL not in", values, "bEmail");
            return (Criteria) this;
        }

        public Criteria andBEmailBetween(String value1, String value2) {
            addCriterion("B_EMAIL between", value1, value2, "bEmail");
            return (Criteria) this;
        }

        public Criteria andBEmailNotBetween(String value1, String value2) {
            addCriterion("B_EMAIL not between", value1, value2, "bEmail");
            return (Criteria) this;
        }

        public Criteria andBEbackgroundIsNull() {
            addCriterion("B_EBACKGROUND is null");
            return (Criteria) this;
        }

        public Criteria andBEbackgroundIsNotNull() {
            addCriterion("B_EBACKGROUND is not null");
            return (Criteria) this;
        }

        public Criteria andBEbackgroundEqualTo(String value) {
            addCriterion("B_EBACKGROUND =", value, "bEbackground");
            return (Criteria) this;
        }

        public Criteria andBEbackgroundNotEqualTo(String value) {
            addCriterion("B_EBACKGROUND <>", value, "bEbackground");
            return (Criteria) this;
        }

        public Criteria andBEbackgroundGreaterThan(String value) {
            addCriterion("B_EBACKGROUND >", value, "bEbackground");
            return (Criteria) this;
        }

        public Criteria andBEbackgroundGreaterThanOrEqualTo(String value) {
            addCriterion("B_EBACKGROUND >=", value, "bEbackground");
            return (Criteria) this;
        }

        public Criteria andBEbackgroundLessThan(String value) {
            addCriterion("B_EBACKGROUND <", value, "bEbackground");
            return (Criteria) this;
        }

        public Criteria andBEbackgroundLessThanOrEqualTo(String value) {
            addCriterion("B_EBACKGROUND <=", value, "bEbackground");
            return (Criteria) this;
        }

        public Criteria andBEbackgroundLike(String value) {
            addCriterion("B_EBACKGROUND like", value, "bEbackground");
            return (Criteria) this;
        }

        public Criteria andBEbackgroundNotLike(String value) {
            addCriterion("B_EBACKGROUND not like", value, "bEbackground");
            return (Criteria) this;
        }

        public Criteria andBEbackgroundIn(List<String> values) {
            addCriterion("B_EBACKGROUND in", values, "bEbackground");
            return (Criteria) this;
        }

        public Criteria andBEbackgroundNotIn(List<String> values) {
            addCriterion("B_EBACKGROUND not in", values, "bEbackground");
            return (Criteria) this;
        }

        public Criteria andBEbackgroundBetween(String value1, String value2) {
            addCriterion("B_EBACKGROUND between", value1, value2, "bEbackground");
            return (Criteria) this;
        }

        public Criteria andBEbackgroundNotBetween(String value1, String value2) {
            addCriterion("B_EBACKGROUND not between", value1, value2, "bEbackground");
            return (Criteria) this;
        }

        public Criteria andBSkillIsNull() {
            addCriterion("B_SKILL is null");
            return (Criteria) this;
        }

        public Criteria andBSkillIsNotNull() {
            addCriterion("B_SKILL is not null");
            return (Criteria) this;
        }

        public Criteria andBSkillEqualTo(String value) {
            addCriterion("B_SKILL =", value, "bSkill");
            return (Criteria) this;
        }

        public Criteria andBSkillNotEqualTo(String value) {
            addCriterion("B_SKILL <>", value, "bSkill");
            return (Criteria) this;
        }

        public Criteria andBSkillGreaterThan(String value) {
            addCriterion("B_SKILL >", value, "bSkill");
            return (Criteria) this;
        }

        public Criteria andBSkillGreaterThanOrEqualTo(String value) {
            addCriterion("B_SKILL >=", value, "bSkill");
            return (Criteria) this;
        }

        public Criteria andBSkillLessThan(String value) {
            addCriterion("B_SKILL <", value, "bSkill");
            return (Criteria) this;
        }

        public Criteria andBSkillLessThanOrEqualTo(String value) {
            addCriterion("B_SKILL <=", value, "bSkill");
            return (Criteria) this;
        }

        public Criteria andBSkillLike(String value) {
            addCriterion("B_SKILL like", value, "bSkill");
            return (Criteria) this;
        }

        public Criteria andBSkillNotLike(String value) {
            addCriterion("B_SKILL not like", value, "bSkill");
            return (Criteria) this;
        }

        public Criteria andBSkillIn(List<String> values) {
            addCriterion("B_SKILL in", values, "bSkill");
            return (Criteria) this;
        }

        public Criteria andBSkillNotIn(List<String> values) {
            addCriterion("B_SKILL not in", values, "bSkill");
            return (Criteria) this;
        }

        public Criteria andBSkillBetween(String value1, String value2) {
            addCriterion("B_SKILL between", value1, value2, "bSkill");
            return (Criteria) this;
        }

        public Criteria andBSkillNotBetween(String value1, String value2) {
            addCriterion("B_SKILL not between", value1, value2, "bSkill");
            return (Criteria) this;
        }

        public Criteria andBExperienceIsNull() {
            addCriterion("B_EXPERIENCE is null");
            return (Criteria) this;
        }

        public Criteria andBExperienceIsNotNull() {
            addCriterion("B_EXPERIENCE is not null");
            return (Criteria) this;
        }

        public Criteria andBExperienceEqualTo(String value) {
            addCriterion("B_EXPERIENCE =", value, "bExperience");
            return (Criteria) this;
        }

        public Criteria andBExperienceNotEqualTo(String value) {
            addCriterion("B_EXPERIENCE <>", value, "bExperience");
            return (Criteria) this;
        }

        public Criteria andBExperienceGreaterThan(String value) {
            addCriterion("B_EXPERIENCE >", value, "bExperience");
            return (Criteria) this;
        }

        public Criteria andBExperienceGreaterThanOrEqualTo(String value) {
            addCriterion("B_EXPERIENCE >=", value, "bExperience");
            return (Criteria) this;
        }

        public Criteria andBExperienceLessThan(String value) {
            addCriterion("B_EXPERIENCE <", value, "bExperience");
            return (Criteria) this;
        }

        public Criteria andBExperienceLessThanOrEqualTo(String value) {
            addCriterion("B_EXPERIENCE <=", value, "bExperience");
            return (Criteria) this;
        }

        public Criteria andBExperienceLike(String value) {
            addCriterion("B_EXPERIENCE like", value, "bExperience");
            return (Criteria) this;
        }

        public Criteria andBExperienceNotLike(String value) {
            addCriterion("B_EXPERIENCE not like", value, "bExperience");
            return (Criteria) this;
        }

        public Criteria andBExperienceIn(List<String> values) {
            addCriterion("B_EXPERIENCE in", values, "bExperience");
            return (Criteria) this;
        }

        public Criteria andBExperienceNotIn(List<String> values) {
            addCriterion("B_EXPERIENCE not in", values, "bExperience");
            return (Criteria) this;
        }

        public Criteria andBExperienceBetween(String value1, String value2) {
            addCriterion("B_EXPERIENCE between", value1, value2, "bExperience");
            return (Criteria) this;
        }

        public Criteria andBExperienceNotBetween(String value1, String value2) {
            addCriterion("B_EXPERIENCE not between", value1, value2, "bExperience");
            return (Criteria) this;
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