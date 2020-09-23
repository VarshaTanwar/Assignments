package com.training;
public class Doctor {
 
	private int doctorId;
	private String doctorName;
	private String specialist;
	public Doctor(int doctorId, String doctorName, String specialist) {
		super();
		this.doctorId = doctorId;
		this.doctorName = doctorName;
		this.specialist = specialist;
	}
	public int getDoctorId() {
		return doctorId;
	}
	public void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
	}
	public String getDoctorName() {
		return doctorName;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	public String getSpecialist() {
		return specialist;
	}
	public void setSpecialist(String specialist) {
		this.specialist = specialist;
	}
	@Override
	public String toString() {
		return "Doctor [doctorId=" + doctorId + ", doctorName=" + doctorName
				+ ", specialist=" + specialist + "]";
	}
	
	
	
}
