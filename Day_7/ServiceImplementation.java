package com.training;

import java.util.HashSet;
import java.util.List;
import java.util.HashMap;
import java.util.Set;

import com.training.ifaces.HospitalService;

public class ServiceImplementation implements HospitalService{
	
	Set<Patient> pList = new HashSet<Patient>();
	Set<Doctor> dList = new HashSet<Doctor>();
	
	HashMap<Doctor,Set<Patient>> appointmentList = new HashMap<Doctor,Set<Patient>>();

	public boolean addDoctor(Doctor entity) {
		// TODO Auto-generated method stub
		return this.dList.add(entity);
	}

	public boolean addPatient(Patient entity) {
		// TODO Auto-generated method stub
		return this.pList.add(entity);
	}

	public boolean addAppointment(Doctor doctor, Patient patient) {
		
		
		if(!appointmentList.containsKey(doctor)){
	     Set<Patient> set = new HashSet<Patient>();
			appointmentList.put(doctor,set);
        } 
		System.out.println("Booked an appointment");
		return appointmentList.get(doctor).add(patient);
	}

	public boolean cancelAppointment(Doctor doctor, Patient patient) {
		if(!appointmentList.containsKey(doctor)){
			System.out.println("There is no appointment");
            return false;
        }
		else{  appointmentList.get(doctor).remove(patient);
		System.out.println("Appointment cancelled!");
        return true;
		}
	}

	public Set<Patient> getAllAppointments(Doctor doctor) {
		// TODO Auto-generated method stub
		Set<Patient> set = new HashSet<Patient>();
		set = appointmentList.get(doctor);
		
		return set;
	}

	
}
