package com.iis.day6;

import java.util.Scanner;

public class numbetforExcp {
	Scanner sc;
	int num1;
	String hno;
	public numbetforExcp() {
		sc=new Scanner(System.in);
		
	}
	public void accept() {
		
		System.out.println("enter a number");
		num1=sc.nextInt();
		System.out.println("Enter House Number");
		hno=sc.next();
		try {
		int ghno=Integer.parseInt(hno);
	}

	catch(NumberFormatException n) {
		System.out.println("Enter the Numbers Not Another values");
	}
	}
	public void display() {
		System.out.println("The number1 is "+num1);
		System.out.println("The Another number is "+hno);
	}
	public static void main(String[] args) {
		numbetforExcp ne=new numbetforExcp();
		ne.accept();
		ne.display();
	}
	
	

}
