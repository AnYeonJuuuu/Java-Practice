package com.kh.user.model.vo.User;

public class User {
	public User() {

	}

	public User(String userId, String usePwd) {
		this.userId = userId;
		this.usePwd = usePwd;
	}

	public User(String userId, String usePwd, String userName, String address, String phone, char gender) {
		super();
		this.userId = userId;
		this.usePwd = usePwd;
		this.userName = userName;
		this.address = address;
		this.phone = phone;
		this.gender = gender;
	}

	private String userId;
	private String usePwd;
	private String userName;
	private String address;
	private String phone; 
	private char gender;

	
	@Override
	
	public String toString() {
		return "User [userId=" + userId + ", usePwd=" + usePwd + ", userName=" + userName + ", address=" + address
				+ ", phone=" + phone + ", gender=" + gender + "]";
	}


	public String getUserId() {
		return userId;
	}

	public void setUserld(String userId) {
		this.userId = userId;
	}

	public String getUsePwd() {
		return usePwd;
	}

	public void setUsePwd(String usePwd) {
		this.usePwd = usePwd;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

}
