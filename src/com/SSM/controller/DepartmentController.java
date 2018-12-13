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
	
	//依赖注入
	@Autowired
	private DepartmentService departmentService;
	
	//显示所有部门信息
	@RequestMapping(value="selectAllDepartment",method= {RequestMethod.GET,RequestMethod.POST})
	public String selectAllDepartment(Model model) {
		//跳转到部门信息页面
		List<Department> DepartmentList = departmentService.selectAllDepartment();
		//把数据传递到页面,页面就可以通过model取得数值
		model.addAttribute("DepartmentList",DepartmentList);
		//返回页面
		return "department/departmentInfo";
	}
	
	//根据部门id查询部门
	@RequestMapping(value="selectDepartment",method= {RequestMethod.GET,RequestMethod.POST})
	public String selectDepartment(Model model,String dep_id) {
		if(dep_id==""){
			List<Department> DepartmentList = departmentService.selectAllDepartment();
			model.addAttribute("DepartmentList",DepartmentList);
		}else{
			//调用查询方法
			List<Department> DepartmentList = departmentService.selectDepartment(Integer.parseInt(dep_id));
			//把数据传递到页面,页面就可以通过model取得数值
			model.addAttribute("DepartmentList",DepartmentList);
			//返回页面
		}
		return "department/departmentInfo";
		
	}
	//新建部门
	@RequestMapping(value="addDepartment",method= {RequestMethod.GET,RequestMethod.POST})
	public String addDepartment(Model model,Department department) {
		//调用新建部门方法
		departmentService.addDepartment(department);
		//跳转回部门信息页面
		List<Department> DepartmentList = departmentService.selectAllDepartment();
		//把数据传递到页面,页面就可以通过model取得数值
		model.addAttribute("DepartmentList",DepartmentList);
		//返回页面
		return "department/departmentInfo";
	}
	
	//根据部门id修改部门
	@RequestMapping(value="updateDepartment",method= {RequestMethod.GET,RequestMethod.POST})
	public String updateDepartment(Model model,Department department) {
		//调用修改部门方法
		departmentService.updateDepartment(department);
		//跳转回部门信息页面
		List<Department> DepartmentList = departmentService.selectAllDepartment();
		//把数据传递到页面,页面就可以通过model取得数值
		model.addAttribute("DepartmentList",DepartmentList);
		//返回页面
		return "department/departmentInfo";
	}
	
	//点击修改部门信息后跳转修改界面
	@RequestMapping(value="showUpdateDepartment",method={ RequestMethod.GET,RequestMethod.POST})
	public String showUpdateDepartment(Model model,int dep_id){
		Department department_update_before = departmentService.selectDepartmentById_update(dep_id);
		model.addAttribute("department_update_before",department_update_before);
		return "department/updateDepartment";
	}
	
	//根据部门id删除部门
	@RequestMapping(value="deleteDepartment",method= {RequestMethod.GET,RequestMethod.POST})
	public String deleteDepartment(Model model, int dep_id) {
		//调用删除部门方法
		departmentService.deleteDepartment(dep_id);
		//跳转回部门信息页面
		List<Department> DepartmentList = departmentService.selectAllDepartment();
		//把数据传递到页面,页面就可以通过model取得数值
		model.addAttribute("DepartmentList",DepartmentList);
		//返回页面
		return "department/departmentInfo";
	}
	
	//根据部门id查询部门下所有员工
	@RequestMapping(value="selectDepartmentAllEmployee",method= {RequestMethod.GET,RequestMethod.POST})
	public String selectDepartmentAllEmployee(Model model,int dep_id) {
		 List<Department> department_allEmployeeList = departmentService.selectDepartmentAllEmployee(dep_id);
		//把数据传递到页面,页面就可以通过model取得数值
		 model.addAttribute("department_allEmployeeList",department_allEmployeeList);
		//返回页面
		return "department/selectDepartmentAllEmployee";
	}
	
}
