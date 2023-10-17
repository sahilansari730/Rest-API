package org.jsp.userbootapp.dao;

import java.util.List;
import java.util.Optional;

import org.jsp.userbootapp.dto.User;
import org.jsp.userbootapp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {
	@Autowired
	private UserRepository repository;

	public User savUser(User user) {
		return repository.save(user);
	}

	public Optional<User> findUser(int id) {
		return repository.findById(id);
	}

	public List<User> findAll() {
		return repository.findAll();
	}

	public void deleteUser(int id) {
		repository.deleteById(id);
	}
}
