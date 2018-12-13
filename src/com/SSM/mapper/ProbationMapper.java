package com.SSM.mapper;

import java.util.Date;
import java.util.List;

import com.SSM.pojo.Probation;

public interface ProbationMapper {
	//查询所有试用期信息
	List<Probation> selectAllProbation();
	
	//根据id查询试用期信息
	List<Probation> selectProbationById(int pro_id);
	
	//插入试用期信息
	void addProbationById(Probation probation);
	
	//修改结果(转正，不予录用)
	void updateProbation_pass(Probation probation);
	
	//修改结果(延期)
	void updateProbation_delay(Probation probation);
	
	//已转正员工信息查询
	List<Probation> selectPassEmployee();
	
	//根据id查询试用期截止日期
	Date selectProbationDateById(int pro_id);
	
	//根据id修改试用期截止日期
	void updateProbationDateByID(Probation probation);

}
