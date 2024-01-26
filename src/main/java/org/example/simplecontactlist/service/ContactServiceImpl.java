package org.example.simplecontactlist.service;

import org.example.simplecontactlist.entitites.Contact;
import org.example.simplecontactlist.repository.MyRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ContactServiceImpl implements ContactService{
    private final MyRepository myRepository;

    public ContactServiceImpl(MyRepository myRepository) {
        this.myRepository = myRepository;
    }
    public List<Contact> selectAll(){
        return new ArrayList<>(myRepository.selectAll());
    }

    @Override
    public Contact selectContact(long id) {
        return (Contact) myRepository.selectById(id).orElse(null);
    }

    @Override
    public long addContact(Contact contact) {
        contact.setId(System.currentTimeMillis());
        return myRepository.insert(contact);
    }
    @Override
    public void deleteContact(long id) {
        myRepository.removeById(id);
    }

    @Override
    public Contact updateContact(Contact contact) {
        return (Contact) myRepository.update(contact);
    }

    @Override
    public void addListContact(List<Contact> contactList) {
        myRepository.batchInsert(contactList);
    }


}
