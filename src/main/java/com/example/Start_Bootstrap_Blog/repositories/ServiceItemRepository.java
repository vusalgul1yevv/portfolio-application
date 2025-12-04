package com.example.Start_Bootstrap_Blog.repositories;

import com.example.Start_Bootstrap_Blog.entities.ServiceItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServiceItemRepository extends JpaRepository<ServiceItem,Long> {
}
