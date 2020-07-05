package com.rest.webservices.post;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.rest.webservices.user.User;
import com.rest.webservices.user.UserRepository;


@Service
public class PostDaoService {
	
	@Autowired
	PostRepository repository;
	
	@Autowired
	UserRepository userRepo;
	
	List<Post> getAllPosts(){
		return repository.findAll();
	}
	

	List<Post> getAllPostOfUser(Integer id) {
		return repository.findPostByUser(id);
	}

	
	
	public Post getPost(Integer userId ,Integer postId) {
		return repository.findPost(userId, postId);
	}
	public Post save(Post post,Integer id ) {
		// TODO Auto-generated method stub
		Optional<User> user = userRepo.findById(id);
		post.setUser(user.get());
		return repository.save(post);
	}
	
	
	
	
	
	
	

}
