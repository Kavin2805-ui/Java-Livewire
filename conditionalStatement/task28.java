package conditionalStatement;

import java.util.Scanner;

public class task28 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a num: ");
        int a = sc.nextInt();
        if(a>0) {
        	 System.out.println(" Positive. ");
        }else if(a<0) {
        	System.out.println(" Negative. ");
        }else {
        	System.out.println(" Zero ");
        }
}
}