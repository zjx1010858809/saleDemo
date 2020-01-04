package com.example.demo.entity;

public class Operator {
	
	int id;
	String nike;			//用户名
	String pass="123";			//密码
	String name;			//姓名
	String tel;				//电话
	int count;
	String comments;
	
	int type;				//类型  0讲师 1其他
	int power;				//权限  0管理员 1操作员
	int status;	
	
	private String[] type_name= {"讲师","其他"};//数字对应的文本
	private String[] power_name = {"管理员","操作员"};
	private String[] status_name = {"在职","离职"};
	
	private String powername;//文本
	private String typename;
	private String statusname;
	
	
	public String getStatusname() {
		return status_name[status];
	}

	public String getPowername() {
		return power_name[power];
	}
	
	public String getTypename() {
		return type_name[type];
	}
	
	public void setPowername(String powername) {
		this.powername = powername;
	}

	public void setTypename(String typename) {
		this.typename = typename;
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
	public int getPower() {
		return power;
	}
	public void setPower(int power) {
		this.power = power;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}	
	
}
