package com.test.p;


class FreshJuice {
   enum FreshJuiceSize{ SMALL, MEDIUM, LARGE, middle }
   
   ////capital and small both possible
   FreshJuiceSize size;
}

public class FreshJuish {

   public static void main(String args[]) {
      FreshJuice juice = new FreshJuice();
      juice.size = FreshJuice.FreshJuiceSize.middle ;
      System.out.println("Size: " + juice.size);
   }
}