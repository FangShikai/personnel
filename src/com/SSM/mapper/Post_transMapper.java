package com.SSM.mapper;

import java.util.List;

import com.SSM.pojo.Employee;
import com.SSM.pojo.Post_trans;



public interface Post_transMapper {
	//��ѯ����Ա����Ϣ,׼����ת��λ��Ϣ
    List<Employee> selectSomeEmployee();
	
	//����Ա���������ѯ����׼����ת��λ��Ϣ
	public List<Employee> selectEmpIdById(int id);
	
	//��Ӹ�λ��ת��Ϣǰ�Ȳ�Ա����ŵ�ǰ��λ�ٽ����޸�
	public Employee selectNowPostById(int id);
	
    //��Ӹ�λ��ת��Ϣ����ѯԱ����Ϣ�еĵ�ת��ť
    public void addPost_trans(Post_trans post_trans);
    
    //����Ա����Ϣ��,׼����ת��λ��Ϣ
    public void updateEmployeeById(Post_trans post_trans);
	
	//����Ա���������ѯ�����ѵ�ת��λ��Ϣ
	public List<Post_trans> selectEmp_idById(int id);
	 
	//��ѯ���и�λ��ת��Ϣ���ѵ�ת��λ��Ϣ
    List<Post_trans> selectAllPost_trans();   
    
    //ͨ����λ��ת��Ϣidɾ����λ��ת��Ϣ���ѵ�ת��λ��Ϣ
    public void deletePost_transById(int id);
    
    //���ݸ�λ��ת��Ϣid��ѯ��λ��ת��Ϣ
	public Post_trans selectPost_transById(int id);
    //���¸�λ��ת��Ϣ
	public void updatePost_trans(Post_trans post_trans);
}
