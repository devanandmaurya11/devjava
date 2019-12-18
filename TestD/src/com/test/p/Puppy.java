package com.test.p;


public class Puppy {
   public Puppy(String name , int age ) {
      // This constructor has one parameter, name.
      System.out.println("Passed Name is :" + name   +"  AND The age is : " +age);
   }

   public static void main(String []args) {
      // Following statement would create an object myPuppy
     Puppy myPuppy = new Puppy( "tommy" ,10 );
   }
}