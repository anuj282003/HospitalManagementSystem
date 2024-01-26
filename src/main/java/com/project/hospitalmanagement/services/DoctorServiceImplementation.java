package com.project.hospitalmanagement.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.hospitalmanagement.repositories.DoctorRepository;
import com.project.hospitalmanagement.utilities.Doctor;

@Service
public class DoctorServiceImplementation implements DoctorService {
	@Autowired
	DoctorRepository dtrrepo;

	@Override
	public List<Doctor> fetchDoctor() {
	    List<Doctor> lduct = dtrrepo.findAll();

		return lduct ;
	}

}
