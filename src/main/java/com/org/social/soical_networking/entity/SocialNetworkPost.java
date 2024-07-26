package com.org.social.soical_networking.entity;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Socialnetwork")
public class SocialNetworkPost {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "post_date")
    private Date postDate;

    @Column(name = "post_category")
    private String postCategory;

    @Column(name = "author")
    private String author;

    @Column(name = "content")
    private String content;

    @Column(name = "view_count")
    private Long viewCount;

	public SocialNetworkPost(Long id, Date postDate, String postCategory, String author, String content,
			Long viewCount) {
		super();
		this.id = id;
		this.postDate = postDate;
		this.postCategory = postCategory;
		this.author = author;
		this.content = content;
		this.viewCount = viewCount;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getPostDate() {
		return postDate;
	}

	public void setPostDate(Date postDate) {
		this.postDate = postDate;
	}

	public String getPostCategory() {
		return postCategory;
	}

	public void setPostCategory(String postCategory) {
		this.postCategory = postCategory;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Long getViewCount() {
		return viewCount;
	}

	public void setViewCount(Long viewCount) {
		this.viewCount = viewCount;
	}

}