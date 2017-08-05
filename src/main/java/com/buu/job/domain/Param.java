package com.buu.job.domain;

public class Param {
	private String jobCat;
	private String city;
	private String wy;
	private String edu;
	private String rz;
	private String field;
	private int sort;
	private String sal;
	private String nature;
	public Param(String jobCat, String city, String wy, String edu, String rz, String field, int sort, String sal, String nature) {
		this.jobCat = jobCat;
		this.city = city;
		this.wy = wy;
		this.edu = edu;
		this.rz = rz;
		this.field = field;
		this.sort = sort;
		this.sal = sal;
		this.nature = nature;
	}

	public String getJobCat() {
		return jobCat;
	}

	public void setJobCat(String jobCat) {
		this.jobCat = jobCat;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getWy() {
		return wy;
	}

	public void setWy(String wy) {
		this.wy = wy;
	}

	public String getEdu() {
		return edu;
	}

	public void setEdu(String edu) {
		this.edu = edu;
	}

	public String getRz() {
		return rz;
	}

	public void setRz(String rz) {
		this.rz = rz;
	}

	public String getField() {
		return field;
	}

	public void setField(String field) {
		this.field = field;
	}

	public int getSort() {
		return sort;
	}

	public void setSort(int sort) {
		this.sort = sort;
	}

	public String getSal() {
		return sal;
	}

	public void setSal(String sal) {
		this.sal = sal;
	}

	public String getNature() {
		return nature;
	}

	public void setNature(String nature) {
		this.nature = nature;
	}
}
