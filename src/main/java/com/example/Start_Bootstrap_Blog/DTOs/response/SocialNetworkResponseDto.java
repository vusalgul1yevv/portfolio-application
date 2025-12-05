package com.example.Start_Bootstrap_Blog.DTOs.response;

import com.example.Start_Bootstrap_Blog.entities.TeamMember;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SocialNetworkResponseDto {
    private Long id;
    private TeamMember teamMember;
}
