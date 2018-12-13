package com.SSM.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import com.SSM.mapper.DepartmentMapper;
import com.SSM.pojo.Department;
import com.SSM.service.DepartmentService;

public class DepartmentServiceImp implements DepartmentService {

	// ����ע��
	@Autowired
	private DepartmentMapper departmentMapper;

	// ��дDepartmentService����ķ���

	// ��ʾ���в�����Ϣ
	@Override
	public List<Department> selectAllDepartment() {

		return departmentMapper.selectAllDepartment();
	}

	// �½�����
	@Override
	public void addDepartment(Department department) {

		departmentMapper.addDepartment(department);
	}

	// ���ݲ���id�޸Ĳ���
	@Override
	public void updateDepartment(Department department) {

		departmentMapper.updateDepartment(department);
	}

	// ���ݲ���idɾ������
	@Override
	public void deleteDepartment(int dep_id) {

		departmentMapper.deleteDepartment(dep_id);
	}

	// ��ʾ��Ҫ�޸ĵĲ�����Ϣ����ͨ������id��ѯ������Ϣ
	@Override
	public Department selectDepartmentById_update(int dep_id) {

		return departmentMapper.selectDepartmentById_update(dep_id);
	}

	// ���ݲ���id��ѯ����������Ա��
	@Override
	public List<Department> selectDepartmentAllEmployee(int dep_id) {
		return departmentMapper.selectDepartmentAllEmployee(dep_id);
	}

	// ���ݲ���id��ѯ����
	@Override
	public List<Department> selectDepartment(int dep_id) {

		return departmentMapper.selectDepartment(dep_id);
	}
}
