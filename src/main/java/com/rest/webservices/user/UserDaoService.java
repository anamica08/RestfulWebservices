package com.rest.webservices.user;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;


@Service
public class UserDaoService {
	
	@Autowired
	UserRepository repository;
	

	public List<User> findAll() {
		return repository.findAll();
	}

	public User save(User user) {
		return repository.save(user);
	}

	public  Optional<User> findOne(int id) {
		return repository.findById(id);

	}

	public void deleteById(int id) {
		try {
		repository.deleteById(id);
		}catch(EmptyResultDataAccessException e) {
			throw new UserNotFoundException("id-"+ id);	
		}
	}
}
