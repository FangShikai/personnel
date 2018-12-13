package com.SSM.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.SSM.pojo.Department;
import com.SSM.service.DepartmentService;

@Controller
@RequestMapping("/department")
public class DepartmentController {
	
	//����ע��
	@Autowired
	private DepartmentService departmentService;
	
	//��ʾ���в�����Ϣ
	@RequestMapping(value="selectAllDepartment",method= {RequestMethod.GET,RequestMethod.POST})
	public String selectAllDepartment(Model model) {
		//��ת��������Ϣҳ��
		List<Department> DepartmentList = departmentService.selectAllDepartment();
		//�����ݴ��ݵ�ҳ��,ҳ��Ϳ���ͨ��modelȡ����ֵ
		model.addAttribute("DepartmentList",DepartmentList);
		//����ҳ��
		return "department/departmentInfo";
	}
	
	//���ݲ���id��ѯ����
	@RequestMapping(value="selectDepartment",method= {RequestMethod.GET,RequestMethod.POST})
	public String selectDepartment(Model model,String dep_id) {
		if(dep_id==""){
			List<Department> DepartmentList = departmentService.selectAllDepartment();
			model.addAttribute("DepartmentList",DepartmentList);
		}else{
			//���ò�ѯ����
			List<Department> DepartmentList = departmentService.selectDepartment(Integer.parseInt(dep_id));
			//�����ݴ��ݵ�ҳ��,ҳ��Ϳ���ͨ��modelȡ����ֵ
			model.addAttribute("DepartmentList",DepartmentList);
			//����ҳ��
		}
		return "department/departmentInfo";
		
	}
	//�½�����
	@RequestMapping(value="addDepartment",method= {RequestMethod.GET,RequestMethod.POST})
	public String addDepartment(Model model,Department department) {
		//�����½����ŷ���
		departmentService.addDepartment(department);
		//��ת�ز�����Ϣҳ��
		List<Department> DepartmentList = departmentService.selectAllDepartment();
		//�����ݴ��ݵ�ҳ��,ҳ��Ϳ���ͨ��modelȡ����ֵ
		model.addAttribute("DepartmentList",DepartmentList);
		//����ҳ��
		return "department/departmentInfo";
	}
	
	//���ݲ���id�޸Ĳ���
	@RequestMapping(value="updateDepartment",method= {RequestMethod.GET,RequestMethod.POST})
	public String updateDepartment(Model model,Department department) {
		//�����޸Ĳ��ŷ���
		departmentService.updateDepartment(department);
		//��ת�ز�����Ϣҳ��
		List<Department> DepartmentList = departmentService.selectAllDepartment();
		//�����ݴ��ݵ�ҳ��,ҳ��Ϳ���ͨ��modelȡ����ֵ
		model.addAttribute("DepartmentList",DepartmentList);
		//����ҳ��
		return "department/departmentInfo";
	}
	
	//����޸Ĳ�����Ϣ����ת�޸Ľ���
	@RequestMapping(value="showUpdateDepartment",method={ RequestMethod.GET,RequestMethod.POST})
	public String showUpdateDepartment(Model model,int dep_id){
		Department department_update_before = departmentService.selectDepartmentById_update(dep_id);
		model.addAttribute("department_update_before",department_update_before);
		return "department/updateDepartment";
	}
	
	//���ݲ���idɾ������
	@RequestMapping(value="deleteDepartment",method= {RequestMethod.GET,RequestMethod.POST})
	public String deleteDepartment(Model model, int dep_id) {
		//����ɾ�����ŷ���
		departmentService.deleteDepartment(dep_id);
		//��ת�ز�����Ϣҳ��
		List<Department> DepartmentList = departmentService.selectAllDepartment();
		//�����ݴ��ݵ�ҳ��,ҳ��Ϳ���ͨ��modelȡ����ֵ
		model.addAttribute("DepartmentList",DepartmentList);
		//����ҳ��
		return "department/departmentInfo";
	}
	
	//���ݲ���id��ѯ����������Ա��
	@RequestMapping(value="selectDepartmentAllEmployee",method= {RequestMethod.GET,RequestMethod.POST})
	public String selectDepartmentAllEmployee(Model model,int dep_id) {
		 List<Department> department_allEmployeeList = departmentService.selectDepartmentAllEmployee(dep_id);
		//�����ݴ��ݵ�ҳ��,ҳ��Ϳ���ͨ��modelȡ����ֵ
		 model.addAttribute("department_allEmployeeList",department_allEmployeeList);
		//����ҳ��
		return "department/selectDepartmentAllEmployee";
	}
	
}
