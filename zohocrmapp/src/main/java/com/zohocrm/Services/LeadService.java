package com.zohocrm.Services;

import java.util.List;

import com.zohocrm.entities.Lead;

public interface LeadService {

	public void saveoneLead(Lead lead);

	public Lead getOneLeadById(long id);

	public void deleteOneLead(long id);

	public List<Lead> listLeads();

}
