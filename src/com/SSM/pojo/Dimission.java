package com.SSM.pojo;

import java.util.Date;

public class Dimission {
	private int dim_id;
	private Employee employee;
	private Date dim_date;
	private String dim_type;
	private String dim_direc;
	private String note;
	public int getDim_id() {
		return dim_id;
	}
	public void setDim_id(int dim_id) {
		this.dim_id = dim_id;
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	public Date getDim_date() {
		return dim_date;
	}
	public void setDim_date(Date dim_date) {
		this.dim_date = dim_date;
	}
	public String getDim_type() {
		return dim_type;
	}
	public void setDim_type(String dim_type) {
		this.dim_type = dim_type;
	}
	public String getDim_direc() {
		return dim_direc;
	}
	public void setDim_direc(String dim_direc) {
		this.dim_direc = dim_direc;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	@Override
	public String toString() {
		return "Dimission [dim_id=" + dim_id + ", employee=" + employee + ", dim_date=" + dim_date + ", dim_type="
				+ dim_type + ", dim_direc=" + dim_direc + ", note=" + note + "]";
	}

	
}
