package com.org.social.soical_networking.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.org.social.soical_networking.entity.SocialNetworkPost;

public interface SocialNetworkPostRepository extends JpaRepository<SocialNetworkPost, Long> {
	List<SocialNetworkPost> findTop10ByPostCategoryOrderByViewCountDesc(String postCategory);

	List<SocialNetworkPost> findByAuthor(String author);
}
