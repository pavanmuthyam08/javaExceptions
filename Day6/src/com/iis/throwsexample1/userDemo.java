package com.iis.throwsexample1;

import java.util.Scanner;

public class userDemo {
	Scanner sc;
	String user="pavan";
	String pswd="pavan123";
	String us;
	String pw;
	double bal=10000;
	double amt;
	public userDemo() {
		sc=new Scanner(System.in);
	}
	public void accept() throws userExcp {
	    System.out.println("Enter Your UserName");
	    us=sc.next();
	    System.out.println("Enter your Password ");
	    pw=sc.next();
	    if(!user.equals(us)&&!pswd.equals(pw)){
	    	//System.out.println("coming");
	    	throw new userExcp();
	    }
	}
	public void withdraw() throws InvalidAmountException
	{
	   System.out.println("Enter How much Amount will Withdraw ");
	   amt=sc.nextDouble();
       if(amt>bal) 
       {
		throw new InvalidAmountException();		   
			   
       }
       System.out.println("your withDrw is Successfilly Completed");
	}
	public static void main(String[] args) {
		userDemo ud=new userDemo();
		try {
			ud.accept();
			ud.withdraw();
		}
		catch(userExcp u) {
			System.out.println(u.getMessage());
			}
		catch(InvalidAmountException iae) {
			System.out.println(iae.getAmount());
			
		}
	}
}
