package com.SSM.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.SSM.pojo.Employee;
import com.SSM.pojo.Post;
import com.SSM.pojo.Post_trans;
import com.SSM.service.PostService;
import com.SSM.service.Post_transService;

@Controller
@RequestMapping("/post_trans")
public class Post_transController {
	@Autowired
	private Post_transService post_transService;
	@Autowired
	private PostService postService;
	
	//查询所有岗位调转信息，已调转的岗位信息表
	@RequestMapping(value="selectAllPost_trans",method={ RequestMethod.GET,RequestMethod.POST})
	public String selectAllPost_trans(Model model){
		List<Post_trans> allPost_trans = post_transService.selectAllPost_trans();
		model.addAttribute("allPost_trans",allPost_trans);
		return "post_trans/post_transInfo";
	}
	
	//通过员工编号进行查询，已调转的岗位信息表
	@RequestMapping(value="selectEmp_idById",method={ RequestMethod.GET,RequestMethod.POST})
	public String selectEmp_idById(Model model,String emp_Id){
		if(emp_Id==""){
			List<Post_trans> post_trans=post_transService.selectAllPost_trans();
			model.addAttribute("allPost_trans",post_trans);	
		}else{
			//根据员工编号查询用户集合
			List<Post_trans> post_trans=post_transService.selectEmp_idById(Integer.parseInt(emp_Id));
			//把数据传递到页面,页面就可以通过model取得数值
			model.addAttribute("allPost_trans",post_trans);	
		}
		
		//返回页面
		return "post_trans/post_transInfo";
	}
    //通过岗位调转信息id删除岗位调转信息，已调转岗位信息
	@RequestMapping(value="deletePost_transById",method={ RequestMethod.GET,RequestMethod.POST})
	public String deletePost_transById(Model model,int id){
		post_transService.deletePost_transById(id);
		List<Post_trans> allPost_trans = post_transService.selectAllPost_trans();
		model.addAttribute("allPost_trans",allPost_trans);
		return "post_trans/post_transInfo";
	}
	//先根据岗位调转信息id查询用户
	@RequestMapping(value="selectPost_transById",method={ RequestMethod.GET,RequestMethod.POST})
	public String selectPost_transById(Model model,String id){	
		//查询用户对象
		Post_trans allPost_trans=post_transService.selectPost_transById(Integer.parseInt(id));
		//点击修改信息获取岗位名称下拉列表值
		List<Post> allPost = postService.selectAllPost();
		model.addAttribute("allPost", allPost);
		//把对象存放到model中，更新页面要取得数据
		model.addAttribute("allPost_trans", allPost_trans);
		//返回更新页面
		return "post_trans/updatePost_trans";
	}
	//再修改岗位调转信息
	@RequestMapping(value="updatePost_trans",method={ RequestMethod.GET,RequestMethod.POST})
	public String updatePost_trans(Model model,Post_trans post_trans){
		post_transService.updatePost_trans(post_trans);
		List<Post_trans> allPost_trans = post_transService.selectAllPost_trans();
		model.addAttribute("allPost_trans",allPost_trans);
		return "post_trans/post_transInfo";
	}
	
	
	//查询部分员工信息，准备调转的员工信息表
	@RequestMapping(value="selectSomeEmployee",method={ RequestMethod.GET,RequestMethod.POST})
	public String selectSomeEmployee(Model model){
		List<Employee> allEmployee = post_transService.selectSomeEmployee();
		model.addAttribute("allEmployee",allEmployee);
		return "post_trans/trans_select_employee";
	}
	//通过员工编号进行查询，准备调转的员工信息表(String empId中string从input的text中来的)
	@RequestMapping(value="selectEmpIdById",method={ RequestMethod.GET,RequestMethod.POST})
	public String selectEmpIdById(Model model,String empId){
		if(empId==""){
			List<Employee> allEmployee = post_transService.selectSomeEmployee();
			model.addAttribute("allEmployee",allEmployee);
		}else{
			//根据员工编号查询用户集合
			List<Employee> allEmployee = post_transService.selectEmpIdById(Integer.parseInt(empId));
			//把数据传递到页面,页面就可以通过model取得数值
			model.addAttribute("allEmployee",allEmployee);	
		}
		
		//返回页面
		return "post_trans/trans_select_employee";
	}
	//添加岗位
	//先查到员工编号与当前岗位,再进行添加岗位等操作
	@RequestMapping(value="selectNowPostById",method={ RequestMethod.GET,RequestMethod.POST})
	public String selectNowPostById(Model model,String id){	
		//查询岗位对象
		Employee allEmployee=post_transService.selectNowPostById(Integer.parseInt(id));
		//点击调转按钮获取岗位名称下拉列表值
		List<Post> allPost = postService.selectAllPost();
		model.addAttribute("allPost", allPost);
		//把对象存放到model中，更新页面要取得数据
		model.addAttribute("allEmployee", allEmployee);
		System.out.println(allEmployee);
		//返回更新页面
		return "post_trans/addPost_trans";
	}
	@RequestMapping(value="addPost_trans",method={ RequestMethod.GET,RequestMethod.POST})
	public String addPost_trans(Model model,Post_trans post_trans){
		post_transService.addPost_trans(post_trans);
		// 根据id修改员工信息,准备调转信息管理
		post_transService.updateEmployeeById(post_trans);
		List<Employee> allEmployee = post_transService.selectSomeEmployee();
		model.addAttribute("allEmployee", allEmployee);
		return "post_trans/trans_select_employee";
	}
	
}
