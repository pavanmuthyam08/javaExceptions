package com.iis.day6;
import java.util.*;
public class ArithExcp {
   Scanner sc;
   int num1,num2;
   double result;
   public ArithExcp() {
	   sc=new Scanner(System.in);
   }
   public void accept() {
	   System.out.println("Enter A Number");
	   num1=sc.nextInt();
	   System.out.println("Enter Another Nmber");
       num2=sc.nextInt();
   
	   try {
		   result=num1/num2;
	   }
	   catch(ArithmeticException a) {
		   System.out.println("Enter the Second value Greaterthan 0");
	   }
   }
	   public void display() {
		   System.out.println("The Result is "+result);
		   
	   }
   public static void main(String[] args) {
	ArithExcp a=new ArithExcp();
	a.accept();
	a.display();
}
}
