package com.example.db;

import org.springframework.stereotype.Component;

@Component
public class StaffModel {
	private int id;
	private String email;
	private String phone;
	private String password;
	private String position;
	private String create_date;
	
	public StaffModel() {}
	
	public StaffModel(int id, String email, String phone, String password, 
			String position, String create_date) {
		this.id = id;
		this.email = email;
		this.phone = phone;
		this.password = password;
		this.position = position;
		this.create_date = create_date;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getCreate_date() {
		return create_date;
	}
	public void setCreate_date(String create_date) {
		this.create_date = create_date;
	}
}