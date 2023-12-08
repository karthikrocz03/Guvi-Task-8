package guvitask8;

import java.util.Scanner;

public class T10NumberOfDigitsInanInteger {
public static void main(String[] args) {
	 // Step 2: Declare and initialize an integer
    System.out.println("Enter the Integer: ");
    Scanner sc = new Scanner(System.in);
    int number = sc.nextInt();

    int count = 0;


    while (number != 0) {
        number /= 10; 
        count++; 
    }
    System.out.println("Number of digits in the given Integer: " + count);
}
}
