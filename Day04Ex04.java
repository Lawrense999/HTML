package org.comstudy21.day04;

import java.util.Scanner;

public class Day04Ex04 {

	public static void main(String[] args) {
		// �� �Է¹޾Ƽ� �ش���� ��¥���� ���
		Scanner scanner = new Scanner (System.in);
		int day = 31;
		int month = 0;
		
		System.out.print("���� �Է����ּ���(0~12): ");
		month = scanner.nextInt();
		while (month<1 || month>12) {
			System.out.println("�߸� �Է��߽��ϴ�. 0~12�� ���̷θ� �Է����ּ���.");
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
		System.out.println(month+"���� " +day+ "�ϱ��� �ִ�.");
		scanner.close();
	}

}
