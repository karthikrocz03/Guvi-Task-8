package guvitask8;

import java.util.Scanner;

public class T2EvenNumberOrNot {
	public static void main(String[] args) {
		System.out.println("Enter the number: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n%2==0) {
			System.out.println("The given number is even");
		}
		else {
			System.out.println("The given number is odd");
		}
	}

}
