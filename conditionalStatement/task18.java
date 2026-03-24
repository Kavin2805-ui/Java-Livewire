package conditionalStatement;

import java.util.Scanner;

public class task18 {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.print( "Enter the ASCII Value:");
		 int asc = sc.nextInt();
		 if( asc >=65 && asc<=90) {
			 System.out.println("uppercase alphabet");
		 }else {
			 System.out.println(" not uppercase alphabet");
		 }
}
}