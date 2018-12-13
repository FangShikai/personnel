package com.SSM.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.SSM.mapper.Post_transMapper;
import com.SSM.pojo.Employee;
import com.SSM.pojo.Post_trans;
import com.SSM.service.Post_transService;

public class Post_transServiceImp  implements Post_transService{
	
	@Autowired
	private Post_transMapper post_transMapper;


	@Override
	public List<Post_trans> selectAllPost_trans() {
		// TODO Auto-generated method stub
		return post_transMapper.selectAllPost_trans();
	}


	@Override
	public List<Post_trans> selectEmp_idById(int id) {
		// TODO Auto-generated method stub
		return post_transMapper.selectEmp_idById(id);
	}


	@Override
	public List<Employee> selectSomeEmployee() {
		// TODO Auto-generated method stub
		return post_transMapper.selectSomeEmployee();
	}


	@Override
	public List<Employee> selectEmpIdById(int id) {
		// TODO Auto-generated method stub
		return post_transMapper.selectEmpIdById(id);
	}


	@Override
	public void addPost_trans(Post_trans post_trans) {
		// TODO Auto-generated method stub
		post_transMapper.addPost_trans(post_trans);
	}


	@Override
	public void updateEmployeeById(Post_trans post_trans) {
		// TODO Auto-generated method stub
		post_transMapper.updateEmployeeById(post_trans);
	}


	@Override
	public void deletePost_transById(int id) {
		// TODO Auto-generated method stub
		post_transMapper.deletePost_transById(id);
	}


	@Override
	public Post_trans selectPost_transById(int id) {
		// TODO Auto-generated method stub
		return post_transMapper.selectPost_transById(id);
	}


	@Override
	public void updatePost_trans(Post_trans post_trans) {
		// TODO Auto-generated method stub
		post_transMapper.updatePost_trans(post_trans);
	}


	@Override
	public Employee selectNowPostById(int id) {
		// TODO Auto-generated method stub
		return post_transMapper.selectNowPostById(id);
	}

}
