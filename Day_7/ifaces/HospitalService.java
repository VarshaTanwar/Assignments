package com.training.ifaces;

import java.util.Set;

import com.training.*;

public interface HospitalService {

	 boolean addDoctor(Doctor entity);
	 boolean addPatient(Patient entity);
	 boolean addAppointment(Doctor doctor,Patient patient);
	 boolean cancelAppointment(Doctor doctor,Patient patient);
	 Set<Patient> getAllAppointments(Doctor doctor);
}
