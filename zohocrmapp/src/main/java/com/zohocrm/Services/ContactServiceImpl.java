package com.zohocrm.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zohocrm.Repositories.ContactRepository;
import com.zohocrm.entities.Contacts;

@Service
public class ContactServiceImpl implements ContactService {

	@Autowired
	private ContactRepository contactrepo;
	
	@Override
	public void saveContact(Contacts contact) {
		contactrepo.save(contact);
	}

	@Override
	public List<Contacts> listContacts() {
             List<Contacts> findAll = contactrepo.findAll();
		return findAll;
	}

	@Override
	public Contacts getOneContactById(long id) {
                Optional<Contacts> findById = contactrepo.findById(id);
                  Contacts contacts = findById.get();
		return contacts;
	}

}
