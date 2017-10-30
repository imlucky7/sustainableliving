package com.exercise.User;

public class Consumer implements IUser {
	String userType;
	String id;
	String name;
	String address;
	
	public Consumer() {
		this.id = "";
	}
	
	@Override
	public String getId() {
		return this.id;
	}
}
