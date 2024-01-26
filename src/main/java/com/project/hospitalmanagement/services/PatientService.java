package com.project.hospitalmanagement.services;
import com.project.hospitalmanagement.utilities.Patient;

public interface PatientService {
	public String addPatient(Patient p);
    public Patient fetchPatient(String p_id,String password);


}
