package com.project.hospitalmanagement.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.project.hospitalmanagement.utilities.AppointMent;
public interface AppointRepository extends JpaRepository<AppointMent,Integer> {

	@Query(value="select e from AppointMent e where e.doctor_id =:em and e.date =:dt and e.patient_id =:pid")
	public AppointMent findById(@Param("em") int  doctor_id , @Param("pid")int patient_id,@Param ("dt") String date);
}
