package guvitask8;

import java.util.Scanner;

public class T8PrintString10Times {
	public static void main(String[] args) {
		System.out.println("Enter the string name: ");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		for(int i =0;i<=10;i++) {
			System.out.println(str);
			
		}
	}

}
