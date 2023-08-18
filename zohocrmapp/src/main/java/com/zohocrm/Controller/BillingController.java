package com.zohocrm.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zohocrm.Services.BillingService;
import com.zohocrm.Services.ContactService;
import com.zohocrm.entities.Billing;
import com.zohocrm.entities.Contacts;

@Controller
public class BillingController {

	@Autowired
	private BillingService billservice;
	@Autowired
	private ContactService contactservice;
	
	@RequestMapping("/showGenerateBill")
	public String showGenerateBillPage(@RequestParam("id") long id, ModelMap model) {
		Contacts oneContactById = contactservice.getOneContactById(id);
		model.addAttribute("bill", oneContactById);
		return "generate_bill";
	}
	
	@RequestMapping("/generateBill")
	public String generateBill(@ModelAttribute("bill")Billing bill,ModelMap model) {
		    billservice.saveBill(bill);
		    model.addAttribute("bill", bill);
		return "search_billing_result";
	}
}
