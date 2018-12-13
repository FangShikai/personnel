package com.SSM.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.SSM.mapper.DimissionMapper;
import com.SSM.pojo.Dimission;
import com.SSM.service.DimissionService;

public class DimissionServiceImp implements DimissionService {
	@Autowired
	private DimissionMapper dimissionMapper;

	@Override
	public List<Dimission> selectAllDimission_not() {
		return dimissionMapper.selectAllDimission_not();
	}

	@Override
	public List<Dimission> selectAllDimission() {
		return dimissionMapper.selectAllDimission();
	}

	@Override
	public void addDimission(Dimission dimission) {
		dimissionMapper.addDimission(dimission);

	}

	@Override
	public void updateDimission(Dimission dimission) {
		dimissionMapper.updateDimission(dimission);

	}

	@Override
	public List<Dimission> selectDimission_not_ById(int id) {
		return dimissionMapper.selectDimission_not_ById(id);
	}

	@Override
	public List<Dimission> selectDimissionById(int id) {

		return dimissionMapper.selectDimissionById(id);
	}

	@Override
	public Dimission selectDimissionById_show(int emp_id) {

		return dimissionMapper.selectDimissionById_show(emp_id);
	}

}
