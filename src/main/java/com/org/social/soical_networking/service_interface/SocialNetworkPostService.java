package com.org.social.soical_networking.service_interface;

import java.util.List;

import com.org.social.soical_networking.entity.SocialNetworkPost;

public interface SocialNetworkPostService {
	public List<SocialNetworkPost> getTop10PostsByCategory(String postCategory);

	public List<SocialNetworkPost> searchPostsByAuthor(String author);
}
