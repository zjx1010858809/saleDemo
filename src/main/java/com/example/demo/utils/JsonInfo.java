package com.example.demo.utils;

import java.io.Serializable;


public class JsonInfo implements Serializable{
private int status;

private int statusEx;
private String url="";
private Object obj;
private Object obj1;

public JsonInfo(int status, Object obj) {
	super();
	this.status = status;
	this.obj = obj;
}

public JsonInfo(int status, int statusEx) {
	super();
	this.status = status;
	this.statusEx = statusEx;
}

public JsonInfo() {
	// TODO Auto-generated constructor stub
}

public Object getObj1() {
	return obj1;
}


public int getStatusEx() {
	return statusEx;
}

public void setStatusEx(int statusEx) {
	this.statusEx = statusEx;
}

public void setObj1(Object obj1) {
	this.obj1 = obj1;
}



public JsonInfo(int status, Object obj, Object obj1) {
	super();
	this.status = status;
	this.obj = obj;
	this.obj1 = obj1;
}

public JsonInfo(Object obj) {
	super();
	this.obj = obj;
}

public Object getObj() {
	return obj;
}

public void setObj(Object obj) {
	this.obj = obj;
}

public JsonInfo(int status) {
	super();
	this.status = status;	
}

public JsonInfo(int status, String url) {
	super();
	this.status = status;
	this.url = url;
}

public String getUrl() {
	return url;
}

public void setUrl(String url) {
	this.url = url;
}

public int getStatus() {
	return status;
}

public void setStatus(int status) {
	this.status = status;
}

}
