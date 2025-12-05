package com.example.Start_Bootstrap_Blog.DTOs.request;

import com.example.Start_Bootstrap_Blog.entities.TeamMember;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SocialNetworkRequestDto {
    private TeamMember teamMember;
}
