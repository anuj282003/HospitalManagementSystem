package com.project.hospitalmanagement.controller;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.project.hospitalmanagement.services.PatientService;
import com.project.hospitalmanagement.utilities.Patient;

@Controller
public class PatientController {
	PatientService ptser;
	 public PatientController(PatientService ptser) {
		super();
		this.ptser = ptser;
	}

	@GetMapping("/map-addpatient")
	 public String mapAddPatient() {
		 return "addPatient";
	 }

	 @GetMapping("/map-fetchpatient")
	 public String mapFetchPatient() {

		 return "fetchPatient";

	 }

	@SuppressWarnings("unused")
	@PostMapping("/fetchById")
	 public String fetchPatient(@Param(value = "p_id") String p_id ,@Param(value = "password") String password,Model model) {
		 Patient pt =ptser.fetchPatient(p_id,password);
		 
		 String p_name=pt.getP_name();
		 model.addAttribute("p_name",p_name);
		 if(pt!=null) {
		 return "viewPatient";
		 }
		 else {
			 	return "fetchFailure";
		 }
//		 return "viewPatient";
	 }



	@PostMapping("/addPatient")
	 public String addPatient(@ModelAttribute Patient p) {
      String msg=  ptser.addPatient(p);
    return msg;
	 }



}
