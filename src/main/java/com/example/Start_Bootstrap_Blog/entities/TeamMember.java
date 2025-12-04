package com.example.Start_Bootstrap_Blog.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "team_items")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TeamMember {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, name = "image_url")
    private String image_url;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String profession;

    @OneToMany(mappedBy = "teamMember")
    private List<SocialNetwork> socialNetworks;
}
