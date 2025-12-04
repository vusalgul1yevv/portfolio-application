package com.example.Start_Bootstrap_Blog.services.impl;

import com.example.Start_Bootstrap_Blog.repositories.SocialNetworkRepository;
import com.example.Start_Bootstrap_Blog.services.SocialNetworkService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SocialNetworkServiceImpl implements SocialNetworkService {
    private final SocialNetworkRepository socialNetworkRepository;
}
