package com.SSM.mapper;

import java.util.List;

import com.SSM.pojo.Department;

public interface DepartmentMapper {
	
	//显示所有部门信息
	List<Department> selectAllDepartment();
	
	//根据部门id查询部门
	List<Department> selectDepartment(int dep_id);
	
	//新建部门
	void addDepartment(Department department);
	
	//修改部门
	void updateDepartment(Department department);
	
	//根据部门id删除部门
	void deleteDepartment(int dep_id);
	
	//显示需要修改的部门信息，即通过部门id查询部门信息
	Department selectDepartmentById_update(int dep_id);
	
	//根据部门id查询部门下所有员工
	List<Department> selectDepartmentAllEmployee(int dep_id);
	
}
