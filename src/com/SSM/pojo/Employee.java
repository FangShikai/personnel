package com.SSM.pojo;

import java.util.Date;
import java.util.List;

public class Employee {
	private int emp_id;
    private String emp_name;
    private String emp_sex;
    private Date birthday;
    private Department department;
    private Post post;
    private Date entry_date;
    private Date work_date;
    private String work_type;
    private String nation;
    private String emp_phone;
    private String email;
    private Probation probation;
    private Dimission dimission;
    private List<Dep_trans>dep_transList;
	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	public String getEmp_name() {
		return emp_name;
	}
	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}
	public String getEmp_sex() {
		return emp_sex;
	}
	public void setEmp_sex(String emp_sex) {
		this.emp_sex = emp_sex;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	public Post getPost() {
		return post;
	}
	public void setPost(Post post) {
		this.post = post;
	}
	public Date getEntry_date() {
		return entry_date;
	}
	public void setEntry_date(Date entry_date) {
		this.entry_date = entry_date;
	}
	public Date getWork_date() {
		return work_date;
	}
	public void setWork_date(Date work_date) {
		this.work_date = work_date;
	}
	public String getWork_type() {
		return work_type;
	}
	public void setWork_type(String work_type) {
		this.work_type = work_type;
	}
	public String getNation() {
		return nation;
	}
	public void setNation(String nation) {
		this.nation = nation;
	}
	public String getEmp_phone() {
		return emp_phone;
	}
	public void setEmp_phone(String emp_phone) {
		this.emp_phone = emp_phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Probation getProbation() {
		return probation;
	}
	public void setProbation(Probation probation) {
		this.probation = probation;
	}
	public Dimission getDimission() {
		return dimission;
	}
	public void setDimission(Dimission dimission) {
		this.dimission = dimission;
	}
	public List<Dep_trans> getDep_transList() {
		return dep_transList;
	}
	public void setDep_transList(List<Dep_trans> dep_transList) {
		this.dep_transList = dep_transList;
	}
	@Override
	public String toString() {
		return "Employee [emp_id=" + emp_id + ", emp_name=" + emp_name + ", emp_sex=" + emp_sex + ", birthday="
				+ birthday + ", department=" + department + ", post=" + post + ", entry_date=" + entry_date
				+ ", work_date=" + work_date + ", work_type=" + work_type + ", nation=" + nation + ", emp_phone="
				+ emp_phone + ", email=" + email + ", probation=" + probation + ", dimission=" + dimission
				+ ", dep_transList=" + dep_transList + "]";
	}
    
}
