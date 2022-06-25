package com.stayhere.app;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class Login {
	
	@Id	
		@GeneratedValue 
		
		private String name; 
	    private String password;
	
	
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
	@Override
	public String toString() {
		return "Login [name=" + name + ", password=" + password + "]";
	}
		
		
		

}

