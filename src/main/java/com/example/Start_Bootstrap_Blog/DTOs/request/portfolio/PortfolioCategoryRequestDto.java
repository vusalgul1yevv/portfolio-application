package com.example.Start_Bootstrap_Blog.DTOs.request.portfolio;

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
public class PortfolioCategoryRequestDto {
    private String name;
    private List<PortfolioItem> portfolioItems;
}
