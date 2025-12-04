package com.example.Start_Bootstrap_Blog.services.impl;

import com.example.Start_Bootstrap_Blog.repositories.ClientRepository;
import com.example.Start_Bootstrap_Blog.services.ClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ClientServiceImpl implements ClientService {
    private final ClientRepository clientRepository;
}
