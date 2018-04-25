package com.cg.log.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="users")
public class Users
{
	@Id
	@Column(name="user_id")
	private String id;
	@Column(name="user_name")
	private String name;
	@Column(name="password")
	private String password;
	@Column(name="email")
	private String email;
	@Column(name="mobile_no")
	private String mobileNumber;
	@Column(name="phone")
	private String phoneNumber;
	@Column(name="role")
	private String role;
	@Column(name="address")
	private String address;

	public Users(String id, String password,String role, String name, String mobileNumber, String phoneNumber,
			String address,String email) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.email = email;
		this.mobileNumber = mobileNumber;
		this.phoneNumber = phoneNumber;
		this.role = role;
		this.address = address;
	}

	public Users() {
		super();
	}

	public Users(String id, String password) {
		super();
		this.id = id;
		this.password = password;
	}

	public Users(String name, String password, String email, 
			String mobileNumber, String phoneNumber,
			String role, String address) {
		super();
		//this.id = id;
		this.name = name;
		this.password = password;
		this.email = email;
		this.mobileNumber = mobileNumber;
		this.phoneNumber = phoneNumber;
		this.role = role;
		this.address = address;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}
