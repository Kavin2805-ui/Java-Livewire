package conditionalStatement;

import java.util.Scanner;

public class task16 {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.print( "Enter the Value:");
		  int value= sc.nextInt();
		  if(value  == 1) {
			  System.out.println("You can go out and play");
		  }else {
			  System.out.println("Ypu cannot go out and play");
		  }
}
}