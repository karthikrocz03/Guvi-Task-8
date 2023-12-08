package guvitask8;

import java.util.Scanner;

public class T9SeniorCitizenOrNot {
public static void main(String[] args) {
	System.out.println("Enter the age of the person: ");
	Scanner sc = new Scanner(System.in);
	int age=sc.nextInt();
	if(age>60) {
		System.out.println("The person is Senior Citizen");
	}
	else {
		System.out.println("The person is not a Senior citizen");
	}
}
}
