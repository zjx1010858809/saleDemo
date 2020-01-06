package com.example.demo.utils;

public class UserSearchInfo extends SearchInfo{
	Integer school_id;
	Integer college_id;
	String nameinfo;
	String telinfo;
	Integer glevel;
	Integer ylevel;
	Integer slevel;
	Integer type = 0;
	
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	public Integer getSchool_id() {
		return school_id;
	}
	public void setSchool_id(Integer school_id) {
		this.school_id = school_id;
	}
	public Integer getCollege_id() {
		return college_id;
	}
	public void setCollege_id(Integer college_id) {
		this.college_id = college_id;
	}
	public String getNameinfo() {
		return nameinfo;
	}
	public void setNameinfo(String nameinfo) {
		this.nameinfo = nameinfo;
	}
	public String getTelinfo() {
		return telinfo;
	}
	public void setTelinfo(String telinfo) {
		this.telinfo = telinfo;
	}
	public Integer getGlevel() {
		return glevel;
	}
	public void setGlevel(Integer glevel) {
		this.glevel = glevel;
	}
	public Integer getYlevel() {
		return ylevel;
	}
	public void setYlevel(Integer ylevel) {
		this.ylevel = ylevel;
	}
	public Integer getSlevel() {
		return slevel;
	}
	public void setSlevel(Integer slevel) {
		this.slevel = slevel;
	}
	
	
}
