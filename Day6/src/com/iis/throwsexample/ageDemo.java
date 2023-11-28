package com.iis.throwsexample;

import java.util.Scanner;
public class ageDemo {
	int age;
	Scanner sc;
	public ageDemo() {
		sc=new Scanner(System.in);
	}
	public void accept() throws InvalidAgeException
	{
	  System.out.println("Enter Your age");
	  age=sc.nextInt();
	  
			  if(age<18) {
				  throw new InvalidAgeException();
				  
			  }
	
	}	
	public static void main(String[] args) {
		ageDemo a=new ageDemo();
		try {
		a.accept();
		}
		catch(InvalidAgeException e) {
			System.out.println(e.getMessage());
		}
	}

}
