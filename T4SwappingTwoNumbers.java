package guvitask8;

import java.util.Scanner;

public class T4SwappingTwoNumbers {
public static void main(String[] args) {
	System.out.println("Enter the value of num1: ");
	Scanner sc = new Scanner(System.in);
	int n1=sc.nextInt();
	System.out.println("Enter the value of num2: ");
	Scanner sc1 = new Scanner(System.in);
	int n2=sc1.nextInt();
	int temporary = n1;
	n1=n2;
	n2=temporary;
	System.out.println("The value of num1: " +n1);
	System.out.println("The value of num2: "+n2);
}
}
