package com.project.hospitalmanagement.services;

import org.springframework.stereotype.Service;

import com.project.hospitalmanagement.repositories.PatientRepository;
import com.project.hospitalmanagement.utilities.Patient;

@Service
public class PatientServiceImplementation implements PatientService {
	PatientRepository ptrepo;
	

	public PatientServiceImplementation(PatientRepository ptrepo) {
		super();
		this.ptrepo = ptrepo;
	}

	@Override
	public String addPatient(Patient p) {
	  
	   ptrepo.save(p);

	   return "addPatientsuccess";
	}

	@Override
	public Patient fetchPatient(String p_id,String password) {

		Patient pt=ptrepo.findByPatientEmail(p_id, password);
		System.out.println(pt);
		return pt ;

	}

}
