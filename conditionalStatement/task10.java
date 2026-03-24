package conditionalStatement;

import java.util.Scanner;

public class task10 {
	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
		  System.out.print("Enter the number :");
		  int a = sc.nextInt();
		   double b = Math.pow(a, 2);
		   if(b>=50) {
			   System.out.print("Square is above 50");
		   }else {
			   System.out.print("Square is below 50");
		   }
	}
}
