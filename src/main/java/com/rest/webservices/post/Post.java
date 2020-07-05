package com.rest.webservices.post;


import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.rest.webservices.user.User;

import io.swagger.annotations.ApiModel;

@ApiModel(description = "Post created by user.")
@Entity
public class Post {
	
	@Id
	@GeneratedValue
	private Integer post_id;
	private String subject;
	private String description;
	
	@ManyToOne(fetch= FetchType.LAZY)
	@JsonIgnore
	private User user;
	
	
	/**
	 * @return the post_id
	 */
	public Integer getPost_id() {
		return post_id;
	}
	/**
	 * @param post_id the post_id to set
	 */
	public void setPost_id(Integer post_id) {
		this.post_id = post_id;
	}
	/**
	 * @return the subject
	 */
	public String getSubject() {
		return subject;
	}
	/**
	 * @param subject the subject to set
	 */
	public void setSubject(String subject) {
		this.subject = subject;
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * @return the user
	 */
	public User getUser() {
		return user;
	}
	/**
	 * @param user the user to set
	 */
	public void setUser(User user) {
		this.user = user;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Post [post_id=" + post_id + ", subject=" + subject + ", description=" + description + ", user=" + user
				+ "]";
	}
	
	

}
