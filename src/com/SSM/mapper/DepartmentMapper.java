package com.SSM.mapper;

import java.util.List;

import com.SSM.pojo.Department;

public interface DepartmentMapper {
	
	//��ʾ���в�����Ϣ
	List<Department> selectAllDepartment();
	
	//���ݲ���id��ѯ����
	List<Department> selectDepartment(int dep_id);
	
	//�½�����
	void addDepartment(Department department);
	
	//�޸Ĳ���
	void updateDepartment(Department department);
	
	//���ݲ���idɾ������
	void deleteDepartment(int dep_id);
	
	//��ʾ��Ҫ�޸ĵĲ�����Ϣ����ͨ������id��ѯ������Ϣ
	Department selectDepartmentById_update(int dep_id);
	
	//���ݲ���id��ѯ����������Ա��
	List<Department> selectDepartmentAllEmployee(int dep_id);
	
}
