package com.zohocrm.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zohocrm.Services.ContactService;
import com.zohocrm.Services.LeadService;
import com.zohocrm.entities.Contacts;
import com.zohocrm.entities.Lead;
import com.zohocrm.util.EmailService;

@Controller
public class LeadController {
	
	@Autowired
	private EmailService emailservice;
	
	@Autowired
	private LeadService leadservice;
	
	@Autowired
	private ContactService contactservice;
	
	@RequestMapping("/")
  public String viewCreateLeadPage() {
	  return "create_lead";
  }
	@RequestMapping("/save")
	public String saveLead(@ModelAttribute("lead")Lead lead , ModelMap model) {
		leadservice.saveoneLead(lead);
		//System.out.println(lead.getEmail());
		emailservice.sendMail("vinodkumarg849@gmail.com","welcome", "test Email");
		model.addAttribute("lead",lead);
		return "lead_info";
	}
	
	
	@RequestMapping("/convertLead")
	public String convertLead(@RequestParam("id") long id,ModelMap model) {
		Lead lead = leadservice.getOneLeadById(id);
		
		 Contacts con = new Contacts();
             con.setFirstName(lead.getFirstName());  
             con.setLastName(lead.getLastName());
             con.setEmail(lead.getEmail());
             con.setMobile(lead.getMobile());
             
             contactservice.saveContact(con);
             
         leadservice.deleteOneLead(id);   
         
         List<Contacts> listContacts = contactservice.listContacts();
     	model.addAttribute("contacts", listContacts);
		 return "search_contact_result";
	}
	
	
	@RequestMapping("/listall")
	public String listAllLeads(ModelMap model) {
		 List<Lead> leads = leadservice.listLeads();
        model.addAttribute("leads", leads);
		return "search_lead_result";
	}
	
	
	
	@RequestMapping("/leadInfo")
	public String leadInfo(@RequestParam("id") long id,ModelMap model) {
		Lead leadById = leadservice.getOneLeadById(id);
		model.addAttribute("lead", leadById);
		return "lead_info";
	}
	
}
