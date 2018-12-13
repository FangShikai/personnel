package com.SSM.mapper;

import java.util.List;

import com.SSM.pojo.Dimission;

public interface DimissionMapper {
	// 确定所有在职员工信息
	List<Dimission> selectAllDimission_not();
 
	// 通过ID查询在职员工
	List<Dimission> selectDimission_not_ById(int id);

	// 查询所有离职员工信息
	List<Dimission> selectAllDimission();
	
	// 通过ID查询离职员工信息
	List<Dimission> selectDimissionById(int id);

	// 添加离职信息
	void addDimission(Dimission dimission);

	// 修改离职信息
	void updateDimission(Dimission dimission);

	// 显示要修改信息的 根据id查询离职信息
	Dimission selectDimissionById_show(int emp_id);


}
