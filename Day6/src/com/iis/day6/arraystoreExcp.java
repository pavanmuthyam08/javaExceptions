package com.iis.day6;

import java.util.Scanner;

public class arraystoreExcp {
   Scanner sc;
   Object  arr[];
   public arraystoreExcp() {
	   sc=new Scanner(System.in);
	   arr=new String[3];
   }
   public void accept() {
	   System.out.println("Enter the values");
	   for(int x=0;x<arr.length;x++) {
		   arr[x]=new String();
		   arr[x]=sc.next();
	   }
   }
   public void display() {
	   for(Object a:arr) {
		   System.out.println("The Values are "+a); 
	   }
   }
   public static void main(String[] args) {
	
}
   
}
