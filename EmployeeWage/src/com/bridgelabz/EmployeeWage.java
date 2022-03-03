package com.bridgelabz;

public class EmployeeWage {
	public static void main(String[] args) {
		int wagePerHr=20;
		int isPresent=1;
		int workingHours=8;
		int workingDays=20;
		double value=Math.floor(Math.random()*10)%2;
	     if(value==isPresent)
	     {
	    	 System.out.println("Emp is Present");
	    	 System.out.println("Wage of the Full Time Employee is = " +workingDays*workingHours*wagePerHr);
	     }
	     else
	     {
	    	 System.out.println("Emp is Absent");
	     }
	}
}
