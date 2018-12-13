package com.SSM.service;

import java.util.List;

import com.SSM.pojo.Employee;

public interface EmployeeService {

	//����id��ѯԱ������
	List<Employee> selectEmployeeById(int id);
	
	 //��ѯ������ְԱ��
    List<Employee> selectAllEmployee();

    //���Ա��
    void addEmployee(Employee employee);

    //����ID�޸�Ա��
    void updateEmployeeById(Employee employee);

    //����IDɾ��Ա��
    void deleteEmployeeById(int id);
    
    //����Ա����Ϣ�� ����id��ѯԱ��
    Employee selectEmployeeById_update(int id);
}
