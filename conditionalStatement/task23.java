package conditionalStatement;

import java.util.Scanner;

public class task23 {

	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a number: ");
	        int num = sc.nextInt();

	        if (num >= 100 && num <= 999) {
	            if (num % 2 == 0 && num % 5 == 0 && num % 10 == 0) {
	                System.out.println("It is a three-digit number and multiple of 2, 5, and 10.");
	            } else {
	                System.out.println("It is a three-digit number but not multiple of 2, 5, and 10.");
	            }
	        } else {
	            System.out.println("It is not a three-digit number.");
	        }

	        sc.close();
	    }
	

}

