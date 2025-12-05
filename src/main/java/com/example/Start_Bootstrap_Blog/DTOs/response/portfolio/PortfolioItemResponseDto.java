package com.example.Start_Bootstrap_Blog.DTOs.response.portfolio;

import com.example.Start_Bootstrap_Blog.entities.Client;
import com.example.Start_Bootstrap_Blog.entities.portfolio.PortfolioCategory;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PortfolioItemResponseDto {
    private Long id;
    private String title;
    private String subTitle;
    private String imageUrl;
    private PortfolioCategory portfolioCategory;
    private Client client;
}
