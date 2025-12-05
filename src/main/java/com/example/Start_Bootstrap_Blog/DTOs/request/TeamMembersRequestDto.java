package com.example.Start_Bootstrap_Blog.DTOs.request;

import com.example.Start_Bootstrap_Blog.entities.SocialNetwork;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TeamMembersRequestDto {
    private String image_url;
    private String name;
    private String profession;
    private List<SocialNetwork> socialNetworks;
}
