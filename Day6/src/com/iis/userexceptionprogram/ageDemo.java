package com.iis.userexceptionprogram;

import java.util.Scanner;

public class ageDemo {
	int age;
	Scanner sc;
	public ageDemo() {
		sc=new Scanner(System.in);
	}
	public void accept() {
	  System.out.println("Enter Your age");
	  age=sc.nextInt();
	  try {
			  if(age<18) {
				  throw new InvalidAgeException();
				  
			  }
	}
	  catch(InvalidAgeException e) {
		  System.out.println(e.getMessage());
	  }
	}	
	public static void main(String[] args) {
		ageDemo a=new ageDemo();
		a.accept();
	}

}
