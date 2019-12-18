package com.test.p;

public class Test {


    public static void main(String[] args)  
    {  
        // Let's print the classloader name of current class.   
        //Application/System classloader will load this class  
     Class<Test>  c=Test.class;  
        System.out.println(c.getClassLoader());  
        //If we print the classloader name of String, it will print null because it is an  
        //in-built class which is found in rt.jar, so it is loaded by Bootstrap classloader  
        //System.out.println(int.class.getClassLoader());  
        System.out.println(String.class.getClassLoader());  
        
    }  }  