package com.mindtree.serviceImplementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.entity.User;
import com.mindtree.repository.UserDao;

@Service
public class UserServiceImplementation {

	@Autowired
	private UserDao userDao;

	public String addUser(User user) {
		userDao.save(user);
		return "added successfully";
	}

	public String deleteUser(int user) {
		userDao.deleteById(user);
		return "User deleted successfully";
	}

	public List<User> getUsers() {
		return userDao.findAll();
	}

	public String updateUser(User user) {
		userDao.save(user);
		return "updated successfully";
	}

	public User getUser(String mail) {
		return userDao.findUserByEmail(mail);
	}

}
