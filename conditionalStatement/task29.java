package conditionalStatement;

import java.util.Scanner;

public class task29 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a days: ");
        int a = sc.nextInt();
        if(a<6) {
        	System.out.println("First five days 40 paisa per day ");
        }else if(a>=6 && a<=10) {
        	System.out.println("Six to ten days 65 paisa per day  ");
        }else {
        	System.out.println("above 10 days 80 paisa per day");
        }
        
        
}
}