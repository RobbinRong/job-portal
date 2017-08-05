package com.buu.job.domain;

import java.util.ArrayList;
import java.util.List;

public class JobDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public JobDetailExample() {
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

        public Criteria andPositionidIsNull() {
            addCriterion("positionId is null");
            return (Criteria) this;
        }

        public Criteria andPositionidIsNotNull() {
            addCriterion("positionId is not null");
            return (Criteria) this;
        }

        public Criteria andPositionidEqualTo(Integer value) {
            addCriterion("positionId =", value, "positionid");
            return (Criteria) this;
        }

        public Criteria andPositionidNotEqualTo(Integer value) {
            addCriterion("positionId <>", value, "positionid");
            return (Criteria) this;
        }

        public Criteria andPositionidGreaterThan(Integer value) {
            addCriterion("positionId >", value, "positionid");
            return (Criteria) this;
        }

        public Criteria andPositionidGreaterThanOrEqualTo(Integer value) {
            addCriterion("positionId >=", value, "positionid");
            return (Criteria) this;
        }

        public Criteria andPositionidLessThan(Integer value) {
            addCriterion("positionId <", value, "positionid");
            return (Criteria) this;
        }

        public Criteria andPositionidLessThanOrEqualTo(Integer value) {
            addCriterion("positionId <=", value, "positionid");
            return (Criteria) this;
        }

        public Criteria andPositionidIn(List<Integer> values) {
            addCriterion("positionId in", values, "positionid");
            return (Criteria) this;
        }

        public Criteria andPositionidNotIn(List<Integer> values) {
            addCriterion("positionId not in", values, "positionid");
            return (Criteria) this;
        }

        public Criteria andPositionidBetween(Integer value1, Integer value2) {
            addCriterion("positionId between", value1, value2, "positionid");
            return (Criteria) this;
        }

        public Criteria andPositionidNotBetween(Integer value1, Integer value2) {
            addCriterion("positionId not between", value1, value2, "positionid");
            return (Criteria) this;
        }

        public Criteria andPostdepartmentIsNull() {
            addCriterion("postDepartment is null");
            return (Criteria) this;
        }

        public Criteria andPostdepartmentIsNotNull() {
            addCriterion("postDepartment is not null");
            return (Criteria) this;
        }

        public Criteria andPostdepartmentEqualTo(String value) {
            addCriterion("postDepartment =", value, "postdepartment");
            return (Criteria) this;
        }

        public Criteria andPostdepartmentNotEqualTo(String value) {
            addCriterion("postDepartment <>", value, "postdepartment");
            return (Criteria) this;
        }

        public Criteria andPostdepartmentGreaterThan(String value) {
            addCriterion("postDepartment >", value, "postdepartment");
            return (Criteria) this;
        }

        public Criteria andPostdepartmentGreaterThanOrEqualTo(String value) {
            addCriterion("postDepartment >=", value, "postdepartment");
            return (Criteria) this;
        }

        public Criteria andPostdepartmentLessThan(String value) {
            addCriterion("postDepartment <", value, "postdepartment");
            return (Criteria) this;
        }

        public Criteria andPostdepartmentLessThanOrEqualTo(String value) {
            addCriterion("postDepartment <=", value, "postdepartment");
            return (Criteria) this;
        }

        public Criteria andPostdepartmentLike(String value) {
            addCriterion("postDepartment like", value, "postdepartment");
            return (Criteria) this;
        }

        public Criteria andPostdepartmentNotLike(String value) {
            addCriterion("postDepartment not like", value, "postdepartment");
            return (Criteria) this;
        }

        public Criteria andPostdepartmentIn(List<String> values) {
            addCriterion("postDepartment in", values, "postdepartment");
            return (Criteria) this;
        }

        public Criteria andPostdepartmentNotIn(List<String> values) {
            addCriterion("postDepartment not in", values, "postdepartment");
            return (Criteria) this;
        }

        public Criteria andPostdepartmentBetween(String value1, String value2) {
            addCriterion("postDepartment between", value1, value2, "postdepartment");
            return (Criteria) this;
        }

        public Criteria andPostdepartmentNotBetween(String value1, String value2) {
            addCriterion("postDepartment not between", value1, value2, "postdepartment");
            return (Criteria) this;
        }

        public Criteria andPostIsNull() {
            addCriterion("post is null");
            return (Criteria) this;
        }

        public Criteria andPostIsNotNull() {
            addCriterion("post is not null");
            return (Criteria) this;
        }

        public Criteria andPostEqualTo(String value) {
            addCriterion("post =", value, "post");
            return (Criteria) this;
        }

        public Criteria andPostNotEqualTo(String value) {
            addCriterion("post <>", value, "post");
            return (Criteria) this;
        }

        public Criteria andPostGreaterThan(String value) {
            addCriterion("post >", value, "post");
            return (Criteria) this;
        }

        public Criteria andPostGreaterThanOrEqualTo(String value) {
            addCriterion("post >=", value, "post");
            return (Criteria) this;
        }

        public Criteria andPostLessThan(String value) {
            addCriterion("post <", value, "post");
            return (Criteria) this;
        }

        public Criteria andPostLessThanOrEqualTo(String value) {
            addCriterion("post <=", value, "post");
            return (Criteria) this;
        }

        public Criteria andPostLike(String value) {
            addCriterion("post like", value, "post");
            return (Criteria) this;
        }

        public Criteria andPostNotLike(String value) {
            addCriterion("post not like", value, "post");
            return (Criteria) this;
        }

        public Criteria andPostIn(List<String> values) {
            addCriterion("post in", values, "post");
            return (Criteria) this;
        }

        public Criteria andPostNotIn(List<String> values) {
            addCriterion("post not in", values, "post");
            return (Criteria) this;
        }

        public Criteria andPostBetween(String value1, String value2) {
            addCriterion("post between", value1, value2, "post");
            return (Criteria) this;
        }

        public Criteria andPostNotBetween(String value1, String value2) {
            addCriterion("post not between", value1, value2, "post");
            return (Criteria) this;
        }

        public Criteria andSalaryIsNull() {
            addCriterion("salary is null");
            return (Criteria) this;
        }

        public Criteria andSalaryIsNotNull() {
            addCriterion("salary is not null");
            return (Criteria) this;
        }

