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

	// 根据id查询员工
		@RequestMapping(value = "selectEmployeeById", method = { RequestMethod.GET, RequestMethod.POST })
		public String selectEmployeeById(Model model, String employeeId) {
			if(employeeId==""){
				List<Employee> employee = employeeService.selectAllEmployee();
				model.addAttribute("allEmployee", employee);
			}else{
				List<Employee> employee = employeeService.selectEmployeeById(Integer.parseInt(employeeId));
				// 把数据传递到页面,页面就可以通过model取得数值
				model.addAttribute("allEmployee", employee);
			}
			// 返回页面
			return "employee/employeeInfo";

		}


	// 查询所有员工
	@RequestMapping(value = "selectAllEmployee", method = { RequestMethod.GET, RequestMethod.POST })
	public String selectAllEmployee(Model model) {
		List<Employee> allEmployee = employeeService.selectAllEmployee();
		model.addAttribute("allEmployee", allEmployee);
		return "employee/employeeInfo";
	}

	// 删除员工
	@RequestMapping(value = "deleteEmployeeById", method = { RequestMethod.GET, RequestMethod.POST })
	public String deleteEmployeeById(Model model, int id) {
		employeeService.deleteEmployeeById(id);
		List<Employee> allEmployee = employeeService.selectAllEmployee();
		model.addAttribute("allEmployee", allEmployee);
		return "employee/employeeInfo";
	}
	
	//点击添加员工获取下拉列表值
	@RequestMapping(value = "addEmployee_show", method = { RequestMethod.GET, RequestMethod.POST })
	public String addEmployee_show(Model model) {
		//查询所有岗位，将岗位名显示到添加员工页面的岗位选择下拉列表中
		List<Post> allPost = postService.selectAllPost();
		List<Department> allDepartment = departmentService.selectAllDepartment();
		model.addAttribute("allPost", allPost);
		model.addAttribute("allDepartment", allDepartment);
		return "employee/addEmployee";
	}
	
	
	// 添加员工
	@RequestMapping(value = "addEmployee", method = { RequestMethod.GET, RequestMethod.POST })
	public String addEmployee(Model model, Employee employee) {
		employeeService.addEmployee(employee);
		List<Employee> allEmployee = employeeService.selectAllEmployee();
		model.addAttribute("allEmployee", allEmployee);
		return "employee/employeeInfo";
	}

	// 点击修改员工信息后跳转修改界面
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

	// 根据id修改员工信息
	@RequestMapping(value = "updateEmployeeById", method = { RequestMethod.GET, RequestMethod.POST })
	public String updateEmployeeById(Model model, Employee employee) {
		employeeService.updateEmployeeById(employee);
		List<Employee> allEmployee = employeeService.selectAllEmployee();
		model.addAttribute("allEmployee", allEmployee);
		return "employee/employeeInfo";
	}

}
