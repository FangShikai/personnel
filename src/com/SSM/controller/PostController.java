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
	
	//��ѯ���и�λ
	@RequestMapping(value="selectAllPost",method={ RequestMethod.GET,RequestMethod.POST})
	public String selectAllPost(Model model){
		List<Post> allPost = postService.selectAllPost();
		model.addAttribute("allPost",allPost);
		return "post/postInfo";
	}
	
	//ͨ����λ��Ž��в�ѯ
	@RequestMapping(value="selectPostidById",method={ RequestMethod.GET,RequestMethod.POST})
	public String selectPostidById(Model model,String postId){
		if(postId==""){
			List<Post> post=postService.selectAllPost();
			//�����ݴ��ݵ�ҳ��,ҳ��Ϳ���ͨ��modelȡ����ֵ
			model.addAttribute("allPost",post);	
		}else{
			//���ݱ�Ų�ѯ�û�����
			List<Post> post=postService.selectPostidById(Integer.parseInt(postId));
			//�����ݴ��ݵ�ҳ��,ҳ��Ϳ���ͨ��modelȡ����ֵ
			model.addAttribute("allPost",post);	
		}
		
		
		//����ҳ��
		return "post/postInfo";
	}
	
	
	//ɾ����λ
	@RequestMapping(value="deletePostById",method={ RequestMethod.GET,RequestMethod.POST})
	public String deletePostById(Model model,int id){
		postService.deletePostById(id);
		List<Post> allPost = postService.selectAllPost();
		model.addAttribute("allPost",allPost);
		return "post/postInfo";
	}
	
	//��Ӹ�λ
	@RequestMapping(value="addPost",method={ RequestMethod.GET,RequestMethod.POST})
	public String addPost(Model model,Post post){
		postService.addPost(post);
		List<Post> allPost=postService.selectAllPost();
		model.addAttribute("allPost", allPost);
		return "post/postInfo";
	}
	
	
	//����id��ѯ�û����޸�ҳ�棬�Ȳ����޸�
	@RequestMapping(value="selectPostById",method={ RequestMethod.GET,RequestMethod.POST})
	public String selectPostById(Model model,String id){
		int intId=Integer.parseInt(id);
		//��ѯ�û�����
		Post post= postService.selectPostById(intId);
		//�Ѷ����ŵ�model�У�����ҳ��Ҫȡ������
		model.addAttribute("pos", post);
		//���ظ���ҳ��
		return "post/updatePost";
	}
	//�޸ĸ�λ��Ϣ
	@RequestMapping(value="updatePost",method={ RequestMethod.GET,RequestMethod.POST})
	public String updatePost(Model model,Post post){
		postService.updatePost(post);
		List<Post> allPost=postService.selectAllPost();
		model.addAttribute("allPost", allPost);
		return "post/postInfo";
	}
	//��ѯ��λ��Ա����Ϣ
	@RequestMapping(value="selectPostAllEmployeeById",method={ RequestMethod.GET,RequestMethod.POST})
	public String selectPostAllEmployeeById(Model model,int postId){
		List<Employee> selectPostAllEmployee = postService.selectPostAllEmployeeById(postId);
		model.addAttribute("selectPostAllEmployee",selectPostAllEmployee);
		return "post/selectPostAllEmployee";
	}

	
}