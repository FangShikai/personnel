package com.SSM.pojo;

import java.util.List;

public class Post {
    private int post_id;
    private String post_name;
    private String post_type;
    private int strength;
    private List<Employee>employeeList;
    private List<Post_trans>post_transList;
	public int getPost_id() {
		return post_id;
	}
	public void setPost_id(int post_id) {
		this.post_id = post_id;
	}
	public String getPost_name() {
		return post_name;
	}
	public void setPost_name(String post_name) {
		this.post_name = post_name;
	}
	public String getPost_type() {
		return post_type;
	}
	public void setPost_type(String post_type) {
		this.post_type = post_type;
	}
	public int getStrength() {
		return strength;
	}
	public void setStrength(int strength) {
		this.strength = strength;
	}
	public List<Employee> getEmployeeList() {
		return employeeList;
	}
	public void setEmployeeList(List<Employee> employeeList) {
		this.employeeList = employeeList;
	}
	public List<Post_trans> getPost_transList() {
		return post_transList;
	}
	public void setPost_transList(List<Post_trans> post_transList) {
		this.post_transList = post_transList;
	}
	@Override
	public String toString() {
		return "Post [post_id=" + post_id + ", post_name=" + post_name + ", post_type=" + post_type + ", strength="
				+ strength + ", employeeList=" + employeeList + ", post_transList=" + post_transList + "]";
	}
    
}
