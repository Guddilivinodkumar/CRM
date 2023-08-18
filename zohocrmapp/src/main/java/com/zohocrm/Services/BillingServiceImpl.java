package com.zohocrm.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zohocrm.Repositories.BillingRepository;
import com.zohocrm.entities.Billing;

@Service
public class BillingServiceImpl implements BillingService {

	@Autowired
	 private BillingRepository billrepo;
	
	@Override
	public void saveBill(Billing bill) {
           	billrepo.save(bill);	
	}
    
	
}
