package org.example.simplecontactlist.controller;

import lombok.extern.slf4j.Slf4j;
import org.example.simplecontactlist.entitites.Contact;
import org.example.simplecontactlist.service.ContactService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@Slf4j
public class ContactController {
    private final ContactService contactService;

    public ContactController(ContactService contactService) {
        this.contactService = contactService;
    }

    @GetMapping("/")
    public String index(Model model){
        List<Contact> contactList = contactService.selectAll();
        model.addAttribute("contacts", contactList);
        return "index";
    }

}