        public Criteria andSalaryEqualTo(String value) {
            addCriterion("salary =", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryNotEqualTo(String value) {
            addCriterion("salary <>", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryGreaterThan(String value) {
            addCriterion("salary >", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryGreaterThanOrEqualTo(String value) {
            addCriterion("salary >=", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryLessThan(String value) {
            addCriterion("salary <", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryLessThanOrEqualTo(String value) {
            addCriterion("salary <=", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryLike(String value) {
            addCriterion("salary like", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryNotLike(String value) {
            addCriterion("salary not like", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryIn(List<String> values) {
            addCriterion("salary in", values, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryNotIn(List<String> values) {
            addCriterion("salary not in", values, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryBetween(String value1, String value2) {
            addCriterion("salary between", value1, value2, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryNotBetween(String value1, String value2) {
            addCriterion("salary not between", value1, value2, "salary");
            return (Criteria) this;
        }

        public Criteria andWorkplaceIsNull() {
            addCriterion("workPlace is null");
            return (Criteria) this;
        }

        public Criteria andWorkplaceIsNotNull() {
            addCriterion("workPlace is not null");
            return (Criteria) this;
        }

        public Criteria andWorkplaceEqualTo(String value) {
            addCriterion("workPlace =", value, "workplace");
            return (Criteria) this;
        }

        public Criteria andWorkplaceNotEqualTo(String value) {
            addCriterion("workPlace <>", value, "workplace");
            return (Criteria) this;
        }

        public Criteria andWorkplaceGreaterThan(String value) {
            addCriterion("workPlace >", value, "workplace");
            return (Criteria) this;
        }

        public Criteria andWorkplaceGreaterThanOrEqualTo(String value) {
            addCriterion("workPlace >=", value, "workplace");
            return (Criteria) this;
        }

        public Criteria andWorkplaceLessThan(String value) {
            addCriterion("workPlace <", value, "workplace");
            return (Criteria) this;
        }

        public Criteria andWorkplaceLessThanOrEqualTo(String value) {
            addCriterion("workPlace <=", value, "workplace");
            return (Criteria) this;
        }

        public Criteria andWorkplaceLike(String value) {
            addCriterion("workPlace like", value, "workplace");
            return (Criteria) this;
        }

        public Criteria andWorkplaceNotLike(String value) {
            addCriterion("workPlace not like", value, "workplace");
            return (Criteria) this;
        }

        public Criteria andWorkplaceIn(List<String> values) {
            addCriterion("workPlace in", values, "workplace");
            return (Criteria) this;
        }

        public Criteria andWorkplaceNotIn(List<String> values) {
            addCriterion("workPlace not in", values, "workplace");
            return (Criteria) this;
        }

        public Criteria andWorkplaceBetween(String value1, String value2) {
            addCriterion("workPlace between", value1, value2, "workplace");
            return (Criteria) this;
        }

        public Criteria andWorkplaceNotBetween(String value1, String value2) {
            addCriterion("workPlace not between", value1, value2, "workplace");
            return (Criteria) this;
        }

        public Criteria andExperienceIsNull() {
            addCriterion("experience is null");
            return (Criteria) this;
        }

        public Criteria andExperienceIsNotNull() {
            addCriterion("experience is not null");
            return (Criteria) this;
        }

        public Criteria andExperienceEqualTo(String value) {
            addCriterion("experience =", value, "experience");
            return (Criteria) this;
        }

        public Criteria andExperienceNotEqualTo(String value) {
            addCriterion("experience <>", value, "experience");
            return (Criteria) this;
        }

        public Criteria andExperienceGreaterThan(String value) {
            addCriterion("experience >", value, "experience");
            return (Criteria) this;
        }

        public Criteria andExperienceGreaterThanOrEqualTo(String value) {
            addCriterion("experience >=", value, "experience");
            return (Criteria) this;
        }

        public Criteria andExperienceLessThan(String value) {
            addCriterion("experience <", value, "experience");
            return (Criteria) this;
        }

        public Criteria andExperienceLessThanOrEqualTo(String value) {
            addCriterion("experience <=", value, "experience");
            return (Criteria) this;
        }

        public Criteria andExperienceLike(String value) {
            addCriterion("experience like", value, "experience");
            return (Criteria) this;
        }

        public Criteria andExperienceNotLike(String value) {
            addCriterion("experience not like", value, "experience");
            return (Criteria) this;
        }

        public Criteria andExperienceIn(List<String> values) {
            addCriterion("experience in", values, "experience");
            return (Criteria) this;
        }

        public Criteria andExperienceNotIn(List<String> values) {
            addCriterion("experience not in", values, "experience");
            return (Criteria) this;
        }

        public Criteria andExperienceBetween(String value1, String value2) {
            addCriterion("experience between", value1, value2, "experience");
            return (Criteria) this;
        }

        public Criteria andExperienceNotBetween(String value1, String value2) {
            addCriterion("experience not between", value1, value2, "experience");
            return (Criteria) this;
        }

        public Criteria andEducationbackgroundIsNull() {
            addCriterion("educationBackground is null");
            return (Criteria) this;
        }

        public Criteria andEducationbackgroundIsNotNull() {
            addCriterion("educationBackground is not null");
            return (Criteria) this;
        }

        public Criteria andEducationbackgroundEqualTo(String value) {
            addCriterion("educationBackground =", value, "educationbackground");
            return (Criteria) this;
        }

        public Criteria andEducationbackgroundNotEqualTo(String value) {
            addCriterion("educationBackground <>", value, "educationbackground");
            return (Criteria) this;
        }

        public Criteria andEducationbackgroundGreaterThan(String value) {
            addCriterion("educationBackground >", value, "educationbackground");
            return (Criteria) this;
        }

        public Criteria andEducationbackgroundGreaterThanOrEqualTo(String value) {
            addCriterion("educationBackground >=", value, "educationbackground");
            return (Criteria) this;
        }

        public Criteria andEducationbackgroundLessThan(String value) {
            addCriterion("educationBackground <", value, "educationbackground");
            return (Criteria) this;
        }

        public Criteria andEducationbackgroundLessThanOrEqualTo(String value) {
            addCriterion("educationBackground <=", value, "educationbackground");
            return (Criteria) this;
        }

        public Criteria andEducationbackgroundLike(String value) {
            addCriterion("educationBackground like", value, "educationbackground");
            return (Criteria) this;
        }

        public Criteria andEducationbackgroundNotLike(String value) {
            addCriterion("educationBackground not like", value, "educationbackground");
            return (Criteria) this;
        }

        public Criteria andEducationbackgroundIn(List<String> values) {
            addCriterion("educationBackground in", values, "educationbackground");
            return (Criteria) this;
        }

        public Criteria andEducationbackgroundNotIn(List<String> values) {
            addCriterion("educationBackground not in", values, "educationbackground");
            return (Criteria) this;
        }

        public Criteria andEducationbackgroundBetween(String value1, String value2) {
            addCriterion("educationBackground between", value1, value2, "educationbackground");
            return (Criteria) this;
        }

        public Criteria andEducationbackgroundNotBetween(String value1, String value2) {
            addCriterion("educationBackground not between", value1, value2, "educationbackground");
            return (Criteria) this;
        }

        public Criteria andJobkindIsNull() {
            addCriterion("jobKind is null");
            return (Criteria) this;
        }

        public Criteria andJobkindIsNotNull() {
            addCriterion("jobKind is not null");
            return (Criteria) this;
        }

        public Criteria andJobkindEqualTo(String value) {
            addCriterion("jobKind =", value, "jobkind");
            return (Criteria) this;
        }

        public Criteria andJobkindNotEqualTo(String value) {
            addCriterion("jobKind <>", value, "jobkind");
            return (Criteria) this;
        }

        public Criteria andJobkindGreaterThan(String value) {
            addCriterion("jobKind >", value, "jobkind");
            return (Criteria) this;
        }

        public Criteria andJobkindGreaterThanOrEqualTo(String value) {
            addCriterion("jobKind >=", value, "jobkind");
            return (Criteria) this;
        }

        public Criteria andJobkindLessThan(String value) {
            addCriterion("jobKind <", value, "jobkind");
            return (Criteria) this;
        }

        public Criteria andJobkindLessThanOrEqualTo(String value) {
            addCriterion("jobKind <=", value, "jobkind");
            return (Criteria) this;
        }

        public Criteria andJobkindLike(String value) {
            addCriterion("jobKind like", value, "jobkind");
            return (Criteria) this;
        }

        public Criteria andJobkindNotLike(String value) {
            addCriterion("jobKind not like", value, "jobkind");
            return (Criteria) this;
        }

        public Criteria andJobkindIn(List<String> values) {
            addCriterion("jobKind in", values, "jobkind");
            return (Criteria) this;
        }

        public Criteria andJobkindNotIn(List<String> values) {
            addCriterion("jobKind not in", values, "jobkind");
            return (Criteria) this;
        }

        public Criteria andJobkindBetween(String value1, String value2) {
            addCriterion("jobKind between", value1, value2, "jobkind");
            return (Criteria) this;
        }

        public Criteria andJobkindNotBetween(String value1, String value2) {
            addCriterion("jobKind not between", value1, value2, "jobkind");
            return (Criteria) this;
        }

        public Criteria andWelfareIsNull() {
            addCriterion("welfare is null");
            return (Criteria) this;
        }

        public Criteria andWelfareIsNotNull() {
            addCriterion("welfare is not null");
            return (Criteria) this;
        }

        public Criteria andWelfareEqualTo(String value) {
            addCriterion("welfare =", value, "welfare");
            return (Criteria) this;
        }

        public Criteria andWelfareNotEqualTo(String value) {
            addCriterion("welfare <>", value, "welfare");
            return (Criteria) this;
        }

        public Criteria andWelfareGreaterThan(String value) {
            addCriterion("welfare >", value, "welfare");
            return (Criteria) this;
        }

        public Criteria andWelfareGreaterThanOrEqualTo(String value) {
            addCriterion("welfare >=", value, "welfare");
            return (Criteria) this;
        }

        public Criteria andWelfareLessThan(String value) {
            addCriterion("welfare <", value, "welfare");
            return (Criteria) this;
        }

        public Criteria andWelfareLessThanOrEqualTo(String value) {
            addCriterion("welfare <=", value, "welfare");
            return (Criteria) this;
        }

        public Criteria andWelfareLike(String value) {
            addCriterion("welfare like", value, "welfare");
            return (Criteria) this;
        }

        public Criteria andWelfareNotLike(String value) {
            addCriterion("welfare not like", value, "welfare");
            return (Criteria) this;
        }

        public Criteria andWelfareIn(List<String> values) {
            addCriterion("welfare in", values, "welfare");
            return (Criteria) this;
        }

        public Criteria andWelfareNotIn(List<String> values) {
            addCriterion("welfare not in", values, "welfare");
            return (Criteria) this;
        }

        public Criteria andWelfareBetween(String value1, String value2) {
            addCriterion("welfare between", value1, value2, "welfare");
            return (Criteria) this;
        }

        public Criteria andWelfareNotBetween(String value1, String value2) {
            addCriterion("welfare not between", value1, value2, "welfare");
            return (Criteria) this;
        }

        public Criteria andPublishtimeIsNull() {
            addCriterion("publishTime is null");
            return (Criteria) this;
        }

        public Criteria andPublishtimeIsNotNull() {
            addCriterion("publishTime is not null");
            return (Criteria) this;
        }

        public Criteria andPublishtimeEqualTo(String value) {
            addCriterion("publishTime =", value, "publishtime");
            return (Criteria) this;
        }

        public Criteria andPublishtimeNotEqualTo(String value) {
            addCriterion("publishTime <>", value, "publishtime");
            return (Criteria) this;
        }

        public Criteria andPublishtimeGreaterThan(String value) {
            addCriterion("publishTime >", value, "publishtime");
            return (Criteria) this;
        }

        public Criteria andPublishtimeGreaterThanOrEqualTo(String value) {
            addCriterion("publishTime >=", value, "publishtime");
            return (Criteria) this;
        }

        public Criteria andPublishtimeLessThan(String value) {
            addCriterion("publishTime <", value, "publishtime");
            return (Criteria) this;
        }

        public Criteria andPublishtimeLessThanOrEqualTo(String value) {
            addCriterion("publishTime <=", value, "publishtime");
            return (Criteria) this;
        }

        public Criteria andPublishtimeLike(String value) {
            addCriterion("publishTime like", value, "publishtime");
            return (Criteria) this;
        }

        public Criteria andPublishtimeNotLike(String value) {
            addCriterion("publishTime not like", value, "publishtime");
            return (Criteria) this;
        }

        public Criteria andPublishtimeIn(List<String> values) {
            addCriterion("publishTime in", values, "publishtime");
            return (Criteria) this;
        }

        public Criteria andPublishtimeNotIn(List<String> values) {
            addCriterion("publishTime not in", values, "publishtime");
            return (Criteria) this;
        }

        public Criteria andPublishtimeBetween(String value1, String value2) {
            addCriterion("publishTime between", value1, value2, "publishtime");
            return (Criteria) this;
        }

        public Criteria andPublishtimeNotBetween(String value1, String value2) {
            addCriterion("publishTime not between", value1, value2, "publishtime");
            return (Criteria) this;
        }

        public Criteria andJobfromIsNull() {
            addCriterion("jobFrom is null");
            return (Criteria) this;
        }

        public Criteria andJobfromIsNotNull() {
            addCriterion("jobFrom is not null");
            return (Criteria) this;
        }

        public Criteria andJobfromEqualTo(String value) {
            addCriterion("jobFrom =", value, "jobfrom");
            return (Criteria) this;
        }

        public Criteria andJobfromNotEqualTo(String value) {
            addCriterion("jobFrom <>", value, "jobfrom");
            return (Criteria) this;
        }

        public Criteria andJobfromGreaterThan(String value) {
            addCriterion("jobFrom >", value, "jobfrom");
            return (Criteria) this;
        }

        public Criteria andJobfromGreaterThanOrEqualTo(String value) {
            addCriterion("jobFrom >=", value, "jobfrom");
            return (Criteria) this;
        }

        public Criteria andJobfromLessThan(String value) {
            addCriterion("jobFrom <", value, "jobfrom");
            return (Criteria) this;
        }

        public Criteria andJobfromLessThanOrEqualTo(String value) {
            addCriterion("jobFrom <=", value, "jobfrom");
            return (Criteria) this;
        }

        public Criteria andJobfromLike(String value) {
            addCriterion("jobFrom like", value, "jobfrom");
            return (Criteria) this;
        }

        public Criteria andJobfromNotLike(String value) {
            addCriterion("jobFrom not like", value, "jobfrom");
            return (Criteria) this;
        }

        public Criteria andJobfromIn(List<String> values) {
            addCriterion("jobFrom in", values, "jobfrom");
            return (Criteria) this;
        }

        public Criteria andJobfromNotIn(List<String> values) {
            addCriterion("jobFrom not in", values, "jobfrom");
            return (Criteria) this;
        }

        public Criteria andJobfromBetween(String value1, String value2) {
            addCriterion("jobFrom between", value1, value2, "jobfrom");
            return (Criteria) this;
        }

        public Criteria andJobfromNotBetween(String value1, String value2) {
            addCriterion("jobFrom not between", value1, value2, "jobfrom");
            return (Criteria) this;
        }

        public Criteria andDutyIsNull() {
            addCriterion("duty is null");
            return (Criteria) this;
        }

        public Criteria andDutyIsNotNull() {
            addCriterion("duty is not null");
            return (Criteria) this;
        }

        public Criteria andDutyEqualTo(String value) {
            addCriterion("duty =", value, "duty");
            return (Criteria) this;
        }

        public Criteria andDutyNotEqualTo(String value) {
            addCriterion("duty <>", value, "duty");
            return (Criteria) this;
        }

        public Criteria andDutyGreaterThan(String value) {
            addCriterion("duty >", value, "duty");
            return (Criteria) this;
        }

        public Criteria andDutyGreaterThanOrEqualTo(String value) {
            addCriterion("duty >=", value, "duty");
            return (Criteria) this;
        }

        public Criteria andDutyLessThan(String value) {
            addCriterion("duty <", value, "duty");
            return (Criteria) this;
        }

        public Criteria andDutyLessThanOrEqualTo(String value) {
            addCriterion("duty <=", value, "duty");
            return (Criteria) this;
        }

        public Criteria andDutyLike(String value) {
            addCriterion("duty like", value, "duty");
            return (Criteria) this;
        }

        public Criteria andDutyNotLike(String value) {
            addCriterion("duty not like", value, "duty");
            return (Criteria) this;
        }

        public Criteria andDutyIn(List<String> values) {
            addCriterion("duty in", values, "duty");
            return (Criteria) this;
        }

        public Criteria andDutyNotIn(List<String> values) {
            addCriterion("duty not in", values, "duty");
            return (Criteria) this;
        }

        public Criteria andDutyBetween(String value1, String value2) {
            addCriterion("duty between", value1, value2, "duty");
            return (Criteria) this;
        }

        public Criteria andDutyNotBetween(String value1, String value2) {
            addCriterion("duty not between", value1, value2, "duty");
            return (Criteria) this;
        }

        public Criteria andPostrequestIsNull() {
            addCriterion("postRequest is null");
            return (Criteria) this;
        }

        public Criteria andPostrequestIsNotNull() {
            addCriterion("postRequest is not null");
            return (Criteria) this;
        }

        public Criteria andPostrequestEqualTo(String value) {
            addCriterion("postRequest =", value, "postrequest");
            return (Criteria) this;
        }

        public Criteria andPostrequestNotEqualTo(String value) {
            addCriterion("postRequest <>", value, "postrequest");
            return (Criteria) this;
        }

        public Criteria andPostrequestGreaterThan(String value) {
            addCriterion("postRequest >", value, "postrequest");
            return (Criteria) this;
        }

        public Criteria andPostrequestGreaterThanOrEqualTo(String value) {
            addCriterion("postRequest >=", value, "postrequest");
            return (Criteria) this;
        }

        public Criteria andPostrequestLessThan(String value) {
            addCriterion("postRequest <", value, "postrequest");
            return (Criteria) this;
        }

        public Criteria andPostrequestLessThanOrEqualTo(String value) {
            addCriterion("postRequest <=", value, "postrequest");
            return (Criteria) this;
        }

        public Criteria andPostrequestLike(String value) {
            addCriterion("postRequest like", value, "postrequest");
            return (Criteria) this;
        }

        public Criteria andPostrequestNotLike(String value) {
            addCriterion("postRequest not like", value, "postrequest");
            return (Criteria) this;
        }

        public Criteria andPostrequestIn(List<String> values) {
            addCriterion("postRequest in", values, "postrequest");
            return (Criteria) this;
        }

        public Criteria andPostrequestNotIn(List<String> values) {
            addCriterion("postRequest not in", values, "postrequest");
            return (Criteria) this;
        }

        public Criteria andPostrequestBetween(String value1, String value2) {
            addCriterion("postRequest between", value1, value2, "postrequest");
            return (Criteria) this;
        }

        public Criteria andPostrequestNotBetween(String value1, String value2) {
            addCriterion("postRequest not between", value1, value2, "postrequest");
            return (Criteria) this;
        }

        public Criteria andPositionaddressIsNull() {
            addCriterion("positionAddress is null");
            return (Criteria) this;
        }

        public Criteria andPositionaddressIsNotNull() {
            addCriterion("positionAddress is not null");
            return (Criteria) this;
        }

        public Criteria andPositionaddressEqualTo(String value) {
            addCriterion("positionAddress =", value, "positionaddress");
            return (Criteria) this;
        }

        public Criteria andPositionaddressNotEqualTo(String value) {
            addCriterion("positionAddress <>", value, "positionaddress");
            return (Criteria) this;
        }

        public Criteria andPositionaddressGreaterThan(String value) {
            addCriterion("positionAddress >", value, "positionaddress");
            return (Criteria) this;
        }

        public Criteria andPositionaddressGreaterThanOrEqualTo(String value) {
            addCriterion("positionAddress >=", value, "positionaddress");
            return (Criteria) this;
        }

        public Criteria andPositionaddressLessThan(String value) {
            addCriterion("positionAddress <", value, "positionaddress");
            return (Criteria) this;
        }

        public Criteria andPositionaddressLessThanOrEqualTo(String value) {
            addCriterion("positionAddress <=", value, "positionaddress");
            return (Criteria) this;
        }

        public Criteria andPositionaddressLike(String value) {
            addCriterion("positionAddress like", value, "positionaddress");
            return (Criteria) this;
        }

        public Criteria andPositionaddressNotLike(String value) {
            addCriterion("positionAddress not like", value, "positionaddress");
            return (Criteria) this;
        }

        public Criteria andPositionaddressIn(List<String> values) {
            addCriterion("positionAddress in", values, "positionaddress");
            return (Criteria) this;
        }

        public Criteria andPositionaddressNotIn(List<String> values) {
            addCriterion("positionAddress not in", values, "positionaddress");
            return (Criteria) this;
        }

        public Criteria andPositionaddressBetween(String value1, String value2) {
            addCriterion("positionAddress between", value1, value2, "positionaddress");
            return (Criteria) this;
        }

        public Criteria andPositionaddressNotBetween(String value1, String value2) {
            addCriterion("positionAddress not between", value1, value2, "positionaddress");
            return (Criteria) this;
        }

        public Criteria andJdpublishernameIsNull() {
            addCriterion("jdPublisherName is null");
            return (Criteria) this;
        }

        public Criteria andJdpublishernameIsNotNull() {
            addCriterion("jdPublisherName is not null");
            return (Criteria) this;
        }

        public Criteria andJdpublishernameEqualTo(String value) {
            addCriterion("jdPublisherName =", value, "jdpublishername");
            return (Criteria) this;
        }

        public Criteria andJdpublishernameNotEqualTo(String value) {
            addCriterion("jdPublisherName <>", value, "jdpublishername");
            return (Criteria) this;
        }

        public Criteria andJdpublishernameGreaterThan(String value) {
            addCriterion("jdPublisherName >", value, "jdpublishername");
            return (Criteria) this;
        }

        public Criteria andJdpublishernameGreaterThanOrEqualTo(String value) {
            addCriterion("jdPublisherName >=", value, "jdpublishername");
            return (Criteria) this;
        }

        public Criteria andJdpublishernameLessThan(String value) {
            addCriterion("jdPublisherName <", value, "jdpublishername");
            return (Criteria) this;
        }

        public Criteria andJdpublishernameLessThanOrEqualTo(String value) {
            addCriterion("jdPublisherName <=", value, "jdpublishername");
            return (Criteria) this;
        }

        public Criteria andJdpublishernameLike(String value) {
            addCriterion("jdPublisherName like", value, "jdpublishername");
            return (Criteria) this;
        }

        public Criteria andJdpublishernameNotLike(String value) {
            addCriterion("jdPublisherName not like", value, "jdpublishername");
            return (Criteria) this;
        }

        public Criteria andJdpublishernameIn(List<String> values) {
            addCriterion("jdPublisherName in", values, "jdpublishername");
            return (Criteria) this;
        }

        public Criteria andJdpublishernameNotIn(List<String> values) {
            addCriterion("jdPublisherName not in", values, "jdpublishername");
            return (Criteria) this;
        }

        public Criteria andJdpublishernameBetween(String value1, String value2) {
            addCriterion("jdPublisherName between", value1, value2, "jdpublishername");
            return (Criteria) this;
        }

        public Criteria andJdpublishernameNotBetween(String value1, String value2) {
            addCriterion("jdPublisherName not between", value1, value2, "jdpublishername");
            return (Criteria) this;
        }

        public Criteria andJdpublisherpostIsNull() {
            addCriterion("jdPublisherPost is null");
            return (Criteria) this;
        }

        public Criteria andJdpublisherpostIsNotNull() {
            addCriterion("jdPublisherPost is not null");
            return (Criteria) this;
        }

        public Criteria andJdpublisherpostEqualTo(String value) {
            addCriterion("jdPublisherPost =", value, "jdpublisherpost");
            return (Criteria) this;
        }

        public Criteria andJdpublisherpostNotEqualTo(String value) {
            addCriterion("jdPublisherPost <>", value, "jdpublisherpost");
            return (Criteria) this;
        }

        public Criteria andJdpublisherpostGreaterThan(String value) {
            addCriterion("jdPublisherPost >", value, "jdpublisherpost");
            return (Criteria) this;
        }

        public Criteria andJdpublisherpostGreaterThanOrEqualTo(String value) {
            addCriterion("jdPublisherPost >=", value, "jdpublisherpost");
            return (Criteria) this;
        }

        public Criteria andJdpublisherpostLessThan(String value) {
            addCriterion("jdPublisherPost <", value, "jdpublisherpost");
            return (Criteria) this;
        }

        public Criteria andJdpublisherpostLessThanOrEqualTo(String value) {
            addCriterion("jdPublisherPost <=", value, "jdpublisherpost");
            return (Criteria) this;
        }

        public Criteria andJdpublisherpostLike(String value) {
            addCriterion("jdPublisherPost like", value, "jdpublisherpost");
            return (Criteria) this;
        }

        public Criteria andJdpublisherpostNotLike(String value) {
            addCriterion("jdPublisherPost not like", value, "jdpublisherpost");
            return (Criteria) this;
        }

        public Criteria andJdpublisherpostIn(List<String> values) {
            addCriterion("jdPublisherPost in", values, "jdpublisherpost");
            return (Criteria) this;
        }

        public Criteria andJdpublisherpostNotIn(List<String> values) {
            addCriterion("jdPublisherPost not in", values, "jdpublisherpost");
            return (Criteria) this;
        }

        public Criteria andJdpublisherpostBetween(String value1, String value2) {
            addCriterion("jdPublisherPost between", value1, value2, "jdpublisherpost");
            return (Criteria) this;
        }

        public Criteria andJdpublisherpostNotBetween(String value1, String value2) {
            addCriterion("jdPublisherPost not between", value1, value2, "jdpublisherpost");
            return (Criteria) this;
        }

        public Criteria andJdpublisherdealratioIsNull() {
            addCriterion("jdPublisherDealRatio is null");
            return (Criteria) this;
        }

        public Criteria andJdpublisherdealratioIsNotNull() {
            addCriterion("jdPublisherDealRatio is not null");
            return (Criteria) this;
        }

        public Criteria andJdpublisherdealratioEqualTo(Integer value) {
            addCriterion("jdPublisherDealRatio =", value, "jdpublisherdealratio");
            return (Criteria) this;
        }

        public Criteria andJdpublisherdealratioNotEqualTo(Integer value) {
            addCriterion("jdPublisherDealRatio <>", value, "jdpublisherdealratio");
            return (Criteria) this;
        }

        public Criteria andJdpublisherdealratioGreaterThan(Integer value) {
            addCriterion("jdPublisherDealRatio >", value, "jdpublisherdealratio");
            return (Criteria) this;
        }

        public Criteria andJdpublisherdealratioGreaterThanOrEqualTo(Integer value) {
            addCriterion("jdPublisherDealRatio >=", value, "jdpublisherdealratio");
            return (Criteria) this;
        }

        public Criteria andJdpublisherdealratioLessThan(Integer value) {
            addCriterion("jdPublisherDealRatio <", value, "jdpublisherdealratio");
            return (Criteria) this;
        }

        public Criteria andJdpublisherdealratioLessThanOrEqualTo(Integer value) {
            addCriterion("jdPublisherDealRatio <=", value, "jdpublisherdealratio");
            return (Criteria) this;
        }

        public Criteria andJdpublisherdealratioIn(List<Integer> values) {
            addCriterion("jdPublisherDealRatio in", values, "jdpublisherdealratio");
            return (Criteria) this;
        }

        public Criteria andJdpublisherdealratioNotIn(List<Integer> values) {
            addCriterion("jdPublisherDealRatio not in", values, "jdpublisherdealratio");
            return (Criteria) this;
        }

        public Criteria andJdpublisherdealratioBetween(Integer value1, Integer value2) {
            addCriterion("jdPublisherDealRatio between", value1, value2, "jdpublisherdealratio");
            return (Criteria) this;
        }

        public Criteria andJdpublisherdealratioNotBetween(Integer value1, Integer value2) {
            addCriterion("jdPublisherDealRatio not between", value1, value2, "jdpublisherdealratio");
            return (Criteria) this;
        }

        public Criteria andCompanynameIsNull() {
            addCriterion("companyName is null");
            return (Criteria) this;
        }

        public Criteria andCompanynameIsNotNull() {
            addCriterion("companyName is not null");
            return (Criteria) this;
        }

        public Criteria andCompanynameEqualTo(String value) {
            addCriterion("companyName =", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameNotEqualTo(String value) {
            addCriterion("companyName <>", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameGreaterThan(String value) {
            addCriterion("companyName >", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameGreaterThanOrEqualTo(String value) {
            addCriterion("companyName >=", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameLessThan(String value) {
            addCriterion("companyName <", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameLessThanOrEqualTo(String value) {
            addCriterion("companyName <=", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameLike(String value) {
            addCriterion("companyName like", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameNotLike(String value) {
            addCriterion("companyName not like", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameIn(List<String> values) {
            addCriterion("companyName in", values, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameNotIn(List<String> values) {
            addCriterion("companyName not in", values, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameBetween(String value1, String value2) {
            addCriterion("companyName between", value1, value2, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameNotBetween(String value1, String value2) {
            addCriterion("companyName not between", value1, value2, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynicknameIsNull() {
            addCriterion("companyNickName is null");
            return (Criteria) this;
        }

        public Criteria andCompanynicknameIsNotNull() {
            addCriterion("companyNickName is not null");
            return (Criteria) this;
        }

        public Criteria andCompanynicknameEqualTo(String value) {
            addCriterion("companyNickName =", value, "companynickname");
            return (Criteria) this;
        }

        public Criteria andCompanynicknameNotEqualTo(String value) {
            addCriterion("companyNickName <>", value, "companynickname");
            return (Criteria) this;
        }

        public Criteria andCompanynicknameGreaterThan(String value) {
            addCriterion("companyNickName >", value, "companynickname");
            return (Criteria) this;
        }

        public Criteria andCompanynicknameGreaterThanOrEqualTo(String value) {
            addCriterion("companyNickName >=", value, "companynickname");
            return (Criteria) this;
        }

        public Criteria andCompanynicknameLessThan(String value) {
            addCriterion("companyNickName <", value, "companynickname");
            return (Criteria) this;
        }

        public Criteria andCompanynicknameLessThanOrEqualTo(String value) {
            addCriterion("companyNickName <=", value, "companynickname");
            return (Criteria) this;
        }

        public Criteria andCompanynicknameLike(String value) {
            addCriterion("companyNickName like", value, "companynickname");
            return (Criteria) this;
        }

        public Criteria andCompanynicknameNotLike(String value) {
            addCriterion("companyNickName not like", value, "companynickname");
            return (Criteria) this;
        }

        public Criteria andCompanynicknameIn(List<String> values) {
            addCriterion("companyNickName in", values, "companynickname");
            return (Criteria) this;
        }

        public Criteria andCompanynicknameNotIn(List<String> values) {
            addCriterion("companyNickName not in", values, "companynickname");
            return (Criteria) this;
        }

        public Criteria andCompanynicknameBetween(String value1, String value2) {
            addCriterion("companyNickName between", value1, value2, "companynickname");
            return (Criteria) this;
        }

        public Criteria andCompanynicknameNotBetween(String value1, String value2) {
            addCriterion("companyNickName not between", value1, value2, "companynickname");
            return (Criteria) this;
        }

        public Criteria andCompanylagohomepageurlIsNull() {
            addCriterion("companyLagoHomePageURL is null");
            return (Criteria) this;
        }

        public Criteria andCompanylagohomepageurlIsNotNull() {
            addCriterion("companyLagoHomePageURL is not null");
            return (Criteria) this;
        }

        public Criteria andCompanylagohomepageurlEqualTo(String value) {
            addCriterion("companyLagoHomePageURL =", value, "companylagohomepageurl");
            return (Criteria) this;
        }

        public Criteria andCompanylagohomepageurlNotEqualTo(String value) {
            addCriterion("companyLagoHomePageURL <>", value, "companylagohomepageurl");
            return (Criteria) this;
        }

        public Criteria andCompanylagohomepageurlGreaterThan(String value) {
            addCriterion("companyLagoHomePageURL >", value, "companylagohomepageurl");
            return (Criteria) this;
        }

        public Criteria andCompanylagohomepageurlGreaterThanOrEqualTo(String value) {
            addCriterion("companyLagoHomePageURL >=", value, "companylagohomepageurl");
            return (Criteria) this;
        }

        public Criteria andCompanylagohomepageurlLessThan(String value) {
            addCriterion("companyLagoHomePageURL <", value, "companylagohomepageurl");
            return (Criteria) this;
        }

        public Criteria andCompanylagohomepageurlLessThanOrEqualTo(String value) {
            addCriterion("companyLagoHomePageURL <=", value, "companylagohomepageurl");
            return (Criteria) this;
        }

        public Criteria andCompanylagohomepageurlLike(String value) {
            addCriterion("companyLagoHomePageURL like", value, "companylagohomepageurl");
            return (Criteria) this;
        }

        public Criteria andCompanylagohomepageurlNotLike(String value) {
            addCriterion("companyLagoHomePageURL not like", value, "companylagohomepageurl");
            return (Criteria) this;
        }

        public Criteria andCompanylagohomepageurlIn(List<String> values) {
            addCriterion("companyLagoHomePageURL in", values, "companylagohomepageurl");
            return (Criteria) this;
        }

        public Criteria andCompanylagohomepageurlNotIn(List<String> values) {
            addCriterion("companyLagoHomePageURL not in", values, "companylagohomepageurl");
            return (Criteria) this;
        }

        public Criteria andCompanylagohomepageurlBetween(String value1, String value2) {
            addCriterion("companyLagoHomePageURL between", value1, value2, "companylagohomepageurl");
            return (Criteria) this;
        }

        public Criteria andCompanylagohomepageurlNotBetween(String value1, String value2) {
            addCriterion("companyLagoHomePageURL not between", value1, value2, "companylagohomepageurl");
            return (Criteria) this;
        }

        public Criteria andCompanyiconurlIsNull() {
            addCriterion("companyIconURL is null");
            return (Criteria) this;
        }

        public Criteria andCompanyiconurlIsNotNull() {
            addCriterion("companyIconURL is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyiconurlEqualTo(String value) {
            addCriterion("companyIconURL =", value, "companyiconurl");
            return (Criteria) this;
        }

        public Criteria andCompanyiconurlNotEqualTo(String value) {
            addCriterion("companyIconURL <>", value, "companyiconurl");
            return (Criteria) this;
        }

        public Criteria andCompanyiconurlGreaterThan(String value) {
            addCriterion("companyIconURL >", value, "companyiconurl");
            return (Criteria) this;
        }

        public Criteria andCompanyiconurlGreaterThanOrEqualTo(String value) {
            addCriterion("companyIconURL >=", value, "companyiconurl");
            return (Criteria) this;
        }

        public Criteria andCompanyiconurlLessThan(String value) {
            addCriterion("companyIconURL <", value, "companyiconurl");
            return (Criteria) this;
        }

        public Criteria andCompanyiconurlLessThanOrEqualTo(String value) {
            addCriterion("companyIconURL <=", value, "companyiconurl");
            return (Criteria) this;
        }

        public Criteria andCompanyiconurlLike(String value) {
            addCriterion("companyIconURL like", value, "companyiconurl");
            return (Criteria) this;
        }

        public Criteria andCompanyiconurlNotLike(String value) {
            addCriterion("companyIconURL not like", value, "companyiconurl");
            return (Criteria) this;
        }

        public Criteria andCompanyiconurlIn(List<String> values) {
            addCriterion("companyIconURL in", values, "companyiconurl");
            return (Criteria) this;
        }

        public Criteria andCompanyiconurlNotIn(List<String> values) {
            addCriterion("companyIconURL not in", values, "companyiconurl");
            return (Criteria) this;
        }

        public Criteria andCompanyiconurlBetween(String value1, String value2) {
            addCriterion("companyIconURL between", value1, value2, "companyiconurl");
            return (Criteria) this;
        }

        public Criteria andCompanyiconurlNotBetween(String value1, String value2) {
            addCriterion("companyIconURL not between", value1, value2, "companyiconurl");
            return (Criteria) this;
        }

        public Criteria andCompanyfeildIsNull() {
            addCriterion("companyFeild is null");
            return (Criteria) this;
        }

        public Criteria andCompanyfeildIsNotNull() {
            addCriterion("companyFeild is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyfeildEqualTo(String value) {
            addCriterion("companyFeild =", value, "companyfeild");
            return (Criteria) this;
        }

        public Criteria andCompanyfeildNotEqualTo(String value) {
            addCriterion("companyFeild <>", value, "companyfeild");
            return (Criteria) this;
        }

        public Criteria andCompanyfeildGreaterThan(String value) {
            addCriterion("companyFeild >", value, "companyfeild");
            return (Criteria) this;
        }

        public Criteria andCompanyfeildGreaterThanOrEqualTo(String value) {
            addCriterion("companyFeild >=", value, "companyfeild");
            return (Criteria) this;
        }

        public Criteria andCompanyfeildLessThan(String value) {
            addCriterion("companyFeild <", value, "companyfeild");
            return (Criteria) this;
        }

        public Criteria andCompanyfeildLessThanOrEqualTo(String value) {
            addCriterion("companyFeild <=", value, "companyfeild");
            return (Criteria) this;
        }

        public Criteria andCompanyfeildLike(String value) {
            addCriterion("companyFeild like", value, "companyfeild");
            return (Criteria) this;
        }

        public Criteria andCompanyfeildNotLike(String value) {
            addCriterion("companyFeild not like", value, "companyfeild");
            return (Criteria) this;
        }

        public Criteria andCompanyfeildIn(List<String> values) {
            addCriterion("companyFeild in", values, "companyfeild");
            return (Criteria) this;
        }

        public Criteria andCompanyfeildNotIn(List<String> values) {
            addCriterion("companyFeild not in", values, "companyfeild");
            return (Criteria) this;
        }

        public Criteria andCompanyfeildBetween(String value1, String value2) {
            addCriterion("companyFeild between", value1, value2, "companyfeild");
            return (Criteria) this;
        }

        public Criteria andCompanyfeildNotBetween(String value1, String value2) {
            addCriterion("companyFeild not between", value1, value2, "companyfeild");
            return (Criteria) this;
        }

        public Criteria andCompanyscaleIsNull() {
            addCriterion("companyScale is null");
            return (Criteria) this;
        }

        public Criteria andCompanyscaleIsNotNull() {
            addCriterion("companyScale is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyscaleEqualTo(String value) {
            addCriterion("companyScale =", value, "companyscale");
            return (Criteria) this;
        }

        public Criteria andCompanyscaleNotEqualTo(String value) {
            addCriterion("companyScale <>", value, "companyscale");
            return (Criteria) this;
        }

        public Criteria andCompanyscaleGreaterThan(String value) {
            addCriterion("companyScale >", value, "companyscale");
            return (Criteria) this;
        }

        public Criteria andCompanyscaleGreaterThanOrEqualTo(String value) {
            addCriterion("companyScale >=", value, "companyscale");
            return (Criteria) this;
        }

        public Criteria andCompanyscaleLessThan(String value) {
            addCriterion("companyScale <", value, "companyscale");
            return (Criteria) this;
        }

        public Criteria andCompanyscaleLessThanOrEqualTo(String value) {
            addCriterion("companyScale <=", value, "companyscale");
            return (Criteria) this;
        }

        public Criteria andCompanyscaleLike(String value) {
            addCriterion("companyScale like", value, "companyscale");
            return (Criteria) this;
        }

        public Criteria andCompanyscaleNotLike(String value) {
            addCriterion("companyScale not like", value, "companyscale");
            return (Criteria) this;
        }

        public Criteria andCompanyscaleIn(List<String> values) {
            addCriterion("companyScale in", values, "companyscale");
            return (Criteria) this;
        }

        public Criteria andCompanyscaleNotIn(List<String> values) {
            addCriterion("companyScale not in", values, "companyscale");
            return (Criteria) this;
        }

        public Criteria andCompanyscaleBetween(String value1, String value2) {
            addCriterion("companyScale between", value1, value2, "companyscale");
            return (Criteria) this;
        }

        public Criteria andCompanyscaleNotBetween(String value1, String value2) {
            addCriterion("companyScale not between", value1, value2, "companyscale");
            return (Criteria) this;
        }

        public Criteria andCompanyhomepageurlIsNull() {
            addCriterion("companyHomePageURL is null");
            return (Criteria) this;
        }

        public Criteria andCompanyhomepageurlIsNotNull() {
            addCriterion("companyHomePageURL is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyhomepageurlEqualTo(String value) {
            addCriterion("companyHomePageURL =", value, "companyhomepageurl");
            return (Criteria) this;
        }

        public Criteria andCompanyhomepageurlNotEqualTo(String value) {
            addCriterion("companyHomePageURL <>", value, "companyhomepageurl");
            return (Criteria) this;
        }

        public Criteria andCompanyhomepageurlGreaterThan(String value) {
            addCriterion("companyHomePageURL >", value, "companyhomepageurl");
            return (Criteria) this;
        }

        public Criteria andCompanyhomepageurlGreaterThanOrEqualTo(String value) {
            addCriterion("companyHomePageURL >=", value, "companyhomepageurl");
            return (Criteria) this;
        }

        public Criteria andCompanyhomepageurlLessThan(String value) {
            addCriterion("companyHomePageURL <", value, "companyhomepageurl");
            return (Criteria) this;
        }

        public Criteria andCompanyhomepageurlLessThanOrEqualTo(String value) {
            addCriterion("companyHomePageURL <=", value, "companyhomepageurl");
            return (Criteria) this;
        }

        public Criteria andCompanyhomepageurlLike(String value) {
            addCriterion("companyHomePageURL like", value, "companyhomepageurl");
            return (Criteria) this;
        }

        public Criteria andCompanyhomepageurlNotLike(String value) {
            addCriterion("companyHomePageURL not like", value, "companyhomepageurl");
            return (Criteria) this;
        }

        public Criteria andCompanyhomepageurlIn(List<String> values) {
            addCriterion("companyHomePageURL in", values, "companyhomepageurl");
            return (Criteria) this;
        }

        public Criteria andCompanyhomepageurlNotIn(List<String> values) {
            addCriterion("companyHomePageURL not in", values, "companyhomepageurl");
            return (Criteria) this;
        }

        public Criteria andCompanyhomepageurlBetween(String value1, String value2) {
            addCriterion("companyHomePageURL between", value1, value2, "companyhomepageurl");
            return (Criteria) this;
        }

        public Criteria andCompanyhomepageurlNotBetween(String value1, String value2) {
            addCriterion("companyHomePageURL not between", value1, value2, "companyhomepageurl");
            return (Criteria) this;
        }

        public Criteria andCompanydevelopestageIsNull() {
            addCriterion("companyDevelopeStage is null");
            return (Criteria) this;
        }

        public Criteria andCompanydevelopestageIsNotNull() {
            addCriterion("companyDevelopeStage is not null");
            return (Criteria) this;
        }

        public Criteria andCompanydevelopestageEqualTo(String value) {
            addCriterion("companyDevelopeStage =", value, "companydevelopestage");
            return (Criteria) this;
        }

        public Criteria andCompanydevelopestageNotEqualTo(String value) {
            addCriterion("companyDevelopeStage <>", value, "companydevelopestage");
            return (Criteria) this;
        }

        public Criteria andCompanydevelopestageGreaterThan(String value) {
            addCriterion("companyDevelopeStage >", value, "companydevelopestage");
            return (Criteria) this;
        }

        public Criteria andCompanydevelopestageGreaterThanOrEqualTo(String value) {
            addCriterion("companyDevelopeStage >=", value, "companydevelopestage");
            return (Criteria) this;
        }

        public Criteria andCompanydevelopestageLessThan(String value) {
            addCriterion("companyDevelopeStage <", value, "companydevelopestage");
            return (Criteria) this;
        }

        public Criteria andCompanydevelopestageLessThanOrEqualTo(String value) {
            addCriterion("companyDevelopeStage <=", value, "companydevelopestage");
            return (Criteria) this;
        }

        public Criteria andCompanydevelopestageLike(String value) {
            addCriterion("companyDevelopeStage like", value, "companydevelopestage");
            return (Criteria) this;
        }

        public Criteria andCompanydevelopestageNotLike(String value) {
            addCriterion("companyDevelopeStage not like", value, "companydevelopestage");
            return (Criteria) this;
        }

        public Criteria andCompanydevelopestageIn(List<String> values) {
            addCriterion("companyDevelopeStage in", values, "companydevelopestage");
            return (Criteria) this;
        }

        public Criteria andCompanydevelopestageNotIn(List<String> values) {
            addCriterion("companyDevelopeStage not in", values, "companydevelopestage");
            return (Criteria) this;
        }

        public Criteria andCompanydevelopestageBetween(String value1, String value2) {
            addCriterion("companyDevelopeStage between", value1, value2, "companydevelopestage");
            return (Criteria) this;
        }

        public Criteria andCompanydevelopestageNotBetween(String value1, String value2) {
            addCriterion("companyDevelopeStage not between", value1, value2, "companydevelopestage");
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