package org.example.simplecontactlist.service;

import org.example.simplecontactlist.entitites.Contact;

import java.util.List;

public interface ContactService {
    List<Contact> selectAll();
    Contact selectContact(long id);
    long addContact(Contact contact);

    void deleteContact(long id);

   Contact updateContact(Contact contact);
   void addListContact(List<Contact> contactList);
}
