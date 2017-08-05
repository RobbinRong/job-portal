package com.buu.job.domain;

import java.util.ArrayList;
import java.util.List;

public class JobListExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public JobListExample() {
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

        public Criteria andCompanyidIsNull() {
            addCriterion("companyId is null");
            return (Criteria) this;
        }

        public Criteria andCompanyidIsNotNull() {
            addCriterion("companyId is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyidEqualTo(Integer value) {
            addCriterion("companyId =", value, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidNotEqualTo(Integer value) {
            addCriterion("companyId <>", value, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidGreaterThan(Integer value) {
            addCriterion("companyId >", value, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidGreaterThanOrEqualTo(Integer value) {
            addCriterion("companyId >=", value, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidLessThan(Integer value) {
            addCriterion("companyId <", value, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidLessThanOrEqualTo(Integer value) {
            addCriterion("companyId <=", value, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidIn(List<Integer> values) {
            addCriterion("companyId in", values, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidNotIn(List<Integer> values) {
            addCriterion("companyId not in", values, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidBetween(Integer value1, Integer value2) {
            addCriterion("companyId between", value1, value2, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidNotBetween(Integer value1, Integer value2) {
            addCriterion("companyId not between", value1, value2, "companyid");
            return (Criteria) this;
        }

        public Criteria andScoreIsNull() {
            addCriterion("score is null");
            return (Criteria) this;
        }

        public Criteria andScoreIsNotNull() {
            addCriterion("score is not null");
            return (Criteria) this;
        }

        public Criteria andScoreEqualTo(Integer value) {
            addCriterion("score =", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotEqualTo(Integer value) {
            addCriterion("score <>", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThan(Integer value) {
            addCriterion("score >", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("score >=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThan(Integer value) {
            addCriterion("score <", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThanOrEqualTo(Integer value) {
            addCriterion("score <=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreIn(List<Integer> values) {
            addCriterion("score in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotIn(List<Integer> values) {
            addCriterion("score not in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreBetween(Integer value1, Integer value2) {
            addCriterion("score between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("score not between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andPositionnameIsNull() {
            addCriterion("positionName is null");
            return (Criteria) this;
        }

        public Criteria andPositionnameIsNotNull() {
            addCriterion("positionName is not null");
            return (Criteria) this;
        }

        public Criteria andPositionnameEqualTo(String value) {
            addCriterion("positionName =", value, "positionname");
            return (Criteria) this;
        }

        public Criteria andPositionnameNotEqualTo(String value) {
            addCriterion("positionName <>", value, "positionname");
            return (Criteria) this;
        }

        public Criteria andPositionnameGreaterThan(String value) {
            addCriterion("positionName >", value, "positionname");
            return (Criteria) this;
        }

        public Criteria andPositionnameGreaterThanOrEqualTo(String value) {
            addCriterion("positionName >=", value, "positionname");
            return (Criteria) this;
        }

        public Criteria andPositionnameLessThan(String value) {
            addCriterion("positionName <", value, "positionname");
            return (Criteria) this;
        }

        public Criteria andPositionnameLessThanOrEqualTo(String value) {
            addCriterion("positionName <=", value, "positionname");
            return (Criteria) this;
        }

        public Criteria andPositionnameLike(String value) {
            addCriterion("positionName like", value, "positionname");
            return (Criteria) this;
        }

        public Criteria andPositionnameNotLike(String value) {
            addCriterion("positionName not like", value, "positionname");
            return (Criteria) this;
        }

        public Criteria andPositionnameIn(List<String> values) {
            addCriterion("positionName in", values, "positionname");
            return (Criteria) this;
        }

        public Criteria andPositionnameNotIn(List<String> values) {
            addCriterion("positionName not in", values, "positionname");
            return (Criteria) this;
        }

        public Criteria andPositionnameBetween(String value1, String value2) {
            addCriterion("positionName between", value1, value2, "positionname");
            return (Criteria) this;
        }

        public Criteria andPositionnameNotBetween(String value1, String value2) {
            addCriterion("positionName not between", value1, value2, "positionname");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("createTime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("createTime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(String value) {
            addCriterion("createTime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(String value) {
            addCriterion("createTime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(String value) {
            addCriterion("createTime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(String value) {
            addCriterion("createTime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(String value) {
            addCriterion("createTime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(String value) {
            addCriterion("createTime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLike(String value) {
            addCriterion("createTime like", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotLike(String value) {
            addCriterion("createTime not like", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<String> values) {
            addCriterion("createTime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<String> values) {
            addCriterion("createTime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(String value1, String value2) {
            addCriterion("createTime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(String value1, String value2) {
            addCriterion("createTime not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andJobnatureIsNull() {
            addCriterion("jobNature is null");
            return (Criteria) this;
        }

        public Criteria andJobnatureIsNotNull() {
            addCriterion("jobNature is not null");
            return (Criteria) this;
        }

        public Criteria andJobnatureEqualTo(String value) {
            addCriterion("jobNature =", value, "jobnature");
            return (Criteria) this;
        }

        public Criteria andJobnatureNotEqualTo(String value) {
            addCriterion("jobNature <>", value, "jobnature");
            return (Criteria) this;
        }

        public Criteria andJobnatureGreaterThan(String value) {
            addCriterion("jobNature >", value, "jobnature");
            return (Criteria) this;
        }

        public Criteria andJobnatureGreaterThanOrEqualTo(String value) {
            addCriterion("jobNature >=", value, "jobnature");
            return (Criteria) this;
        }

        public Criteria andJobnatureLessThan(String value) {
            addCriterion("jobNature <", value, "jobnature");
            return (Criteria) this;
        }

        public Criteria andJobnatureLessThanOrEqualTo(String value) {
            addCriterion("jobNature <=", value, "jobnature");
            return (Criteria) this;
        }

        public Criteria andJobnatureLike(String value) {
            addCriterion("jobNature like", value, "jobnature");
            return (Criteria) this;
        }

        public Criteria andJobnatureNotLike(String value) {
            addCriterion("jobNature not like", value, "jobnature");
            return (Criteria) this;
        }

        public Criteria andJobnatureIn(List<String> values) {
            addCriterion("jobNature in", values, "jobnature");
            return (Criteria) this;
        }

        public Criteria andJobnatureNotIn(List<String> values) {
            addCriterion("jobNature not in", values, "jobnature");
            return (Criteria) this;
        }

        public Criteria andJobnatureBetween(String value1, String value2) {
            addCriterion("jobNature between", value1, value2, "jobnature");
            return (Criteria) this;
        }

        public Criteria andJobnatureNotBetween(String value1, String value2) {
            addCriterion("jobNature not between", value1, value2, "jobnature");
            return (Criteria) this;
        }

        public Criteria andWorkyearIsNull() {
            addCriterion("workYear is null");
            return (Criteria) this;
        }

        public Criteria andWorkyearIsNotNull() {
            addCriterion("workYear is not null");
            return (Criteria) this;
        }

        public Criteria andWorkyearEqualTo(String value) {
            addCriterion("workYear =", value, "workyear");
            return (Criteria) this;
        }

        public Criteria andWorkyearNotEqualTo(String value) {
            addCriterion("workYear <>", value, "workyear");
            return (Criteria) this;
        }

        public Criteria andWorkyearGreaterThan(String value) {
            addCriterion("workYear >", value, "workyear");
            return (Criteria) this;
        }

        public Criteria andWorkyearGreaterThanOrEqualTo(String value) {
            addCriterion("workYear >=", value, "workyear");
            return (Criteria) this;
        }

        public Criteria andWorkyearLessThan(String value) {
            addCriterion("workYear <", value, "workyear");
            return (Criteria) this;
        }

        public Criteria andWorkyearLessThanOrEqualTo(String value) {
            addCriterion("workYear <=", value, "workyear");
            return (Criteria) this;
        }

        public Criteria andWorkyearLike(String value) {
            addCriterion("workYear like", value, "workyear");
            return (Criteria) this;
        }

        public Criteria andWorkyearNotLike(String value) {
            addCriterion("workYear not like", value, "workyear");
            return (Criteria) this;
        }

        public Criteria andWorkyearIn(List<String> values) {
            addCriterion("workYear in", values, "workyear");
            return (Criteria) this;
        }

        public Criteria andWorkyearNotIn(List<String> values) {
            addCriterion("workYear not in", values, "workyear");
            return (Criteria) this;
        }

        public Criteria andWorkyearBetween(String value1, String value2) {
            addCriterion("workYear between", value1, value2, "workyear");
            return (Criteria) this;
        }

        public Criteria andWorkyearNotBetween(String value1, String value2) {
            addCriterion("workYear not between", value1, value2, "workyear");
            return (Criteria) this;
        }

        public Criteria andEducationIsNull() {
            addCriterion("education is null");
            return (Criteria) this;
        }

        public Criteria andEducationIsNotNull() {
            addCriterion("education is not null");
            return (Criteria) this;
        }

        public Criteria andEducationEqualTo(String value) {
            addCriterion("education =", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotEqualTo(String value) {
            addCriterion("education <>", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationGreaterThan(String value) {
            addCriterion("education >", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationGreaterThanOrEqualTo(String value) {
            addCriterion("education >=", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationLessThan(String value) {
            addCriterion("education <", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationLessThanOrEqualTo(String value) {
            addCriterion("education <=", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationLike(String value) {
            addCriterion("education like", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotLike(String value) {
            addCriterion("education not like", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationIn(List<String> values) {
            addCriterion("education in", values, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotIn(List<String> values) {
            addCriterion("education not in", values, "education");
            return (Criteria) this;
        }

        public Criteria andEducationBetween(String value1, String value2) {
            addCriterion("education between", value1, value2, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotBetween(String value1, String value2) {
            addCriterion("education not between", value1, value2, "education");
            return (Criteria) this;
        }

        public Criteria andCityIsNull() {
            addCriterion("city is null");
            return (Criteria) this;
        }

        public Criteria andCityIsNotNull() {
            addCriterion("city is not null");
            return (Criteria) this;
        }

        public Criteria andCityEqualTo(String value) {
            addCriterion("city =", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotEqualTo(String value) {
            addCriterion("city <>", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThan(String value) {
            addCriterion("city >", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThanOrEqualTo(String value) {
            addCriterion("city >=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThan(String value) {
            addCriterion("city <", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThanOrEqualTo(String value) {
            addCriterion("city <=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLike(String value) {
            addCriterion("city like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotLike(String value) {
            addCriterion("city not like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityIn(List<String> values) {
            addCriterion("city in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotIn(List<String> values) {
            addCriterion("city not in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityBetween(String value1, String value2) {
            addCriterion("city between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotBetween(String value1, String value2) {
            addCriterion("city not between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCompanylogoIsNull() {
            addCriterion("companyLogo is null");
            return (Criteria) this;
        }

        public Criteria andCompanylogoIsNotNull() {
            addCriterion("companyLogo is not null");
            return (Criteria) this;
        }

        public Criteria andCompanylogoEqualTo(String value) {
            addCriterion("companyLogo =", value, "companylogo");
            return (Criteria) this;
        }

        public Criteria andCompanylogoNotEqualTo(String value) {
            addCriterion("companyLogo <>", value, "companylogo");
            return (Criteria) this;
        }

        public Criteria andCompanylogoGreaterThan(String value) {
            addCriterion("companyLogo >", value, "companylogo");
            return (Criteria) this;
        }

        public Criteria andCompanylogoGreaterThanOrEqualTo(String value) {
            addCriterion("companyLogo >=", value, "companylogo");
            return (Criteria) this;
        }

        public Criteria andCompanylogoLessThan(String value) {
            addCriterion("companyLogo <", value, "companylogo");
            return (Criteria) this;
        }

        public Criteria andCompanylogoLessThanOrEqualTo(String value) {
            addCriterion("companyLogo <=", value, "companylogo");
            return (Criteria) this;
        }

        public Criteria andCompanylogoLike(String value) {
            addCriterion("companyLogo like", value, "companylogo");
            return (Criteria) this;
        }

        public Criteria andCompanylogoNotLike(String value) {
            addCriterion("companyLogo not like", value, "companylogo");
            return (Criteria) this;
        }

        public Criteria andCompanylogoIn(List<String> values) {
            addCriterion("companyLogo in", values, "companylogo");
            return (Criteria) this;
        }

        public Criteria andCompanylogoNotIn(List<String> values) {
            addCriterion("companyLogo not in", values, "companylogo");
            return (Criteria) this;
        }

        public Criteria andCompanylogoBetween(String value1, String value2) {
            addCriterion("companyLogo between", value1, value2, "companylogo");
            return (Criteria) this;
        }

        public Criteria andCompanylogoNotBetween(String value1, String value2) {
            addCriterion("companyLogo not between", value1, value2, "companylogo");
            return (Criteria) this;
        }

        public Criteria andPositionadvantageIsNull() {
            addCriterion("positionAdvantage is null");
            return (Criteria) this;
        }

        public Criteria andPositionadvantageIsNotNull() {
            addCriterion("positionAdvantage is not null");
            return (Criteria) this;
        }

        public Criteria andPositionadvantageEqualTo(String value) {
            addCriterion("positionAdvantage =", value, "positionadvantage");
            return (Criteria) this;
        }

        public Criteria andPositionadvantageNotEqualTo(String value) {
            addCriterion("positionAdvantage <>", value, "positionadvantage");
            return (Criteria) this;
        }

        public Criteria andPositionadvantageGreaterThan(String value) {
            addCriterion("positionAdvantage >", value, "positionadvantage");
            return (Criteria) this;
        }

        public Criteria andPositionadvantageGreaterThanOrEqualTo(String value) {
            addCriterion("positionAdvantage >=", value, "positionadvantage");
            return (Criteria) this;
        }

        public Criteria andPositionadvantageLessThan(String value) {
            addCriterion("positionAdvantage <", value, "positionadvantage");
            return (Criteria) this;
        }

        public Criteria andPositionadvantageLessThanOrEqualTo(String value) {
            addCriterion("positionAdvantage <=", value, "positionadvantage");
            return (Criteria) this;
        }

        public Criteria andPositionadvantageLike(String value) {
            addCriterion("positionAdvantage like", value, "positionadvantage");
            return (Criteria) this;
        }

        public Criteria andPositionadvantageNotLike(String value) {
            addCriterion("positionAdvantage not like", value, "positionadvantage");
            return (Criteria) this;
        }

        public Criteria andPositionadvantageIn(List<String> values) {
            addCriterion("positionAdvantage in", values, "positionadvantage");
            return (Criteria) this;
        }

        public Criteria andPositionadvantageNotIn(List<String> values) {
            addCriterion("positionAdvantage not in", values, "positionadvantage");
            return (Criteria) this;
        }

        public Criteria andPositionadvantageBetween(String value1, String value2) {
            addCriterion("positionAdvantage between", value1, value2, "positionadvantage");
            return (Criteria) this;
        }

        public Criteria andPositionadvantageNotBetween(String value1, String value2) {
            addCriterion("positionAdvantage not between", value1, value2, "positionadvantage");
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

        public Criteria andApproveIsNull() {
            addCriterion("approve is null");
            return (Criteria) this;
        }

        public Criteria andApproveIsNotNull() {
            addCriterion("approve is not null");
            return (Criteria) this;
        }

        public Criteria andApproveEqualTo(Integer value) {
            addCriterion("approve =", value, "approve");
            return (Criteria) this;
        }

        public Criteria andApproveNotEqualTo(Integer value) {
            addCriterion("approve <>", value, "approve");
            return (Criteria) this;
        }

        public Criteria andApproveGreaterThan(Integer value) {
            addCriterion("approve >", value, "approve");
            return (Criteria) this;
        }

        public Criteria andApproveGreaterThanOrEqualTo(Integer value) {
            addCriterion("approve >=", value, "approve");
            return (Criteria) this;
        }

        public Criteria andApproveLessThan(Integer value) {
            addCriterion("approve <", value, "approve");
            return (Criteria) this;
        }

        public Criteria andApproveLessThanOrEqualTo(Integer value) {
            addCriterion("approve <=", value, "approve");
            return (Criteria) this;
        }

        public Criteria andApproveIn(List<Integer> values) {
            addCriterion("approve in", values, "approve");
            return (Criteria) this;
        }

        public Criteria andApproveNotIn(List<Integer> values) {
            addCriterion("approve not in", values, "approve");
            return (Criteria) this;
        }

        public Criteria andApproveBetween(Integer value1, Integer value2) {
            addCriterion("approve between", value1, value2, "approve");
            return (Criteria) this;
        }

        public Criteria andApproveNotBetween(Integer value1, Integer value2) {
            addCriterion("approve not between", value1, value2, "approve");
            return (Criteria) this;
        }

        public Criteria andIndustryfieldIsNull() {
            addCriterion("industryField is null");
            return (Criteria) this;
        }

        public Criteria andIndustryfieldIsNotNull() {
            addCriterion("industryField is not null");
            return (Criteria) this;
        }

        public Criteria andIndustryfieldEqualTo(String value) {
            addCriterion("industryField =", value, "industryfield");
            return (Criteria) this;
        }

        public Criteria andIndustryfieldNotEqualTo(String value) {
            addCriterion("industryField <>", value, "industryfield");
            return (Criteria) this;
        }

        public Criteria andIndustryfieldGreaterThan(String value) {
            addCriterion("industryField >", value, "industryfield");
            return (Criteria) this;
        }

        public Criteria andIndustryfieldGreaterThanOrEqualTo(String value) {
            addCriterion("industryField >=", value, "industryfield");
            return (Criteria) this;
        }

        public Criteria andIndustryfieldLessThan(String value) {
            addCriterion("industryField <", value, "industryfield");
            return (Criteria) this;
        }

        public Criteria andIndustryfieldLessThanOrEqualTo(String value) {
            addCriterion("industryField <=", value, "industryfield");
            return (Criteria) this;
        }

        public Criteria andIndustryfieldLike(String value) {
            addCriterion("industryField like", value, "industryfield");
            return (Criteria) this;
        }

        public Criteria andIndustryfieldNotLike(String value) {
            addCriterion("industryField not like", value, "industryfield");
            return (Criteria) this;
        }

        public Criteria andIndustryfieldIn(List<String> values) {
            addCriterion("industryField in", values, "industryfield");
            return (Criteria) this;
        }

        public Criteria andIndustryfieldNotIn(List<String> values) {
            addCriterion("industryField not in", values, "industryfield");
            return (Criteria) this;
        }

        public Criteria andIndustryfieldBetween(String value1, String value2) {
            addCriterion("industryField between", value1, value2, "industryfield");
            return (Criteria) this;
        }

        public Criteria andIndustryfieldNotBetween(String value1, String value2) {
            addCriterion("industryField not between", value1, value2, "industryfield");
            return (Criteria) this;
        }

        public Criteria andCompanyshortnameIsNull() {
            addCriterion("companyShortName is null");
            return (Criteria) this;
        }

        public Criteria andCompanyshortnameIsNotNull() {
            addCriterion("companyShortName is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyshortnameEqualTo(String value) {
            addCriterion("companyShortName =", value, "companyshortname");
            return (Criteria) this;
        }

        public Criteria andCompanyshortnameNotEqualTo(String value) {
            addCriterion("companyShortName <>", value, "companyshortname");
            return (Criteria) this;
        }

        public Criteria andCompanyshortnameGreaterThan(String value) {
            addCriterion("companyShortName >", value, "companyshortname");
            return (Criteria) this;
        }

        public Criteria andCompanyshortnameGreaterThanOrEqualTo(String value) {
            addCriterion("companyShortName >=", value, "companyshortname");
            return (Criteria) this;
        }

        public Criteria andCompanyshortnameLessThan(String value) {
            addCriterion("companyShortName <", value, "companyshortname");
            return (Criteria) this;
        }

        public Criteria andCompanyshortnameLessThanOrEqualTo(String value) {
            addCriterion("companyShortName <=", value, "companyshortname");
            return (Criteria) this;
        }

        public Criteria andCompanyshortnameLike(String value) {
            addCriterion("companyShortName like", value, "companyshortname");
            return (Criteria) this;
        }

        public Criteria andCompanyshortnameNotLike(String value) {
            addCriterion("companyShortName not like", value, "companyshortname");
            return (Criteria) this;
        }

        public Criteria andCompanyshortnameIn(List<String> values) {
            addCriterion("companyShortName in", values, "companyshortname");
            return (Criteria) this;
        }

        public Criteria andCompanyshortnameNotIn(List<String> values) {
            addCriterion("companyShortName not in", values, "companyshortname");
            return (Criteria) this;
        }

        public Criteria andCompanyshortnameBetween(String value1, String value2) {
            addCriterion("companyShortName between", value1, value2, "companyshortname");
            return (Criteria) this;
        }

        public Criteria andCompanyshortnameNotBetween(String value1, String value2) {
            addCriterion("companyShortName not between", value1, value2, "companyshortname");
            return (Criteria) this;
        }

        public Criteria andFinancestageIsNull() {
            addCriterion("financeStage is null");
            return (Criteria) this;
        }

        public Criteria andFinancestageIsNotNull() {
            addCriterion("financeStage is not null");
            return (Criteria) this;
        }

        public Criteria andFinancestageEqualTo(String value) {
            addCriterion("financeStage =", value, "financestage");
            return (Criteria) this;
        }

        public Criteria andFinancestageNotEqualTo(String value) {
            addCriterion("financeStage <>", value, "financestage");
            return (Criteria) this;
        }

        public Criteria andFinancestageGreaterThan(String value) {
            addCriterion("financeStage >", value, "financestage");
            return (Criteria) this;
        }

        public Criteria andFinancestageGreaterThanOrEqualTo(String value) {
            addCriterion("financeStage >=", value, "financestage");
            return (Criteria) this;
        }

        public Criteria andFinancestageLessThan(String value) {
            addCriterion("financeStage <", value, "financestage");
            return (Criteria) this;
        }

        public Criteria andFinancestageLessThanOrEqualTo(String value) {
            addCriterion("financeStage <=", value, "financestage");
            return (Criteria) this;
        }

        public Criteria andFinancestageLike(String value) {
            addCriterion("financeStage like", value, "financestage");
            return (Criteria) this;
        }

        public Criteria andFinancestageNotLike(String value) {
            addCriterion("financeStage not like", value, "financestage");
            return (Criteria) this;
        }

        public Criteria andFinancestageIn(List<String> values) {
            addCriterion("financeStage in", values, "financestage");
            return (Criteria) this;
        }

        public Criteria andFinancestageNotIn(List<String> values) {
            addCriterion("financeStage not in", values, "financestage");
            return (Criteria) this;
        }

        public Criteria andFinancestageBetween(String value1, String value2) {
            addCriterion("financeStage between", value1, value2, "financestage");
            return (Criteria) this;
        }

        public Criteria andFinancestageNotBetween(String value1, String value2) {
            addCriterion("financeStage not between", value1, value2, "financestage");
            return (Criteria) this;
        }

        public Criteria andCompanysizeIsNull() {
            addCriterion("companySize is null");
            return (Criteria) this;
        }

        public Criteria andCompanysizeIsNotNull() {
            addCriterion("companySize is not null");
            return (Criteria) this;
        }

        public Criteria andCompanysizeEqualTo(String value) {
            addCriterion("companySize =", value, "companysize");
            return (Criteria) this;
        }

        public Criteria andCompanysizeNotEqualTo(String value) {
            addCriterion("companySize <>", value, "companysize");
            return (Criteria) this;
        }

        public Criteria andCompanysizeGreaterThan(String value) {
            addCriterion("companySize >", value, "companysize");
            return (Criteria) this;
        }

        public Criteria andCompanysizeGreaterThanOrEqualTo(String value) {
            addCriterion("companySize >=", value, "companysize");
            return (Criteria) this;
        }

        public Criteria andCompanysizeLessThan(String value) {
            addCriterion("companySize <", value, "companysize");
            return (Criteria) this;
        }

        public Criteria andCompanysizeLessThanOrEqualTo(String value) {
            addCriterion("companySize <=", value, "companysize");
            return (Criteria) this;
        }

        public Criteria andCompanysizeLike(String value) {
            addCriterion("companySize like", value, "companysize");
            return (Criteria) this;
        }

        public Criteria andCompanysizeNotLike(String value) {
            addCriterion("companySize not like", value, "companysize");
            return (Criteria) this;
        }

        public Criteria andCompanysizeIn(List<String> values) {
            addCriterion("companySize in", values, "companysize");
            return (Criteria) this;
        }

        public Criteria andCompanysizeNotIn(List<String> values) {
            addCriterion("companySize not in", values, "companysize");
            return (Criteria) this;
        }

        public Criteria andCompanysizeBetween(String value1, String value2) {
            addCriterion("companySize between", value1, value2, "companysize");
            return (Criteria) this;
        }

        public Criteria andCompanysizeNotBetween(String value1, String value2) {
            addCriterion("companySize not between", value1, value2, "companysize");
            return (Criteria) this;
        }

        public Criteria andCompanylabellistIsNull() {
            addCriterion("companyLabelList is null");
            return (Criteria) this;
        }

        public Criteria andCompanylabellistIsNotNull() {
            addCriterion("companyLabelList is not null");
            return (Criteria) this;
        }

        public Criteria andCompanylabellistEqualTo(String value) {
            addCriterion("companyLabelList =", value, "companylabellist");
            return (Criteria) this;
        }

        public Criteria andCompanylabellistNotEqualTo(String value) {
            addCriterion("companyLabelList <>", value, "companylabellist");
            return (Criteria) this;
        }

        public Criteria andCompanylabellistGreaterThan(String value) {
            addCriterion("companyLabelList >", value, "companylabellist");
            return (Criteria) this;
        }

        public Criteria andCompanylabellistGreaterThanOrEqualTo(String value) {
            addCriterion("companyLabelList >=", value, "companylabellist");
            return (Criteria) this;
        }

        public Criteria andCompanylabellistLessThan(String value) {
            addCriterion("companyLabelList <", value, "companylabellist");
            return (Criteria) this;
        }

        public Criteria andCompanylabellistLessThanOrEqualTo(String value) {
            addCriterion("companyLabelList <=", value, "companylabellist");
            return (Criteria) this;
        }

        public Criteria andCompanylabellistLike(String value) {
            addCriterion("companyLabelList like", value, "companylabellist");
            return (Criteria) this;
        }

        public Criteria andCompanylabellistNotLike(String value) {
            addCriterion("companyLabelList not like", value, "companylabellist");
            return (Criteria) this;
        }

        public Criteria andCompanylabellistIn(List<String> values) {
            addCriterion("companyLabelList in", values, "companylabellist");
            return (Criteria) this;
        }

        public Criteria andCompanylabellistNotIn(List<String> values) {
            addCriterion("companyLabelList not in", values, "companylabellist");
            return (Criteria) this;
        }

        public Criteria andCompanylabellistBetween(String value1, String value2) {
            addCriterion("companyLabelList between", value1, value2, "companylabellist");
            return (Criteria) this;
        }

        public Criteria andCompanylabellistNotBetween(String value1, String value2) {
            addCriterion("companyLabelList not between", value1, value2, "companylabellist");
            return (Criteria) this;
        }

        public Criteria andDistrictIsNull() {
            addCriterion("district is null");
            return (Criteria) this;
        }

        public Criteria andDistrictIsNotNull() {
            addCriterion("district is not null");
            return (Criteria) this;
        }

        public Criteria andDistrictEqualTo(String value) {
            addCriterion("district =", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictNotEqualTo(String value) {
            addCriterion("district <>", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictGreaterThan(String value) {
            addCriterion("district >", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictGreaterThanOrEqualTo(String value) {
            addCriterion("district >=", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictLessThan(String value) {
            addCriterion("district <", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictLessThanOrEqualTo(String value) {
            addCriterion("district <=", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictLike(String value) {
            addCriterion("district like", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictNotLike(String value) {
            addCriterion("district not like", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictIn(List<String> values) {
            addCriterion("district in", values, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictNotIn(List<String> values) {
            addCriterion("district not in", values, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictBetween(String value1, String value2) {
            addCriterion("district between", value1, value2, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictNotBetween(String value1, String value2) {
            addCriterion("district not between", value1, value2, "district");
            return (Criteria) this;
        }

        public Criteria andFormatcreatetimeIsNull() {
            addCriterion("formatCreateTime is null");
            return (Criteria) this;
        }

        public Criteria andFormatcreatetimeIsNotNull() {
            addCriterion("formatCreateTime is not null");
            return (Criteria) this;
        }

        public Criteria andFormatcreatetimeEqualTo(String value) {
            addCriterion("formatCreateTime =", value, "formatcreatetime");
            return (Criteria) this;
        }

        public Criteria andFormatcreatetimeNotEqualTo(String value) {
            addCriterion("formatCreateTime <>", value, "formatcreatetime");
            return (Criteria) this;
        }

        public Criteria andFormatcreatetimeGreaterThan(String value) {
            addCriterion("formatCreateTime >", value, "formatcreatetime");
            return (Criteria) this;
        }

        public Criteria andFormatcreatetimeGreaterThanOrEqualTo(String value) {
            addCriterion("formatCreateTime >=", value, "formatcreatetime");
            return (Criteria) this;
        }

        public Criteria andFormatcreatetimeLessThan(String value) {
            addCriterion("formatCreateTime <", value, "formatcreatetime");
            return (Criteria) this;
        }

        public Criteria andFormatcreatetimeLessThanOrEqualTo(String value) {
            addCriterion("formatCreateTime <=", value, "formatcreatetime");
            return (Criteria) this;
        }

        public Criteria andFormatcreatetimeLike(String value) {
            addCriterion("formatCreateTime like", value, "formatcreatetime");
            return (Criteria) this;
        }

        public Criteria andFormatcreatetimeNotLike(String value) {
            addCriterion("formatCreateTime not like", value, "formatcreatetime");
            return (Criteria) this;
        }

        public Criteria andFormatcreatetimeIn(List<String> values) {
            addCriterion("formatCreateTime in", values, "formatcreatetime");
            return (Criteria) this;
        }

        public Criteria andFormatcreatetimeNotIn(List<String> values) {
            addCriterion("formatCreateTime not in", values, "formatcreatetime");
            return (Criteria) this;
        }

        public Criteria andFormatcreatetimeBetween(String value1, String value2) {
            addCriterion("formatCreateTime between", value1, value2, "formatcreatetime");
            return (Criteria) this;
        }

        public Criteria andFormatcreatetimeNotBetween(String value1, String value2) {
            addCriterion("formatCreateTime not between", value1, value2, "formatcreatetime");
            return (Criteria) this;
        }

        public Criteria andCompanyfullnameIsNull() {
            addCriterion("companyFullName is null");
            return (Criteria) this;
        }

        public Criteria andCompanyfullnameIsNotNull() {
            addCriterion("companyFullName is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyfullnameEqualTo(String value) {
            addCriterion("companyFullName =", value, "companyfullname");
            return (Criteria) this;
        }

        public Criteria andCompanyfullnameNotEqualTo(String value) {
            addCriterion("companyFullName <>", value, "companyfullname");
            return (Criteria) this;
        }

        public Criteria andCompanyfullnameGreaterThan(String value) {
            addCriterion("companyFullName >", value, "companyfullname");
            return (Criteria) this;
        }

        public Criteria andCompanyfullnameGreaterThanOrEqualTo(String value) {
            addCriterion("companyFullName >=", value, "companyfullname");
            return (Criteria) this;
        }

        public Criteria andCompanyfullnameLessThan(String value) {
            addCriterion("companyFullName <", value, "companyfullname");
            return (Criteria) this;
        }

        public Criteria andCompanyfullnameLessThanOrEqualTo(String value) {
            addCriterion("companyFullName <=", value, "companyfullname");
            return (Criteria) this;
        }

        public Criteria andCompanyfullnameLike(String value) {
            addCriterion("companyFullName like", value, "companyfullname");
            return (Criteria) this;
        }

        public Criteria andCompanyfullnameNotLike(String value) {
            addCriterion("companyFullName not like", value, "companyfullname");
            return (Criteria) this;
        }

        public Criteria andCompanyfullnameIn(List<String> values) {
            addCriterion("companyFullName in", values, "companyfullname");
            return (Criteria) this;
        }

        public Criteria andCompanyfullnameNotIn(List<String> values) {
            addCriterion("companyFullName not in", values, "companyfullname");
            return (Criteria) this;
        }

        public Criteria andCompanyfullnameBetween(String value1, String value2) {
            addCriterion("companyFullName between", value1, value2, "companyfullname");
            return (Criteria) this;
        }

        public Criteria andCompanyfullnameNotBetween(String value1, String value2) {
            addCriterion("companyFullName not between", value1, value2, "companyfullname");
            return (Criteria) this;
        }

        public Criteria andAdwordIsNull() {
            addCriterion("adWord is null");
            return (Criteria) this;
        }

        public Criteria andAdwordIsNotNull() {
            addCriterion("adWord is not null");
            return (Criteria) this;
        }

        public Criteria andAdwordEqualTo(Integer value) {
            addCriterion("adWord =", value, "adword");
            return (Criteria) this;
        }

        public Criteria andAdwordNotEqualTo(Integer value) {
            addCriterion("adWord <>", value, "adword");
            return (Criteria) this;
        }

        public Criteria andAdwordGreaterThan(Integer value) {
            addCriterion("adWord >", value, "adword");
            return (Criteria) this;
        }

        public Criteria andAdwordGreaterThanOrEqualTo(Integer value) {
            addCriterion("adWord >=", value, "adword");
            return (Criteria) this;
        }

        public Criteria andAdwordLessThan(Integer value) {
            addCriterion("adWord <", value, "adword");
            return (Criteria) this;
        }

        public Criteria andAdwordLessThanOrEqualTo(Integer value) {
            addCriterion("adWord <=", value, "adword");
            return (Criteria) this;
        }

        public Criteria andAdwordIn(List<Integer> values) {
            addCriterion("adWord in", values, "adword");
            return (Criteria) this;
        }

        public Criteria andAdwordNotIn(List<Integer> values) {
            addCriterion("adWord not in", values, "adword");
            return (Criteria) this;
        }

        public Criteria andAdwordBetween(Integer value1, Integer value2) {
            addCriterion("adWord between", value1, value2, "adword");
            return (Criteria) this;
        }

        public Criteria andAdwordNotBetween(Integer value1, Integer value2) {
            addCriterion("adWord not between", value1, value2, "adword");
            return (Criteria) this;
        }

        public Criteria andBusinesszonesIsNull() {
            addCriterion("businessZones is null");
            return (Criteria) this;
        }

        public Criteria andBusinesszonesIsNotNull() {
            addCriterion("businessZones is not null");
            return (Criteria) this;
        }

        public Criteria andBusinesszonesEqualTo(String value) {
            addCriterion("businessZones =", value, "businesszones");
            return (Criteria) this;
        }

        public Criteria andBusinesszonesNotEqualTo(String value) {
            addCriterion("businessZones <>", value, "businesszones");
            return (Criteria) this;
        }

        public Criteria andBusinesszonesGreaterThan(String value) {
            addCriterion("businessZones >", value, "businesszones");
            return (Criteria) this;
        }

        public Criteria andBusinesszonesGreaterThanOrEqualTo(String value) {
            addCriterion("businessZones >=", value, "businesszones");
            return (Criteria) this;
        }

        public Criteria andBusinesszonesLessThan(String value) {
            addCriterion("businessZones <", value, "businesszones");
            return (Criteria) this;
        }

        public Criteria andBusinesszonesLessThanOrEqualTo(String value) {
            addCriterion("businessZones <=", value, "businesszones");
            return (Criteria) this;
        }

        public Criteria andBusinesszonesLike(String value) {
            addCriterion("businessZones like", value, "businesszones");
            return (Criteria) this;
        }

        public Criteria andBusinesszonesNotLike(String value) {
            addCriterion("businessZones not like", value, "businesszones");
            return (Criteria) this;
        }

        public Criteria andBusinesszonesIn(List<String> values) {
            addCriterion("businessZones in", values, "businesszones");
            return (Criteria) this;
        }

        public Criteria andBusinesszonesNotIn(List<String> values) {
            addCriterion("businessZones not in", values, "businesszones");
            return (Criteria) this;
        }

        public Criteria andBusinesszonesBetween(String value1, String value2) {
            addCriterion("businessZones between", value1, value2, "businesszones");
            return (Criteria) this;
        }

        public Criteria andBusinesszonesNotBetween(String value1, String value2) {
            addCriterion("businessZones not between", value1, value2, "businesszones");
            return (Criteria) this;
        }

        public Criteria andImstateIsNull() {
            addCriterion("imState is null");
            return (Criteria) this;
        }

        public Criteria andImstateIsNotNull() {
            addCriterion("imState is not null");
            return (Criteria) this;
        }

        public Criteria andImstateEqualTo(String value) {
            addCriterion("imState =", value, "imstate");
            return (Criteria) this;
        }

        public Criteria andImstateNotEqualTo(String value) {
            addCriterion("imState <>", value, "imstate");
            return (Criteria) this;
        }

        public Criteria andImstateGreaterThan(String value) {
            addCriterion("imState >", value, "imstate");
            return (Criteria) this;
        }

        public Criteria andImstateGreaterThanOrEqualTo(String value) {
            addCriterion("imState >=", value, "imstate");
            return (Criteria) this;
        }

        public Criteria andImstateLessThan(String value) {
            addCriterion("imState <", value, "imstate");
            return (Criteria) this;
        }

        public Criteria andImstateLessThanOrEqualTo(String value) {
            addCriterion("imState <=", value, "imstate");
            return (Criteria) this;
        }

        public Criteria andImstateLike(String value) {
            addCriterion("imState like", value, "imstate");
            return (Criteria) this;
        }

        public Criteria andImstateNotLike(String value) {
            addCriterion("imState not like", value, "imstate");
            return (Criteria) this;
        }

        public Criteria andImstateIn(List<String> values) {
            addCriterion("imState in", values, "imstate");
            return (Criteria) this;
        }

        public Criteria andImstateNotIn(List<String> values) {
            addCriterion("imState not in", values, "imstate");
            return (Criteria) this;
        }

        public Criteria andImstateBetween(String value1, String value2) {
            addCriterion("imState between", value1, value2, "imstate");
            return (Criteria) this;
        }

        public Criteria andImstateNotBetween(String value1, String value2) {
            addCriterion("imState not between", value1, value2, "imstate");
            return (Criteria) this;
        }

        public Criteria andLastloginIsNull() {
            addCriterion("lastLogin is null");
            return (Criteria) this;
        }

        public Criteria andLastloginIsNotNull() {
            addCriterion("lastLogin is not null");
            return (Criteria) this;
        }

        public Criteria andLastloginEqualTo(String value) {
            addCriterion("lastLogin =", value, "lastlogin");
            return (Criteria) this;
        }

        public Criteria andLastloginNotEqualTo(String value) {
            addCriterion("lastLogin <>", value, "lastlogin");
            return (Criteria) this;
        }

        public Criteria andLastloginGreaterThan(String value) {
            addCriterion("lastLogin >", value, "lastlogin");
            return (Criteria) this;
        }

        public Criteria andLastloginGreaterThanOrEqualTo(String value) {
            addCriterion("lastLogin >=", value, "lastlogin");
            return (Criteria) this;
        }

        public Criteria andLastloginLessThan(String value) {
            addCriterion("lastLogin <", value, "lastlogin");
            return (Criteria) this;
        }

        public Criteria andLastloginLessThanOrEqualTo(String value) {
            addCriterion("lastLogin <=", value, "lastlogin");
            return (Criteria) this;
        }

        public Criteria andLastloginLike(String value) {
            addCriterion("lastLogin like", value, "lastlogin");
            return (Criteria) this;
        }

        public Criteria andLastloginNotLike(String value) {
            addCriterion("lastLogin not like", value, "lastlogin");
            return (Criteria) this;
        }

        public Criteria andLastloginIn(List<String> values) {
            addCriterion("lastLogin in", values, "lastlogin");
            return (Criteria) this;
        }

        public Criteria andLastloginNotIn(List<String> values) {
            addCriterion("lastLogin not in", values, "lastlogin");
            return (Criteria) this;
        }

        public Criteria andLastloginBetween(String value1, String value2) {
            addCriterion("lastLogin between", value1, value2, "lastlogin");
            return (Criteria) this;
        }

        public Criteria andLastloginNotBetween(String value1, String value2) {
            addCriterion("lastLogin not between", value1, value2, "lastlogin");
            return (Criteria) this;
        }

        public Criteria andPublisheridIsNull() {
            addCriterion("publisherId is null");
            return (Criteria) this;
        }

        public Criteria andPublisheridIsNotNull() {
            addCriterion("publisherId is not null");
            return (Criteria) this;
        }

        public Criteria andPublisheridEqualTo(Integer value) {
            addCriterion("publisherId =", value, "publisherid");
            return (Criteria) this;
        }

        public Criteria andPublisheridNotEqualTo(Integer value) {
            addCriterion("publisherId <>", value, "publisherid");
            return (Criteria) this;
        }

        public Criteria andPublisheridGreaterThan(Integer value) {
            addCriterion("publisherId >", value, "publisherid");
            return (Criteria) this;
        }

        public Criteria andPublisheridGreaterThanOrEqualTo(Integer value) {
            addCriterion("publisherId >=", value, "publisherid");
            return (Criteria) this;
        }

        public Criteria andPublisheridLessThan(Integer value) {
            addCriterion("publisherId <", value, "publisherid");
            return (Criteria) this;
        }

        public Criteria andPublisheridLessThanOrEqualTo(Integer value) {
            addCriterion("publisherId <=", value, "publisherid");
            return (Criteria) this;
        }

        public Criteria andPublisheridIn(List<Integer> values) {
            addCriterion("publisherId in", values, "publisherid");
            return (Criteria) this;
        }

        public Criteria andPublisheridNotIn(List<Integer> values) {
            addCriterion("publisherId not in", values, "publisherid");
            return (Criteria) this;
        }

        public Criteria andPublisheridBetween(Integer value1, Integer value2) {
            addCriterion("publisherId between", value1, value2, "publisherid");
            return (Criteria) this;
        }

        public Criteria andPublisheridNotBetween(Integer value1, Integer value2) {
            addCriterion("publisherId not between", value1, value2, "publisherid");
            return (Criteria) this;
        }

        public Criteria andPlusIsNull() {
            addCriterion("plus is null");
            return (Criteria) this;
        }

        public Criteria andPlusIsNotNull() {
            addCriterion("plus is not null");
            return (Criteria) this;
        }

        public Criteria andPlusEqualTo(String value) {
            addCriterion("plus =", value, "plus");
            return (Criteria) this;
        }

        public Criteria andPlusNotEqualTo(String value) {
            addCriterion("plus <>", value, "plus");
            return (Criteria) this;
        }

        public Criteria andPlusGreaterThan(String value) {
            addCriterion("plus >", value, "plus");
            return (Criteria) this;
        }

        public Criteria andPlusGreaterThanOrEqualTo(String value) {
            addCriterion("plus >=", value, "plus");
            return (Criteria) this;
        }

        public Criteria andPlusLessThan(String value) {
            addCriterion("plus <", value, "plus");
            return (Criteria) this;
        }

        public Criteria andPlusLessThanOrEqualTo(String value) {
            addCriterion("plus <=", value, "plus");
            return (Criteria) this;
        }

        public Criteria andPlusLike(String value) {
            addCriterion("plus like", value, "plus");
            return (Criteria) this;
        }

        public Criteria andPlusNotLike(String value) {
            addCriterion("plus not like", value, "plus");
            return (Criteria) this;
        }

        public Criteria andPlusIn(List<String> values) {
            addCriterion("plus in", values, "plus");
            return (Criteria) this;
        }

        public Criteria andPlusNotIn(List<String> values) {
            addCriterion("plus not in", values, "plus");
            return (Criteria) this;
        }

        public Criteria andPlusBetween(String value1, String value2) {
            addCriterion("plus between", value1, value2, "plus");
            return (Criteria) this;
        }

        public Criteria andPlusNotBetween(String value1, String value2) {
            addCriterion("plus not between", value1, value2, "plus");
            return (Criteria) this;
        }

        public Criteria andPcshowIsNull() {
            addCriterion("pcShow is null");
            return (Criteria) this;
        }

        public Criteria andPcshowIsNotNull() {
            addCriterion("pcShow is not null");
            return (Criteria) this;
        }

        public Criteria andPcshowEqualTo(Integer value) {
            addCriterion("pcShow =", value, "pcshow");
            return (Criteria) this;
        }

        public Criteria andPcshowNotEqualTo(Integer value) {
            addCriterion("pcShow <>", value, "pcshow");
            return (Criteria) this;
        }

        public Criteria andPcshowGreaterThan(Integer value) {
            addCriterion("pcShow >", value, "pcshow");
            return (Criteria) this;
        }

        public Criteria andPcshowGreaterThanOrEqualTo(Integer value) {
            addCriterion("pcShow >=", value, "pcshow");
            return (Criteria) this;
        }

        public Criteria andPcshowLessThan(Integer value) {
            addCriterion("pcShow <", value, "pcshow");
            return (Criteria) this;
        }

        public Criteria andPcshowLessThanOrEqualTo(Integer value) {
            addCriterion("pcShow <=", value, "pcshow");
            return (Criteria) this;
        }

        public Criteria andPcshowIn(List<Integer> values) {
            addCriterion("pcShow in", values, "pcshow");
            return (Criteria) this;
        }

        public Criteria andPcshowNotIn(List<Integer> values) {
            addCriterion("pcShow not in", values, "pcshow");
            return (Criteria) this;
        }

        public Criteria andPcshowBetween(Integer value1, Integer value2) {
            addCriterion("pcShow between", value1, value2, "pcshow");
            return (Criteria) this;
        }

        public Criteria andPcshowNotBetween(Integer value1, Integer value2) {
            addCriterion("pcShow not between", value1, value2, "pcshow");
            return (Criteria) this;
        }

        public Criteria andAppshowIsNull() {
            addCriterion("appShow is null");
            return (Criteria) this;
        }

        public Criteria andAppshowIsNotNull() {
            addCriterion("appShow is not null");
            return (Criteria) this;
        }

        public Criteria andAppshowEqualTo(Integer value) {
            addCriterion("appShow =", value, "appshow");
            return (Criteria) this;
        }

        public Criteria andAppshowNotEqualTo(Integer value) {
            addCriterion("appShow <>", value, "appshow");
            return (Criteria) this;
        }

        public Criteria andAppshowGreaterThan(Integer value) {
            addCriterion("appShow >", value, "appshow");
            return (Criteria) this;
        }

        public Criteria andAppshowGreaterThanOrEqualTo(Integer value) {
            addCriterion("appShow >=", value, "appshow");
            return (Criteria) this;
        }

        public Criteria andAppshowLessThan(Integer value) {
            addCriterion("appShow <", value, "appshow");
            return (Criteria) this;
        }

        public Criteria andAppshowLessThanOrEqualTo(Integer value) {
            addCriterion("appShow <=", value, "appshow");
            return (Criteria) this;
        }

        public Criteria andAppshowIn(List<Integer> values) {
            addCriterion("appShow in", values, "appshow");
            return (Criteria) this;
        }

        public Criteria andAppshowNotIn(List<Integer> values) {
            addCriterion("appShow not in", values, "appshow");
            return (Criteria) this;
        }

        public Criteria andAppshowBetween(Integer value1, Integer value2) {
            addCriterion("appShow between", value1, value2, "appshow");
            return (Criteria) this;
        }

        public Criteria andAppshowNotBetween(Integer value1, Integer value2) {
            addCriterion("appShow not between", value1, value2, "appshow");
            return (Criteria) this;
        }

        public Criteria andDeliverIsNull() {
            addCriterion("deliver is null");
            return (Criteria) this;
        }

        public Criteria andDeliverIsNotNull() {
            addCriterion("deliver is not null");
            return (Criteria) this;
        }

        public Criteria andDeliverEqualTo(Integer value) {
            addCriterion("deliver =", value, "deliver");
            return (Criteria) this;
        }

        public Criteria andDeliverNotEqualTo(Integer value) {
            addCriterion("deliver <>", value, "deliver");
            return (Criteria) this;
        }

        public Criteria andDeliverGreaterThan(Integer value) {
            addCriterion("deliver >", value, "deliver");
            return (Criteria) this;
        }

        public Criteria andDeliverGreaterThanOrEqualTo(Integer value) {
            addCriterion("deliver >=", value, "deliver");
            return (Criteria) this;
        }

        public Criteria andDeliverLessThan(Integer value) {
            addCriterion("deliver <", value, "deliver");
            return (Criteria) this;
        }

        public Criteria andDeliverLessThanOrEqualTo(Integer value) {
            addCriterion("deliver <=", value, "deliver");
            return (Criteria) this;
        }

        public Criteria andDeliverIn(List<Integer> values) {
            addCriterion("deliver in", values, "deliver");
            return (Criteria) this;
        }

        public Criteria andDeliverNotIn(List<Integer> values) {
            addCriterion("deliver not in", values, "deliver");
            return (Criteria) this;
        }

        public Criteria andDeliverBetween(Integer value1, Integer value2) {
            addCriterion("deliver between", value1, value2, "deliver");
            return (Criteria) this;
        }

        public Criteria andDeliverNotBetween(Integer value1, Integer value2) {
            addCriterion("deliver not between", value1, value2, "deliver");
            return (Criteria) this;
        }

        public Criteria andGradedescriptionIsNull() {
            addCriterion("gradeDescription is null");
            return (Criteria) this;
        }

        public Criteria andGradedescriptionIsNotNull() {
            addCriterion("gradeDescription is not null");
            return (Criteria) this;
        }

        public Criteria andGradedescriptionEqualTo(String value) {
            addCriterion("gradeDescription =", value, "gradedescription");
            return (Criteria) this;
        }

        public Criteria andGradedescriptionNotEqualTo(String value) {
            addCriterion("gradeDescription <>", value, "gradedescription");
            return (Criteria) this;
        }

        public Criteria andGradedescriptionGreaterThan(String value) {
            addCriterion("gradeDescription >", value, "gradedescription");
            return (Criteria) this;
        }

        public Criteria andGradedescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("gradeDescription >=", value, "gradedescription");
            return (Criteria) this;
        }

        public Criteria andGradedescriptionLessThan(String value) {
            addCriterion("gradeDescription <", value, "gradedescription");
            return (Criteria) this;
        }

        public Criteria andGradedescriptionLessThanOrEqualTo(String value) {
            addCriterion("gradeDescription <=", value, "gradedescription");
            return (Criteria) this;
        }

        public Criteria andGradedescriptionLike(String value) {
            addCriterion("gradeDescription like", value, "gradedescription");
            return (Criteria) this;
        }

        public Criteria andGradedescriptionNotLike(String value) {
            addCriterion("gradeDescription not like", value, "gradedescription");
            return (Criteria) this;
        }

        public Criteria andGradedescriptionIn(List<String> values) {
            addCriterion("gradeDescription in", values, "gradedescription");
            return (Criteria) this;
        }

        public Criteria andGradedescriptionNotIn(List<String> values) {
            addCriterion("gradeDescription not in", values, "gradedescription");
            return (Criteria) this;
        }

        public Criteria andGradedescriptionBetween(String value1, String value2) {
            addCriterion("gradeDescription between", value1, value2, "gradedescription");
            return (Criteria) this;
        }

        public Criteria andGradedescriptionNotBetween(String value1, String value2) {
            addCriterion("gradeDescription not between", value1, value2, "gradedescription");
            return (Criteria) this;
        }

        public Criteria andPromotionscoreexplainIsNull() {
            addCriterion("promotionScoreExplain is null");
            return (Criteria) this;
        }

        public Criteria andPromotionscoreexplainIsNotNull() {
            addCriterion("promotionScoreExplain is not null");
            return (Criteria) this;
        }

        public Criteria andPromotionscoreexplainEqualTo(String value) {
            addCriterion("promotionScoreExplain =", value, "promotionscoreexplain");
            return (Criteria) this;
        }

        public Criteria andPromotionscoreexplainNotEqualTo(String value) {
            addCriterion("promotionScoreExplain <>", value, "promotionscoreexplain");
            return (Criteria) this;
        }

        public Criteria andPromotionscoreexplainGreaterThan(String value) {
            addCriterion("promotionScoreExplain >", value, "promotionscoreexplain");
            return (Criteria) this;
        }

        public Criteria andPromotionscoreexplainGreaterThanOrEqualTo(String value) {
            addCriterion("promotionScoreExplain >=", value, "promotionscoreexplain");
            return (Criteria) this;
        }

        public Criteria andPromotionscoreexplainLessThan(String value) {
            addCriterion("promotionScoreExplain <", value, "promotionscoreexplain");
            return (Criteria) this;
        }

        public Criteria andPromotionscoreexplainLessThanOrEqualTo(String value) {
            addCriterion("promotionScoreExplain <=", value, "promotionscoreexplain");
            return (Criteria) this;
        }

        public Criteria andPromotionscoreexplainLike(String value) {
            addCriterion("promotionScoreExplain like", value, "promotionscoreexplain");
            return (Criteria) this;
        }

        public Criteria andPromotionscoreexplainNotLike(String value) {
            addCriterion("promotionScoreExplain not like", value, "promotionscoreexplain");
            return (Criteria) this;
        }

        public Criteria andPromotionscoreexplainIn(List<String> values) {
            addCriterion("promotionScoreExplain in", values, "promotionscoreexplain");
            return (Criteria) this;
        }

        public Criteria andPromotionscoreexplainNotIn(List<String> values) {
            addCriterion("promotionScoreExplain not in", values, "promotionscoreexplain");
            return (Criteria) this;
        }

        public Criteria andPromotionscoreexplainBetween(String value1, String value2) {
            addCriterion("promotionScoreExplain between", value1, value2, "promotionscoreexplain");
            return (Criteria) this;
        }

        public Criteria andPromotionscoreexplainNotBetween(String value1, String value2) {
            addCriterion("promotionScoreExplain not between", value1, value2, "promotionscoreexplain");
            return (Criteria) this;
        }

        public Criteria andPositioncatidIsNull() {
            addCriterion("positionCatId is null");
            return (Criteria) this;
        }

        public Criteria andPositioncatidIsNotNull() {
            addCriterion("positionCatId is not null");
            return (Criteria) this;
        }

        public Criteria andPositioncatidEqualTo(Integer value) {
            addCriterion("positionCatId =", value, "positioncatid");
            return (Criteria) this;
        }

        public Criteria andPositioncatidNotEqualTo(Integer value) {
            addCriterion("positionCatId <>", value, "positioncatid");
            return (Criteria) this;
        }

        public Criteria andPositioncatidGreaterThan(Integer value) {
            addCriterion("positionCatId >", value, "positioncatid");
            return (Criteria) this;
        }

        public Criteria andPositioncatidGreaterThanOrEqualTo(Integer value) {
            addCriterion("positionCatId >=", value, "positioncatid");
            return (Criteria) this;
        }

        public Criteria andPositioncatidLessThan(Integer value) {
            addCriterion("positionCatId <", value, "positioncatid");
            return (Criteria) this;
        }

        public Criteria andPositioncatidLessThanOrEqualTo(Integer value) {
            addCriterion("positionCatId <=", value, "positioncatid");
            return (Criteria) this;
        }

        public Criteria andPositioncatidIn(List<Integer> values) {
            addCriterion("positionCatId in", values, "positioncatid");
            return (Criteria) this;
        }

        public Criteria andPositioncatidNotIn(List<Integer> values) {
            addCriterion("positionCatId not in", values, "positioncatid");
            return (Criteria) this;
        }

        public Criteria andPositioncatidBetween(Integer value1, Integer value2) {
            addCriterion("positionCatId between", value1, value2, "positioncatid");
            return (Criteria) this;
        }

        public Criteria andPositioncatidNotBetween(Integer value1, Integer value2) {
            addCriterion("positionCatId not between", value1, value2, "positioncatid");
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