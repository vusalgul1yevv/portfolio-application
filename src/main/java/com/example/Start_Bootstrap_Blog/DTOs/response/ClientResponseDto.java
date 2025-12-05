package com.example.Start_Bootstrap_Blog.DTOs.response;

import com.example.Start_Bootstrap_Blog.entities.portfolio.PortfolioItem;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ClientResponseDto {
    private Long id;
    private List<PortfolioItem> portfolioItems;
}
