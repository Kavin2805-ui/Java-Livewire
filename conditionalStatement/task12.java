package conditionalStatement;

import java.util.Scanner;

public class task12 {
	public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	  System.out.print("Enter the computer science mark :");
	  int mark = sc.nextInt();
	  if(mark >= 50) {
		  System.out.println("passed");
		  
	  }else {
		  System.out.println("failed");
	  }
}
}