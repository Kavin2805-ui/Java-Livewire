package looping;

import java.util.Scanner;

public class task20 {
	public static void main(String[] args) {

		        Scanner sc = new Scanner(System.in);

		        int n, num;
		        int evenSum = 0, oddSum = 0;

		        System.out.print("Enter number of elements: ");
		        n = sc.nextInt();

		        System.out.println("Enter " + n + " integers:");

		        for(int i = 1; i <= n; i++) {
		            num = sc.nextInt();

		            if(num % 2 == 0) {
		                evenSum += num;  
		            } else {
		                oddSum += num;    
		            }
		        }

		        System.out.println("Sum of Even numbers = " + evenSum);
		        System.out.println("Sum of Odd numbers = " + oddSum);
		    }
		
	}


