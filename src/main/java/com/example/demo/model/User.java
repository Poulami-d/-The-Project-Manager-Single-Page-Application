package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User {
	 	@Id
	    @GeneratedValue(strategy= GenerationType.AUTO)
		@Column(name = "user_id")
		private Integer userId;
	    @Column(name="first_name")
	    private String firstName;
	    @Column(name="last_name")
	    private String lastName;
	    @Column(name="email")
	    private String email;
		public User() {
			super();
			// TODO Auto-generated constructor stub
		}

	public User(Integer userId, String firstName, String lastName, String email) {
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}

