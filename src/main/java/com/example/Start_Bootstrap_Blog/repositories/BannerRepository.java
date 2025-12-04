package com.example.Start_Bootstrap_Blog.repositories;

import com.example.Start_Bootstrap_Blog.entities.Banner;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BannerRepository extends JpaRepository<Banner,Long> {
}
