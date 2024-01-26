package com.project.hospitalmanagement.utilities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class AppointMent {
		@Id
		@GeneratedValue (strategy = GenerationType.AUTO)
		int id;

		int patient_id;
		int doctor_id;
		public AppointMent() {
			super();
			
		}
		String date;
		public AppointMent(int id, int patient_id, int doctor_id, String date) {
			super();
			this.id = id;
			this.patient_id = patient_id;
			this.doctor_id = doctor_id;
			this.date = date;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public int getPatient_id() {
			return patient_id;
		}
		public void setPatient_id(int patient_id) {
			this.patient_id = patient_id;
		}
		public int getDoctor_id() {
			return doctor_id;
		}
		public void setDoctor_id(int doctor_id) {
			this.doctor_id = doctor_id;
		}
		public String getDate() {
			return date;
		}
		public void setDate(String date) {
			this.date = date;
		}

}
