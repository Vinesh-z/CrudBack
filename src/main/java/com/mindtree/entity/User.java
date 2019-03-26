package com.mindtree.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User {
	@Id
	@GeneratedValue
	@Column(name = "mid", nullable = false)
	private int Mid;
	@Column(name = "name", nullable = false)
	private String name;
	@Column(name = "email", nullable = false)
	private String email;
	@Column(name = "age", nullable = false)
	private int age;

	public int getMid() {
		return Mid;
	}

	public void setMid(int mid) {
		Mid = mid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "User [Mid=" + Mid + ", name=" + name + ", email=" + email + ", age=" + age + "]";
	}

	public User(int mid, String name, String email, int age) {
		super();
		Mid = mid;
		this.name = name;
		this.email = email;
		this.age = age;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

}
