package com.project.hospitalmanagement.repositories;
import org.springframework.data.jpa.repository.JpaRepository;

import com.project.hospitalmanagement.utilities.Doctor;
public interface DoctorRepository  extends JpaRepository<Doctor,Integer> {



}
