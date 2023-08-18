package com.marketing.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.marketing.DTO.Lead;
import com.marketing.services.SearchLead;

@Controller
public class SearchLeadController {
	@Autowired
	private SearchLead leadService;
	
	@RequestMapping("/search")
   public String viewSearchLeadPage() {
	   return "search_lead";
   }
	
	@RequestMapping("/searchLead")
	public String getLeadById(@RequestParam("id") long id,ModelMap model) {
		Lead lead = leadService.getleadById(id);
		model.addAttribute("model",lead);

//		System.out.println(lead.getId());
//		System.out.println(lead.getFirstName());
//		System.out.println(lead.getLastName());
//		System.out.println(lead.getEmail());
//		System.out.println(lead.getMobile());
		return "lead_info";
	}
}
