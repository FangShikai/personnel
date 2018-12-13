package com.SSM.pojo;

import java.util.Date;

public class Post_trans {
	private int post_trans_id;
	private Employee employee;
	private Post post;
	private String trans_type;
	private String trans_reason;
	private String note;
	private Date trans_date;
	public int getPost_trans_id() {
		return post_trans_id;
	}
	public void setPost_trans_id(int post_trans_id) {
		this.post_trans_id = post_trans_id;
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	public Post getPost() {
		return post;
	}
	public void setPost(Post post) {
		this.post = post;
	}
	public String getTrans_type() {
		return trans_type;
	}
	public void setTrans_type(String trans_type) {
		this.trans_type = trans_type;
	}
	public String getTrans_reason() {
		return trans_reason;
	}
	public void setTrans_reason(String trans_reason) {
		this.trans_reason = trans_reason;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public Date getTrans_date() {
		return trans_date;
	}
	public void setTrans_date(Date trans_date) {
		this.trans_date = trans_date;
	}
	@Override
	public String toString() {
		return "Post_trans [post_trans_id=" + post_trans_id + ", employee=" + employee + ", post=" + post
				+ ", trans_type=" + trans_type + ", trans_reason=" + trans_reason + ", note=" + note + ", trans_date="
				+ trans_date + "]";
	}
	

}
