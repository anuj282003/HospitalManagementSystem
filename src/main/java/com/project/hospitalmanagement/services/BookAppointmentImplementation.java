package com.project.hospitalmanagement.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.hospitalmanagement.repositories.AppointRepository;
import com.project.hospitalmanagement.utilities.AppointMent;

@Service
public class BookAppointmentImplementation implements BookAppointment {

	@Autowired
	AppointRepository aptrepo;


	@Override
	public AppointMent BookAppointmentCheck(AppointMent ap) {

		AppointMent apt =aptrepo.findById(ap.getDoctor_id(),ap.getPatient_id(), ap.getDate());
		if(apt != null) {
		   return apt;
		}
		return null;
	}


	@Override
	public String BookAppointment(AppointMent ap) {
		    aptrepo.save(ap);
		return "saved" ;
	}


}
