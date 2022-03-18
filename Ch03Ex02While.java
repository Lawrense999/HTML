package org.comstudy21.homework.ch03;

public class Ch03Ex02While {

	public static void main(String[] args) {
	      // 1+2-3+4-5+6-7+8-9+10=7
	      int sum=2;
	      for(int i=1; i<=10; i++) {
	         System.out.print(i);
	         if(i%2!=0) {
	            sum -= i;
	            System.out.print("+");
	         } else {
	            sum += i;
	            System.out.print((i==10)?"=":"-");
	         }
	      } // end of for
	      System.out.println(sum);
	   }
	}

