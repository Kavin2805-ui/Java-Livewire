package conditionalStatement;

import java.util.Scanner;
public class task7 {
	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
		  System.out.print("Enter the number :");
		  int a = sc.nextInt();
		  if(a>=10 && a<=99) {
			  System.out.print("It is two-digit number");
		  }else {
			  System.out.print("It is Not two-digit number");
		  }
}
}