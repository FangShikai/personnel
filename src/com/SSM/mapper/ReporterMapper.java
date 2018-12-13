package com.SSM.mapper;

import java.util.List;

import com.SSM.pojo.Dep_trans;
import com.SSM.pojo.Dimission;
import com.SSM.pojo.Employee;
import com.SSM.pojo.Post_trans;
import com.SSM.pojo.SelectDate;

public interface ReporterMapper {
	//新聘员工报表
	List<Employee> selectNewEmployeeReport(SelectDate selectDate);
	
	//离职员工报表
	List<Dimission> selectDimEmployeeReport(SelectDate selectDate);
	
	//部门调动员工报表
	List<Dep_trans> selectDep_transReport(SelectDate selectDate);
	
	//岗位调动员工报表
	List<Post_trans> selectPost_transReport(SelectDate selectDate);
}
