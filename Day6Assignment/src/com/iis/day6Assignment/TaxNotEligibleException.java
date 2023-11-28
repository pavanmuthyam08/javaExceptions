package com.iis.day6Assignment;

public class TaxNotEligibleException extends Exception
{
	   public String getTax() {
		   return "The employee does not need to pay";
	   }


}
