package conditionalStatement;

import java.util.Scanner;

public class task21 {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.print( "Enter the num:");
		 int a = sc.nextInt();
		 if(a%3==0&&a%5==0) {
			 System.out.println( a +" Multiple of 5 and 3");
		 }else {
			 System.out.println( a +" Not Multiple of 5 and 3");
		 }
		}
}