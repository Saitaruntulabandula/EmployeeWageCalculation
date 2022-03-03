package com.bridgelabz;
import java.util.Scanner;

public class EmployeeWage {
	public static void main(String[] args) {
		int attendence = 1;
		int wagePerHr = 20;
		int partTimeWork = 4; 
		int fullDayWork = 8;
		
		double value = Math.floor(Math.random()*10) % 2;
		
		if(value == attendence) 
		{
			System.out.println("Emp is Present");
			System.out.println("For Part time=1&&Full time=2::");
			Scanner sc = new Scanner (System.in);
		    int n = sc.nextInt();
		    sc.close();
		    switch (n) 
		    {
		    case 1:
		      System.out.println("Part time wage is="+wagePerHr*partTimeWork);
		      break;
		    case 2:
		      System.out.println("Full time wage is="+wagePerHr*fullDayWork);
		      break;
		    }
		 }
		 else
		 {
			 System.out.println("Emp is Absent");
		 }   

	}
}
