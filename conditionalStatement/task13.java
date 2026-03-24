package conditionalStatement;

import java.util.Scanner;

public class task13 {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.print( "Enter the number:");
		  int num = sc.nextInt();
		  if(num %10==0) {
			  System.out.println("Divisble by 10");
		  }else {
			  System.out.println(" Not Divisble by 10");
		  }
}
}