package com.buu.job.domain;

public class JobDetail {
    private Integer positionid;

    private String postdepartment;

    private String post;

    private String salary;

    private String workplace;

    private String experience;

    private String educationbackground;

    private String jobkind;

    private String welfare;

    private String publishtime;

    private String jobfrom;

    private String duty;

    private String postrequest;

    private String positionaddress;

    private String jdpublishername;

    private String jdpublisherpost;

    private Integer jdpublisherdealratio;

    private String companyname;

    private String companynickname;

    private String companylagohomepageurl;

    private String companyiconurl;

    private String companyfeild;

    private String companyscale;

    private String companyhomepageurl;

    private String companydevelopestage;

    public Integer getPositionid() {
        return positionid;
    }

    public void setPositionid(Integer positionid) {
        this.positionid = positionid;
    }

    public String getPostdepartment() {
        return postdepartment;
    }

    public void setPostdepartment(String postdepartment) {
        this.postdepartment = postdepartment == null ? null : postdepartment.trim();
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post == null ? null : post.trim();
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary == null ? null : salary.trim();
    }

    public String getWorkplace() {
        return workplace;
    }

    public void setWorkplace(String workplace) {
        this.workplace = workplace == null ? null : workplace.trim();
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience == null ? null : experience.trim();
    }

    public String getEducationbackground() {
        return educationbackground;
    }

    public void setEducationbackground(String educationbackground) {
        this.educationbackground = educationbackground == null ? null : educationbackground.trim();
    }

    public String getJobkind() {
        return jobkind;
    }

    public void setJobkind(String jobkind) {
        this.jobkind = jobkind == null ? null : jobkind.trim();
    }

    public String getWelfare() {
        return welfare;
    }

    public void setWelfare(String welfare) {
        this.welfare = welfare == null ? null : welfare.trim();
    }

    public String getPublishtime() {
        return publishtime;
    }

    public void setPublishtime(String publishtime) {
        this.publishtime = publishtime == null ? null : publishtime.trim();
    }

    public String getJobfrom() {
        return jobfrom;
    }

    public void setJobfrom(String jobfrom) {
        this.jobfrom = jobfrom == null ? null : jobfrom.trim();
    }

    public String getDuty() {
        return duty;
    }

    public void setDuty(String duty) {
        this.duty = duty == null ? null : duty.trim();
    }

    public String getPostrequest() {
        return postrequest;
    }

    public void setPostrequest(String postrequest) {
        this.postrequest = postrequest == null ? null : postrequest.trim();
    }

    public String getPositionaddress() {
        return positionaddress;
    }

    public void setPositionaddress(String positionaddress) {
        this.positionaddress = positionaddress == null ? null : positionaddress.trim();
    }

    public String getJdpublishername() {
        return jdpublishername;
    }

    public void setJdpublishername(String jdpublishername) {
        this.jdpublishername = jdpublishername == null ? null : jdpublishername.trim();
    }

    public String getJdpublisherpost() {
        return jdpublisherpost;
    }

    public void setJdpublisherpost(String jdpublisherpost) {
        this.jdpublisherpost = jdpublisherpost == null ? null : jdpublisherpost.trim();
    }

    public Integer getJdpublisherdealratio() {
        return jdpublisherdealratio;
    }

    public void setJdpublisherdealratio(Integer jdpublisherdealratio) {
        this.jdpublisherdealratio = jdpublisherdealratio;
    }

    public String getCompanyname() {
        return companyname;
    }

    public void setCompanyname(String companyname) {
        this.companyname = companyname == null ? null : companyname.trim();
    }

    public String getCompanynickname() {
        return companynickname;
    }

    public void setCompanynickname(String companynickname) {
        this.companynickname = companynickname == null ? null : companynickname.trim();
    }

    public String getCompanylagohomepageurl() {
        return companylagohomepageurl;
    }

    public void setCompanylagohomepageurl(String companylagohomepageurl) {
        this.companylagohomepageurl = companylagohomepageurl == null ? null : companylagohomepageurl.trim();
    }

    public String getCompanyiconurl() {
        return companyiconurl;
    }

    public void setCompanyiconurl(String companyiconurl) {
        this.companyiconurl = companyiconurl == null ? null : companyiconurl.trim();
    }

    public String getCompanyfeild() {
        return companyfeild;
    }

    public void setCompanyfeild(String companyfeild) {
        this.companyfeild = companyfeild == null ? null : companyfeild.trim();
    }

    public String getCompanyscale() {
        return companyscale;
    }

    public void setCompanyscale(String companyscale) {
        this.companyscale = companyscale == null ? null : companyscale.trim();
    }

    public String getCompanyhomepageurl() {
        return companyhomepageurl;
    }

    public void setCompanyhomepageurl(String companyhomepageurl) {
        this.companyhomepageurl = companyhomepageurl == null ? null : companyhomepageurl.trim();
    }

    public String getCompanydevelopestage() {
        return companydevelopestage;
    }

    public void setCompanydevelopestage(String companydevelopestage) {
        this.companydevelopestage = companydevelopestage == null ? null : companydevelopestage.trim();
    }

    @Override
    public String toString() {
        return "JobDetail{" +
                "positionid=" + positionid +
                ", postdepartment='" + postdepartment + '\'' +
                ", post='" + post + '\'' +
                ", salary='" + salary + '\'' +
                ", workplace='" + workplace + '\'' +
                ", experience='" + experience + '\'' +
                ", educationbackground='" + educationbackground + '\'' +
                ", jobkind='" + jobkind + '\'' +
                ", welfare='" + welfare + '\'' +
                ", publishtime='" + publishtime + '\'' +
                ", jobfrom='" + jobfrom + '\'' +
                ", duty='" + duty + '\'' +
                ", postrequest='" + postrequest + '\'' +
                ", positionaddress='" + positionaddress + '\'' +
                ", jdpublishername='" + jdpublishername + '\'' +
                ", jdpublisherpost='" + jdpublisherpost + '\'' +
                ", jdpublisherdealratio=" + jdpublisherdealratio +
                ", companyname='" + companyname + '\'' +
                ", companynickname='" + companynickname + '\'' +
                ", companylagohomepageurl='" + companylagohomepageurl + '\'' +
                ", companyiconurl='" + companyiconurl + '\'' +
                ", companyfeild='" + companyfeild + '\'' +
                ", companyscale='" + companyscale + '\'' +
                ", companyhomepageurl='" + companyhomepageurl + '\'' +
                ", companydevelopestage='" + companydevelopestage + '\'' +
                '}';
    }
}