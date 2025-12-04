package com.example.Start_Bootstrap_Blog.services.impl;

import com.example.Start_Bootstrap_Blog.repositories.PartnersRepository;
import com.example.Start_Bootstrap_Blog.services.PartnersService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PartnersServiceImpl implements PartnersService {
    private final PartnersRepository partnersRepository;
}
