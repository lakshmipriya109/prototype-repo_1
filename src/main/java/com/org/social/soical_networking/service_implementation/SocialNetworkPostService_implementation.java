package com.org.social.soical_networking.service_implementation;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.org.social.soical_networking.entity.SocialNetworkPost;
import com.org.social.soical_networking.repository.SocialNetworkPostRepository;
import com.org.social.soical_networking.service_interface.SocialNetworkPostService;

@Service
public class SocialNetworkPostService_implementation implements SocialNetworkPostService{

    @Autowired
    private SocialNetworkPostRepository repository;
    
    @Override
    public List<SocialNetworkPost> getTop10PostsByCategory(String postCategory) {
        return repository.findTop10ByPostCategoryOrderByViewCountDesc(postCategory);
    }

    @Override
    public List<SocialNetworkPost> searchPostsByAuthor(String author) {
        return repository.findByAuthor(author);
    }
}
