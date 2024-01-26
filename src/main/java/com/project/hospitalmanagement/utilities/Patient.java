package com.project.hospitalmanagement.utilities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;


@Entity
public class Patient {



		public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getP_name() {
		return p_name;
	}

	public void setP_name(String p_name) {
		this.p_name = p_name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public List<Doctor> getDoctor() {
		return doctor;
	}

	public void setDoctor(List<Doctor> doctor) {
		this.doctor = doctor;
	}

		public Patient( String p_name, int age, String gender, List<Doctor> doctor,String password,String email) {
		super();

		this.p_name = p_name;
		this.age = age;
		this.gender = gender;
		this.doctor = doctor;
		this.password=password;
		this.email=email;
	}

		public Patient() {
			super();
			// TODO Auto-generated constructor stub
		}

		@Id
	    @GeneratedValue (strategy = GenerationType.AUTO)
		int id;
		String p_name;
		int age;
		String gender;
		String password;
		String email;

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

		@ManyToMany
		List<Doctor> doctor =new ArrayList<>();



}
