package com.rest.webservices.post;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;



public interface PostRepository extends JpaRepository<Post, Integer> {
	
	@Query("FROM Post where user_id =:id")
    List<Post> findPostByUser(Integer id) throws NoSuchElementException;
	
	@Query("FROM Post where user_id =:userId AND post_id =:postId")
    Post findPost(Integer userId , Integer postId) throws NoSuchElementException;

}
