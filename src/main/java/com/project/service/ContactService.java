package com.project.service;

import java.util.List;

import com.project.dto.Contact;
import com.project.entity.ContactEntity;

public interface ContactService  {
	boolean saveContact(Contact c);
	List<Contact> getAllContacts();
	Contact getContactById(Integer cid);
	boolean updateContact(Contact c);
	boolean deleteContact(Integer cid);
	
	

}
