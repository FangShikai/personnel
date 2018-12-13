package com.SSM.mapper;

import java.util.List;

import com.SSM.pojo.Employee;
import com.SSM.pojo.Post_trans;



public interface Post_transMapper {
	//查询部分员工信息,准备调转岗位信息
    List<Employee> selectSomeEmployee();
	
	//根据员工编号来查询对象，准备调转岗位信息
	public List<Employee> selectEmpIdById(int id);
	
	//添加岗位调转信息前先查员工编号当前岗位再进行修改
	public Employee selectNowPostById(int id);
	
    //添加岗位调转信息，查询员工信息中的调转按钮
    public void addPost_trans(Post_trans post_trans);
    
    //更新员工信息，,准备调转岗位信息
    public void updateEmployeeById(Post_trans post_trans);
	
	//根据员工编号来查询对象，已调转岗位信息
	public List<Post_trans> selectEmp_idById(int id);
	 
	//查询所有岗位调转信息，已调转岗位信息
    List<Post_trans> selectAllPost_trans();   
    
    //通过岗位调转信息id删除岗位调转信息，已调转岗位信息
    public void deletePost_transById(int id);
    
    //根据岗位调转信息id查询岗位调转信息
	public Post_trans selectPost_transById(int id);
    //更新岗位调转信息
	public void updatePost_trans(Post_trans post_trans);
}
