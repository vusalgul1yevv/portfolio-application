package com.example.Start_Bootstrap_Blog.entities.portfolio;

import com.example.Start_Bootstrap_Blog.entities.Client;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "portfolio_items")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PortfolioItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String subTitle;

    @Column(nullable = false, name = "image_url")
    private String imageUrl;

    @ManyToOne
    @JoinColumn(name = "portfolio_category_id")
    private PortfolioCategory portfolioCategory;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;

}
