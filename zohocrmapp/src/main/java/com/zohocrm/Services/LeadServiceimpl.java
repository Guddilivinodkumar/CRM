package com.zohocrm.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zohocrm.Repositories.LeadRepository;
import com.zohocrm.entities.Lead;

@Service
public class LeadServiceimpl implements LeadService {
	
	@Autowired
    private LeadRepository leadrepo;
	
	@Override
	public void saveoneLead(Lead lead) {
     		leadrepo.save(lead);
	}

	@Override
	public Lead getOneLeadById(long id) {
                 Optional<Lead> findById = leadrepo.findById(id);
                 Lead lead2 = findById.get();
		return lead2; 		
	}

	@Override
	public void deleteOneLead(long id) {
          leadrepo.deleteById(id);		
	}

	@Override
	public List<Lead> listLeads() {
           List<Lead> findAll = leadrepo.findAll();      
		return findAll;
	}
       
}
