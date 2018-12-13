package com.SSM.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.SSM.pojo.Employee;
import com.SSM.pojo.Post;
import com.SSM.service.PostService;
import com.SSM.mapper.PostMapper;

public class PostServiceImp implements PostService {

	@Autowired
	private PostMapper postMapper;

	@Override
	public List<Post> selectPostidById(int id) {
		return postMapper.selectPostidById(id);
	}

	@Override
	public List<Post> selectAllPost() {
		return postMapper.selectAllPost();
	}

	@Override
	public void deletePostById(int id) {
		postMapper.deletePostById(id);
	}

	@Override
	public void addPost(Post post) {
		postMapper.addPost(post);
	}

	@Override
	public Post selectPostById(int id) {
		return postMapper.selectPostById(id);
	}

	@Override
	public void updatePost(Post post) {
		postMapper.updatePost(post);
	}

	@Override
	public List<Employee> selectPostAllEmployeeById(int id) {
		return postMapper.selectPostAllEmployeeById(id);
	}
}
