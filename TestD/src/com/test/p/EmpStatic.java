package com.test.p;

public class EmpStatic {

   // salary  variable is a private static variable
	private static double salary;

   // DEPARTMENT is a constant
   public static final String DEPARTMENT = "Development ";
   public static void main(String args[]) {
	  // int salary=10101;
      salary = 10020;
      System.out.println(DEPARTMENT + "average salary:" + salary);
   }
}