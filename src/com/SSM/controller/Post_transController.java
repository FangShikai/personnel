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
	
	//��ѯ���и�λ��ת��Ϣ���ѵ�ת�ĸ�λ��Ϣ��
	@RequestMapping(value="selectAllPost_trans",method={ RequestMethod.GET,RequestMethod.POST})
	public String selectAllPost_trans(Model model){
		List<Post_trans> allPost_trans = post_transService.selectAllPost_trans();
		model.addAttribute("allPost_trans",allPost_trans);
		return "post_trans/post_transInfo";
	}
	
	//ͨ��Ա����Ž��в�ѯ���ѵ�ת�ĸ�λ��Ϣ��
	@RequestMapping(value="selectEmp_idById",method={ RequestMethod.GET,RequestMethod.POST})
	public String selectEmp_idById(Model model,String emp_Id){
		if(emp_Id==""){
			List<Post_trans> post_trans=post_transService.selectAllPost_trans();
			model.addAttribute("allPost_trans",post_trans);	
		}else{
			//����Ա����Ų�ѯ�û�����
			List<Post_trans> post_trans=post_transService.selectEmp_idById(Integer.parseInt(emp_Id));
			//�����ݴ��ݵ�ҳ��,ҳ��Ϳ���ͨ��modelȡ����ֵ
			model.addAttribute("allPost_trans",post_trans);	
		}
		
		//����ҳ��
		return "post_trans/post_transInfo";
	}
    //ͨ����λ��ת��Ϣidɾ����λ��ת��Ϣ���ѵ�ת��λ��Ϣ
	@RequestMapping(value="deletePost_transById",method={ RequestMethod.GET,RequestMethod.POST})
	public String deletePost_transById(Model model,int id){
		post_transService.deletePost_transById(id);
		List<Post_trans> allPost_trans = post_transService.selectAllPost_trans();
		model.addAttribute("allPost_trans",allPost_trans);
		return "post_trans/post_transInfo";
	}
	//�ȸ��ݸ�λ��ת��Ϣid��ѯ�û�
	@RequestMapping(value="selectPost_transById",method={ RequestMethod.GET,RequestMethod.POST})
	public String selectPost_transById(Model model,String id){	
		//��ѯ�û�����
		Post_trans allPost_trans=post_transService.selectPost_transById(Integer.parseInt(id));
		//����޸���Ϣ��ȡ��λ���������б�ֵ
		List<Post> allPost = postService.selectAllPost();
		model.addAttribute("allPost", allPost);
		//�Ѷ����ŵ�model�У�����ҳ��Ҫȡ������
		model.addAttribute("allPost_trans", allPost_trans);
		//���ظ���ҳ��
		return "post_trans/updatePost_trans";
	}
	//���޸ĸ�λ��ת��Ϣ
	@RequestMapping(value="updatePost_trans",method={ RequestMethod.GET,RequestMethod.POST})
	public String updatePost_trans(Model model,Post_trans post_trans){
		post_transService.updatePost_trans(post_trans);
		List<Post_trans> allPost_trans = post_transService.selectAllPost_trans();
		model.addAttribute("allPost_trans",allPost_trans);
		return "post_trans/post_transInfo";
	}
	
	
	//��ѯ����Ա����Ϣ��׼����ת��Ա����Ϣ��
	@RequestMapping(value="selectSomeEmployee",method={ RequestMethod.GET,RequestMethod.POST})
	public String selectSomeEmployee(Model model){
		List<Employee> allEmployee = post_transService.selectSomeEmployee();
		model.addAttribute("allEmployee",allEmployee);
		return "post_trans/trans_select_employee";
	}
	//ͨ��Ա����Ž��в�ѯ��׼����ת��Ա����Ϣ��(String empId��string��input��text������)
	@RequestMapping(value="selectEmpIdById",method={ RequestMethod.GET,RequestMethod.POST})
	public String selectEmpIdById(Model model,String empId){
		if(empId==""){
			List<Employee> allEmployee = post_transService.selectSomeEmployee();
			model.addAttribute("allEmployee",allEmployee);
		}else{
			//����Ա����Ų�ѯ�û�����
			List<Employee> allEmployee = post_transService.selectEmpIdById(Integer.parseInt(empId));
			//�����ݴ��ݵ�ҳ��,ҳ��Ϳ���ͨ��modelȡ����ֵ
			model.addAttribute("allEmployee",allEmployee);	
		}
		
		//����ҳ��
		return "post_trans/trans_select_employee";
	}
	//��Ӹ�λ
	//�Ȳ鵽Ա������뵱ǰ��λ,�ٽ�����Ӹ�λ�Ȳ���
	@RequestMapping(value="selectNowPostById",method={ RequestMethod.GET,RequestMethod.POST})
	public String selectNowPostById(Model model,String id){	
		//��ѯ��λ����
		Employee allEmployee=post_transService.selectNowPostById(Integer.parseInt(id));
		//�����ת��ť��ȡ��λ���������б�ֵ
		List<Post> allPost = postService.selectAllPost();
		model.addAttribute("allPost", allPost);
		//�Ѷ����ŵ�model�У�����ҳ��Ҫȡ������
		model.addAttribute("allEmployee", allEmployee);
		System.out.println(allEmployee);
		//���ظ���ҳ��
		return "post_trans/addPost_trans";
	}
	@RequestMapping(value="addPost_trans",method={ RequestMethod.GET,RequestMethod.POST})
	public String addPost_trans(Model model,Post_trans post_trans){
		post_transService.addPost_trans(post_trans);
		// ����id�޸�Ա����Ϣ,׼����ת��Ϣ����
		post_transService.updateEmployeeById(post_trans);
		List<Employee> allEmployee = post_transService.selectSomeEmployee();
		model.addAttribute("allEmployee", allEmployee);
		return "post_trans/trans_select_employee";
	}
	
}
