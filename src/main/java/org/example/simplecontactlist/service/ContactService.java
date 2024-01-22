package org.example.simplecontactlist.service;

import org.example.simplecontactlist.entitites.Contact;
import org.example.simplecontactlist.repository.ContactRepository;
import org.example.simplecontactlist.repository.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactService {
    private final Repository repository;

    public ContactService(Repository repository) {
        this.repository = repository;
    }
    public List<Contact> selectAll(){
        return repository.selectAll();
    }
}
