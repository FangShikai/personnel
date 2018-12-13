package com.SSM.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.SSM.pojo.Dep_trans;
import com.SSM.pojo.Dimission;
import com.SSM.pojo.Employee;
import com.SSM.pojo.Post_trans;
import com.SSM.pojo.SelectDate;
import com.SSM.service.ReporterService;

@Controller
@RequestMapping("/reporter")
public class ReporterController {

	@Autowired
	private ReporterService reporterService;

	// 判断哪个报表
	@RequestMapping(value = "judgeReporter", method = { RequestMethod.GET, RequestMethod.POST })
	public String judgeReporter(Model model,SelectDate selectDate,String action) {
		if(action.equals("新聘员工报表")){
			List<Employee> allEmployee = reporterService.selectNewEmployeeReport(selectDate);
			model.addAttribute("allEmployee",allEmployee);
			return "reporter/report_newEmployee";
			
		}else if(action.equals("离职员工报表")){
			List<Dimission> allDimEmployee = reporterService.selectDimEmployeeReport(selectDate);
			model.addAttribute("allDimEmployee",allDimEmployee);
			return "reporter/report_Dimission";
			
		}else if(action.equals("岗位调动员工报表")){
			List<Post_trans> allPost_trans = reporterService.selectPost_transReport(selectDate);
			model.addAttribute("allPost_trans",allPost_trans);
			return "reporter/report_post_trans";
		}else{
			List<Dep_trans> allDep_trans = reporterService.selectDep_transReport(selectDate);
			model.addAttribute("allDep_trans", allDep_trans);
			return "reporter/report_dep_trans";
		}
		
	}
}
