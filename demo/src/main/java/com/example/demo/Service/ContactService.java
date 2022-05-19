package com.example.demo.Service;


import com.example.demo.Model.Contact;

public interface ContactService{
    public Contact getContact(String id);
    public Contact addContact(Contact contact);
    public Contact updateContact(Contact contact);
    public void deleteContact(String id);
}