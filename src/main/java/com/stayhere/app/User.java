package com.stayhere.app;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User {

	@Id	
	@GeneratedValue 
	private int uid;
	private String name; 
	private String email;
	private String phno;
	private String password;
	private String reenterpassword;
	
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getname() {
		return name;
	}
	public void setname(String name) {
		this.name = name;
	}
	public String getemail() {
		return email;
	}
	public void setemail(String email) {
		this.email = email;
	}
	public String getphno() {
		return phno;
	}
	public void setphno(String phno) {
		this.phno = phno;
	}
	public String getpassword() {
		return password;
	}
	public void setpass(String password) {
		this.password = password;
	}
	public String getreenterpassword() {
		return reenterpassword;
	}
	public void setreenterpassword(String reenterpassword) {
		this.reenterpassword = reenterpassword;
	}
	@Override
	public String toString() {
		return "createaccount [uid=" + uid + ", name=" + name + ", email=" + email + ", phno=" + phno + ", password="
				+ password + ", reenterpassword=" + reenterpassword + "]";
	}



}
