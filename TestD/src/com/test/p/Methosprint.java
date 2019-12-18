package com.test.p;

public class Methosprint {

public String name;
 public int salary;
 
 public Methosprint(String name)
 {
	  this .name=name;
	  
 }
public  void setSalary (int salary)
{
	this .salary=salary;
	
}
public void prints()
{
	System.out.println("The name is :"+name);
	System.out.println("the salray is :" + salary);
}
public static void main(String[] args) {
	Methosprint st= new Methosprint("rajan");
	st.setSalary(1010);
	st.prints();
}
}
	


