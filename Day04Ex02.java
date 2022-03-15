package org.comstudy21.day04;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;

public class Day04Ex02 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		InputStream is = new FileInputStream(new File("C:\\temp2\\data.txt"));
		Scanner scan = new Scanner(is);
		while(scan.hasNext()) {
			System.out.println(scan.next());
		}
		scan.close();	
	}

}
