package com.SSM.mapper;

import java.util.List;

import com.SSM.pojo.Dimission;

public interface DimissionMapper {
	// ȷ��������ְԱ����Ϣ
	List<Dimission> selectAllDimission_not();
 
	// ͨ��ID��ѯ��ְԱ��
	List<Dimission> selectDimission_not_ById(int id);

	// ��ѯ������ְԱ����Ϣ
	List<Dimission> selectAllDimission();
	
	// ͨ��ID��ѯ��ְԱ����Ϣ
	List<Dimission> selectDimissionById(int id);

	// �����ְ��Ϣ
	void addDimission(Dimission dimission);

	// �޸���ְ��Ϣ
	void updateDimission(Dimission dimission);

	// ��ʾҪ�޸���Ϣ�� ����id��ѯ��ְ��Ϣ
	Dimission selectDimissionById_show(int emp_id);


}
