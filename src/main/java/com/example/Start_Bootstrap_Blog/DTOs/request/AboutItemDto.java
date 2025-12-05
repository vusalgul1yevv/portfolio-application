package com.example.Start_Bootstrap_Blog.DTOs.request;

import jakarta.persistence.Column;

public class AboutItemDto {
    private Long id;

    private String date;

    private String title;

    private String description;

    @Column(nullable = false, name = "image_url")
    private String imageUrl;

}
