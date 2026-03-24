package conditionalStatement;

import java.util.Scanner;

public class task11 {
	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
		  System.out.print("Enter the number :");
		  int a = sc.nextInt();
		  System.out.print("Enter the number :");
		  int b = sc.nextInt();
		  System.out.println();
		   int c = a-b;
		   if(c == 0) {
			   System.out.print("The Difference is zero");
		   }else {
			   System.out.println("The Difference is not Zero");
		   }
}
}