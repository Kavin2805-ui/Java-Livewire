package conditionalStatement;

import java.util.Scanner;

public class task22 {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.print( "Enter the num:");
		 int a = sc.nextInt();
		 if(a%10==0 && a>=100 && a<=999) {
			 System.out.println( a +"  is the three digit number and multiple of 10.");
		 }else {
			 System.out.println( a +"  is  the three digit number but not multiple of 10.");
		 }
}
}