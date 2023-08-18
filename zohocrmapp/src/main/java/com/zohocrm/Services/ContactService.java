package com.zohocrm.Services;

import java.util.List;

import com.zohocrm.entities.Contacts;

public interface ContactService {
     public void saveContact(Contacts contact);


	public List<Contacts> listContacts();


	public Contacts getOneContactById(long id);
     
}
