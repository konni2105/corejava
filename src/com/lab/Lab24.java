package com.lab;
//ArthmticOprtr
/*A company maintains a Salary Calculation System for its employees.
The system performs various arithmetic operations to calculate salaries, bonuses, and deductions.
1️⃣ Calculate the gross salary : 
   grossSalary = basicSalary + bonus
2️⃣ Calculate the net salary:
netSalary = grossSalary - deduction
3️⃣ Calculate the per-day salary:
perDaySalary = basicSalary / totalWorkingDays
4️⃣ Calculate the salary for days worked:
earnedSalary = perDaySalary * daysWorked
5️⃣ Find the remaining leave days using modulus:
remainingDays = totalWorkingDays % daysWorked*/

public class Lab24 {

	public static void main(String[] args) {
		double basicSalary=5000;
		double bonus=1200;
		double deduction=500;
		
		int totalWorkingDays=31;
		int daysWorked=21;
		
		double grossSalary = basicSalary + bonus;
		double netSalary = grossSalary - deduction;
		double perDaySalary = basicSalary / totalWorkingDays;
		double earnedSalary = perDaySalary * daysWorked;
		double remainingDays = totalWorkingDays % daysWorked;
		
		System.out.println("basic salary:"+basicSalary);
		System.out.println("bonus:"+bonus);
		System.out.println("deduction:"+deduction);
		System.out.println("grossSalary:"+grossSalary);
		System.out.println("netSalary:"+netSalary);
		System.out.println("perDaySalary:"+perDaySalary);
		System.out.println("earnedSalary:"+earnedSalary);
		System.out.println("remainingDays:"+remainingDays);
		
	}

}
