package com.SSM.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.SSM.mapper.Dep_transMapper;
import com.SSM.pojo.Dep_trans;
import com.SSM.pojo.Employee;
import com.SSM.service.Dep_transService;

public class Dep_transServiceImp implements Dep_transService {

	// ����ע��
	@Autowired
	private Dep_transMapper dep_transMapper;

	// ��дDep_transService����ķ���
	// ��ʾ���ŵ�ת��������Ϣ
	@Override
	public List<Dep_trans> selectAllDep_trans() {
		return dep_transMapper.selectAllDep_trans();
	}

	// ͨ��Ա��id��ѯ���ŵ�ת��Ϣ
	@Override
	public List<Dep_trans> selectEmployeeDep_trans(int emp_id) {
		return dep_transMapper.selectEmployeeDep_trans(emp_id);
	}

	// ���ݵ�ת��Ϣidɾ��Ա���ĵ�ת��Ϣ
	@Override
	public void deleteEmployeeDep_trans(int dep_trans_id) {
		dep_transMapper.deleteEmployeeDep_trans(dep_trans_id);
	}

	// ��ʾ��Ҫ�޸ĵĵ�ת��Ϣ����ͨ����תid��ѯԱ���Ĳ��ŵ�ת��Ϣ
	@Override
	public Dep_trans selectDep_transById_update(int dep_trans_id) {
		return dep_transMapper.selectDep_transById_update(dep_trans_id);
	}

	// ���ݵ�ת��Ϣid�޸�Ա���ĵ�ת��Ϣ
	@Override
	public void updateDep_trans(Dep_trans dep_trans) {
		dep_transMapper.updateDep_trans(dep_trans);
	}

	// ��ʾ����Ա���Ĳ�����Ϣ
	@Override
	public List<Employee> selectAllEmployee() {
		return dep_transMapper.selectAllEmployee();
	}

	// ͨ��Ա��id��ѯԱ���Ĳ�����Ϣ
	@Override
	public List<Employee> selectEmployeeById(int emp_id) {
		return dep_transMapper.selectEmployeeById(emp_id);
	}

	// ����Ա���Ĳ��ŵ���
	@Override
	public void addDep_trans(Dep_trans dep_trans) {
		dep_transMapper.addDep_trans(dep_trans);
	}

	// Ա�����е���֮����Ӧ���޸�Ա����Ĳ���id
	@Override
	public void updateEmployeeDepId(Dep_trans dep_trans) {
		dep_transMapper.updateEmployeeDepId(dep_trans);
	}

	@Override
	public Employee selectNowDepartmentById(int emp_id) {
		return dep_transMapper.selectNowDepartmentById(emp_id);
	}
}
