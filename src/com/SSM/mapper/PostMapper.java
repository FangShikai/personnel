package com.SSM.mapper;

import java.util.List;

import com.SSM.pojo.Employee;
import com.SSM.pojo.Post;



public interface PostMapper {
	//根据岗位编号来查询对象
	public List<Post> selectPostidById(int id);
	
	 //查询所有岗位
    List<Post> selectAllPost();

    //根据岗位编号删除岗位
    void deletePostById(int id);
  	
    //添加岗位
    void addPost(Post post);
	
    //根据id查询岗位对象,先查再修改
	public Post selectPostById(int id);
    //更新岗位
    void updatePost(Post post);
    
    //查询岗位下的员工
    List<Employee> selectPostAllEmployeeById(int id);
}
