package com.iis.throwsexample;

public class InvalidAgeException extends Exception{
	 @Override
	   public String getMessage() {
		//   System.out.println("Enter the Valid Age");
		return "Enter the Valid Age";
	   
}
}