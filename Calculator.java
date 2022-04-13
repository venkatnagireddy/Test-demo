package com.wipro.calc;

import java.util.Scanner;

public class Calculator {
	//Class name and file name are same

	
     public static void main(String args[]) {  //entry point of java program
    	 // REad the input from keyboard
    	 //new keyword used to create the object
    	 
    	 Scanner scan=new Scanner(System.in);
    	 //Local variables
    	 int numberOne,numberTwo,result;
    	 System.out.println("Enter Number 1");
    	 numberOne=scan.nextInt();
    	 System.out.println("enter number 2");
    	 numberTwo=scan.nextInt();
    	 
    	 result=numberOne+numberTwo;
    	 System.out.println("Addition of two numbers "+ result);
    	 
    	 System.out.println("Welcome to everyone");
     }

}






//