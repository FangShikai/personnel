package com.SSM.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.SSM.pojo.Department;
import com.SSM.pojo.Employee;
import com.SSM.pojo.Post;
import com.SSM.service.DepartmentService;
import com.SSM.service.EmployeeService;
import com.SSM.service.PostService;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	@Autowired
	private PostService postService;
	@Autowired
	private DepartmentService  departmentService;

	// ����id��ѯԱ��
		@RequestMapping(value = "selectEmployeeById", method = { RequestMethod.GET, RequestMethod.POST })
		public String selectEmployeeById(Model model, String employeeId) {
			if(employeeId==""){
				List<Employee> employee = employeeService.selectAllEmployee();
				model.addAttribute("allEmployee", employee);
			}else{
				List<Employee> employee = employeeService.selectEmployeeById(Integer.parseInt(employeeId));
				// �����ݴ��ݵ�ҳ��,ҳ��Ϳ���ͨ��modelȡ����ֵ
				model.addAttribute("allEmployee", employee);
			}
			// ����ҳ��
			return "employee/employeeInfo";

		}


	// ��ѯ����Ա��
	@RequestMapping(value = "selectAllEmployee", method = { RequestMethod.GET, RequestMethod.POST })
	public String selectAllEmployee(Model model) {
		List<Employee> allEmployee = employeeService.selectAllEmployee();
		model.addAttribute("allEmployee", allEmployee);
		return "employee/employeeInfo";
	}

	// ɾ��Ա��
	@RequestMapping(value = "deleteEmployeeById", method = { RequestMethod.GET, RequestMethod.POST })
	public String deleteEmployeeById(Model model, int id) {
		employeeService.deleteEmployeeById(id);
		List<Employee> allEmployee = employeeService.selectAllEmployee();
		model.addAttribute("allEmployee", allEmployee);
		return "employee/employeeInfo";
	}
	
	//������Ա����ȡ�����б�ֵ
	@RequestMapping(value = "addEmployee_show", method = { RequestMethod.GET, RequestMethod.POST })
	public String addEmployee_show(Model model) {
		//��ѯ���и�λ������λ����ʾ�����Ա��ҳ��ĸ�λѡ�������б���
		List<Post> allPost = postService.selectAllPost();
		List<Department> allDepartment = departmentService.selectAllDepartment();
		model.addAttribute("allPost", allPost);
		model.addAttribute("allDepartment", allDepartment);
		return "employee/addEmployee";
	}
	
	
	// ���Ա��
	@RequestMapping(value = "addEmployee", method = { RequestMethod.GET, RequestMethod.POST })
	public String addEmployee(Model model, Employee employee) {
		employeeService.addEmployee(employee);
		List<Employee> allEmployee = employeeService.selectAllEmployee();
		model.addAttribute("allEmployee", allEmployee);
		return "employee/employeeInfo";
	}

	// ����޸�Ա����Ϣ����ת�޸Ľ���
	@RequestMapping(value = "showUpdateEmployee", method = { RequestMethod.GET, RequestMethod.POST })
	public String showUpdateEmployee(Model model, int id) {
		List<Post> allPost = postService.selectAllPost();
		List<Department> allDepartment = departmentService.selectAllDepartment();
		model.addAttribute("allPost", allPost);
		model.addAttribute("allDepartment", allDepartment);
		Employee employee_update_before = employeeService.selectEmployeeById_update(id);
		model.addAttribute("employee_update_before", employee_update_before);
		return "employee/updateEmployee";
	}

	// ����id�޸�Ա����Ϣ
	@RequestMapping(value = "updateEmployeeById", method = { RequestMethod.GET, RequestMethod.POST })
	public String updateEmployeeById(Model model, Employee employee) {
		employeeService.updateEmployeeById(employee);
		List<Employee> allEmployee = employeeService.selectAllEmployee();
		model.addAttribute("allEmployee", allEmployee);
		return "employee/employeeInfo";
	}

}
