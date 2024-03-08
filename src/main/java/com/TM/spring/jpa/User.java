package com.TM.spring.jpa;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;

@Entity
@Table(name = "user")
public class User {
	@Id
	@Column(name = "username")
	@NotBlank(message = "Username cannot be empty.")
	private String username;
	
	@Column(name = "password")
	@NotBlank(message = "Password cannot be empty.")
	private String password;
	
	public User( ) { }
	
	public User(
			String username,String password) {
		this.username = username;
		this.password = password;
	}
	
	
	public String getUsername() {
		return this.username;
	}
	public void setUsername(String username) {
		this.username =  username;
	}
	
	
	public String getPassword() {
		return this.password;
	}
	public void setPassword(String password) {
		this.password =  password;
	}
}
