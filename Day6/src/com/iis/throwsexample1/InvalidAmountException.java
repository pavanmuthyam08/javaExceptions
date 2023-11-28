package com.iis.throwsexample1;

public class InvalidAmountException extends Exception
{
  public String getAmount() {
	  return "Enter the balance Lessthan your balance";
  }
}
