package com.SSM.mapper;

import java.util.List;

import com.SSM.pojo.Employee;
import com.SSM.pojo.Post;



public interface PostMapper {
	//���ݸ�λ�������ѯ����
	public List<Post> selectPostidById(int id);
	
	 //��ѯ���и�λ
    List<Post> selectAllPost();

    //���ݸ�λ���ɾ����λ
    void deletePostById(int id);
  	
    //��Ӹ�λ
    void addPost(Post post);
	
    //����id��ѯ��λ����,�Ȳ����޸�
	public Post selectPostById(int id);
    //���¸�λ
    void updatePost(Post post);
    
    //��ѯ��λ�µ�Ա��
    List<Employee> selectPostAllEmployeeById(int id);
}
