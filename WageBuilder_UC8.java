package com.bridgelabz.WageBuilderDay9;

public class WageBuilder_UC8 {
	public static int IS_PART_TIME = 1;
	public static int IS_FULL_TIME = 2;
	static int TotalSalary = 0;

	public static void WageComputeForCompany(String company,int WagePerHour,int NoOfDays,int MaxHourInMonth) {
		int WorkingHour = 0;
		int TotalWorkingHour = 0;
		int Salary = 0;
		int i = 0;
		while(i < NoOfDays &&  TotalWorkingHour <= MaxHourInMonth) {
			double empCheck = Math.floor(Math.random() * 10) % 3;
			int Check = (int)empCheck;
			switch(Check) {
			case 1:
				WorkingHour = 8;
				break;
			case 2 :
				WorkingHour = 4;
				break;
			default : 
				WorkingHour = 0;
				break;
			}
			i++;
			Salary = WagePerHour *  WorkingHour;
			TotalWorkingHour +=  WorkingHour;
			TotalSalary += Salary;
			System.out.println("salary is  : " + Salary);
		}
		System.out.println("total working hours are  : " + TotalWorkingHour);
		System.out.println("total salary is  : " + TotalSalary);
	}
	public static void main(String[] args) {

		System.out.println("For D-Mart : ");
		WageComputeForCompany("D-mart", 20, 20, 100);
		System.out.println("\nFor Reliance : ");
		WageComputeForCompany("Reliance", 25, 10, 50);
	}
}
