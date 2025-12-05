package com.example.Start_Bootstrap_Blog.DTOs.response.portfolio;

import com.example.Start_Bootstrap_Blog.entities.portfolio.PortfolioItem;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PortfolioCategoryResponseDto {
    private Long id;
    private String name;
    private List<PortfolioItem> portfolioItems;
}
