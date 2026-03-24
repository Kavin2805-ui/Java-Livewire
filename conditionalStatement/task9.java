package conditionalStatement;

import java.util.Scanner;

public class task9 {
	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
		  System.out.print("Enter the number :");
		  int a = sc.nextInt();
		  if(a%10==0) {
			  System.out.println("It is ends with zero");
		  }else {
			  System.out.println("It is Not ends with zero");
		  }
	}
}
