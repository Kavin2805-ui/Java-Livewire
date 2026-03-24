package conditionalStatement;

import java.util.Scanner;

public class task8 {
	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
		  System.out.print("Enter the number :");
		  int a = sc.nextInt();
		  if(a>=100 && a<=999) {
			  System.out.print("It is three-digit number");
		  }else {
			  System.out.print("It is Not three-digit number");
		  }
}
}
