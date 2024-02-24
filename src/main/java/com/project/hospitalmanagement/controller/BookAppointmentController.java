package com.project.hospitalmanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.project.hospitalmanagement.services.BookAppointment;
import com.project.hospitalmanagement.services.PatientService;
import com.project.hospitalmanagement.utilities.AppointMent;
import com.project.hospitalmanagement.utilities.Patient;

@Controller
public class BookAppointmentController {
	@Autowired
	BookAppointment bkap;
	
	
	Patient pt;
	
	@Autowired
	PatientService pserv;
	@GetMapping("/map-appoint")
	public String mapappoint() {
		return "bookappointment";
	}


	@PostMapping("/appoint")
	public String bookAppointment(AppointMent ap, Model model) {
		if((bkap.BookAppointmentCheck(ap))!= null) {
			return "bookappointment";
		}
		else {


			bkap.BookAppointment(ap);
			return "appointmentsuccess";
		}


	}

}
