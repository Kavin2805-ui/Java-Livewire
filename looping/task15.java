package looping;

import java.util.Scanner;

public class task15 {
	public static void main(String[] args) {
	         
                 Scanner sc = new Scanner(System.in);       
		        System.out.print("Enter a number: ");
		        int n = sc.nextInt();

		        System.out.print("Prime numbers: ");

		        for (int i = 2; i <= n; i++) {
		            boolean isPrime = true;

		            for (int j = 2; j <= i / 2; j++) {
		                if (i % j == 0) {
		                    isPrime = false;
		                    break;
		                }
		            }

		            if (isPrime) {
		                System.out.print(i + " ");
		            }
		        }
		    }
		
}
