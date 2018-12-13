package com.SSM.controller;

import java.io.UnsupportedEncodingException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;







import com.SSM.pojo.Employee;
import com.SSM.pojo.Post;
import com.SSM.service.PostService;

@Controller
@RequestMapping("/post")
public class PostController {
	@Autowired
	private PostService postService;
	
	//查询所有岗位
	@RequestMapping(value="selectAllPost",method={ RequestMethod.GET,RequestMethod.POST})
	public String selectAllPost(Model model){
		List<Post> allPost = postService.selectAllPost();
		model.addAttribute("allPost",allPost);
		return "post/postInfo";
	}
	
	//通过岗位编号进行查询
	@RequestMapping(value="selectPostidById",method={ RequestMethod.GET,RequestMethod.POST})
	public String selectPostidById(Model model,String postId){
		if(postId==""){
			List<Post> post=postService.selectAllPost();
			//把数据传递到页面,页面就可以通过model取得数值
			model.addAttribute("allPost",post);	
		}else{
			//根据编号查询用户集合
			List<Post> post=postService.selectPostidById(Integer.parseInt(postId));
			//把数据传递到页面,页面就可以通过model取得数值
			model.addAttribute("allPost",post);	
		}
		
		
		//返回页面
		return "post/postInfo";
	}
	
	
	//删除岗位
	@RequestMapping(value="deletePostById",method={ RequestMethod.GET,RequestMethod.POST})
	public String deletePostById(Model model,int id){
		postService.deletePostById(id);
		List<Post> allPost = postService.selectAllPost();
		model.addAttribute("allPost",allPost);
		return "post/postInfo";
	}
	
	//添加岗位
	@RequestMapping(value="addPost",method={ RequestMethod.GET,RequestMethod.POST})
	public String addPost(Model model,Post post){
		postService.addPost(post);
		List<Post> allPost=postService.selectAllPost();
		model.addAttribute("allPost", allPost);
		return "post/postInfo";
	}
	
	
	//根据id查询用户，修改页面，先查再修改
	@RequestMapping(value="selectPostById",method={ RequestMethod.GET,RequestMethod.POST})
	public String selectPostById(Model model,String id){
		int intId=Integer.parseInt(id);
		//查询用户对象
		Post post= postService.selectPostById(intId);
		//把对象存放到model中，更新页面要取得数据
		model.addAttribute("pos", post);
		//返回更新页面
		return "post/updatePost";
	}
	//修改岗位信息
	@RequestMapping(value="updatePost",method={ RequestMethod.GET,RequestMethod.POST})
	public String updatePost(Model model,Post post){
		postService.updatePost(post);
		List<Post> allPost=postService.selectAllPost();
		model.addAttribute("allPost", allPost);
		return "post/postInfo";
	}
	//查询岗位下员工信息
	@RequestMapping(value="selectPostAllEmployeeById",method={ RequestMethod.GET,RequestMethod.POST})
	public String selectPostAllEmployeeById(Model model,int postId){
		List<Employee> selectPostAllEmployee = postService.selectPostAllEmployeeById(postId);
		model.addAttribute("selectPostAllEmployee",selectPostAllEmployee);
		return "post/selectPostAllEmployee";
	}

	
}