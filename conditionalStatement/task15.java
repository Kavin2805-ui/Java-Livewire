package conditionalStatement;

import java.util.Scanner;

public class task15 {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.print( "Enter the Choice:");
		  int num = sc.nextInt();
		  if(num == 1) {
			  System.out.println("The Exam will be Easy");
		  }else {
			  System.out.println("The Exam will be Difficult");
		  }
}
}