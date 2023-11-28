package com.iis.day6;

import java.util.Scanner;

public class exceptionLast {
	Scanner sc;
	int arr[];
  public exceptionLast() {
	  sc=new Scanner(System.in);
	  arr=new int[5];
  }
  public void accpet() {
	  try {
	  System.out.println("Enter the values ");
      for(int x=0;x<arr.length;x++) {
    	  arr[x]=sc.nextInt();
      }
	  System.out.println("Enter the First index value");
	  int index1=sc.nextInt();
	  //String in=Integer.parseInt(index1);
	  System.out.println("Enter the Second Index ");
	  int index2=sc.nextInt();
	  double result=arr[index1]/arr[index2];
	  System.out.println("The Final result is "+result);
     }
	  catch(Exception e) {
		  System.out.println("The Exception is Arised");
	  }
 }
  
  public static void main(String[] args) {
	exceptionLast el=new exceptionLast();
	el.accpet();
	
}
}
