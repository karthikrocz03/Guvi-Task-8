package guvitask8;

import java.util.Scanner;

public class T1SumofVariables {
public static void main(String[] args) {
	System.out.println("Enter the value of a  :");
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	System.out.println("Enter the value of b  :");
	Scanner sc1 = new Scanner(System.in);
	int b = sc1.nextInt();
	System.out.println("Enter the value of c  :");
	Scanner sc2 = new Scanner(System.in);
	int c = sc2.nextInt();
	System.out.println("Enter the value of d  :");
	Scanner sc3 = new Scanner(System.in);
	int d = sc3.nextInt();
	int Sum1 = a+b;
	int Sum2 = c+d;
	
	if(Sum1>Sum2) {
		System.out.println("Sum of a and b is greater than sum of c and d");
	}
	else {
		System.out.println("Sum of c and d is greater than sum of a and b");
	}
	
	
	
}
}
