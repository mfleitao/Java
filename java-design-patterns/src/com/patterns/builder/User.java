package com.patterns.builder;

public class User {

	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private String phoneNumber;
	private String status;

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return password;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public String getStatus() {
		return status;
	}

	private User(Builder builder) {
		this.firstName = builder.firstName;
		this.lastName = builder.lastName;
		this.email = builder.email;
		this.password = builder.password;
		this.phoneNumber = builder.phoneNumber;
		this.status = builder.status;
	}

	@Override
	public String toString() {
		StringBuilder userStr = new StringBuilder();
		userStr.append("User [firstName=");
		userStr.append(firstName);
		userStr.append(", lastName=");
		userStr.append(lastName);
		userStr.append(", email=");
		userStr.append(email);
		userStr.append(", password=");
		userStr.append(password);
		userStr.append(", phoneNumber=");
		userStr.append(phoneNumber);
		userStr.append(", status=");
		userStr.append(status);
		userStr.append("]");
		return userStr.toString();
	}

	public static class Builder {

		private String firstName;
		private String lastName;
		private String email;
		private String password;
		private String phoneNumber;
		private String status;

		public Builder() {
		}

		public Builder firstName(String firstName) {
			this.firstName = firstName;
			return this;
		}

		public Builder lastName(String lastName) {
			this.lastName = lastName;
			return this;
		}

		public Builder email(String email) {
			this.email = email;
			return this;
		}

		public Builder password(String password) {
			this.password = password;
			return this;
		}

		public Builder phoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
			return this;
		}

		public Builder status(String status) {
			this.status = status;
			return this;
		}

		public User build() {
			return new User(this);
		}

	}
}
