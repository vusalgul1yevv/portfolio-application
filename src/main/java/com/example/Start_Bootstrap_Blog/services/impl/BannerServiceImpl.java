package com.example.Start_Bootstrap_Blog.services.impl;

import com.example.Start_Bootstrap_Blog.repositories.BannerRepository;
import com.example.Start_Bootstrap_Blog.services.BannerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BannerServiceImpl implements BannerService {
    private final BannerRepository bannerRepository;
}
