package com.exercise.rest.api.vo;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * LoginVO will store login data
 * 
 * @author pranabd
 *
 */
@XmlRootElement(name = "LoginVO")
public class LoginVO {
	
	String emailId;
	String password;
	String confirmPassword;
	
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getConfirmPassword() {
		return confirmPassword;
	}
	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}
	
}
