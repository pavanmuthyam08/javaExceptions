package com.iis.day6;
import java.util.*;
public class ArrayoutExcp {
    Scanner sc;
    int arr[];
    public ArrayoutExcp() {
    	sc=new Scanner(System.in);
    	arr=new int[4];
    }
    public void accept()
    {
    	System.out.println("Enter the Elements into Array");
    	try {
    	for(int x=0;x<=arr.length;x++) {
    		arr[x]=sc.nextInt();
    	}
    	}
    	catch(ArrayIndexOutOfBoundsException a)
    	{
    		System.out.println("The Elements are Out of Array");
    	}
    	}
    
    public void display() {
    	for(int a:arr) {
    		System.out.println("the Elements are"+a);
    	}
    }
    public static void main(String[] args) {
		ArrayoutExcp ae=new ArrayoutExcp();
		ae.accept();
		ae.display();
	}
}
