package org.comstudy21.homework.ch03;

public class Ch03Ex01For {
	
	   public static void main(String[] args) {
		      // 1+2-3+4-5+6-7+8-9+10=7
		      int sum=0;
		      for(int i=1; i<=10; i++) {
		         System.out.print(i);
		         if(i%2!=0) {
		        	 System.out.println("+");
		         } else {
		        	 System.out.println("-");
		         }
		      }
		
	}
	
	public static void test(String[] args) {
		// TODO Auto-generated method stub
		//1+2+3+4+5+6+7+8+9+10 = 55
		int sum = 0;
		for(int number=1; number<=10; number+=1) {
			sum += number;
			System.out.print(number);
			if(number<10) {
				System.out.println("+");
			} else {
			System.out.println("=");
		}
	}
	System.out.println(sum);
}
}
