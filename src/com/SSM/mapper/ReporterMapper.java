package com.SSM.mapper;

import java.util.List;

import com.SSM.pojo.Dep_trans;
import com.SSM.pojo.Dimission;
import com.SSM.pojo.Employee;
import com.SSM.pojo.Post_trans;
import com.SSM.pojo.SelectDate;

public interface ReporterMapper {
	//��ƸԱ������
	List<Employee> selectNewEmployeeReport(SelectDate selectDate);
	
	//��ְԱ������
	List<Dimission> selectDimEmployeeReport(SelectDate selectDate);
	
	//���ŵ���Ա������
	List<Dep_trans> selectDep_transReport(SelectDate selectDate);
	
	//��λ����Ա������
	List<Post_trans> selectPost_transReport(SelectDate selectDate);
}
