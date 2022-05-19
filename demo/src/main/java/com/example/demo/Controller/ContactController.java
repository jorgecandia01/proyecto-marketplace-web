package com.example.demo.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.Service.ContactService;
import com.example.demo.Model.Contact;

@RestController
@RequestMapping("/api/v1")
public class ContactController {
    @Autowired
    private ContactService contactService;

    @GetMapping("/contact/{id}") //HACER UNO DE BY USER
    public ResponseEntity<Contact> getContact(@PathVariable String id){
        Contact contact = contactService.getContact(id);
        return ResponseEntity.ok().body(contact);
    }

    @PostMapping("/contact")
    public ResponseEntity<Contact> addContact(@RequestBody Contact contact){
        contact.setId(null); //Lo hace lombok?
        Contact newContact = contactService.addContact(contact);
        return ResponseEntity.ok().body(newContact);
    }

    //NO HAY PUT, NO PUEDES EDITAR UNA SUGERENCIA YA ENVIADA

    @DeleteMapping("/contact/{id}")//HACER UNO DE BY USER
    public ResponseEntity<Contact> deleteContact(@PathVariable String id){
        contactService.deleteContact(id);
        return ResponseEntity.noContent().build();
    }
}
