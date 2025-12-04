package com.example.Start_Bootstrap_Blog.repositories;

import com.example.Start_Bootstrap_Blog.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client,Long> {
}
