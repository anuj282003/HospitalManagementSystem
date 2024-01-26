package com.project.hospitalmanagement.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.project.hospitalmanagement.utilities.Patient;


public interface PatientRepository extends JpaRepository<Patient,Integer> {


	@Query(value="select e from Patient e where e.email=:em and e.password=:pas")
   public Patient findByPatientEmail( @Param("em") String email,@Param("pas") String password);


}
 