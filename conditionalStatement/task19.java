package conditionalStatement;

import java.util.Scanner;

public class task19 {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.print( "Enter the ASCII Value:");
		 int asc = sc.nextInt();
		 if( asc >=97 && asc<=122) {
			 System.out.println("lowercase alphabet");
		 }else {
			 System.out.println(" not lowercase alphabet");
		 }
}
}
