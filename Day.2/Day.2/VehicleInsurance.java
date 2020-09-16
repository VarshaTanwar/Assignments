package com.training;

public class VehicleInsurance extends Insurance { 
	private int vehicleModel;
	private int yearofManufacture;
	private double costofVehicle;
	public VehicleInsurance() {
		super();
		// TODO Auto-generated constructor stub
	}
	public VehicleInsurance(int policyNumber, String policyHolderName, int age,
			double insuredAmount) {
		super(policyNumber, policyHolderName, age, insuredAmount);
		// TODO Auto-generated constructor stub
	}
	
	public VehicleInsurance(int policyNumber, String policyHolderName, int age,
			double insuredAmount, int vehicleModel, int yearofManufacture,
			double costofVehicle) {
		super(policyNumber, policyHolderName, age, insuredAmount);
		this.vehicleModel = vehicleModel;
		this.yearofManufacture = yearofManufacture;
		this.costofVehicle = costofVehicle;
	}
	public int getVehicleModel() {
		return vehicleModel;
	}
	public void setVehicleModel(int vehicleModel) {
		this.vehicleModel = vehicleModel;
	}
	public int getYearofManufacture() {
		return yearofManufacture;
	}
	public void setYearofManufacture(int yearofManufacture) {
		this.yearofManufacture = yearofManufacture;
	}
	public double getCostofVehicle() {
		return costofVehicle;
	}
	public void setCostofVehicle(double costofVehicle) {
		this.costofVehicle = costofVehicle;
	}  
	
	public double calculatePremium() {
		double actualCost = 0.0;
		if(this.vehicleModel==2)
		{
			if(this.yearofManufacture<=2018)
			{
				 actualCost = 0.5 * this.costofVehicle;
			} 
			else 
			{
				 actualCost = 0.6 * this.costofVehicle;
			}
		} 
		else if(this.vehicleModel==4)
		{
			if(this.yearofManufacture<=2018)
			{
			 actualCost = 0.4 * this.costofVehicle;
			} 
			else 
			{
				 actualCost = 0.5 * this.costofVehicle;
			}
		} 
		return actualCost;
		
	
	}
	

}
