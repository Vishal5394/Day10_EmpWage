package com.BridgeLabz.EmpWage;

public class  EmployeeWageComputation {
	public static void main(String[] args) { 
		final int Is_Present = 1;
		final int Is_PartTime = 2;
		final int Emp_wage_per_hr = 20;
		final int No_Of_Working_Days = 20;
		final int No_Of_Working_hr = 100;


			int  Employeehr = 0 , Daily_Wage = 0, Total_Wage = 0, TotalEmployeehr =0, TotalWorkingDays =0;
			
			while(TotalWorkingDays < No_Of_Working_Days && TotalEmployeehr <= No_Of_Working_hr) {
			
				int Attendance = (int)Math.floor(Math.random()*10)%3;
			
			switch (Attendance) {
			 case Is_Present:
				Employeehr = 8;
					System.out.println("Employee is Present ");
					break;
			
			case Is_PartTime :
				Employeehr = 4;
				 System.out.println("Employee is Present Part Time ");
				 break;
				 
			default:
				Employeehr = 0;
			System.out.println("Employee is Absent ");
			break;
			}
			
			TotalEmployeehr += Employeehr;
			Daily_Wage = Emp_wage_per_hr  *Employeehr;
			Total_Wage = Daily_Wage * No_Of_Working_Days;
			
			System.out.println("Employee Daily Wage is = "+Daily_Wage);
			System.out.println("Employee Monthly Total Wage is = "+Total_Wage);
		 }
		    
	}
	}
