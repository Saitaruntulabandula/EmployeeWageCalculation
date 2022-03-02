package com.bridgelabz;

public class EmployeeWage {
	public static void main(String[] args) {
		int fullDayWork=8;
		int wagePerHr=20;
		int isPresent=1;
	    double value=Math.floor(Math.random()*10)%2;
	    if(value==isPresent)
	    {
	    	System.out.println("Emp is Present");
	    	System.out.println("Employee wage =" +fullDayWork*wagePerHr);
	    }
	    else
	    {
	    	 System.out.println("Emp is Absent");
	    }
	}
}
