package com.example.demo.Service.Implementations;

import com.example.demo.Model.Contact;
import java.lang.Iterable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Service.ContactService;
import com.example.demo.Repository.ContactRepository;

@Service
public class ContactServiceImpl implements ContactService {

    @Autowired
    private ContactRepository contactRepository;

    @Override
    public Contact getContact(String id){
        Contact response = null;
        if(contactRepository.existsById(id)){
            Iterable<Contact> contacts = contactRepository.getContact(id);
            for(Contact contact : contacts){
                response = contact;
            }
            return response;
        }
        return response;
    }

    @Override
    public Contact addContact(Contact contact){
        return contactRepository.save(contact);
    }

    @Override
    public Contact updateContact(Contact contact){
        if(contactRepository.existsById(String.valueOf(contact.getId()))){
            return contactRepository.save(contact);
        } else {
            return null;
        }
    }

    @Override
    public void deleteContact(String id){
        contactRepository.deleteById(id);
    }


}