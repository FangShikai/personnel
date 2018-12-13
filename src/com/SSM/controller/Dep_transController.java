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
	
	//依赖注入，创建对象
	@Autowired
	private Dep_transService dep_transService;
	@Autowired
	private DepartmentService departmentService;
	
	//显示部门调转的所有信息
	@RequestMapping(value="selectAllDep_trans",method= {RequestMethod.GET,RequestMethod.POST})
	public String selectAllDep_trans(Model model){
		//跳转到部门调转的所有信息页面
		List<Dep_trans> Dep_transList = dep_transService.selectAllDep_trans();
		//把数据传递到页面,页面就可以通过model取得数值
		System.out.println(Dep_transList);
		model.addAttribute("Dep_transList",Dep_transList);
		//返回页面
		return "dep_trans/dep_transInfo";
	}
	
	//通过员工id查询部门调转信息
	@RequestMapping(value="selectEmployeeDep_trans",method= {RequestMethod.GET,RequestMethod.POST})
	public String selectEmployeeDep_trans(Model model,String emp_id){
		if(emp_id==""){
			List<Dep_trans> Dep_transList = dep_transService.selectAllDep_trans();
			//把数据传递到页面,页面就可以通过model取得数值
			model.addAttribute("Dep_transList",Dep_transList);
		}else{
			//跳转到部门调转的所有信息页面
			List<Dep_trans> Dep_transList = dep_transService.selectEmployeeDep_trans(Integer.parseInt(emp_id));
			//把数据传递到页面,页面就可以通过model取得数值
			model.addAttribute("Dep_transList",Dep_transList);
		}
		
		//返回页面
		return "dep_trans/dep_transInfo";
	}
	
	//根据调转信息id删除员工的调转信息
	@RequestMapping(value="deleteEmployeeDep_trans",method= {RequestMethod.GET,RequestMethod.POST})
	public String deleteEmployeeDep_trans(Model model,int dep_trans_id){
		//调用删除方法
		dep_transService.deleteEmployeeDep_trans(dep_trans_id);
		//跳转到部门调转的所有信息页面
		List<Dep_trans> Dep_transList = dep_transService.selectAllDep_trans();
		//把数据传递到页面,页面就可以通过model取得数值
		model.addAttribute("Dep_transList",Dep_transList);
		//返回页面
		return "dep_trans/dep_transInfo";
	}
	
	//点击修改信息后跳转修改界面
		@RequestMapping(value="showUpdateDep_trans",method= {RequestMethod.GET,RequestMethod.POST})
		public String showUpdateDep_trans(Model model,int dep_trans_id){
			//跳转修改页面
			Dep_trans Dep_trans_update_before = dep_transService.selectDep_transById_update(dep_trans_id);
			//点击修改按钮获取部门下拉列表值
			List<Department> allDepartment = departmentService.selectAllDepartment();
			model.addAttribute("allDepartment", allDepartment);
			//把数据传递到页面,页面就可以通过model取得数值
			model.addAttribute("Dep_trans_update_before",Dep_trans_update_before);
			//返回页面
			return "dep_trans/updateDep_trans";
		}

	
	//根据调转信息id修改员工的调转信息
	@RequestMapping(value="updateDep_trans",method= {RequestMethod.GET,RequestMethod.POST})
	public String updateDep_trans(Model model,Dep_trans dep_trans){
		//调用修改方法
		dep_transService.updateDep_trans(dep_trans);
		//跳转到部门调转的所有信息页面
		List<Dep_trans> Dep_transList = dep_transService.selectAllDep_trans();
		//把数据传递到页面,页面就可以通过model取得数值
		model.addAttribute("Dep_transList",Dep_transList);
		//返回页面
		return "dep_trans/dep_transInfo";
	}
	
	//显示所有员工的部分信息
	@RequestMapping(value="selectAllEmployee",method= {RequestMethod.GET,RequestMethod.POST})
	public String selectAllEmployee(Model model){
		//跳转到所有员工的部分信息页面
		List<Employee> Emp_List = dep_transService.selectAllEmployee();
		//把数据传递到页面,页面就可以通过model取得数值
		model.addAttribute("Emp_List",Emp_List);
		//返回页面
		return "dep_trans/portionEmpInfo";
	}
	
	//查询员工的部分信息
	@RequestMapping(value="selectEmployeeById",method= {RequestMethod.GET,RequestMethod.POST})
	public String selectEmployeeById (Model model,String emp_id){
		if(emp_id==""){
			List<Employee> Emp_List = dep_transService.selectAllEmployee();
			model.addAttribute("Emp_List",Emp_List);
		}else{
			//调用查询员工的部分信息方法
			List<Employee> Emp_List = dep_transService.selectEmployeeById(Integer.parseInt(emp_id));
			//把数据传递到页面,页面就可以通过model取得数值
			model.addAttribute("Emp_List",Emp_List);
		}
		
		//返回页面
		return "dep_trans/portionEmpInfo";
	}
	
	//调动之前显示已有的信息，不用手动填写
		@RequestMapping(value="selectNowDepartmentById",method= {RequestMethod.GET,RequestMethod.POST})
		public String selectNowDepartmentById (Model model,int emp_id){
			//调动之前显示已有的信息，不用手动填写
			Employee Dep_transList = dep_transService.selectNowDepartmentById(emp_id);
			//点击调转按钮获取部门下拉列表值
			List<Department> allDepartment = departmentService.selectAllDepartment();
			model.addAttribute("allDepartment", allDepartment);
			//把数据传递到页面,页面就可以通过model取得数值
			model.addAttribute("Dep_transList",Dep_transList);
			//返回页面
			return "dep_trans/addDep_trans";
		}

	
	//进行员工的部门调动
	@RequestMapping(value="addDep_trans",method= {RequestMethod.GET,RequestMethod.POST})
	public String addDep_trans (Model model,Dep_trans dep_trans){
		//调用添加方法
		dep_transService.addDep_trans(dep_trans);
		//员工进行调动之后，相应的修改员工表的部门id
		dep_transService.updateEmployeeDepId(dep_trans);
		//跳转到调动的主信息页面
		List<Employee> Emp_List = dep_transService.selectAllEmployee();
		//把数据传递到页面,页面就可以通过model取得数值
		model.addAttribute("Emp_List",Emp_List);
		//返回页面
		return "dep_trans/portionEmpInfo";
	}
}
