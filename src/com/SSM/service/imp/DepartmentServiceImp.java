package com.SSM.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import com.SSM.mapper.DepartmentMapper;
import com.SSM.pojo.Department;
import com.SSM.service.DepartmentService;

public class DepartmentServiceImp implements DepartmentService {

	// 依赖注入
	@Autowired
	private DepartmentMapper departmentMapper;

	// 重写DepartmentService类里的方法

	// 显示所有部门信息
	@Override
	public List<Department> selectAllDepartment() {

		return departmentMapper.selectAllDepartment();
	}

	// 新建部门
	@Override
	public void addDepartment(Department department) {

		departmentMapper.addDepartment(department);
	}

	// 根据部门id修改部门
	@Override
	public void updateDepartment(Department department) {

		departmentMapper.updateDepartment(department);
	}

	// 根据部门id删除部门
	@Override
	public void deleteDepartment(int dep_id) {

		departmentMapper.deleteDepartment(dep_id);
	}

	// 显示需要修改的部门信息，即通过部门id查询部门信息
	@Override
	public Department selectDepartmentById_update(int dep_id) {

		return departmentMapper.selectDepartmentById_update(dep_id);
	}

	// 根据部门id查询部门下所有员工
	@Override
	public List<Department> selectDepartmentAllEmployee(int dep_id) {
		return departmentMapper.selectDepartmentAllEmployee(dep_id);
	}

	// 根据部门id查询部门
	@Override
	public List<Department> selectDepartment(int dep_id) {

		return departmentMapper.selectDepartment(dep_id);
	}
}
