package org.comstudy21.day04;

import java.util.Scanner;

public class Day04Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int age = 0;
		String name = ""; // char은 문자, String은 문자열
		String answer = "y";
		
		
		while (answer.equals("y")) {
			System.out.print("이름을 입력해주세요: ");
			name = scanner.next(); // next
			System.out.print("나이를 입력해주세요: ");
			age = scanner.nextInt();
			System.out.println("결과: " + name + "님은 " + age + "세 입니다 \n---------------------------");
			System.out.print("계속 하시겠습니까? y/n");
			answer = scanner.next();
			while (!answer.equals("y") && !answer.equals("n")) {
				System.out.print("y와 n 둘 중 하나를 입력해주세요");
				answer = scanner.next();
			}
		}
			System.out.println("프로그램을 종료하겠습니다");
//		while (answer.equals("y")) {
			/*
			 * System.out.print("이름을 입력해주세요: "); name = scanner.next(); //next
			 * System.out.print("나이를 입력해주세요: "); age = scanner.nextInt();
			 * System.out.println("결과: "+name+ "님은 " +age+
			 * "세 입니다 \n---------------------------"); System.out.println("계속 하시겠습니까? y/n");
			 * answer = scanner.next(); }
			 */
			scanner.close();
		

//		System.out.print("나이를 입력해주세요: ");
	}
}


