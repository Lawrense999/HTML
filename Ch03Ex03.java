package org.comstudy21.homework.ch03;

public class Ch03Ex03 {

	public static void main(String[] args) {
	      // 피보나치 수열
	      // 1+1+2+3+5+8+13+21=54
	      // 의사코드 - 인간이 쓰는 말로 코딩하기
	      // 1. 이전항과 현재항을 더해서 다음항을 만든다.
	      //    1-1. 다음항이 현재항이 되고 현재항은 이전항이 된다. (치환)
	      // 2. 현재항이 21이 될때까지 반복한다.
	      // 3. 현재항을 누적해서 출력한다.
	      int prev=0, cur=1, next=0;
	      int total=0;
	      while(cur<=21) {
	    	  total += cur;
	         System.out.print(cur);
	         if(cur==21) {
	        	 System.out.print("=");
	         }	else {
	         	System.out.print("+");
	         // 이전항 더하기 현재항으로 다음항 만들기
	         // 현재항은 이전항으로 다음항은 현재항으로 변경
	         next = prev +  cur;
	         prev = cur;
	         cur = next;
	      }
	      System.out.println(total);
	   }
		
	}
}


