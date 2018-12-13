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
	//��ѯ������������Ϣ
	@RequestMapping(value="selectAllProbation",method={ RequestMethod.GET,RequestMethod.POST})
	public String selectAllProbation(Model model){		
		List<Probation> allProbation = probationService.selectAllProbation();
		//�����ݴ��ݵ�ҳ��,ҳ��Ϳ���ͨ��modelȡ����ֵ
		model.addAttribute("allProbation",allProbation);
		//����ҳ����
		return "probation/probationInfo";
	}
	
	//����id��ѯ��������Ϣ
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
	
	//������������Ϣ
	@RequestMapping(value="addProbationById",method={RequestMethod.GET,RequestMethod.POST})
    public String addProbationById(Model model,Probation probation){
    	probationService.addProbationById(probation);
    	List<Probation> allProbation = probationService.selectAllProbation();
    	model.addAttribute("allProbation", allProbation);
    	
    	return "probation/probationInfo";	
    }
		
		//��ת��Ա����Ϣ��ѯ
		@RequestMapping(value="selectPassEmployee",method={RequestMethod.GET,RequestMethod.POST})
		public String selectPassEmployee(Model model){
			List<Probation> allPassProbation = probationService.selectPassEmployee();
			model.addAttribute("allProbation", allPassProbation);
			return "probation/probationInfo";	
			
		}
	
	
	
	//�޸�������
	@RequestMapping(value="updateProbation",method={ RequestMethod.GET,RequestMethod.POST})
	public String updateProbation(Model model,int id,String operate,RedirectAttributes arr ){	
		Probation probation = new Probation();
		probation.setPro_id(id);
		probation.setResult(operate);
		arr.addFlashAttribute("probation",probation);
		//�жϽ��к��ֲ���
		if((operate.equals("1"))||(operate.equals("3"))){
			probationService.updateProbation_pass(probation);
			List<Probation> allProbation = probationService.selectAllProbation();
			model.addAttribute("allProbation",allProbation);
			return "probation/probationInfo";
		}else{
			return "redirect:updateProbation_delay_show.action";
		}
		
	}
	
	//������������ʾ
	@RequestMapping(value="updateProbation_delay_show",method={ RequestMethod.GET,RequestMethod.POST})
	public String updateProbation_delay_show(Model model,Probation probation ){
		int pro_id = probation.getPro_id();
		Date end_date = probationService.selectProbationDateById(pro_id);
		probation.setEnd_date(end_date);
	    model.addAttribute("probation",probation);
		return "probation/delayProbation";
	}
	
	//���������ڸ���
	@RequestMapping(value="updateProbationDateByID",method={ RequestMethod.GET,RequestMethod.POST})
	public String updateProbationDateByID(Model model,Probation probation ){
		probationService.updateProbationDateByID(probation);
		List<Probation> allProbation = probationService.selectAllProbation();
		//�����ݴ��ݵ�ҳ��,ҳ��Ϳ���ͨ��modelȡ����ֵ
		model.addAttribute("allProbation",allProbation);
		//����ҳ����
		return "probation/probationInfo";
	}
}
