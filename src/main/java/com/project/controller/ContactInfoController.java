 package com.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.project.dto.Contact;
import com.project.service.ContactService;
import com.project.service.ContactServiceImpl;



@Controller
public class ContactInfoController {
	
	@Autowired
	private ContactService contactService;
	
	@GetMapping("/addContact")
	public String loadForm(Model model) {
		Contact c= new Contact();
		model.addAttribute("contact", c);
		return "contactInfo";
	}
	
	@PostMapping(value="/saveContact")
	public String handleSubmitButton(@ModelAttribute("contact")Contact c,Model model) {
		boolean isSaved=contactService.saveContact(c);
		if(isSaved) {
			model.addAttribute("sucessMsg", "contact Saved");
			
		}
		else {
			model.addAttribute("errorMsg", "Failed to save Contact");
			
		}
		return "contactInfo";
	}
	@GetMapping("/viewContacts")
	public String handleViewContactsLink(Model model) {
		List<Contact> ContactsList=contactService.getAllContacts();
		model.addAttribute("contact", ContactsList);
		return "viewContacts";
	}

}
