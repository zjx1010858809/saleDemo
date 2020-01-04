package com.example.demo.utils;

public class SearchInfo {
	private int limit=1000;
	private int page=1;
	private String where="";
	private String limits="";

	public int getLimit() {
		return limit;
	}

	public String getLimits() {
		return limits;
	}

	public void setLimits(String limits) {
		this.limits = limits;
	}

	public void setLimit(int limit) {
		this.limit = limit;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
		limits=" limit "+(page-1)*limit+","+limit*page;
	}

	public String getWhere() {
		return where;
	}

	public void setWhere(String where) {
		this.where = where;
	}


}
