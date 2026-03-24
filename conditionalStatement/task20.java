package conditionalStatement;

import java.util.Scanner;

public class task20 {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.print( "Enter the ASCII Value:");
		 int asc = sc.nextInt();
		 if (asc >= 48 && asc <= 57) {
	            System.out.println("It is the ASCII value of a numeric character.");
	        } else {
	            System.out.println("It is NOT the ASCII value of a numeric character.");
	        }
	        
}
}