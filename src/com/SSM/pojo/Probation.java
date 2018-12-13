package com.SSM.pojo;

import java.util.Date;



public class Probation {

	private int pro_id;
	private Employee Employee;
	private Date start_date;
	private Date end_date;
	private String evaluate;
	private String result;
	private String note;
	public int getPro_id() {
		return pro_id;
	}
	public void setPro_id(int pro_id) {
		this.pro_id = pro_id;
	}
	public Employee getEmployee() {
		return Employee;
	}
	public void setEmployee(Employee employee) {
		Employee = employee;
	}
	public Date getStart_date() {
		return start_date;
	}
	public void setStart_date(Date start_date) {
		this.start_date = start_date;
	}
	public Date getEnd_date() {
		return end_date;
	}
	public void setEnd_date(Date end_date) {
		this.end_date = end_date;
	}
	public String getEvaluate() {
		return evaluate;
	}
	public void setEvaluate(String evaluate) {
		this.evaluate = evaluate;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	@Override
	public String toString() {
		return "Probation [pro_id=" + pro_id + ", Employee=" + Employee + ", start_date=" + start_date + ", end_date="
				+ end_date + ", evaluate=" + evaluate + ", result=" + result + ", note=" + note + "]";
	}
	

	
}
