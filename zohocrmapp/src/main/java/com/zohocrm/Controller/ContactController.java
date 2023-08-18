package com.zohocrm.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zohocrm.Services.ContactService;
import com.zohocrm.entities.Contacts;

@Controller
public class ContactController {
	
	@Autowired
	private ContactService contactservice;
	
	@RequestMapping("/listallcontacts")
	public String listAllContacts(ModelMap model) {
	List<Contacts> listContacts = contactservice.listContacts();
	model.addAttribute("contacts", listContacts);
	return "search_contact_result";
	
	}
	
	@RequestMapping("/contactInfo")
	public String contactInfo(@RequestParam("id")Long id,ModelMap model) {
		Contacts oneContactById = contactservice.getOneContactById(id);
		model.addAttribute("contact", oneContactById);
		return "contact_info";
	}
	
	
      
}
