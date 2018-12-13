package com.SSM.service;

import java.util.List;

import com.SSM.pojo.Employee;

public interface EmployeeService {

	//根据id查询员工对象
	List<Employee> selectEmployeeById(int id);
	
	 //查询所有在职员工
    List<Employee> selectAllEmployee();

    //添加员工
    void addEmployee(Employee employee);

    //根据ID修改员工
    void updateEmployeeById(Employee employee);

    //根据ID删除员工
    void deleteEmployeeById(int id);
    
    //更新员工信息的 根据id查询员工
    Employee selectEmployeeById_update(int id);
}
