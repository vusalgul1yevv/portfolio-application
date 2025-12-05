package com.example.Start_Bootstrap_Blog.DTOs.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ContactRequestDto {
    private String backgroundImageUrl;
    private String name;
    private String email;
    private String password;
    private String message;
}
