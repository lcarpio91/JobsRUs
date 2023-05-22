package com.skillstorm.jobsrus;

public class Users {

	private String id;
	private String name;
	private String email;
	private int phoneNumber;
	private String userName;
	private String password;

	// Need a resume as a .txt file

	public Users(String id, String name, String email, int phoneNumber, 
					String userName, String password) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.userName = userName;
		this.password = password;
	}

	public void createResume() {
		// check if resume exists
		// Prompt user for resume information and save it as
		// a .txt file in the user's folder
	}

	public void editInformation() {
		// Prompt user to edit their information and
		// update the corresponding CSV file
	}

	public boolean authenticate(String password) {
		// Check if the provided password matches the user's password
		return this.password.equals(password);
	}
	
	public void createAccount() {
		
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
