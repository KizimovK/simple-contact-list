package org.example.simplecontactlist.service;

import org.example.simplecontactlist.entitites.Contact;
import org.example.simplecontactlist.repository.MyRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ContactServiceImpl implements ContactService{
    private final MyRepository repository;

    public ContactServiceImpl(MyRepository repository) {
        this.repository = repository;
    }
    public List<Contact> selectAll(){
        return new ArrayList<>(repository.selectAll());
    }

    @Override
    public Contact selectContact(long id) {
        return (Contact) repository.selectById(id).orElse(null);
    }

    @Override
    public long addContact(Contact contact) {
        contact.setId(System.currentTimeMillis());
        return repository.insert(contact);
    }

    @Override
    public void deleteContact(long id) {
        repository.removeById(id);
    }


}
