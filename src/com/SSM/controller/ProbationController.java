package com.SSM.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.SSM.pojo.Probation;
import com.SSM.service.ProbationService;

@Controller
@RequestMapping("/probation")
public class ProbationController {
	@Autowired
	private ProbationService probationService;
	//查询所有试用期信息
	@RequestMapping(value="selectAllProbation",method={ RequestMethod.GET,RequestMethod.POST})
	public String selectAllProbation(Model model){		
		List<Probation> allProbation = probationService.selectAllProbation();
		//把数据传递到页面,页面就可以通过model取得数值
		model.addAttribute("allProbation",allProbation);
		//返回页面结果
		return "probation/probationInfo";
	}
	
	//根据id查询试用期信息
	@RequestMapping(value="selectProbationById",method={ RequestMethod.GET,RequestMethod.POST})
	public String selectProbationById(Model model,String pro_id){
		if(pro_id==""){
			List<Probation> allProbation = probationService.selectAllProbation();
			model.addAttribute("allProbation",allProbation);
		}else{
			List<Probation> allProbation = probationService.selectProbationById(Integer.parseInt(pro_id));
			model.addAttribute("allProbation",allProbation);
		}
		
		return "probation/probationInfo";
	}
	
	//插入试用期信息
	@RequestMapping(value="addProbationById",method={RequestMethod.GET,RequestMethod.POST})
    public String addProbationById(Model model,Probation probation){
    	probationService.addProbationById(probation);
    	List<Probation> allProbation = probationService.selectAllProbation();
    	model.addAttribute("allProbation", allProbation);
    	
    	return "probation/probationInfo";	
    }
		
		//已转正员工信息查询
		@RequestMapping(value="selectPassEmployee",method={RequestMethod.GET,RequestMethod.POST})
		public String selectPassEmployee(Model model){
			List<Probation> allPassProbation = probationService.selectPassEmployee();
			model.addAttribute("allProbation", allPassProbation);
			return "probation/probationInfo";	
			
		}
	
	
	
	//修改试用期
	@RequestMapping(value="updateProbation",method={ RequestMethod.GET,RequestMethod.POST})
	public String updateProbation(Model model,int id,String operate,RedirectAttributes arr ){	
		Probation probation = new Probation();
		probation.setPro_id(id);
		probation.setResult(operate);
		arr.addFlashAttribute("probation",probation);
		//判断进行何种操作
		if((operate.equals("1"))||(operate.equals("3"))){
			probationService.updateProbation_pass(probation);
			List<Probation> allProbation = probationService.selectAllProbation();
			model.addAttribute("allProbation",allProbation);
			return "probation/probationInfo";
		}else{
			return "redirect:updateProbation_delay_show.action";
		}
		
	}
	
	//试用期延期显示
	@RequestMapping(value="updateProbation_delay_show",method={ RequestMethod.GET,RequestMethod.POST})
	public String updateProbation_delay_show(Model model,Probation probation ){
		int pro_id = probation.getPro_id();
		Date end_date = probationService.selectProbationDateById(pro_id);
		probation.setEnd_date(end_date);
	    model.addAttribute("probation",probation);
		return "probation/delayProbation";
	}
	
	//试用期延期更新
	@RequestMapping(value="updateProbationDateByID",method={ RequestMethod.GET,RequestMethod.POST})
	public String updateProbationDateByID(Model model,Probation probation ){
		probationService.updateProbationDateByID(probation);
		List<Probation> allProbation = probationService.selectAllProbation();
		//把数据传递到页面,页面就可以通过model取得数值
		model.addAttribute("allProbation",allProbation);
		//返回页面结果
		return "probation/probationInfo";
	}
}
