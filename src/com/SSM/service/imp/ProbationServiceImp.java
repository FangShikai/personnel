package com.SSM.service.imp;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.SSM.mapper.ProbationMapper;
import com.SSM.pojo.Probation;
import com.SSM.service.ProbationService;

public class ProbationServiceImp implements ProbationService{
	@Autowired
	private ProbationMapper probationMapper;

	@Override
	public List<Probation> selectAllProbation() {
		return probationMapper.selectAllProbation();
	}

	@Override
	public void addProbationById(Probation probation) {
		probationMapper.addProbationById(probation);
		
	}

	@Override
	public void updateProbation_pass(Probation probation) {
		probationMapper.updateProbation_pass(probation);
		
	}

	@Override
	public void updateProbation_delay(Probation probation) {
		probationMapper.updateProbation_delay(probation);
		
	}

	@Override
	public List<Probation> selectPassEmployee() {
		return probationMapper.selectPassEmployee();
	}

	@Override
	public List<Probation> selectProbationById(int pro_id) {
		return probationMapper.selectProbationById(pro_id);
	}

	@Override
	public Date selectProbationDateById(int pro_id) {
		return probationMapper.selectProbationDateById(pro_id);
	}

	@Override
	public void updateProbationDateByID(Probation probation) {
		probationMapper.updateProbationDateByID(probation);
		
	}

	

}
