package com.example.Start_Bootstrap_Blog.services.impl;

import com.example.Start_Bootstrap_Blog.DTOs.response.AboutItemResponseDto;
import com.example.Start_Bootstrap_Blog.repositories.AboutItemRepository;
import com.example.Start_Bootstrap_Blog.services.AboutService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AboutItemServiceImpl implements AboutService {
    private final AboutItemRepository aboutItemRepository;
    @Override
    public AboutItemResponseDto getBlogId(Long id) {
        AboutIt about = blogRepository.findById(id).orElse(null);
        if(blog == null){
            return null;
        }
        return null;
    }

    @Override
    public BlogResponseDto createBlog(BlogResponseDto blogResponseDto) {
        Blog blog = new Blog();
        blog.setTitle(blogResponseDto.getTitle());
        blog.setDescription(blogResponseDto.getDescription());
        blog.setImageUrl(blogResponseDto.getImageUrl());
        Blog savedBlog = blogRepository.save(blog);
        return new BlogResponseDto(
                savedBlog.getId(),
                savedBlog.getTitle(),
                savedBlog.getDescription(),
                savedBlog.getImageUrl(),
                savedBlog.getCreatedAt()
        );

    }

    @Override
    public BlogResponseDto updateBlog(Long id, BlogResponseDto blogResponseDto) {
        Blog blog = blogRepository.findById(id).orElse(null);
        if(blog == null){
            return null;
        }

        blog.setTitle(blogResponseDto.getTitle());
        blog.setDescription(blogResponseDto.getDescription());
        blog.setImageUrl(blogResponseDto.getImageUrl());
        Blog savedBlog = blogRepository.save(blog);
        return new BlogResponseDto(
                savedBlog.getId(),
                savedBlog.getTitle(),
                savedBlog.getDescription(),
                savedBlog.getImageUrl(),
                savedBlog.getCreatedAt()
        );

    }

    @Override
    public void deleteBlog(Long id) {
        blogRepository.deleteById(id);
    }
}
