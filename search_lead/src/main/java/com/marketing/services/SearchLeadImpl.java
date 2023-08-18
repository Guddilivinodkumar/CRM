package com.marketing.services;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.marketing.DTO.Lead;

@Service
public class SearchLeadImpl implements SearchLead{

	@Override
	public Lead getleadById(long id) {
            RestTemplate restTemplate = new RestTemplate();
            Lead lead = restTemplate.getForObject("http://localhost:8080/api/leads/leadinfo/"+id, Lead.class) ;
		return lead;
	}

}
