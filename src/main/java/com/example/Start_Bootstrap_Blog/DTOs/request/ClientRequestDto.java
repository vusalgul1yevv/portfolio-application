package com.example.Start_Bootstrap_Blog.DTOs.request;

import com.example.Start_Bootstrap_Blog.entities.portfolio.PortfolioItem;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ClientRequestDto {
    private List<PortfolioItem> portfolioItems;

}
