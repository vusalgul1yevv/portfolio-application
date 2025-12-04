package com.example.Start_Bootstrap_Blog.services.impl;

import com.example.Start_Bootstrap_Blog.repositories.AboutItemRepository;
import com.example.Start_Bootstrap_Blog.services.AboutService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AboutItemServiceImpl implements AboutService {
    private final AboutItemRepository aboutItemRepository;
}
