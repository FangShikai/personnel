package com.SSM.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.SSM.mapper.Dep_transMapper;
import com.SSM.pojo.Dep_trans;
import com.SSM.pojo.Employee;
import com.SSM.service.Dep_transService;

public class Dep_transServiceImp implements Dep_transService {

	// 依赖注入
	@Autowired
	private Dep_transMapper dep_transMapper;

	// 重写Dep_transService类里的方法
	// 显示部门调转的所有信息
	@Override
	public List<Dep_trans> selectAllDep_trans() {
		return dep_transMapper.selectAllDep_trans();
	}

	// 通过员工id查询部门调转信息
	@Override
	public List<Dep_trans> selectEmployeeDep_trans(int emp_id) {
		return dep_transMapper.selectEmployeeDep_trans(emp_id);
	}

	// 根据调转信息id删除员工的调转信息
	@Override
	public void deleteEmployeeDep_trans(int dep_trans_id) {
		dep_transMapper.deleteEmployeeDep_trans(dep_trans_id);
	}

	// 显示需要修改的调转信息，即通过调转id查询员工的部门调转信息
	@Override
	public Dep_trans selectDep_transById_update(int dep_trans_id) {
		return dep_transMapper.selectDep_transById_update(dep_trans_id);
	}

	// 根据调转信息id修改员工的调转信息
	@Override
	public void updateDep_trans(Dep_trans dep_trans) {
		dep_transMapper.updateDep_trans(dep_trans);
	}

	// 显示所有员工的部分信息
	@Override
	public List<Employee> selectAllEmployee() {
		return dep_transMapper.selectAllEmployee();
	}

	// 通过员工id查询员工的部分信息
	@Override
	public List<Employee> selectEmployeeById(int emp_id) {
		return dep_transMapper.selectEmployeeById(emp_id);
	}

	// 进行员工的部门调动
	@Override
	public void addDep_trans(Dep_trans dep_trans) {
		dep_transMapper.addDep_trans(dep_trans);
	}

	// 员工进行调动之后，相应的修改员工表的部门id
	@Override
	public void updateEmployeeDepId(Dep_trans dep_trans) {
		dep_transMapper.updateEmployeeDepId(dep_trans);
	}

	@Override
	public Employee selectNowDepartmentById(int emp_id) {
		return dep_transMapper.selectNowDepartmentById(emp_id);
	}
}
