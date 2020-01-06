package com.example.demo.entity;

public class User {
	private int id;
	private String nike;
	private String pass="123";
	private String name;
	private int type;
	private String tel;
	private String classinfo;
	private int ylevel;
	private int glevel;
	private String qq;
	private int slevel;
	private int school_id;
	private int college_id;
	private int status;
	private String info;
	private String createdate;
	private int operator_id;
	private String comments;
	private int count;
	private String school_name;
	private String college_name;
	
	private int sex;//数字
	
	private String[] sex_name= {"男","女"};//数字对应的文本
	private String[] type_name = {"学生","辅导员","临时"};
	
	private String sexname;//文本
	private String typename;
	

	public String getSexname() {
		return sex_name[sex];
	}

	public String getTypename() {
		return type_name[type];
	}

	public String getSchool_name() {
		return school_name;
	}

	public void setSchool_name(String school_name) {
		this.school_name = school_name;
	}

	public String getCollege_name() {
		return college_name;
	}

	public void setCollege_name(String college_name) {
		this.college_name = college_name;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNike() {
		return nike;
	}

	public void setNike(String nike) {
		this.nike = nike;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getClassinfo() {
		return classinfo;
	}

	public void setClassinfo(String classinfo) {
		this.classinfo = classinfo;
	}

	public int getYlevel() {
		return ylevel;
	}

	public void setYlevel(int ylevel) {
		this.ylevel = ylevel;
	}

	public int getGlevel() {
		return glevel;
	}

	public void setGlevel(int glevel) {
		this.glevel = glevel;
	}

	public int getSex() {
		return sex;
	}

	public void setSex(int sex) {
		this.sex = sex;
	}

	public String getQq() {
		return qq;
	}

	public void setQq(String qq) {
		this.qq = qq;
	}

	public int getSlevel() {
		return slevel;
	}

	public void setSlevel(int slevel) {
		this.slevel = slevel;
	}

	public int getSchool_id() {
		return school_id;
	}

	public void setSchool_id(int school_id) {
		this.school_id = school_id;
	}

	public int getCollege_id() {
		return college_id;
	}

	public void setCollege_id(int college_id) {
		this.college_id = college_id;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public String getCreatedate() {
		return createdate;
	}

	public void setCreatedate(String createdate) {
		this.createdate = createdate;
	}

	public int getOperator_id() {
		return operator_id;
	}

	public void setOperator_id(int operator_id) {
		this.operator_id = operator_id;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

}
