package com.iis.day6Assignment;

public class EmployeeNameInvalidException extends Exception
{
   public String getEmployee() {
	   return "The Employee name cannot be Empty";
   }
}
