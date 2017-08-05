package com.buu.job.domain;

import java.util.List;

public class Page<T> {
	private int total;//总数
	private int pages;//总页数
	private int page;//当前页
	private int rows;//当前页的条目数
	private List<T> list;
	private Param param;
	public Param getParam() {
		return param;
	}
	public void setParam(Param param) {
		this.param = param;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public int getPages() {
		if(total%rows==0){
			return total/rows;			
		}
		else {
			return total/rows+1;						
		}
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public int getRows() {
		return rows;
	}
	public void setRows(int rows) {
		this.rows = rows;
	}
	public List<T> getList() {
		return list;
	}
	public void setList(List<T> list) {
		this.list = list;
	}
	
}
