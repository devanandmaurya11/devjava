package com.test.p;

class Simple{  
public static void main(String[] args){  
float f=10.5f;  
//int a=f;//Compile time error  
System.out.println("THIS IS NARROWING");
int a=(int)f;  
System.out.println("The float is "+ f );  
System.out.println("The float convert in int type is : "+a);  
}}  