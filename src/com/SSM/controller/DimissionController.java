package com.SSM.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.SSM.pojo.Dimission;
import com.SSM.service.DimissionService;

@Controller
@RequestMapping("/dimission")
public class DimissionController {
	@Autowired
	private DimissionService dimissionService;

	// ��ѯ��ְԱ��
	@RequestMapping(value = "selectAllDimission_not", method = { RequestMethod.GET, RequestMethod.POST })
	public String selectAllDimission_not(Model model) {
		List<Dimission> allEmployee = dimissionService.selectAllDimission_not();
		model.addAttribute("allEmployee", allEmployee);
		return "dimission/dimission_Not_Info";
	}

	// ͨ��id��ѯ��ְԱ��
	@RequestMapping(value = "selectDimission_not_ById", method = { RequestMethod.GET, RequestMethod.POST })
	public String selectDimission_not_ById(Model model, String id) {
		if(id==""){
			List<Dimission> allEmployee = dimissionService.selectAllDimission_not();
			model.addAttribute("allEmployee", allEmployee);
		}else{
			int intId = Integer.parseInt(id);
			List<Dimission> allEmployee = dimissionService.selectDimission_not_ById(intId);
			model.addAttribute("allEmployee", allEmployee);
		}
		
		return "dimission/dimission_Not_Info";
	}

	// �����ְ��Ϣ
	@RequestMapping(value = "addDimission", method = { RequestMethod.GET, RequestMethod.POST })
	public String addDimission(Model model, Dimission dimission) {
		dimissionService.addDimission(dimission);
		List<Dimission> allEmployee = dimissionService.selectAllDimission_not();
		model.addAttribute("allEmployee", allEmployee);
		return "dimission/dimission_Not_Info";
	}

	// ��ѯ��ְԱ��
	@RequestMapping(value = "selectAllDimission", method = { RequestMethod.GET, RequestMethod.POST })
	public String selectAllDimission(Model model) {
		List<Dimission> allDimEmployee = dimissionService.selectAllDimission();
		model.addAttribute("allDimEmployee", allDimEmployee);
		return "dimission/dimissionInfo";
	}
	
	//ͨ��ID��ѯ��ְԱ��
	@RequestMapping(value = "selectDimissionById", method = { RequestMethod.GET, RequestMethod.POST })
	public String selectDimissionById(Model model,String id) {
		if(id==""){
			List<Dimission> allDimEmployee = dimissionService.selectAllDimission();
			model.addAttribute("allDimEmployee", allDimEmployee);
		}else{
			int intId = Integer.parseInt(id);
			List<Dimission> allDimEmployee = dimissionService.selectDimissionById(intId);
			model.addAttribute("allDimEmployee", allDimEmployee);
		}
		
		return "dimission/dimissionInfo";
	}
	

	// ����ְԱ����Ϣ��ӵ��޸���ְ��ְҳ��
	@RequestMapping(value = "updateDimission_show", method = { RequestMethod.GET, RequestMethod.POST })
	public String addDimission(Model model, int emp_id) {
		Dimission dimission = dimissionService.selectDimissionById_show(emp_id);
		System.out.println(dimission);
		model.addAttribute("dimission", dimission);
		return "dimission/updateDimission";
	}

	// ����ְԱ��IDת�������ְҳ��
	@RequestMapping(value = "transAddDimission", method = { RequestMethod.GET, RequestMethod.POST })
	public String transAddDimission(Model model, int id) {
		model.addAttribute("id", id);
		return "dimission/addDimission";
	}

	// �޸���ְ��Ϣ
	@RequestMapping(value = "updateDimission", method = { RequestMethod.GET, RequestMethod.POST })
	public String updateDimission(Model model, Dimission dimission) {
		dimissionService.updateDimission(dimission);
		List<Dimission> allDimEmployee = dimissionService.selectAllDimission();
		model.addAttribute("allDimEmployee", allDimEmployee);
		return "dimission/dimissionInfo";
	}
}
