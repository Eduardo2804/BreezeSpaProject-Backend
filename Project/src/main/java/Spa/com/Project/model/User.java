package Spa.com.Project.model;

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
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name="userid")
		private int userid;
		
		@Column(name="email")
		private String email;
		
		@Column(name="password")
		private String password;
		
		@Column(name="firstname")
		private String firstName;
		
		@Column(name="lastname")
		private String lastName;
		
		@Column(name="phoneNumber")
		private int phoneNumber;
		
		@Column(name="address")
		private String address;
		
		@Column(name="gender")
		private String gender;

		//constructor
		public User() {
			super();
		}

		public int getUserid() {
			return userid;
		}

		public void setUserid(int userid) {
			this.userid = userid;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
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

		public int getPhoneNumber() {
			return phoneNumber;
		}

		public void setPhoneNumber(int phoneNumber) {
			this.phoneNumber = phoneNumber;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public String getGender() {
			return gender;
		}

		public void setGender(String gender) {
			this.gender = gender;
		}
		
		
		
		
		
		

}
