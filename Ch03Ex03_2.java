package org.comstudy21.homework.ch03;

public class Ch03Ex03_2 {
   public static void main(String[] args) {
      // 1+1+2+3+5+8+13+21=54
      ;
      int total=0;
      for(int prev=0, cur=1, next=0 ;cur<=21; next=prev+cur, prev=cur, cur=next) {
         total += cur;
         System.out.print(cur);
         if(cur==21) {
            System.out.print("=");
         } else {
            System.out.print("+");
         }
      } 
      System.out.println(total);
   }
}