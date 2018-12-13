package com.SSM.pojo;

import java.util.Date;
import java.util.List;

public class Department {
	private int dep_id;
    private String dep_name;
    private String dep_type;
    private String dep_phone;
    private String dep_far;
    private String dep_describe;
    private int dep_sup;
    private Date estdate;
    private List<Employee>employeeList;
    private List<Probation> probationList;
    private List<Dep_trans>dep_transList;
    private List<Post_trans>post_transList;
	public int getDep_id() {
		return dep_id;
	}
	public void setDep_id(int dep_id) {
		this.dep_id = dep_id;
	}
	public String getDep_name() {
		return dep_name;
	}
	public void setDep_name(String dep_name) {
		this.dep_name = dep_name;
	}
	public String getDep_type() {
		return dep_type;
	}
	public void setDep_type(String dep_type) {
		this.dep_type = dep_type;
	}
	public String getDep_phone() {
		return dep_phone;
	}
	public void setDep_phone(String dep_phone) {
		this.dep_phone = dep_phone;
	}
	public String getDep_far() {
		return dep_far;
	}
	public void setDep_far(String dep_far) {
		this.dep_far = dep_far;
	}
	public String getDep_describe() {
		return dep_describe;
	}
	public void setDep_describe(String dep_describe) {
		this.dep_describe = dep_describe;
	}
	public int getDep_sup() {
		return dep_sup;
	}
	public void setDep_sup(int dep_sup) {
		this.dep_sup = dep_sup;
	}
	public Date getEstdate() {
		return estdate;
	}
	public void setEstdate(Date estdate) {
		this.estdate = estdate;
	}
	public List<Employee> getEmployeeList() {
		return employeeList;
	}
	public void setEmployeeList(List<Employee> employeeList) {
		this.employeeList = employeeList;
	}
	public List<Probation> getProbationList() {
		return probationList;
	}
	public void setProbationList(List<Probation> probationList) {
		this.probationList = probationList;
	}
	public List<Dep_trans> getDep_transList() {
		return dep_transList;
	}
	public void setDep_transList(List<Dep_trans> dep_transList) {
		this.dep_transList = dep_transList;
	}
	public List<Post_trans> getPost_transList() {
		return post_transList;
	}
	public void setPost_transList(List<Post_trans> post_transList) {
		this.post_transList = post_transList;
	}
	@Override
	public String toString() {
		return "Department [dep_id=" + dep_id + ", dep_name=" + dep_name + ", dep_type=" + dep_type + ", dep_phone="
				+ dep_phone + ", dep_far=" + dep_far + ", dep_describe=" + dep_describe + ", dep_sup=" + dep_sup
				+ ", estdate=" + estdate + ", employeeList=" + employeeList + ", probationList=" + probationList
				+ ", dep_transList=" + dep_transList + ", post_transList=" + post_transList + "]";
	}
	
    
}
