package com.SSM.pojo;

import java.util.Date;


public class Dep_trans {
	private int dep_trans_id;
	private Employee employee;
	private Department department;
	private String trans_type;
	private String trans_reason;
	private String note;
	private Date trans_date;
	public int getDep_trans_id() {
		return dep_trans_id;
	}
	public void setDep_trans_id(int dep_trans_id) {
		this.dep_trans_id = dep_trans_id;
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
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
		return "Dep_trans [dep_trans_id=" + dep_trans_id + ", employee=" + employee + ", department=" + department
				+ ", trans_type=" + trans_type + ", trans_reason=" + trans_reason + ", note=" + note + ", trans_date="
				+ trans_date + "]";
	}
	
	

}
