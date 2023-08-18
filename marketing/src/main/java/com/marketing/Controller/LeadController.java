package com.marketing.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.marketing.DTO.LeadData;
import com.marketing.entities.Lead;
import com.marketing.services.LeadService;

@Controller
public class LeadController {

	@Autowired
	private LeadService leadService;
	
	//handler method
	@RequestMapping("/createLead")
	public String viewCreateLeadPage() {
		return "create_lead";
	
	}
	
	@RequestMapping("/saveLead")
	public String saveOneLead(@ModelAttribute("lead") Lead lead, ModelMap model) {
		leadService.saveLead(lead);
		model.addAttribute("msg", "Lead is saved!!");
		
		System.out.println(lead.getFirstName());
  	    System.out.println(lead.getLastName());
		System.out.println(lead.getEmail());
		return "create_lead";
	}
	
//	@RequestMapping("/saveLead")
//	public String saveOneLead(@RequestParam("firstName") String fname , @RequestParam("lastname") String lName , @RequestParam("email") String email , @RequestParam("mobile") long mobile) {
//		System.out.println(fname);
//		System.out.println(lName);
//		System.out.println(email);
//		System.out.println(mobile);
	
//		Lead l = new Lead();
//		l.setFirstName(fname);
//		l.setLastName(lName);
//		l.setEmail(email);
//		l.setMobile(mobile);
	
//		leadService.saveLead(l);
//		return "create_lead";
//	}
	
	//DTO - Data transfer Object
	
//	@RequestMapping("/saveLead")
	public String saveOneLead(LeadData data,ModelMap model) {
	System.out.println(data.getFirstName());
//		System.out.println(data.getLastName());
//		System.out.println(data.getEmail());
//		System.out.println(data.getMobile());
//		     
//		Lead l = new Lead();
//		l.setFirstName(data.getFirstName());
//		l.setLastName(data.getLastName());
//		l.setEmail(data.getEmail());
//		l.setMobile(data.getMobile());
//		
//        leadService.saveLead(l);
//		model.addAttribute("{msg","Lead is saved!!");
		return "create_lead";
	}
	
	@RequestMapping("/listall")
	public String listAllLeads(ModelMap model) {
		List<Lead> leads = leadService.listLeads();
		model.addAttribute("leads", leads);
		return "lead_search_result";
	
	}
	@RequestMapping("/delete")
	public String deleteOneLead(@RequestParam("id") long id ,ModelMap model) {
		leadService.deleteLeadById(1);
		List<Lead> leads = leadService.listLeads();
		model.addAttribute("leads", leads);   
		return"lead_search_result";
	}
	@RequestMapping("/update")
	public String updateOneLead(@RequestParam("id")long id,ModelMap model) {
		Lead lead = leadService.getOneLead(id);
		model.addAttribute("lead", lead);   
		return "update_lead";
	}
	@RequestMapping("/updateLead")
	public String updateOneLeadData(LeadData data,ModelMap model) {
		Lead l = new Lead();
		l.setId(data.getId());
		l.setFirstName(data.getFirstName());
		l.setLastName(data.getLastName());
		l.setEmail(data.getEmail());
		l.setMobile(data.getMobile());
		leadService.saveLead(l);
		List<Lead> leads = leadService.listLeads();
		model.addAttribute("leads", leads); 
		return "lead_search_result";
	}
}
