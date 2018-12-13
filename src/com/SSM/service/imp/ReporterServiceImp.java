package com.SSM.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.SSM.mapper.ReporterMapper;
import com.SSM.pojo.Dep_trans;
import com.SSM.pojo.Dimission;
import com.SSM.pojo.Employee;
import com.SSM.pojo.Post_trans;
import com.SSM.pojo.SelectDate;
import com.SSM.service.ReporterService;

public class ReporterServiceImp implements ReporterService {

	@Autowired
	private ReporterMapper reporterMapper;

	@Override
	public List<Employee> selectNewEmployeeReport(SelectDate selectDate) {
		return reporterMapper.selectNewEmployeeReport(selectDate);
	}

	@Override
	public List<Dimission> selectDimEmployeeReport(SelectDate selectDate) {
		return reporterMapper.selectDimEmployeeReport(selectDate);
	}

	@Override
	public List<Dep_trans> selectDep_transReport(SelectDate selectDate) {
		return reporterMapper.selectDep_transReport(selectDate);
	}

	@Override
	public List<Post_trans> selectPost_transReport(SelectDate selectDate) {
		return reporterMapper.selectPost_transReport(selectDate);
	}

}
