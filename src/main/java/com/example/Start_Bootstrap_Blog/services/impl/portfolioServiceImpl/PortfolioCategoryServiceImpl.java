package com.example.Start_Bootstrap_Blog.services.impl.portfolioServiceImpl;

import com.example.Start_Bootstrap_Blog.repositories.portfolioRepository.PortfolioCategoryRepository;
import com.example.Start_Bootstrap_Blog.services.portfolioService.PortfolioCategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PortfolioCategoryServiceImpl implements PortfolioCategoryService {
    private final PortfolioCategoryRepository categoryRepository;
}
