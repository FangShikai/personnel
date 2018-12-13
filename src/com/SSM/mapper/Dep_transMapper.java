package com.SSM.mapper;

import java.util.List;

import com.SSM.pojo.Dep_trans;
import com.SSM.pojo.Employee;

public interface Dep_transMapper {
	
	//显示部门调转的所有信息
	List<Dep_trans> selectAllDep_trans();
	
	//通过员工id查询部门调转信息
	List<Dep_trans> selectEmployeeDep_trans(int emp_id);
	
	//根据调转信息id删除员工的部门调转信息
	void deleteEmployeeDep_trans(int dep_trans_id);
	
	//显示需要修改的调转信息，即通过调转id查询员工的部门调转信息
	Dep_trans selectDep_transById_update(int dep_trans_id);
	
	//根据调转信息id修改员工的调转信息
	void updateDep_trans(Dep_trans dep_trans);
	
	//显示所有员工的部分信息
	List<Employee> selectAllEmployee();
	
	//通过员工id查询员工的部分信息
	List<Employee> selectEmployeeById(int emp_id);
	
	//调动之前显示已有的信息，不用手动填写
	Employee selectNowDepartmentById(int emp_id);
	
	//进行员工的部门调动
	void addDep_trans(Dep_trans dep_trans);
	
	//员工进行调动之后，相应的修改员工表的部门id
	void updateEmployeeDepId(Dep_trans dep_trans);
}
