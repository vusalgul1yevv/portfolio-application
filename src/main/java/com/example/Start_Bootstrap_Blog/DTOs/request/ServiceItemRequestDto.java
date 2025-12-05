package com.example.Start_Bootstrap_Blog.DTOs.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ServiceItemRequestDto {
    private String icon;
    private String title;
    private String subTitle;
}
