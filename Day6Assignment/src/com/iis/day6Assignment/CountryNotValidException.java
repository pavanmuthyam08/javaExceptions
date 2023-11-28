package com.iis.day6Assignment;

public class CountryNotValidException  extends Exception
{
  public String getCountry() {
	  return "The Employee should be Indian citizen for Calculating tax";
  }
}
