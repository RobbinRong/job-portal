package com.buu.job.admin;

import java.util.List;

public class JobList {

    public boolean success;
    public String requestId;
    public String msg;
    public String resubmitToken;
    public Content content;
    public int code;

    @Override
    public String toString() {
        return "JobList{" +
                "success=" + success +
                ", requestId='" + requestId + '\'' +
                ", msg='" + msg + '\'' +
                ", resubmitToken='" + resubmitToken + '\'' +
                ", content=" + content +
                ", code=" + code +
                '}';
    }

    public class LocationInfo
    {
        public String city;
        public String district;
        public boolean queryByGisCode;
        public String businessZone;
        public String locationCode;

        @Override
        public String toString() {
            return "LocationInfo{" +
                    "city='" + city + '\'' +
                    ", district='" + district + '\'' +
                    ", queryByGisCode=" + queryByGisCode +
                    ", businessZone='" + businessZone + '\'' +
                    ", locationCode='" + locationCode + '\'' +
                    '}';
        }
    }
    public class QueryAnalysisInfo
    {
        public String positionName;
        public String companyName;
        public String industryName;
        public boolean usefulCompany;

        @Override
        public String toString() {
            return "QueryAnalysisInfo{" +
                    "positionName='" + positionName + '\'' +
                    ", companyName='" + companyName + '\'' +
                    ", industryName='" + industryName + '\'' +
                    ", usefulCompany=" + usefulCompany +
                    '}';
        }
    }

    public class StrategyProperty
    {
        public String name;
        public int id;

        @Override
        public String toString() {
            return "StrategyProperty{" +
                    "name='" + name + '\'' +
                    ", id=" + id +
                    '}';
        }
    }
    public class Result
    {
        public int companyId;
        public int score;
        public int positionId;
        public String positionName;
        public String createTime;
        public String jobNature;
        public String workYear;
        public String education;
        public String city;
        public String companyLogo;
        public String positionAdvantage;
        public String salary;
        public int approve;
        public String industryField;
        public String companyShortName;
        public String financeStage;
        public String companySize;
        public List<String> companyLabelList;
        public String district;
        public String formatCreateTime;
        public String companyFullName;
        public int adWord;
        public List<String> businessZones;
        public String imState;
        public long lastLogin;
        public int publisherId;
        public String explain;
        public String plus;
        public int pcShow;
        public int appShow;
        public int deliver;
        public String gradeDescription;
        public String promotionScoreExplain;

        @Override
        public String toString() {
            return "Result{" +
                    "companyId=" + companyId +
                    ", score=" + score +
                    ", positionId=" + positionId +
                    ", positionName='" + positionName + '\'' +
                    ", createTime='" + createTime + '\'' +
                    ", jobNature='" + jobNature + '\'' +
                    ", workYear='" + workYear + '\'' +
                    ", education='" + education + '\'' +
                    ", city='" + city + '\'' +
                    ", companyLogo='" + companyLogo + '\'' +
                    ", positionAdvantage='" + positionAdvantage + '\'' +
                    ", salary='" + salary + '\'' +
                    ", approve=" + approve +
                    ", industryField='" + industryField + '\'' +
                    ", companyShortName='" + companyShortName + '\'' +
                    ", financeStage='" + financeStage + '\'' +
                    ", companySize='" + companySize + '\'' +
                    ", companyLabelList=" + companyLabelList +
                    ", district='" + district + '\'' +
                    ", formatCreateTime='" + formatCreateTime + '\'' +
                    ", companyFullName='" + companyFullName + '\'' +
                    ", adWord=" + adWord +
                    ", businessZones=" + businessZones +
                    ", imState='" + imState + '\'' +
                    ", lastLogin=" + lastLogin +
                    ", publisherId=" + publisherId +
                    ", explain='" + explain + '\'' +
                    ", plus='" + plus + '\'' +
                    ", pcShow=" + pcShow +
                    ", appShow=" + appShow +
                    ", deliver=" + deliver +
                    ", gradeDescription='" + gradeDescription + '\'' +
                    ", promotionScoreExplain='" + promotionScoreExplain + '\'' +
                    '}';
        }
    }
    public class PositionResult
    {
        public int totalCount;
        public int resultSize;
        public LocationInfo locationInfo;
        public QueryAnalysisInfo queryAnalysisInfo;
        public StrategyProperty strategyProperty;
        public List<Result> result;

        @Override
        public String toString() {
            return "PositionResult{" +
                    "totalCount=" + totalCount +
                    ", resultSize=" + resultSize +
                    ", locationInfo=" + locationInfo +
                    ", queryAnalysisInfo=" + queryAnalysisInfo +
                    ", strategyProperty=" + strategyProperty +
                    ", result=" + result +
                    '}';
        }
    }

    public class Content
    {
        public int pageNo;
        public int pageSize;
        public PositionResult positionResult;

        @Override
        public String toString() {
            return "Content{" +
                    "pageNo=" + pageNo +
                    ", pageSize=" + pageSize +
                    ", positionResult=" + positionResult +
                    '}';
        }
    }

}
