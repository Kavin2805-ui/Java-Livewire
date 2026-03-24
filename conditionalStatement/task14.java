package conditionalStatement;

import java.util.Scanner;

public class task14 {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.print( "Enter the number:");
		  int num = sc.nextInt();
		  int a = num%10;
		  int b = num/10;
		 if(a>b) {
			 System.out.println(a+" is biggest");
		 }else {
			 System.out.println(b+ "is biggest");
		 }
}
}