package com.nttdata.bootcamp.webfluxmicro;

public class Person {
	
	//Variables
	private String firstname;
	private String lastname;
	private Integer age;
	
	//Getters y Setters
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastName() {
		return lastname;
	}
	public void setLastName(String lastName) {
		this.lastname = lastName;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	
	//Constructor
	public Person(String firstname, String lastname, Integer age) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.age = age;
	}
	
	public Person() {
		
	}
	
	
	
	
}
