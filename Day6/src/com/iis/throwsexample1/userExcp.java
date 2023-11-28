package com.iis.throwsexample1;

public class userExcp extends Exception
{
 @Override 
 public String getMessage() {
	 return "Enter the Correct User name or password";
 }
}
