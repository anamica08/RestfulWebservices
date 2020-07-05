package com.rest.webservices.post;

import java.net.URI;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;


@RestController
public class PostResource {

	@Autowired
	PostDaoService service; 
	
	
	
	@GetMapping("/users/posts")
	List<Post> getAllPosts(){
		return service.getAllPosts();
	}
	
	@GetMapping("/users/{id}/posts")
	List<Post> getAllPostOfUser(@PathVariable Integer id) {
		return service.getAllPostOfUser(id);
	}

	
	
	@GetMapping("users/{user_id}/posts/{post_id}")
	Post getPost(@PathVariable Integer user_id, @PathVariable Integer post_id) {
		return service.getPost(user_id, post_id);
	}
	
	
	@PostMapping("/users/{id}/posts")
	public ResponseEntity<Object> createPost(@Valid @RequestBody Post post,@PathVariable Integer id) {
		Post savedPost = service.save(post,id);
		// CREATED
		// /user/{id}     savedUser.getId()
		
		URI location = ServletUriComponentsBuilder
			.fromCurrentRequest()
			.path("/{id}")
			.buildAndExpand(savedPost.getPost_id()).toUri();
		
		return ResponseEntity.created(location).build();
		
	}
	


}
