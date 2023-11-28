package com.iis.day6Assignment;

public class CalculatorSimulator {
	public static void main(String[] args) {
		
	TaxCalculator cs=new TaxCalculator( "",true,1500);
	try {
	cs.accept();

		cs.calculateTax();
	} catch (CountryNotValidException e) {
		
		System.out.println(e.getCountry());
	}
	catch(EmployeeNameInvalidException emp) {
		System.out.println(emp.getEmployee());
	}
	catch(TaxNotEligibleException tax) {
		System.out.println(tax.getTax());
	}
	catch(Exception ex) {
		
		System.out.println("You should give the Correct values");
	}
	}
}
