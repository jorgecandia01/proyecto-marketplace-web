package com.example.demo.Service;


import com.example.demo.Model.Contact;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;
import java.lang.Iterable;

public interface ContactService{
    public Contact getContact(String id);
    public Contact addContact(Contact contact);
    public Contact updateContact(Contact contact);
    public void deleteContact(String id);
}