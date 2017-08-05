package com.buu.job.admin;

public class Job {
	private String postDepartment;//招聘发布部门
	private String post;//职位
	private String salary;//薪资
	private String workPlace;//工作地点
	private String experience;//工作经验
	private String educationBackground;//学历要求
	private String jobKind;//工作性质
	private String welfare;//职位诱惑
	private String publishTime;//发布时间
	private String jobFrom;//来自拉勾网\别的网站
	private String duty;//岗位职责
	private String postRequest;//岗位要求
//	private String reviewLinkURL;//所有面试评价页URL---不需要，未爬
	
	private String positionAddress;//工作详细地址
	//private double positionLng;//工作地址经度  取消
//	private double positionLat;//工作地址纬度		取消
	
	//职位发布者信息
	private String jdPublisherName;//职位发布者姓名
	private String jdPublisherPost;//职位发布者职务
	private int jdPublisherDealRatio;//简历及时处理率%
	//private int jdPublisherDealTime;//简历处理时间  取消
	
    //所属公司信息
	private String companyName;//公司名称
	private String companyNickName;//公司简称
	private String companyLagoHomePageURL;//公司拉勾主页URL
	private String companyIconURL;//公司图标URL
	private String companyFeild;//公司领域
	private String companyScale;//公司规模
	private String companyHomePageURL;//公司主页
	private String companyDevelopeStage;//公司发展阶段
	private int jobId;

	public int getJobId() {
		return jobId;
	}

	public void setJobId(int jobId) {
		this.jobId = jobId;
	}
	//相似职位信息
	//private String moreCompany;//推荐公司
	
