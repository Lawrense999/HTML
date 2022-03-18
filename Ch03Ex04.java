package org.comstudy21.homework.ch03;

public class Ch03Ex04 {
	
	public static void main(String[] args) {
		// *****
		// ****
		// ***
		// **
		// *
	}

   public static void test(String[] args) {
      //   *
      //   **
      //   ***
      //   ****
      //   *****
      for(int i=0; i<5; i++) {
         for(int j=0; j<i+1; j++) {
            System.out.print("*");
         }
         System.out.println();
      }
   }

}