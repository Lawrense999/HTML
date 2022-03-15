package org.comstudy21.day04;

import java.util.Scanner;

public class Day04Ex04 {

	public static void main(String[] args) {
		// 월 입력받아서 해당월의 날짜수를 출력
		Scanner scanner = new Scanner (System.in);
		int day = 31;
		int month = 0;
		
		System.out.print("월을 입력해주세요(0~12): ");
		month = scanner.nextInt();
		while (month<1 || month>12) {
			System.out.println("잘못 입력했습니다. 0~12월 사이로만 입력해주세요.");
			month = scanner.nextInt();
		}
		
		switch(month) {
		case 2:
			day = 28;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			day = 30;
		}
		System.out.println(month+"월은 " +day+ "일까지 있다.");
		scanner.close();
	}

}
