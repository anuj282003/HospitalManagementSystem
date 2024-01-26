package com.project.hospitalmanagement.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.project.hospitalmanagement.services.DoctorService;
import com.project.hospitalmanagement.utilities.Doctor;

@Controller
public class DoctorController {
	DoctorService dtrser;

	@GetMapping("/map-fetchdoctor")
	public String fetchDoctor(Model model) {
//		List<Doctor>ldoct=dtrser.fetchDoctor();
		
		List<Doctor> ldoct =dtrser.fetchDoctor();
		model.addAttribute("Doctors",ldoct);
		return "viewdoctor";

	}

	public DoctorController(DoctorService dtrser) {
		super();
		this.dtrser = dtrser;
	}




}
