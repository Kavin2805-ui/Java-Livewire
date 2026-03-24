package conditionalStatement;

import java.util.Scanner;

public class task2 {
     public static void main(String[] args) {
    	 Scanner sc = new Scanner(System.in);
    	 System.out.print("enter the number a:");
    	 int a = sc.nextInt();
    	 System.out.print("enter the number b:");
    	 int b = sc.nextInt();
    	 if(a>b) {
    		 System.out.println("This number is largest");
    	 }else {
    		 System.out.println("This number is not largest");
    	 }
     }
}