package org.comstudy21.day04;

import java.util.Scanner;

public class Day04Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int age = 0;
		String name = ""; // char�� ����, String�� ���ڿ�
		String answer = "y";
		
		
		while (answer.equals("y")) {
			System.out.print("�̸��� �Է����ּ���: ");
			name = scanner.next(); // next
			System.out.print("���̸� �Է����ּ���: ");
			age = scanner.nextInt();
			System.out.println("���: " + name + "���� " + age + "�� �Դϴ� \n---------------------------");
			System.out.print("��� �Ͻðڽ��ϱ�? y/n");
			answer = scanner.next();
			while (!answer.equals("y") && !answer.equals("n")) {
				System.out.print("y�� n �� �� �ϳ��� �Է����ּ���");
				answer = scanner.next();
			}
		}
			System.out.println("���α׷��� �����ϰڽ��ϴ�");
//		while (answer.equals("y")) {
			/*
			 * System.out.print("�̸��� �Է����ּ���: "); name = scanner.next(); //next
			 * System.out.print("���̸� �Է����ּ���: "); age = scanner.nextInt();
			 * System.out.println("���: "+name+ "���� " +age+
			 * "�� �Դϴ� \n---------------------------"); System.out.println("��� �Ͻðڽ��ϱ�? y/n");
			 * answer = scanner.next(); }
			 */
			scanner.close();
		

//		System.out.print("���̸� �Է����ּ���: ");
	}
}


