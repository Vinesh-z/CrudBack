package com.mindtree.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.mindtree.entity.User;

@Repository
public interface UserDao extends JpaRepository<User, Integer> {
	@Query(value = "Select * from user where email = ?1", nativeQuery = true)
	public User findUserByEmail(String email);
	
	@Modifying
	@Query(value = "delete from user where mid = ?1", nativeQuery = true)
	public void deleteById(int mid);
	
}
