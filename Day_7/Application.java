package com.training;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Application { 
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		Patient joey = new Patient(123, "joey", 27);
		Patient yasir = new Patient(153, "yasir", 31);
		Patient eyan = new Patient(143, "eyan", 47);
		
		ServiceImplementation service = new ServiceImplementation();
		
		service.addPatient(joey);
		service.addPatient(yasir);
		service.addPatient(eyan);
		
		Doctor sharma = new Doctor(101,"Rajat Sharma","ENT");
		Doctor gupta  = new Doctor(102, "rajan gupta", "gynae");
		
		service.addDoctor(gupta);
		service.addDoctor(sharma);
		
		service.addAppointment(gupta, eyan);
		service.addAppointment(gupta, yasir);
		service.addAppointment(sharma, joey);
		
		Set <Patient> set =service.getAllAppointments(gupta);
		
		Iterator<Patient> iterator = set.iterator();

		
		while(iterator.hasNext()){
			Patient entity = iterator.next();
			System.out.println(entity);
		}
		
		service.cancelAppointment(gupta, eyan);
	}

}
