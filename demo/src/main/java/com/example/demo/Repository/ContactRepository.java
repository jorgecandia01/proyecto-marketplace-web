package com.example.demo.Repository;

import org.springframework.data.jdbc.repository.query.Modifying;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.example.demo.Model.Contact;

import java.lang.Iterable;

public interface ContactRepository extends CrudRepository<Contact, String>{

}