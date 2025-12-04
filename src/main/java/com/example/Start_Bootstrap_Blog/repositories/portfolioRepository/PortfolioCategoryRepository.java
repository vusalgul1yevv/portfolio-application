package com.example.Start_Bootstrap_Blog.repositories.portfolioRepository;

import com.example.Start_Bootstrap_Blog.entities.portfolio.PortfolioCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PortfolioCategoryRepository extends JpaRepository<PortfolioCategory,Long> {
}
