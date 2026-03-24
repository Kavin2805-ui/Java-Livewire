package conditionalStatement;

import java.util.Scanner;

public class task31 {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter Number: ");
	        int num = sc.nextInt();
	        if(num % 5==0 ) {
	        	System.out.println("multiple of 5 ");
	        }else if(num%3==0) {
	        	System.out.println("multiple of 3");
	        }else if(num%7==0) {
	        	System.out.println("It is  multiple of7 ");
	        }
}  
}