	//private List<SimilarJob> similarJob;//相似职位
	//private String moreSimiJobURL;//更多相似职位URL
	
	
	public String getAllInfo(){
		StringBuffer str = new StringBuffer();
		str.append(this.postDepartment).append("\n")
		.append(this.post).append("\n")
		.append(this.salary).append("\n")
		.append(this.workPlace).append("\n")
		.append(this.experience).append("\n")
		.append(this.educationBackground).append("\n")
		.append(this.jobKind).append("\n")
		.append(this.welfare).append("\n")
		.append(this.publishTime).append("\n")
		.append(this.jobFrom).append("\n")
		.append(this.duty).append("\n")
		.append(this.postRequest).append("\n\n")
		
		.append(this.positionAddress).append("\n")
//		.append(this.positionLng).append("\n")
//		.append(this.positionLat).append("\n\n")
//
		.append(this.jdPublisherName).append("\n")
		.append(this.jdPublisherPost).append("\n")
		.append(this.jdPublisherDealRatio).append("\n")
//		.append(this.jdPublisherDealTime).append("\n\n")
		
		.append(this.companyName).append("\n")
		.append(this.companyNickName).append("\n")
		.append(this.companyLagoHomePageURL).append("\n")
		.append(this.companyIconURL).append("\n")
		.append(this.companyFeild).append("\n")
		.append(this.companyScale).append("\n")
		.append(this.companyHomePageURL).append("\n")
		.append(this.companyDevelopeStage).append("\n\n")
		.append(this.jobId).append("\n\n");

		//.append(this.moreCompany).append("\n");
		//.append(this.moreSimiJobURL).append("\n\n");
//		for(SimilarJob simi : this.similarJob){
//			str.append(simi.getAllInfo()).append("\n");
//		}
		return str.toString();		
	}
	
//	public String getMoreCompany() {
//		return moreCompany;
//	}
//	public void setMoreCompany(String moreCompany) {
//		this.moreCompany = moreCompany;
//	}
	public String getPostDepartment() {
		return postDepartment;
	}
	public void setPostDepartment(String postDepartment) {
		this.postDepartment = postDepartment;
	}
	public String getPost() {
		return post;
	}
	public void setPost(String post) {
		this.post = post;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	public String getWorkPlace() {
		return workPlace;
	}
	public void setWorkPlace(String workPlace) {
		this.workPlace = workPlace;
	}
	public String getExperience() {
		return experience;
	}
	public void setExperience(String experience) {
		this.experience = experience;
	}
	public String getEducationBackground() {
		return educationBackground;
	}
	public void setEducationBackground(String educationBackground) {
		this.educationBackground = educationBackground;
	}
	public String getJobKind() {
		return jobKind;
	}
	public void setJobKind(String jobKind) {
		this.jobKind = jobKind;
	}
	public String getWelfare() {
		return welfare;
	}
	public void setWelfare(String welfare) {
		this.welfare = welfare;
	}
	public String getPublishTime() {
		return publishTime;
	}
	public void setPublishTime(String publishTime) {
		this.publishTime = publishTime;
	}
	public String getJobFrom() {
		return jobFrom;
	}
	public void setJobFrom(String jobFrom) {
		this.jobFrom = jobFrom;
	}
	public String getDuty() {
		return duty;
	}
	public void setDuty(String duty) {
		this.duty = duty;
	}
	public String getPostRequest() {
		return postRequest;
	}
	public void setPostRequest(String postRequest) {
		this.postRequest = postRequest;
	}
//	public String getReviewLinkURL() {
//		return reviewLinkURL;
//	}
//	public void setReviewLinkURL(String reviewLinkURL) {
//		this.reviewLinkURL = reviewLinkURL;
//	}
	public String getPositionAddress() {
		return positionAddress;
	}
	public void setPositionAddress(String positionAddress) {
		this.positionAddress = positionAddress;
	}
//	public double getPositionLng() {
//		return positionLng;
//	}
//	public void setPositionLng(double positionLng) {
//		this.positionLng = positionLng;
//	}
//	public double getPositionLat() {
//		return positionLat;
//	}
//	public void setPositionLat(double positionLat) {
//		this.positionLat = positionLat;
//	}
	public String getJdPublisherName() {
		return jdPublisherName;
	}
	public void setJdPublisherName(String jdPublisherName) {
		this.jdPublisherName = jdPublisherName;
	}
	public String getJdPublisherPost() {
		return jdPublisherPost;
	}
	public void setJdPublisherPost(String jdPublisherPost) {
		this.jdPublisherPost = jdPublisherPost;
	}
	public int getJdPublisherDealRatio() {
		return jdPublisherDealRatio;
	}
	public void setJdPublisherDealRatio(int jdPublisherDealRatio) {
		this.jdPublisherDealRatio = jdPublisherDealRatio;
	}
//	public int getJdPublisherDealTime() {
//		return jdPublisherDealTime;
//	}
//	public void setJdPublisherDealTime(int jdPublisherDealTime) {
//		this.jdPublisherDealTime = jdPublisherDealTime;
//	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getCompanyNickName() {
		return companyNickName;
	}
	public void setCompanyNickName(String companyNickName) {
		this.companyNickName = companyNickName;
	}
	public String getCompanyLagoHomePageURL() {
		return companyLagoHomePageURL;
	}
	public void setCompanyLagoHomePageURL(String companyLagoHomePageURL) {
		this.companyLagoHomePageURL = companyLagoHomePageURL;
	}
	public String getCompanyIconURL() {
		return companyIconURL;
	}
	public void setCompanyIconURL(String companyIconURL) {
		this.companyIconURL = companyIconURL;
	}
	public String getCompanyFeild() {
		return companyFeild;
	}
	public void setCompanyFeild(String companyFeild) {
		this.companyFeild = companyFeild;
	}
	public String getCompanyScale() {
		return companyScale;
	}
	public void setCompanyScale(String companyScale) {
		this.companyScale = companyScale;
	}
	public String getCompanyHomePageURL() {
		return companyHomePageURL;
	}
	public void setCompanyHomePageURL(String companyHomePageURL) {
		this.companyHomePageURL = companyHomePageURL;
	}
	public String getCompanyDevelopeStage() {
		return companyDevelopeStage;
	}
	public void setCompanyDevelopeStage(String companyDevelopeStage) {
		this.companyDevelopeStage = companyDevelopeStage;
	}
//	public List<SimilarJob> getSimilarJob() {
//		return similarJob;
//	}
//	public void setSimilarJob(List<SimilarJob> similarJob) {
//		this.similarJob = similarJob;
//	}
//	public String getMoreSimiJobURL() {
//		return moreSimiJobURL;
//	}
//	public void setMoreSimiJobURL(String moreSimiJobURL) {
//		this.moreSimiJobURL = moreSimiJobURL;
//	}


	@Override
	public String toString() {
		return "Job{" +
				"postDepartment='" + postDepartment + '\'' +
				", post='" + post + '\'' +
				", salary='" + salary + '\'' +
				", workPlace='" + workPlace + '\'' +
				", experience='" + experience + '\'' +
				", educationBackground='" + educationBackground + '\'' +
				", jobKind='" + jobKind + '\'' +
				", welfare='" + welfare + '\'' +
				", publishTime='" + publishTime + '\'' +
				", jobFrom='" + jobFrom + '\'' +
				", duty='" + duty + '\'' +
				", postRequest='" + postRequest + '\'' +
				", positionAddress='" + positionAddress + '\'' +
				", jdPublisherName='" + jdPublisherName + '\'' +
				", jdPublisherPost='" + jdPublisherPost + '\'' +
				", jdPublisherDealRatio=" + jdPublisherDealRatio +
				", companyName='" + companyName + '\'' +
				", companyNickName='" + companyNickName + '\'' +
				", companyLagoHomePageURL='" + companyLagoHomePageURL + '\'' +
				", companyIconURL='" + companyIconURL + '\'' +
				", companyFeild='" + companyFeild + '\'' +
				", companyScale='" + companyScale + '\'' +
				", companyHomePageURL='" + companyHomePageURL + '\'' +
				", companyDevelopeStage='" + companyDevelopeStage + '\'' +
				", jobId=" + jobId +
				'}';
	}
}
