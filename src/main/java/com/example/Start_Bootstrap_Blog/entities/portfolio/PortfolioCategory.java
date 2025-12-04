package com.example.Start_Bootstrap_Blog.entities.portfolio;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "portfolio_categories")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PortfolioCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "category_name",nullable = false)
    private String name;

    @OneToMany(mappedBy = "portfolioCategory")
    private List<PortfolioItem> portfolioItems;
}
