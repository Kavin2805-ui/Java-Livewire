package conditionalStatement;

import java.util.Scanner;

public class task17 {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.print( "Enter the length:");
		 int lenght = sc.nextInt();
		 System.out.print( "Enter the breadth:");
		 int breadth = sc.nextInt();
		 if(lenght == breadth) {
			 System.out.println("square");
		 }else {
			 System.out.println("rectangle");
		 }
}
}