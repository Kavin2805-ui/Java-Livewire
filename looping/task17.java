package looping;

import java.util.Scanner;

public class task17 {
	public static void main(String[]args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter first number: ");
	        int n = sc.nextInt();

	        System.out.print("Enter second number: ");
	        int m = sc.nextInt();

	        System.out.print("Common factors: ");

	        int min = Math.min(n, m);

	        for (int i = 1; i <= min; i++) {
	            if (n % i == 0 && m % i == 0) {
	                System.out.print(i + " ");
	            }
	        }
	    }
	}

