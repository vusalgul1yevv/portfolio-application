package com.example.Start_Bootstrap_Blog.repositories;

import com.example.Start_Bootstrap_Blog.entities.AboutItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AboutItemRepository extends JpaRepository<AboutItem,Long> {
}
