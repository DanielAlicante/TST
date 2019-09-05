package com.example.demo.modelo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@ToString
public class Usuario {
	
	private String name;
	private String surname;
	
	public Usuario() {
		super();
		setName(new String("Daniel")); 
		surname = new String("Bernaldez"); 
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Usuario [name=" + name + ", surname=" + surname + "]";
	}
	
	
	
	
	
	

}
