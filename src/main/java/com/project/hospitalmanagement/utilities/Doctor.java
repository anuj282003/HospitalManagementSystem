package com.project.hospitalmanagement.utilities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Doctor {

	public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	int id;
	String d_name;
	String specialization;

	@ManyToMany
	List<Patient> patient=new ArrayList<>();

	public Doctor(int id, String d_name, String specialization, List<Patient> patient) {
		super();
		this.id = id;
		this.d_name = d_name;
		this.specialization = specialization;
		this.patient = patient;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getD_name() {
		return d_name;
	}

	public void setD_name(String d_name) {
		this.d_name = d_name;
	}

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	public List<Patient> getPatient() {
		return patient;
	}

	public void setPatient(List<Patient> patient) {
		this.patient = patient;
	}



}
