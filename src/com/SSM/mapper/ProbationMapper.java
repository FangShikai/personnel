package com.SSM.mapper;

import java.util.Date;
import java.util.List;

import com.SSM.pojo.Probation;

public interface ProbationMapper {
	//��ѯ������������Ϣ
	List<Probation> selectAllProbation();
	
	//����id��ѯ��������Ϣ
	List<Probation> selectProbationById(int pro_id);
	
	//������������Ϣ
	void addProbationById(Probation probation);
	
	//�޸Ľ��(ת��������¼��)
	void updateProbation_pass(Probation probation);
	
	//�޸Ľ��(����)
	void updateProbation_delay(Probation probation);
	
	//��ת��Ա����Ϣ��ѯ
	List<Probation> selectPassEmployee();
	
	//����id��ѯ�����ڽ�ֹ����
	Date selectProbationDateById(int pro_id);
	
	//����id�޸������ڽ�ֹ����
	void updateProbationDateByID(Probation probation);

}
