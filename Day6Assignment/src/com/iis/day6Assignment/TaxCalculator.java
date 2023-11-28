package com.iis.day6Assignment;

import java.util.Scanner;

public class TaxCalculator 
{
	Scanner sc=new Scanner(System.in);
	String empName;
	boolean isIndian;
	double empSal;
	double taxAmount;
	public TaxCalculator() {
		sc=new Scanner(System.in);
	}
	public TaxCalculator(String empName,boolean isIndian,double empSal) {
		this.empName=empName;
		this.isIndian=isIndian;
		this.empSal=empSal;
	}
	public void accept() throws Exception  {
		System.out.println("Enter the name of Employee");
		empName=sc.nextLine();
		System.out.println("Enter if Your are Indian (true) else(flase)");
		isIndian=sc.nextBoolean();
		System.out.println("Enter Your Salary");
		empSal=sc.nextDouble();
	}
	public void calculateTax() throws CountryNotValidException,EmployeeNameInvalidException,TaxNotEligibleException
	{
		
		if(empName.equals("")) {
			throw new EmployeeNameInvalidException();
		}
		if(!isIndian) {
			throw new CountryNotValidException();
			
		}
		if(empSal>100000) {
			taxAmount=(empSal*8)/100;
			System.out.println("The Tax Amount is"+taxAmount);
		}
		else if(empSal>=50000&&empSal<=1000000) {
			taxAmount=(empSal*6)/100;
			System.out.println("The Tax Amount is"+taxAmount);
		}
		else if(empSal>=30000&&empSal<50000) {
			taxAmount=(empSal*5)/100;
			System.out.println("The Tax Amount is"+taxAmount);
			
		}
		else if(empSal>=10000&&empSal<30000) {
			taxAmount=(empSal*4)/100;
			System.out.println("The Tax Amount is"+taxAmount);
		}
		else if(empSal<10000) {
			throw new TaxNotEligibleException();
		}
		
		//return tax;
		
	}
}
