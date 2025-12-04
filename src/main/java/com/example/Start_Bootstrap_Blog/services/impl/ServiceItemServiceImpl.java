package com.example.Start_Bootstrap_Blog.services.impl;

import com.example.Start_Bootstrap_Blog.repositories.PartnersRepository;
import com.example.Start_Bootstrap_Blog.repositories.ServiceItemRepository;
import com.example.Start_Bootstrap_Blog.services.ServiceItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ServiceItemServiceImpl implements ServiceItemService {
    private final ServiceItemRepository serviceItemRepository;
}
