package conditionalStatement;

import java.util.Scanner;

public class task24 {
	  public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a number 1: ");
	        int a= sc.nextInt();
	        System.out.print("Enter a number 2: ");
	        int  b= sc.nextInt();
	         if( a%2==0 && b%2==0) {
	        	 System.out.println(a*b);
	         }else {
	        	 System.out.println(a+b);
	         }

}
}