package com.example.Start_Bootstrap_Blog.repositories.portfolioRepository;

import com.example.Start_Bootstrap_Blog.entities.portfolio.PortfolioItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PortfolioItemRepository extends JpaRepository<PortfolioItem,Long> {
}
