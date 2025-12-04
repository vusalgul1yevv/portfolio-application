package com.example.Start_Bootstrap_Blog.services.impl;

import com.example.Start_Bootstrap_Blog.repositories.ContactRepository;
import com.example.Start_Bootstrap_Blog.services.ContactService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ContactServiceImpl implements ContactService {
    private final ContactRepository contactRepository;
}
