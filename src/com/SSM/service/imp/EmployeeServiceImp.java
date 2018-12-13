package com.SSM.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.SSM.mapper.EmployeeMapper;
import com.SSM.pojo.Employee;
import com.SSM.service.EmployeeService;

public class EmployeeServiceImp implements EmployeeService{
	
	@Autowired
	private EmployeeMapper employeeMapper;

	
	
	@Override
	public List<Employee> selectAllEmployee() {
		return employeeMapper.selectAllEmployee();
	
	}

	@Override
	public void addEmployee(Employee employee) {
		employeeMapper.addEmployee(employee);
	}

	@Override
	public void updateEmployeeById(Employee employee) {
		employeeMapper.updateEmployeeById(employee);
		
	}

	@Override
	public void deleteEmployeeById(int id) {
		employeeMapper.deleteEmployeeById(id);
		
	}

	@Override
	public List<Employee> selectEmployeeById(int id) {
		return employeeMapper.selectEmployeeById(id);
	}

	@Override
	public Employee selectEmployeeById_update(int id) {
		return employeeMapper.selectEmployeeById_update(id);
	}

	

}
