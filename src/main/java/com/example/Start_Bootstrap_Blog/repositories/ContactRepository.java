package com.example.Start_Bootstrap_Blog.repositories;

import com.example.Start_Bootstrap_Blog.entities.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository extends JpaRepository<Contact,Long> {
}
