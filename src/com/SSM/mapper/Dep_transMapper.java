package com.SSM.mapper;

import java.util.List;

import com.SSM.pojo.Dep_trans;
import com.SSM.pojo.Employee;

public interface Dep_transMapper {
	
	//��ʾ���ŵ�ת��������Ϣ
	List<Dep_trans> selectAllDep_trans();
	
	//ͨ��Ա��id��ѯ���ŵ�ת��Ϣ
	List<Dep_trans> selectEmployeeDep_trans(int emp_id);
	
	//���ݵ�ת��Ϣidɾ��Ա���Ĳ��ŵ�ת��Ϣ
	void deleteEmployeeDep_trans(int dep_trans_id);
	
	//��ʾ��Ҫ�޸ĵĵ�ת��Ϣ����ͨ����תid��ѯԱ���Ĳ��ŵ�ת��Ϣ
	Dep_trans selectDep_transById_update(int dep_trans_id);
	
	//���ݵ�ת��Ϣid�޸�Ա���ĵ�ת��Ϣ
	void updateDep_trans(Dep_trans dep_trans);
	
	//��ʾ����Ա���Ĳ�����Ϣ
	List<Employee> selectAllEmployee();
	
	//ͨ��Ա��id��ѯԱ���Ĳ�����Ϣ
	List<Employee> selectEmployeeById(int emp_id);
	
	//����֮ǰ��ʾ���е���Ϣ�������ֶ���д
	Employee selectNowDepartmentById(int emp_id);
	
	//����Ա���Ĳ��ŵ���
	void addDep_trans(Dep_trans dep_trans);
	
	//Ա�����е���֮����Ӧ���޸�Ա����Ĳ���id
	void updateEmployeeDepId(Dep_trans dep_trans);
}
