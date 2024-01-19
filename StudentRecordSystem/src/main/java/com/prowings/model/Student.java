package com.prowings.model;

import java.io.Serializable;

public class Student implements Serializable{

	private static final long serialVersionUID = 1L;
	
	
	private int id;
	private String name;
	private Address address;
	private int age;
	
	public Student() {}
	
	
	public int idValidate(int id) {
		try {
			if(RecordManager.getStduentIds() == null)
				return id;
			
			if(RecordManager.getStduentIds().contains(id))
				throw new IllegalArgumentException();
				
		}
		catch(IllegalArgumentException e) {
			System.out.println("Id's cannot be duplicated. Recheck your Student Id.");
			return -1;
		}
		return id;
	}
	
	public String nameValidate(String name) {
		try {
			if((name.length() < 2) || !(name.matches("[a-zA-Z]+")))
				throw new IllegalArgumentException();
			else
				return name;
		}
		catch(IllegalArgumentException e) {
			System.out.println("Invalid name. Re-check your details.");
			return null;
		}
	}
	
	public int ageValidate(int age) {
		try {
			if(age < 16)
				throw new IllegalArgumentException();
			else
				return age;
		}
		catch(IllegalArgumentException e) {
			System.out.println("Age cannot be less than 16.");
			return -1;
		}
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}


	@Override
	public String toString() {
		return "Id=" + id + ", Name=" + name + ", Address=" + address + ", age=" + age;
	}
	
}
