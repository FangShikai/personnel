package com.SSM.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.SSM.pojo.Dep_trans;
import com.SSM.pojo.Department;
import com.SSM.pojo.Employee;
import com.SSM.service.Dep_transService;
import com.SSM.service.DepartmentService;

@Controller
@RequestMapping("/dep_trans")
public class Dep_transController {
	
	//����ע�룬��������
	@Autowired
	private Dep_transService dep_transService;
	@Autowired
	private DepartmentService departmentService;
	
	//��ʾ���ŵ�ת��������Ϣ
	@RequestMapping(value="selectAllDep_trans",method= {RequestMethod.GET,RequestMethod.POST})
	public String selectAllDep_trans(Model model){
		//��ת�����ŵ�ת��������Ϣҳ��
		List<Dep_trans> Dep_transList = dep_transService.selectAllDep_trans();
		//�����ݴ��ݵ�ҳ��,ҳ��Ϳ���ͨ��modelȡ����ֵ
		System.out.println(Dep_transList);
		model.addAttribute("Dep_transList",Dep_transList);
		//����ҳ��
		return "dep_trans/dep_transInfo";
	}
	
	//ͨ��Ա��id��ѯ���ŵ�ת��Ϣ
	@RequestMapping(value="selectEmployeeDep_trans",method= {RequestMethod.GET,RequestMethod.POST})
	public String selectEmployeeDep_trans(Model model,String emp_id){
		if(emp_id==""){
			List<Dep_trans> Dep_transList = dep_transService.selectAllDep_trans();
			//�����ݴ��ݵ�ҳ��,ҳ��Ϳ���ͨ��modelȡ����ֵ
			model.addAttribute("Dep_transList",Dep_transList);
		}else{
			//��ת�����ŵ�ת��������Ϣҳ��
			List<Dep_trans> Dep_transList = dep_transService.selectEmployeeDep_trans(Integer.parseInt(emp_id));
			//�����ݴ��ݵ�ҳ��,ҳ��Ϳ���ͨ��modelȡ����ֵ
			model.addAttribute("Dep_transList",Dep_transList);
		}
		
		//����ҳ��
		return "dep_trans/dep_transInfo";
	}
	
	//���ݵ�ת��Ϣidɾ��Ա���ĵ�ת��Ϣ
	@RequestMapping(value="deleteEmployeeDep_trans",method= {RequestMethod.GET,RequestMethod.POST})
	public String deleteEmployeeDep_trans(Model model,int dep_trans_id){
		//����ɾ������
		dep_transService.deleteEmployeeDep_trans(dep_trans_id);
		//��ת�����ŵ�ת��������Ϣҳ��
		List<Dep_trans> Dep_transList = dep_transService.selectAllDep_trans();
		//�����ݴ��ݵ�ҳ��,ҳ��Ϳ���ͨ��modelȡ����ֵ
		model.addAttribute("Dep_transList",Dep_transList);
		//����ҳ��
		return "dep_trans/dep_transInfo";
	}
	
	//����޸���Ϣ����ת�޸Ľ���
		@RequestMapping(value="showUpdateDep_trans",method= {RequestMethod.GET,RequestMethod.POST})
		public String showUpdateDep_trans(Model model,int dep_trans_id){
			//��ת�޸�ҳ��
			Dep_trans Dep_trans_update_before = dep_transService.selectDep_transById_update(dep_trans_id);
			//����޸İ�ť��ȡ���������б�ֵ
			List<Department> allDepartment = departmentService.selectAllDepartment();
			model.addAttribute("allDepartment", allDepartment);
			//�����ݴ��ݵ�ҳ��,ҳ��Ϳ���ͨ��modelȡ����ֵ
			model.addAttribute("Dep_trans_update_before",Dep_trans_update_before);
			//����ҳ��
			return "dep_trans/updateDep_trans";
		}

	
	//���ݵ�ת��Ϣid�޸�Ա���ĵ�ת��Ϣ
	@RequestMapping(value="updateDep_trans",method= {RequestMethod.GET,RequestMethod.POST})
	public String updateDep_trans(Model model,Dep_trans dep_trans){
		//�����޸ķ���
		dep_transService.updateDep_trans(dep_trans);
		//��ת�����ŵ�ת��������Ϣҳ��
		List<Dep_trans> Dep_transList = dep_transService.selectAllDep_trans();
		//�����ݴ��ݵ�ҳ��,ҳ��Ϳ���ͨ��modelȡ����ֵ
		model.addAttribute("Dep_transList",Dep_transList);
		//����ҳ��
		return "dep_trans/dep_transInfo";
	}
	
	//��ʾ����Ա���Ĳ�����Ϣ
	@RequestMapping(value="selectAllEmployee",method= {RequestMethod.GET,RequestMethod.POST})
	public String selectAllEmployee(Model model){
		//��ת������Ա���Ĳ�����Ϣҳ��
		List<Employee> Emp_List = dep_transService.selectAllEmployee();
		//�����ݴ��ݵ�ҳ��,ҳ��Ϳ���ͨ��modelȡ����ֵ
		model.addAttribute("Emp_List",Emp_List);
		//����ҳ��
		return "dep_trans/portionEmpInfo";
	}
	
	//��ѯԱ���Ĳ�����Ϣ
	@RequestMapping(value="selectEmployeeById",method= {RequestMethod.GET,RequestMethod.POST})
	public String selectEmployeeById (Model model,String emp_id){
		if(emp_id==""){
			List<Employee> Emp_List = dep_transService.selectAllEmployee();
			model.addAttribute("Emp_List",Emp_List);
		}else{
			//���ò�ѯԱ���Ĳ�����Ϣ����
			List<Employee> Emp_List = dep_transService.selectEmployeeById(Integer.parseInt(emp_id));
			//�����ݴ��ݵ�ҳ��,ҳ��Ϳ���ͨ��modelȡ����ֵ
			model.addAttribute("Emp_List",Emp_List);
		}
		
		//����ҳ��
		return "dep_trans/portionEmpInfo";
	}
	
	//����֮ǰ��ʾ���е���Ϣ�������ֶ���д
		@RequestMapping(value="selectNowDepartmentById",method= {RequestMethod.GET,RequestMethod.POST})
		public String selectNowDepartmentById (Model model,int emp_id){
			//����֮ǰ��ʾ���е���Ϣ�������ֶ���д
			Employee Dep_transList = dep_transService.selectNowDepartmentById(emp_id);
			//�����ת��ť��ȡ���������б�ֵ
			List<Department> allDepartment = departmentService.selectAllDepartment();
			model.addAttribute("allDepartment", allDepartment);
			//�����ݴ��ݵ�ҳ��,ҳ��Ϳ���ͨ��modelȡ����ֵ
			model.addAttribute("Dep_transList",Dep_transList);
			//����ҳ��
			return "dep_trans/addDep_trans";
		}

	
	//����Ա���Ĳ��ŵ���
	@RequestMapping(value="addDep_trans",method= {RequestMethod.GET,RequestMethod.POST})
	public String addDep_trans (Model model,Dep_trans dep_trans){
		//������ӷ���
		dep_transService.addDep_trans(dep_trans);
		//Ա�����е���֮����Ӧ���޸�Ա����Ĳ���id
		dep_transService.updateEmployeeDepId(dep_trans);
		//��ת������������Ϣҳ��
		List<Employee> Emp_List = dep_transService.selectAllEmployee();
		//�����ݴ��ݵ�ҳ��,ҳ��Ϳ���ͨ��modelȡ����ֵ
		model.addAttribute("Emp_List",Emp_List);
		//����ҳ��
		return "dep_trans/portionEmpInfo";
	}
}
